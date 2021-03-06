/**
 * Created by [Jan Rabe](https://about.me/janrabe).
 */

@file:JvmName("DebugExtensions")

package com.exozet.transcoder.ffmpeg

import android.util.Log
import com.exozet.transcoder.BuildConfig

internal val debug = BuildConfig.DEBUG

internal fun Any.log(message: String?) {
    if (debug)
        Log.d(this::class.java.simpleName, "$message")
}

internal fun Any.loge(message: String?) {
    if (debug)
        Log.e(this::class.java.simpleName, "$message")
}

internal fun Throwable.log() {
    if (debug)
        Log.d(this::class.java.simpleName, "$message")
}