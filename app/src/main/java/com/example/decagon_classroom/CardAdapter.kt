package com.example.decagon_classroom

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.decagon_classroom.databinding.FragmentHomepageBinding
import com.example.decagon_classroom.databinding.ListRowBookBinding

class CardAdapter (var books: ArrayList<Books>): RecyclerView.Adapter<CardAdapter.CardHolder>() {


        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): CardHolder {

            val inflater = LayoutInflater.from(parent.context)
            val binding = ListRowBookBinding.inflate(inflater, parent, false)

            return CardHolder(binding)
        }

        override fun getItemCount(): Int {
            return books.size
        }

        override fun onBindViewHolder(holder: CardHolder, position: Int) {

            val books = books.get(position)
            holder.bind(books)


        }

        class CardHolder(var binding: ListRowBookBinding): RecyclerView.ViewHolder(binding.root){

//
//            var titleText: TextView
//            var authorText: TextView
//
//            init{
//                titleText=view.findViewById(R.id.card_booktitle)
//                authorText=view.findViewById(R.id.card_author)
//            }

            fun bind(books: Books) {

                binding.book = books

//                binding.root.setOnClickListener {
//                    onItemClickListener.onClickAction(contact)
//                }
                binding.executePendingBindings()


            }
        }
}