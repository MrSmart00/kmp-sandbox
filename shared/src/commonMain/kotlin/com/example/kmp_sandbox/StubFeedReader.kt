package com.example.kmp_sandbox

import kmp_sandbox.shared.generated.resources.Res
import org.jetbrains.compose.resources.ExperimentalResourceApi

class StubFeedReader {
    @OptIn(ExperimentalResourceApi::class)
    suspend fun feeds(): String {
        val bytes = Res.readBytes("files/feed.json")
        return bytes.decodeToString()
    }
}