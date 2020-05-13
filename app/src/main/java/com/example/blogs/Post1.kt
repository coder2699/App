package com.example.blogs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.blogs.databinding.Post1Binding

/**
 * A simple [Fragment] subclass.
 */
class Post1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<Post1Binding>(inflater,
            R.layout.post1,container,false)
        return binding.root

    }

}
