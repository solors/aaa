package net.pubnative.lite.sdk.vpaid.helpers;

/* loaded from: classes10.dex */
public class SimpleTimer extends CountDownTimer {
    private final Listener mListener;

    /* loaded from: classes10.dex */
    public interface Listener {
        void onFinish();

        void onTick(long j);
    }

    public SimpleTimer(long j, Listener listener) {
        super(j, 60000L);
        this.mListener = listener;
    }

    @Override // net.pubnative.lite.sdk.vpaid.helpers.CountDownTimer
    public void onFinish() {
        Listener listener = this.mListener;
        if (listener != null) {
            listener.onFinish();
        }
    }

    @Override // net.pubnative.lite.sdk.vpaid.helpers.CountDownTimer
    public void onTick(long j) {
        this.mListener.onTick(j);
    }

    public void pauseTimer() {
        pause();
    }

    public void resumeTimer() {
        resume();
    }

    public SimpleTimer(long j, Listener listener, long j2) {
        super(j, j2);
        this.mListener = listener;
    }
}
