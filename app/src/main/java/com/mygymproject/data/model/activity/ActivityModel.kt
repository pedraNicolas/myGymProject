package com.mygymproject.data.model.activity

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ActivityModel(
    @SerializedName("status")
    var status: String?,
    @SerializedName("turnos")
    var reservation: List<String>?
): Parcelable {
    constructor():this("No Available", emptyList())
}
