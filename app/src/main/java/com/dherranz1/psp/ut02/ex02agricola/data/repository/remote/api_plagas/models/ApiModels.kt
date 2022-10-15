package com.dherranz1.psp.ut02.ex02agricola.data.repository.remote.api_plagas.models

// Alerts List with alerts Simplified
data class AlertsListApiModel(val statusCode : Int, val data : List<AlertDataApiModelSimplified>)
data class AlertDataApiModelSimplified(val id : Int, val alert_id : String, val title : String, val type : Int, val date : String, val summary : String, val body : String, val source : String, val files : List<AlertDataFileApiModel>)

// Alert Detail
data class AlertApiModel(val statusCode : Int, val data : AlertDataApiModelDetail)
data class AlertDataApiModelDetail(val id : Int, val alert_id : String, val title : String, val type : Int, val date : String, val summary : String, val body : String, val source : String, val files : List<AlertDataFileApiModel>)
data class AlertDataFileApiModel(val id : Int, val alert_id : String, val name : String, val url : String)

