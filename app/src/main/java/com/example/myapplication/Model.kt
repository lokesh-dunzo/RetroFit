package com.example.myapplication

import com.google.gson.annotations.SerializedName


data class Model(
  @SerializedName("name")
  val name:String);