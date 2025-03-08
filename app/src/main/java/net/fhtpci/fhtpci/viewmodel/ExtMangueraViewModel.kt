package net.fhtpci.fhtpci.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.fhtpci.fhtpci.model.ExtMangueraResponse
import net.fhtpci.fhtpci.repository.ExtMangueraRepository

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_extintores_manguera.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE EXTINTORES MANGUERA, CAMPO 10
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idExtManguera" => (INT) ID EXTINTOR MANGUERA,
  "cveExtManguera" => STR(30) CLAVE EXTINTOR MANGUERA,
  "nomExtManguera" => STR(250) NOMBRE EXTINTOR MANGUERA,
  "activoExtManguera" => STR(2) ACTIVO EXTINTOR MANGUERA (SI/NO),
  "obsExtManguera" => (TEXT) OBSERVACIONES EXTINTOR MANGUERA
 */

// VISTA MODELO PARA EXTINTORES MANGUERAS

class ExtMangueraViewModel : ViewModel() {
    private val repository = ExtMangueraRepository()
    private val _extmangueraList = MutableLiveData<List<ExtMangueraResponse>?>()
    val extmangueraList: LiveData<List<ExtMangueraResponse>?> get() = _extmangueraList

    fun fetchExtManguera() {
        viewModelScope.launch {
            val extmanguera = repository.fetchExtManguera()
            _extmangueraList.postValue(extmanguera)
        }
    }
}