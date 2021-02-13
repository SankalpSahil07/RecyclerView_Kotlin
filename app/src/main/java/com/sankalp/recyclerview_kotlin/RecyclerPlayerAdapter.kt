package com.sankalp.recyclerview_kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerPlayerAdapter(val itemList :ArrayList<PlayerDetails>):
    RecyclerView.Adapter<RecyclerPlayerAdapter.FootballViewHolder>() {


 class FootballViewHolder(view : View):RecyclerView.ViewHolder(view){
        val txtPlayersName : TextView = view.findViewById(R.id.textView_PlayersName)
        val txtClubsName : TextView = view.findViewById(R.id.textView_ClubsName)
        val playerImage : ImageView = view.findViewById(R.id.imageView_Players)

 }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FootballViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_players_single_row,parent,false)
        return FootballViewHolder(view)
    }

    override fun onBindViewHolder(holder: FootballViewHolder, position: Int) {
        val players = itemList[position]
        holder.txtPlayersName.text = players.playersName
        holder.txtClubsName.text = players.clubsName
        holder.playerImage.setImageResource(players.playersImage)
    }

    override fun getItemCount(): Int {
       return itemList.size
    }

}


