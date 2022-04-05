package com.example.muscleup.data

import com.example.muscleup.R
import com.example.muscleup.model.Muscle

class Datasauce {
    fun loadMuscle(): List<Muscle> {
        return listOf<Muscle>(
            Muscle(R.string.muscle1, R.drawable.image1),
            Muscle(R.string.muscle2, R.drawable.image2),
            Muscle(R.string.muscle3, R.drawable.image3),
            Muscle(R.string.muscle4, R.drawable.image4),
            Muscle(R.string.muscle5, R.drawable.image5),
            Muscle(R.string.muscle6, R.drawable.image6),
            Muscle(R.string.muscle7, R.drawable.image7),
            Muscle(R.string.muscle8, R.drawable.image8),
            Muscle(R.string.muscle9, R.drawable.image9),
            Muscle(R.string.muscle10, R.drawable.image10)
        )
    }
}