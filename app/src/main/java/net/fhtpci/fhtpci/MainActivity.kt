package net.fhtpci.fhtpci

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import net.fhtpci.fhtpci.viewmodel.AccesoUsuarioViewModel
import net.fhtpci.fhtpci.viewmodel.VersionViewModel
import java.net.URL

class MainActivity : AppCompatActivity() {
    private val viewModel: VersionViewModel by viewModels()
    private val accesoUsuarioViewModel: AccesoUsuarioViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val versionDeApp=findViewById<TextView>(R.id.txtVersionApp)

        // ASIGNA LA VERSION
        viewModel.versionList.observe(this) { versionList ->
            versionList?.forEach { version ->
                versionDeApp.text= versionList[0].ClaveVersion
            }
        }

        accesoUsuarioViewModel.accesousuarioList.observe(this){ it ->
            println(it)
            Toast.makeText(this, it?.get(0)?.message, Toast.LENGTH_LONG).show()
        }

        viewModel.fetchVersion()

        findViewById<Button>(R.id.btnInicioSesion).setOnClickListener {
            val userName = findViewById<EditText>(R.id.txtNombreUsuario).text
            val password = findViewById<EditText>(R.id.txtPwdUsuario).text

            accesoUsuarioViewModel.fetchAccesoUsuario(userName.toString(), password.toString()) //"TEC00", "12345678"
        }


    }
}
