package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes5.dex */
final class zzh extends zzg {

    /* renamed from: f */
    final String f39271f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzh(zzi zziVar, TaskCompletionSource taskCompletionSource, String str) {
        super(zziVar, new com.google.android.play.core.review.internal.zzi("OnRequestInstallCallback"), taskCompletionSource);
        this.f39271f = str;
    }

    @Override // com.google.android.play.core.review.zzg, com.google.android.play.core.review.internal.zzh
    public final void zzb(Bundle bundle) throws RemoteException {
        super.zzb(bundle);
        this.f39269c.trySetResult(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
