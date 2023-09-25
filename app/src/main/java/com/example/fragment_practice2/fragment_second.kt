package com.example.fragment_practice2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class fragment_second : Fragment(R.layout.fragment_second) {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnChangeText2 = view.findViewById<Button>(R.id.btnChangeText2)
        val etEnterText2 = view.findViewById<EditText>(R.id.etEnterText2)
        val tvSecondfragment2 = view.findViewById<TextView>(R.id.tvSecondfragment2)
        var sInput = etEnterText2.text

        btnChangeText2.setOnClickListener {
            tvSecondfragment2.text = null
            tvSecondfragment2.text = sInput
            sInput = null
        }
    }

}