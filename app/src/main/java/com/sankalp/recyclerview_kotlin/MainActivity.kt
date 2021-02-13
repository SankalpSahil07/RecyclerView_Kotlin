package com.sankalp.recyclerview_kotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView_Players)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL,false)

        val playerListInfo = arrayListOf<PlayerDetails>(
            PlayerDetails("Cristiano Ronaldo","Juventus",R.drawable.ronaldo),
            PlayerDetails("Lionel Messi","Barcelona",R.drawable.messi),
            PlayerDetails("Neymar Jr","PSG",R.drawable.neymar),
            PlayerDetails("Marcelo","Real Madrid",R.drawable.marcelo),
            PlayerDetails("Sergio Ramos","Real Madrid",R.drawable.ramos),
            PlayerDetails("Paul Pogba","Manchester United",R.drawable.pogba),
            PlayerDetails("Luca Modric","Real Madrid",R.drawable.modric),
            PlayerDetails("Paulo Dybala","Juventus",R.drawable.dybala),
            PlayerDetails("Gareth Bale","Real Madrid",R.drawable.garethbale),
            PlayerDetails("Wayne Rooney","Manchester United",R.drawable.rooney)
        )

        val adapter = RecyclerPlayerAdapter(playerListInfo)
        recyclerView.adapter = adapter
    }
}