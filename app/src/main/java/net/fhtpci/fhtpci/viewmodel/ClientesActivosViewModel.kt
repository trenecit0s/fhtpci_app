package net.fhtpci.fhtpci.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.fhtpci.fhtpci.model.ClientesActivosResponse
import net.fhtpci.fhtpci.repository.ClientesActivosRepository

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_clientes_activos.php
 * DESCRIPCION: REGRESA EL CATALOGO COMPLETO DE CLIENTES
 * PARAMETROS: NINGUNO
 *
 * CAMPOS QUE REGRESA:
  "idCliente" => (INT) ID CLIENTE,
  "nomCliente" => STR(250) NOMBRE CLIENTE,
  "cveCliente" => STR(30) CLAVE CLIENTE,
  "rsocialCliente" => STR(250) RAZON SOCIAL DEL CLIENTE,
  "activoCliente" => STR(2) ACTIVO CLIENTE: (SI/NO),
  "obsCliente" => TEXT OBSERVACIONES CLIENTE,
  "zonaCliente" => (INT) ID ZONA CLIENTE,
  "emailCliente" => STR(250) EMAIL 1,
  "email2Cliente" => STR(250) EMAIL 2,
  "email3Cliente" => STR(250) EMAIL 3,
  "email4Cliente" => STR(250) EMAIL 4,
  "email5Cliente" => STR(250) EMAIL 5,
  "tecnico1Cliente" => (INT) ID USUARIO DEL TECNICO (0 O != 0) 1,
  "tecnico2Cliente" => (INT) ID USUARIO DEL TECNICO (0 O != 0) 2,
  "tecnico3Cliente" => (INT) ID USUARIO DEL TECNICO (0 O != 0) 3,
  "tecnico4Cliente" => (INT) ID USUARIO DEL TECNICO (0 O != 0) 4,
  "tecnico5Cliente" => (INT) ID USUARIO DEL TECNICO (0 O != 0) 5,
  "contactoCliente" => STR(250) NOMBRE CONTACTO 1. CORRESPONDE EL EMAIL DEL MISMO NUMERO,
  "contacto2Cliente" => STR(250) NOMBRE CONTACTO 2. CORRESPONDE EL EMAIL DEL MISMO NUMERO,
  "contacto3Cliente" => STR(250) NOMBRE CONTACTO 3. CORRESPONDE EL EMAIL DEL MISMO NUMERO,
  "contacto4Cliente" => STR(250) NOMBRE CONTACTO 4. CORRESPONDE EL EMAIL DEL MISMO NUMERO,
  "contacto5Cliente" => STR(250) NOMBRE CONTACTO 5. CORRESPONDE EL EMAIL DEL MISMO NUMERO,
  "rep_01Cliente" => STR(2) CAMPO 01 PARA REPORTE DE EXTINTORES (SI/NO): CONSECUTIVO,
  "rep_02Cliente" => STR(2) CAMPO 02 PARA REPORTE DE EXTINTORES (SI/NO): UBICACION,
  "rep_03Cliente" => STR(2) CAMPO 03 PARA REPORTE DE EXTINTORES (SI/NO): TIPO EXTINTOR,
  "rep_04Cliente" => STR(2) CAMPO 04 PARA REPORTE DE EXTINTORES (SI/NO): CAPACIDAD,
  "rep_05Cliente" => STR(2) CAMPO 05 PARA REPORTE DE EXTINTORES (SI/NO): FECHA ULTIMA REVISION,
  "rep_06Cliente" => STR(2) CAMPO 06 PARA REPORTE DE EXTINTORES (SI/NO): FECHA PROXIMA REVISION,
  "rep_07Cliente" => STR(2) CAMPO 07 PARA REPORTE DE EXTINTORES (SI/NO): PRESION,
  "rep_08Cliente" => STR(2) CAMPO 08 PARA REPORTE DE EXTINTORES (SI/NO): MANOMETRO,
  "rep_09Cliente" => STR(2) CAMPO 09 PARA REPORTE DE EXTINTORES (SI/NO): BASE,
  "rep_10Cliente" => STR(2) CAMPO 10 PARA REPORTE DE EXTINTORES (SI/NO): MANGUERA,
  "rep_11Cliente" => STR(2) CAMPO 11 PARA REPORTE DE EXTINTORES (SI/NO): PINTURA,
  "rep_12Cliente" => STR(2) CAMPO 12 PARA REPORTE DE EXTINTORES (SI/NO): SENIAL,
  "rep_13Cliente" => STR(2) CAMPO 13 PARA REPORTE DE EXTINTORES (SI/NO): ESTADO,
  "rep_14Cliente" => STR(2) CAMPO 14 PARA REPORTE DE EXTINTORES (SI/NO): SEGURO,
  "rep_15Cliente" => STR(2) CAMPO 15 PARA REPORTE DE EXTINTORES (SI/NO): PRUEBA HIDROSTATICA,
  "rep_16Cliente" => STR(2) CAMPO 16 PARA REPORTE DE EXTINTORES (SI/NO): ALTURA,
  "rep_17Cliente" => STR(2) CAMPO 17 PARA REPORTE DE EXTINTORES (SI/NO): DIFUSOR,
  "rep_18Cliente" => STR(2) CAMPO 18 PARA REPORTE DE EXTINTORES (SI/NO): LICENCIA DE FUNCIONAMIENTO,
  "rep_19Cliente" => STR(2) CAMPO 19 PARA REPORTE DE EXTINTORES (SI/NO): OBSERVACIONES
 */

// VISTA MODELO PARA CLIENTES ACTIVOS

class ClientesActivosViewModel : ViewModel()  {
    private val repository = ClientesActivosRepository()
    private val _clientesactivosList = MutableLiveData<List<ClientesActivosResponse>?>()
    val clientesactivosList: LiveData<List<ClientesActivosResponse>?> get() = _clientesactivosList

    fun fetchClientesActivos() {
        viewModelScope.launch {
            val clientesactivos = repository.fetchClientesActivos()
            _clientesactivosList.postValue(clientesactivos)
        }
    }
}