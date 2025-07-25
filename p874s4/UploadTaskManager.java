package p874s4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p993u4.C44433l;

/* renamed from: s4.c */
/* loaded from: classes6.dex */
public class UploadTaskManager {

    /* renamed from: a */
    private ExecutorService f104075a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UploadTaskManager.java */
    /* renamed from: s4.c$b */
    /* loaded from: classes6.dex */
    public static class C39608b {

        /* renamed from: a */
        private static final UploadTaskManager f104076a = new UploadTaskManager();
    }

    /* renamed from: a */
    public static /* synthetic */ void m12152a(Runnable runnable) {
        m12148e(runnable);
    }

    /* renamed from: b */
    public static /* synthetic */ Thread m12151b(Runnable runnable) {
        return m12149d(runnable);
    }

    /* renamed from: c */
    public static UploadTaskManager m12150c() {
        return C39608b.f104076a;
    }

    /* renamed from: d */
    public static /* synthetic */ Thread m12149d(Runnable runnable) {
        return new Thread(runnable, "learnings_analyze_upload_task");
    }

    /* renamed from: e */
    public static /* synthetic */ void m12148e(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    public void m12147f(final Runnable runnable) {
        ExecutorService executorService = this.f104075a;
        if (executorService != null) {
            executorService.execute(new Runnable() { // from class: s4.b
                @Override // java.lang.Runnable
                public final void run() {
                    UploadTaskManager.m12152a(runnable);
                }
            });
        }
    }

    private UploadTaskManager() {
        this.f104075a = null;
        try {
            this.f104075a = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: s4.a
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return UploadTaskManager.m12151b(runnable);
                }
            });
        } catch (Exception e) {
            C44433l.m2992f(e);
        }
    }
}
