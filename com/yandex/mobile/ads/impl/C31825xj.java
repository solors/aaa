package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.xj */
/* loaded from: classes8.dex */
public final class C31825xj extends AbstractC30180dn {
    @NotNull

    /* renamed from: a */
    private final f22 f87710a;

    public C31825xj(@NotNull f22 trustRootIndex) {
        Intrinsics.checkNotNullParameter(trustRootIndex, "trustRootIndex");
        this.f87710a = trustRootIndex;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    @Override // com.yandex.mobile.ads.impl.AbstractC30180dn
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List mo26968a(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.util.List r10) throws javax.net.ssl.SSLPeerUnverifiedException {
        /*
            r8 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "hostname"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.util.ArrayDeque r9 = new java.util.ArrayDeque
            r9.<init>(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.lang.Object r0 = r9.removeFirst()
            java.lang.String r1 = "removeFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r10.add(r0)
            r0 = 0
            r1 = r0
        L22:
            r2 = 9
            if (r0 >= r2) goto Lb8
            int r2 = r10.size()
            r3 = 1
            int r2 = r2 - r3
            java.lang.Object r2 = r10.get(r2)
            java.lang.String r4 = "null cannot be cast to non-null type java.security.cert.X509Certificate"
            kotlin.jvm.internal.Intrinsics.m17073h(r2, r4)
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            com.yandex.mobile.ads.impl.f22 r5 = r8.f87710a
            java.security.cert.X509Certificate r5 = r5.mo26149a(r2)
            if (r5 == 0) goto L67
            int r1 = r10.size()
            if (r1 > r3) goto L4b
            boolean r1 = kotlin.jvm.internal.Intrinsics.m17075f(r2, r5)
            if (r1 != 0) goto L4e
        L4b:
            r10.add(r5)
        L4e:
            java.security.Principal r1 = r5.getIssuerDN()
            java.security.Principal r2 = r5.getSubjectDN()
            boolean r1 = kotlin.jvm.internal.Intrinsics.m17075f(r1, r2)
            if (r1 != 0) goto L5d
            goto L65
        L5d:
            java.security.PublicKey r1 = r5.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L65
            r5.verify(r1)     // Catch: java.security.GeneralSecurityException -> L65
            return r10
        L65:
            r1 = r3
            goto L9b
        L67:
            java.util.Iterator r3 = r9.iterator()
            java.lang.String r5 = "iterator(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
        L70:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L9e
            java.lang.Object r5 = r3.next()
            kotlin.jvm.internal.Intrinsics.m17073h(r5, r4)
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5
            java.security.Principal r6 = r2.getIssuerDN()
            java.security.Principal r7 = r5.getSubjectDN()
            boolean r6 = kotlin.jvm.internal.Intrinsics.m17075f(r6, r7)
            if (r6 != 0) goto L8e
            goto L70
        L8e:
            java.security.PublicKey r6 = r5.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L70
            r2.verify(r6)     // Catch: java.security.GeneralSecurityException -> L70
            r3.remove()
            r10.add(r5)
        L9b:
            int r0 = r0 + 1
            goto L22
        L9e:
            if (r1 == 0) goto La1
            return r10
        La1:
            javax.net.ssl.SSLPeerUnverifiedException r9 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Failed to find a trusted cert that signed "
            r10.append(r0)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        Lb8:
            javax.net.ssl.SSLPeerUnverifiedException r9 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Certificate chain too long: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C31825xj.mo26968a(java.lang.String, java.util.List):java.util.List");
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this || ((obj instanceof C31825xj) && Intrinsics.m17075f(((C31825xj) obj).f87710a, this.f87710a))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f87710a.hashCode();
    }
}
