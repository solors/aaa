package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes8.dex */
public final class m20 extends eu1 {

    /* renamed from: m */
    private final n20 f82010m;

    public m20(List<byte[]> list) {
        cc1 cc1Var = new cc1(list.get(0));
        this.f82010m = new n20(cc1Var.m35264z(), cc1Var.m35264z());
    }

    @Override // com.yandex.mobile.ads.impl.eu1
    /* renamed from: a */
    protected final oy1 mo26966a(byte[] bArr, int i, boolean z) {
        if (z) {
            this.f82010m.m31700d();
        }
        return new o20(this.f82010m.m31706a(i, bArr));
    }
}
