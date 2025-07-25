package com.yandex.mobile.ads.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC31376sl;
import com.yandex.mobile.ads.impl.ml1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes8.dex */
public final class ld2 implements ml1.InterfaceC30864b {

    /* renamed from: a */
    private final HashMap f81776a = new HashMap();

    /* renamed from: b */
    private final wm1 f81777b;
    @Nullable

    /* renamed from: c */
    private final C31827xl f81778c;
    @Nullable

    /* renamed from: d */
    private final BlockingQueue<ml1<?>> f81779d;

    public ld2(@NonNull C31827xl c31827xl, @NonNull PriorityBlockingQueue priorityBlockingQueue, wm1 wm1Var) {
        this.f81777b = wm1Var;
        this.f81778c = c31827xl;
        this.f81779d = priorityBlockingQueue;
    }

    /* renamed from: a */
    public final synchronized boolean m32288a(ml1<?> ml1Var) {
        String m31950d = ml1Var.m31950d();
        if (this.f81776a.containsKey(m31950d)) {
            List list = (List) this.f81776a.get(m31950d);
            if (list == null) {
                list = new ArrayList();
            }
            ml1Var.m31958a("waiting-for-response");
            list.add(ml1Var);
            this.f81776a.put(m31950d, list);
            if (zc2.f88824a) {
                um0.m28728a(m31950d);
            }
            return true;
        }
        this.f81776a.put(m31950d, null);
        ml1Var.m31963a((ml1.InterfaceC30864b) this);
        if (zc2.f88824a) {
            um0.m28728a(m31950d);
        }
        return false;
    }

    /* renamed from: b */
    public final synchronized void m32286b(ml1<?> ml1Var) {
        BlockingQueue<ml1<?>> blockingQueue;
        String m31950d = ml1Var.m31950d();
        List list = (List) this.f81776a.remove(m31950d);
        if (list != null && !list.isEmpty()) {
            if (zc2.f88824a) {
                um0.m28724e(Integer.valueOf(list.size()), m31950d);
            }
            ml1<?> ml1Var2 = (ml1) list.remove(0);
            this.f81776a.put(m31950d, list);
            ml1Var2.m31963a((ml1.InterfaceC30864b) this);
            if (this.f81778c != null && (blockingQueue = this.f81779d) != null) {
                try {
                    blockingQueue.put(ml1Var2);
                } catch (InterruptedException e) {
                    um0.m28727b(e.toString());
                    Thread.currentThread().interrupt();
                    this.f81778c.m27467b();
                }
            }
        }
    }

    /* renamed from: a */
    public final void m32287a(ml1<?> ml1Var, om1<?> om1Var) {
        List<ml1<?>> list;
        InterfaceC31376sl.C31377a c31377a = om1Var.f83558b;
        if (c31377a != null && c31377a.f85297e >= System.currentTimeMillis()) {
            String m31950d = ml1Var.m31950d();
            synchronized (this) {
                list = (List) this.f81776a.remove(m31950d);
            }
            if (list != null) {
                if (zc2.f88824a) {
                    um0.m28724e(Integer.valueOf(list.size()), m31950d);
                }
                for (ml1<?> ml1Var2 : list) {
                    ((w30) this.f81777b).m28058a(ml1Var2, om1Var, null);
                }
                return;
            }
            return;
        }
        m32286b(ml1Var);
    }
}
