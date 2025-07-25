package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
@SafeParcelable.Class(creator = "NativeAdOptionsParcelCreator")
/* loaded from: classes5.dex */
public final class zzbfl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbfl> CREATOR = new zzbfm();
    @SafeParcelable.Field(m72314id = 1)
    public final int zza;
    @SafeParcelable.Field(m72314id = 2)
    public final boolean zzb;
    @SafeParcelable.Field(m72314id = 3)
    public final int zzc;
    @SafeParcelable.Field(m72314id = 4)
    public final boolean zzd;
    @SafeParcelable.Field(m72314id = 5)
    public final int zze;
    @Nullable
    @SafeParcelable.Field(m72314id = 6)
    public final com.google.android.gms.ads.internal.client.zzga zzf;
    @SafeParcelable.Field(m72314id = 7)
    public final boolean zzg;
    @SafeParcelable.Field(m72314id = 8)
    public final int zzh;
    @SafeParcelable.Field(m72314id = 9)
    public final int zzi;
    @SafeParcelable.Field(m72314id = 10)
    public final boolean zzj;
    @SafeParcelable.Field(m72314id = 11)
    public final int zzk;

    @SafeParcelable.Constructor
    public zzbfl(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) boolean z, @SafeParcelable.Param(m72313id = 3) int i2, @SafeParcelable.Param(m72313id = 4) boolean z2, @SafeParcelable.Param(m72313id = 5) int i3, @SafeParcelable.Param(m72313id = 6) com.google.android.gms.ads.internal.client.zzga zzgaVar, @SafeParcelable.Param(m72313id = 7) boolean z3, @SafeParcelable.Param(m72313id = 8) int i4, @SafeParcelable.Param(m72313id = 9) int i5, @SafeParcelable.Param(m72313id = 10) boolean z4, @SafeParcelable.Param(m72313id = 11) int i6) {
        this.zza = i;
        this.zzb = z;
        this.zzc = i2;
        this.zzd = z2;
        this.zze = i3;
        this.zzf = zzgaVar;
        this.zzg = z3;
        this.zzh = i4;
        this.zzj = z4;
        this.zzi = i5;
        this.zzk = i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r1 == 1) goto L15;
     */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.ads.nativead.NativeAdOptions zza(@androidx.annotation.Nullable com.google.android.gms.internal.ads.zzbfl r5) {
        /*
            com.google.android.gms.ads.nativead.NativeAdOptions$Builder r0 = new com.google.android.gms.ads.nativead.NativeAdOptions$Builder
            r0.<init>()
            if (r5 != 0) goto Lc
            com.google.android.gms.ads.nativead.NativeAdOptions r5 = r0.build()
            return r5
        Lc:
            int r1 = r5.zza
            r2 = 2
            if (r1 == r2) goto L45
            r3 = 3
            if (r1 == r3) goto L39
            r4 = 4
            if (r1 == r4) goto L18
            goto L4a
        L18:
            boolean r1 = r5.zzg
            r0.setRequestCustomMuteThisAd(r1)
            int r1 = r5.zzh
            r0.setMediaAspectRatio(r1)
            int r1 = r5.zzi
            boolean r4 = r5.zzj
            r0.enableCustomClickGestureDirection(r1, r4)
            int r1 = r5.zzk
            r4 = 1
            if (r1 != 0) goto L30
        L2e:
            r2 = r4
            goto L36
        L30:
            if (r1 != r2) goto L34
            r2 = r3
            goto L36
        L34:
            if (r1 != r4) goto L2e
        L36:
            r0.zzi(r2)
        L39:
            com.google.android.gms.ads.internal.client.zzga r1 = r5.zzf
            if (r1 == 0) goto L45
            com.google.android.gms.ads.VideoOptions r2 = new com.google.android.gms.ads.VideoOptions
            r2.<init>(r1)
            r0.setVideoOptions(r2)
        L45:
            int r1 = r5.zze
            r0.setAdChoicesPlacement(r1)
        L4a:
            boolean r1 = r5.zzb
            r0.setReturnUrlsForImageAssets(r1)
            boolean r5 = r5.zzd
            r0.setRequestMultipleImages(r5)
            com.google.android.gms.ads.nativead.NativeAdOptions r5 = r0.build()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbfl.zza(com.google.android.gms.internal.ads.zzbfl):com.google.android.gms.ads.nativead.NativeAdOptions");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeInt(parcel, 5, this.zze);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.writeInt(parcel, 9, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzj);
        SafeParcelWriter.writeInt(parcel, 11, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Deprecated
    public zzbfl(@NonNull NativeAdOptions nativeAdOptions) {
        this(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), nativeAdOptions.getImageOrientation(), nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new com.google.android.gms.ads.internal.client.zzga(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zza(), nativeAdOptions.getMediaAspectRatio(), 0, false, 0);
    }
}
