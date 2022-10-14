package com.dherranz1.psp.ut02.ex02agricola.data.repository

import com.dherranz1.psp.ut02.ex02agricola.data.repository.remote.api_plagas.RetrofitApiClientAgricola
import com.dherranz1.psp.ut02.ex02agricola.data.repository.remote.api_plagas.models.AlertApiModel

class AlertsRepository {

    fun getAlertById(alertId : Int) : AlertApiModel? =
        RetrofitApiClientAgricola().getAlertById(alertId)


    fun getAlerts() : List<AlertDataApiModel>? =
        RetrofitApiClientAgricola().getAlerts()?.data


}