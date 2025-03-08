package net.fhtpci.fhtpci.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.fhtpci.fhtpci.model.ZonasClientesActivosResponse
import net.fhtpci.fhtpci.repository.ZonasClientesActivosRepository

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_clientes_zonas_activos.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE ZONAS DE CLIENTES
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idClienteZona" => (INT) ID ZONA CLIENTE,
  "nomClienteZona" => STR(250) NOMBRE ZONA CLIENTE,
  "cveClienteZona" => STR(30) CLAVE ZONA CLIENTE,
  "activoClienteZona" => STR(2) ACTIVO ZONA CLIENTE (SI/NO),
  "obsClienteZona" => (TEXT) OBSERVACIONES ZONA CLIENTE
 */

// VISTA MODELO PARA CLIENTES ACTIVOS

class ZonasClientesActivosViewModel  : ViewModel() {
    private val repository = ZonasClientesActivosRepository()
    private val _zonasclientesactivosList = MutableLiveData<List<ZonasClientesActivosResponse>?>()
    val zonasclientesactivosList: LiveData<List<ZonasClientesActivosResponse>?> get() = _zonasclientesactivosList

    fun fetchZonasClientesActivos() {
        viewModelScope.launch {
            val zonasclientesactivos = repository.fetchZonasClientesActivos()
            _zonasclientesactivosList.postValue(zonasclientesactivos)
        }
    }
}