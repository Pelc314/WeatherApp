package com.plcoding.weatherapp.data.location

import android.app.Application
import android.content.Context
import android.location.Geocoder
import androidx.lifecycle.AndroidViewModel
import com.plcoding.weatherapp.presentation.MainActivity
import com.plcoding.weatherapp.presentation.WeatherViewModel
import java.util.*

class CityProvider(
    private val application: Application
) {
    fun getCity(lat: Double?, long: Double?): String {
        if (lat == null || long == null) return "null"
        return Geocoder(
           application.applicationContext,
            Locale.getDefault()
        )
            .getFromLocation(lat, long, 1)[0]
            .locality
    }
}
