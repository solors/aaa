package com.applovin.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.applovin.impl.fl */
/* loaded from: classes2.dex */
public final class C4400fl implements InterfaceC4509h5 {

    /* renamed from: a */
    private final InterfaceC4509h5 f6134a;

    /* renamed from: b */
    private long f6135b;

    /* renamed from: c */
    private Uri f6136c = Uri.EMPTY;

    /* renamed from: d */
    private Map f6137d = Collections.emptyMap();

    public C4400fl(InterfaceC4509h5 interfaceC4509h5) {
        this.f6134a = (InterfaceC4509h5) AbstractC4100b1.m100583a(interfaceC4509h5);
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: a */
    public void mo94272a(InterfaceC5862xo interfaceC5862xo) {
        AbstractC4100b1.m100583a(interfaceC5862xo);
        this.f6134a.mo94272a(interfaceC5862xo);
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: c */
    public Uri mo94270c() {
        return this.f6134a.mo94270c();
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    public void close() {
        this.f6134a.close();
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: e */
    public Map mo94269e() {
        return this.f6134a.mo94269e();
    }

    /* renamed from: g */
    public long m99148g() {
        return this.f6135b;
    }

    /* renamed from: h */
    public Uri m99147h() {
        return this.f6136c;
    }

    /* renamed from: i */
    public Map m99146i() {
        return this.f6137d;
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: a */
    public long mo94273a(C4698k5 c4698k5) {
        this.f6136c = c4698k5.f7366a;
        this.f6137d = Collections.emptyMap();
        long mo94273a = this.f6134a.mo94273a(c4698k5);
        this.f6136c = (Uri) AbstractC4100b1.m100583a(mo94270c());
        this.f6137d = mo94269e();
        return mo94273a;
    }

    @Override // com.applovin.impl.InterfaceC4379f5
    /* renamed from: a */
    public int mo94271a(byte[] bArr, int i, int i2) {
        int mo94271a = this.f6134a.mo94271a(bArr, i, i2);
        if (mo94271a != -1) {
            this.f6135b += mo94271a;
        }
        return mo94271a;
    }
}
