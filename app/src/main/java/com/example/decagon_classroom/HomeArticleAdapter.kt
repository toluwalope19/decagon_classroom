package com.example.decagon_classroom


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HomeArticleAdapter(var articles: ArrayList<Article>): RecyclerView.Adapter<HomeArticleAdapter.ContactViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ContactViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_home_row, parent, false)

        return ContactViewHolder(view)
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {

        val article = articles.get(position)
        holder.dateText.text= article.date
        holder.titleText.text=article.data
        holder.authorText.text=article.name

    }

    class ContactViewHolder(view: View): RecyclerView.ViewHolder(view){

        var dateText : TextView
        var titleText:TextView
        var authorText:TextView

        init{
            dateText=view.findViewById(R.id.date_of_release)
            titleText=view.findViewById(R.id.article_topic)
            authorText=view.findViewById(R.id.article_author)
        }
    }
}
