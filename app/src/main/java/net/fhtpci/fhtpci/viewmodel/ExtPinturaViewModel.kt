package net.fhtpci.fhtpci.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.fhtpci.fhtpci.model.ExtPinturaResponse
import net.fhtpci.fhtpci.repository.ExtPinturaRepository

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_pintura.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES PINTURA, CAMPO 11
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtPintura" => (INT) ID EXTINTOR PINTURA,
  "cveExtPintura" => STR(30) CLAVE EXTINTOR PINTURA,
  "nomExtPintura" => STR(250) NOMBRE EXTINTOR PINTURA,
  "activoExtPintura" => STR(2) ACTIVO EXTINTOR PINTURA (SI/NO),
  "obsExtPintura" => (TEXT) OBSERVACIONES EXTINTOR PINTURA
 */

// VISTA MODELO PARA EXTINTORES PINTURA

class ExtPinturaViewModel: ViewModel() {
    private val repository = ExtPinturaRepository()
    private val _ExtPinturaList = MutableLiveData<List<ExtPinturaResponse>?>()
    val ExtPinturaList: LiveData<List<ExtPinturaResponse>?> get() = _ExtPinturaList

    fun fetchExtPintura() {
        viewModelScope.launch {
            val ExtPintura = repository.fetchExtPintura()
            _ExtPinturaList.postValue(ExtPintura)
        }
    }
}