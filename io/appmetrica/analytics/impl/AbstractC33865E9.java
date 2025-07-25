package io.appmetrica.analytics.impl;

import kotlin.text.Charsets;

/* renamed from: io.appmetrica.analytics.impl.E9 */
/* loaded from: classes9.dex */
public abstract class AbstractC33865E9 {
    /* renamed from: a */
    public static final C35035y9 m22675a(int i, String str) {
        byte[] bArr;
        C35035y9 c35035y9 = new C35035y9();
        c35035y9.f95653a = i;
        if (str == null || (bArr = str.getBytes(Charsets.UTF_8)) == null) {
            bArr = c35035y9.f95654b;
        }
        c35035y9.f95654b = bArr;
        return c35035y9;
    }
}
