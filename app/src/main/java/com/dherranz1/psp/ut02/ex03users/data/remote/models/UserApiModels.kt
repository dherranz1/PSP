package com.dherranz1.psp.ut02.ex03users.data.remote.models

data class UserApiModel(val id:Int, val name:String, val username:String, val email : String, val address: AddressUserApiModel, val phone : String, val website : String, val company: CompanyUserApiModel)
data class AddressUserApiModel(val street : String, val suite : String, val city : String, val zipcode : String, val geo : GeolocationUserApiModel)
data class GeolocationUserApiModel(val lat : String, val lng : String)
data class CompanyUserApiModel(val name : String, val catchPhrase : String, val bs : String)