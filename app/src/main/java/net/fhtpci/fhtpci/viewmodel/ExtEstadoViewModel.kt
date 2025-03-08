package net.fhtpci.fhtpci.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.fhtpci.fhtpci.model.ExtEstadoResponse
import net.fhtpci.fhtpci.repository.ExtEstadoRepository

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_estado.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES ESTADO, CAMPO 13
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtEstado" => (INT) ID EXTINTOR ESTADO,
  "cveExtEstado" => STR(30) CLAVE EXTINTOR ESTADO,
  "nomExtEstado" => STR(250) NOMBRE EXTINTOR ESTADO,
  "activoExtEstado" => STR(2) ACTIVO EXTINTOR ESTADO (SI/NO),
  "obsExtEstado" => (TEXT) OBSERVACIONES EXTINTOR ESTADO
 */

// VISTA MODELO PARA EXTINTORES ESTADOS

class ExtEstadoViewModel: ViewModel() {
    private val repository = ExtEstadoRepository()
    private val _extestadoList = MutableLiveData<List<ExtEstadoResponse>?>()
    val extestadoList: LiveData<List<ExtEstadoResponse>?> get() = _extestadoList

    fun fetchExtEstado() {
        viewModelScope.launch {
            val extestado = repository.fetchExtEstado()
            _extestadoList.postValue(extestado)
        }
    }
}