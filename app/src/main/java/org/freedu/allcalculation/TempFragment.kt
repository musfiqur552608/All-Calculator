package org.freedu.allcalculation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class TempFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rootView = inflater.inflate(R.layout.fragment_temp, container, false)

        val temperature = resources.getStringArray(R.array.temperature)
        val adapter = ArrayAdapter(rootView.context, R.layout.dropdown_item, temperature)

        // Find the AutoCompleteTextView within the inflated layout
        val autocompleteTV = rootView.findViewById<AutoCompleteTextView>(R.id.selecttempEtxt)
        autocompleteTV.setAdapter(adapter)
        val autocompleteTV2 = rootView.findViewById<AutoCompleteTextView>(R.id.selectcontempEtxt)
        autocompleteTV2.setAdapter(adapter)

        return rootView
    }

}