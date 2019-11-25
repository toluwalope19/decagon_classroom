package com.example.decagon_classroom


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_homepage.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    companion object{
        fun newInstance(): HomeFragment {


            return HomeFragment()

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_homepage, container, false)

        var articleList =  arrayListOf<Article>()


        val paper1 = Article("21, oct 2019","Electronics defaults", "Ama Benedict")
        val paper2 = Article("21, oct 2019","Electronics defaults", "Ama Benedict")
        val paper3 = Article("21, oct 2019","Electronics defaults", "Ama Benedict")
        val paper4 = Article("21, oct 2019","Electronics defaults", "Ama Benedict")
        val paper5 = Article("21, oct 2019","Electronics defaults", "Ama Benedict")
        val paper6 = Article("21, oct 2019","Electronics defaults", "Ama Benedict")



        articleList.add(paper1)
        articleList.add(paper2)
        articleList.add(paper3)
        articleList.add(paper4)
        articleList.add(paper5)
        articleList.add(paper6)


        var recyclerView = view?.findViewById<RecyclerView>(R.id.recycler_viewHome)
        recyclerView?.layoutManager = LinearLayoutManager(this.activity!!.applicationContext)
        recyclerView?.adapter=homeArticleAdapter(articleList)

        return view

    }


}






