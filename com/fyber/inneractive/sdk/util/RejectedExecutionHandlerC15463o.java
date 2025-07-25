package com.fyber.inneractive.sdk.util;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: com.fyber.inneractive.sdk.util.o */
/* loaded from: classes4.dex */
public final class RejectedExecutionHandlerC15463o implements RejectedExecutionHandler {
    @Override // java.util.concurrent.RejectedExecutionHandler
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        IAlog.m76529a("rejectedExecution received for - %s", runnable);
    }
}
