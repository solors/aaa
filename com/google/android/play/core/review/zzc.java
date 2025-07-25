package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes5.dex */
final class zzc extends ResultReceiver {

    /* renamed from: b */
    final /* synthetic */ TaskCompletionSource f39263b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zzd zzdVar, Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.f39263b = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f39263b.trySetResult(null);
    }
}
