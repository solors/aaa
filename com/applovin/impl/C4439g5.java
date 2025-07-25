package com.applovin.impl;

import android.net.Uri;
import android.util.Base64;
import com.applovin.exoplayer2.common.base.Charsets;
import java.net.URLDecoder;

/* renamed from: com.applovin.impl.g5 */
/* loaded from: classes2.dex */
public final class C4439g5 extends AbstractC3982a2 {

    /* renamed from: e */
    private C4698k5 f6294e;

    /* renamed from: f */
    private byte[] f6295f;

    /* renamed from: g */
    private int f6296g;

    /* renamed from: h */
    private int f6297h;

    public C4439g5() {
        super(false);
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: a */
    public long mo94273a(C4698k5 c4698k5) {
        m101076b(c4698k5);
        this.f6294e = c4698k5;
        Uri uri = c4698k5.f7366a;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        AbstractC4100b1.m100579a(equals, "Unsupported scheme: " + scheme);
        String[] m93013a = AbstractC5863xp.m93013a(uri.getSchemeSpecificPart(), ",");
        if (m93013a.length == 2) {
            String str = m93013a[1];
            if (m93013a[0].contains(";base64")) {
                try {
                    this.f6295f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw C4187ch.m100187b("Error while parsing Base64 encoded string: " + str, e);
                }
            } else {
                this.f6295f = AbstractC5863xp.m92971c(URLDecoder.decode(str, Charsets.US_ASCII.name()));
            }
            long j = c4698k5.f7372g;
            byte[] bArr = this.f6295f;
            if (j <= bArr.length) {
                int i = (int) j;
                this.f6296g = i;
                int length = bArr.length - i;
                this.f6297h = length;
                long j2 = c4698k5.f7373h;
                if (j2 != -1) {
                    this.f6297h = (int) Math.min(length, j2);
                }
                m101075c(c4698k5);
                long j3 = c4698k5.f7373h;
                return j3 != -1 ? j3 : this.f6297h;
            }
            this.f6295f = null;
            throw new C4567i5(2008);
        }
        throw C4187ch.m100187b("Unexpected URI format: " + uri, null);
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: c */
    public Uri mo94270c() {
        C4698k5 c4698k5 = this.f6294e;
        if (c4698k5 != null) {
            return c4698k5.f7366a;
        }
        return null;
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    public void close() {
        if (this.f6295f != null) {
            this.f6295f = null;
            m101073g();
        }
        this.f6294e = null;
    }

    @Override // com.applovin.impl.InterfaceC4379f5
    /* renamed from: a */
    public int mo94271a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f6297h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(AbstractC5863xp.m93017a((Object) this.f6295f), this.f6296g, bArr, i, min);
        this.f6296g += min;
        this.f6297h -= min;
        m101074d(min);
        return min;
    }
}
