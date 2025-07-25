package com.yandex.mobile.ads.impl;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;
import okio.C39200e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public abstract class qm1 implements Closeable {

    /* renamed from: com.yandex.mobile.ads.impl.qm1$a */
    /* loaded from: classes8.dex */
    public static final class C31222a {
        private C31222a() {
        }

        /* renamed from: a */
        public static pm1 m30261a(byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            C39200e write = new C39200e().write(bArr);
            Intrinsics.checkNotNullParameter(write, "<this>");
            return new pm1(bArr.length, null, write);
        }

        public /* synthetic */ C31222a(int i) {
            this();
        }
    }

    /* renamed from: a */
    public abstract long mo28297a();

    @Nullable
    /* renamed from: b */
    public abstract cu0 mo28296b();

    @NotNull
    /* renamed from: c */
    public abstract BufferedSource mo28295c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z32.m26419a((Closeable) mo28295c());
    }
}
