package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.google.common.primitives.UnsignedBytes;
import com.monetization.ads.exo.metadata.Metadata;
import com.monetization.ads.exo.metadata.flac.PictureFrame;
import com.yandex.mobile.ads.impl.v90;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class m90 {

    /* renamed from: a */
    public final int f82084a;

    /* renamed from: b */
    public final int f82085b;

    /* renamed from: c */
    public final int f82086c;

    /* renamed from: d */
    public final int f82087d;

    /* renamed from: e */
    public final int f82088e;

    /* renamed from: f */
    public final int f82089f;

    /* renamed from: g */
    public final int f82090g;

    /* renamed from: h */
    public final int f82091h;

    /* renamed from: i */
    public final int f82092i;

    /* renamed from: j */
    public final long f82093j;
    @Nullable

    /* renamed from: k */
    public final C30835a f82094k;
    @Nullable

    /* renamed from: l */
    private final Metadata f82095l;

    /* renamed from: com.yandex.mobile.ads.impl.m90$a */
    /* loaded from: classes8.dex */
    public static class C30835a {

        /* renamed from: a */
        public final long[] f82096a;

        /* renamed from: b */
        public final long[] f82097b;

        public C30835a(long[] jArr, long[] jArr2) {
            this.f82096a = jArr;
            this.f82097b = jArr2;
        }
    }

    private m90(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, @Nullable C30835a c30835a, @Nullable Metadata metadata) {
        this.f82084a = i;
        this.f82085b = i2;
        this.f82086c = i3;
        this.f82087d = i4;
        this.f82088e = i5;
        this.f82089f = m32069b(i5);
        this.f82090g = i6;
        this.f82091h = i7;
        this.f82092i = m32075a(i7);
        this.f82093j = j;
        this.f82094k = c30835a;
        this.f82095l = metadata;
    }

    /* renamed from: a */
    private static int m32075a(int i) {
        if (i != 8) {
            if (i != 12) {
                if (i != 16) {
                    if (i != 20) {
                        return i != 24 ? -1 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: b */
    private static int m32069b(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    /* renamed from: a */
    public final m90 m32072a(List<PictureFrame> list) {
        Metadata metadata = new Metadata(list);
        Metadata metadata2 = this.f82095l;
        if (metadata2 != null) {
            metadata = metadata2.m44382a(metadata);
        }
        return new m90(this.f82084a, this.f82085b, this.f82086c, this.f82087d, this.f82088e, this.f82090g, this.f82091h, this.f82093j, this.f82094k, metadata);
    }

    /* renamed from: b */
    public final m90 m32068b(List<String> list) {
        Metadata m32574a = kd2.m32574a(list);
        Metadata metadata = this.f82095l;
        if (metadata != null) {
            m32574a = metadata.m44382a(m32574a);
        }
        return new m90(this.f82084a, this.f82085b, this.f82086c, this.f82087d, this.f82088e, this.f82090g, this.f82091h, this.f82093j, this.f82094k, m32574a);
    }

    /* renamed from: a */
    public final long m32076a() {
        long j;
        long j2;
        int i = this.f82087d;
        if (i > 0) {
            j = (i + this.f82086c) / 2;
            j2 = 1;
        } else {
            int i2 = this.f82084a;
            j = ((((i2 != this.f82085b || i2 <= 0) ? 4096L : i2) * this.f82090g) * this.f82091h) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    /* renamed from: b */
    public final long m32070b() {
        long j = this.f82093j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.f82088e;
    }

    /* renamed from: a */
    public final v90 m32071a(byte[] bArr, @Nullable Metadata metadata) {
        bArr[4] = UnsignedBytes.MAX_POWER_OF_TWO;
        int i = this.f82087d;
        if (i <= 0) {
            i = -1;
        }
        Metadata metadata2 = this.f82095l;
        if (metadata2 != null) {
            metadata = metadata2.m44382a(metadata);
        }
        return new v90.C31640a().m28426e("audio/flac").m28418h(i).m28436c(this.f82090g).m28409l(this.f82088e).m28445a(Collections.singletonList(bArr)).m28449a(metadata).m28454a();
    }

    public m90(int i, byte[] bArr) {
        bc1 bc1Var = new bc1(bArr);
        bc1Var.m35499c(i * 8);
        this.f82084a = bc1Var.m35502b(16);
        this.f82085b = bc1Var.m35502b(16);
        this.f82086c = bc1Var.m35502b(24);
        this.f82087d = bc1Var.m35502b(24);
        int m35502b = bc1Var.m35502b(20);
        this.f82088e = m35502b;
        this.f82089f = m32069b(m35502b);
        this.f82090g = bc1Var.m35502b(3) + 1;
        int m35502b2 = bc1Var.m35502b(5) + 1;
        this.f82091h = m35502b2;
        this.f82092i = m32075a(m35502b2);
        this.f82093j = bc1Var.m35493g();
        this.f82094k = null;
        this.f82095l = null;
    }

    /* renamed from: a */
    public final long m32074a(long j) {
        int i = y32.f88010a;
        return Math.max(0L, Math.min((j * this.f82088e) / 1000000, this.f82093j - 1));
    }

    /* renamed from: a */
    public final m90 m32073a(@Nullable C30835a c30835a) {
        return new m90(this.f82084a, this.f82085b, this.f82086c, this.f82087d, this.f82088e, this.f82090g, this.f82091h, this.f82093j, c30835a, this.f82095l);
    }
}
