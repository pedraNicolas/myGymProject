package com.mygymproject.data.model.activities

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class UserShiftModel(
    @SerializedName("user1")
    var user1:String?,
    @SerializedName("user2")
    var user2:String?,
    @SerializedName("user3")
    var user3:String?,
    @SerializedName("user4")
    var user4:String?,
    @SerializedName("user5")
    var user5:String?,
    @SerializedName("user6")
    var user6:String?
):Parcelable{
    constructor(): this("empty","empty","empty","empty","empty","empty")
}
