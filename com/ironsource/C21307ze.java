package com.ironsource;

import com.ironsource.InterfaceC19634bf;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.ze */
/* loaded from: classes6.dex */
public class C21307ze extends InterfaceC19634bf.C19635a<ISDemandOnlyInterstitialListener> implements ISDemandOnlyInterstitialListener {

    /* renamed from: com.ironsource.ze$a */
    /* loaded from: classes6.dex */
    class RunnableC21308a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f54735a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyInterstitialListener f54736b;

        RunnableC21308a(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f54735a = str;
            this.f54736b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C21307ze.this.m59320a(this.f54735a, "onInterstitialAdReady()");
            this.f54736b.onInterstitialAdReady(this.f54735a);
        }
    }

    /* renamed from: com.ironsource.ze$b */
    /* loaded from: classes6.dex */
    class RunnableC21309b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f54738a;

        /* renamed from: b */
        final /* synthetic */ IronSourceError f54739b;

        /* renamed from: c */
        final /* synthetic */ ISDemandOnlyInterstitialListener f54740c;

        RunnableC21309b(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f54738a = str;
            this.f54739b = ironSourceError;
            this.f54740c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C21307ze c21307ze = C21307ze.this;
            String str = this.f54738a;
            c21307ze.m59320a(str, "onInterstitialAdLoadFailed() error = " + this.f54739b.getErrorMessage());
            this.f54740c.onInterstitialAdLoadFailed(this.f54738a, this.f54739b);
        }
    }

    /* renamed from: com.ironsource.ze$c */
    /* loaded from: classes6.dex */
    class RunnableC21310c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f54742a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyInterstitialListener f54743b;

        RunnableC21310c(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f54742a = str;
            this.f54743b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C21307ze.this.m59320a(this.f54742a, "onInterstitialAdOpened()");
            this.f54743b.onInterstitialAdOpened(this.f54742a);
        }
    }

    /* renamed from: com.ironsource.ze$d */
    /* loaded from: classes6.dex */
    class RunnableC21311d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f54745a;

        /* renamed from: b */
        final /* synthetic */ IronSourceError f54746b;

        /* renamed from: c */
        final /* synthetic */ ISDemandOnlyInterstitialListener f54747c;

        RunnableC21311d(String str, IronSourceError ironSourceError, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f54745a = str;
            this.f54746b = ironSourceError;
            this.f54747c = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C21307ze c21307ze = C21307ze.this;
            String str = this.f54745a;
            c21307ze.m59320a(str, "onInterstitialAdShowFailed() error = " + this.f54746b.getErrorMessage());
            this.f54747c.onInterstitialAdShowFailed(this.f54745a, this.f54746b);
        }
    }

    /* renamed from: com.ironsource.ze$e */
    /* loaded from: classes6.dex */
    class RunnableC21312e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f54749a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyInterstitialListener f54750b;

        RunnableC21312e(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f54749a = str;
            this.f54750b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C21307ze.this.m59320a(this.f54749a, "onInterstitialAdClicked()");
            this.f54750b.onInterstitialAdClicked(this.f54749a);
        }
    }

    /* renamed from: com.ironsource.ze$f */
    /* loaded from: classes6.dex */
    class RunnableC21313f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f54752a;

        /* renamed from: b */
        final /* synthetic */ ISDemandOnlyInterstitialListener f54753b;

        RunnableC21313f(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
            this.f54752a = str;
            this.f54753b = iSDemandOnlyInterstitialListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            C21307ze.this.m59320a(this.f54752a, "onInterstitialAdClosed()");
            this.f54753b.onInterstitialAdClosed(this.f54752a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C21307ze() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C21307ze(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        m59319b(iSDemandOnlyInterstitialListener);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClicked(String str) {
        boolean z;
        ISDemandOnlyInterstitialListener m59324a = m59324a();
        RunnableC21312e runnableC21312e = new RunnableC21312e(str, m59324a);
        if (m59324a != null) {
            z = true;
        } else {
            z = false;
        }
        m59321a(runnableC21312e, z);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdClosed(String str) {
        boolean z;
        ISDemandOnlyInterstitialListener m59324a = m59324a();
        RunnableC21313f runnableC21313f = new RunnableC21313f(str, m59324a);
        if (m59324a != null) {
            z = true;
        } else {
            z = false;
        }
        m59321a(runnableC21313f, z);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdLoadFailed(String str, IronSourceError ironSourceError) {
        boolean z;
        ISDemandOnlyInterstitialListener m59324a = m59324a();
        RunnableC21309b runnableC21309b = new RunnableC21309b(str, ironSourceError, m59324a);
        if (m59324a != null) {
            z = true;
        } else {
            z = false;
        }
        m59321a(runnableC21309b, z);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdOpened(String str) {
        boolean z;
        ISDemandOnlyInterstitialListener m59324a = m59324a();
        RunnableC21310c runnableC21310c = new RunnableC21310c(str, m59324a);
        if (m59324a != null) {
            z = true;
        } else {
            z = false;
        }
        m59321a(runnableC21310c, z);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdReady(String str) {
        boolean z;
        ISDemandOnlyInterstitialListener m59324a = m59324a();
        RunnableC21308a runnableC21308a = new RunnableC21308a(str, m59324a);
        if (m59324a != null) {
            z = true;
        } else {
            z = false;
        }
        m59321a(runnableC21308a, z);
    }

    @Override // com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener
    public void onInterstitialAdShowFailed(String str, IronSourceError ironSourceError) {
        boolean z;
        ISDemandOnlyInterstitialListener m59324a = m59324a();
        RunnableC21311d runnableC21311d = new RunnableC21311d(str, ironSourceError, m59324a);
        if (m59324a != null) {
            z = true;
        } else {
            z = false;
        }
        m59321a(runnableC21311d, z);
    }
}
