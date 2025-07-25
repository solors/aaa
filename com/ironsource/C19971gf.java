package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;

/* renamed from: com.ironsource.gf */
/* loaded from: classes6.dex */
public class C19971gf extends C20513n7 {

    /* renamed from: d */
    private static final C19971gf f50202d = new C19971gf();

    /* renamed from: b */
    private LevelPlayInterstitialListener f50203b = null;

    /* renamed from: c */
    private LevelPlayInterstitialListener f50204c = null;

    /* renamed from: com.ironsource.gf$a */
    /* loaded from: classes6.dex */
    class RunnableC19972a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f50205a;

        RunnableC19972a(AdInfo adInfo) {
            this.f50205a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C19971gf.this.f50203b != null) {
                C19971gf.this.f50203b.onAdShowSucceeded(C19971gf.this.m56177a(this.f50205a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdShowSucceeded() adInfo = " + C19971gf.this.m56177a(this.f50205a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.gf$b */
    /* loaded from: classes6.dex */
    public class RunnableC19973b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IronSourceError f50207a;

        /* renamed from: b */
        final /* synthetic */ AdInfo f50208b;

        RunnableC19973b(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f50207a = ironSourceError;
            this.f50208b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C19971gf.this.f50204c != null) {
                C19971gf.this.f50204c.onAdShowFailed(this.f50207a, C19971gf.this.m56177a(this.f50208b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdShowFailed() adInfo = " + C19971gf.this.m56177a(this.f50208b) + ", error = " + this.f50207a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.gf$c */
    /* loaded from: classes6.dex */
    public class RunnableC19974c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IronSourceError f50210a;

        /* renamed from: b */
        final /* synthetic */ AdInfo f50211b;

        RunnableC19974c(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f50210a = ironSourceError;
            this.f50211b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C19971gf.this.f50203b != null) {
                C19971gf.this.f50203b.onAdShowFailed(this.f50210a, C19971gf.this.m56177a(this.f50211b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdShowFailed() adInfo = " + C19971gf.this.m56177a(this.f50211b) + ", error = " + this.f50210a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.gf$d */
    /* loaded from: classes6.dex */
    class RunnableC19975d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f50213a;

        RunnableC19975d(AdInfo adInfo) {
            this.f50213a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C19971gf.this.f50204c != null) {
                C19971gf.this.f50204c.onAdClicked(C19971gf.this.m56177a(this.f50213a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClicked() adInfo = " + C19971gf.this.m56177a(this.f50213a));
            }
        }
    }

    /* renamed from: com.ironsource.gf$e */
    /* loaded from: classes6.dex */
    class RunnableC19976e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f50215a;

        RunnableC19976e(AdInfo adInfo) {
            this.f50215a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C19971gf.this.f50203b != null) {
                C19971gf.this.f50203b.onAdClicked(C19971gf.this.m56177a(this.f50215a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClicked() adInfo = " + C19971gf.this.m56177a(this.f50215a));
            }
        }
    }

    /* renamed from: com.ironsource.gf$f */
    /* loaded from: classes6.dex */
    class RunnableC19977f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f50217a;

        RunnableC19977f(AdInfo adInfo) {
            this.f50217a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C19971gf.this.f50204c != null) {
                C19971gf.this.f50204c.onAdReady(C19971gf.this.m56177a(this.f50217a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdReady() adInfo = " + C19971gf.this.m56177a(this.f50217a));
            }
        }
    }

    /* renamed from: com.ironsource.gf$g */
    /* loaded from: classes6.dex */
    class RunnableC19978g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f50219a;

        RunnableC19978g(AdInfo adInfo) {
            this.f50219a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C19971gf.this.f50203b != null) {
                C19971gf.this.f50203b.onAdReady(C19971gf.this.m56177a(this.f50219a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdReady() adInfo = " + C19971gf.this.m56177a(this.f50219a));
            }
        }
    }

    /* renamed from: com.ironsource.gf$h */
    /* loaded from: classes6.dex */
    class RunnableC19979h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IronSourceError f50221a;

        RunnableC19979h(IronSourceError ironSourceError) {
            this.f50221a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C19971gf.this.f50204c != null) {
                C19971gf.this.f50204c.onAdLoadFailed(this.f50221a);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoadFailed() error = " + this.f50221a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.gf$i */
    /* loaded from: classes6.dex */
    class RunnableC19980i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IronSourceError f50223a;

        RunnableC19980i(IronSourceError ironSourceError) {
            this.f50223a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C19971gf.this.f50203b != null) {
                C19971gf.this.f50203b.onAdLoadFailed(this.f50223a);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoadFailed() error = " + this.f50223a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.gf$j */
    /* loaded from: classes6.dex */
    class RunnableC19981j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f50225a;

        RunnableC19981j(AdInfo adInfo) {
            this.f50225a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C19971gf.this.f50204c != null) {
                C19971gf.this.f50204c.onAdOpened(C19971gf.this.m56177a(this.f50225a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdOpened() adInfo = " + C19971gf.this.m56177a(this.f50225a));
            }
        }
    }

    /* renamed from: com.ironsource.gf$k */
    /* loaded from: classes6.dex */
    class RunnableC19982k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f50227a;

        RunnableC19982k(AdInfo adInfo) {
            this.f50227a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C19971gf.this.f50203b != null) {
                C19971gf.this.f50203b.onAdOpened(C19971gf.this.m56177a(this.f50227a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdOpened() adInfo = " + C19971gf.this.m56177a(this.f50227a));
            }
        }
    }

    /* renamed from: com.ironsource.gf$l */
    /* loaded from: classes6.dex */
    class RunnableC19983l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f50229a;

        RunnableC19983l(AdInfo adInfo) {
            this.f50229a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C19971gf.this.f50204c != null) {
                C19971gf.this.f50204c.onAdClosed(C19971gf.this.m56177a(this.f50229a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClosed() adInfo = " + C19971gf.this.m56177a(this.f50229a));
            }
        }
    }

    /* renamed from: com.ironsource.gf$m */
    /* loaded from: classes6.dex */
    class RunnableC19984m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f50231a;

        RunnableC19984m(AdInfo adInfo) {
            this.f50231a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C19971gf.this.f50203b != null) {
                C19971gf.this.f50203b.onAdClosed(C19971gf.this.m56177a(this.f50231a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClosed() adInfo = " + C19971gf.this.m56177a(this.f50231a));
            }
        }
    }

    /* renamed from: com.ironsource.gf$n */
    /* loaded from: classes6.dex */
    class RunnableC19985n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f50233a;

        RunnableC19985n(AdInfo adInfo) {
            this.f50233a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C19971gf.this.f50204c != null) {
                C19971gf.this.f50204c.onAdShowSucceeded(C19971gf.this.m56177a(this.f50233a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdShowSucceeded() adInfo = " + C19971gf.this.m56177a(this.f50233a));
            }
        }
    }

    private C19971gf() {
    }

    /* renamed from: a */
    public static synchronized C19971gf m58436a() {
        C19971gf c19971gf;
        synchronized (C19971gf.class) {
            c19971gf = f50202d;
        }
        return c19971gf;
    }

    /* renamed from: c */
    public void m58424c(AdInfo adInfo) {
        if (this.f50204c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC19983l(adInfo));
        } else if (this.f50203b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC19984m(adInfo));
        }
    }

    /* renamed from: d */
    public void m58422d(AdInfo adInfo) {
        if (this.f50204c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC19981j(adInfo));
        } else if (this.f50203b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC19982k(adInfo));
        }
    }

    /* renamed from: e */
    public void m58420e(AdInfo adInfo) {
        if (this.f50204c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC19977f(adInfo));
        } else if (this.f50203b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC19978g(adInfo));
        }
    }

    /* renamed from: f */
    public void m58418f(AdInfo adInfo) {
        if (this.f50204c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC19985n(adInfo));
        } else if (this.f50203b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC19972a(adInfo));
        }
    }

    /* renamed from: b */
    public void m58427b(AdInfo adInfo) {
        if (this.f50204c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC19975d(adInfo));
        } else if (this.f50203b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC19976e(adInfo));
        }
    }

    /* renamed from: a */
    public void m58433a(IronSourceError ironSourceError) {
        if (this.f50204c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC19979h(ironSourceError));
        } else if (this.f50203b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC19980i(ironSourceError));
        }
    }

    /* renamed from: b */
    public synchronized void m58426b(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.f50204c = levelPlayInterstitialListener;
    }

    /* renamed from: a */
    public void m58432a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f50204c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC19973b(ironSourceError, adInfo));
        } else if (this.f50203b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC19974c(ironSourceError, adInfo));
        }
    }

    /* renamed from: a */
    public synchronized void m58431a(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        this.f50203b = levelPlayInterstitialListener;
    }

    /* renamed from: a */
    private void m58430a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }
}
