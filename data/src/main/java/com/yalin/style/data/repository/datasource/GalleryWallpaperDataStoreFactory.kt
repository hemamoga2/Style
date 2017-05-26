package com.yalin.style.data.repository.datasource

import android.content.Context
import com.yalin.style.data.lock.OpenInputStreamLock
import javax.inject.Inject
import javax.inject.Singleton

/**
 * @author jinyalin
 * @since 2017/5/24.
 */
@Singleton
class GalleryWallpaperDataStoreFactory @Inject
constructor(val context: Context,
            val openInputStreamLock: OpenInputStreamLock) {

    fun create(): GalleryWallpaperDataStore {
        return GalleryWallpaperDataStore(context, openInputStreamLock)
    }
}