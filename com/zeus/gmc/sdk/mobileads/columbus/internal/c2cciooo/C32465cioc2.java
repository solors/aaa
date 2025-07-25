package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.cioc2 */
/* loaded from: classes8.dex */
public class C32465cioc2 {
    public static final ExecutorService c2oc2i = coi222o222();
    public static final ExecutorService cioccoiococ = coo2iico();
    private static String coi222o222 = "single";
    private static String coo2iico = "urgent";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.cioc2$coo2iico */
    /* loaded from: classes8.dex */
    public class ThreadFactoryC32466coo2iico implements ThreadFactory {
        final /* synthetic */ int c2oc2i;
        final /* synthetic */ String coi222o222;
        int coo2iico = 0;

        ThreadFactoryC32466coo2iico(String str, int i) {
            this.coi222o222 = str;
            this.c2oc2i = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            this.coo2iico++;
            Thread thread = new Thread(runnable, "ad-plugin-" + this.coi222o222 + "-" + this.coo2iico);
            thread.setDaemon(false);
            thread.setPriority(this.c2oc2i);
            return thread;
        }
    }

    private static ThreadPoolExecutor coi222o222() {
        return new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), coo2iico(coo2iico, 10));
    }

    private static ThreadPoolExecutor coo2iico() {
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), coo2iico(coi222o222, 5));
    }

    private static ThreadFactory coo2iico(String str, int i) {
        return new ThreadFactoryC32466coo2iico(str, i);
    }
}
