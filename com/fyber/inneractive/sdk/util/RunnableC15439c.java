package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.web.C15521e;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.fyber.inneractive.sdk.util.c */
/* loaded from: classes4.dex */
public final class RunnableC15439c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Object[] f30586a;

    /* renamed from: b */
    public final /* synthetic */ C15521e f30587b;

    public RunnableC15439c(C15521e c15521e) {
        this.f30587b = c15521e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30587b.getClass();
        C15521e c15521e = this.f30587b;
        boolean z = c15521e.f30751f;
        if (z) {
            return;
        }
        RunnableC15441d runnableC15441d = new RunnableC15441d(c15521e);
        c15521e.f30749d = runnableC15441d;
        if (z) {
            return;
        }
        try {
            c15521e.f30746a.execute(runnableC15441d);
        } catch (NullPointerException e) {
            IAlog.m76524f("AsyncTaskExecutor : execute(): Unable to execute the null task: %s", e.getMessage());
        } catch (RejectedExecutionException e2) {
            IAlog.m76524f("AsyncTaskExecutor : execute(): Unable to execute the task: %s", e2.getMessage());
        }
    }
}
