package com.project.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.affirmations.model.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = Datasource().loadAffirmations()
        
    }
}