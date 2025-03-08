package net.fhtpci.fhtpci.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.fhtpci.fhtpci.model.ClientesActivosTecnicoResponse
import net.fhtpci.fhtpci.repository.ClientesActivosTecnicoRepository

/*
 * API PARA FARENHEIT SYSTEM FHTPCI Fhtpci
 * NOMBRE: mod_api_cata_clientes_activos_x_tecnico.php
 * DESCRIPCION: REGRESA EL CATALOGO DE CLIENTES AL CUAL EL TECNICO TIENE RESPONSABILIDAD, NO
 * IMPORTA SI ESTA EN EL CAMPO 1 2 3 4 o 5
 * PARAMETROS:
  cual_tecnico: Int
 *
 * CAMPOS QUE REGRESA:
  "idClienteTecnico" => (INT) ID CLIENTE,
  "nomClienteTecnico" => STR(250) NOMBRE CLIENTE,
  "cveClienteTecnico" => STR(30) CLAVE CLIENTE,
  "rsocialClienteTecnico" => STR(250) RAZON SOCIAL DEL CLIENTE,
  "activoClienteTecnico" => STR(2) ACTIVO CLIENTE: (SI/NO),
  "obsClienteTecnico" => TEXT OBSERVACIONES CLIENTE,
  "zonaClienteTecnico" => (INT) ID ZONA CLIENTE,
  "emailClienteTecnico" => STR(250) EMAIL 1,
  "email2ClienteTecnico" => STR(250) EMAIL 2,
  "email3ClienteTecnico" => STR(250) EMAIL 3,
  "email4ClienteTecnico" => STR(250) EMAIL 4,
  "email5ClienteTecnico" => STR(250) EMAIL 5,
  "tecnico1ClienteTecnico" => (INT) ID USUARIO DEL TECNICO (0 O != 0) 1,
  "tecnico2ClienteTecnico" => (INT) ID USUARIO DEL TECNICO (0 O != 0) 2,
  "tecnico3ClienteTecnico" => (INT) ID USUARIO DEL TECNICO (0 O != 0) 3,
  "tecnico4ClienteTecnico" => (INT) ID USUARIO DEL TECNICO (0 O != 0) 4,
  "tecnico5ClienteTecnico" => (INT) ID USUARIO DEL TECNICO (0 O != 0) 5,
  "contactoClienteTecnico" => STR(250) NOMBRE CONTACTO 1. CORRESPONDE EL EMAIL DEL MISMO NUMERO,
  "contacto2ClienteTecnico" => STR(250) NOMBRE CONTACTO 2. CORRESPONDE EL EMAIL DEL MISMO NUMERO,
  "contacto3ClienteTecnico" => STR(250) NOMBRE CONTACTO 3. CORRESPONDE EL EMAIL DEL MISMO NUMERO,
  "contacto4ClienteTecnico" => STR(250) NOMBRE CONTACTO 4. CORRESPONDE EL EMAIL DEL MISMO NUMERO,
  "contacto5ClienteTecnico" => STR(250) NOMBRE CONTACTO 5. CORRESPONDE EL EMAIL DEL MISMO NUMERO,
  "rep_01ClienteTecnico" => STR(2) CAMPO 01 PARA REPORTE DE EXTINTORES (SI/NO): CONSECUTIVO,
  "rep_02ClienteTecnico" => STR(2) CAMPO 02 PARA REPORTE DE EXTINTORES (SI/NO): UBICACION,
  "rep_03ClienteTecnico" => STR(2) CAMPO 03 PARA REPORTE DE EXTINTORES (SI/NO): TIPO EXTINTOR,
  "rep_04ClienteTecnico" => STR(2) CAMPO 04 PARA REPORTE DE EXTINTORES (SI/NO): CAPACIDAD,
  "rep_05ClienteTecnico" => STR(2) CAMPO 05 PARA REPORTE DE EXTINTORES (SI/NO): FECHA ULTIMA REVISION,
  "rep_06ClienteTecnico" => STR(2) CAMPO 06 PARA REPORTE DE EXTINTORES (SI/NO): FECHA PROXIMA REVISION,
  "rep_07ClienteTecnico" => STR(2) CAMPO 07 PARA REPORTE DE EXTINTORES (SI/NO): PRESION,
  "rep_08ClienteTecnico" => STR(2) CAMPO 08 PARA REPORTE DE EXTINTORES (SI/NO): MANOMETRO,
  "rep_09ClienteTecnico" => STR(2) CAMPO 09 PARA REPORTE DE EXTINTORES (SI/NO): BASE,
  "rep_10ClienteTecnico" => STR(2) CAMPO 10 PARA REPORTE DE EXTINTORES (SI/NO): MANGUERA,
  "rep_11ClienteTecnico" => STR(2) CAMPO 11 PARA REPORTE DE EXTINTORES (SI/NO): PINTURA,
  "rep_12ClienteTecnico" => STR(2) CAMPO 12 PARA REPORTE DE EXTINTORES (SI/NO): SENIAL,
  "rep_13ClienteTecnico" => STR(2) CAMPO 13 PARA REPORTE DE EXTINTORES (SI/NO): ESTADO,
  "rep_14ClienteTecnico" => STR(2) CAMPO 14 PARA REPORTE DE EXTINTORES (SI/NO): SEGURO,
  "rep_15ClienteTecnico" => STR(2) CAMPO 15 PARA REPORTE DE EXTINTORES (SI/NO): PRUEBA HIDROSTATICA,
  "rep_16ClienteTecnico" => STR(2) CAMPO 16 PARA REPORTE DE EXTINTORES (SI/NO): ALTURA,
  "rep_17ClienteTecnico" => STR(2) CAMPO 17 PARA REPORTE DE EXTINTORES (SI/NO): DIFUSOR,
  "rep_18ClienteTecnico" => STR(2) CAMPO 18 PARA REPORTE DE EXTINTORES (SI/NO): LICENCIA DE FUNCIONAMIENTO,
  "rep_19ClienteTecnico" => STR(2) CAMPO 19 PARA REPORTE DE EXTINTORES (SI/NO): OBSERVACIONES
 */

// VISTA MODELO PARA CLIENTES ACTIVOS PARA UN TECNICO DADO

class ClientesActivosTecnicoViewModel : ViewModel()  {
    private val repository = ClientesActivosTecnicoRepository()
    private val _clientesactivostecnicoList = MutableLiveData<List<ClientesActivosTecnicoResponse>?>()
    val clientesactivostecnicoList: LiveData<List<ClientesActivosTecnicoResponse>?> get() = _clientesactivostecnicoList

    fun fetchClientesActivosTecnico() {
        viewModelScope.launch {
            val clientesactivostecnico = repository.fetchClientesActivosTecnico()
            _clientesactivostecnicoList.postValue(clientesactivostecnico)
        }
    }
}