package com.miu.lesson6_homework5_question2_listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    lateinit var items: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var electronics = arrayOf<String>("televisions", "DVD players", "laptops", "desktop computers", "mobile phones",
            "iPods", "iPads", "cameras", "fans", "ovens", "washing machines", "game consoles", "printers", "radios")

    var cloth = arrayOf<String>("belt", "boots", "cap", "coat", "dress", "gloves", "hat", "jacket", "jeans", "pajamas", "pants", "raincoat", "scarf", "shirt", "shoes", "skirt",
            "slacks", "slippers", "socks", "stockings", "suit", "sweater", "sweatshirt", "t-shirt", "tie", "trousers", "underclothes", "underpants", "undershirt")

    var beauty = arrayOf<String>("concealer", "blush", "powder", "Mascara", "Neutral Eye Shadow", "Lipstick", "Eye Liner", "Fluffy Powder Brush", "Crease Brush", "Tweezers")
    var food = arrayOf<String>("Garlic", "ginger", "ice cream", "Irish stew", "Indian food", "gnocchi,goose", "sparagus", "apple", "avacado", "beer", "bisque", "bluefish", "bread", "dates")
}