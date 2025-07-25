package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.FastKV;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.mbridge.msdk.foundation.tools.r */
/* loaded from: classes6.dex */
public final class FastKVConfig {

    /* renamed from: a */
    static volatile Executor f57019a;

    /* renamed from: b */
    static FastKV.InterfaceC22022b f57020b = new FastKV.InterfaceC22022b() { // from class: com.mbridge.msdk.foundation.tools.r.1
        @Override // com.mbridge.msdk.foundation.tools.FastKV.InterfaceC22022b
        /* renamed from: a */
        public final void mo51621a(String str, Exception exc) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51823b("FastKVConfig", str, exc);
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.FastKV.InterfaceC22022b
        /* renamed from: b */
        public final void mo51619b(String str, Exception exc) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51821c("FastKVConfig", str, exc);
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.FastKV.InterfaceC22022b
        /* renamed from: a */
        public final void mo51620a(String str, String str2) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51822c("FastKVConfig", str + " " + str2);
            }
        }
    };

    private FastKVConfig() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Executor m51622a() {
        if (f57019a == null) {
            synchronized (FastKVConfig.class) {
                if (f57019a == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(4, 4, 10L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.tools.r.2
                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            return new Thread(runnable, "mb-sp-handler");
                        }
                    }, new ThreadPoolExecutor.DiscardPolicy());
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    f57019a = threadPoolExecutor;
                }
            }
        }
        return f57019a;
    }
}
