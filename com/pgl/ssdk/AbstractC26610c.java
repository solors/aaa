package com.pgl.ssdk;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.pgl.ssdk.c */
/* loaded from: classes7.dex */
public abstract class AbstractC26610c {

    /* renamed from: com.pgl.ssdk.c$a */
    /* loaded from: classes7.dex */
    public static class C26611a extends C26658r {
        public C26611a(long j, long j2, int i, long j3, ByteBuffer byteBuffer) {
            super(j, j2, i, j3, byteBuffer);
        }
    }

    /* renamed from: a */
    public static C26611a m40925a(InterfaceC26651o interfaceC26651o) throws IOException, C26655q {
        C26658r m40891a = C26622d.m40891a(interfaceC26651o);
        return new C26611a(m40891a.m40786a(), m40891a.m40784c(), m40891a.m40785b(), m40891a.m40782e(), m40891a.m40783d());
    }
}
