package org.example.commoncomposable

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform