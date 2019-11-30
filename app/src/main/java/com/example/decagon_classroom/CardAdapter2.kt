package com.example.decagon_classroom

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CardAdapter2 (var books: ArrayList<Books>): RecyclerView.Adapter<CardAdapter2.CardHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.list__row_books, parent, false)
        return CardHolder(view)
    }

    override fun getItemCount(): Int {
        return books.size
    }

    override fun onBindViewHolder(holder: CardHolder, position: Int) {

        val books = books.get(position)
        holder.titleText.text=books.name
        holder.authorText.text=books.Author

    }

    class CardHolder(view: View): RecyclerView.ViewHolder(view){


        var titleText: TextView
        var authorText: TextView

        init{
            titleText=view.findViewById(R.id.card_booktitle)
            authorText=view.findViewById(R.id.card_author)
        }
    }
}