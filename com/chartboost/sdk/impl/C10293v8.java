package com.chartboost.sdk.impl;

import java.io.FileDescriptor;
import java.io.RandomAccessFile;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.v8 */
/* loaded from: classes3.dex */
public final class C10293v8 {

    /* renamed from: a */
    public final RandomAccessFile f23385a;

    /* renamed from: b */
    public final FileDescriptor f23386b;

    public C10293v8(RandomAccessFile randomAccessFile) {
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.f23385a = randomAccessFile;
        FileDescriptor fd = randomAccessFile.getFD();
        Intrinsics.checkNotNullExpressionValue(fd, "getFD(...)");
        this.f23386b = fd;
    }

    /* renamed from: a */
    public final void m80249a() {
        this.f23385a.close();
    }

    /* renamed from: b */
    public final FileDescriptor m80248b() {
        return this.f23386b;
    }

    /* renamed from: c */
    public final long m80247c() {
        return this.f23385a.length();
    }
}
