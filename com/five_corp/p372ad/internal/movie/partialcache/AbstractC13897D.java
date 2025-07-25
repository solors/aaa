package com.five_corp.p372ad.internal.movie.partialcache;

import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.util.C14115c;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.D */
/* loaded from: classes4.dex */
public abstract class AbstractC13897D {

    /* renamed from: e */
    public static final byte[] f25959e;

    /* renamed from: a */
    public long f25960a;

    /* renamed from: b */
    public byte[] f25961b = new byte[4];

    /* renamed from: c */
    public final ArrayList f25962c = new ArrayList();

    /* renamed from: d */
    public int f25963d = 0;

    static {
        HashMap hashMap = AbstractC13984j1.f26058a;
        f25959e = CommonUrlParts.UUID.getBytes();
    }

    /* renamed from: a */
    public final long m78218a(C14115c c14115c) {
        return (this.f25963d + this.f25960a) - c14115c.f26743h;
    }

    /* renamed from: a */
    public final void m78217a(C14115c c14115c, int i, C13836a c13836a) {
        while (c14115c.f26743h < i) {
            HashMap hashMap = AbstractC13984j1.f26058a;
            try {
                int m78090b = c14115c.m78090b();
                long j = m78090b < 0 ? m78090b + 4294967296L : m78090b;
                byte[] bArr = new byte[4];
                int i2 = 16;
                byte[] bArr2 = new byte[16];
                c14115c.m78092a(bArr);
                if (j == 1) {
                    j = c14115c.m78088c();
                } else if (j == 0) {
                    throw new RuntimeException("Box size = 0 is defined in ISO specification, but we do not support");
                } else {
                    i2 = 8;
                }
                long j2 = j;
                if (Arrays.equals(bArr, f25959e)) {
                    c14115c.m78092a(bArr2);
                    i2 += 16;
                }
                AbstractC13897D m78195a = AbstractC13984j1.m78195a(c14115c, j2, bArr, bArr2, i2, c13836a);
                if (m78195a != null) {
                    this.f25962c.add(m78195a);
                }
            } catch (BufferUnderflowException e) {
                throw new C14050y0("buffer is insufficient", e);
            }
        }
    }

    /* renamed from: a */
    public void mo78156a(C14115c c14115c, C13836a c13836a) {
        if (!Arrays.equals(this.f25961b, (byte[]) AbstractC13984j1.f26058a.get(getClass()))) {
            throw new C14050y0("Box type mismatch");
        }
    }
}
