package mx.com.pruebajobrappi.utils.extensions

import mx.com.pruebajobrappi.R
import mx.com.pruebajobrappi.utils.Constants.URL_IMAGE


val String.posterFullUrl: String
    get() = "${URL_IMAGE}$this"

val Boolean.imageFavoriteResource: Int
    get() = if (this) R.drawable.ic_favorite_full else R.drawable.ic_favorite_empty