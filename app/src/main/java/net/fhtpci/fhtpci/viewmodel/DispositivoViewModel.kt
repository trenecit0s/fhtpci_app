package net.fhtpci.fhtpci.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.fhtpci.fhtpci.model.DispositivoResponse
import net.fhtpci.fhtpci.repository.DispositivoRepository

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_dispositivo.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE DISPOSITOS
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idDispositivo" => (INT) ID DISPOSITIVO,
  "cveDispositivo" => STR(30) CLAVE DISPOSITIVO,
  "nomDispositivo" => STR(250) NOMBRE DISPOSITIVO,
  "activoDispositivo" => STR(2) ACTIVO DISPOSITIVO (SI/NO),
  "obsDispositivo" => (TEXT) OBSERVACIONES DISPOSITIVO
 */

// VISTA MODELO PARA CATALOGO DE DISPOSITIVOS

class DispositivoViewModel: ViewModel()  {
    private val repository = DispositivoRepository()
    private val _dispositivoList = MutableLiveData<List<DispositivoResponse>?>()
    val dispositivoList: LiveData<List<DispositivoResponse>?> get() = _dispositivoList

    fun fetchDispositivo() {
        viewModelScope.launch {
            val dispositivo = repository.fetchDispositivo()
            _dispositivoList.postValue(dispositivo)
        }
    }
}