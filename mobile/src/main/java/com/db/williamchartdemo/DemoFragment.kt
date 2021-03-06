package com.db.williamchartdemo

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.demo_fragment.*

class DemoFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.demo_fragment, container, false)
    }

    override fun onViewCreated(view: View, saveInstanceState: Bundle?) {

        val lineSet = linkedMapOf(
            "label1" to 5f,
            "label2" to 4.5f,
            "label3" to 4.7f,
            "label4" to 3.5f,
            "label5" to 3.6f,
            "label6" to 7.5f,
            "label7" to 7.5f,
            "label8" to 10f,
            "label9" to 5f,
            "label10" to 6.5f,
            "label11" to 3f,
            "label12" to 4f
        )

        lineChart.gradientFillColors =
            intArrayOf(
                Color.parseColor("#81FFFFFF"),
                Color.TRANSPARENT
            )
        lineChart.animation.duration = 1000
        lineChart.animate(lineSet)

        val barSet = linkedMapOf(
            "JAN" to 4F,
            "FEB" to 7F,
            "MAR" to 2F,
            "MAY" to 2.3F,
            "APR" to 5F,
            "JUN" to 4F,
            "JUL" to 2F,
            "AUG" to 4F,
            "SEP" to 5F,
            "OCT" to 6F,
            "NOV" to 4F,
            "DEC" to 3F
        )

        barChart.animation.duration = 1000
        barChart.animate(barSet)

        val horizontalBarSet = linkedMapOf(
            "PORRO" to 5F,
            "FUSCE" to 6.4F,
            "EGET" to 3F
        )

        horizontalBarChart.animation.duration = 1000
        horizontalBarChart.animate(horizontalBarSet)
    }
}