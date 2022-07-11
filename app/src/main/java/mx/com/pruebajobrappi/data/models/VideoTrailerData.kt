package mx.com.pruebajobrappi.data.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.util.*

@JsonClass(generateAdapter = true)
data class VideoTrailerData(
        @Json(name = "id")
        val id: String? = null,
        @Json(name = "iso_639_1")
        val iso_639_1: String? = null,
        @Json(name = "iso_3166_1")
        val iso_3166_1: String? = null,
        @Json(name = "name")
        val name: String? = null,
        @Json(name = "key")
        val key: String? = null,
        @Json(name = "site")
        val site: String? = null,
        @Json(name = "size")
        val size: Int? = null,
        @Json(name = "type")
        val type: String? = null,
        @Json(name = "official")
        val official: Boolean? = null

)

