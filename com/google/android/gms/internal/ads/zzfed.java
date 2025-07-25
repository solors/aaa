package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@SafeParcelable.Class(creator = "PoolConfigurationCreator")
/* loaded from: classes5.dex */
public final class zzfed extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfed> CREATOR = new zzfee();
    public final Context zza;
    public final zzfea zzb;
    @SafeParcelable.Field(m72314id = 2)
    public final int zzc;
    @SafeParcelable.Field(m72314id = 3)
    public final int zzd;
    @SafeParcelable.Field(m72314id = 4)
    public final int zze;
    @SafeParcelable.Field(m72314id = 5)
    public final String zzf;
    public final int zzg;
    private final zzfea[] zzh;
    @SafeParcelable.Field(getter = "getFormatInt", m72314id = 1)
    private final int zzi;
    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", m72314id = 6)
    private final int zzj;
    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", m72314id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    @SafeParcelable.Constructor
    public zzfed(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) int i2, @SafeParcelable.Param(m72313id = 3) int i3, @SafeParcelable.Param(m72313id = 4) int i4, @SafeParcelable.Param(m72313id = 5) String str, @SafeParcelable.Param(m72313id = 6) int i5, @SafeParcelable.Param(m72313id = 7) int i6) {
        zzfea[] values = zzfea.values();
        this.zzh = values;
        int[] zza = zzfeb.zza();
        this.zzl = zza;
        int[] zza2 = zzfec.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = values[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = zza[i5];
        this.zzk = i6;
        int i7 = zza2[i6];
    }

    public static zzfed zza(zzfea zzfeaVar, Context context) {
        if (zzfeaVar == zzfea.Rewarded) {
            return new zzfed(context, zzfeaVar, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgi)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgo)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgq)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgs), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgk), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgm));
        } else if (zzfeaVar == zzfea.Interstitial) {
            return new zzfed(context, zzfeaVar, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgj)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgp)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgr)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgt), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgl), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgn));
        } else if (zzfeaVar == zzfea.AppOpen) {
            return new zzfed(context, zzfeaVar, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgw)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgy)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgz)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgu), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgv), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgx));
        } else {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzi;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzfed(Context context, zzfea zzfeaVar, int i, int i2, int i3, String str, String str2, String str3) {
        int i4;
        this.zzh = zzfea.values();
        this.zzl = zzfeb.zza();
        this.zzm = zzfec.zza();
        this.zza = context;
        this.zzi = zzfeaVar.ordinal();
        this.zzb = zzfeaVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else {
            i4 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.zzg = i4;
        this.zzj = i4 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
