package p789m9;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: m9.b */
/* loaded from: classes8.dex */
public class CachedBitmap {
    @NonNull

    /* renamed from: a */
    private final Bitmap f101083a;
    @Nullable

    /* renamed from: b */
    private final Uri f101084b;
    @Nullable

    /* renamed from: c */
    private final byte[] f101085c;
    @NonNull

    /* renamed from: d */
    private final BitmapSource f101086d;

    public CachedBitmap(@NonNull Bitmap bitmap, @Nullable Uri uri, @NonNull BitmapSource bitmapSource) {
        this(bitmap, null, uri, bitmapSource);
    }

    @NonNull
    /* renamed from: a */
    public Bitmap m15348a() {
        return this.f101083a;
    }

    @Nullable
    /* renamed from: b */
    public byte[] m15347b() {
        return this.f101085c;
    }

    @Nullable
    /* renamed from: c */
    public Uri m15346c() {
        return this.f101084b;
    }

    @NonNull
    /* renamed from: d */
    public BitmapSource m15345d() {
        return this.f101086d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CachedBitmap cachedBitmap = (CachedBitmap) obj;
        if (!this.f101083a.equals(cachedBitmap.m15348a()) || this.f101086d != cachedBitmap.m15345d()) {
            return false;
        }
        Uri m15346c = cachedBitmap.m15346c();
        Uri uri = this.f101084b;
        if (uri != null) {
            return uri.equals(m15346c);
        }
        if (m15346c == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.f101083a.hashCode() * 31) + this.f101086d.hashCode()) * 31;
        Uri uri = this.f101084b;
        if (uri != null) {
            i = uri.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public CachedBitmap(@NonNull Bitmap bitmap, @Nullable byte[] bArr, @Nullable Uri uri, @NonNull BitmapSource bitmapSource) {
        this.f101083a = bitmap;
        this.f101084b = uri;
        this.f101085c = bArr;
        this.f101086d = bitmapSource;
    }
}
