package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.monetization.ads.exo.metadata.Metadata;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public abstract class cu1 implements ex0 {
    @Override // com.yandex.mobile.ads.impl.ex0
    @Nullable
    /* renamed from: a */
    public final Metadata mo34414a(gx0 gx0Var) {
        ByteBuffer byteBuffer = gx0Var.f79793d;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            if (gx0Var.m34135e()) {
                return null;
            }
            return mo26258a(gx0Var, byteBuffer);
        }
        throw new IllegalArgumentException();
    }

    @Nullable
    /* renamed from: a */
    protected abstract Metadata mo26258a(gx0 gx0Var, ByteBuffer byteBuffer);
}
