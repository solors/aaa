package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzeii implements zzecw {
    private final zzecy zza;
    private final zzedc zzb;
    private final zzfgn zzc;
    private final zzgcs zzd;

    public zzeii(zzfgn zzfgnVar, zzgcs zzgcsVar, zzecy zzecyVar, zzedc zzedcVar) {
        this.zzc = zzfgnVar;
        this.zzd = zzgcsVar;
        this.zzb = zzedcVar;
        this.zza = zzecyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public static final String zze(String str, int i) {
        return "Error from: " + str + ", code: " + i;
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final ListenableFuture zza(final zzfca zzfcaVar, final zzfbo zzfboVar) {
        final zzecz zzeczVar;
        Iterator it = zzfboVar.zzt.iterator();
        while (true) {
            if (it.hasNext()) {
                try {
                    zzeczVar = this.zza.zza((String) it.next(), zzfboVar.zzv);
                    break;
                } catch (zzfcq unused) {
                }
            } else {
                zzeczVar = null;
                break;
            }
        }
        if (zzeczVar == null) {
            return zzgch.zzg(new zzefy("Unable to instantiate mediation adapter class."));
        }
        zzcab zzcabVar = new zzcab();
        zzeczVar.zzc.zza(new zzeih(this, zzeczVar, zzcabVar));
        if (zzfboVar.zzM) {
            Bundle bundle = zzfcaVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfgn zzfgnVar = this.zzc;
        return zzffx.zzd(new zzffs() { // from class: com.google.android.gms.internal.ads.zzeif
            @Override // com.google.android.gms.internal.ads.zzffs
            public final void zza() {
                zzeii.this.zzd(zzfcaVar, zzfboVar, zzeczVar);
            }
        }, this.zzd, zzfgh.ADAPTER_LOAD_AD_SYN, zzfgnVar).zzb(zzfgh.ADAPTER_LOAD_AD_ACK).zzd(zzcabVar).zzb(zzfgh.ADAPTER_WRAP_ADAPTER).zze(new zzffr() { // from class: com.google.android.gms.internal.ads.zzeig
            @Override // com.google.android.gms.internal.ads.zzffr
            public final Object zza(Object obj) {
                return zzeii.this.zzc(zzfcaVar, zzfboVar, zzeczVar, (Void) obj);
            }
        }).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzecw
    public final boolean zzb(zzfca zzfcaVar, zzfbo zzfboVar) {
        if (!zzfboVar.zzt.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Object zzc(zzfca zzfcaVar, zzfbo zzfboVar, zzecz zzeczVar, Void r4) throws Exception {
        return this.zzb.zza(zzfcaVar, zzfboVar, zzeczVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(zzfca zzfcaVar, zzfbo zzfboVar, zzecz zzeczVar) throws Exception {
        this.zzb.zzb(zzfcaVar, zzfboVar, zzeczVar);
    }
}
