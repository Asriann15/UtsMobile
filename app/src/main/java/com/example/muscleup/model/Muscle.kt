package com.example.muscleup.model

import com.example.muscleup.R
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Muscle(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int) {

}