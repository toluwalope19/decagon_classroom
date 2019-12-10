package com.example.decagon_classroom


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.decagon_classroom.databinding.FragmentArticleBinding
import com.example.decagon_classroom.databinding.FragmentBooksBinding

/**
 * A simple [Fragment] subclass.
 */
class BooksFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding = FragmentBooksBinding.inflate(inflater,container,false)

        var books =  ArrayList<Books>()

        val book1 = Books("Genius", "Aman")
        val book2 = Books("Genius", "Aman")
        val book3 = Books("Genius", "Aman")
        val book4 = Books("Genius", "Aman")
        val book5 = Books("Genius", "Aman")
        val book6 = Books("Genius", "Aman")
        val book7 = Books("Genius", "Aman")
        val book8 = Books("Genius", "Aman")
        val book9 = Books("Genius", "Aman")


        books.add(book1)
        books.add(book2)
        books.add(book3)
        books.add(book4)
        books.add(book5)
        books.add(book6)
        books.add(book7)
        books.add(book8)
        books.add(book9)

        val recyclerV = binding.recyclerBooks
        recyclerV?.layoutManager = GridLayoutManager(this.activity!!.applicationContext, 2)
        recyclerV?.adapter=CardAdapter2(books)

        return binding.root
    }


}
