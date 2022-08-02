package com.mygymproject.data.model.activities

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class DaysDataModel(
    @SerializedName("name")
    var name:String?,
    @SerializedName("shifts")
    var shifts:@RawValue List<ShiftModel>?,
    @SerializedName("status")
    var status:String?
):Parcelable{
    constructor():this("", emptyList(),"No Available")
}
