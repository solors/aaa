package com.five_corp.p372ad.internal.http;

import java.nio.charset.StandardCharsets;

/* renamed from: com.five_corp.ad.internal.http.c */
/* loaded from: classes4.dex */
public final class C13797c {

    /* renamed from: a */
    public final int f25710a;

    /* renamed from: b */
    public final String f25711b;

    /* renamed from: c */
    public final byte[] f25712c;

    public C13797c(int i, byte[] bArr, String str) {
        this.f25710a = i;
        this.f25711b = str;
        this.f25712c = bArr;
    }

    /* renamed from: a */
    public final String m78360a() {
        String str = this.f25711b;
        if (str != null) {
            return str;
        }
        byte[] bArr = this.f25712c;
        if (bArr != null) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
        return null;
    }
}
