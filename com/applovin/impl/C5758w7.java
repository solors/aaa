package com.applovin.impl;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.applovin.impl.w7 */
/* loaded from: classes2.dex */
public final class C5758w7 extends AbstractC4267dk {
    /* renamed from: a */
    public C5680v7 m93674a(C4066ah c4066ah) {
        return new C5680v7((String) AbstractC4100b1.m100583a((Object) c4066ah.m100765t()), (String) AbstractC4100b1.m100583a((Object) c4066ah.m100765t()), c4066ah.m100766s(), c4066ah.m100766s(), Arrays.copyOfRange(c4066ah.m100787c(), c4066ah.m100785d(), c4066ah.m100783e()));
    }

    @Override // com.applovin.impl.AbstractC4267dk
    /* renamed from: a */
    protected C4061af mo93618a(C4256df c4256df, ByteBuffer byteBuffer) {
        return new C4061af(m93674a(new C4066ah(byteBuffer.array(), byteBuffer.limit())));
    }
}
