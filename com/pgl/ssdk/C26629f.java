package com.pgl.ssdk;

import com.pgl.ssdk.AbstractC26610c;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.pgl.ssdk.f */
/* loaded from: classes7.dex */
public class C26629f {

    /* renamed from: com.pgl.ssdk.f$a */
    /* loaded from: classes7.dex */
    public static class C26630a extends Exception {
        public C26630a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static ByteBuffer m40875a(ByteBuffer byteBuffer) throws C26602a {
        return C26633g.m40863b(byteBuffer);
    }

    /* renamed from: b */
    public static byte[] m40874b(ByteBuffer byteBuffer) throws C26602a {
        return C26633g.m40861c(byteBuffer);
    }

    /* renamed from: a */
    public static C26636h m40876a(InterfaceC26651o interfaceC26651o, AbstractC26610c.C26611a c26611a, int i) throws IOException, C26630a {
        try {
            return C26633g.m40867a(interfaceC26651o, c26611a, i);
        } catch (C26638i e) {
            throw new C26630a(e.getMessage());
        }
    }
}
