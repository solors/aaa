package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.foundation.entity.BaseCampaignUnit;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzemg implements zzetq {
    public final com.google.android.gms.ads.internal.client.zzs zza;
    @Nullable
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    @Nullable
    public final String zzh;
    public final boolean zzi;

    public zzemg(com.google.android.gms.ads.internal.client.zzs zzsVar, @Nullable String str, boolean z, String str2, float f, int i, int i2, @Nullable String str3, boolean z2) {
        Preconditions.checkNotNull(zzsVar, "the adSize must not be null");
        this.zza = zzsVar;
        this.zzb = str;
        this.zzc = z;
        this.zzd = str2;
        this.zze = f;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = str3;
        this.zzi = z2;
    }

    private final void zzc(Bundle bundle) {
        boolean z;
        boolean z2;
        if (this.zza.zze == -1) {
            z = true;
        } else {
            z = false;
        }
        zzfcx.zzf(bundle, "smart_w", "full", z);
        if (this.zza.zzb == -2) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzfcx.zzf(bundle, "smart_h", "auto", z2);
        zzfcx.zzg(bundle, "ene", true, this.zza.zzj);
        zzfcx.zzf(bundle, "rafmt", MBridgeCommon.DYNAMIC_VIEW_TEMPLATE_VALUE, this.zza.zzm);
        zzfcx.zzf(bundle, "rafmt", "103", this.zza.zzn);
        zzfcx.zzf(bundle, "rafmt", "105", this.zza.zzo);
        zzfcx.zzg(bundle, "inline_adaptive_slot", true, this.zzi);
        zzfcx.zzg(bundle, "interscroller_slot", true, this.zza.zzo);
        zzfcx.zzc(bundle, "format", this.zzb);
        zzfcx.zzf(bundle, "fluid", "height", this.zzc);
        zzfcx.zzf(bundle, "sz", this.zzd, !TextUtils.isEmpty(this.zzd));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt(BaseCampaignUnit.JSON_KEY_SH, this.zzg);
        zzfcx.zzf(bundle, "sc", this.zzh, !TextUtils.isEmpty(this.zzh));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzs[] zzsVarArr = this.zza.zzg;
        if (zzsVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.zza.zzb);
            bundle2.putInt("width", this.zza.zze);
            bundle2.putBoolean("is_fluid_height", this.zza.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzs zzsVar : zzsVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzsVar.zzi);
                bundle3.putInt("height", zzsVar.zzb);
                bundle3.putInt("width", zzsVar.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
        zzc(((zzcuv) obj).zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zzb(Object obj) {
        zzc(((zzcuv) obj).zza);
    }
}
