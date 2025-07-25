package com.inmobi.media;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.N1 */
/* loaded from: classes6.dex */
public final class C19028N1 {

    /* renamed from: a */
    public final int f47539a;

    /* renamed from: b */
    public final String f47540b;

    /* renamed from: c */
    public final Map f47541c;

    /* renamed from: d */
    public final boolean f47542d;

    /* renamed from: e */
    public final boolean f47543e;

    /* renamed from: f */
    public int f47544f;

    /* renamed from: g */
    public long f47545g;

    /* renamed from: h */
    public final long f47546h;

    /* renamed from: i */
    public final AtomicBoolean f47547i;

    public C19028N1(int i, String url, Map map, boolean z, boolean z2, int i2, long j, long j2) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f47539a = i;
        this.f47540b = url;
        this.f47541c = map;
        this.f47542d = z;
        this.f47543e = z2;
        this.f47544f = i2;
        this.f47545g = j;
        this.f47546h = j2;
        this.f47547i = new AtomicBoolean(false);
    }

    public /* synthetic */ C19028N1(String str, Map map, boolean z, boolean z2, int i, int i2) {
        this(new Random().nextInt() & Integer.MAX_VALUE, str, (i2 & 4) != 0 ? null : map, z, z2, i, System.currentTimeMillis(), System.currentTimeMillis());
    }
}
