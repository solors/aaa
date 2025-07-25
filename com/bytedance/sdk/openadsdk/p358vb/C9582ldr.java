package com.bytedance.sdk.openadsdk.p358vb;

import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.C8840WR;
import com.bytedance.sdk.openadsdk.core.C9095yDt;
import com.bytedance.sdk.openadsdk.p358vb.p359IL.C9575bg;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.bytedance.sdk.openadsdk.vb.ldr */
/* loaded from: classes3.dex */
public class C9582ldr implements InterfaceC9583zx {

    /* renamed from: IL */
    private InterfaceC9583zx f21371IL;

    /* renamed from: bX */
    private int f21372bX;

    /* renamed from: bg */
    long f21373bg = System.currentTimeMillis();
    private int eqN;

    /* renamed from: zx */
    private int f21374zx;

    public C9582ldr(InterfaceC9583zx interfaceC9583zx, int i, int i2, int i3) {
        this.f21371IL = interfaceC9583zx;
        this.f21372bX = i;
        this.eqN = i2;
        this.f21374zx = i3;
    }

    @Override // com.bytedance.sdk.openadsdk.p358vb.InterfaceC9583zx
    public C9575bg generatorModel() {
        C9575bg generatorModel = this.f21371IL.generatorModel();
        generatorModel.m82352bg(BuildConfig.VERSION_NAME);
        generatorModel.m82354bg(this.f21372bX);
        generatorModel.m82366IL(this.eqN);
        generatorModel.m82357bX(this.f21374zx);
        generatorModel.m82365IL(this.f21373bg);
        generatorModel.ldr(C8840WR.m84734IL().m84696zx());
        generatorModel.eqN(C9095yDt.eqN());
        return generatorModel;
    }
}
