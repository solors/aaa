package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public abstract class eu1 extends zt1<sy1, ty1, qy1> implements py1 {
    /* JADX INFO: Access modifiers changed from: protected */
    public eu1() {
        super(new sy1[2], new ty1[2]);
        m25993f();
    }

    /* renamed from: a */
    protected abstract oy1 mo26966a(byte[] bArr, int i, boolean z) throws qy1;

    @Override // com.yandex.mobile.ads.impl.py1
    /* renamed from: a */
    public final void mo27668a(long j) {
    }

    @Override // com.yandex.mobile.ads.impl.zt1
    /* renamed from: c */
    protected final sy1 mo25996c() {
        return new sy1();
    }

    @Override // com.yandex.mobile.ads.impl.zt1
    /* renamed from: d */
    protected final ty1 mo25995d() {
        return new du1(this);
    }

    @Override // com.yandex.mobile.ads.impl.zt1
    @Nullable
    /* renamed from: a */
    protected final qy1 mo26001a(C30423gx c30423gx, AbstractC30511hx abstractC30511hx, boolean z) {
        sy1 sy1Var = (sy1) c30423gx;
        ty1 ty1Var = (ty1) abstractC30511hx;
        try {
            ByteBuffer byteBuffer = sy1Var.f79793d;
            byteBuffer.getClass();
            ty1Var.m28934a(sy1Var.f79795f, mo26966a(byteBuffer.array(), byteBuffer.limit(), z), sy1Var.f85445j);
            ty1Var.m34139c();
            return null;
        } catch (qy1 e) {
            return e;
        }
    }
}
