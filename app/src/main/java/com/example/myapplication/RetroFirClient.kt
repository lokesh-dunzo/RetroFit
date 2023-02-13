package com.example.myapplication

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "https://simplifiedcoding.net/demos/"
object RetroFitClient {
    val userInstnce : ApiInterFace
    init{
        val retroit = Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        userInstnce = retroit.create(ApiInterFace :: class.java)
    }
}