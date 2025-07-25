package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.0.2 */
/* loaded from: classes5.dex */
public final class zzmq extends zzat {
    private final /* synthetic */ zzmn zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzmq(zzmn zzmnVar, zzil zzilVar) {
        super(zzilVar);
        this.zza = zzmnVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzat
    @WorkerThread
    public final void zzb() {
        zzmn.zza(this.zza);
    }
}
