package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.g */
/* loaded from: classes4.dex */
public final class Choreographer$FrameCallbackC15141g implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: e */
    public static final Choreographer$FrameCallbackC15141g f29889e = new Choreographer$FrameCallbackC15141g();

    /* renamed from: a */
    public volatile long f29890a;

    /* renamed from: b */
    public final Handler f29891b;

    /* renamed from: c */
    public Choreographer f29892c;

    /* renamed from: d */
    public int f29893d;

    public Choreographer$FrameCallbackC15141g() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f29891b = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f29890a = j;
        this.f29892c.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                int i2 = this.f29893d - 1;
                this.f29893d = i2;
                if (i2 == 0) {
                    this.f29892c.removeFrameCallback(this);
                    this.f29890a = 0L;
                }
                return true;
            }
            int i3 = this.f29893d + 1;
            this.f29893d = i3;
            if (i3 == 1) {
                this.f29892c.postFrameCallback(this);
            }
            return true;
        }
        this.f29892c = Choreographer.getInstance();
        return true;
    }
}
