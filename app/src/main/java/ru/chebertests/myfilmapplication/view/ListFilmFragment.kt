package ru.chebertests.myfilmapplication.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import ru.chebertests.myfilmapplication.R
import ru.chebertests.myfilmapplication.viewmodel.MainViewModel

class ListFilmFragment : Fragment() {
    private var mViewModel: MainViewModel? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.film_list_fragment, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

    companion object {
        fun newInstance(): ListFilmFragment {
            return ListFilmFragment()
        }
    }
}