package com.example.kmp_sandbox

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform