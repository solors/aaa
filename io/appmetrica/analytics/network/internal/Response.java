package io.appmetrica.analytics.network.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.network.impl.AbstractC35118e;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class Response {

    /* renamed from: a */
    private final boolean f95844a;

    /* renamed from: b */
    private final int f95845b;

    /* renamed from: c */
    private final byte[] f95846c;

    /* renamed from: d */
    private final byte[] f95847d;

    /* renamed from: e */
    private final Map f95848e;

    /* renamed from: f */
    private final Throwable f95849f;

    public Response(@Nullable Throwable th) {
        this(false, 0, new byte[0], new byte[0], new HashMap(), th);
    }

    public int getCode() {
        return this.f95845b;
    }

    @NonNull
    public byte[] getErrorData() {
        return this.f95847d;
    }

    @Nullable
    public Throwable getException() {
        return this.f95849f;
    }

    @NonNull
    public Map<String, List<String>> getHeaders() {
        return this.f95848e;
    }

    @NonNull
    public byte[] getResponseData() {
        return this.f95846c;
    }

    public boolean isCompleted() {
        return this.f95844a;
    }

    public String toString() {
        return "Response{completed=" + this.f95844a + ", code=" + this.f95845b + ", responseDataLength=" + this.f95846c.length + ", errorDataLength=" + this.f95847d.length + ", headers=" + this.f95848e + ", exception=" + this.f95849f + '}';
    }

    public Response(boolean z, int i, @NonNull byte[] bArr, @NonNull byte[] bArr2, @Nullable Map<String, List<String>> map, @Nullable Throwable th) {
        Map m20661a;
        this.f95844a = z;
        this.f95845b = i;
        this.f95846c = bArr;
        this.f95847d = bArr2;
        if (map == null) {
            m20661a = Collections.emptyMap();
        } else {
            m20661a = AbstractC35118e.m20661a(map);
        }
        this.f95848e = m20661a;
        this.f95849f = th;
    }
}
