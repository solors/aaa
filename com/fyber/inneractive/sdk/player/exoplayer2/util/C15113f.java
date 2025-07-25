package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.f */
/* loaded from: classes4.dex */
public final class C15113f {

    /* renamed from: a */
    public final int f29778a;

    /* renamed from: b */
    public final int f29779b;

    /* renamed from: c */
    public final int f29780c;

    /* renamed from: d */
    public final long f29781d;

    public C15113f(byte[] bArr) {
        C15120m c15120m = new C15120m(bArr);
        c15120m.m77209b(136);
        c15120m.m77211a(16);
        c15120m.m77211a(16);
        c15120m.m77211a(24);
        c15120m.m77211a(24);
        this.f29778a = c15120m.m77211a(20);
        this.f29779b = c15120m.m77211a(3) + 1;
        this.f29780c = c15120m.m77211a(5) + 1;
        this.f29781d = ((c15120m.m77211a(4) & 15) << 32) | (c15120m.m77211a(32) & 4294967295L);
    }
}
