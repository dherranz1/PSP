package com.dherranz1.psp.ut02.ex02agricola.data.repository.remote.api_plagas.models

class AlertDataApiModel(
    val id : Int,
    val alert_id : String,
    val title : String,
    val type : Int,
    val date : String,
    val summary : String,
    val body : String,
    val source : String,
    val files : List<AlertDataFileApiModel>
) {
}