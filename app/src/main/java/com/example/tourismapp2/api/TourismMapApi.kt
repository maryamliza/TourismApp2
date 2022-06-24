package com.example.tourismapp2.api

import com.example.tourismapp2.Place
import retrofit2.Call
import retrofit2.http.GET

interface TourismMapApi {
@GET("places")
fun getPlaces (): Call<List<Place>>
}