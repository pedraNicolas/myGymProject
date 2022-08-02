package com.mygymproject.data.model.activities

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class ActivityModel(
    @SerializedName("name")
    var name:String?,
    @SerializedName("days")
    var days: @RawValue List<DaysDataModel>
):Parcelable{
    constructor():this("", emptyList())
}
