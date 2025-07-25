package com.google.android.gms.internal.ads;

import androidx.annotation.CallSuper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public abstract class zzci implements zzch {
    protected zzcf zzb;
    protected zzcf zzc;
    private zzcf zzd;
    private zzcf zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zzci() {
        ByteBuffer byteBuffer = zzch.zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzcf zzcfVar = zzcf.zza;
        this.zzd = zzcfVar;
        this.zze = zzcfVar;
        this.zzb = zzcfVar;
        this.zzc = zzcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final zzcf zza(zzcf zzcfVar) throws zzcg {
        this.zzd = zzcfVar;
        this.zze = zzi(zzcfVar);
        if (zzg()) {
            return this.zze;
        }
        return zzcf.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    @CallSuper
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zzch.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzc() {
        this.zzg = zzch.zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzf() {
        zzc();
        this.zzf = zzch.zza;
        zzcf zzcfVar = zzcf.zza;
        this.zzd = zzcfVar;
        this.zze = zzcfVar;
        this.zzb = zzcfVar;
        this.zzc = zzcfVar;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzch
    @CallSuper
    public boolean zzg() {
        if (this.zze != zzcf.zza) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    @CallSuper
    public boolean zzh() {
        if (this.zzh && this.zzg == zzch.zza) {
            return true;
        }
        return false;
    }

    protected zzcf zzi(zzcf zzcfVar) throws zzcg {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ByteBuffer zzj(int i) {
        if (this.zzf.capacity() < i) {
            this.zzf = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzn() {
        return this.zzg.hasRemaining();
    }

    protected void zzk() {
    }

    protected void zzl() {
    }

    protected void zzm() {
    }
}
