package com.bluemoonl.ch21checkairpollutionapp.data.models.airquality

import androidx.annotation.ColorRes
import com.bluemoonl.ch21checkairpollutionapp.R
import com.google.gson.annotations.SerializedName

enum class Grade(
    val label: String,
    val emoji: String,
    @ColorRes val colorResId: Int
) {
    @SerializedName("1")
    GOOD("좋음", "\uD83D\uDE0A", R.color.blue),

    @SerializedName("2")
    NORMAL("보통", "\uD83D\uDE10", R.color.green),

    @SerializedName("3")
    BAD("나쁨", "\uD83D\uDE2B", R.color.yellow),

    @SerializedName("4")
    AWFUL("매우 나쁨", "\uD83D\uDE21", R.color.red),

    UNKNOWN("미측정", "\uD83E\uDD14", R.color.gray);

    override fun toString(): String {
        return "$label $emoji"
    }
}