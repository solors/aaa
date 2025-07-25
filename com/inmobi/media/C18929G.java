package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.G */
/* loaded from: classes6.dex */
public final class C18929G {

    /* renamed from: a */
    public final C19531y0 f47248a;

    /* renamed from: b */
    public final String f47249b;

    /* renamed from: c */
    public final Boolean f47250c;

    /* renamed from: d */
    public final String f47251d;

    /* renamed from: e */
    public final byte f47252e;

    public C18929G(C19531y0 adUnitTelemetry, String str, Boolean bool, String str2, byte b) {
        Intrinsics.checkNotNullParameter(adUnitTelemetry, "adUnitTelemetry");
        this.f47248a = adUnitTelemetry;
        this.f47249b = str;
        this.f47250c = bool;
        this.f47251d = str2;
        this.f47252e = b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18929G)) {
            return false;
        }
        C18929G c18929g = (C18929G) obj;
        if (Intrinsics.m17075f(this.f47248a, c18929g.f47248a) && Intrinsics.m17075f(this.f47249b, c18929g.f47249b) && Intrinsics.m17075f(this.f47250c, c18929g.f47250c) && Intrinsics.m17075f(this.f47251d, c18929g.f47251d) && this.f47252e == c18929g.f47252e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.f47248a.hashCode() * 31;
        String str = this.f47249b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        Boolean bool = this.f47250c;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.f47251d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return Byte.hashCode(this.f47252e) + ((i3 + i) * 31);
    }

    public final String toString() {
        return "AdNotReadyMetadata(adUnitTelemetry=" + this.f47248a + ", creativeType=" + this.f47249b + ", isRewarded=" + this.f47250c + ", markupType=" + this.f47251d + ", adState=" + ((int) this.f47252e) + ')';
    }
}
