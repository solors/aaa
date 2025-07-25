package com.pubmatic.sdk.common.utility;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public abstract class POBCountdownTimer {

    /* renamed from: a */
    private final long f70275a;

    /* renamed from: b */
    private final long f70276b;

    /* renamed from: c */
    private long f70277c;

    /* renamed from: d */
    private long f70278d;

    /* renamed from: e */
    private final Handler f70279e;

    /* renamed from: f */
    private EnumC26727b f70280f = EnumC26727b.DEFAULT;

    /* renamed from: com.pubmatic.sdk.common.utility.POBCountdownTimer$a */
    /* loaded from: classes7.dex */
    private class HandlerC26726a extends Handler {
        HandlerC26726a(@NonNull Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            synchronized (POBCountdownTimer.this) {
                if (POBCountdownTimer.this.f70280f != EnumC26727b.PAUSE) {
                    long j = POBCountdownTimer.this.f70277c;
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    long seconds = j - timeUnit.toSeconds(SystemClock.elapsedRealtime());
                    if (seconds <= 0) {
                        EnumC26727b enumC26727b = POBCountdownTimer.this.f70280f;
                        EnumC26727b enumC26727b2 = EnumC26727b.FINISH;
                        if (enumC26727b != enumC26727b2) {
                            POBCountdownTimer.this.onFinish();
                            POBCountdownTimer.this.f70280f = enumC26727b2;
                        }
                    } else if (seconds < POBCountdownTimer.this.f70276b) {
                        sendMessageDelayed(obtainMessage(1), TimeUnit.SECONDS.toMillis(seconds));
                    } else {
                        long seconds2 = timeUnit.toSeconds(SystemClock.elapsedRealtime());
                        POBCountdownTimer.this.onTick(seconds);
                        long seconds3 = (seconds2 + POBCountdownTimer.this.f70276b) - timeUnit.toSeconds(SystemClock.elapsedRealtime());
                        while (seconds3 < 0) {
                            seconds3 += POBCountdownTimer.this.f70276b;
                        }
                        if (POBCountdownTimer.this.f70280f != EnumC26727b.CANCEL && POBCountdownTimer.this.f70280f != EnumC26727b.FINISH) {
                            sendMessageDelayed(obtainMessage(1), TimeUnit.SECONDS.toMillis(seconds3));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.pubmatic.sdk.common.utility.POBCountdownTimer$b */
    /* loaded from: classes7.dex */
    private enum EnumC26727b {
        DEFAULT,
        START,
        PAUSE,
        CANCEL,
        FINISH
    }

    public POBCountdownTimer(long j, long j2, @NonNull Looper looper) {
        this.f70275a = j;
        this.f70276b = j2;
        this.f70279e = new HandlerC26726a(looper);
    }

    public final void cancel() {
        this.f70279e.removeMessages(1);
        this.f70280f = EnumC26727b.CANCEL;
    }

    public abstract void onFinish();

    public abstract void onTick(long j);

    public long pause() {
        if (this.f70280f == EnumC26727b.START) {
            this.f70278d = this.f70277c - TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime());
            this.f70280f = EnumC26727b.PAUSE;
        }
        return this.f70278d;
    }

    public long resume() {
        if (this.f70280f == EnumC26727b.PAUSE) {
            this.f70277c = this.f70278d + TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime());
            this.f70280f = EnumC26727b.START;
            Handler handler = this.f70279e;
            handler.sendMessage(handler.obtainMessage(1));
        }
        return this.f70278d;
    }

    public final synchronized POBCountdownTimer start() {
        if (this.f70275a <= 0) {
            onFinish();
            this.f70280f = EnumC26727b.FINISH;
            return this;
        }
        this.f70277c = TimeUnit.MILLISECONDS.toSeconds(SystemClock.elapsedRealtime()) + this.f70275a;
        this.f70278d = 0L;
        Handler handler = this.f70279e;
        handler.sendMessage(handler.obtainMessage(1));
        this.f70280f = EnumC26727b.START;
        return this;
    }
}
