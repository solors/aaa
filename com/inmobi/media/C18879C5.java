package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.C5 */
/* loaded from: classes6.dex */
public final class C18879C5 {

    /* renamed from: a */
    public final int f47131a;

    /* renamed from: b */
    public final Integer f47132b;

    public C18879C5(int i) {
        this.f47131a = i;
        this.f47132b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18879C5)) {
            return false;
        }
        C18879C5 c18879c5 = (C18879C5) obj;
        if (this.f47131a == c18879c5.f47131a && Intrinsics.m17075f(this.f47132b, c18879c5.f47132b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.f47131a) * 31;
        Integer num = this.f47132b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        return "OpenRequestResultData(result=" + this.f47131a + ", errorCode=" + this.f47132b + ')';
    }

    public C18879C5(int i, Integer num) {
        this.f47131a = i;
        this.f47132b = num;
    }
}
