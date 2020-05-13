package com.example.blogs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.blogs.databinding.IndexBinding
import com.example.blogs.databinding.WelcomeBinding

/**
 * A simple [Fragment] subclass.
 */
class Index : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<IndexBinding>(inflater,
            R.layout.index,container,false)

        binding.read1.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_index_to_post12))

        binding.read2.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_index_to_post22))

        return binding.root
    }
}


