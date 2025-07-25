package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.D8 */
/* loaded from: classes6.dex */
public final class C18896D8 {

    /* renamed from: a */
    public final EnumC19506w3 f47181a;

    /* renamed from: b */
    public final String f47182b;

    public C18896D8(EnumC19506w3 errorCode, String str) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f47181a = errorCode;
        this.f47182b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18896D8)) {
            return false;
        }
        C18896D8 c18896d8 = (C18896D8) obj;
        if (this.f47181a == c18896d8.f47181a && Intrinsics.m17075f(this.f47182b, c18896d8.f47182b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f47181a.hashCode() * 31;
        String str = this.f47182b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "NetworkError(errorCode=" + this.f47181a + ", errorMessage=" + this.f47182b + ')';
    }
}
