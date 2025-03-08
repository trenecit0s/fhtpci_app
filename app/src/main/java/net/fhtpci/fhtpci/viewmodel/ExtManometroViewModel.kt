package net.fhtpci.fhtpci.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.fhtpci.fhtpci.model.ExtManometroResponse
import net.fhtpci.fhtpci.repository.ExtManometroRepository

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_manometro.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES MANOMETRO, CAMPO 08
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtManometro" => (INT) ID EXTINTOR MANOMETRO,
  "cveExtManometro" => STR(30) CLAVE EXTINTOR MANOMETRO,
  "nomExtManometro" => STR(250) NOMBRE EXTINTOR MANOMETRO,
  "activoExtManometro" => STR(2) ACTIVO EXTINTOR MANOMETRO (SI/NO),
  "obsExtManometro" => (TEXT) OBSERVACIONES EXTINTOR MANOMETRO
 */

// VISTA MODELO PARA EXTINTORES MANOMETROS

class ExtManometroViewModel : ViewModel()  {
    private val repository = ExtManometroRepository()
    private val _extmanometroList = MutableLiveData<List<ExtManometroResponse>?>()
    val extmanometroList: LiveData<List<ExtManometroResponse>?> get() = _extmanometroList

    fun fetchExtManometro() {
        viewModelScope.launch {
            val extmanometro = repository.fetchExtManometro()
            _extmanometroList.postValue(extmanometro)
        }
    }
}