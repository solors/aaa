package com.monetization.ads.exo.offline;

import com.yandex.mobile.ads.impl.C30937nf;
import com.yandex.mobile.ads.impl.b20;

/* renamed from: com.monetization.ads.exo.offline.b */
/* loaded from: classes7.dex */
public final class C25574b {

    /* renamed from: a */
    public final DownloadRequest f66375a;

    /* renamed from: b */
    public final int f66376b;

    /* renamed from: c */
    public final long f66377c;

    /* renamed from: d */
    public final long f66378d;

    /* renamed from: e */
    public final long f66379e;

    /* renamed from: f */
    public final int f66380f;

    /* renamed from: g */
    public final int f66381g;

    /* renamed from: h */
    final b20 f66382h;

    public C25574b(DownloadRequest downloadRequest, int i, long j, long j2, long j3, int i2, int i3, b20 b20Var) {
        boolean z;
        boolean z2;
        boolean z3;
        C30937nf.m31570a(b20Var);
        boolean z4 = true;
        if (i3 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i != 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        C30937nf.m31567a(z3);
        if (i2 != 0) {
            C30937nf.m31567a((i == 2 || i == 0) ? false : z4);
        }
        this.f66375a = downloadRequest;
        this.f66376b = i;
        this.f66377c = j;
        this.f66378d = j2;
        this.f66379e = j3;
        this.f66380f = i2;
        this.f66381g = i3;
        this.f66382h = b20Var;
    }
}
