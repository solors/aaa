package com.five_corp.p372ad.internal.bgtask;

import com.five_corp.p372ad.internal.http.C13797c;
import com.five_corp.p372ad.internal.http.C13804d;
import com.five_corp.p372ad.internal.util.C14118f;

/* renamed from: com.five_corp.ad.internal.bgtask.k */
/* loaded from: classes4.dex */
public final class C13724k extends AbstractC13726m {

    /* renamed from: c */
    public final String f25496c;

    /* renamed from: d */
    public final C13804d f25497d;

    public C13724k(String str, C13804d c13804d) {
        super(2);
        this.f25496c = str;
        this.f25497d = c13804d;
    }

    @Override // com.five_corp.p372ad.internal.bgtask.AbstractC13726m
    /* renamed from: b */
    public final boolean mo78312b() {
        C14118f m78343a = this.f25497d.m78343a(this.f25496c, "GET", null, null);
        if (!m78343a.f26746a || ((C13797c) m78343a.f26748c).f25710a != 200) {
            return false;
        }
        return true;
    }
}
