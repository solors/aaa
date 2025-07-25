package com.ironsource;

import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;

/* renamed from: com.ironsource.m5 */
/* loaded from: classes6.dex */
public class C20309m5 extends C20513n7 {

    /* renamed from: d */
    private static final C20309m5 f51103d = new C20309m5();

    /* renamed from: b */
    private LevelPlayBannerListener f51104b = null;

    /* renamed from: c */
    private LevelPlayBannerListener f51105c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.m5$a */
    /* loaded from: classes6.dex */
    public class RunnableC20310a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f51106a;

        RunnableC20310a(AdInfo adInfo) {
            C20309m5.this = r1;
            this.f51106a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C20309m5.this.f51104b != null) {
                C20309m5.this.f51104b.onAdLeftApplication(C20309m5.this.m56177a(this.f51106a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLeftApplication() adInfo = " + C20309m5.this.m56177a(this.f51106a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.m5$b */
    /* loaded from: classes6.dex */
    public class RunnableC20311b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f51108a;

        RunnableC20311b(AdInfo adInfo) {
            C20309m5.this = r1;
            this.f51108a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C20309m5.this.f51105c != null) {
                C20309m5.this.f51105c.onAdClicked(C20309m5.this.m56177a(this.f51108a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClicked() adInfo = " + C20309m5.this.m56177a(this.f51108a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.m5$c */
    /* loaded from: classes6.dex */
    public class RunnableC20312c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f51110a;

        RunnableC20312c(AdInfo adInfo) {
            C20309m5.this = r1;
            this.f51110a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C20309m5.this.f51104b != null) {
                C20309m5.this.f51104b.onAdClicked(C20309m5.this.m56177a(this.f51110a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdClicked() adInfo = " + C20309m5.this.m56177a(this.f51110a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.m5$d */
    /* loaded from: classes6.dex */
    public class RunnableC20313d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f51112a;

        RunnableC20313d(AdInfo adInfo) {
            C20309m5.this = r1;
            this.f51112a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C20309m5.this.f51105c != null) {
                C20309m5.this.f51105c.onAdLoaded(C20309m5.this.m56177a(this.f51112a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoaded() adInfo = " + C20309m5.this.m56177a(this.f51112a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.m5$e */
    /* loaded from: classes6.dex */
    public class RunnableC20314e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f51114a;

        RunnableC20314e(AdInfo adInfo) {
            C20309m5.this = r1;
            this.f51114a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C20309m5.this.f51104b != null) {
                C20309m5.this.f51104b.onAdLoaded(C20309m5.this.m56177a(this.f51114a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoaded() adInfo = " + C20309m5.this.m56177a(this.f51114a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.m5$f */
    /* loaded from: classes6.dex */
    public class RunnableC20315f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IronSourceError f51116a;

        RunnableC20315f(IronSourceError ironSourceError) {
            C20309m5.this = r1;
            this.f51116a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C20309m5.this.f51105c != null) {
                C20309m5.this.f51105c.onAdLoadFailed(this.f51116a);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoadFailed() error = " + this.f51116a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.m5$g */
    /* loaded from: classes6.dex */
    public class RunnableC20316g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ IronSourceError f51118a;

        RunnableC20316g(IronSourceError ironSourceError) {
            C20309m5.this = r1;
            this.f51118a = ironSourceError;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C20309m5.this.f51104b != null) {
                C20309m5.this.f51104b.onAdLoadFailed(this.f51118a);
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLoadFailed() error = " + this.f51118a.getErrorMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.m5$h */
    /* loaded from: classes6.dex */
    public class RunnableC20317h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f51120a;

        RunnableC20317h(AdInfo adInfo) {
            C20309m5.this = r1;
            this.f51120a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C20309m5.this.f51105c != null) {
                C20309m5.this.f51105c.onAdScreenPresented(C20309m5.this.m56177a(this.f51120a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdScreenPresented() adInfo = " + C20309m5.this.m56177a(this.f51120a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.m5$i */
    /* loaded from: classes6.dex */
    public class RunnableC20318i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f51122a;

        RunnableC20318i(AdInfo adInfo) {
            C20309m5.this = r1;
            this.f51122a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C20309m5.this.f51104b != null) {
                C20309m5.this.f51104b.onAdScreenPresented(C20309m5.this.m56177a(this.f51122a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdScreenPresented() adInfo = " + C20309m5.this.m56177a(this.f51122a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.m5$j */
    /* loaded from: classes6.dex */
    public class RunnableC20319j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f51124a;

        RunnableC20319j(AdInfo adInfo) {
            C20309m5.this = r1;
            this.f51124a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C20309m5.this.f51105c != null) {
                C20309m5.this.f51105c.onAdScreenDismissed(C20309m5.this.m56177a(this.f51124a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdScreenDismissed() adInfo = " + C20309m5.this.m56177a(this.f51124a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.m5$k */
    /* loaded from: classes6.dex */
    public class RunnableC20320k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f51126a;

        RunnableC20320k(AdInfo adInfo) {
            C20309m5.this = r1;
            this.f51126a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C20309m5.this.f51104b != null) {
                C20309m5.this.f51104b.onAdScreenDismissed(C20309m5.this.m56177a(this.f51126a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdScreenDismissed() adInfo = " + C20309m5.this.m56177a(this.f51126a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.ironsource.m5$l */
    /* loaded from: classes6.dex */
    public class RunnableC20321l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdInfo f51128a;

        RunnableC20321l(AdInfo adInfo) {
            C20309m5.this = r1;
            this.f51128a = adInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C20309m5.this.f51105c != null) {
                C20309m5.this.f51105c.onAdLeftApplication(C20309m5.this.m56177a(this.f51128a));
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onAdLeftApplication() adInfo = " + C20309m5.this.m56177a(this.f51128a));
            }
        }
    }

    private C20309m5() {
    }

    /* renamed from: a */
    public static C20309m5 m57329a() {
        return f51103d;
    }

    /* renamed from: b */
    public LevelPlayBannerListener m57324b() {
        return this.f51104b;
    }

    /* renamed from: c */
    public void m57318c(AdInfo adInfo) {
        if (this.f51105c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC20321l(adInfo));
        } else if (this.f51104b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC20310a(adInfo));
        }
    }

    /* renamed from: d */
    public void m57316d(AdInfo adInfo) {
        if (this.f51105c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC20313d(adInfo));
        } else if (this.f51104b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC20314e(adInfo));
        }
    }

    /* renamed from: e */
    public void m57314e(AdInfo adInfo) {
        if (this.f51105c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC20319j(adInfo));
        } else if (this.f51104b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC20320k(adInfo));
        }
    }

    /* renamed from: f */
    public void m57312f(AdInfo adInfo) {
        if (this.f51105c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC20317h(adInfo));
        } else if (this.f51104b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC20318i(adInfo));
        }
    }

    /* renamed from: a */
    public void m57326a(IronSourceError ironSourceError) {
        if (this.f51105c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC20315f(ironSourceError));
        } else if (this.f51104b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC20316g(ironSourceError));
        }
    }

    /* renamed from: b */
    public void m57321b(AdInfo adInfo) {
        if (this.f51105c != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC20311b(adInfo));
        } else if (this.f51104b != null) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new RunnableC20312c(adInfo));
        }
    }

    /* renamed from: a */
    public void m57325a(LevelPlayBannerListener levelPlayBannerListener) {
        this.f51104b = levelPlayBannerListener;
    }

    /* renamed from: b */
    public void m57320b(LevelPlayBannerListener levelPlayBannerListener) {
        this.f51105c = levelPlayBannerListener;
    }
}
