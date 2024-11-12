package com.example.kmp_sandbox

import entity.Article
import kmp_sandbox.shared.generated.resources.Res
import kotlinx.serialization.json.Json
import org.jetbrains.compose.resources.ExperimentalResourceApi

class StubFeedReader {
    @OptIn(ExperimentalResourceApi::class)
    suspend fun feeds(): List<Article> {
        val bytes = Res.readBytes("files/feed.json")
        val json = bytes.decodeToString()

        return Json.decodeFromString<List<Article>>(json)
    }
}