package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
@SafeParcelable.Class(creator = "AdRequestInfoParcelCreator")
/* loaded from: classes5.dex */
public final class zzbuq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbuq> CREATOR = new zzbur();
    @SafeParcelable.Field(m72314id = 31)
    public final long zzA;
    @SafeParcelable.Field(m72314id = 33)
    public final String zzB;
    @SafeParcelable.Field(m72314id = 34)
    public final float zzC;
    @SafeParcelable.Field(m72314id = 35)
    public final int zzD;
    @SafeParcelable.Field(m72314id = 36)
    public final int zzE;
    @SafeParcelable.Field(m72314id = 37)
    public final boolean zzF;
    @SafeParcelable.Field(m72314id = 39)
    public final String zzG;
    @SafeParcelable.Field(m72314id = 40)
    public final boolean zzH;
    @SafeParcelable.Field(m72314id = 41)
    public final String zzI;
    @SafeParcelable.Field(m72314id = 42)
    public final boolean zzJ;
    @SafeParcelable.Field(m72314id = 43)
    public final int zzK;
    @SafeParcelable.Field(m72314id = 44)
    public final Bundle zzL;
    @SafeParcelable.Field(m72314id = 45)
    public final String zzM;
    @Nullable
    @SafeParcelable.Field(m72314id = 46)
    public final com.google.android.gms.ads.internal.client.zzef zzN;
    @SafeParcelable.Field(m72314id = 47)
    public final boolean zzO;
    @SafeParcelable.Field(m72314id = 48)
    public final Bundle zzP;
    @Nullable
    @SafeParcelable.Field(m72314id = 49)
    public final String zzQ;
    @Nullable
    @SafeParcelable.Field(m72314id = 50)
    public final String zzR;
    @Nullable
    @SafeParcelable.Field(m72314id = 51)
    public final String zzS;
    @SafeParcelable.Field(m72314id = 52)
    public final boolean zzT;
    @SafeParcelable.Field(m72314id = 53)
    public final List zzU;
    @SafeParcelable.Field(m72314id = 54)
    public final String zzV;
    @SafeParcelable.Field(m72314id = 55)
    public final List zzW;
    @SafeParcelable.Field(m72314id = 56)
    public final int zzX;
    @SafeParcelable.Field(m72314id = 57)
    public final boolean zzY;
    @SafeParcelable.Field(m72314id = 58)
    public final boolean zzZ;
    @SafeParcelable.Field(m72314id = 1)
    public final int zza;
    @SafeParcelable.Field(m72314id = 59)
    public final boolean zzaa;
    @SafeParcelable.Field(m72314id = 60)
    public final ArrayList zzab;
    @SafeParcelable.Field(m72314id = 61)
    public final String zzac;
    @SafeParcelable.Field(m72314id = 63)
    public final zzblz zzad;
    @Nullable
    @SafeParcelable.Field(m72314id = 64)
    public final String zzae;
    @SafeParcelable.Field(m72314id = 65)
    public final Bundle zzaf;
    @Nullable
    @SafeParcelable.Field(m72314id = 2)
    public final Bundle zzb;
    @SafeParcelable.Field(m72314id = 3)
    public final com.google.android.gms.ads.internal.client.zzm zzc;
    @SafeParcelable.Field(m72314id = 4)
    public final com.google.android.gms.ads.internal.client.zzs zzd;
    @SafeParcelable.Field(m72314id = 5)
    public final String zze;
    @SafeParcelable.Field(m72314id = 6)
    public final ApplicationInfo zzf;
    @Nullable
    @SafeParcelable.Field(m72314id = 7)
    public final PackageInfo zzg;
    @SafeParcelable.Field(m72314id = 8)
    public final String zzh;
    @SafeParcelable.Field(m72314id = 9)
    public final String zzi;
    @SafeParcelable.Field(m72314id = 10)
    public final String zzj;
    @SafeParcelable.Field(m72314id = 11)
    public final VersionInfoParcel zzk;
    @SafeParcelable.Field(m72314id = 12)
    public final Bundle zzl;
    @SafeParcelable.Field(m72314id = 13)
    public final int zzm;
    @SafeParcelable.Field(m72314id = 14)
    public final List zzn;
    @SafeParcelable.Field(m72314id = 15)
    public final Bundle zzo;
    @SafeParcelable.Field(m72314id = 16)
    public final boolean zzp;
    @SafeParcelable.Field(m72314id = 18)
    public final int zzq;
    @SafeParcelable.Field(m72314id = 19)
    public final int zzr;
    @SafeParcelable.Field(m72314id = 20)
    public final float zzs;
    @SafeParcelable.Field(m72314id = 21)
    public final String zzt;
    @SafeParcelable.Field(m72314id = 25)
    public final long zzu;
    @SafeParcelable.Field(m72314id = 26)
    public final String zzv;
    @Nullable
    @SafeParcelable.Field(m72314id = 27)
    public final List zzw;
    @SafeParcelable.Field(m72314id = 28)
    public final String zzx;
    @SafeParcelable.Field(m72314id = 29)
    public final zzbfl zzy;
    @SafeParcelable.Field(m72314id = 30)
    public final List zzz;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzbuq(@SafeParcelable.Param(m72313id = 1) int i, @SafeParcelable.Param(m72313id = 2) Bundle bundle, @SafeParcelable.Param(m72313id = 3) com.google.android.gms.ads.internal.client.zzm zzmVar, @SafeParcelable.Param(m72313id = 4) com.google.android.gms.ads.internal.client.zzs zzsVar, @SafeParcelable.Param(m72313id = 5) String str, @SafeParcelable.Param(m72313id = 6) ApplicationInfo applicationInfo, @SafeParcelable.Param(m72313id = 7) PackageInfo packageInfo, @SafeParcelable.Param(m72313id = 8) String str2, @SafeParcelable.Param(m72313id = 9) String str3, @SafeParcelable.Param(m72313id = 10) String str4, @SafeParcelable.Param(m72313id = 11) VersionInfoParcel versionInfoParcel, @SafeParcelable.Param(m72313id = 12) Bundle bundle2, @SafeParcelable.Param(m72313id = 13) int i2, @SafeParcelable.Param(m72313id = 14) List list, @SafeParcelable.Param(m72313id = 15) Bundle bundle3, @SafeParcelable.Param(m72313id = 16) boolean z, @SafeParcelable.Param(m72313id = 18) int i3, @SafeParcelable.Param(m72313id = 19) int i4, @SafeParcelable.Param(m72313id = 20) float f, @SafeParcelable.Param(m72313id = 21) String str5, @SafeParcelable.Param(m72313id = 25) long j, @SafeParcelable.Param(m72313id = 26) String str6, @SafeParcelable.Param(m72313id = 27) List list2, @SafeParcelable.Param(m72313id = 28) String str7, @SafeParcelable.Param(m72313id = 29) zzbfl zzbflVar, @SafeParcelable.Param(m72313id = 30) List list3, @SafeParcelable.Param(m72313id = 31) long j2, @SafeParcelable.Param(m72313id = 33) String str8, @SafeParcelable.Param(m72313id = 34) float f2, @SafeParcelable.Param(m72313id = 40) boolean z2, @SafeParcelable.Param(m72313id = 35) int i5, @SafeParcelable.Param(m72313id = 36) int i6, @SafeParcelable.Param(m72313id = 37) boolean z3, @SafeParcelable.Param(m72313id = 39) String str9, @SafeParcelable.Param(m72313id = 41) String str10, @SafeParcelable.Param(m72313id = 42) boolean z4, @SafeParcelable.Param(m72313id = 43) int i7, @SafeParcelable.Param(m72313id = 44) Bundle bundle4, @SafeParcelable.Param(m72313id = 45) String str11, @SafeParcelable.Param(m72313id = 46) com.google.android.gms.ads.internal.client.zzef zzefVar, @SafeParcelable.Param(m72313id = 47) boolean z5, @SafeParcelable.Param(m72313id = 48) Bundle bundle5, @Nullable @SafeParcelable.Param(m72313id = 49) String str12, @Nullable @SafeParcelable.Param(m72313id = 50) String str13, @Nullable @SafeParcelable.Param(m72313id = 51) String str14, @SafeParcelable.Param(m72313id = 52) boolean z6, @SafeParcelable.Param(m72313id = 53) List list4, @SafeParcelable.Param(m72313id = 54) String str15, @SafeParcelable.Param(m72313id = 55) List list5, @SafeParcelable.Param(m72313id = 56) int i8, @SafeParcelable.Param(m72313id = 57) boolean z7, @SafeParcelable.Param(m72313id = 58) boolean z8, @SafeParcelable.Param(m72313id = 59) boolean z9, @SafeParcelable.Param(m72313id = 60) ArrayList arrayList, @SafeParcelable.Param(m72313id = 61) String str16, @SafeParcelable.Param(m72313id = 63) zzblz zzblzVar, @Nullable @SafeParcelable.Param(m72313id = 64) String str17, @SafeParcelable.Param(m72313id = 65) Bundle bundle6) {
        List unmodifiableList;
        List unmodifiableList2;
        this.zza = i;
        this.zzb = bundle;
        this.zzc = zzmVar;
        this.zzd = zzsVar;
        this.zze = str;
        this.zzf = applicationInfo;
        this.zzg = packageInfo;
        this.zzh = str2;
        this.zzi = str3;
        this.zzj = str4;
        this.zzk = versionInfoParcel;
        this.zzl = bundle2;
        this.zzm = i2;
        this.zzn = list;
        if (list3 == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list3);
        }
        this.zzz = unmodifiableList;
        this.zzo = bundle3;
        this.zzp = z;
        this.zzq = i3;
        this.zzr = i4;
        this.zzs = f;
        this.zzt = str5;
        this.zzu = j;
        this.zzv = str6;
        if (list2 == null) {
            unmodifiableList2 = Collections.emptyList();
        } else {
            unmodifiableList2 = Collections.unmodifiableList(list2);
        }
        this.zzw = unmodifiableList2;
        this.zzx = str7;
        this.zzy = zzbflVar;
        this.zzA = j2;
        this.zzB = str8;
        this.zzC = f2;
        this.zzH = z2;
        this.zzD = i5;
        this.zzE = i6;
        this.zzF = z3;
        this.zzG = str9;
        this.zzI = str10;
        this.zzJ = z4;
        this.zzK = i7;
        this.zzL = bundle4;
        this.zzM = str11;
        this.zzN = zzefVar;
        this.zzO = z5;
        this.zzP = bundle5;
        this.zzQ = str12;
        this.zzR = str13;
        this.zzS = str14;
        this.zzT = z6;
        this.zzU = list4;
        this.zzV = str15;
        this.zzW = list5;
        this.zzX = i8;
        this.zzY = z7;
        this.zzZ = z8;
        this.zzaa = z9;
        this.zzab = arrayList;
        this.zzac = str16;
        this.zzad = zzblzVar;
        this.zzae = str17;
        this.zzaf = bundle6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        SafeParcelWriter.writeParcelable(parcel, 6, this.zzf, i, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 10, this.zzj, false);
        SafeParcelWriter.writeParcelable(parcel, 11, this.zzk, i, false);
        SafeParcelWriter.writeBundle(parcel, 12, this.zzl, false);
        SafeParcelWriter.writeInt(parcel, 13, this.zzm);
        SafeParcelWriter.writeStringList(parcel, 14, this.zzn, false);
        SafeParcelWriter.writeBundle(parcel, 15, this.zzo, false);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzp);
        SafeParcelWriter.writeInt(parcel, 18, this.zzq);
        SafeParcelWriter.writeInt(parcel, 19, this.zzr);
        SafeParcelWriter.writeFloat(parcel, 20, this.zzs);
        SafeParcelWriter.writeString(parcel, 21, this.zzt, false);
        SafeParcelWriter.writeLong(parcel, 25, this.zzu);
        SafeParcelWriter.writeString(parcel, 26, this.zzv, false);
        SafeParcelWriter.writeStringList(parcel, 27, this.zzw, false);
        SafeParcelWriter.writeString(parcel, 28, this.zzx, false);
        SafeParcelWriter.writeParcelable(parcel, 29, this.zzy, i, false);
        SafeParcelWriter.writeStringList(parcel, 30, this.zzz, false);
        SafeParcelWriter.writeLong(parcel, 31, this.zzA);
        SafeParcelWriter.writeString(parcel, 33, this.zzB, false);
        SafeParcelWriter.writeFloat(parcel, 34, this.zzC);
        SafeParcelWriter.writeInt(parcel, 35, this.zzD);
        SafeParcelWriter.writeInt(parcel, 36, this.zzE);
        SafeParcelWriter.writeBoolean(parcel, 37, this.zzF);
        SafeParcelWriter.writeString(parcel, 39, this.zzG, false);
        SafeParcelWriter.writeBoolean(parcel, 40, this.zzH);
        SafeParcelWriter.writeString(parcel, 41, this.zzI, false);
        SafeParcelWriter.writeBoolean(parcel, 42, this.zzJ);
        SafeParcelWriter.writeInt(parcel, 43, this.zzK);
        SafeParcelWriter.writeBundle(parcel, 44, this.zzL, false);
        SafeParcelWriter.writeString(parcel, 45, this.zzM, false);
        SafeParcelWriter.writeParcelable(parcel, 46, this.zzN, i, false);
        SafeParcelWriter.writeBoolean(parcel, 47, this.zzO);
        SafeParcelWriter.writeBundle(parcel, 48, this.zzP, false);
        SafeParcelWriter.writeString(parcel, 49, this.zzQ, false);
        SafeParcelWriter.writeString(parcel, 50, this.zzR, false);
        SafeParcelWriter.writeString(parcel, 51, this.zzS, false);
        SafeParcelWriter.writeBoolean(parcel, 52, this.zzT);
        SafeParcelWriter.writeIntegerList(parcel, 53, this.zzU, false);
        SafeParcelWriter.writeString(parcel, 54, this.zzV, false);
        SafeParcelWriter.writeStringList(parcel, 55, this.zzW, false);
        SafeParcelWriter.writeInt(parcel, 56, this.zzX);
        SafeParcelWriter.writeBoolean(parcel, 57, this.zzY);
        SafeParcelWriter.writeBoolean(parcel, 58, this.zzZ);
        SafeParcelWriter.writeBoolean(parcel, 59, this.zzaa);
        SafeParcelWriter.writeStringList(parcel, 60, this.zzab, false);
        SafeParcelWriter.writeString(parcel, 61, this.zzac, false);
        SafeParcelWriter.writeParcelable(parcel, 63, this.zzad, i, false);
        SafeParcelWriter.writeString(parcel, 64, this.zzae, false);
        SafeParcelWriter.writeBundle(parcel, 65, this.zzaf, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
