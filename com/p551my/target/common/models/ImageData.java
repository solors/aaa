package com.p551my.target.common.models;

import android.graphics.Bitmap;
import android.util.LruCache;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.AbstractC25730e5;
import com.p551my.target.AbstractC25846ja;
import java.util.Objects;

/* renamed from: com.my.target.common.models.ImageData */
/* loaded from: classes7.dex */
public final class ImageData extends AbstractC25730e5 {
    private static final int MIN_CACHE_SIZE = 5242880;
    private volatile boolean useCache;
    private static final int DEFAULT_CACHE_SIZE = 31457280;
    @NonNull
    private static volatile LruCache<String, Bitmap> memcache = new BitmapCache(DEFAULT_CACHE_SIZE);

    /* renamed from: com.my.target.common.models.ImageData$BitmapCache */
    /* loaded from: classes7.dex */
    public static class BitmapCache extends LruCache<String, Bitmap> {
        public BitmapCache(int i) {
            super(i);
        }

        @Override // android.util.LruCache
        public int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getAllocationByteCount();
        }
    }

    private ImageData(@NonNull String str) {
        super(str);
    }

    @AnyThread
    public static void clearCache() {
        memcache.evictAll();
    }

    @NonNull
    public static ImageData newImageData(@NonNull String str) {
        return new ImageData(str);
    }

    @AnyThread
    public static void setCacheSize(int i) {
        if (i < MIN_CACHE_SIZE) {
            AbstractC25846ja.m43680a("ImageData: Setting cache size ignored - size should be >= 5242880");
        } else {
            memcache.resize(i);
        }
    }

    @Override // com.p551my.target.AbstractC25730e5
    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ImageData.class == obj.getClass() && super.equals(obj) && this.useCache == ((ImageData) obj).useCache) {
            return true;
        }
        return false;
    }

    @Nullable
    public Bitmap getBitmap() {
        return getData();
    }

    @Override // com.p551my.target.AbstractC25730e5
    @Nullable
    public Bitmap getData() {
        return (Bitmap) (this.useCache ? memcache.get(this.url) : super.getData());
    }

    @Override // com.p551my.target.AbstractC25730e5
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Boolean.valueOf(this.useCache));
    }

    public boolean isUseCache() {
        return this.useCache;
    }

    public void setBitmap(@Nullable Bitmap bitmap) {
        setData(bitmap);
    }

    @Override // com.p551my.target.AbstractC25730e5
    public void setData(@Nullable Bitmap bitmap) {
        if (!this.useCache) {
            super.setData((Object) bitmap);
        } else if (bitmap == null) {
            memcache.remove(this.url);
        } else {
            memcache.put(this.url, bitmap);
        }
    }

    @NonNull
    public String toString() {
        return "ImageData{url='" + this.url + "', width=" + this.width + ", height=" + this.height + ", bitmap=" + getData() + '}';
    }

    public void useCache(boolean z) {
        if (z == this.useCache) {
            return;
        }
        this.useCache = z;
        if (z) {
            Bitmap bitmap = (Bitmap) super.getData();
            if (bitmap != null) {
                super.setData((Object) null);
                memcache.put(this.url, bitmap);
                return;
            }
            return;
        }
        super.setData((Object) memcache.remove(this.url));
    }

    private ImageData(@NonNull String str, int i, int i2) {
        super(str);
        this.width = i;
        this.height = i2;
    }

    @NonNull
    public static ImageData newImageData(@NonNull String str, int i, int i2) {
        return new ImageData(str, i, i2);
    }
}
