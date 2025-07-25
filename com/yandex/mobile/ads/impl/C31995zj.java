package com.yandex.mobile.ads.impl;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.zj */
/* loaded from: classes8.dex */
public final class C31995zj implements f22 {
    @NotNull

    /* renamed from: a */
    private final LinkedHashMap f88929a;

    public C31995zj(@NotNull X509Certificate... caCerts) {
        Intrinsics.checkNotNullParameter(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : caCerts) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Intrinsics.checkNotNullExpressionValue(subjectX500Principal, "getSubjectX500Principal(...)");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f88929a = linkedHashMap;
    }

    @Override // com.yandex.mobile.ads.impl.f22
    @Nullable
    /* renamed from: a */
    public final X509Certificate mo26149a(@NotNull X509Certificate cert) {
        Intrinsics.checkNotNullParameter(cert, "cert");
        Set set = (Set) this.f88929a.get(cert.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                cert.verify(((X509Certificate) next).getPublicKey());
                obj = next;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != this && (!(obj instanceof C31995zj) || !Intrinsics.m17075f(((C31995zj) obj).f88929a, this.f88929a))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f88929a.hashCode();
    }
}
