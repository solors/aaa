package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzane implements zzabx {
    private final zzef zza;
    private final zzdy zzb = new zzdy();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzane(zzef zzefVar, zzanf zzanfVar) {
        this.zza = zzefVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final zzabw zza(zzaco zzacoVar, long j) throws IOException {
        int zzh;
        long j2;
        long zzf = zzacoVar.zzf();
        int min = (int) Math.min(20000L, zzacoVar.zzd() - zzf);
        this.zzb.zzI(min);
        zzacoVar.zzh(this.zzb.zzN(), 0, min);
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (true) {
            zzdy zzdyVar = this.zzb;
            if (zzdyVar.zzb() >= 4) {
                if (zzang.zzh(zzdyVar.zzN(), zzdyVar.zzd()) != 442) {
                    zzdyVar.zzM(1);
                } else {
                    zzdyVar.zzM(4);
                    long zzc = zzanh.zzc(zzdyVar);
                    if (zzc != -9223372036854775807L) {
                        long zzb = this.zza.zzb(zzc);
                        if (zzb > j) {
                            if (j3 == -9223372036854775807L) {
                                return zzabw.zzd(zzb, zzf);
                            }
                            j2 = i2;
                        } else if (100000 + zzb > j) {
                            j2 = zzdyVar.zzd();
                            break;
                        } else {
                            i2 = zzdyVar.zzd();
                            j3 = zzb;
                        }
                    }
                    int zze = zzdyVar.zze();
                    if (zzdyVar.zzb() < 10) {
                        zzdyVar.zzL(zze);
                    } else {
                        zzdyVar.zzM(9);
                        int zzm = zzdyVar.zzm() & 7;
                        if (zzdyVar.zzb() < zzm) {
                            zzdyVar.zzL(zze);
                        } else {
                            zzdyVar.zzM(zzm);
                            if (zzdyVar.zzb() < 4) {
                                zzdyVar.zzL(zze);
                            } else {
                                if (zzang.zzh(zzdyVar.zzN(), zzdyVar.zzd()) == 443) {
                                    zzdyVar.zzM(4);
                                    int zzq = zzdyVar.zzq();
                                    if (zzdyVar.zzb() < zzq) {
                                        zzdyVar.zzL(zze);
                                    } else {
                                        zzdyVar.zzM(zzq);
                                    }
                                }
                                while (true) {
                                    if (zzdyVar.zzb() < 4 || (zzh = zzang.zzh(zzdyVar.zzN(), zzdyVar.zzd())) == 442 || zzh == 441 || (zzh >>> 8) != 1) {
                                        break;
                                    }
                                    zzdyVar.zzM(4);
                                    if (zzdyVar.zzb() < 2) {
                                        zzdyVar.zzL(zze);
                                        break;
                                    }
                                    zzdyVar.zzL(Math.min(zzdyVar.zze(), zzdyVar.zzd() + zzdyVar.zzq()));
                                }
                            }
                        }
                    }
                    i = zzdyVar.zzd();
                }
            } else if (j3 != -9223372036854775807L) {
                return zzabw.zzf(j3, zzf + i);
            } else {
                return zzabw.zza;
            }
        }
        return zzabw.zze(zzf + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzabx
    public final void zzb() {
        byte[] bArr = zzei.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
    }
}
