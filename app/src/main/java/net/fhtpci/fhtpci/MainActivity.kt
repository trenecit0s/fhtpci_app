package net.fhtpci.fhtpci

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import net.fhtpci.fhtpci.viewmodel.VersionViewModel
import java.net.URL

class MainActivity : AppCompatActivity() {
    private val viewModel: VersionViewModel by viewModels()

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

        viewModel.fetchVersion()
    }
}
