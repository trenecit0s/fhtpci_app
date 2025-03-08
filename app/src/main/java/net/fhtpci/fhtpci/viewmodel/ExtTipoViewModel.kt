package net.fhtpci.fhtpci.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.fhtpci.fhtpci.model.ExtTipoResponse
import net.fhtpci.fhtpci.repository.ExtTipoRepository

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_tipo.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE TIPOS DE EXTINTORES
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtTipo" => (INT) ID EXTINTOR TIPO,
  "cveExtTipo" => STR(30) CLAVE EXTINTOR TIPO,
  "nomExtTipo" => STR(250) NOMBRE EXTINTOR TIPO,
  "activoExtTipo" => STR(2) ACTIVO EXTINTOR TIPO (SI/NO),
  "recargaExtTipo" => (INT) SE DEBE DE RECARGAR CADA X ANIOS,
  "obsExtTipo" => (TEXT) OBSERVACIONES EXTINTOR TIPO
 */

// VISTA MODELO PARA EXTINTORES TIPO

class ExtTipoViewModel : ViewModel() {
    private val repository = ExtTipoRepository()
    private val _exttipoList = MutableLiveData<List<ExtTipoResponse>?>()
    val exttipoList: LiveData<List<ExtTipoResponse>?> get() = _exttipoList

    fun fetchExtTipo() {
        viewModelScope.launch {
            val exttipo = repository.fetchExtTipo()
            _exttipoList.postValue(exttipo)
        }
    }
}