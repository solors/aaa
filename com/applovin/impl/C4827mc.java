package com.applovin.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.applovin.impl.mc */
/* loaded from: classes2.dex */
public final class C4827mc {

    /* renamed from: h */
    private static final AtomicLong f7934h = new AtomicLong();

    /* renamed from: a */
    public final long f7935a;

    /* renamed from: b */
    public final C4698k5 f7936b;

    /* renamed from: c */
    public final Uri f7937c;

    /* renamed from: d */
    public final Map f7938d;

    /* renamed from: e */
    public final long f7939e;

    /* renamed from: f */
    public final long f7940f;

    /* renamed from: g */
    public final long f7941g;

    public C4827mc(long j, C4698k5 c4698k5, long j2) {
        this(j, c4698k5, c4698k5.f7366a, Collections.emptyMap(), j2, 0L, 0L);
    }

    /* renamed from: a */
    public static long m97552a() {
        return f7934h.getAndIncrement();
    }

    public C4827mc(long j, C4698k5 c4698k5, Uri uri, Map map, long j2, long j3, long j4) {
        this.f7935a = j;
        this.f7936b = c4698k5;
        this.f7937c = uri;
        this.f7938d = map;
        this.f7939e = j2;
        this.f7940f = j3;
        this.f7941g = j4;
    }
}
