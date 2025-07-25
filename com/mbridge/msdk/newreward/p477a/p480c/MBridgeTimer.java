package com.mbridge.msdk.newreward.p477a.p480c;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mbridge.msdk.newreward.a.c.a */
/* loaded from: classes6.dex */
public class MBridgeTimer {

    /* renamed from: a */
    private static volatile MBridgeTimer f58117a;

    /* renamed from: b */
    private Map<String, RunnableC22335c> f58118b;

    /* renamed from: c */
    private Handler f58119c;

    /* compiled from: MBridgeTimer.java */
    /* renamed from: com.mbridge.msdk.newreward.a.c.a$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC22333a {
        /* renamed from: a */
        void mo50400a(String str, long j);
    }

    /* compiled from: MBridgeTimer.java */
    /* renamed from: com.mbridge.msdk.newreward.a.c.a$b */
    /* loaded from: classes6.dex */
    private static final class C22334b {

        /* renamed from: a */
        private final String f58120a;

        /* renamed from: b */
        private final long f58121b;

        /* renamed from: c */
        private boolean f58122c;

        public C22334b(String str, long j) {
            this.f58120a = str;
            this.f58121b = j;
        }
    }

    /* compiled from: MBridgeTimer.java */
    /* renamed from: com.mbridge.msdk.newreward.a.c.a$c */
    /* loaded from: classes6.dex */
    public static class RunnableC22335c implements Runnable {

        /* renamed from: a */
        private final C22334b f58123a;

        /* renamed from: b */
        private final InterfaceC22333a f58124b;

        public RunnableC22335c(C22334b c22334b, InterfaceC22333a interfaceC22333a) {
            this.f58123a = c22334b;
            this.f58124b = interfaceC22333a;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC22333a interfaceC22333a;
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51827a("MBridgeTimer", "TimerTask run taskID: " + this.f58123a.f58120a + " isStop: " + this.f58123a.f58122c);
            }
            if (this.f58123a.f58122c || (interfaceC22333a = this.f58124b) == null) {
                return;
            }
            try {
                interfaceC22333a.mo50400a(this.f58123a.f58120a, this.f58123a.f58121b);
            } catch (Exception unused) {
            }
        }
    }

    public MBridgeTimer() {
        HandlerThread handlerThread = new HandlerThread("MBridgeTimerThread");
        handlerThread.start();
        this.f58119c = new Handler(handlerThread.getLooper());
        this.f58118b = new HashMap();
    }

    /* renamed from: a */
    public static MBridgeTimer m50850a() {
        if (f58117a == null) {
            synchronized (MBridgeTimer.class) {
                if (f58117a == null) {
                    f58117a = new MBridgeTimer();
                }
            }
        }
        return f58117a;
    }

    /* renamed from: a */
    public final void m50848a(String str, long j, InterfaceC22333a interfaceC22333a) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (MBridgeConstans.DEBUG) {
            SameLogTool.m51827a("MBridgeTimer", "startTimer taskID: " + str + " timeout: " + j);
        }
        if (this.f58118b.containsKey(str)) {
            return;
        }
        RunnableC22335c runnableC22335c = new RunnableC22335c(new C22334b(str, j), interfaceC22333a);
        this.f58118b.put(str, runnableC22335c);
        this.f58119c.postDelayed(runnableC22335c, j);
    }

    /* renamed from: a */
    public final void m50849a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        RunnableC22335c remove = this.f58118b.remove(str);
        if (MBridgeConstans.DEBUG) {
            SameLogTool.m51827a("MBridgeTimer", "stopTimer taskID: " + str);
        }
        if (remove != null) {
            remove.f58123a.f58122c = true;
            this.f58119c.removeCallbacks(remove);
        }
    }
}
