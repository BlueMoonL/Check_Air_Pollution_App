package com.bluemoonl.ch21checkairpollutionapp.data.models.tmcoordinates

import com.google.gson.annotations.SerializedName

data class Document(
    @SerializedName("x")
    val x: Double?,
    @SerializedName("y")
    val y: Double?
)