package com.dherranz1.psp.ut02.ex02agricola.data.repository

import com.dherranz1.psp.ut02.ex02agricola.data.repository.remote.api_plagas.RetrofitApiClientAgricola
import com.dherranz1.psp.ut02.ex02agricola.data.repository.remote.api_plagas.models.AlertApiModel
import com.dherranz1.psp.ut02.ex02agricola.data.repository.remote.api_plagas.models.AlertsListApiModel

class AlertsRepository {

    fun getAlertById(alertId : Int) : AlertApiModel? =
        RetrofitApiClientAgricola().getAlertById(alertId)


    fun getAlerts() : AlertsListApiModel? =
        RetrofitApiClientAgricola().getAlerts()


}