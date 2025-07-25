package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.browser.customtabs.CustomTabsCallback;
import com.google.android.gms.ads.MobileAds;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzdra implements zzdan, com.google.android.gms.ads.internal.client.zza, zzcwn, zzcvx {
    private final Context zza;
    private final zzfdb zzb;
    private final zzdrw zzc;
    private final zzfca zzd;
    private final zzfbo zze;
    private final zzebk zzf;
    private final String zzg;
    @Nullable
    private Boolean zzh;
    private final boolean zzi = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgF)).booleanValue();

    public zzdra(Context context, zzfdb zzfdbVar, zzdrw zzdrwVar, zzfca zzfcaVar, zzfbo zzfboVar, zzebk zzebkVar, String str) {
        this.zza = context;
        this.zzb = zzfdbVar;
        this.zzc = zzdrwVar;
        this.zzd = zzfcaVar;
        this.zze = zzfboVar;
        this.zzf = zzebkVar;
        this.zzg = str;
    }

    private final zzdrv zzd(String str) {
        String str2;
        zzfbz zzfbzVar = this.zzd.zzb;
        zzdrv zza = this.zzc.zza();
        zza.zzd(zzfbzVar.zzb);
        zza.zzc(this.zze);
        zza.zzb("action", str);
        zza.zzb("ad_format", this.zzg.toUpperCase(Locale.ROOT));
        boolean z = false;
        if (!this.zze.zzt.isEmpty()) {
            zza.zzb("ancn", (String) this.zze.zzt.get(0));
        }
        if (this.zze.zzb()) {
            if (true != com.google.android.gms.ads.internal.zzv.zzp().zzA(this.zza)) {
                str2 = "offline";
            } else {
                str2 = CustomTabsCallback.ONLINE_EXTRAS_KEY;
            }
            zza.zzb("device_connectivity", str2);
            zza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()));
            zza.zzb("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgM)).booleanValue()) {
            if (com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzf(this.zzd.zza.zza) != 1) {
                z = true;
            }
            zza.zzb("scar", String.valueOf(z));
            if (z) {
                com.google.android.gms.ads.internal.client.zzm zzmVar = this.zzd.zza.zza.zzd;
                zza.zzb("ragent", zzmVar.zzp);
                zza.zzb("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzmVar)));
            }
        }
        return zza;
    }

    private final void zze(zzdrv zzdrvVar) {
        if (this.zze.zzb()) {
            this.zzf.zzd(new zzebm(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdrvVar.zze(), 2));
            return;
        }
        zzdrvVar.zzg();
    }

    private final boolean zzf() {
        String str;
        if (this.zzh == null) {
            synchronized (this) {
                if (this.zzh == null) {
                    String str2 = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbB);
                    com.google.android.gms.ads.internal.zzv.zzq();
                    try {
                        str = com.google.android.gms.ads.internal.util.zzs.zzq(this.zza);
                    } catch (RemoteException unused) {
                        str = null;
                    }
                    boolean z = false;
                    if (str2 != null && str != null) {
                        try {
                            z = Pattern.matches(str2, str);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzh = Boolean.valueOf(z);
                }
            }
        }
        return this.zzh.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!this.zze.zzb()) {
            return;
        }
        zze(zzd("click"));
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (!this.zzi) {
            return;
        }
        zzdrv zzd = zzd("ifts");
        zzd.zzb("reason", "adapter");
        int i = zzeVar.zza;
        String str = zzeVar.zzb;
        if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
            i = zzeVar3.zza;
            str = zzeVar3.zzb;
        }
        if (i >= 0) {
            zzd.zzb("arec", String.valueOf(i));
        }
        String zza = this.zzb.zza(str);
        if (zza != null) {
            zzd.zzb("areec", zza);
        }
        zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void zzb() {
        if (!this.zzi) {
            return;
        }
        zzdrv zzd = zzd("ifts");
        zzd.zzb("reason", "blocked");
        zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcvx
    public final void zzc(zzdgb zzdgbVar) {
        if (!this.zzi) {
            return;
        }
        zzdrv zzd = zzd("ifts");
        zzd.zzb("reason", "exception");
        if (!TextUtils.isEmpty(zzdgbVar.getMessage())) {
            zzd.zzb("msg", zzdgbVar.getMessage());
        }
        zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzi() {
        if (!zzf()) {
            return;
        }
        zzd("adapter_shown").zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzj() {
        if (!zzf()) {
            return;
        }
        zzd("adapter_impression").zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        if (!zzf() && !this.zze.zzb()) {
            return;
        }
        zze(zzd("impression"));
    }
}
