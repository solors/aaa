package com.yandex.mobile.ads.impl;

import androidx.core.view.InputDeviceCompat;
import com.yandex.mobile.ads.impl.k22;

/* loaded from: classes8.dex */
public final class os1 implements k22 {

    /* renamed from: a */
    private final ns1 f83590a;

    /* renamed from: b */
    private final cc1 f83591b = new cc1(32);

    /* renamed from: c */
    private int f83592c;

    /* renamed from: d */
    private int f83593d;

    /* renamed from: e */
    private boolean f83594e;

    /* renamed from: f */
    private boolean f83595f;

    public os1(ns1 ns1Var) {
        this.f83590a = ns1Var;
    }

    @Override // com.yandex.mobile.ads.impl.k22
    /* renamed from: a */
    public final void mo27576a(int i, cc1 cc1Var) {
        boolean z = (i & 1) != 0;
        int m35289d = z ? cc1Var.m35289d() + cc1Var.m35270t() : -1;
        if (this.f83595f) {
            if (!z) {
                return;
            }
            this.f83595f = false;
            cc1Var.m35286e(m35289d);
            this.f83593d = 0;
        }
        while (cc1Var.m35299a() > 0) {
            int i2 = this.f83593d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int m35270t = cc1Var.m35270t();
                    cc1Var.m35286e(cc1Var.m35289d() - 1);
                    if (m35270t == 255) {
                        this.f83595f = true;
                        return;
                    }
                }
                int min = Math.min(cc1Var.m35299a(), 3 - this.f83593d);
                cc1Var.m35294a(this.f83591b.m35291c(), this.f83593d, min);
                int i3 = this.f83593d + min;
                this.f83593d = i3;
                if (i3 == 3) {
                    this.f83591b.m35286e(0);
                    this.f83591b.m35288d(3);
                    this.f83591b.m35284f(1);
                    int m35270t2 = this.f83591b.m35270t();
                    int m35270t3 = this.f83591b.m35270t();
                    this.f83594e = (m35270t2 & 128) != 0;
                    this.f83592c = (((m35270t2 & 15) << 8) | m35270t3) + 3;
                    int m35293b = this.f83591b.m35293b();
                    int i4 = this.f83592c;
                    if (m35293b < i4) {
                        this.f83591b.m35298a(Math.min((int) InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i4, this.f83591b.m35293b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(cc1Var.m35299a(), this.f83592c - this.f83593d);
                cc1Var.m35294a(this.f83591b.m35291c(), this.f83593d, min2);
                int i5 = this.f83593d + min2;
                this.f83593d = i5;
                int i6 = this.f83592c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.f83594e) {
                        if (y32.m27091a(this.f83592c, this.f83591b.m35291c()) != 0) {
                            this.f83595f = true;
                            return;
                        }
                        this.f83591b.m35288d(this.f83592c - 4);
                    } else {
                        this.f83591b.m35288d(i6);
                    }
                    this.f83591b.m35286e(0);
                    this.f83590a.mo31319a(this.f83591b);
                    this.f83593d = 0;
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.k22
    /* renamed from: a */
    public final void mo27574a(n02 n02Var, p50 p50Var, k22.C30694d c30694d) {
        this.f83590a.mo31318a(n02Var, p50Var, c30694d);
        this.f83595f = true;
    }

    @Override // com.yandex.mobile.ads.impl.k22
    /* renamed from: a */
    public final void mo27577a() {
        this.f83595f = true;
    }
}
