package net.fhtpci.fhtpci.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.fhtpci.fhtpci.model.ExtTipoCapacidadResponse
import net.fhtpci.fhtpci.repository.ExtTipoCapacidadRepository

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_tipo_capacidad.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE TIPOS-CAPACIDAD DE EXTINTORES
 * PARAMETROS:
  cual_tipo: Int
 *
 * CAMPOS QUE REGRESA:
  "idExtTipoCapacidad" => (INT) ID EXTINTOR TIPO CAPACIDAD,
  "tipoExtTipoCapacidad" => (INT) ID TIPO EXTINTOR TIPO CAPACIDAD,
  "capacidadExtTipoCapacidad" => (INT) ID CAPACIDAD EXTINTOR TIPO CAPACIDAD,
  "obsExtTipoCapacidad" => (TEXT) OBSERVACIONES EXTINTOR TIPO CAPACIDAD
 */

// VISTA MODELO PARA EXTINTORES TIPO - CAPACIDAD

class ExtTipoCapacidadViewModel : ViewModel() {
    private val repository = ExtTipoCapacidadRepository()
    private val _exttipocapacidadList = MutableLiveData<List<ExtTipoCapacidadResponse>?>()
    val exttipocapacidadList: LiveData<List<ExtTipoCapacidadResponse>?> get() = _exttipocapacidadList

    fun fetchExtTipoCapacidad() {
        viewModelScope.launch {
            val exttipocapacidad = repository.fetchExtTipoCapacidad()
            _exttipocapacidadList.postValue(exttipocapacidad)
        }
    }
}