package com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.util.concurrent.Executor;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.coo2iico */
/* loaded from: classes8.dex */
public class C32585coo2iico {
    private static Handler c2oc2i = null;
    private static Executor coi222o222 = null;
    private static final String coo2iico = "AsyncTasks";

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.coo2iico$coo2iico */
    /* loaded from: classes8.dex */
    class RunnableC32586coo2iico implements Runnable {
        final /* synthetic */ Object[] coi222o222;
        final /* synthetic */ AsyncTask coo2iico;

        RunnableC32586coo2iico(AsyncTask asyncTask, Object[] objArr) {
            this.coo2iico = asyncTask;
            this.coi222o222 = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.coo2iico.executeOnExecutor(C32585coo2iico.coi222o222, this.coi222o222);
        }
    }

    static {
        coi222o222();
    }

    private C32585coo2iico() {
    }

    private static void coi222o222() {
        coi222o222 = AsyncTask.THREAD_POOL_EXECUTOR;
        c2oc2i = new Handler(Looper.getMainLooper());
    }

    public static void coo2iico(Executor executor) {
        coi222o222 = executor;
    }

    public static <P> void coo2iico(@NonNull AsyncTask<P, ?, ?> asyncTask, @Nullable P... pArr) {
        C32584coiic.coo2iico(asyncTask);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            asyncTask.executeOnExecutor(coi222o222, pArr);
            return;
        }
        MLog.m25892d(coo2iico, "Posting AsyncTask to main thread for execution.");
        c2oc2i.post(new RunnableC32586coo2iico(asyncTask, pArr));
    }
}
