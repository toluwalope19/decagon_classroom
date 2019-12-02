package com.example.decagon_classroom


import android.gesture.GestureOverlayView.ORIENTATION_HORIZONTAL
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
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

        val viewpager2 = view.findViewById<ViewPager2>(R.id.viewPager2)
        var books = arrayListOf<Books>(

            Books("Anjana","Meeee"),
            Books("Anjana","Meeee"),
            Books("Anjana","Meeee"),
            Books("Anjana","Meeee")
        )
        with(viewpager2) {
            clipToPadding = false
            clipChildren = false
            offscreenPageLimit = 3
        }
        val pageMarginPx = resources.getDimensionPixelOffset(R.dimen.pageMargin)
        val offsetPx = resources.getDimensionPixelOffset(R.dimen.offset)
        viewpager2.setPageTransformer { page, position ->
            val viewPager = page.parent.parent as ViewPager2
            val offset = position * -(2 * offsetPx + pageMarginPx)
            if (viewPager.orientation == ORIENTATION_HORIZONTAL) {
                if (ViewCompat.getLayoutDirection(viewPager) == ViewCompat.LAYOUT_DIRECTION_RTL) {
                    page.translationX = -offset
                } else {
                    page.translationX = offset
                }
            } else {
                page.translationY = offset
            }
        }


        viewpager2.adapter = CardAdapter(books)



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



        var homeRecyclerView = view?.findViewById<RecyclerView>(R.id.recycler_viewHome)
        homeRecyclerView?.layoutManager = LinearLayoutManager(this.activity!!.applicationContext)

        homeRecyclerView?.adapter=HomeArticleAdapter(articleList)


        return view

    }


}






