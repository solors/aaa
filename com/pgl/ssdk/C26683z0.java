package com.pgl.ssdk;

import com.pgl.ssdk.InterfaceC26681y0;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.pgl.ssdk.z0 */
/* loaded from: classes7.dex */
public class C26683z0<T extends InterfaceC26681y0> {

    /* renamed from: a */
    private int f69996a;

    /* renamed from: b */
    private BlockingQueue<T> f69997b = new LinkedBlockingQueue();

    private C26683z0(int i) {
        this.f69996a = i;
    }

    /* renamed from: a */
    public static C26683z0 m40681a(int i) {
        return new C26683z0(i);
    }

    /* renamed from: a */
    public T m40682a() {
        return this.f69997b.poll();
    }
}
