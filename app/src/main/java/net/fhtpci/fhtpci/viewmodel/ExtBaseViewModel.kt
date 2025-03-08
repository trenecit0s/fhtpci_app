package net.fhtpci.fhtpci.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.fhtpci.fhtpci.model.ExtBaseResponse
import net.fhtpci.fhtpci.repository.ExtBaseRepository

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_base.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES BASE, CAMPO 09
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtBase" => (INT) ID EXTINTOR BASE,
  "cveExtBase" => STR(30) CLAVE EXTINTOR BASE,
  "nomExtBase" => STR(250) NOMBRE EXTINTOR BASE,
  "activoExtBase" => STR(2) ACTIVO EXTINTOR BASE (SI/NO),
  "obsExtBase" => (TEXT) OBSERVACIONES EXTINTOR BASE
 */

// VISTA MODELO PARA EXTINTORES BASES

class ExtBaseViewModel: ViewModel() {
    private val repository = ExtBaseRepository()
    private val _extbaseList = MutableLiveData<List<ExtBaseResponse>?>()
    val extbaseList: LiveData<List<ExtBaseResponse>?> get() = _extbaseList

    fun fetchExtBase() {
        viewModelScope.launch {
            val extbase = repository.fetchExtBase()
            _extbaseList.postValue(extbase)
        }
    }
}