package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class jf0 {

    /* renamed from: a */
    private final int f80890a;

    /* renamed from: b */
    private final List<tc0> f80891b;

    /* renamed from: c */
    private final int f80892c;
    @Nullable

    /* renamed from: d */
    private final InputStream f80893d;
    @Nullable

    /* renamed from: e */
    private final byte[] f80894e;

    public jf0(int i, ArrayList arrayList, int i2, InputStream inputStream) {
        this.f80890a = i;
        this.f80891b = arrayList;
        this.f80892c = i2;
        this.f80893d = inputStream;
        this.f80894e = null;
    }

    @Nullable
    /* renamed from: a */
    public final InputStream m32937a() {
        InputStream inputStream = this.f80893d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f80894e != null) {
            return new ByteArrayInputStream(this.f80894e);
        }
        return null;
    }

    /* renamed from: b */
    public final int m32936b() {
        return this.f80892c;
    }

    /* renamed from: c */
    public final List<tc0> m32935c() {
        return Collections.unmodifiableList(this.f80891b);
    }

    /* renamed from: d */
    public final int m32934d() {
        return this.f80890a;
    }

    public jf0(int i, ArrayList arrayList, byte[] bArr) {
        this.f80890a = i;
        this.f80891b = arrayList;
        this.f80892c = bArr.length;
        this.f80894e = bArr;
        this.f80893d = null;
    }
}
