package com.facebook.ads.internal.exoplayer2.thirdparty.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.facebook.ads.redexgen.p370X.AbstractC11953IK;
import com.facebook.ads.redexgen.p370X.C11852Gd;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class DefaultTrackSelector$Parameters implements Parcelable {
    public static String[] A0I = {"8cmZQKSr4e", "iMp0vhQuApByAzd3UlzuqPNosBBIij56", "lQE7OUEJZwYk", "ijVF0TjJmPEEom5xXBBS3MNokpliI9Vz", "24priIiqAscL", "HHTbuc6jJnpbFValFtkFIwv24qRilhed", "j1grCTc2L", "MPdgTc6Z3sPUFClC4uSLQHQa2XebDs9v"};
    public static final DefaultTrackSelector$Parameters A0J = new DefaultTrackSelector$Parameters();
    public static final Parcelable.Creator<DefaultTrackSelector$Parameters> CREATOR = new C11852Gd();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> A0G;
    public final SparseBooleanArray A0H;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A01(Parcel parcel, SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray) {
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            int keyAt = sparseArray.keyAt(i);
            Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> valueAt = sparseArray.valueAt(i);
            int size2 = valueAt.size();
            parcel.writeInt(keyAt);
            parcel.writeInt(size2);
            for (Map.Entry<TrackGroupArray, DefaultTrackSelector$SelectionOverride> entry : valueAt.entrySet()) {
                parcel.writeParcelable(entry.getKey(), 0);
                parcel.writeParcelable(entry.getValue(), 0);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A04(java.util.Map<com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride> r5, java.util.Map<com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray, com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$SelectionOverride> r6) {
        /*
            int r1 = r5.size()
            int r0 = r6.size()
            r4 = 0
            if (r0 == r1) goto Lc
            return r4
        Lc:
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L14:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r1 = r3.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray r2 = (com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray) r2
            boolean r0 = r6.containsKey(r2)
            if (r0 == 0) goto L3a
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r0 = r6.get(r2)
            boolean r0 = com.facebook.ads.redexgen.p370X.AbstractC11953IK.A0g(r1, r0)
            if (r0 != 0) goto L14
        L3a:
            return r4
        L3b:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters.A04(java.util.Map, java.util.Map):boolean");
    }

    public DefaultTrackSelector$Parameters() {
        this(new SparseArray(), new SparseBooleanArray(), null, null, false, 0, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, 0);
    }

    public DefaultTrackSelector$Parameters(Parcel parcel) {
        this.A0G = A00(parcel);
        this.A0H = parcel.readSparseBooleanArray();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A0E = AbstractC11953IK.A0f(parcel);
        this.A00 = parcel.readInt();
        this.A0D = AbstractC11953IK.A0f(parcel);
        this.A09 = AbstractC11953IK.A0f(parcel);
        this.A0A = AbstractC11953IK.A0f(parcel);
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A0C = AbstractC11953IK.A0f(parcel);
        this.A0B = AbstractC11953IK.A0f(parcel);
        this.A06 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A0F = AbstractC11953IK.A0f(parcel);
        this.A04 = parcel.readInt();
    }

    public DefaultTrackSelector$Parameters(SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray, String str, String str2, boolean z, int i, boolean z2, boolean z3, boolean z4, int i2, int i3, int i4, boolean z5, boolean z6, int i5, int i6, boolean z7, int i7) {
        this.A0G = sparseArray;
        this.A0H = sparseBooleanArray;
        this.A07 = AbstractC11953IK.A0L(str);
        this.A08 = AbstractC11953IK.A0L(str2);
        this.A0E = z;
        this.A00 = i;
        this.A0D = z2;
        this.A09 = z3;
        this.A0A = z4;
        this.A03 = i2;
        this.A02 = i3;
        this.A01 = i4;
        this.A0C = z5;
        this.A0B = z6;
        this.A06 = i5;
        this.A05 = i6;
        this.A0F = z7;
        this.A04 = i7;
    }

    public static SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> A00(Parcel parcel) {
        int readInt = parcel.readInt();
        SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray = new SparseArray<>(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            int overrideCount = parcel.readInt();
            HashMap hashMap = new HashMap(overrideCount);
            for (int i2 = 0; i2 < overrideCount; i2++) {
                hashMap.put((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader()), (DefaultTrackSelector$SelectionOverride) parcel.readParcelable(DefaultTrackSelector$SelectionOverride.class.getClassLoader()));
            }
            sparseArray.put(readInt2, hashMap);
        }
        return sparseArray;
    }

    public static boolean A02(SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> second, SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray) {
        int size = second.size();
        int firstSize = sparseArray.size();
        if (firstSize != size) {
            return false;
        }
        for (int indexInSecond = 0; indexInSecond < size; indexInSecond++) {
            int keyAt = second.keyAt(indexInSecond);
            String[] strArr = A0I;
            String str = strArr[3];
            String str2 = strArr[1];
            int indexInFirst = str.charAt(21);
            int firstSize2 = str2.charAt(21);
            if (indexInFirst == firstSize2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[2] = "cTRaF8RO9nXx";
            strArr2[4] = "EDqN0kPd4EtP";
            int firstSize3 = sparseArray.indexOfKey(keyAt);
            if (firstSize3 < 0 || !A04(second.valueAt(indexInSecond), sparseArray.valueAt(firstSize3))) {
                return false;
            }
        }
        return true;
    }

    public static boolean A03(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray.size();
        int firstSize = sparseBooleanArray2.size();
        if (firstSize != size) {
            return false;
        }
        for (int indexInFirst = 0; indexInFirst < size; indexInFirst++) {
            int firstSize2 = sparseBooleanArray.keyAt(indexInFirst);
            if (sparseBooleanArray2.indexOfKey(firstSize2) < 0) {
                return false;
            }
        }
        return true;
    }

    public final DefaultTrackSelector$SelectionOverride A05(int i, TrackGroupArray trackGroupArray) {
        Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> overrides = this.A0G.get(i);
        if (overrides != null) {
            return overrides.get(trackGroupArray);
        }
        return null;
    }

    public final boolean A06(int i) {
        return this.A0H.get(i);
    }

    public final boolean A07(int i, TrackGroupArray trackGroupArray) {
        Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> overrides = this.A0G.get(i);
        return overrides != null && overrides.containsKey(trackGroupArray);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = (DefaultTrackSelector$Parameters) obj;
        if (this.A0E == defaultTrackSelector$Parameters.A0E && this.A00 == defaultTrackSelector$Parameters.A00 && this.A0D == defaultTrackSelector$Parameters.A0D && this.A09 == defaultTrackSelector$Parameters.A09 && this.A0A == defaultTrackSelector$Parameters.A0A && this.A03 == defaultTrackSelector$Parameters.A03 && this.A02 == defaultTrackSelector$Parameters.A02) {
            boolean z = this.A0C;
            boolean z2 = defaultTrackSelector$Parameters.A0C;
            String[] strArr = A0I;
            if (strArr[5].charAt(6) == strArr[7].charAt(6)) {
                String[] strArr2 = A0I;
                strArr2[2] = "sfh4v5JH9YfM";
                strArr2[4] = "60euWtnhJ0n7";
                if (z == z2 && this.A0B == defaultTrackSelector$Parameters.A0B && this.A0F == defaultTrackSelector$Parameters.A0F && this.A06 == defaultTrackSelector$Parameters.A06 && this.A05 == defaultTrackSelector$Parameters.A05 && this.A01 == defaultTrackSelector$Parameters.A01) {
                    int i = this.A04;
                    String[] strArr3 = A0I;
                    if (strArr3[3].charAt(21) != strArr3[1].charAt(21)) {
                        String[] strArr4 = A0I;
                        strArr4[3] = "jFxDzMr4Wl6CXL9gL9bgBgUZ4CFyGZQQ";
                        strArr4[1] = "AvCBIiMA1IKKXmLhd6rc5nfLtcJ8dACa";
                        if (i == defaultTrackSelector$Parameters.A04 && TextUtils.equals(this.A07, defaultTrackSelector$Parameters.A07) && TextUtils.equals(this.A08, defaultTrackSelector$Parameters.A08) && A03(this.A0H, defaultTrackSelector$Parameters.A0H) && A02(this.A0G, defaultTrackSelector$Parameters.A0G)) {
                            return true;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A0E ? 1 : 0;
        int i = result * 31;
        int result2 = this.A00;
        int result3 = this.A09 ? 1 : 0;
        int result4 = this.A03;
        int result5 = this.A0C ? 1 : 0;
        int result6 = this.A0F ? 1 : 0;
        int result7 = this.A05;
        int result8 = this.A04;
        return ((((((((((((((((((((((((((((i + result2) * 31) + (this.A0D ? 1 : 0)) * 31) + result3) * 31) + (this.A0A ? 1 : 0)) * 31) + result4) * 31) + this.A02) * 31) + result5) * 31) + (this.A0B ? 1 : 0)) * 31) + result6) * 31) + this.A06) * 31) + result7) * 31) + this.A01) * 31) + result8) * 31) + (this.A07 == null ? 0 : this.A07.hashCode())) * 31) + (this.A08 != null ? this.A08.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        A01(parcel, this.A0G);
        parcel.writeSparseBooleanArray(this.A0H);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        AbstractC11953IK.A0V(parcel, this.A0E);
        parcel.writeInt(this.A00);
        AbstractC11953IK.A0V(parcel, this.A0D);
        AbstractC11953IK.A0V(parcel, this.A09);
        AbstractC11953IK.A0V(parcel, this.A0A);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        AbstractC11953IK.A0V(parcel, this.A0C);
        AbstractC11953IK.A0V(parcel, this.A0B);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A05);
        AbstractC11953IK.A0V(parcel, this.A0F);
        parcel.writeInt(this.A04);
    }
}
