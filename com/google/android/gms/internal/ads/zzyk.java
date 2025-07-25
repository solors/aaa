package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzyk {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzyd[] zzd = new zzyd[100];

    public zzyk(boolean z, int i) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    public final synchronized zzyd zzb() {
        zzyd zzydVar;
        this.zzb++;
        int i = this.zzc;
        if (i > 0) {
            zzyd[] zzydVarArr = this.zzd;
            int i2 = i - 1;
            this.zzc = i2;
            zzydVar = zzydVarArr[i2];
            zzydVar.getClass();
            zzydVarArr[i2] = null;
        } else {
            zzydVar = new zzyd(new byte[65536], 0);
            int i3 = this.zzb;
            zzyd[] zzydVarArr2 = this.zzd;
            int length = zzydVarArr2.length;
            if (i3 > length) {
                this.zzd = (zzyd[]) Arrays.copyOf(zzydVarArr2, length + length);
                return zzydVar;
            }
        }
        return zzydVar;
    }

    public final synchronized void zzc(zzyd zzydVar) {
        zzyd[] zzydVarArr = this.zzd;
        int i = this.zzc;
        this.zzc = i + 1;
        zzydVarArr[i] = zzydVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(@Nullable zzye zzyeVar) {
        while (zzyeVar != null) {
            zzyd[] zzydVarArr = this.zzd;
            int i = this.zzc;
            this.zzc = i + 1;
            zzydVarArr[i] = zzyeVar.zzc();
            this.zzb--;
            zzyeVar = zzyeVar.zzd();
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.zza;
        this.zza = i;
        if (i < i2) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int i = this.zza;
        int i2 = zzei.zza;
        int max = Math.max(0, ((i + 65535) / 65536) - this.zzb);
        int i3 = this.zzc;
        if (max >= i3) {
            return;
        }
        Arrays.fill(this.zzd, max, i3, (Object) null);
        this.zzc = max;
    }
}
