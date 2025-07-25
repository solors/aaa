package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.URLDecoder;

/* renamed from: com.yandex.mobile.ads.impl.hu */
/* loaded from: classes8.dex */
public final class C30500hu extends AbstractC30731kj {
    @Nullable

    /* renamed from: e */
    private C30976nu f80182e;
    @Nullable

    /* renamed from: f */
    private byte[] f80183f;

    /* renamed from: g */
    private int f80184g;

    /* renamed from: h */
    private int f80185h;

    public C30500hu() {
        super(false);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    /* renamed from: a */
    public final long mo27541a(C30976nu c30976nu) throws IOException {
        m32537b(c30976nu);
        this.f80182e = c30976nu;
        Uri uri = c30976nu.f83111a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        C30937nf.m31568a("Unsupported scheme: " + scheme, equals);
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        int i = y32.f88010a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f80183f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw gc1.m33884a("Error while parsing Base64 encoded string: " + str, e);
                }
            } else {
                this.f80183f = y32.m27052c(URLDecoder.decode(str, C30572in.f80562a.name()));
            }
            long j = c30976nu.f83116f;
            byte[] bArr = this.f80183f;
            if (j <= bArr.length) {
                int i2 = (int) j;
                this.f80184g = i2;
                int length = bArr.length - i2;
                this.f80185h = length;
                long j2 = c30976nu.f83117g;
                if (j2 != -1) {
                    this.f80185h = (int) Math.min(length, j2);
                }
                m32535c(c30976nu);
                long j3 = c30976nu.f83117g;
                if (j3 == -1) {
                    return this.f80185h;
                }
                return j3;
            }
            this.f80183f = null;
            throw new C30748ku(2008);
        }
        throw gc1.m33884a("Unexpected URI format: " + uri, (IllegalArgumentException) null);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    public final void close() {
        if (this.f80183f != null) {
            this.f80183f = null;
            m32534e();
        }
        this.f80182e = null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    @Nullable
    public final Uri getUri() {
        C30976nu c30976nu = this.f80182e;
        if (c30976nu != null) {
            return c30976nu.f83111a;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30417gu
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f80185h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.f80183f;
        int i4 = y32.f88010a;
        System.arraycopy(bArr2, this.f80184g, bArr, i, min);
        this.f80184g += min;
        this.f80185h -= min;
        m32536c(min);
        return min;
    }
}
