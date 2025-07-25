package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzcvm extends com.google.android.gms.ads.internal.client.zzdx {
    private final String zza;
    @Nullable
    private final String zzb;
    private final String zzc;
    @Nullable
    private final String zzd;
    private final List zze;
    private final long zzf;
    private final String zzg;
    @Nullable
    private final zzedb zzh;
    private final Bundle zzi;

    public zzcvm(@Nullable zzfbo zzfboVar, String str, zzedb zzedbVar, @Nullable zzfbr zzfbrVar, String str2) {
        String str3;
        String str4;
        String str5;
        String str6 = null;
        if (zzfboVar == null) {
            str3 = null;
        } else {
            str3 = zzfboVar.zzab;
        }
        this.zzb = str3;
        this.zzc = str2;
        if (zzfbrVar == null) {
            str4 = null;
        } else {
            str4 = zzfbrVar.zzb;
        }
        this.zzd = str4;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && zzfboVar != null) {
            try {
                str6 = zzfboVar.zzv.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = str6 != null ? str6 : str;
        this.zze = zzedbVar.zzc();
        this.zzh = zzedbVar;
        this.zzf = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() / 1000;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgE)).booleanValue() && zzfbrVar != null) {
            this.zzi = zzfbrVar.zzk;
        } else {
            this.zzi = new Bundle();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzje)).booleanValue() && zzfbrVar != null && !TextUtils.isEmpty(zzfbrVar.zzi)) {
            str5 = zzfbrVar.zzi;
        } else {
            str5 = "";
        }
        this.zzg = str5;
    }

    public final long zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final Bundle zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzw zzf() {
        zzedb zzedbVar = this.zzh;
        if (zzedbVar != null) {
            return zzedbVar.zza();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final String zzg() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final String zzh() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    @Nullable
    public final String zzi() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdy
    public final List zzj() {
        return this.zze;
    }

    @Nullable
    public final String zzk() {
        return this.zzd;
    }
}
