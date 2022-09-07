package com.example.recyclerview

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.StudentAdapter
import com.example.recyclerview.databinding.ActivityMainBinding
import com.example.recyclerview.model.Provinsi
import com.example.recyclerview.model.Student

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var studentAdapter: StudentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        setRecycler()
    }

    private fun setRecycler(){
        val listData = mutableListOf<Provinsi>()
       listData.add(Provinsi("Nanggroe Aceh Darussalam", "Banda Aceh", R.drawable.aceh))
       listData.add(Provinsi("Sumatra Utara", "Medan", R.drawable.sumut))
       listData.add(Provinsi("Sumatra Selatan", "Palembang", R.drawable.sumsel))
       listData.add(Provinsi("Sumatra Barat", "Padang", R.drawable.sumbar))
       listData.add(Provinsi("Bengkulu", "Bengkulu", R.drawable.bengkulu))
       listData.add(Provinsi("Riau", "Pekanbaru", R.drawable.riau))
       listData.add(Provinsi("Jambi", "jambi", R.drawable.riauselaso))
       listData.add(Provinsi("lampung", "Bandar Lampung", R.drawable.lampung))
       listData.add(Provinsi("Bangka Belitung", "Pangkal Pinang", R.drawable.bangka))
       listData.add(Provinsi("Kalimantan Timur", "Samarinda", R.drawable.kaltim))
       listData.add(Provinsi("Kalimantan Barat", "Pontianak", R.drawable.kalbar))
       listData.add(Provinsi("Kalimantan Tengah", "Palangkaraya", R.drawable.kalteng))
       listData.add(Provinsi("Kalimantan Selatan", "Banjar Baru", R.drawable.kalsel))
       listData.add(Provinsi("Kalimantan Utara", "Tanjung Selor", R.drawable.kalut))
       listData.add(Provinsi("Jawa Barat", "Bandung", R.drawable.jabar))
       listData.add(Provinsi("Jawa Tengah", "Semarang", R.drawable.jateng))
       listData.add(Provinsi("Jawa Timur", "Surabaya", R.drawable.jatim))
       listData.add(Provinsi("Bali", "Denpasar", R.drawable.bali))
       listData.add(Provinsi("Nusa Tenggara Barat", "Mataram", R.drawable.ntb))
       listData.add(Provinsi("Nusa Tenggara Timur", "Kupang", R.drawable.ntt))
       listData.add(Provinsi("Sulawesi Utara", "Manado", R.drawable.sulut))
       listData.add(Provinsi("Sulawesi Barat", "Mamuju", R.drawable.bangka))
       listData.add(Provinsi("Sulawesi Tengah", "palu", R.drawable.sulteng))
       listData.add(Provinsi("Sulawesi Tenggara", "Kendari", R.drawable.sultenggara))
       listData.add(Provinsi("Sulawesi Selatan", "Makassar", R.drawable.bangka))
       listData.add(Provinsi("Maluku Utara", "Sofifi", R.drawable.maluku))
       listData.add(Provinsi("Maluku", "Ambon", R.drawable.maluku_baileo))
       listData.add(Provinsi("Papua Barat", "Manokwari", R.drawable.papua_barat))
       listData.add(Provinsi("Papua", "Jayapura", R.drawable.papuahonai))
       listData.add(Provinsi("Papua Selatan", "Kabupaten Merauke", R.drawable.papuaselatan))
       listData.add(Provinsi("Papua Tengah", "kabupaten Nabire", R.drawable.papuatengah))
       listData.add(Provinsi("Papua Pegunungan", "Kabupaten Jayawijaya", R.drawable.papua_barat))


        studentAdapter = StudentAdapter(listData)
        binding.recycler.apply {
            adapter = studentAdapter
            if(applicationContext.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
                layoutManager = GridLayoutManager(this@MainActivity,2)
            }else{
                layoutManager = LinearLayoutManager(this@MainActivity)
            }
        }



    }
}