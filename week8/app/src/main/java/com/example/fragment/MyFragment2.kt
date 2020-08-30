package com.example.fragment


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_my.*


/**
 * A simple [Fragment] subclass.
 * Use the [MyFragment2.newInstance] factory method to
 * create an instance of this fragment.
 */
class MyFragment2 : Fragment(R.layout.fragment2_my) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val v2 = inflater.inflate(R.layout.fragment2_my, container,false)
        var text1: TextView =v2.findViewById(R.id.textView)
        val text2: TextView=v2.findViewById(R.id.textView2)
        val btn2: Button = v2.findViewById(R.id.btnCloe)
        val text3: TextView=v2.findViewById(R.id.textView3)
        val text4: TextView=v2.findViewById(R.id.textView4)

        text1.text = arguments?.getString("Text1")
        text2.text = arguments?.getString("Text2")
        text3.text = arguments?.getString("Text3")
        text4.text = arguments?.getString("Text4")
        btn2.setOnClickListener {
            this.activity?.finish();
        }
        return v2
    }



}