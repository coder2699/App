package com.example.blogs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.blogs.databinding.Post2Binding

/**
 * A simple [Fragment] subclass.
 */
class Post2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<Post2Binding>(inflater,
            R.layout.post2,container,false)
        return binding.root

    }

}
