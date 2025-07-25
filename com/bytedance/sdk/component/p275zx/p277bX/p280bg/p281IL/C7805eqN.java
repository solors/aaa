package com.bytedance.sdk.component.p275zx.p277bX.p280bg.p281IL;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.p275zx.InterfaceC7850tuV;
import com.bytedance.sdk.component.p275zx.p277bX.p280bg.InterfaceC7799IL;

/* renamed from: com.bytedance.sdk.component.zx.bX.bg.IL.eqN */
/* loaded from: classes3.dex */
public class C7805eqN implements InterfaceC7850tuV {

    /* renamed from: IL */
    private final InterfaceC7799IL f17023IL;

    /* renamed from: bg */
    private final InterfaceC7850tuV f17024bg;

    public C7805eqN(InterfaceC7850tuV interfaceC7850tuV) {
        this(interfaceC7850tuV, null);
    }

    public C7805eqN(InterfaceC7850tuV interfaceC7850tuV, InterfaceC7799IL interfaceC7799IL) {
        this.f17024bg = interfaceC7850tuV;
        this.f17023IL = interfaceC7799IL;
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7826bg
    /* renamed from: IL  reason: avoid collision after fix types in other method */
    public boolean mo87586IL(String str) {
        return this.f17024bg.mo87586IL(str);
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7826bg
    /* renamed from: bg  reason: avoid collision after fix types in other method */
    public boolean mo87584bg(String str, Bitmap bitmap) {
        return this.f17024bg.mo87584bg(str, bitmap);
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7826bg
    /* renamed from: bg  reason: avoid collision after fix types in other method */
    public Bitmap mo87585bg(String str) {
        return this.f17024bg.mo87585bg(str);
    }
}
