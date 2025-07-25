package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.K5 */
/* loaded from: classes6.dex */
public final class C18991K5 {

    /* renamed from: a */
    public final String f47398a;

    /* renamed from: b */
    public final boolean f47399b;

    public C18991K5(String trigger, boolean z) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        this.f47398a = trigger;
        this.f47399b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18991K5)) {
            return false;
        }
        C18991K5 c18991k5 = (C18991K5) obj;
        if (Intrinsics.m17075f(this.f47398a, c18991k5.f47398a) && this.f47399b == c18991k5.f47399b) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f47398a.hashCode() * 31;
        boolean z = this.f47399b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "LandingPageTelemetryControlInfo(trigger=" + this.f47398a + ", enableLPTelemetry=" + this.f47399b + ')';
    }
}
