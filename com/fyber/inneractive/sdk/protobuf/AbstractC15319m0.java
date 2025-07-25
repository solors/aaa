package com.fyber.inneractive.sdk.protobuf;

import com.google.android.exoplayer2.C15633C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.fyber.inneractive.sdk.protobuf.m0 */
/* loaded from: classes4.dex */
public abstract class AbstractC15319m0 {

    /* renamed from: a */
    public static final Charset f30280a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f30281b;

    static {
        Charset.forName(C15633C.ISO88591_NAME);
        byte[] bArr = new byte[0];
        f30281b = bArr;
        ByteBuffer.wrap(bArr);
    }

    /* renamed from: a */
    public static String m76844a(byte[] bArr) {
        return new String(bArr, f30280a);
    }

    /* renamed from: a */
    public static AbstractC15283a0 m76845a(Object obj, Object obj2) {
        InterfaceC15226E0 interfaceC15226E0 = (InterfaceC15226E0) obj2;
        AbstractC15270U abstractC15270U = (AbstractC15270U) ((InterfaceC15226E0) obj).toBuilder();
        if (abstractC15270U.f30213a.getClass().isInstance(interfaceC15226E0)) {
            abstractC15270U.m76938c();
            AbstractC15270U.m76942a(abstractC15270U.f30214b, (AbstractC15283a0) ((AbstractC15285b) interfaceC15226E0));
            return abstractC15270U.m76939b();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
