package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fragment.models.MyAdapter
import com.example.fragment.models.Users
import java.util.ArrayList
import kotlin.random.Random

class RecyclerListUsers : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
   private lateinit var viewAdapter: RecyclerView.Adapter<*>
   private lateinit var viewManager: RecyclerView.LayoutManager
    private val data  = generateDummyList(500)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_list_users)
        viewManager = LinearLayoutManager(this)
        viewAdapter = MyAdapter(data)
        recyclerView = findViewById<RecyclerView>(R.id.my_recycler_view).apply {
           setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
       }
      //  recyclerView.adapter = MyAdapter(data)
       // recyclerView.layoutManager = LinearLayoutManager(this)
      //  recyclerView.setHasFixedSize(true)
    }

    private fun generateDummyList(size: Int): ArrayList<Users>{
        val list = ArrayList<Users>()
        for (i in 0 until size){
            val drawable = when ( i % 3){
                0 -> R.drawable.ic_baseline_account_box_24
                1-> R.drawable.ic_baseline_supervised_user_circle_24
                else -> R.drawable.ic_baseline_account_circle_24
            }
            val item = Users("Title $i", "name $i",16+i,drawable)
            list +=item
        }
        return list
    }

    fun insertItem(view: View){
        val index: Int  = Random.nextInt(8)
        val newItem = Users(" New Title ", "New Name",15,R.drawable.ic_baseline_account_circle_24)
          data.add(index, newItem)
        viewAdapter.notifyItemInserted(index)
        
    }
    fun removeItem(view: View){
        val index: Int  = Random.nextInt(8)
        data.removeAt(index)
        viewAdapter.notifyItemRemoved(index)
    }
}

