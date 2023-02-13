package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getUser();
    }

    fun getUser(){
        val user = RetroFitClient.userInstnce.getAllUser();
        user.enqueue(object : Callback<List<Model>>{
            override fun onFailure(call: Call<List<Model>>, t: Throwable) {
                Log.d("Lokesh","Error Occurred")
            }

            override fun onResponse(
                call: Call<List<Model>>,
                response: Response<List<Model>>
            ) {
                //println("YES");
                val res = response.body();
                Log.d("LOKESH",res.toString())
            }
        })
    }
}