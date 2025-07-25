package com.yandex.mobile.ads.impl;

import android.os.ConditionVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class vt1 extends Thread {

    /* renamed from: b */
    final /* synthetic */ ConditionVariable f86874b;

    /* renamed from: c */
    final /* synthetic */ wt1 f86875c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt1(wt1 wt1Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f86875c = wt1Var;
        this.f86874b = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        InterfaceC31905yl interfaceC31905yl;
        synchronized (this.f86875c) {
            this.f86874b.open();
            this.f86875c.m27757b();
            interfaceC31905yl = this.f86875c.f87409b;
            interfaceC31905yl.getClass();
        }
    }
}
