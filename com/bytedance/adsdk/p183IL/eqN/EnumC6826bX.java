package com.bytedance.adsdk.p183IL.eqN;

import com.bytedance.component.sdk.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.bytedance.adsdk.IL.eqN.bX */
/* loaded from: classes3.dex */
public enum EnumC6826bX {
    JSON(".json"),
    ZIP(".zip");
    

    /* renamed from: bX */
    public final String f14654bX;

    EnumC6826bX(String str) {
        this.f14654bX = str;
    }

    /* renamed from: bg */
    public String m90756bg() {
        return ".temp" + this.f14654bX;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f14654bX;
    }
}
