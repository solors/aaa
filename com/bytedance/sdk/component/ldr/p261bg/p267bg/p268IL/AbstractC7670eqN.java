package com.bytedance.sdk.component.ldr.p261bg.p267bg.p268IL;

import com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg;
import com.bytedance.sdk.component.ldr.p261bg.eqN.p271IL.C7705bg;
import com.bytedance.sdk.component.ldr.p261bg.p266bX.C7662bg;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.bytedance.sdk.component.ldr.bg.bg.IL.eqN */
/* loaded from: classes3.dex */
public abstract class AbstractC7670eqN<T extends InterfaceC7706bg> {

    /* renamed from: IL */
    private Queue<T> f16797IL = new ConcurrentLinkedQueue();

    /* renamed from: bX */
    private Queue<String> f16798bX;

    /* renamed from: bg */
    private C7705bg f16799bg;
    private String eqN;

    public AbstractC7670eqN(C7705bg c7705bg, Queue<String> queue, String str) {
        this.f16799bg = c7705bg;
        this.f16798bX = queue;
        this.eqN = str;
    }

    /* renamed from: IL */
    public synchronized boolean m88101IL(int i, int i2) {
        int size = this.f16797IL.size();
        int m87999bg = this.f16799bg.m87999bg();
        if (i != 2 && i != 1) {
            if (size < m87999bg) {
                return false;
            }
            return true;
        } else if (C7662bg.m88141bX()) {
            if (size <= 0) {
                return false;
            }
            return true;
        } else if (size < m87999bg) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: bg */
    public void m88098bg(T t) {
        Queue<T> queue = this.f16797IL;
        if (queue == null || t == null) {
            return;
        }
        queue.offer(t);
    }

    /* renamed from: bg */
    public synchronized List<InterfaceC7706bg> m88100bg(int i, int i2) {
        if (m88101IL(i, i2)) {
            ArrayList arrayList = new ArrayList(this.f16799bg.m87999bg());
            do {
                T poll = this.f16797IL.poll();
                if (poll == null) {
                    break;
                }
                arrayList.add(poll);
            } while (arrayList.size() != this.f16799bg.m88001IL());
            return arrayList;
        }
        return null;
    }

    /* renamed from: bg */
    public synchronized void m88099bg(int i, List<T> list) {
        if (i != -1 && i != 200 && i != 509) {
            this.f16797IL.addAll(list);
        } else {
            this.f16797IL.size();
        }
    }
}
