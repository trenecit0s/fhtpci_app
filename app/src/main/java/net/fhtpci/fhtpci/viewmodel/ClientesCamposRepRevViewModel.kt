package net.fhtpci.fhtpci.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.fhtpci.fhtpci.model.ClientesCamposRepRevResponse
import net.fhtpci.fhtpci.repository.ClientesCamposRepRevRepository

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_ext_rep_revision_mensual_campos.php
 * DESCRIPCION: REGRESA LA LISTA DE CAMPOS QUE EL CLIENTE OBLIGATORIAMENTE REQUIERE POR PARTE DE FHTPCI EN CADA REVISION
 * PARAMETROS:
  cual_tecnico: Int
 *
 * CAMPOS QUE REGRESA:
  "idCliente" => (INT) ID CLIENTE,
  "okVerCampo01" => STR(2) PUEDE VER EL CAMPO 01? (SI/NO),
  "okVerCampo02" => STR(2) PUEDE VER EL CAMPO 02? (SI/NO),
  "okVerCampo03" => STR(2) PUEDE VER EL CAMPO 03? (SI/NO),
  "okVerCampo04" => STR(2) PUEDE VER EL CAMPO 04? (SI/NO),
  "okVerCampo05" => STR(2) PUEDE VER EL CAMPO 05? (SI/NO),
  "okVerCampo06" => STR(2) PUEDE VER EL CAMPO 06? (SI/NO),
  "okVerCampo07" => STR(2) PUEDE VER EL CAMPO 07? (SI/NO),
  "okVerCampo08" => STR(2) PUEDE VER EL CAMPO 08? (SI/NO),
  "okVerCampo09" => STR(2) PUEDE VER EL CAMPO 09? (SI/NO),
  "okVerCampo10" => STR(2) PUEDE VER EL CAMPO 10? (SI/NO),
  "okVerCampo11" => STR(2) PUEDE VER EL CAMPO 11? (SI/NO),
  "okVerCampo12" => STR(2) PUEDE VER EL CAMPO 12? (SI/NO),
  "okVerCampo13" => STR(2) PUEDE VER EL CAMPO 13? (SI/NO),
  "okVerCampo14" => STR(2) PUEDE VER EL CAMPO 14? (SI/NO),
  "okVerCampo15" => STR(2) PUEDE VER EL CAMPO 15? (SI/NO),
  "okVerCampo16" => STR(2) PUEDE VER EL CAMPO 16? (SI/NO),
  "okVerCampo17" => STR(2) PUEDE VER EL CAMPO 17? (SI/NO),
  "okVerCampo18" => STR(2) PUEDE VER EL CAMPO 18? (SI/NO),
  "okVerCampo19" => STR(2) PUEDE VER EL CAMPO 19? (SI/NO)
 *
 */

// VISTA MODELO PARA CAMPOS POR CLIENTE PARA REPORTES DE REVISION DE EXTINTORES

class ClientesCamposRepRevViewModel : ViewModel()  {
    private val repository = ClientesCamposRepRevRepository()
    private val _clientescamposreprevList = MutableLiveData<List<ClientesCamposRepRevResponse>?>()
    val clientescamposreprevList: LiveData<List<ClientesCamposRepRevResponse>?> get() = _clientescamposreprevList

    fun fetchClientesCamposRepRev() {
        viewModelScope.launch {
            val clientescamposreprev = repository.fetchClientesCamposRepRev()
            _clientescamposreprevList.postValue(clientescamposreprev)
        }
    }
}