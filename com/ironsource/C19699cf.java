package com.ironsource;

import com.ironsource.InterfaceC19634bf;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.cf */
/* loaded from: classes6.dex */
public class C19699cf extends InterfaceC19634bf.C19635a<ISDemandOnlyRewardedVideoListener> implements ISDemandOnlyRewardedVideoListener {

    /* renamed from: com.ironsource.cf$a */
    /* loaded from: classes6.dex */
    class RunnableC19700a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f49429a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f49430b;

        RunnableC19700a(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f49429a = str;
            this.f49430b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C19699cf.this.m59320a(this.f49429a, "onRewardedVideoAdLoadSuccess()");
            this.f49430b.onRewardedVideoAdLoadSuccess(this.f49429a);
        }
    }

    /* renamed from: com.ironsource.cf$b */
    /* loaded from: classes6.dex */
    class RunnableC19701b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f49432a;

        /* renamed from: b */
        final /* synthetic */ IronSourceError f49433b;

        /* renamed from: c */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f49434c;

        RunnableC19701b(String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f49432a = str;
            this.f49433b = ironSourceError;
            this.f49434c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C19699cf c19699cf = C19699cf.this;
            String str = this.f49432a;
            c19699cf.m59320a(str, "onRewardedVideoAdLoadFailed() error = " + this.f49433b.getErrorMessage());
            this.f49434c.onRewardedVideoAdLoadFailed(this.f49432a, this.f49433b);
        }
    }

    /* renamed from: com.ironsource.cf$c */
    /* loaded from: classes6.dex */
    class RunnableC19702c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f49436a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f49437b;

        RunnableC19702c(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f49436a = str;
            this.f49437b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C19699cf.this.m59320a(this.f49436a, "onRewardedVideoAdOpened()");
            this.f49437b.onRewardedVideoAdOpened(this.f49436a);
        }
    }

    /* renamed from: com.ironsource.cf$d */
    /* loaded from: classes6.dex */
    class RunnableC19703d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f49439a;

        /* renamed from: b */
        final /* synthetic */ IronSourceError f49440b;

        /* renamed from: c */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f49441c;

        RunnableC19703d(String str, IronSourceError ironSourceError, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f49439a = str;
            this.f49440b = ironSourceError;
            this.f49441c = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C19699cf c19699cf = C19699cf.this;
            String str = this.f49439a;
            c19699cf.m59320a(str, "onRewardedVideoAdShowFailed() error = " + this.f49440b.getErrorMessage());
            this.f49441c.onRewardedVideoAdShowFailed(this.f49439a, this.f49440b);
        }
    }

    /* renamed from: com.ironsource.cf$e */
    /* loaded from: classes6.dex */
    class RunnableC19704e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f49443a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f49444b;

        RunnableC19704e(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f49443a = str;
            this.f49444b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C19699cf.this.m59320a(this.f49443a, "onRewardedVideoAdClicked()");
            this.f49444b.onRewardedVideoAdClicked(this.f49443a);
        }
    }

    /* renamed from: com.ironsource.cf$f */
    /* loaded from: classes6.dex */
    class RunnableC19705f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f49446a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f49447b;

        RunnableC19705f(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f49446a = str;
            this.f49447b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C19699cf.this.m59320a(this.f49446a, "onRewardedVideoAdRewarded()");
            this.f49447b.onRewardedVideoAdRewarded(this.f49446a);
        }
    }

    /* renamed from: com.ironsource.cf$g */
    /* loaded from: classes6.dex */
    class RunnableC19706g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f49449a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyRewardedVideoListener f49450b;

        RunnableC19706g(String str, ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
            this.f49449a = str;
            this.f49450b = iSDemandOnlyRewardedVideoListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C19699cf.this.m59320a(this.f49449a, "onRewardedVideoAdClosed()");
            this.f49450b.onRewardedVideoAdClosed(this.f49449a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C19699cf() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C19699cf(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        m59319b(iSDemandOnlyRewardedVideoListener);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClicked(String str) {
        boolean z;
        ISDemandOnlyRewardedVideoListener m59324a = m59324a();
        RunnableC19704e runnableC19704e = new RunnableC19704e(str, m59324a);
        if (m59324a != null) {
            z = true;
        } else {
            z = false;
        }
        m59321a(runnableC19704e, z);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdClosed(String str) {
        boolean z;
        ISDemandOnlyRewardedVideoListener m59324a = m59324a();
        RunnableC19706g runnableC19706g = new RunnableC19706g(str, m59324a);
        if (m59324a != null) {
            z = true;
        } else {
            z = false;
        }
        m59321a(runnableC19706g, z);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadFailed(String str, IronSourceError ironSourceError) {
        boolean z;
        ISDemandOnlyRewardedVideoListener m59324a = m59324a();
        RunnableC19701b runnableC19701b = new RunnableC19701b(str, ironSourceError, m59324a);
        if (m59324a != null) {
            z = true;
        } else {
            z = false;
        }
        m59321a(runnableC19701b, z);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdLoadSuccess(String str) {
        boolean z;
        ISDemandOnlyRewardedVideoListener m59324a = m59324a();
        RunnableC19700a runnableC19700a = new RunnableC19700a(str, m59324a);
        if (m59324a != null) {
            z = true;
        } else {
            z = false;
        }
        m59321a(runnableC19700a, z);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdOpened(String str) {
        boolean z;
        ISDemandOnlyRewardedVideoListener m59324a = m59324a();
        RunnableC19702c runnableC19702c = new RunnableC19702c(str, m59324a);
        if (m59324a != null) {
            z = true;
        } else {
            z = false;
        }
        m59321a(runnableC19702c, z);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdRewarded(String str) {
        boolean z;
        ISDemandOnlyRewardedVideoListener m59324a = m59324a();
        RunnableC19705f runnableC19705f = new RunnableC19705f(str, m59324a);
        if (m59324a != null) {
            z = true;
        } else {
            z = false;
        }
        m59321a(runnableC19705f, z);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyRewardedVideoListener
    public void onRewardedVideoAdShowFailed(String str, IronSourceError ironSourceError) {
        boolean z;
        ISDemandOnlyRewardedVideoListener m59324a = m59324a();
        RunnableC19703d runnableC19703d = new RunnableC19703d(str, ironSourceError, m59324a);
        if (m59324a != null) {
            z = true;
        } else {
            z = false;
        }
        m59321a(runnableC19703d, z);
    }
}
