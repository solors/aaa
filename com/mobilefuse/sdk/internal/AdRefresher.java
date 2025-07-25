package com.mobilefuse.sdk.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.StabilityHelper;

/* loaded from: classes7.dex */
public class AdRefresher {
    private boolean active;
    private boolean completed;
    private Context context;
    private Listener listener;
    private boolean paused;
    private long pausedTimestamp;
    private long refreshDelayInSeconds;
    private long startedTimestamp;
    private Handler handler = new Handler(Looper.getMainLooper());
    private boolean enabled = false;
    private Runnable refreshTask = new Runnable() { // from class: com.mobilefuse.sdk.internal.a
        @Override // java.lang.Runnable
        public final void run() {
            AdRefresher.m47783a(AdRefresher.this);
        }
    };

    /* loaded from: classes7.dex */
    public interface Listener {
        void onAdRefresh() throws Throwable;
    }

    public AdRefresher(Context context, long j, Listener listener) throws Throwable {
        this.context = context;
        this.refreshDelayInSeconds = j;
        this.listener = listener;
    }

    /* renamed from: a */
    public static /* synthetic */ void m47783a(AdRefresher adRefresher) {
        adRefresher.lambda$new$0();
    }

    public /* synthetic */ void lambda$new$0() {
        try {
            Listener listener = this.listener;
            if (listener != null) {
                this.active = false;
                this.completed = true;
                this.startedTimestamp = 0L;
                listener.onAdRefresh();
            }
        } catch (Throwable th) {
            StabilityHelper.logException(this, th);
        }
    }

    public long getRefreshDelay() {
        return this.refreshDelayInSeconds;
    }

    public boolean isActive() {
        return this.active;
    }

    public boolean isCompleted() {
        return this.completed;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void pause() throws Throwable {
        if (this.enabled && this.active) {
            this.paused = true;
            this.active = false;
            this.pausedTimestamp = System.currentTimeMillis();
            this.handler.removeCallbacks(this.refreshTask);
        }
    }

    public void reset() throws Throwable {
        this.completed = false;
        this.active = false;
        this.paused = false;
        this.startedTimestamp = 0L;
        this.pausedTimestamp = 0L;
        this.handler.removeCallbacks(this.refreshTask);
    }

    public void setEnabled(boolean z) throws Throwable {
        this.enabled = z;
        if (!z) {
            reset();
        }
    }

    public void setRefreshDelay(long j) throws Throwable {
        this.refreshDelayInSeconds = j;
        if (this.active) {
            reset();
            start();
        }
    }

    public void start() throws Throwable {
        if (this.enabled && !this.active) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = this.refreshDelayInSeconds * 1000;
            long j2 = this.startedTimestamp;
            if (j2 == 0 && !this.paused) {
                this.startedTimestamp = currentTimeMillis;
            } else {
                j -= this.pausedTimestamp - j2;
            }
            this.pausedTimestamp = 0L;
            this.active = true;
            this.paused = false;
            MobileFuse.logDebug("started refresher with delay: " + j);
            this.handler.postDelayed(this.refreshTask, j);
        }
    }
}
