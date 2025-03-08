package net.fhtpci.fhtpci.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.fhtpci.fhtpci.model.ExtDifusorResponse
import net.fhtpci.fhtpci.repository.ExtDifusorRepository

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_difusor.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES DIFUSOR, CAMPO 17
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtDifusor" => (INT) ID EXTINTOR DIFUSOR,
  "cveExtDifusor" => STR(30) CLAVE EXTINTOR DIFUSOR,
  "nomExtDifusor" => STR(250) NOMBRE EXTINTOR DIFUSOR,
  "activoExtDifusor" => STR(2) ACTIVO EXTINTOR DIFUSOR (SI/NO),
  "obsExtDifusor" => (TEXT) OBSERVACIONES EXTINTOR DIFUSOR
 */

// VISTA MODELO PARA EXTINTORES DIFUSORES

class ExtDifusorViewModel : ViewModel()  {
    private val repository = ExtDifusorRepository()
    private val _extdifusorList = MutableLiveData<List<ExtDifusorResponse>?>()
    val extdifusorList: LiveData<List<ExtDifusorResponse>?> get() = _extdifusorList

    fun fetchExtDifusor() {
        viewModelScope.launch {
            val extdifusor = repository.fetchExtDifusor()
            _extdifusorList.postValue(extdifusor)
        }
    }
}