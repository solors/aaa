package com.five_corp.p372ad.internal.http.movcache;

import com.five_corp.p372ad.internal.context.C13760i;
import com.five_corp.p372ad.internal.http.C13783a;
import com.five_corp.p372ad.internal.p373ad.C13627a;

/* renamed from: com.five_corp.ad.internal.http.movcache.j */
/* loaded from: classes4.dex */
public final class C13814j implements InterfaceC13813i {

    /* renamed from: a */
    public final C13783a f25746a;

    public C13814j(C13783a c13783a) {
        this.f25746a = c13783a;
    }

    @Override // com.five_corp.p372ad.internal.http.movcache.InterfaceC13813i
    /* renamed from: a */
    public final void mo78334a(int i, boolean z, C13817m c13817m, boolean z2) {
    }

    @Override // com.five_corp.p372ad.internal.http.movcache.InterfaceC13813i
    /* renamed from: d */
    public final boolean mo78330d() {
        C13627a c13627a;
        C13783a c13783a = this.f25746a;
        C13760i c13760i = (C13760i) c13783a.f25655b.get();
        if (c13760i != null) {
            c13627a = c13760i.f25591b;
        } else {
            c13627a = (C13627a) c13783a.f25654a.get();
        }
        if (c13627a != null && this.f25746a.m78375a()) {
            return !c13627a.m78471b();
        }
        return false;
    }

    @Override // com.five_corp.p372ad.internal.http.movcache.InterfaceC13813i
    /* renamed from: e */
    public final boolean mo78329e() {
        return this.f25746a.m78375a();
    }

    @Override // com.five_corp.p372ad.internal.http.movcache.InterfaceC13813i
    /* renamed from: a */
    public final void mo78333a(byte[] bArr, int i, int i2, int i3) {
    }

    @Override // com.five_corp.p372ad.internal.http.movcache.InterfaceC13813i
    /* renamed from: a */
    public final int mo78336a() {
        return this.f25746a.f25656c;
    }

    @Override // com.five_corp.p372ad.internal.http.movcache.InterfaceC13813i
    /* renamed from: a */
    public final boolean mo78335a(int i) {
        C13783a c13783a = this.f25746a;
        C13760i c13760i = (C13760i) c13783a.f25655b.get();
        C13627a c13627a = c13760i != null ? c13760i.f25591b : (C13627a) c13783a.f25654a.get();
        if (c13627a == null || !this.f25746a.m78375a()) {
            return false;
        }
        return !c13627a.m78471b() || ((long) i) < c13627a.f25190h.f25400b;
    }

    @Override // com.five_corp.p372ad.internal.http.movcache.InterfaceC13813i
    /* renamed from: b */
    public final void mo78332b() {
    }

    @Override // com.five_corp.p372ad.internal.http.movcache.InterfaceC13813i
    /* renamed from: c */
    public final void mo78331c() {
    }
}
