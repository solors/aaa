package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;

/* renamed from: com.mbridge.msdk.foundation.tools.t */
/* loaded from: classes6.dex */
public final class LimitExecutor implements Executor {

    /* renamed from: a */
    private Runnable f57021a;

    /* renamed from: b */
    private Runnable f57022b;

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (this.f57021a == null) {
            this.f57021a = m51614a(runnable);
            FastKVConfig.m51622a().execute(this.f57021a);
        } else if (this.f57022b == null) {
            this.f57022b = m51614a(runnable);
        }
    }

    /* renamed from: a */
    private Runnable m51614a(final Runnable runnable) {
        return new Runnable() { // from class: com.mbridge.msdk.foundation.tools.t.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    try {
                        runnable.run();
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            SameLogTool.m51824b("LimitExecutor", e.getMessage());
                        }
                    }
                } finally {
                    LimitExecutor.this.m51616a();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m51616a() {
        Runnable runnable = this.f57022b;
        this.f57021a = runnable;
        this.f57022b = null;
        if (runnable != null) {
            FastKVConfig.m51622a().execute(this.f57021a);
        }
    }
}
