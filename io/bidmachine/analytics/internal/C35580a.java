package io.bidmachine.analytics.internal;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.bidmachine.analytics.internal.a */
/* loaded from: classes9.dex */
public final class C35580a implements InterfaceC35584b {

    /* renamed from: b */
    public static final C35581a f96397b = new C35581a(null);

    /* renamed from: a */
    private final String f96398a = "AES";

    /* renamed from: io.bidmachine.analytics.internal.a$a */
    /* loaded from: classes9.dex */
    public static final class C35581a {
        private C35581a() {
        }

        public /* synthetic */ C35581a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // io.bidmachine.analytics.internal.InterfaceC35584b
    /* renamed from: a */
    public byte[] mo20280a(Key key, byte[] bArr) {
        byte[] m20298a = C35576Y.f96391a.m20298a(12);
        byte[] doFinal = m20292a(1, key, m20298a).doFinal(bArr);
        byte[] bArr2 = new byte[doFinal.length + 12];
        _ArraysJvm.m17398g(m20298a, bArr2, 0, 0, 12);
        _ArraysJvm.m17398g(doFinal, bArr2, 12, 0, doFinal.length);
        return bArr2;
    }

    @Override // io.bidmachine.analytics.internal.InterfaceC35584b
    public String getName() {
        return this.f96398a;
    }

    /* renamed from: a */
    private final Cipher m20292a(int i, Key key, byte[] bArr) {
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(i, key, gCMParameterSpec);
        return cipher;
    }
}
