package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.M8 */
/* loaded from: classes6.dex */
public final class C19022M8 {

    /* renamed from: a */
    public final Map f47516a;

    public C19022M8(Map requestParams) {
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        this.f47516a = requestParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C19022M8) && Intrinsics.m17075f(this.f47516a, ((C19022M8) obj).f47516a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f47516a.hashCode();
    }

    public final String toString() {
        return "NovatiqAdData(requestParams=" + this.f47516a + ')';
    }
}
