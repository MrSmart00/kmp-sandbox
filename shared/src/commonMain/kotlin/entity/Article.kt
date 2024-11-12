package entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Article(
    val title: String,
    @SerialName("pubDate") val date: String,
    val link: String,
    @SerialName("description") val desc: String,
    val content: String
)
