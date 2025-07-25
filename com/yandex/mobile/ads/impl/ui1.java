package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class ui1 {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.ui1$a */
    /* loaded from: classes8.dex */
    public static class C31589a {

        /* renamed from: a */
        private final UUID f86288a;

        /* renamed from: b */
        private final int f86289b;

        /* renamed from: c */
        private final byte[] f86290c;

        public C31589a(UUID uuid, int i, byte[] bArr) {
            this.f86288a = uuid;
            this.f86289b = i;
            this.f86290c = bArr;
        }
    }

    /* renamed from: a */
    public static boolean m28765a(byte[] bArr) {
        return m28764b(bArr) != null;
    }

    @Nullable
    /* renamed from: b */
    private static C31589a m28764b(byte[] bArr) {
        cc1 cc1Var = new cc1(bArr);
        if (cc1Var.m35287e() < 32) {
            return null;
        }
        cc1Var.m35286e(0);
        if (cc1Var.m35282h() != cc1Var.m35299a() + 4 || cc1Var.m35282h() != 1886614376) {
            return null;
        }
        int m35282h = (cc1Var.m35282h() >> 24) & 255;
        if (m35282h > 1) {
            zo0.m26074a("Unsupported pssh version: ", m35282h, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(cc1Var.m35274p(), cc1Var.m35274p());
        if (m35282h == 1) {
            cc1Var.m35284f(cc1Var.m35266x() * 16);
        }
        int m35266x = cc1Var.m35266x();
        if (m35266x != cc1Var.m35299a()) {
            return null;
        }
        byte[] bArr2 = new byte[m35266x];
        cc1Var.m35294a(bArr2, 0, m35266x);
        return new C31589a(uuid, m35282h, bArr2);
    }

    @Nullable
    /* renamed from: c */
    public static UUID m28763c(byte[] bArr) {
        C31589a m28764b = m28764b(bArr);
        if (m28764b != null) {
            return m28764b.f86288a;
        }
        return null;
    }

    /* renamed from: d */
    public static int m28762d(byte[] bArr) {
        C31589a m28764b = m28764b(bArr);
        if (m28764b != null) {
            return m28764b.f86289b;
        }
        return -1;
    }

    @Nullable
    /* renamed from: a */
    public static byte[] m28766a(UUID uuid, byte[] bArr) {
        C31589a m28764b = m28764b(bArr);
        if (m28764b == null) {
            return null;
        }
        if (uuid.equals(m28764b.f86288a)) {
            return m28764b.f86290c;
        }
        gq0.m33792d("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + m28764b.f86288a + ".");
        return null;
    }
}
