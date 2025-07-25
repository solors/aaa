package com.amazon.aps.shared.util;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.amazon.aps.shared.util.ApsAsyncUtil;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes2.dex */
public class ApsAsyncUtil {
    private static ApsAsyncUtil INSTANCE = null;
    private static final String TAG = "ApsAsyncUtil";
    private final ExecutorService executorService = Executors.newFixedThreadPool(1);
    private boolean shutdownInProgress = false;

    /* loaded from: classes2.dex */
    public interface ApsExecutionListener<T> {
        void onExecutionCompleted(ApsResult apsResult, T t);
    }

    /* loaded from: classes2.dex */
    public interface ApsReturnRunnable<T> {
        T run();
    }

    private ApsAsyncUtil() {
        Runtime.getRuntime().addShutdownHook(new Thread() { // from class: com.amazon.aps.shared.util.ApsAsyncUtil.1
            {
                ApsAsyncUtil.this = this;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    ApsAsyncUtil.this.shutdownInProgress = true;
                    Log.d(ApsAsyncUtil.TAG, "App is shutting down, terminating the thread executor");
                    ApsAsyncUtil.this.executorService.shutdown();
                } catch (RuntimeException e) {
                    Log.e(ApsAsyncUtil.TAG, "Error in stopping the executor", e);
                }
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ void m102694a(ApsReturnRunnable apsReturnRunnable, ApsExecutionListener apsExecutionListener) {
        lambda$runAsyncAndCallbackOnUiThread$3(apsReturnRunnable, apsExecutionListener);
    }

    /* renamed from: b */
    public static /* synthetic */ void m102693b(ApsReturnRunnable apsReturnRunnable, ApsExecutionListener apsExecutionListener) {
        lambda$runAsyncAndCallback$4(apsReturnRunnable, apsExecutionListener);
    }

    /* renamed from: c */
    public static /* synthetic */ void m102692c(ApsExecutionListener apsExecutionListener, ApsResult apsResult, Object obj) {
        lambda$runAsyncAndCallbackOnUiThread$2(apsExecutionListener, apsResult, obj);
    }

    /* renamed from: d */
    public static /* synthetic */ void m102691d(ApsReturnRunnable apsReturnRunnable, ApsExecutionListener apsExecutionListener) {
        lambda$runOnUiThreadAndAsyncCallback$1(apsReturnRunnable, apsExecutionListener);
    }

    /* renamed from: e */
    public static /* synthetic */ Object m102690e(Object obj) {
        return lambda$runOnUiThreadAndAsyncCallback$0(obj);
    }

    public static ApsAsyncUtil getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ApsAsyncUtil();
        }
        return INSTANCE;
    }

    public static /* synthetic */ void lambda$runAsyncAndCallback$4(ApsReturnRunnable apsReturnRunnable, ApsExecutionListener apsExecutionListener) {
        ApsResult apsResult = ApsResult.FAILURE;
        Object obj = null;
        try {
            try {
                obj = apsReturnRunnable.run();
                ApsResult apsResult2 = ApsResult.SUCCESS;
                if (apsExecutionListener != null) {
                    apsExecutionListener.onExecutionCompleted(apsResult2, obj);
                }
            } catch (Exception e) {
                Log.e(TAG, "Error running the thread", e);
                if (apsExecutionListener != null) {
                    apsExecutionListener.onExecutionCompleted(apsResult, obj);
                }
            }
        } catch (Throwable th) {
            if (apsExecutionListener != null) {
                apsExecutionListener.onExecutionCompleted(apsResult, obj);
            }
            throw th;
        }
    }

    public static /* synthetic */ void lambda$runAsyncAndCallbackOnUiThread$2(ApsExecutionListener apsExecutionListener, ApsResult apsResult, Object obj) {
        if (apsExecutionListener != null) {
            apsExecutionListener.onExecutionCompleted(apsResult, obj);
        }
    }

    public static /* synthetic */ void lambda$runAsyncAndCallbackOnUiThread$3(ApsReturnRunnable apsReturnRunnable, final ApsExecutionListener apsExecutionListener) {
        final ApsResult apsResult = ApsResult.FAILURE;
        final Object obj = null;
        try {
            try {
                obj = apsReturnRunnable.run();
                final ApsResult apsResult2 = ApsResult.SUCCESS;
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.aps.shared.util.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        ApsAsyncUtil.m102692c(ApsAsyncUtil.ApsExecutionListener.this, apsResult2, obj);
                    }
                });
            } catch (Exception e) {
                Log.e(TAG, "Error running the thread", e);
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.aps.shared.util.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        ApsAsyncUtil.m102692c(ApsAsyncUtil.ApsExecutionListener.this, apsResult, obj);
                    }
                });
            }
        } catch (Throwable th) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.aps.shared.util.c
                @Override // java.lang.Runnable
                public final void run() {
                    ApsAsyncUtil.m102692c(ApsAsyncUtil.ApsExecutionListener.this, apsResult, obj);
                }
            });
            throw th;
        }
    }

    public static /* synthetic */ void lambda$runOnUiThreadAndAsyncCallback$1(ApsReturnRunnable apsReturnRunnable, ApsExecutionListener apsExecutionListener) {
        final Object obj;
        try {
            obj = apsReturnRunnable.run();
        } catch (RuntimeException unused) {
            obj = null;
        }
        if (apsExecutionListener != null) {
            getInstance().runAsyncAndCallback(new ApsReturnRunnable() { // from class: com.amazon.aps.shared.util.b
                @Override // com.amazon.aps.shared.util.ApsAsyncUtil.ApsReturnRunnable
                public final Object run() {
                    return ApsAsyncUtil.m102690e(obj);
                }
            }, apsExecutionListener);
        }
    }

    public synchronized <T> void runAsyncAndCallback(final ApsReturnRunnable<T> apsReturnRunnable, final ApsExecutionListener<T> apsExecutionListener) {
        APSSharedUtil.checkNullAndThrowException(apsReturnRunnable);
        try {
            if (!this.shutdownInProgress) {
                this.executorService.execute(new Runnable() { // from class: com.amazon.aps.shared.util.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        ApsAsyncUtil.m102693b(ApsAsyncUtil.ApsReturnRunnable.this, apsExecutionListener);
                    }
                });
            }
        } catch (RuntimeException e) {
            Log.e(TAG, "Error running the thread", e);
        }
    }

    public synchronized <T> void runAsyncAndCallbackOnUiThread(final ApsReturnRunnable<T> apsReturnRunnable, final ApsExecutionListener<T> apsExecutionListener) {
        APSSharedUtil.checkNullAndThrowException(apsReturnRunnable, apsExecutionListener);
        try {
            if (!this.shutdownInProgress) {
                this.executorService.execute(new Runnable() { // from class: com.amazon.aps.shared.util.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        ApsAsyncUtil.m102694a(ApsAsyncUtil.ApsReturnRunnable.this, apsExecutionListener);
                    }
                });
            }
        } catch (RuntimeException e) {
            Log.e(TAG, "Error running the thread", e);
        }
    }

    public <T> void runOnUiThreadAndAsyncCallback(final ApsReturnRunnable<T> apsReturnRunnable, final ApsExecutionListener<T> apsExecutionListener) {
        APSSharedUtil.checkNullAndThrowException(apsReturnRunnable);
        try {
            if (!this.shutdownInProgress) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.aps.shared.util.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ApsAsyncUtil.m102691d(ApsAsyncUtil.ApsReturnRunnable.this, apsExecutionListener);
                    }
                });
            }
        } catch (RuntimeException e) {
            Log.e(TAG, "Error running the thread", e);
        }
    }

    public static /* synthetic */ Object lambda$runOnUiThreadAndAsyncCallback$0(Object obj) {
        return obj;
    }
}
