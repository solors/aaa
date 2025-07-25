package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes5.dex */
public class CancellationTokenSource {
    private final zzb zza = new zzb();

    public void cancel() {
        this.zza.zza();
    }

    @NonNull
    public CancellationToken getToken() {
        return this.zza;
    }
}
