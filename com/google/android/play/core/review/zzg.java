package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.internal.zzt;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes5.dex */
class zzg extends com.google.android.play.core.review.internal.zzg {

    /* renamed from: b */
    final com.google.android.play.core.review.internal.zzi f39268b;

    /* renamed from: c */
    final TaskCompletionSource f39269c;

    /* renamed from: d */
    final /* synthetic */ zzi f39270d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzg(zzi zziVar, com.google.android.play.core.review.internal.zzi zziVar2, TaskCompletionSource taskCompletionSource) {
        this.f39270d = zziVar;
        this.f39268b = zziVar2;
        this.f39269c = taskCompletionSource;
    }

    @Override // com.google.android.play.core.review.internal.zzh
    public void zzb(Bundle bundle) throws RemoteException {
        zzt zztVar = this.f39270d.f39273a;
        if (zztVar != null) {
            zztVar.zzr(this.f39269c);
        }
        this.f39268b.zzd("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
