package com.ironsource.mediationsdk.logger;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* renamed from: com.ironsource.mediationsdk.logger.b */
/* loaded from: classes6.dex */
public class C20414b extends IronSourceLogger {

    /* renamed from: e */
    private static final String f51658e = "publisher";

    /* renamed from: c */
    private LogListener f51659c;

    /* renamed from: d */
    private boolean f51660d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.mediationsdk.logger.b$a */
    /* loaded from: classes6.dex */
    public class RunnableC20415a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f51661a;

        /* renamed from: b */
        final /* synthetic */ IronSourceLogger.IronSourceTag f51662b;

        /* renamed from: c */
        final /* synthetic */ int f51663c;

        RunnableC20415a(String str, IronSourceLogger.IronSourceTag ironSourceTag, int i) {
            this.f51661a = str;
            this.f51662b = ironSourceTag;
            this.f51663c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C20414b.this.f51659c != null && this.f51661a != null) {
                C20414b.this.f51659c.onLog(this.f51662b, this.f51661a, this.f51663c);
            }
        }
    }

    private C20414b() {
        super("publisher");
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        RunnableC20415a runnableC20415a = new RunnableC20415a(str, ironSourceTag, i);
        if (this.f51660d) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(runnableC20415a);
        } else {
            IronSourceThreadManager.INSTANCE.postPublisherCallback(runnableC20415a);
        }
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th != null) {
            log(ironSourceTag, th.getMessage(), 3);
        }
    }

    public C20414b(LogListener logListener, int i) {
        super("publisher", i);
        this.f51659c = logListener;
        this.f51660d = false;
    }

    /* renamed from: a */
    public void m56770a(LogListener logListener) {
        this.f51659c = logListener;
    }

    /* renamed from: a */
    public void m56768a(boolean z) {
        this.f51660d = z;
    }
}
