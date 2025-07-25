package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.yandex.mobile.ads.impl.oh */
/* loaded from: classes8.dex */
public final class C31038oh {

    /* renamed from: a */
    public final int f83512a = 0;

    /* renamed from: b */
    public final float f83513b = 0.0f;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C31038oh.class != obj.getClass()) {
            return false;
        }
        C31038oh c31038oh = (C31038oh) obj;
        if (this.f83512a == c31038oh.f83512a && Float.compare(c31038oh.f83513b, this.f83513b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f83513b) + ((this.f83512a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }
}
