package be.mafken.gowalk.ui.walk

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import be.mafken.gowalk.R


class WalkFragment : Fragment() {

    companion object {
        fun newInstance() = WalkFragment()
    }

    private lateinit var viewModel: WalkViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.walk_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(WalkViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
