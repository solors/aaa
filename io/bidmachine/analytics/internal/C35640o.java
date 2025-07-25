package io.bidmachine.analytics.internal;

import io.bidmachine.analytics.internal.InterfaceC35655z;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;

/* renamed from: io.bidmachine.analytics.internal.o */
/* loaded from: classes9.dex */
public final class C35640o implements InterfaceC35655z {

    /* renamed from: a */
    private final KeyPairGenerator f96539a;

    public C35640o() {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
        this.f96539a = keyPairGenerator;
    }

    @Override // io.bidmachine.analytics.internal.InterfaceC35655z
    /* renamed from: a */
    public KeyPairGenerator mo20100a() {
        return this.f96539a;
    }

    /* renamed from: b */
    public KeyPair m20121b() {
        return InterfaceC35655z.C35656a.m20099a(this);
    }
}
