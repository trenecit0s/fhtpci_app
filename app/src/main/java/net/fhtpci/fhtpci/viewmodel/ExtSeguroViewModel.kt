package net.fhtpci.fhtpci.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.fhtpci.fhtpci.model.ExtSeguroResponse
import net.fhtpci.fhtpci.repository.ExtSeguroRepository

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_seguro.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES SEGURO, CAMPO 14
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtSeguro" => (INT) ID EXTINTOR SEGURO,
  "cveExtSeguro" => STR(30) CLAVE EXTINTOR SEGURO,
  "nomExtSeguro" => STR(250) NOMBRE EXTINTOR SEGURO,
  "activoExtSeguro" => STR(2) ACTIVO EXTINTOR SEGURO (SI/NO),
  "obsExtSeguro" => (TEXT) OBSERVACIONES EXTINTOR SEGURO
 */

// VISTA MODELO PARA EXTINTORES SEGURO

class ExtSeguroViewModel : ViewModel()  {
    private val repository = ExtSeguroRepository()
    private val _extseguroList = MutableLiveData<List<ExtSeguroResponse>?>()
    val extseguroList: LiveData<List<ExtSeguroResponse>?> get() = _extseguroList

    fun fetchExtSeguro() {
        viewModelScope.launch {
            val extseguro = repository.fetchExtSeguro()
            _extseguroList.postValue(extseguro)
        }
    }
}