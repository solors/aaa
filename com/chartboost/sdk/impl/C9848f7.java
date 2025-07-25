package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.f7 */
/* loaded from: classes3.dex */
public final class C9848f7 {

    /* renamed from: a */
    public final String f21995a;

    /* renamed from: b */
    public final String f21996b;

    /* renamed from: c */
    public final String f21997c;

    public C9848f7(String mediationName, String libraryVersion, String adapterVersion) {
        Intrinsics.checkNotNullParameter(mediationName, "mediationName");
        Intrinsics.checkNotNullParameter(libraryVersion, "libraryVersion");
        Intrinsics.checkNotNullParameter(adapterVersion, "adapterVersion");
        this.f21995a = mediationName;
        this.f21996b = libraryVersion;
        this.f21997c = adapterVersion;
    }

    /* renamed from: a */
    public final String m81689a() {
        return this.f21997c;
    }

    /* renamed from: b */
    public final String m81688b() {
        return this.f21996b;
    }

    /* renamed from: c */
    public final String m81687c() {
        return this.f21995a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9848f7)) {
            return false;
        }
        C9848f7 c9848f7 = (C9848f7) obj;
        if (Intrinsics.m17075f(this.f21995a, c9848f7.f21995a) && Intrinsics.m17075f(this.f21996b, c9848f7.f21996b) && Intrinsics.m17075f(this.f21997c, c9848f7.f21997c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f21995a.hashCode() * 31) + this.f21996b.hashCode()) * 31) + this.f21997c.hashCode();
    }

    public String toString() {
        String str = this.f21995a;
        String str2 = this.f21996b;
        String str3 = this.f21997c;
        return "MediationBodyFields(mediationName=" + str + ", libraryVersion=" + str2 + ", adapterVersion=" + str3 + ")";
    }
}
