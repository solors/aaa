package com.maticoo.sdk.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public class HandlerUtil {
    private static final Handler HANDLER = new Handler(Looper.getMainLooper());

    /* loaded from: classes6.dex */
    public static class HandlerHolder extends Handler {
        WeakReference<OnReceiveMessageListener> mListenerWeakReference;

        public HandlerHolder(OnReceiveMessageListener onReceiveMessageListener) {
            this(onReceiveMessageListener, Looper.myLooper());
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            OnReceiveMessageListener onReceiveMessageListener;
            WeakReference<OnReceiveMessageListener> weakReference = this.mListenerWeakReference;
            if (weakReference != null && (onReceiveMessageListener = weakReference.get()) != null) {
                onReceiveMessageListener.handlerMessage(message);
            }
        }

        public HandlerHolder(OnReceiveMessageListener onReceiveMessageListener, Looper looper) {
            super(looper);
            if (onReceiveMessageListener != null) {
                this.mListenerWeakReference = new WeakReference<>(onReceiveMessageListener);
            }
        }
    }

    /* loaded from: classes6.dex */
    public interface OnReceiveMessageListener {
        void handlerMessage(Message message);
    }

    private HandlerUtil() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void remove(@NonNull Runnable runnable) {
        HANDLER.removeCallbacks(runnable);
    }

    public static void runOnUiThread(@NonNull Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            HANDLER.post(runnable);
        }
    }

    public static void runOnUiThread(@NonNull Runnable runnable, long j) {
        HANDLER.postDelayed(runnable, j);
    }
}
