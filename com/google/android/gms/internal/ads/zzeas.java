package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.internal.ads.zzbbq;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzeas implements zzfgo {
    private final zzeag zza;
    private final zzeak zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeas(zzeag zzeagVar, zzeak zzeakVar) {
        this.zza = zzeagVar;
        this.zzb = zzeakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzd(zzfgh zzfghVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgb)).booleanValue() && zzfgh.RENDERER == zzfghVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdB(zzfgh zzfghVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgb)).booleanValue() && zzfgh.RENDERER == zzfghVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdC(zzfgh zzfghVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgb)).booleanValue()) {
            if (zzfgh.RENDERER == zzfghVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime());
            } else if (zzfgh.PRELOADED_LOADER != zzfghVar && zzfgh.SERVER_TRANSACTION != zzfghVar) {
            } else {
                this.zza.zzh(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime());
                final zzeak zzeakVar = this.zzb;
                final long zzd = this.zza.zzd();
                zzeakVar.zza.zza(new zzffr() { // from class: com.google.android.gms.internal.ads.zzeaj
                    @Override // com.google.android.gms.internal.ads.zzffr
                    public final Object zza(Object obj) {
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (!zzeak.this.zzf()) {
                            long j = zzd;
                            zzbbq.zzaf.zza.C45353zza zzn = zzbbq.zzaf.zza.zzn();
                            zzn.zzP(j);
                            byte[] zzaV = zzn.zzbr().zzaV();
                            zzear.zzf(sQLiteDatabase, false, false);
                            zzear.zzc(sQLiteDatabase, j, zzaV);
                            return null;
                        }
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdA(zzfgh zzfghVar, String str) {
    }
}
