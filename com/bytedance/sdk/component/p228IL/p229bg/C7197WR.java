package com.bytedance.sdk.component.p228IL.p229bg;

import java.nio.charset.Charset;

/* renamed from: com.bytedance.sdk.component.IL.bg.WR */
/* loaded from: classes3.dex */
public final class C7197WR {

    /* renamed from: IL */
    private String f15522IL;

    /* renamed from: bg */
    private String f15523bg;

    private C7197WR(String str) {
        this.f15523bg = str;
    }

    /* renamed from: bg */
    public static C7197WR m89634bg(String str) {
        return new C7197WR(str);
    }

    /* renamed from: bg */
    public String m89635bg() {
        return this.f15523bg;
    }

    /* renamed from: bg */
    public Charset m89633bg(Charset charset) {
        try {
            String str = this.f15522IL;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
