package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.ironsource.C21114v8;
import java.io.File;

/* loaded from: classes4.dex */
public class CacheSpan implements Comparable<CacheSpan> {
    @Nullable
    public final File file;
    public final boolean isCached;
    public final String key;
    public final long lastTouchTimestamp;
    public final long length;
    public final long position;

    public CacheSpan(String str, long j, long j2) {
        this(str, j, j2, -9223372036854775807L, null);
    }

    public boolean isHoleSpan() {
        return !this.isCached;
    }

    public boolean isOpenEnded() {
        if (this.length == -1) {
            return true;
        }
        return false;
    }

    public String toString() {
        return C21114v8.C21123i.f54137d + this.position + ", " + this.length + C21114v8.C21123i.f54139e;
    }

    public CacheSpan(String str, long j, long j2, long j3, @Nullable File file) {
        this.key = str;
        this.position = j;
        this.length = j2;
        this.isCached = file != null;
        this.file = file;
        this.lastTouchTimestamp = j3;
    }

    @Override // java.lang.Comparable
    public int compareTo(CacheSpan cacheSpan) {
        if (!this.key.equals(cacheSpan.key)) {
            return this.key.compareTo(cacheSpan.key);
        }
        int i = ((this.position - cacheSpan.position) > 0L ? 1 : ((this.position - cacheSpan.position) == 0L ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i < 0 ? -1 : 1;
    }
}
