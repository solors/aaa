package com.applovin.impl;

import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.dk */
/* loaded from: classes2.dex */
public abstract class AbstractC4267dk implements InterfaceC4121bf {
    @Override // com.applovin.impl.InterfaceC4121bf
    /* renamed from: a */
    public final C4061af mo99749a(C4256df c4256df) {
        boolean z;
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC4100b1.m100583a(c4256df.f8725c);
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        } else {
            z = false;
        }
        AbstractC4100b1.m100580a(z);
        if (c4256df.m97868d()) {
            return null;
        }
        return mo93618a(c4256df, byteBuffer);
    }

    /* renamed from: a */
    protected abstract C4061af mo93618a(C4256df c4256df, ByteBuffer byteBuffer);
}
