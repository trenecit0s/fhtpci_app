package net.fhtpci.fhtpci.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.fhtpci.fhtpci.model.AccesoUsuarioResponse
import net.fhtpci.fhtpci.repository.AccesoUsuarioRepository

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_revisa_acceso_usuario.php
 * DESCRIPCION: REGRESA PERMISO DE ACCESO
 * PARAMETROS:
  kcve_usuario => STR(30) CLAVE DEL USUARIO
  kpwd_usuario => STR(30) CONTRASENIA DEL USUARIO
 *
 * CAMPOS QUE REGRESA:
  "IdUsuario" => (INT) ID DEL USUARIO. EN CASO DE ALGUN PROBLEMA CON EL ACCESO REGRESARA 0,
  "Mensaje" => STR(250) MENSAJE EXPLICATIVO DEL ACCESO, EN CASO DE QUE EL ID SEA != 0, EL MENSAJE SERA: TodoOK
 */

// VISTA MODELO PARA ACCESO USUARIO

class AccesoUsuarioViewModel : ViewModel()  {
    private val repository = AccesoUsuarioRepository()
    private val _accesousuarioList = MutableLiveData<List<AccesoUsuarioResponse>?>()
    val accesousuarioList: LiveData<List<AccesoUsuarioResponse>?> get() = _accesousuarioList

    fun fetchAccesoUsuario(userName: String, password: String) {
        viewModelScope.launch {
            val accesousuario = repository.fetchAccesoUsuario(userName, password)
            _accesousuarioList.postValue(accesousuario)
        }
    }
}