package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzyb {
    @Nullable
    private zzya zza;
    @Nullable
    private zzyj zzb;

    @Nullable
    public zzll zze() {
        throw null;
    }

    @CallSuper
    public void zzj() {
        this.zza = null;
        this.zzb = null;
    }

    public void zzk(zze zzeVar) {
        throw null;
    }

    public boolean zzn() {
        throw null;
    }

    public abstract zzyc zzo(zzlm[] zzlmVarArr, zzwj zzwjVar, zzug zzugVar, zzbq zzbqVar) throws zzib;

    public abstract void zzp(@Nullable Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzyj zzq() {
        zzyj zzyjVar = this.zzb;
        zzcw.zzb(zzyjVar);
        return zzyjVar;
    }

    @CallSuper
    public final void zzr(zzya zzyaVar, zzyj zzyjVar) {
        this.zza = zzyaVar;
        this.zzb = zzyjVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzs() {
        zzya zzyaVar = this.zza;
        if (zzyaVar != null) {
            zzyaVar.zzj();
        }
    }
}
