package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzakt implements zzakf {
    private final zzdy zza = new zzdy();
    private final zzdy zzb = new zzdy();
    private final zzaks zzc = new zzaks();
    @Nullable
    private Inflater zzd;

    @Override // com.google.android.gms.internal.ads.zzakf
    public final void zza(byte[] bArr, int i, int i2, zzake zzakeVar, zzdb zzdbVar) {
        this.zza.zzJ(bArr, i2 + i);
        this.zza.zzL(i);
        zzdy zzdyVar = this.zza;
        if (zzdyVar.zzb() > 0 && zzdyVar.zzf() == 120) {
            if (this.zzd == null) {
                this.zzd = new Inflater();
            }
            if (zzei.zzH(zzdyVar, this.zzb, this.zzd)) {
                zzdy zzdyVar2 = this.zzb;
                zzdyVar.zzJ(zzdyVar2.zzN(), zzdyVar2.zze());
            }
        }
        this.zzc.zze();
        ArrayList arrayList = new ArrayList();
        while (true) {
            zzdy zzdyVar3 = this.zza;
            if (zzdyVar3.zzb() >= 3) {
                zzaks zzaksVar = this.zzc;
                int zze = zzdyVar3.zze();
                int zzm = zzdyVar3.zzm();
                int zzq = zzdyVar3.zzq();
                int zzd = zzdyVar3.zzd() + zzq;
                zzco zzcoVar = null;
                if (zzd > zze) {
                    zzdyVar3.zzL(zze);
                } else {
                    if (zzm != 128) {
                        switch (zzm) {
                            case 20:
                                zzaks.zzd(zzaksVar, zzdyVar3, zzq);
                                break;
                            case 21:
                                zzaks.zzb(zzaksVar, zzdyVar3, zzq);
                                break;
                            case 22:
                                zzaks.zzc(zzaksVar, zzdyVar3, zzq);
                                break;
                        }
                    } else {
                        zzco zza = zzaksVar.zza();
                        zzaksVar.zze();
                        zzcoVar = zza;
                    }
                    zzdyVar3.zzL(zzd);
                }
                if (zzcoVar != null) {
                    arrayList.add(zzcoVar);
                }
            } else {
                zzdbVar.zza(new zzajx(arrayList, -9223372036854775807L, -9223372036854775807L));
                return;
            }
        }
    }
}
