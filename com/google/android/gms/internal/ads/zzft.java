package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzft extends zzfr {
    @Nullable
    private Uri zza;
    @Nullable
    private byte[] zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private final zzfs zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzft(byte[] bArr) {
        super(false);
        zzfs zzfsVar = new zzfs(bArr);
        this.zzf = zzfsVar;
        zzcw.zzd(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.zzb;
        zzcw.zzb(bArr2);
        System.arraycopy(bArr2, this.zzc, bArr, i, min);
        this.zzc += min;
        this.zzd -= min;
        zzg(min);
        return min;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgdVar) throws IOException {
        zzi(zzgdVar);
        this.zza = zzgdVar.zza;
        byte[] bArr = this.zzf.zza;
        this.zzb = bArr;
        long j = zzgdVar.zze;
        int length = bArr.length;
        if (j <= length) {
            int i = (int) j;
            this.zzc = i;
            int i2 = length - i;
            this.zzd = i2;
            long j2 = zzgdVar.zzf;
            if (j2 != -1) {
                this.zzd = (int) Math.min(i2, j2);
            }
            this.zze = true;
            zzj(zzgdVar);
            long j3 = zzgdVar.zzf;
            if (j3 != -1) {
                return j3;
            }
            return this.zzd;
        }
        throw new zzfz(2008);
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() {
        if (this.zze) {
            this.zze = false;
            zzh();
        }
        this.zza = null;
        this.zzb = null;
    }
}
