package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes5.dex */
public final class zzem implements zzax {
    public static final Parcelable.Creator<zzem> CREATOR = new zzek();
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzem(Parcel parcel, zzel zzelVar) {
        String readString = parcel.readString();
        int i = zzei.zza;
        this.zza = readString;
        byte[] createByteArray = parcel.createByteArray();
        this.zzb = createByteArray;
        this.zzc = parcel.readInt();
        int readInt = parcel.readInt();
        this.zzd = readInt;
        zzb(readString, createByteArray, readInt);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void zzb(String str, byte[] bArr, int i) {
        char c;
        byte b;
        boolean z = true;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1555642602:
                if (str.equals("editable.tracks.samples.location")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 101820674:
                if (str.equals("editable.tracks.length")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 188404399:
                if (str.equals("editable.tracks.offset")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1805012160:
                if (str.equals("editable.tracks.map")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1 && c != 2) {
                if (c != 3) {
                    if (c != 4) {
                        return;
                    }
                    if (i != 75 || bArr.length != 1 || ((b = bArr[0]) != 0 && b != 1)) {
                        z = false;
                    }
                    zzcw.zzd(z);
                    return;
                }
                if (i != 0) {
                    z = false;
                }
                zzcw.zzd(z);
                return;
            }
            if (i != 78 || bArr.length != 8) {
                z = false;
            }
            zzcw.zzd(z);
            return;
        }
        if (i != 23 || bArr.length != 4) {
            z = false;
        }
        zzcw.zzd(z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzem.class == obj.getClass()) {
            zzem zzemVar = (zzem) obj;
            if (this.zza.equals(zzemVar.zza) && Arrays.equals(this.zzb, zzemVar.zzb) && this.zzc == zzemVar.zzc && this.zzd == zzemVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa A[LOOP:0: B:26:0x00a7->B:28:0x00aa, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r5 = this;
            int r0 = r5.zzd
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5a
            if (r0 == r2) goto L53
            r2 = 23
            if (r0 == r2) goto L43
            r2 = 67
            if (r0 == r2) goto L37
            r2 = 75
            if (r0 == r2) goto L2b
            r2 = 78
            if (r0 == r2) goto L1a
            goto L9e
        L1a:
            byte[] r0 = r5.zzb
            com.google.android.gms.internal.ads.zzdy r1 = new com.google.android.gms.internal.ads.zzdy
            r1.<init>(r0)
            long r0 = r1.zzw()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lcb
        L2b:
            byte[] r0 = r5.zzb
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lcb
        L37:
            byte[] r0 = r5.zzb
            int r0 = com.google.android.gms.internal.ads.zzgaq.zzd(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lcb
        L43:
            byte[] r0 = r5.zzb
            int r0 = com.google.android.gms.internal.ads.zzgaq.zzd(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            goto Lcb
        L53:
            byte[] r0 = r5.zzb
            java.lang.String r0 = com.google.android.gms.internal.ads.zzei.zzB(r0)
            goto Lcb
        L5a:
            java.lang.String r0 = r5.zza
            java.lang.String r3 = "editable.tracks.map"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L9e
            java.lang.String r0 = r5.zza
            boolean r0 = r0.equals(r3)
            java.lang.String r3 = "Metadata is not an editable tracks map"
            com.google.android.gms.internal.ads.zzcw.zzg(r0, r3)
            byte[] r0 = r5.zzb
            r0 = r0[r2]
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L78:
            if (r1 >= r0) goto L8a
            byte[] r3 = r5.zzb
            int r4 = r1 + 2
            r3 = r3[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            int r1 = r1 + 1
            goto L78
        L8a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "track types = "
            r0.append(r1)
            java.lang.String r1 = ","
            com.google.android.gms.internal.ads.zzfuf.zzb(r0, r2, r1)
            java.lang.String r0 = r0.toString()
            goto Lcb
        L9e:
            byte[] r0 = r5.zzb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r3 = r0.length
            int r3 = r3 + r3
            r2.<init>(r3)
        La7:
            int r3 = r0.length
            if (r1 >= r3) goto Lc7
            r3 = r0[r1]
            int r3 = r3 >> 4
            r3 = r3 & 15
            r4 = 16
            char r3 = java.lang.Character.forDigit(r3, r4)
            r2.append(r3)
            r3 = r0[r1]
            r3 = r3 & 15
            char r3 = java.lang.Character.forDigit(r3, r4)
            r2.append(r3)
            int r1 = r1 + 1
            goto La7
        Lc7:
            java.lang.String r0 = r2.toString()
        Lcb:
            java.lang.String r1 = r5.zza
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "mdta: key="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", value="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzem.toString():java.lang.String");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeInt(this.zzd);
    }

    public zzem(String str, byte[] bArr, int i, int i2) {
        zzb(str, bArr, i2);
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzax
    public final /* synthetic */ void zza(zzat zzatVar) {
    }
}
