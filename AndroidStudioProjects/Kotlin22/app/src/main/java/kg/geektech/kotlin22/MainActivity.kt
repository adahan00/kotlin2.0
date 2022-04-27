package kg.geektech.kotlin22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kg.geektech.kotlin22.databinding.ActivityMainBinding
import kg.geektech.kotlin22.extension.glide
import java.util.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val url = mutableListOf(
        "http://faktom.ru/data/photo/021917_043697845627.jpg",
        "http://carbodydesign.com/archive/2006/11/30-mazda-nagare-concept/Mazda-Nagare-Concept-5-lg.jpg",
        "https://kartinki24.ru/uploads/gallery/main/319/hhwc2shr6.jpg",
        "https://artfiles.alphacoders.com/133/133799.jpg",
        "https://w-dog.ru/wallpapers/6/8/334018598393756/labrado-shhenki-zabavnye.jpg"

    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.submit.setOnClickListener {
            url.add(binding.editText.text.toString())
        }

        binding.btnRandom.setOnClickListener {
        val randomUrl = Random.nextInt()
            val randomElement = url[randomUrl]
            Log.e("ololo", randomElement)
            binding.imageView.glide(randomElement)
        }


    }
}