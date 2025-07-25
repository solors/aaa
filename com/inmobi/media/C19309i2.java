package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.i2 */
/* loaded from: classes6.dex */
public final class C19309i2 {

    /* renamed from: a */
    public final String f48333a;

    /* renamed from: b */
    public final String f48334b;

    public C19309i2(String url, String accountId) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        this.f48333a = url;
        this.f48334b = accountId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19309i2)) {
            return false;
        }
        C19309i2 c19309i2 = (C19309i2) obj;
        if (Intrinsics.m17075f(this.f48333a, c19309i2.f48333a) && Intrinsics.m17075f(this.f48334b, c19309i2.f48334b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f48334b.hashCode() + (this.f48333a.hashCode() * 31);
    }

    public final String toString() {
        return "ConfigIdentifier(url=" + this.f48333a + ", accountId=" + this.f48334b + ')';
    }
}
