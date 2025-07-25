package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;

/* renamed from: com.ironsource.to */
/* loaded from: classes6.dex */
public class C21023to extends C20513n7 {

    /* renamed from: d */
    private static final C21023to f53575d = new C21023to();

    /* renamed from: b */
    private LevelPlayRewardedVideoBaseListener f53576b = null;

    /* renamed from: c */
    private LevelPlayRewardedVideoBaseListener f53577c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.to$a */
    /* loaded from: classes6.dex */
    public class RunnableC21024a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f53578a;

        /* renamed from: b */
        final /* synthetic */ AdInfo f53579b;

        RunnableC21024a(boolean z, AdInfo adInfo) {
            this.f53578a = z;
            this.f53579b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog ironLog;
            String str;
            if (C21023to.this.f53576b != null) {
                if (this.f53578a) {
                    ((LevelPlayRewardedVideoListener) C21023to.this.f53576b).onAdAvailable(C21023to.this.m56177a(this.f53579b));
                    ironLog = IronLog.CALLBACK;
                    str = "onAdAvailable() adInfo = " + C21023to.this.m56177a(this.f53579b);
                } else {
                    ((LevelPlayRewardedVideoListener) C21023to.this.f53576b).onAdUnavailable();
                    ironLog = IronLog.CALLBACK;
                    str = "onAdUnavailable()";
                }
                ironLog.info(str);
            }
        }
    }

    /* renamed from: com.ironsource.to$b */
    /* loaded from: classes6.dex */
    class RunnableC21025b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Placement f53581a;

        /* renamed from: b */
        final /* synthetic */ AdInfo f53582b;

        RunnableC21025b(Placement placement, AdInfo adInfo) {
            this.f53581a = placement;
            this.f53582b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C21023to.this.f53577c != null) {
                C21023to.this.f53577c.onAdRewarded(this.f53581a, C21023to.this.m56177a(this.f53582b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdRewarded() placement = " + this.f53581a + ", adInfo = " + C21023to.this.m56177a(this.f53582b));
            }
        }
    }

    /* renamed from: com.ironsource.to$c */
    /* loaded from: classes6.dex */
    class RunnableC21026c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Placement f53584a;

        /* renamed from: b */
        final /* synthetic */ AdInfo f53585b;

        RunnableC21026c(Placement placement, AdInfo adInfo) {
            this.f53584a = placement;
            this.f53585b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C21023to.this.f53576b != null) {
                C21023to.this.f53576b.onAdRewarded(this.f53584a, C21023to.this.m56177a(this.f53585b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdRewarded() placement = " + this.f53584a + ", adInfo = " + C21023to.this.m56177a(this.f53585b));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.to$d */
    /* loaded from: classes6.dex */
    public class RunnableC21027d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IronSourceError f53587a;

        /* renamed from: b */
        final /* synthetic */ AdInfo f53588b;

        RunnableC21027d(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f53587a = ironSourceError;
            this.f53588b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C21023to.this.f53577c != null) {
                C21023to.this.f53577c.onAdShowFailed(this.f53587a, C21023to.this.m56177a(this.f53588b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdShowFailed() adInfo = " + C21023to.this.m56177a(this.f53588b) + ", error = " + this.f53587a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.to$e */
    /* loaded from: classes6.dex */
    public class RunnableC21028e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IronSourceError f53590a;

        /* renamed from: b */
        final /* synthetic */ AdInfo f53591b;

        RunnableC21028e(IronSourceError ironSourceError, AdInfo adInfo) {
            this.f53590a = ironSourceError;
            this.f53591b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C21023to.this.f53576b != null) {
                C21023to.this.f53576b.onAdShowFailed(this.f53590a, C21023to.this.m56177a(this.f53591b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdShowFailed() adInfo = " + C21023to.this.m56177a(this.f53591b) + ", error = " + this.f53590a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.to$f */
    /* loaded from: classes6.dex */
    class RunnableC21029f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Placement f53593a;

        /* renamed from: b */
        final /* synthetic */ AdInfo f53594b;

        RunnableC21029f(Placement placement, AdInfo adInfo) {
            this.f53593a = placement;
            this.f53594b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C21023to.this.f53577c != null) {
                C21023to.this.f53577c.onAdClicked(this.f53593a, C21023to.this.m56177a(this.f53594b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClicked() placement = " + this.f53593a + ", adInfo = " + C21023to.this.m56177a(this.f53594b));
            }
        }
    }

    /* renamed from: com.ironsource.to$g */
    /* loaded from: classes6.dex */
    class RunnableC21030g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Placement f53596a;

        /* renamed from: b */
        final /* synthetic */ AdInfo f53597b;

        RunnableC21030g(Placement placement, AdInfo adInfo) {
            this.f53596a = placement;
            this.f53597b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C21023to.this.f53576b != null) {
                C21023to.this.f53576b.onAdClicked(this.f53596a, C21023to.this.m56177a(this.f53597b));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClicked() placement = " + this.f53596a + ", adInfo = " + C21023to.this.m56177a(this.f53597b));
            }
        }
    }

    /* renamed from: com.ironsource.to$h */
    /* loaded from: classes6.dex */
    class RunnableC21031h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f53599a;

        RunnableC21031h(AdInfo adInfo) {
            this.f53599a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C21023to.this.f53577c != null) {
                ((LevelPlayRewardedVideoManualListener) C21023to.this.f53577c).onAdReady(C21023to.this.m56177a(this.f53599a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdReady() adInfo = " + C21023to.this.m56177a(this.f53599a));
            }
        }
    }

    /* renamed from: com.ironsource.to$i */
    /* loaded from: classes6.dex */
    class RunnableC21032i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f53601a;

        RunnableC21032i(AdInfo adInfo) {
            this.f53601a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C21023to.this.f53576b != null) {
                ((LevelPlayRewardedVideoManualListener) C21023to.this.f53576b).onAdReady(C21023to.this.m56177a(this.f53601a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdReady() adInfo = " + C21023to.this.m56177a(this.f53601a));
            }
        }
    }

    /* renamed from: com.ironsource.to$j */
    /* loaded from: classes6.dex */
    class RunnableC21033j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IronSourceError f53603a;

        RunnableC21033j(IronSourceError ironSourceError) {
            this.f53603a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C21023to.this.f53577c != null) {
                ((LevelPlayRewardedVideoManualListener) C21023to.this.f53577c).onAdLoadFailed(this.f53603a);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoadFailed() error = " + this.f53603a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.to$k */
    /* loaded from: classes6.dex */
    class RunnableC21034k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IronSourceError f53605a;

        RunnableC21034k(IronSourceError ironSourceError) {
            this.f53605a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C21023to.this.f53576b != null) {
                ((LevelPlayRewardedVideoManualListener) C21023to.this.f53576b).onAdLoadFailed(this.f53605a);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoadFailed() error = " + this.f53605a.getErrorMessage());
            }
        }
    }

    /* renamed from: com.ironsource.to$l */
    /* loaded from: classes6.dex */
    class RunnableC21035l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f53607a;

        RunnableC21035l(AdInfo adInfo) {
            this.f53607a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C21023to.this.f53577c != null) {
                C21023to.this.f53577c.onAdOpened(C21023to.this.m56177a(this.f53607a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdOpened() adInfo = " + C21023to.this.m56177a(this.f53607a));
            }
        }
    }

    /* renamed from: com.ironsource.to$m */
    /* loaded from: classes6.dex */
    class RunnableC21036m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f53609a;

        RunnableC21036m(AdInfo adInfo) {
            this.f53609a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C21023to.this.f53576b != null) {
                C21023to.this.f53576b.onAdOpened(C21023to.this.m56177a(this.f53609a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdOpened() adInfo = " + C21023to.this.m56177a(this.f53609a));
            }
        }
    }

    /* renamed from: com.ironsource.to$n */
    /* loaded from: classes6.dex */
    class RunnableC21037n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f53611a;

        RunnableC21037n(AdInfo adInfo) {
            this.f53611a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C21023to.this.f53577c != null) {
                C21023to.this.f53577c.onAdClosed(C21023to.this.m56177a(this.f53611a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClosed() adInfo = " + C21023to.this.m56177a(this.f53611a));
            }
        }
    }

    /* renamed from: com.ironsource.to$o */
    /* loaded from: classes6.dex */
    class RunnableC21038o implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f53613a;

        RunnableC21038o(AdInfo adInfo) {
            this.f53613a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C21023to.this.f53576b != null) {
                C21023to.this.f53576b.onAdClosed(C21023to.this.m56177a(this.f53613a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClosed() adInfo = " + C21023to.this.m56177a(this.f53613a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.to$p */
    /* loaded from: classes6.dex */
    public class RunnableC21039p implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f53615a;

        /* renamed from: b */
        final /* synthetic */ AdInfo f53616b;

        RunnableC21039p(boolean z, AdInfo adInfo) {
            this.f53615a = z;
            this.f53616b = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog ironLog;
            String str;
            if (C21023to.this.f53577c != null) {
                if (this.f53615a) {
                    ((LevelPlayRewardedVideoListener) C21023to.this.f53577c).onAdAvailable(C21023to.this.m56177a(this.f53616b));
                    ironLog = IronLog.CALLBACK;
                    str = "onAdAvailable() adInfo = " + C21023to.this.m56177a(this.f53616b);
                } else {
                    ((LevelPlayRewardedVideoListener) C21023to.this.f53577c).onAdUnavailable();
                    ironLog = IronLog.CALLBACK;
                    str = "onAdUnavailable()";
                }
                ironLog.info(str);
            }
        }
    }

    private C21023to() {
    }

    /* renamed from: c */
    public void m54761c() {
    }

    /* renamed from: d */
    public void m54758d(AdInfo adInfo) {
        if (this.f53577c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC21031h(adInfo));
            return;
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f53576b;
        if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC21032i(adInfo));
    }

    /* renamed from: a */
    public static C21023to m54776a() {
        return f53575d;
    }

    /* renamed from: b */
    public void m54767b() {
    }

    /* renamed from: c */
    public void m54760c(AdInfo adInfo) {
        if (this.f53577c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC21035l(adInfo));
        } else if (this.f53576b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC21036m(adInfo));
        }
    }

    /* renamed from: a */
    public void m54775a(IronSourceError ironSourceError) {
        if (this.f53577c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC21033j(ironSourceError));
            return;
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f53576b;
        if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoManualListener)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC21034k(ironSourceError));
    }

    /* renamed from: b */
    public void m54766b(AdInfo adInfo) {
        if (this.f53577c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC21037n(adInfo));
        } else if (this.f53576b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC21038o(adInfo));
        }
    }

    /* renamed from: a */
    public void m54774a(IronSourceError ironSourceError, AdInfo adInfo) {
        if (this.f53577c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC21027d(ironSourceError, adInfo));
        } else if (this.f53576b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC21028e(ironSourceError, adInfo));
        }
    }

    /* renamed from: b */
    public void m54765b(Placement placement, AdInfo adInfo) {
        if (this.f53577c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC21025b(placement, adInfo));
        } else if (this.f53576b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC21026c(placement, adInfo));
        }
    }

    /* renamed from: a */
    public void m54773a(Placement placement, AdInfo adInfo) {
        if (this.f53577c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC21029f(placement, adInfo));
        } else if (this.f53576b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC21030g(placement, adInfo));
        }
    }

    /* renamed from: b */
    public void m54764b(LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener) {
        this.f53577c = levelPlayRewardedVideoBaseListener;
    }

    /* renamed from: a */
    public void m54772a(LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener) {
        this.f53576b = levelPlayRewardedVideoBaseListener;
    }

    /* renamed from: a */
    private void m54769a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
    }

    /* renamed from: a */
    public void m54768a(boolean z, AdInfo adInfo) {
        if (this.f53577c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC21039p(z, adInfo));
            return;
        }
        LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener = this.f53576b;
        if (levelPlayRewardedVideoBaseListener == null || !(levelPlayRewardedVideoBaseListener instanceof LevelPlayRewardedVideoListener)) {
            return;
        }
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC21024a(z, adInfo));
    }
}
