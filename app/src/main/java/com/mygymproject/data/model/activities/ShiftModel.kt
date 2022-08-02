package com.mygymproject.data.model.activities

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import kotlinx.parcelize.RawValue

@Parcelize
data class ShiftModel(
    @SerializedName("shifts")
    var shifts:@RawValue List<UserShiftModel>
):Parcelable{
    constructor():this(emptyList())
}
