package com.inmobi.media;

import java.util.TimerTask;

/* renamed from: com.inmobi.media.wb */
/* loaded from: classes6.dex */
public final class C19514wb extends TimerTask {

    /* renamed from: a */
    public final /* synthetic */ C19528xb f48843a;

    /* renamed from: b */
    public final /* synthetic */ byte f48844b;

    public C19514wb(C19528xb c19528xb, byte b) {
        this.f48843a = c19528xb;
        this.f48844b = b;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f48843a.m59567a(this.f48844b);
    }
}
