package com.five_corp.p372ad.internal.exception;

import com.five_corp.p372ad.internal.EnumC14106t;

/* renamed from: com.five_corp.ad.internal.exception.b */
/* loaded from: classes4.dex */
public class C13772b extends Exception {

    /* renamed from: a */
    public final EnumC14106t f25630a;

    public C13772b(EnumC14106t enumC14106t, String str) {
        super(str, null);
        this.f25630a = enumC14106t;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String th;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(this.f25630a.toString());
        if (getCause() == null) {
            th = "";
        } else {
            th = getCause().toString();
        }
        sb2.append(th);
        return sb2.toString();
    }
}
