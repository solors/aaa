package com.fyber.inneractive.sdk.activities;

/* renamed from: com.fyber.inneractive.sdk.activities.c */
/* loaded from: classes4.dex */
public final class RunnableC14180c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InneractiveFullscreenAdActivity f26883a;

    public RunnableC14180c(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f26883a = inneractiveFullscreenAdActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f26883a.isFinishing()) {
            this.f26883a.hideNavigationBar();
        }
    }
}
