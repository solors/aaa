package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzfsc;
import com.google.android.gms.internal.ads.zzfsd;
import com.google.android.gms.internal.ads.zzfse;
import com.google.android.gms.internal.ads.zzfsf;
import com.google.android.gms.internal.ads.zzfsy;
import com.google.android.gms.internal.ads.zzfta;
import com.google.android.gms.internal.ads.zzftb;
import com.google.android.gms.internal.ads.zzftc;
import com.google.android.gms.internal.ads.zzftd;
import com.google.android.gms.internal.ads.zzftq;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes4.dex */
public final class zzz {
    private zzftb zzf;
    @Nullable
    private zzcex zzc = null;
    private boolean zze = false;
    @Nullable
    private String zza = null;
    @Nullable
    private zzfse zzd = null;
    @Nullable
    private String zzb = null;

    private final zzftd zzl() {
        zzftc zzc = zzftd.zzc();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzlq)).booleanValue() && !TextUtils.isEmpty(this.zzb)) {
            zzc.zza(this.zzb);
        } else {
            String str = this.zza;
            if (str != null) {
                zzc.zzb(str);
            } else {
                zzf("Missing session token and/or appId", "onLMDupdate");
            }
        }
        return zzc.zzc();
    }

    private final void zzm() {
        if (this.zzf == null) {
            this.zzf = new zzy(this);
        }
    }

    public final synchronized void zza(@Nullable zzcex zzcexVar, Context context) {
        this.zzc = zzcexVar;
        if (!zzk(context)) {
            zzf("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("action", "fetch_completed");
        zze("on_play_store_bind", hashMap);
    }

    public final void zzb() {
        zzfse zzfseVar;
        if (this.zze && (zzfseVar = this.zzd) != null) {
            zzfseVar.zza(zzl(), this.zzf);
            zzd("onLMDOverlayCollapse");
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
    }

    public final void zzc() {
        zzfse zzfseVar;
        if (this.zze && (zzfseVar = this.zzd) != null) {
            zzfsc zzc = zzfsd.zzc();
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzlq)).booleanValue() && !TextUtils.isEmpty(this.zzb)) {
                zzc.zza(this.zzb);
            } else {
                String str = this.zza;
                if (str != null) {
                    zzc.zzb(str);
                } else {
                    zzf("Missing session token and/or appId", "onLMDupdate");
                }
            }
            zzfseVar.zzb(zzc.zzc(), this.zzf);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
    }

    @VisibleForTesting
    final void zzd(String str) {
        zze(str, new HashMap());
    }

    @VisibleForTesting
    final void zze(final String str, final Map map) {
        zzbzw.zzf.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzx
            {
                zzz.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzz.this.zzh(str, map);
            }
        });
    }

    @VisibleForTesting
    final void zzf(String str, String str2) {
        com.google.android.gms.ads.internal.util.zze.zza(str);
        if (this.zzc != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            hashMap.put("action", str2);
            zze("onError", hashMap);
        }
    }

    public final void zzg() {
        zzfse zzfseVar;
        if (this.zze && (zzfseVar = this.zzd) != null) {
            zzfseVar.zzc(zzl(), this.zzf);
            zzd("onLMDOverlayExpand");
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("LastMileDelivery not connected");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(String str, Map map) {
        zzcex zzcexVar = this.zzc;
        if (zzcexVar != null) {
            zzcexVar.zzd(str, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final void zzi(zzfta zzftaVar) {
        if (!TextUtils.isEmpty(zzftaVar.zzb())) {
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzlq)).booleanValue()) {
                this.zza = zzftaVar.zzb();
            }
        }
        switch (zzftaVar.zza()) {
            case 8152:
                zzd("onLMDOverlayOpened");
                return;
            case 8153:
                zzd("onLMDOverlayClicked");
                return;
            case 8154:
            case 8156:
            case 8158:
            case 8159:
            default:
                return;
            case 8155:
                zzd("onLMDOverlayClose");
                return;
            case 8157:
                this.zza = null;
                this.zzb = null;
                this.zze = false;
                return;
            case 8160:
            case 8161:
            case 8162:
                HashMap hashMap = new HashMap();
                hashMap.put("error", String.valueOf(zzftaVar.zza()));
                zze("onLMDOverlayFailedToOpen", hashMap);
                return;
        }
    }

    public final void zzj(@Nullable zzcex zzcexVar, @Nullable zzfsy zzfsyVar) {
        if (zzcexVar == null) {
            zzf("adWebview missing", "onLMDShow");
            return;
        }
        this.zzc = zzcexVar;
        if (!this.zze && !zzk(zzcexVar.getContext())) {
            zzf("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzlq)).booleanValue()) {
            this.zzb = zzfsyVar.zzh();
        }
        zzm();
        zzfse zzfseVar = this.zzd;
        if (zzfseVar != null) {
            zzfseVar.zzd(zzfsyVar, this.zzf);
        }
    }

    public final synchronized boolean zzk(Context context) {
        if (!zzftq.zza(context)) {
            return false;
        }
        try {
            this.zzd = zzfsf.zza(context);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Error connecting LMD Overlay service");
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.zzd == null) {
            this.zze = false;
            return false;
        }
        zzm();
        this.zze = true;
        return true;
    }
}
