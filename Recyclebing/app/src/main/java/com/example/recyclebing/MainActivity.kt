package com.example.recyclebing

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerViewRequests: RecyclerView
    private lateinit var adapter: FriendRequestAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        initViews()
        setupRecyclerView()
    }

    private fun initViews() {
        recyclerViewRequests = findViewById(R.id.recyclerViewRequests)
    }

    private fun setupRecyclerView() {
        val randomNames = listOf(
            "Aarav Rahman",
            "Mehedi Hasan",
            "Farhana Islam",
            "Tanvir Hossain",
            "Sumaiya Akter",
            "Rakibul Islam",
            "Tasnia Rahman",
            "Sakib Al Hasan",
            "Sadia Afrin",
            "Imran Khan",
            "Nusrat Jahan",
            "Fahim Faisal",
            "Tania Sultana",
            "Raihan Ahmed",
            "Priya Sen"
        )
        
        val friendArray = Array(10) { index ->
            FriendRequest(
                id = index + 1,
                name = randomNames.random(),
                mutualFriendsCount = (1..15).random()
            )
        }

        adapter = FriendRequestAdapter(friendArray)

        recyclerViewRequests.layoutManager = LinearLayoutManager(this)
        recyclerViewRequests.adapter = adapter
    }
}
