package com.cornbeer.baldisbasics.calculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import com.cornbeer.baldisbasics.R

class CuculatorFragment: Fragment() {
    private val viewModel: CuculatorViewModel = CuculatorViewModel()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cuculator, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val firstNumb = view.findViewById<EditText>(R.id.firstNumb)
        val secondNumb = view.findViewById<EditText>(R.id.secondNumb)


        val buttonPlus = view.findViewById<Button>(R.id.buttonPlus)
        buttonPlus.setOnClickListener {
            val pervitext = firstNumb.text.toString().toInt()
            val vtoroitext = secondNumb.text.toString().toInt()
            val itog = viewModel.plus(pervitext , vtoroitext)
            view.findViewById<TextView>(R.id.result).text = itog.toString()
        }
        val buttonMinus = view.findViewById<Button>(R.id.buttonMinus)
        buttonMinus.setOnClickListener {
            val pervitext = firstNumb.text.toString().toInt()
            val vtoroitext = secondNumb.text.toString().toInt()
            val itog = viewModel.minus(pervitext , vtoroitext)
            view.findViewById<TextView>(R.id.result).text = itog.toString()
        }

        firstNumb.addTextChangedListener { fieldValue ->
            viewModel.firstObnova(fieldValue.toString())
        }

        secondNumb.addTextChangedListener { fieldValue ->
            viewModel.secondObnova(fieldValue.toString())
        }
    }
}