package com.inmobi.media;

import java.io.Closeable;
import java.io.InputStream;

/* renamed from: com.inmobi.media.h3 */
/* loaded from: classes6.dex */
public final class C19296h3 implements Closeable {

    /* renamed from: a */
    public final InputStream[] f48286a;

    public C19296h3(InputStream[] inputStreamArr) {
        this.f48286a = inputStreamArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (InputStream inputStream : this.f48286a) {
            AbstractC19128Ub.m60638a(inputStream);
        }
    }
}
