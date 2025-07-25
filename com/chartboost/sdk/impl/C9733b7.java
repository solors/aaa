package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.b7 */
/* loaded from: classes3.dex */
public final class C9733b7 {

    /* renamed from: a */
    public final C10372y0 f21685a;

    /* renamed from: b */
    public final C10273v f21686b;

    /* renamed from: c */
    public final CBError f21687c;

    /* renamed from: d */
    public final long f21688d;

    /* renamed from: e */
    public final long f21689e;

    public C9733b7(C10372y0 appRequest, C10273v c10273v, CBError cBError, long j, long j2) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        this.f21685a = appRequest;
        this.f21686b = c10273v;
        this.f21687c = cBError;
        this.f21688d = j;
        this.f21689e = j2;
    }

    /* renamed from: a */
    public final C10273v m82019a() {
        return this.f21686b;
    }

    /* renamed from: b */
    public final CBError m82018b() {
        return this.f21687c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9733b7)) {
            return false;
        }
        C9733b7 c9733b7 = (C9733b7) obj;
        if (Intrinsics.m17075f(this.f21685a, c9733b7.f21685a) && Intrinsics.m17075f(this.f21686b, c9733b7.f21686b) && Intrinsics.m17075f(this.f21687c, c9733b7.f21687c) && this.f21688d == c9733b7.f21688d && this.f21689e == c9733b7.f21689e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f21685a.hashCode() * 31;
        C10273v c10273v = this.f21686b;
        int i = 0;
        if (c10273v == null) {
            hashCode = 0;
        } else {
            hashCode = c10273v.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        CBError cBError = this.f21687c;
        if (cBError != null) {
            i = cBError.hashCode();
        }
        return ((((i2 + i) * 31) + Long.hashCode(this.f21688d)) * 31) + Long.hashCode(this.f21689e);
    }

    public String toString() {
        C10372y0 c10372y0 = this.f21685a;
        C10273v c10273v = this.f21686b;
        CBError cBError = this.f21687c;
        long j = this.f21688d;
        long j2 = this.f21689e;
        return "LoadResult(appRequest=" + c10372y0 + ", adUnit=" + c10273v + ", error=" + cBError + ", requestResponseCodeNs=" + j + ", readDataNs=" + j2 + ")";
    }

    public /* synthetic */ C9733b7(C10372y0 c10372y0, C10273v c10273v, CBError cBError, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c10372y0, (i & 2) != 0 ? null : c10273v, (i & 4) == 0 ? cBError : null, (i & 8) != 0 ? 0L : j, (i & 16) == 0 ? j2 : 0L);
    }
}
