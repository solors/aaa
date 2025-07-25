package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzbfg extends zzbfo {
    static final int zza;
    static final int zzb;
    private static final int zzc;
    private final String zzd;
    private final List zze = new ArrayList();
    private final List zzf = new ArrayList();
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;

    static {
        int rgb = Color.rgb(12, 174, 206);
        zzc = rgb;
        zza = Color.rgb(204, 204, 204);
        zzb = rgb;
    }

    public zzbfg(String str, List list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        int i3;
        int i4;
        int i5;
        this.zzd = str;
        for (int i6 = 0; i6 < list.size(); i6++) {
            zzbfj zzbfjVar = (zzbfj) list.get(i6);
            this.zze.add(zzbfjVar);
            this.zzf.add(zzbfjVar);
        }
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = zza;
        }
        this.zzg = i3;
        if (num2 != null) {
            i4 = num2.intValue();
        } else {
            i4 = zzb;
        }
        this.zzh = i4;
        if (num3 != null) {
            i5 = num3.intValue();
        } else {
            i5 = 12;
        }
        this.zzi = i5;
        this.zzj = i;
        this.zzk = i2;
    }

    public final int zzb() {
        return this.zzj;
    }

    public final int zzc() {
        return this.zzk;
    }

    public final int zzd() {
        return this.zzg;
    }

    public final int zze() {
        return this.zzh;
    }

    public final int zzf() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzbfp
    public final String zzg() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbfp
    public final List zzh() {
        return this.zzf;
    }

    public final List zzi() {
        return this.zze;
    }
}
