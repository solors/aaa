package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.H1 */
/* loaded from: classes6.dex */
public final class C18945H1 {

    /* renamed from: a */
    public final int f47304a;

    /* renamed from: b */
    public final String f47305b;

    /* renamed from: c */
    public final Map f47306c;

    public C18945H1(int i, int i2, String str) {
        str = (i2 & 2) != 0 ? null : str;
        this.f47304a = i;
        this.f47305b = str;
        this.f47306c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18945H1)) {
            return false;
        }
        C18945H1 c18945h1 = (C18945H1) obj;
        if (this.f47304a == c18945h1.f47304a && Intrinsics.m17075f(this.f47305b, c18945h1.f47305b) && Intrinsics.m17075f(this.f47306c, c18945h1.f47306c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.f47304a) * 31;
        String str = this.f47305b;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Map map = this.f47306c;
        if (map != null) {
            i = map.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "BusEvent(eventId=" + this.f47304a + ", eventMessage=" + this.f47305b + ", eventData=" + this.f47306c + ')';
    }

    public C18945H1(int i, String str, Map map) {
        this.f47304a = i;
        this.f47305b = str;
        this.f47306c = map;
    }
}
