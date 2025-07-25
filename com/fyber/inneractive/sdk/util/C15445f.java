package com.fyber.inneractive.sdk.util;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.fyber.inneractive.sdk.util.f */
/* loaded from: classes4.dex */
public final class C15445f {

    /* renamed from: b */
    public static final C15445f f30593b = new C15445f();

    /* renamed from: a */
    public final ConcurrentLinkedQueue f30594a = new ConcurrentLinkedQueue();

    public C15445f() {
        for (int i = 0; i < 2; i++) {
            this.f30594a.offer(ByteBuffer.allocateDirect(16384));
        }
    }
}
