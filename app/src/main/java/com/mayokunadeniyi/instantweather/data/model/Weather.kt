package com.mayokunadeniyi.instantweather.data.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by Mayokun Adeniyi on 27/02/2020.
 */

//This represents the Domain weather model
@Parcelize
data class Weather(

    val uId: Int,
    val cityId: Int,
    val name: String,
    val wind: Wind,
    val networkWeatherDescription: List<NetworkWeatherDescription>,
    val networkWeatherCondition: NetworkWeatherCondition,
    val sys: Sys
) : Parcelable