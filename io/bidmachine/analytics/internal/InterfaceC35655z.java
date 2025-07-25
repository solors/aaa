package io.bidmachine.analytics.internal;

import java.security.KeyPair;
import java.security.KeyPairGenerator;

/* renamed from: io.bidmachine.analytics.internal.z */
/* loaded from: classes9.dex */
public interface InterfaceC35655z {

    /* renamed from: io.bidmachine.analytics.internal.z$a */
    /* loaded from: classes9.dex */
    public static final class C35656a {
        /* renamed from: a */
        public static KeyPair m20099a(InterfaceC35655z interfaceC35655z) {
            return interfaceC35655z.mo20100a().generateKeyPair();
        }
    }

    /* renamed from: a */
    KeyPairGenerator mo20100a();
}
