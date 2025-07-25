package com.google.android.gms.internal.auth;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.4 */
/* loaded from: classes5.dex */
final class zzaa extends zzj {
    final /* synthetic */ TaskCompletionSource zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaa(zzab zzabVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzk
    public final void zzb(Status status, @Nullable Bundle bundle) {
        zzab.zzf(status, bundle, this.zza);
    }
}
