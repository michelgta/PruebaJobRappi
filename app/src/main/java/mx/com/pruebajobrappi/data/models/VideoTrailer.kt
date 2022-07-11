package mx.com.pruebajobrappi.data.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import mx.com.pruebajobrappi.data.models.VideoTrailerData

@JsonClass(generateAdapter = true)
data class VideoTrailer(
        @Json(name = "id")
        val id: Long? = null,
        @Json(name = "results")
        val results: MutableList<VideoTrailerData> = mutableListOf()
)