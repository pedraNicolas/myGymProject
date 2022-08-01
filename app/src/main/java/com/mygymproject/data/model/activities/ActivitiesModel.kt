package com.mygymproject.data.model.activities

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.mygymproject.data.model.activity.ActivityModel
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class ActivitiesModel(
    @SerializedName("activities")
    var activities: @RawValue List<ActivityModel>,
    @SerializedName("success")
    var  success: Boolean
): Parcelable {
    constructor(): this(emptyList(),false)
}
