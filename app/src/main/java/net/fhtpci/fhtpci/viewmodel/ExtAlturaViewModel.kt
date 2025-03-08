package net.fhtpci.fhtpci.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.fhtpci.fhtpci.model.ExtAlturaResponse
import net.fhtpci.fhtpci.repository.ExtAlturaRepository

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_altura.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES ALTURA, CAMPO 16
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtAltura" => (INT) ID EXTINTOR ALTURA,
  "cveExtAltura" => STR(30) CLAVE EXTINTOR ALTURA,
  "nomExtAltura" => STR(250) NOMBRE EXTINTOR ALTURA,
  "activoExtAltura" => STR(2) ACTIVO EXTINTOR ALTURA (SI/NO),
  "obsExtAltura" => (TEXT) OBSERVACIONES EXTINTOR ALTURA
 */

// VISTA MODELO PARA EXTINTORES ALTURAS

class ExtAlturaViewModel  : ViewModel() {
    private val repository = ExtAlturaRepository()
    private val _extalturaList = MutableLiveData<List<ExtAlturaResponse>?>()
    val extalturaList: LiveData<List<ExtAlturaResponse>?> get() = _extalturaList

    fun fetchExtAltura() {
        viewModelScope.launch {
            val extaltura = repository.fetchExtAltura()
            _extalturaList.postValue(extaltura)
        }
    }
}