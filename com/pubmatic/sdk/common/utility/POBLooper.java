package com.pubmatic.sdk.common.utility;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBNetworkMonitor;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@MainThread
/* loaded from: classes7.dex */
public class POBLooper {

    /* renamed from: a */
    private static final ScheduledThreadPoolExecutor f70305a = new ScheduledThreadPoolExecutor(1);

    /* renamed from: b */
    private boolean f70306b;
    @Nullable

    /* renamed from: c */
    private POBNetworkMonitor.POBConnectivityListener f70307c;
    @Nullable

    /* renamed from: d */
    private POBNetworkMonitor f70308d;
    @Nullable

    /* renamed from: e */
    private ScheduledFuture<?> f70309e = null;
    @Nullable

    /* renamed from: f */
    private LooperListener f70310f;

    /* renamed from: g */
    private boolean f70311g;

    /* renamed from: h */
    private boolean f70312h;

    /* renamed from: i */
    private long f70313i;

    @MainThread
    /* loaded from: classes7.dex */
    public interface LooperListener {
        void invoke();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.common.utility.POBLooper$a */
    /* loaded from: classes7.dex */
    public class C26731a implements POBNetworkMonitor.POBConnectivityListener {
        C26731a() {
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkMonitor.POBConnectivityListener
        public void onNetworkConnectionChanged(boolean z) {
            POBLooper.this.f70306b = z;
            POBLog.debug("POBLooper", "Network connectivity = " + POBLooper.this.f70306b, new Object[0]);
            POBLooper pOBLooper = POBLooper.this;
            pOBLooper.m40537a(pOBLooper.f70306b);
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkMonitor.POBConnectivityListener
        public void onNetworkRegistrationFailed() {
            POBLog.warn("POBLooper", "Network registration failed", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.common.utility.POBLooper$b */
    /* loaded from: classes7.dex */
    public class RunnableC26732b implements Runnable {
        RunnableC26732b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBUtils.runOnMainThread(new RunnableC26736a(this));
        }
    }

    /* renamed from: c */
    private void m40533c() {
        ScheduledFuture<?> scheduledFuture = this.f70309e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f70309e = null;
        }
    }

    /* renamed from: d */
    private void m40532d() {
        POBNetworkMonitor pOBNetworkMonitor;
        POBNetworkMonitor.POBConnectivityListener pOBConnectivityListener = this.f70307c;
        if (pOBConnectivityListener != null && (pOBNetworkMonitor = this.f70308d) != null) {
            pOBNetworkMonitor.unregisterConnectivityListener(pOBConnectivityListener);
            this.f70307c = null;
        }
    }

    public synchronized void destroy() {
        m40532d();
        m40533c();
        this.f70311g = false;
        this.f70312h = false;
    }

    public synchronized void forcePause() {
        if (!this.f70312h) {
            POBLog.verbose("POBLooper", "Applying force-paused state.", new Object[0]);
            this.f70312h = true;
            m40532d();
            pause();
        } else {
            POBLog.verbose("POBLooper", "Skipping pause as already in force-paused state.", new Object[0]);
        }
    }

    public synchronized void forceResume() {
        if (this.f70312h) {
            POBLog.verbose("POBLooper", "Removing force-paused state.", new Object[0]);
            this.f70312h = false;
            m40536b();
            resume();
        } else {
            POBLog.verbose("POBLooper", "Skipping resume as not in force-paused state.", new Object[0]);
        }
    }

    public synchronized void loop(long j) {
        this.f70311g = true;
        this.f70313i = j * 1000;
        m40533c();
        if (!this.f70312h) {
            POBLog.verbose("POBLooper", "Refreshing after %s seconds", m40541a(this.f70313i));
            m40540a(this.f70313i);
            m40536b();
        } else {
            POBLog.verbose("POBLooper", "Deferring refresh, expecting resumeAutoRefresh to continue the refresh", new Object[0]);
        }
    }

    public synchronized void pause() {
        if (this.f70311g) {
            ScheduledFuture<?> scheduledFuture = this.f70309e;
            if (scheduledFuture != null) {
                this.f70313i = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                this.f70309e.cancel(true);
                this.f70309e = null;
                POBLog.verbose("POBLooper", "Pausing refresh at %s seconds", m40541a(this.f70313i));
            }
        } else {
            POBLog.verbose("POBLooper", "Deferring pausing as not yet looped.", new Object[0]);
        }
    }

    public synchronized void resume() {
        if (this.f70312h) {
            POBLog.verbose("POBLooper", "Skipping resume as in force-paused state.", new Object[0]);
            return;
        }
        if (this.f70311g && this.f70306b) {
            POBLog.verbose("POBLooper", "Resuming refresh from %s seconds", m40541a(this.f70313i));
            m40540a(this.f70313i);
        }
    }

    public void setListener(@Nullable LooperListener looperListener) {
        this.f70310f = looperListener;
    }

    public void setNetworkMonitor(@NonNull POBNetworkMonitor pOBNetworkMonitor) {
        this.f70308d = pOBNetworkMonitor;
        this.f70306b = pOBNetworkMonitor.isNetworkAvailable();
    }

    @MainThread
    /* renamed from: a */
    private synchronized void m40540a(long j) {
        if (this.f70309e == null) {
            this.f70309e = f70305a.schedule(new RunnableC26732b(), j, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: b */
    private void m40536b() {
        if (this.f70307c != null || this.f70308d == null) {
            return;
        }
        this.f70307c = new C26731a();
        this.f70306b = this.f70308d.isNetworkAvailable();
        this.f70308d.registerConnectivityListener(this.f70307c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m40542a() {
        if (this.f70310f != null) {
            this.f70311g = false;
            POBLog.verbose("POBLooper", "Invoking scheduled method", new Object[0]);
            this.f70310f.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m40537a(boolean z) {
        if (z) {
            resume();
        } else {
            pause();
        }
    }

    /* renamed from: a */
    private String m40541a(double d) {
        return String.format(Locale.getDefault(), "%.2f", Double.valueOf(d / 1000.0d));
    }
}
