package com.yandex.mobile.ads.impl;

import android.media.metrics.LogSessionId;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes8.dex */
public final class le1 {
    @Nullable

    /* renamed from: a */
    private final C30783a f81782a;

    @RequiresApi(31)
    /* renamed from: com.yandex.mobile.ads.impl.le1$a */
    /* loaded from: classes8.dex */
    private static final class C30783a {

        /* renamed from: b */
        public static final /* synthetic */ int f81783b = 0;

        /* renamed from: a */
        public final LogSessionId f81784a;

        static {
            LogSessionId unused;
            unused = LogSessionId.LOG_SESSION_ID_NONE;
        }

        public C30783a(LogSessionId logSessionId) {
            this.f81784a = logSessionId;
        }
    }

    static {
        if (y32.f88010a < 31) {
            new le1();
        } else {
            int i = C30783a.f81783b;
        }
    }

    public le1() {
        this((C30783a) null);
        C30937nf.m31566b(y32.f88010a < 31);
    }

    @RequiresApi(31)
    /* renamed from: a */
    public final LogSessionId m32282a() {
        C30783a c30783a = this.f81782a;
        c30783a.getClass();
        return c30783a.f81784a;
    }

    @RequiresApi(31)
    public le1(LogSessionId logSessionId) {
        this(new C30783a(logSessionId));
    }

    private le1(@Nullable C30783a c30783a) {
        this.f81782a = c30783a;
    }
}
