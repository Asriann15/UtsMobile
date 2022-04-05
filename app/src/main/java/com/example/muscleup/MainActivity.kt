package com.example.muscleup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.muscleup.adapter.ItemMuscle
import com.example.muscleup.data.Datasauce

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasauce().loadMuscle()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemMuscle(this, myDataset)

        recyclerView.setHasFixedSize(true)
    }
}