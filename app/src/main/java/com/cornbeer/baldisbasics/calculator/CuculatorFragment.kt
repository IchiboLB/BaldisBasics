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
            try {
                val itog = viewModel.plus()
                view.findViewById<TextView>(R.id.result).text = itog.toString()
            } catch(error: Exception) {
                view.findViewById<TextView>(R.id.result).text = error.message
            }
        }
        val buttonMinus = view.findViewById<Button>(R.id.buttonMinus)
        buttonMinus.setOnClickListener {
            try {
                val itog = viewModel.minus()
                view.findViewById<TextView>(R.id.result).text = itog.toString()
            } catch(error: Exception) {
                view.findViewById<TextView>(R.id.result).text = error.message
            }
        }

        val buttonUmnozh = view.findViewById<Button>(R.id.buttonUmnozh)
        buttonUmnozh.setOnClickListener {
            try {
                val itog = viewModel.umnozh()
                view.findViewById<TextView>(R.id.result).text = itog.toString()
            } catch(error: Exception) {
                view.findViewById<TextView>(R.id.result).text = error.message
            }
        }

        val buttonDelen = view.findViewById<Button>(R.id.buttonDelen)
        buttonDelen.setOnClickListener {
            try {
                val itog = viewModel.delen()
                view.findViewById<TextView>(R.id.result).text = itog.toString()
            } catch(error: Exception) {
                view.findViewById<TextView>(R.id.result).text = error.message
            }

        }

        firstNumb.addTextChangedListener { fieldValue ->
            viewModel.firstObnova(fieldValue.toString())
        }

        secondNumb.addTextChangedListener { fieldValue ->
            viewModel.secondObnova(fieldValue.toString())
        }
    }
}