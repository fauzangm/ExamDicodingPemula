package com.eduside.examdicodingfundamental.repository

import com.eduside.examdicodingfundamental.R

object planet {

    private var name = arrayListOf<String>("Matahari",
    "Merkurius","Venus","Bumi","Mars","Jupiter","Saturnus","Uranus","Neptunus","Pluto")

    private var detailplanet = arrayListOf<String>("Matahari atau Surya adalah bintang di pusat tata surya. Bentuknya nyaris bulat dan terdiri dari plasma panas bercampur medan magnet.",
    "Merkurius adalah planet terkecil di Tata Surya sekaligus yang terdekat dari Matahari. Periode revolusi planet ini merupakan yang terpendek dari semua planet ",
    "Venus adalah planet terdekat kedua dari Matahari setelah Merkurius. Planet ini mengorbit Matahari selama 224,7 hari Bumi",
    "Bumi adalah planet ketiga dari Matahari yang merupakan planet terpadat dan terbesar kelima dari delapan planet dalam Tata Surya.",
    "Mars adalah planet terdekat keempat dari Matahari. Namanya diambil dari dewa perang Romawi, Mars. Planet ini sering dijuluki sebagai \"planet merah\" karena tampak dari jauh berwarna kemerah-kemerahan",
    "Jupiter atau Yupiter adalah planet terdekat kelima dari Matahari setelah Merkurius, Venus, Bumi, dan Mars. Planet ini juga merupakan planet terbesar di Tata Surya.",
    "Saturnus adalah planet keenam dari Matahari dan merupakan planet terbesar kedua di Tata Surya setelah Jupiter. Saturnus juga merupakan sebuah raksasa gas yang memiliki radius rata-rata sekitar 9 kali radius rata-rata Bumi.",
    "Uranus (berasal dari nama Latin Ūranus untuk nama dewa Yunani Οὐρανός) adalah planet ketujuh dari Matahari. Uranus merupakan planet yang memiliki jari-jari terbesar ketiga sekaligus massa terbesar keempat di Tata Surya.",
    "Neptunus merupakan planet terjauh (kedelapan) jika ditinjau dari Matahari. Planet ini dinamai dari dewa lautan Romawi. Neptunus merupakan planet terbesar keempat berdasarkan diameter (49.530 km) dan terbesar ketiga berdasarkan massa.",
    "Pluto (nama planet minor: 134340 Pluto) adalah planet katai di sabuk Kuiper dan objek trans-Neptunus pertama yang ditemukan. ")

    private var photo = arrayListOf(R.drawable.matahari,
    R.drawable.mercury,
    R.drawable.venus,
    R.drawable.earth,
    R.drawable.mars,
    R.drawable.jupiter,
    R.drawable.saturnus,
    R.drawable.uranus,
    R.drawable.neptunus,
    R.drawable.pluto)

    val listdata : ArrayList<dataplanet>

    get(){
        var list = arrayListOf<dataplanet>()

        for (posisi in name.indices){
            val planet = dataplanet()
            planet.nama = name[posisi]
            planet.detail = detailplanet[posisi]
            planet.Photo = photo[posisi]

            list.add(planet)
        }
        return list
    }

}