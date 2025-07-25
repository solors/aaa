package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Xk */
/* loaded from: assets/audience_network.dex */
public final class C12898Xk implements InterfaceC11683Db {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11683Db
    public final Metadata A5N(C11724EX c11724ex) {
        ByteBuffer byteBuffer = c11724ex.A01;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C11939I4 c11939i4 = new C11939I4(array, limit);
        String A0Q = c11939i4.A0Q();
        String A0Q2 = c11939i4.A0Q();
        long A0M = c11939i4.A0M();
        return new Metadata(new EventMessage(A0Q, A0Q2, AbstractC11953IK.A0F(c11939i4.A0M(), 1000L, A0M), c11939i4.A0M(), Arrays.copyOfRange(array, c11939i4.A06(), limit), AbstractC11953IK.A0F(c11939i4.A0M(), 1000000L, A0M)));
    }
}
