package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes5.dex */
public final class zzf extends com.google.android.play.core.review.internal.zzj {

    /* renamed from: c */
    final /* synthetic */ TaskCompletionSource f39266c;

    /* renamed from: d */
    final /* synthetic */ zzi f39267d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(zzi zziVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.f39267d = zziVar;
        this.f39266c = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, com.google.android.play.core.review.internal.zzf] */
    @Override // com.google.android.play.core.review.internal.zzj
    protected final void zza() {
        com.google.android.play.core.review.internal.zzi zziVar;
        String str;
        String str2;
        String str3;
        try {
            ?? zze = this.f39267d.f39273a.zze();
            str2 = this.f39267d.f39274b;
            Bundle zza = zzj.zza();
            zzi zziVar2 = this.f39267d;
            TaskCompletionSource taskCompletionSource = this.f39266c;
            str3 = zziVar2.f39274b;
            zze.zzc(str2, zza, new zzh(zziVar2, taskCompletionSource, str3));
        } catch (RemoteException e) {
            zziVar = zzi.f39272c;
            str = this.f39267d.f39274b;
            zziVar.zzc(e, "error requesting in-app review for %s", str);
            this.f39266c.trySetException(new RuntimeException(e));
        }
    }
}
