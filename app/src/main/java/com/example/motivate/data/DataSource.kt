package com.example.motivate.data

import com.example.motivate.R
import com.example.motivate.model.Motivation

class DataSource {

    fun loadMotivations() : List<Motivation>{
        return listOf<Motivation>(
            Motivation(R.string.motivate1, R.drawable.motivation_image),
            Motivation(R.string.motivate2, R.drawable.motivation_image),
            Motivation(R.string.motivate3, R.drawable.motivation_image),
            Motivation(R.string.motivate4, R.drawable.motivation_image),
            Motivation(R.string.motivate5, R.drawable.motivation_image),
            Motivation(R.string.motivate6, R.drawable.motivation_image),
            Motivation(R.string.motivate7, R.drawable.motivation_image),
            Motivation(R.string.motivate8, R.drawable.motivation_image),
            Motivation(R.string.motivate9, R.drawable.motivation_image),
            Motivation(R.string.motivate10, R.drawable.motivation_image),
            Motivation(R.string.motivate11, R.drawable.motivation_image),
            Motivation(R.string.motivate12, R.drawable.motivation_image),
            Motivation(R.string.motivate13, R.drawable.motivation_image),
            Motivation(R.string.motivate14, R.drawable.motivation_image),
            Motivation(R.string.motivate15, R.drawable.motivation_image)
                )
    }
}