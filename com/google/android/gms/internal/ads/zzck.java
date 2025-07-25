package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzck implements zzch {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private zzcf zze;
    private zzcf zzf;
    private zzcf zzg;
    private zzcf zzh;
    private boolean zzi;
    @Nullable
    private zzcj zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzck() {
        zzcf zzcfVar = zzcf.zza;
        this.zze = zzcfVar;
        this.zzf = zzcfVar;
        this.zzg = zzcfVar;
        this.zzh = zzcfVar;
        ByteBuffer byteBuffer = zzch.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final zzcf zza(zzcf zzcfVar) throws zzcg {
        if (zzcfVar.zzd == 2) {
            int i = this.zzb;
            if (i == -1) {
                i = zzcfVar.zzb;
            }
            this.zze = zzcfVar;
            zzcf zzcfVar2 = new zzcf(i, zzcfVar.zzc, 2);
            this.zzf = zzcfVar2;
            this.zzi = true;
            return zzcfVar2;
        }
        throw new zzcg("Unhandled input format:", zzcfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final ByteBuffer zzb() {
        int zza;
        zzcj zzcjVar = this.zzj;
        if (zzcjVar != null && (zza = zzcjVar.zza()) > 0) {
            if (this.zzk.capacity() < zza) {
                ByteBuffer order = ByteBuffer.allocateDirect(zza).order(ByteOrder.nativeOrder());
                this.zzk = order;
                this.zzl = order.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzcjVar.zzd(this.zzl);
            this.zzo += zza;
            this.zzk.limit(zza);
            this.zzm = this.zzk;
        }
        ByteBuffer byteBuffer = this.zzm;
        this.zzm = zzch.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzc() {
        if (zzg()) {
            zzcf zzcfVar = this.zze;
            this.zzg = zzcfVar;
            zzcf zzcfVar2 = this.zzf;
            this.zzh = zzcfVar2;
            if (this.zzi) {
                this.zzj = new zzcj(zzcfVar.zzb, zzcfVar.zzc, this.zzc, this.zzd, zzcfVar2.zzb);
            } else {
                zzcj zzcjVar = this.zzj;
                if (zzcjVar != null) {
                    zzcjVar.zzc();
                }
            }
        }
        this.zzm = zzch.zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzd() {
        zzcj zzcjVar = this.zzj;
        if (zzcjVar != null) {
            zzcjVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zze(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        zzcj zzcjVar = this.zzj;
        zzcjVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.zzn += remaining;
        zzcjVar.zzf(asShortBuffer);
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        zzcf zzcfVar = zzcf.zza;
        this.zze = zzcfVar;
        this.zzf = zzcfVar;
        this.zzg = zzcfVar;
        this.zzh = zzcfVar;
        ByteBuffer byteBuffer = zzch.zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = byteBuffer;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final boolean zzg() {
        if (this.zzf.zzb == -1) {
            return false;
        }
        if (Math.abs(this.zzc - 1.0f) >= 1.0E-4f || Math.abs(this.zzd - 1.0f) >= 1.0E-4f) {
            return true;
        }
        if (this.zzf.zzb == this.zze.zzb) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final boolean zzh() {
        if (!this.zzp) {
            return false;
        }
        zzcj zzcjVar = this.zzj;
        if (zzcjVar != null && zzcjVar.zza() != 0) {
            return false;
        }
        return true;
    }

    public final long zzi(long j) {
        long j2 = this.zzo;
        if (j2 >= 1024) {
            long j3 = this.zzn;
            zzcj zzcjVar = this.zzj;
            zzcjVar.getClass();
            long zzb = j3 - zzcjVar.zzb();
            int i = this.zzh.zzb;
            int i2 = this.zzg.zzb;
            if (i == i2) {
                return zzei.zzu(j, zzb, j2, RoundingMode.DOWN);
            }
            return zzei.zzu(j, zzb * i, j2 * i2, RoundingMode.DOWN);
        }
        return (long) (this.zzc * j);
    }

    public final void zzj(float f) {
        if (this.zzd != f) {
            this.zzd = f;
            this.zzi = true;
        }
    }

    public final void zzk(float f) {
        if (this.zzc != f) {
            this.zzc = f;
            this.zzi = true;
        }
    }
}
