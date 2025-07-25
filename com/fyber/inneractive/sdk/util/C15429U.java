package com.fyber.inneractive.sdk.util;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.fyber.inneractive.sdk.util.U */
/* loaded from: classes4.dex */
public final class C15429U extends BufferedInputStream {

    /* renamed from: a */
    public final /* synthetic */ AtomicInteger f30574a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15429U(InputStream inputStream, AtomicInteger atomicInteger) {
        super(inputStream);
        this.f30574a = atomicInteger;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int read;
        read = super.read(bArr, i, i2);
        if (read != -1) {
            this.f30574a.getAndAdd(read);
        }
        return read;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        this.f30574a.set(0);
        super.reset();
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        long skip;
        skip = super.skip(j);
        this.f30574a.addAndGet((int) skip);
        return skip;
    }
}
