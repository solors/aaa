package com.bytedance.sdk.openadsdk.core.p337iR;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.settings.InterfaceC9010ldr;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.bytedance.sdk.openadsdk.core.iR.bg */
/* loaded from: classes3.dex */
public class C8933bg {

    /* renamed from: IL */
    private static volatile boolean f19749IL;

    /* renamed from: bX */
    private static volatile long f19750bX;

    /* renamed from: bg */
    private static volatile C8933bg f19751bg;
    private final Queue<C8935bg> eqN = new LinkedList();
    private final InterfaceC9010ldr ldr = C8838VzQ.eqN();

    /* renamed from: zx */
    private Handler f19752zx;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.sdk.openadsdk.core.iR.bg$bg */
    /* loaded from: classes3.dex */
    public static class C8935bg {

        /* renamed from: IL */
        private final String f19754IL;

        /* renamed from: bg */
        private final long f19755bg;

        private C8935bg(long j, String str) {
            this.f19755bg = j;
            this.f19754IL = str;
        }
    }

    private C8933bg() {
    }

    /* renamed from: IL */
    private synchronized boolean m84384IL(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        int kMt = this.ldr.kMt();
        long rri = this.ldr.rri();
        if (this.eqN.size() > 0 && this.eqN.size() >= kMt) {
            long abs = Math.abs(currentTimeMillis - this.eqN.peek().f19755bg);
            if (abs <= rri) {
                m84385IL(rri - abs);
                return true;
            }
            this.eqN.poll();
            this.eqN.offer(new C8935bg(currentTimeMillis, str));
        } else {
            this.eqN.offer(new C8935bg(currentTimeMillis, str));
        }
        return false;
    }

    /* renamed from: bX */
    public synchronized String m84383bX() {
        String str;
        HashMap hashMap = new HashMap();
        for (C8935bg c8935bg : this.eqN) {
            if (hashMap.containsKey(c8935bg.f19754IL)) {
                hashMap.put(c8935bg.f19754IL, Integer.valueOf(((Integer) hashMap.get(c8935bg.f19754IL)).intValue() + 1));
            } else {
                hashMap.put(c8935bg.f19754IL, 1);
            }
        }
        str = "";
        int i = Integer.MIN_VALUE;
        for (String str2 : hashMap.keySet()) {
            int intValue = ((Integer) hashMap.get(str2)).intValue();
            if (i < intValue) {
                str = str2;
                i = intValue;
            }
        }
        return str;
    }

    /* renamed from: bg */
    public static C8933bg m84382bg() {
        if (f19751bg == null) {
            synchronized (C8933bg.class) {
                if (f19751bg == null) {
                    f19751bg = new C8933bg();
                }
            }
        }
        return f19751bg;
    }

    /* renamed from: bg */
    public synchronized boolean m84379bg(String str) {
        if (m84384IL(str)) {
            bg(true);
            m84381bg(f19750bX);
        } else {
            bg(false);
        }
        return f19749IL;
    }

    /* renamed from: bg */
    private synchronized void m84381bg(long j) {
        if (this.f19752zx == null) {
            this.f19752zx = new Handler(Looper.getMainLooper());
        }
        this.f19752zx.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.iR.bg.1
            @Override // java.lang.Runnable
            public void run() {
                C8933bg.this.bg(false);
            }
        }, j);
    }

    /* renamed from: IL */
    public synchronized boolean m84386IL() {
        return f19749IL;
    }

    /* renamed from: IL */
    private synchronized void m84385IL(long j) {
        f19750bX = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void bg(boolean z) {
        f19749IL = z;
    }
}
