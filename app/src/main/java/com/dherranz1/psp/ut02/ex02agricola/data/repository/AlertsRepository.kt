package com.dherranz1.psp.ut02.ex02agricola.data.repository

import com.dherranz1.psp.ut02.ex02agricola.data.repository.remote.api_plagas.RetrofitApiClientAgricola
import com.dherranz1.psp.ut02.ex02agricola.data.repository.remote.api_plagas.models.AlertApiModel
import com.dherranz1.psp.ut02.ex02agricola.data.repository.remote.api_plagas.models.AlertDataApiModelDetail
import com.dherranz1.psp.ut02.ex02agricola.data.repository.remote.api_plagas.models.AlertDataApiModelSimplified

class AlertsRepository {

    fun getAlertById(alertId : Int) : AlertDataApiModelDetail? =
        RetrofitApiClientAgricola().getAlertById(alertId)?.data


    fun getAlerts() : List<AlertDataApiModelSimplified>{
        var alertList = emptyList<AlertDataApiModelSimplified>()

        RetrofitApiClientAgricola().getAlerts()?.let {
            alertList = it.data
        }

        return alertList
    }



}