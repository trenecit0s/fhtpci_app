package net.fhtpci.fhtpci.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.fhtpci.fhtpci.model.ExtSenialResponse
import net.fhtpci.fhtpci.repository.ExtSenialRepository

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_senial.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES SENIAL, CAMPO 12
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtSenial" => (INT) ID EXTINTOR SENIAL,
  "cveExtSenial" => STR(30) CLAVE EXTINTOR SENIAL,
  "nomExtSenial" => STR(250) NOMBRE EXTINTOR SENIAL,
  "activoExtSenial" => STR(2) ACTIVO EXTINTOR SENIAL (SI/NO),
  "obsExtSenial" => (TEXT) OBSERVACIONES EXTINTOR SENIAL
 */

// VISTA MODELO PARA EXTINTORES SENIAL

class ExtSenialViewModel : ViewModel() {
    private val repository = ExtSenialRepository()
    private val _extsenialList = MutableLiveData<List<ExtSenialResponse>?>()
    val extsenialList: LiveData<List<ExtSenialResponse>?> get() = _extsenialList

    fun fetchExtSenial() {
        viewModelScope.launch {
            val extsenial = repository.fetchExtSenial()
            _extsenialList.postValue(extsenial)
        }
    }
}