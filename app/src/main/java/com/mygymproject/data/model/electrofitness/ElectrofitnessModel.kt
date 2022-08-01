package com.mygymproject.data.model.electrofitness

import com.google.gson.annotations.SerializedName

data class ElectrofitnessModel(
    @SerializedName("status")
    var status: String?,
    @SerializedName("turnos")
    var turnos: List<String>?
)
