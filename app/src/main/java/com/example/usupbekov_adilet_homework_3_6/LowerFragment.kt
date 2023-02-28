package com.example.usupbekov_adilet_homework_3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.usupbekov_adilet_homework_3_6.databinding.FragmentLowerBinding

class LowerFragment : Fragment() {

    private lateinit var binding:FragmentLowerBinding

private lateinit var playList:ArrayList<Song>
private lateinit var adapter:AdapterLower
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentLowerBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
        adapter= AdapterLower(playList, this::onClick)
        binding.rvMusicList.adapter=adapter

    }

    private fun loadData() {
        playList= ArrayList<Song>()
        playList.apply {
            add(Song("1","3:07","Bakr","Бедный поэт"))
            add(Song("2","2:58","Bakr","Статус души"))
            add(Song("3","3:07","Bakr","Эталон красоты"))
            add(Song("4","3:22","Bakr","Не лей"))
            add(Song("5","3:29","Bakr","Нотная слеза"))
            add(Song("6","3:01","Bakr,Ulukmanapo","Расстояние"))
            add(Song("7","2:51","Bakr","Очи"))
            add(Song("8","3:12","Bakr","Ойлорумда"))
            add(Song("9","3:29","Bakr","Вредина"))
            add(Song("10","3:12","Bakr","Сирень"))
        }

    }
    private fun onClick(tittle:String){
        val bundle=Bundle()
        bundle.putString("Key",tittle)
        val infoFragment=InfoFragment()
        infoFragment.arguments=bundle
        requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container_fragment_two,infoFragment).addToBackStack(null).commit()

    }
}
