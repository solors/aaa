package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class ux1 implements InterfaceC30672ju {

    /* renamed from: a */
    private final InterfaceC30672ju f86450a;

    /* renamed from: b */
    private long f86451b;

    /* renamed from: c */
    private Uri f86452c = Uri.EMPTY;

    public ux1(InterfaceC30672ju interfaceC30672ju) {
        this.f86450a = (InterfaceC30672ju) C30937nf.m31570a(interfaceC30672ju);
        Collections.emptyMap();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    /* renamed from: a */
    public final void mo28290a(y12 y12Var) {
        y12Var.getClass();
        this.f86450a.mo28290a(y12Var);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    public final void close() throws IOException {
        this.f86450a.close();
    }

    /* renamed from: e */
    public final long m28603e() {
        return this.f86451b;
    }

    /* renamed from: f */
    public final Uri m28602f() {
        return this.f86452c;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    public final Map<String, List<String>> getResponseHeaders() {
        return this.f86450a.getResponseHeaders();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    @Nullable
    public final Uri getUri() {
        return this.f86450a.getUri();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30417gu
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f86450a.read(bArr, i, i2);
        if (read != -1) {
            this.f86451b += read;
        }
        return read;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    /* renamed from: a */
    public final long mo27541a(C30976nu c30976nu) throws IOException {
        this.f86452c = c30976nu.f83111a;
        Collections.emptyMap();
        long mo27541a = this.f86450a.mo27541a(c30976nu);
        Uri uri = this.f86450a.getUri();
        uri.getClass();
        this.f86452c = uri;
        this.f86450a.getResponseHeaders();
        return mo27541a;
    }
}
