package com.applovin.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.impl.v1 */
/* loaded from: classes2.dex */
public final class C5671v1 {

    /* renamed from: a */
    public final int f11429a;

    /* renamed from: b */
    public final float f11430b;

    public C5671v1(int i, float f) {
        this.f11429a = i;
        this.f11430b = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5671v1.class != obj.getClass()) {
            return false;
        }
        C5671v1 c5671v1 = (C5671v1) obj;
        if (this.f11429a == c5671v1.f11429a && Float.compare(c5671v1.f11430b, this.f11430b) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11429a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Float.floatToIntBits(this.f11430b);
    }
}
