package com.bytedance.sdk.component.p228IL.p229bg;

/* renamed from: com.bytedance.sdk.component.IL.bg.yDt */
/* loaded from: classes3.dex */
public class C7221yDt {

    /* renamed from: bX */
    public C7197WR f15577bX;
    public String eqN;
    public EnumC7222bg ldr;

    /* renamed from: zx */
    public byte[] f15578zx;

    /* renamed from: com.bytedance.sdk.component.IL.bg.yDt$bg */
    /* loaded from: classes3.dex */
    public enum EnumC7222bg {
        STRING_TYPE,
        BYTE_ARRAY_TYPE
    }

    public C7221yDt() {
    }

    /* renamed from: bg */
    public String m89561bg() {
        return this.eqN;
    }

    public C7221yDt(C7197WR c7197wr, String str, EnumC7222bg enumC7222bg) {
        this.f15577bX = c7197wr;
        this.eqN = str;
        this.ldr = enumC7222bg;
    }

    /* renamed from: bg */
    public static C7221yDt m89560bg(C7197WR c7197wr, String str) {
        return new C7221yDt(c7197wr, str, EnumC7222bg.STRING_TYPE);
    }

    /* renamed from: bg */
    public static C7221yDt m89559bg(C7197WR c7197wr, byte[] bArr) {
        return new C7221yDt(c7197wr, bArr, EnumC7222bg.BYTE_ARRAY_TYPE);
    }

    public C7221yDt(C7197WR c7197wr, byte[] bArr, EnumC7222bg enumC7222bg) {
        this.f15577bX = c7197wr;
        this.f15578zx = bArr;
        this.ldr = enumC7222bg;
    }
}
