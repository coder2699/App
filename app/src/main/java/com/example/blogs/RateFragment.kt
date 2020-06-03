package com.example.blogs

import android.os.Bundle
import android.preference.PreferenceManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.blogs.databinding.RateBinding


/**
 * A simple [Fragment] subclass.
 */
@Suppress("DEPRECATION")
class RateFragment : Fragment() {
    private lateinit var binding: RateBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.rate, container, false)

        val pref = PreferenceManager.getDefaultSharedPreferences(activity)
        pref.apply {
            val n1 = getString("N1", "0.0")
            binding.num.text = n1

            val n2 = getString("N2", "0.0")
            binding.num2.text = n2
        }

        binding.button.setOnClickListener()
        {
            binding.num.text =  binding.rbar.rating.toString()

        }
        binding.button2.setOnClickListener()
        {
            binding.num2.text =  binding.rbar2.rating.toString()

        }
        return binding.root
    }


    override fun onDestroy() {
        super.onDestroy()
        val pref = PreferenceManager.getDefaultSharedPreferences(activity)
        val editor = pref.edit()

        editor
            .putString("N1", binding.rbar.rating.toString())
            .putString("N2", binding.rbar2.rating.toString())
            .apply()

    }
}





