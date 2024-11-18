package com.example.my_animals

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform