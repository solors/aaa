package com.ironsource;

import com.ironsource.InterfaceC19634bf;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.l5 */
/* loaded from: classes6.dex */
public class C20245l5 extends InterfaceC19634bf.C19635a<ISDemandOnlyBannerListener> {

    /* renamed from: com.ironsource.l5$a */
    /* loaded from: classes6.dex */
    class RunnableC20246a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f50945a;

        /* renamed from: b */
        final /* synthetic */ IronSourceError f50946b;

        /* renamed from: c */
        final /* synthetic */ ISDemandOnlyBannerListener f50947c;

        RunnableC20246a(String str, IronSourceError ironSourceError, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f50945a = str;
            this.f50946b = ironSourceError;
            this.f50947c = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C20245l5 c20245l5 = C20245l5.this;
            String str = this.f50945a;
            c20245l5.m59320a(str, "onBannerAdLoadFailed() error = " + this.f50946b.getErrorMessage());
            this.f50947c.onBannerAdLoadFailed(this.f50945a, this.f50946b);
        }
    }

    /* renamed from: com.ironsource.l5$b */
    /* loaded from: classes6.dex */
    class RunnableC20247b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f50949a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyBannerListener f50950b;

        RunnableC20247b(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f50949a = str;
            this.f50950b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C20245l5.this.m59320a(this.f50949a, "onBannerAdLoaded()");
            this.f50950b.onBannerAdLoaded(this.f50949a);
        }
    }

    /* renamed from: com.ironsource.l5$c */
    /* loaded from: classes6.dex */
    class RunnableC20248c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f50952a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyBannerListener f50953b;

        RunnableC20248c(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f50952a = str;
            this.f50953b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C20245l5.this.m59320a(this.f50952a, "onBannerAdShown()");
            this.f50953b.onBannerAdShown(this.f50952a);
        }
    }

    /* renamed from: com.ironsource.l5$d */
    /* loaded from: classes6.dex */
    class RunnableC20249d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f50955a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyBannerListener f50956b;

        RunnableC20249d(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f50955a = str;
            this.f50956b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C20245l5.this.m59320a(this.f50955a, "onBannerAdClicked()");
            this.f50956b.onBannerAdClicked(this.f50955a);
        }
    }

    /* renamed from: com.ironsource.l5$e */
    /* loaded from: classes6.dex */
    class RunnableC20250e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f50958a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyBannerListener f50959b;

        RunnableC20250e(String str, ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
            this.f50958a = str;
            this.f50959b = iSDemandOnlyBannerListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C20245l5.this.m59320a(this.f50958a, "onBannerAdLeftApplication()");
            this.f50959b.onBannerAdLeftApplication(this.f50958a);
        }
    }

    /* renamed from: a */
    public void m57532a(String str) {
        ISDemandOnlyBannerListener m59324a = m59324a();
        m59321a(new RunnableC20249d(str, m59324a), m59324a != null);
    }

    /* renamed from: b */
    public void m57530b(String str) {
        boolean z;
        ISDemandOnlyBannerListener m59324a = m59324a();
        RunnableC20250e runnableC20250e = new RunnableC20250e(str, m59324a);
        if (m59324a != null) {
            z = true;
        } else {
            z = false;
        }
        m59321a(runnableC20250e, z);
    }

    /* renamed from: c */
    public void m57529c(String str) {
        boolean z;
        ISDemandOnlyBannerListener m59324a = m59324a();
        RunnableC20247b runnableC20247b = new RunnableC20247b(str, m59324a);
        if (m59324a != null) {
            z = true;
        } else {
            z = false;
        }
        m59321a(runnableC20247b, z);
    }

    /* renamed from: d */
    public void m57528d(String str) {
        boolean z;
        ISDemandOnlyBannerListener m59324a = m59324a();
        RunnableC20248c runnableC20248c = new RunnableC20248c(str, m59324a);
        if (m59324a != null) {
            z = true;
        } else {
            z = false;
        }
        m59321a(runnableC20248c, z);
    }

    /* renamed from: a */
    public void m57531a(String str, IronSourceError ironSourceError) {
        ISDemandOnlyBannerListener m59324a = m59324a();
        m59321a(new RunnableC20246a(str, ironSourceError, m59324a), m59324a != null);
    }
}
