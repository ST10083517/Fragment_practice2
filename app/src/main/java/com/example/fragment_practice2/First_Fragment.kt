package com.example.fragment_practice2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [First_Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class First_Fragment : Fragment(R.layout.fragment_first) {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnChangeText = view.findViewById<Button>(R.id.btnChangeText)
        val etEnterText1 = view.findViewById<EditText>(R.id.etEnterText1)
        val tvFirstFragmentText = view.findViewById<TextView>(R.id.tvfirstfragment)

        var sInput = etEnterText1.text

        btnChangeText.setOnClickListener{

            tvFirstFragmentText.text = null
            tvFirstFragmentText.text = sInput
            sInput = null
        }



    }
}