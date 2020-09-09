package com.example.fragment


import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment


/**
 * A simple [Fragment] subclass.
 * Use the [MyFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v1 = inflater.inflate(R.layout.fragment_my, container,false)

        val btn: Button = v1.findViewById(R.id.btnNext)
        val editText1: EditText = v1.findViewById(R.id.text1)
        val editText2: EditText = v1.findViewById(R.id.text2)
        val editText3: EditText = v1.findViewById(R.id.text3)
        val editText4: EditText = v1.findViewById(R.id.text4)

        btn.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("Text1", editText1.text.toString())
            bundle.putString("Text2",editText2.text.toString())
            bundle.putString("Text3",editText3.text.toString())
            bundle.putString("Text4",editText4.text.toString())
            val secondFragment = MyFragment2()
            secondFragment.arguments = bundle
            val fragManager = activity!!.supportFragmentManager
            fragManager.beginTransaction().apply {
                replace(R.id.flFragment, secondFragment)
                addToBackStack(null)
               commit()
            }
        }

        return v1
    }

}