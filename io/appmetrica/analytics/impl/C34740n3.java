package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.p726io.GZIPCompressor;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.n3 */
/* loaded from: classes9.dex */
public final class C34740n3 {

    /* renamed from: a */
    public final C34713m3 f94970a;

    /* renamed from: b */
    public final GZIPCompressor f94971b;

    public C34740n3() {
        this(new C34713m3(), new GZIPCompressor());
    }

    /* renamed from: a */
    public final byte[] m21314a(byte[] bArr) {
        try {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            C34713m3 c34713m3 = this.f94970a;
            byte[] bytes = "hBnBQbZrmjPXEWVJ".getBytes();
            c34713m3.getClass();
            AESEncrypter aESEncrypter = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bytes, copyOfRange);
            if (bArr != null && bArr.length != 0) {
                return this.f94971b.uncompress(aESEncrypter.decrypt(bArr, 16, bArr.length - 16));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C34740n3(C34713m3 c34713m3, GZIPCompressor gZIPCompressor) {
        this.f94970a = c34713m3;
        this.f94971b = gZIPCompressor;
    }
}
