package com.yandex.mobile.ads.impl;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.monetization.ads.exo.metadata.Metadata;
import com.monetization.ads.exo.metadata.flac.PictureFrame;
import com.monetization.ads.exo.metadata.vorbis.VorbisComment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class kd2 {

    /* renamed from: com.yandex.mobile.ads.impl.kd2$a */
    /* loaded from: classes8.dex */
    public static final class C30720a {

        /* renamed from: a */
        public final String[] f81395a;

        public C30720a(String[] strArr) {
            this.f81395a = strArr;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kd2$b */
    /* loaded from: classes8.dex */
    public static final class C30721b {

        /* renamed from: a */
        public final boolean f81396a;

        public C30721b(boolean z) {
            this.f81396a = z;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.kd2$c */
    /* loaded from: classes8.dex */
    public static final class C30722c {

        /* renamed from: a */
        public final int f81397a;

        /* renamed from: b */
        public final int f81398b;

        /* renamed from: c */
        public final int f81399c;

        /* renamed from: d */
        public final int f81400d;

        /* renamed from: e */
        public final int f81401e;

        /* renamed from: f */
        public final int f81402f;

        /* renamed from: g */
        public final byte[] f81403g;

        public C30722c(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
            this.f81397a = i;
            this.f81398b = i2;
            this.f81399c = i3;
            this.f81400d = i4;
            this.f81401e = i5;
            this.f81402f = i6;
            this.f81403g = bArr;
        }
    }

    /* renamed from: a */
    public static C30720a m32575a(cc1 cc1Var, boolean z, boolean z2) throws gc1 {
        if (z) {
            m32577a(3, cc1Var, false);
        }
        cc1Var.m35297a((int) cc1Var.m35276n(), C30572in.f80564c);
        long m35276n = cc1Var.m35276n();
        String[] strArr = new String[(int) m35276n];
        for (int i = 0; i < m35276n; i++) {
            strArr[i] = cc1Var.m35297a((int) cc1Var.m35276n(), C30572in.f80564c);
        }
        if (z2 && (cc1Var.m35270t() & 1) == 0) {
            throw gc1.m33885a("framing bit expected to be set", (Exception) null);
        }
        return new C30720a(strArr);
    }

    /* renamed from: a */
    public static C30722c m32576a(cc1 cc1Var) throws gc1 {
        m32577a(1, cc1Var, false);
        int m35279k = cc1Var.m35279k();
        if (m35279k >= 0) {
            int m35270t = cc1Var.m35270t();
            int m35279k2 = cc1Var.m35279k();
            if (m35279k2 >= 0) {
                int m35279k3 = cc1Var.m35279k();
                int i = m35279k3 <= 0 ? -1 : m35279k3;
                int m35279k4 = cc1Var.m35279k();
                int i2 = m35279k4 <= 0 ? -1 : m35279k4;
                cc1Var.m35279k();
                int m35270t2 = cc1Var.m35270t();
                cc1Var.m35270t();
                return new C30722c(m35270t, m35279k2, i, i2, (int) Math.pow(2.0d, m35270t2 & 15), (int) Math.pow(2.0d, (m35270t2 & 240) >> 4), Arrays.copyOf(cc1Var.m35291c(), cc1Var.m35287e()));
            }
            throw new IllegalStateException(C31736wd.m27978a("Top bit not zero: ", m35279k2));
        }
        throw new IllegalStateException(C31736wd.m27978a("Top bit not zero: ", m35279k));
    }

    /* renamed from: a */
    public static boolean m32577a(int i, cc1 cc1Var, boolean z) throws gc1 {
        if (cc1Var.m35299a() < 7) {
            if (z) {
                return false;
            }
            throw gc1.m33885a("too short header: " + cc1Var.m35299a(), (Exception) null);
        } else if (cc1Var.m35270t() != i) {
            if (z) {
                return false;
            }
            throw gc1.m33885a("expected header type " + Integer.toHexString(i), (Exception) null);
        } else if (cc1Var.m35270t() == 118 && cc1Var.m35270t() == 111 && cc1Var.m35270t() == 114 && cc1Var.m35270t() == 98 && cc1Var.m35270t() == 105 && cc1Var.m35270t() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw gc1.m33885a("expected characters 'vorbis'", (Exception) null);
        }
    }

    @Nullable
    /* renamed from: a */
    public static Metadata m32574a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            int i2 = y32.f88010a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                gq0.m33792d("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    cc1 cc1Var = new cc1(Base64.decode(split[1], 0));
                    int m35282h = cc1Var.m35282h();
                    String m35297a = cc1Var.m35297a(cc1Var.m35282h(), C30572in.f80562a);
                    String m35297a2 = cc1Var.m35297a(cc1Var.m35282h(), C30572in.f80564c);
                    int m35282h2 = cc1Var.m35282h();
                    int m35282h3 = cc1Var.m35282h();
                    int m35282h4 = cc1Var.m35282h();
                    int m35282h5 = cc1Var.m35282h();
                    int m35282h6 = cc1Var.m35282h();
                    byte[] bArr = new byte[m35282h6];
                    cc1Var.m35294a(bArr, 0, m35282h6);
                    arrayList.add(new PictureFrame(m35282h, m35297a, m35297a2, m35282h2, m35282h3, m35282h4, m35282h5, bArr));
                } catch (RuntimeException e) {
                    gq0.m33794b("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new VorbisComment(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }
}
