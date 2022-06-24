package com.example.tourismapp2


data class Place (
    var name: String,
    var imageUrl: String,
    var status: String,
    var description: String,
    var distance: Double,
    var latitude: Double,
    var longitude: Double,
    var openTime: String, // 09:15
    var closeTime: String, //   23:45
)