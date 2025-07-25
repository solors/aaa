package com.fyber.inneractive.sdk.player.mediaplayer;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.fyber.inneractive.sdk.player.mediaplayer.g */
/* loaded from: classes4.dex */
public final class RunnableC15166g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C15175p f29966a;

    public RunnableC15166g(C15175p c15175p) {
        this.f29966a = c15175p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C15175p.m77111b(this.f29966a);
        Handler handler = this.f29966a.f29988o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f29966a.f29988o = null;
        }
        this.f29966a.f29987n = null;
        Looper.myLooper().quit();
    }
}
