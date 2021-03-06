package com.example.decagon_classroom


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.decagon_classroom.databinding.FragmentArticleBinding
import com.example.decagon_classroom.databinding.FragmentHomepageBinding

/**
 * A simple [Fragment] subclass.
 */
class ArticleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding = FragmentArticleBinding.inflate(inflater,container,false)

        var articleList =  arrayListOf<Article>()


        val paper1 = Article("21, oct 2019","Genius", "Aman")
        val paper2 = Article("21, oct 2019","Genius", "Aman")
        val paper3 = Article("21, oct 2019","Genius", "Aman")
        val paper4 = Article("21, oct 2019","Genius", "Aman")
        val paper5 = Article("21, oct 2019","Genius", "Aman")
        val paper6 = Article("21, oct 2019","Genius", "Aman")



        articleList.add(paper1)
        articleList.add(paper2)
        articleList.add(paper3)
        articleList.add(paper4)
        articleList.add(paper5)
        articleList.add(paper6)


        var homeRecyclerView = binding.recyclerViewArticles
        homeRecyclerView?.layoutManager = LinearLayoutManager(this.activity!!.applicationContext)
        homeRecyclerView?.adapter=HomeArticleAdapter(articleList)

        return binding.root
    }


}
