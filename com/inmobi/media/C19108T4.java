package com.inmobi.media;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.inmobi.media.T4 */
/* loaded from: classes6.dex */
public final class C19108T4 {
    private final boolean GPID;

    public C19108T4() {
        this(false, 1, null);
    }

    /* renamed from: a */
    public final boolean m60675a() {
        return this.GPID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C19108T4) && this.GPID == ((C19108T4) obj).GPID) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.GPID;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "IncludeIdParams(GPID=" + this.GPID + ')';
    }

    public C19108T4(boolean z) {
        this.GPID = z;
    }

    public /* synthetic */ C19108T4(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z);
    }
}
