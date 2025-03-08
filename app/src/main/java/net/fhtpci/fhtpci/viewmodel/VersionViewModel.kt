package net.fhtpci.fhtpci.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.fhtpci.fhtpci.model.VersionResponse
import net.fhtpci.fhtpci.repository.VersionRepository

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_regresa_version_app.php
 * DESCRIPCION: REGRESA LA VERSION DE LA APP
 * PARAMETROS: NINGUNO
 * CAMPOS QUE REGRESA:
  "ClaveVersion" => STR(30) CLAVE O VERSION DE LA APP,
  "FechaVersion" => (DATE) FECHA DE LA VERSION,
  "HoraVersion" => (TIME) HORA DE LA VERSION,
  "TamanioVersion" => (FLOAT) TAMANIO DE LA VERSION
 */

// VISTA MODELO PARA VERSIONES

class VersionViewModel : ViewModel() {
    private val repository = VersionRepository()
    private val _versionList = MutableLiveData<List<VersionResponse>?>()
    val versionList: LiveData<List<VersionResponse>?> get() = _versionList

    fun fetchVersion() {
        viewModelScope.launch {
            val versions = repository.fetchVersion()
            _versionList.postValue(versions)
        }
    }
}
