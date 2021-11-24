package com.example.myandroidproject

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import com.github.barteksc.pdfviewer.PDFView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [sub2.newInstance] factory method to
 * create an instance of this fragment.
 */
class sub2 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var v= inflater.inflate(R.layout.fragment_sub2, container, false)

       /* var pdf = v.findViewById<PDFView>(R.id.pdf1)

        pdf.fromAsset("pdf.pdf").load()*/
        var units= arrayOf("SE_UNIT-1","SE_UNIT-2","SE_UNIT-3","SE_UNIT-4","SE_UNIT-5")
        var adapter = ArrayAdapter(requireContext(),android.R.layout.simple_dropdown_item_1line,units)
        var lv = v.findViewById<ListView>(R.id.lv_sub2)
        lv.adapter = adapter

        lv.setOnItemClickListener { adapterView, view, i, l ->
            when(i) {
                0 -> {
                    var intent = Intent(requireContext(), PdfActivity::class.java)
                    intent.putExtra("pos", i)
                    intent.putExtra("name","se")
                    startActivity(intent)
                }
                1 -> {
                    var intent = Intent(requireContext(), PdfActivity::class.java)
                    intent.putExtra("pos", i)
                    intent.putExtra("name","se")
                    startActivity(intent)
                }
                2 -> {
                    var intent = Intent(requireContext(), PdfActivity::class.java)
                    intent.putExtra("pos", i)
                    intent.putExtra("name","se")
                    startActivity(intent)
                }
                3 -> {
                    var intent = Intent(requireContext(), PdfActivity::class.java)
                    intent.putExtra("pos", i)
                    intent.putExtra("name","se")
                    startActivity(intent)
                }
                4 -> {
                    var intent = Intent(requireContext(), PdfActivity::class.java)
                    intent.putExtra("pos", i)
                    intent.putExtra("name","se")
                    startActivity(intent)
                }
            }
        }
        return v

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment sub2.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            sub2().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}