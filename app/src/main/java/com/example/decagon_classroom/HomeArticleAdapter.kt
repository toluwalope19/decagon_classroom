package com.example.decagon_classroom


import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.decagon_classroom.databinding.RecyclerHomeRowBinding

class HomeArticleAdapter(var articles: ArrayList<Article>): RecyclerView.Adapter<HomeArticleAdapter.ContactViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ContactViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val binding = RecyclerHomeRowBinding.inflate(inflater, parent, false)

        return ContactViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return articles.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {

        val article = articles.get(position)
        holder.bind(article)
//        holder.dateText.text= article.date
//        holder.titleText.text=article.data
//        holder.authorText.text=article.name

    }

    class ContactViewHolder(var binding: RecyclerHomeRowBinding): RecyclerView.ViewHolder(binding.root){

//        var dateText : TextView
//        var titleText:TextView
//        var authorText:TextView
//
//        init{
//            dateText=view.findViewById(R.id.date_of_release)
//            titleText=view.findViewById(R.id.article_topic)
//            authorText=view.findViewById(R.id.article_author)
//        }
        fun bind(article: Article) {

            binding.article = article

//            binding.root.setOnClickListener {
//                onItemClickListener.onClickAction(contact)
//            }
//
            binding.executePendingBindings()


        }
    }
}
