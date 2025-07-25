package com.yandex.mobile.ads.impl;

import com.monetization.ads.exo.metadata.Metadata;
import com.monetization.ads.exo.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class o30 extends cu1 {
    @Override // com.yandex.mobile.ads.impl.cu1
    /* renamed from: a */
    protected final Metadata mo26258a(gx0 gx0Var, ByteBuffer byteBuffer) {
        cc1 cc1Var = new cc1(byteBuffer.limit(), byteBuffer.array());
        String m35273q = cc1Var.m35273q();
        m35273q.getClass();
        String m35273q2 = cc1Var.m35273q();
        m35273q2.getClass();
        return new Metadata(new EventMessage(m35273q, m35273q2, cc1Var.m35274p(), cc1Var.m35274p(), Arrays.copyOfRange(cc1Var.m35291c(), cc1Var.m35289d(), cc1Var.m35287e())));
    }
}
