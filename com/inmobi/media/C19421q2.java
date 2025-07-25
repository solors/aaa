package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.q2 */
/* loaded from: classes6.dex */
public final class C19421q2 {

    /* renamed from: a */
    public final byte f48592a;

    /* renamed from: b */
    public final String f48593b;

    public C19421q2(byte b, String str) {
        this.f48592a = b;
        this.f48593b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19421q2)) {
            return false;
        }
        C19421q2 c19421q2 = (C19421q2) obj;
        if (this.f48592a == c19421q2.f48592a && Intrinsics.m17075f(this.f48593b, c19421q2.f48593b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Byte.hashCode(this.f48592a) * 31;
        String str = this.f48593b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "ConfigError(errorCode=" + ((int) this.f48592a) + ", errorMessage=" + this.f48593b + ')';
    }
}
