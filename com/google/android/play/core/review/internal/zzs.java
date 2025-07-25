package com.google.android.play.core.review.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes5.dex */
public final class zzs implements ServiceConnection {

    /* renamed from: b */
    final /* synthetic */ zzt f39240b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzs(zzt zztVar, zzr zzrVar) {
        this.f39240b = zztVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzt.m70133d(this.f39240b).zzd("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f39240b.zzc().post(new zzp(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzt.m70133d(this.f39240b).zzd("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f39240b.zzc().post(new zzq(this));
    }
}
