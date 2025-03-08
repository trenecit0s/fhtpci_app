package net.fhtpci.fhtpci.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.fhtpci.fhtpci.model.ExtPresionResponse
import net.fhtpci.fhtpci.repository.ExtPresionRepository

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_presion.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES PRESION, CAMPO 07
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtPresion" => (INT) ID EXTINTOR PRESION,
  "cveExtPresion" => STR(30) CLAVE EXTINTOR PRESION,
  "nomExtPresion" => STR(250) NOMBRE EXTINTOR PRESION,
  "activoExtPresion" => STR(2) ACTIVO EXTINTOR PRESION (SI/NO),
  "obsExtPresion" => (TEXT) OBSERVACIONES EXTINTOR PRESION
 */

// VISTA MODELO PARA EXTINTORES PRESIONES

class ExtPresionViewModel : ViewModel() {
    private val repository = ExtPresionRepository()
    private val _extpresionList = MutableLiveData<List<ExtPresionResponse>?>()
    val extpresionList: LiveData<List<ExtPresionResponse>?> get() = _extpresionList

    fun fetchExtPresion() {
        viewModelScope.launch {
            val extpresion = repository.fetchExtPresion()
            _extpresionList.postValue(extpresion)
        }
    }
}