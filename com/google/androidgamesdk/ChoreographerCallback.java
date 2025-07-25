package com.google.androidgamesdk;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Choreographer;

/* loaded from: classes5.dex */
public class ChoreographerCallback implements Choreographer.FrameCallback {
    private static final String LOG_TAG = "ChoreographerCallback";
    private long mCookie;
    private C16631b mLooper;

    /* renamed from: com.google.androidgamesdk.ChoreographerCallback$a */
    /* loaded from: classes5.dex */
    class RunnableC16630a implements Runnable {
        RunnableC16630a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Choreographer.getInstance().postFrameCallback(ChoreographerCallback.this);
        }
    }

    /* renamed from: com.google.androidgamesdk.ChoreographerCallback$b */
    /* loaded from: classes5.dex */
    private class C16631b extends Thread {

        /* renamed from: a */
        public Handler f39294a;

        private C16631b(ChoreographerCallback choreographerCallback) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Log.i(ChoreographerCallback.LOG_TAG, "Starting looper thread");
            Looper.prepare();
            this.f39294a = new Handler();
            Looper.loop();
            Log.i(ChoreographerCallback.LOG_TAG, "Terminating looper thread");
        }
    }

    public ChoreographerCallback(long j) {
        this.mCookie = j;
        C16631b c16631b = new C16631b();
        this.mLooper = c16631b;
        c16631b.start();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        nOnChoreographer(this.mCookie, j);
    }

    public native void nOnChoreographer(long j, long j2);

    public void postFrameCallback() {
        this.mLooper.f39294a.post(new RunnableC16630a());
    }

    public void postFrameCallbackDelayed(long j) {
        Choreographer.getInstance().postFrameCallbackDelayed(this, j);
    }

    public void terminate() {
        this.mLooper.f39294a.getLooper().quit();
    }
}
