package com.bytedance.sdk.component.adexpress.dynamic.eqN;

import java.util.Arrays;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.eqN.WR */
/* loaded from: classes3.dex */
public class C7458WR {

    /* renamed from: IL */
    public float f16149IL;

    /* renamed from: bg */
    public float f16150bg;

    public C7458WR(float f, float f2) {
        this.f16150bg = f;
        this.f16149IL = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7458WR c7458wr = (C7458WR) obj;
            if (Float.compare(c7458wr.f16150bg, this.f16150bg) == 0 && Float.compare(c7458wr.f16149IL, this.f16149IL) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f16150bg), Float.valueOf(this.f16149IL)});
    }
}
