package com.five_corp.p372ad.internal.movie.partialcache.mediacodec;

import java.nio.ByteBuffer;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.mediacodec.a */
/* loaded from: classes4.dex */
public final class C13994a {

    /* renamed from: a */
    public final int f26088a;

    /* renamed from: b */
    public final ByteBuffer f26089b;

    public C13994a(int i, ByteBuffer byteBuffer) {
        this.f26088a = i;
        this.f26089b = byteBuffer;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C13994a) || this.f26088a != ((C13994a) obj).f26088a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f26088a;
    }
}
