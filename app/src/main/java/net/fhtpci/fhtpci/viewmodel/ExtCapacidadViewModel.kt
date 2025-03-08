package net.fhtpci.fhtpci.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.fhtpci.fhtpci.model.ExtCapacidadResponse
import net.fhtpci.fhtpci.repository.ExtCapacidadRepository

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_capacidad_activos.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE CAPACIDADES DE EXTINTORES.
 * NO TODOS LOS TIPOS TIENEN TODAS LAS CAPACIDADES. ESTO ESTA EN OTRO CATALOGO
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtCapacidad" => (INT) ID EXTINTOR CAPACIDAD,
  "cveExtCapacidad" => STR(30) CLAVE EXTINTOR CAPACIDAD,
  "nomExtCapacidad" => STR(250) NOMBRE EXTINTOR CAPACIDAD,
  "activoExtCapacidad" => STR(2) ACTIVO EXTINTOR CAPACIDAD (SI/NO),
  "obsExtCapacidad" => (TEXT) OBSERVACIONES EXTINTOR CAPACIDAD
 */

// VISTA MODELO PARA EXTINTORES CAPACIDADES

class ExtCapacidadViewModel: ViewModel() {
    private val repository = ExtCapacidadRepository()
    private val _extcapacidadList = MutableLiveData<List<ExtCapacidadResponse>?>()
    val extcapacidadList: LiveData<List<ExtCapacidadResponse>?> get() = _extcapacidadList

    fun fetchExtCapacidad() {
        viewModelScope.launch {
            val extcapacidad = repository.fetchExtCapacidad()
            _extcapacidadList.postValue(extcapacidad)
        }
    }
}