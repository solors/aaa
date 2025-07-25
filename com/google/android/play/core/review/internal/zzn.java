package com.google.android.play.core.review.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.IInterface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes5.dex */
public final class zzn extends zzj {

    /* renamed from: c */
    final /* synthetic */ zzt f39236c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(zzt zztVar) {
        this.f39236c = zztVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void zza() {
        IInterface iInterface;
        zzi zziVar;
        Context context;
        ServiceConnection serviceConnection;
        zzt zztVar = this.f39236c;
        iInterface = zztVar.f39254m;
        if (iInterface != null) {
            zziVar = zztVar.f39243b;
            zziVar.zzd("Unbind from service.", new Object[0]);
            zzt zztVar2 = this.f39236c;
            context = zztVar2.f39242a;
            serviceConnection = zztVar2.f39253l;
            context.unbindService(serviceConnection);
            this.f39236c.f39248g = false;
            this.f39236c.f39254m = null;
            this.f39236c.f39253l = null;
        }
        this.f39236c.m70122o();
    }
}
