package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
@SafeParcelable.Class(creator = "AdSizeParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes4.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new zzt();
    @SafeParcelable.Field(m72314id = 2)
    public final String zza;
    @SafeParcelable.Field(m72314id = 3)
    public final int zzb;
    @SafeParcelable.Field(m72314id = 4)
    public final int zzc;
    @SafeParcelable.Field(m72314id = 5)
    public final boolean zzd;
    @SafeParcelable.Field(m72314id = 6)
    public final int zze;
    @SafeParcelable.Field(m72314id = 7)
    public final int zzf;
    @SafeParcelable.Field(m72314id = 8)
    public final zzs[] zzg;
    @SafeParcelable.Field(m72314id = 9)
    public final boolean zzh;
    @SafeParcelable.Field(m72314id = 10)
    public final boolean zzi;
    @SafeParcelable.Field(m72314id = 11)
    public boolean zzj;
    @SafeParcelable.Field(m72314id = 12)
    public boolean zzk;
    @SafeParcelable.Field(m72314id = 13)
    public boolean zzl;
    @SafeParcelable.Field(m72314id = 14)
    public boolean zzm;
    @SafeParcelable.Field(m72314id = 15)
    public boolean zzn;
    @SafeParcelable.Field(m72314id = 16)
    public boolean zzo;

    public zzs() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static int zza(DisplayMetrics displayMetrics) {
        return (int) (zze(displayMetrics) * displayMetrics.density);
    }

    public static zzs zzb() {
        return new zzs("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static zzs zzc() {
        return new zzs("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static zzs zzd() {
        return new zzs("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    private static int zze(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        if (i <= 720) {
            return 50;
        }
        return 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzn);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzs(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzs(android.content.Context r13, com.google.android.gms.ads.AdSize[] r14) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzs.<init>(android.content.Context, com.google.android.gms.ads.AdSize[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzs(@SafeParcelable.Param(m72313id = 2) String str, @SafeParcelable.Param(m72313id = 3) int i, @SafeParcelable.Param(m72313id = 4) int i2, @SafeParcelable.Param(m72313id = 5) boolean z, @SafeParcelable.Param(m72313id = 6) int i3, @SafeParcelable.Param(m72313id = 7) int i4, @SafeParcelable.Param(m72313id = 8) zzs[] zzsVarArr, @SafeParcelable.Param(m72313id = 9) boolean z2, @SafeParcelable.Param(m72313id = 10) boolean z3, @SafeParcelable.Param(m72313id = 11) boolean z4, @SafeParcelable.Param(m72313id = 12) boolean z5, @SafeParcelable.Param(m72313id = 13) boolean z6, @SafeParcelable.Param(m72313id = 14) boolean z7, @SafeParcelable.Param(m72313id = 15) boolean z8, @SafeParcelable.Param(m72313id = 16) boolean z9) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = zzsVarArr;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = z4;
        this.zzk = z5;
        this.zzl = z6;
        this.zzm = z7;
        this.zzn = z8;
        this.zzo = z9;
    }
}
