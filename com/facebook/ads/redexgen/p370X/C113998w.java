package com.facebook.ads.redexgen.p370X;

import com.facebook.ads.redexgen.p370X.AbstractC114008x;
import com.facebook.ads.redexgen.p370X.C113988v;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.facebook.ads.redexgen.X.8w */
/* loaded from: assets/audience_network.dex */
public final class C113998w<T extends AbstractC114008x, E extends C113988v> {
    public final Map<Class<E>, List<WeakReference<T>>> A00 = new HashMap();
    public final Queue<E> A01 = new ArrayDeque();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A00(E e) {
        List<WeakReference<T>> list;
        if (this.A00 == null || (list = this.A00.get(e.getClass())) == null) {
            return;
        }
        A01(list);
        if (list.isEmpty()) {
            return;
        }
        for (WeakReference weakReference : new ArrayList(list)) {
            AbstractC114008x abstractC114008x = (AbstractC114008x) weakReference.get();
            if (abstractC114008x != null && abstractC114008x.A00(e)) {
                abstractC114008x.A03(e);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A02(E e) {
        if (this.A01.isEmpty()) {
            this.A01.add(e);
            while (!this.A01.isEmpty()) {
                A00(this.A01.peek());
                this.A01.remove();
            }
        } else {
            this.A01.add(e);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized boolean A05(T t) {
        if (t == null) {
            return false;
        }
        Class<E> A01 = t.A01();
        if (this.A00.get(A01) == null) {
            this.A00.put(A01, new ArrayList());
        }
        List<WeakReference<T>> list = this.A00.get(A01);
        A01(list);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).get() == t) {
                return false;
            }
        }
        return list.add(new WeakReference<>(t));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8w != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.8x, E extends com.facebook.ads.redexgen.X.8v> */
    /* JADX WARN: Incorrect condition in loop: B:5:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A01(java.util.List<java.lang.ref.WeakReference<T>> r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L2d
            r3 = 0
            r2 = 0
        L4:
            int r0 = r5.size()
            if (r2 >= r0) goto L1f
            java.lang.Object r1 = r5.get(r2)
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L1c
            int r0 = r3 + 1
            r5.set(r3, r1)
            r3 = r0
        L1c:
            int r2 = r2 + 1
            goto L4
        L1f:
            int r0 = r5.size()
            int r0 = r0 + (-1)
        L25:
            if (r0 < r3) goto L2d
            r5.remove(r0)
            int r0 = r0 + (-1)
            goto L25
        L2d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C113998w.A01(java.util.List):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8w != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.8x, E extends com.facebook.ads.redexgen.X.8v> */
    public final synchronized void A03(T... subscribers) {
        if (subscribers == null) {
            return;
        }
        for (T t : subscribers) {
            A05(t);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8w != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.8x, E extends com.facebook.ads.redexgen.X.8v> */
    public final synchronized void A04(T... subscribers) {
        if (subscribers == null) {
            return;
        }
        for (T t : subscribers) {
            A06(t);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8w != com.facebook.ads.internal.events.EventBus<T extends com.facebook.ads.redexgen.X.8x, E extends com.facebook.ads.redexgen.X.8v> */
    public final synchronized boolean A06(T subscriber) {
        if (subscriber == null) {
            return false;
        }
        List<WeakReference<T>> list = this.A00.get(subscriber.A01());
        if (list == null) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).get() == subscriber) {
                list.get(i).clear();
                return true;
            }
        }
        return false;
    }
}
