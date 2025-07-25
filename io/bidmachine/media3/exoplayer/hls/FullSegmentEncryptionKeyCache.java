package io.bidmachine.media3.exoplayer.hls;

import android.net.Uri;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Assertions;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: io.bidmachine.media3.exoplayer.hls.b */
/* loaded from: classes9.dex */
final class FullSegmentEncryptionKeyCache {
    private final LinkedHashMap<Uri, byte[]> backingMap;

    /* compiled from: FullSegmentEncryptionKeyCache.java */
    /* renamed from: io.bidmachine.media3.exoplayer.hls.b$a */
    /* loaded from: classes9.dex */
    class C36226a extends LinkedHashMap<Uri, byte[]> {
        final /* synthetic */ int val$maxSize;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C36226a(int i, float f, boolean z, int i2) {
            super(i, f, z);
            this.val$maxSize = i2;
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            if (size() > this.val$maxSize) {
                return true;
            }
            return false;
        }
    }

    public FullSegmentEncryptionKeyCache(int i) {
        this.backingMap = new C36226a(i + 1, 1.0f, false, i);
    }

    public boolean containsUri(Uri uri) {
        return this.backingMap.containsKey(Assertions.checkNotNull(uri));
    }

    @Nullable
    public byte[] get(@Nullable Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.backingMap.get(uri);
    }

    @Nullable
    public byte[] put(Uri uri, byte[] bArr) {
        return this.backingMap.put((Uri) Assertions.checkNotNull(uri), (byte[]) Assertions.checkNotNull(bArr));
    }

    @Nullable
    public byte[] remove(Uri uri) {
        return this.backingMap.remove(Assertions.checkNotNull(uri));
    }
}
