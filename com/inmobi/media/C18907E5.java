package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.E5 */
/* loaded from: classes6.dex */
public final class C18907E5 {

    /* renamed from: a */
    public final boolean f47208a;

    /* renamed from: b */
    public final String f47209b;

    /* renamed from: c */
    public final boolean f47210c;

    public C18907E5(boolean z, String landingScheme, boolean z2) {
        Intrinsics.checkNotNullParameter(landingScheme, "landingScheme");
        this.f47208a = z;
        this.f47209b = landingScheme;
        this.f47210c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18907E5)) {
            return false;
        }
        C18907E5 c18907e5 = (C18907E5) obj;
        if (this.f47208a == c18907e5.f47208a && Intrinsics.m17075f(this.f47209b, c18907e5.f47209b) && this.f47210c == c18907e5.f47210c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final int hashCode() {
        boolean z = this.f47208a;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = (this.f47209b.hashCode() + (r0 * 31)) * 31;
        boolean z2 = this.f47210c;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "LandingPageState(isInAppBrowser=" + this.f47208a + ", landingScheme=" + this.f47209b + ", isCCTEnabled=" + this.f47210c + ')';
    }
}
