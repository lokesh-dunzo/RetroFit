package com.example.myapplication

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiInterFace {
    @GET("marvel")
    fun getAllUser() : Call < List < Model >>
}