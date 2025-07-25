package io.bidmachine.analytics.internal;

import java.security.SecureRandom;

/* renamed from: io.bidmachine.analytics.internal.Y */
/* loaded from: classes9.dex */
public final class C35576Y {

    /* renamed from: a */
    public static final C35576Y f96391a = new C35576Y();

    /* renamed from: b */
    private static final ThreadLocal f96392b = new C35577a();

    /* renamed from: io.bidmachine.analytics.internal.Y$a */
    /* loaded from: classes9.dex */
    public static final class C35577a extends ThreadLocal {
        C35577a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public SecureRandom initialValue() {
            return C35576Y.f96391a.m20299a();
        }
    }

    private C35576Y() {
    }

    /* renamed from: b */
    private final SecureRandom m20296b() {
        SecureRandom secureRandom = (SecureRandom) f96392b.get();
        if (secureRandom == null) {
            return m20299a();
        }
        return secureRandom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final SecureRandom m20299a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    /* renamed from: a */
    public final byte[] m20298a(int i) {
        byte[] bArr = new byte[i];
        f96391a.m20296b().nextBytes(bArr);
        return bArr;
    }
}
