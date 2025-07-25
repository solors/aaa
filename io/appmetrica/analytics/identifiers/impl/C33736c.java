package io.appmetrica.analytics.identifiers.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.identifiers.impl.c */
/* loaded from: classes9.dex */
public final class C33736c {

    /* renamed from: a */
    public final IdentifierStatus f92520a;

    /* renamed from: b */
    public final C33734a f92521b;

    /* renamed from: c */
    public final String f92522c;

    public C33736c(IdentifierStatus identifierStatus, C33734a c33734a, String str) {
        this.f92520a = identifierStatus;
        this.f92521b = c33734a;
        this.f92522c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33736c)) {
            return false;
        }
        C33736c c33736c = (C33736c) obj;
        if (this.f92520a == c33736c.f92520a && Intrinsics.m17075f(this.f92521b, c33736c.f92521b) && Intrinsics.m17075f(this.f92522c, c33736c.f92522c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f92520a.hashCode() * 31;
        C33734a c33734a = this.f92521b;
        int i = 0;
        if (c33734a == null) {
            hashCode = 0;
        } else {
            hashCode = c33734a.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str = this.f92522c;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "AdvIdResult(status=" + this.f92520a + ", advIdInfo=" + this.f92521b + ", errorExplanation=" + this.f92522c + ')';
    }

    public /* synthetic */ C33736c(IdentifierStatus identifierStatus, C33734a c33734a, String str, int i) {
        this(identifierStatus, (i & 2) != 0 ? null : c33734a, (i & 4) != 0 ? null : str);
    }
}
