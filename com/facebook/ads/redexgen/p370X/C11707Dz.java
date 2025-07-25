package com.facebook.ads.redexgen.p370X;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Dz */
/* loaded from: assets/audience_network.dex */
public final class C11707Dz {
    public static String[] A0B = {"MbQlclBS93OpAIrGgy", "fr4nhdwawCkfl6xe", "", "jazGPK14ugDp9XSpPVwjXwSunadlaYol", "c8hCDXw30CLUJvo3hmXfNwPZepkI4Dm3", "1stzsAzc5mICw7Ui", "zsUepILv7pzPEMGeAcwpA2C", "FE9c5HnV3VVOUNIp57h4JuspLxtKtT80"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List<C11706Dy> A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C11707Dz A02(C11939I4 c11939i4) {
        long A0M = c11939i4.A0M();
        boolean z = (c11939i4.A0E() & 128) != 0;
        boolean z2 = false;
        boolean z3 = false;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z4 = false;
        long j = -9223372036854775807L;
        if (!z) {
            int A0E = c11939i4.A0E();
            z2 = (A0E & 128) != 0;
            z3 = (A0E & 64) != 0;
            int i4 = A0E & 32;
            if (A0B[4].charAt(19) != 'f') {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[1] = "lR24oTmvDHmhIRnH";
            strArr[5] = "ZGf4jEcTYFHAfCYP";
            boolean z5 = i4 != 0;
            r14 = z3 ? c11939i4.A0M() : -9223372036854775807L;
            if (!z3) {
                int A0E2 = c11939i4.A0E();
                arrayList = new ArrayList(A0E2);
                for (int i5 = 0; i5 < A0E2; i5++) {
                    arrayList.add(new C11706Dy(c11939i4.A0E(), c11939i4.A0M(), null));
                }
            }
            if (z5) {
                long A0E3 = c11939i4.A0E();
                z4 = (128 & A0E3) != 0;
                j = (1000 * (((1 & A0E3) << 32) | c11939i4.A0M())) / 90;
            }
            i = c11939i4.A0I();
            i2 = c11939i4.A0E();
            i3 = c11939i4.A0E();
        }
        return new C11707Dz(A0M, z, z2, z3, arrayList, r14, z4, j, i, i2, i3);
    }

    public C11707Dz(long j, boolean z, boolean z2, boolean z3, List<C11706Dy> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
        this.A04 = j;
        this.A0A = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j2;
        this.A07 = z4;
        this.A03 = j3;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public C11707Dz(Parcel parcel) {
        C11706Dy A00;
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            A00 = C11706Dy.A00(parcel);
            arrayList.add(A00);
        }
        this.A06 = Collections.unmodifiableList(arrayList);
        this.A05 = parcel.readLong();
        int componentSpliceListLength = parcel.readByte();
        this.A07 = componentSpliceListLength == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListLength2 = parcel.readInt();
        this.A02 = componentSpliceListLength2;
        int componentSpliceListLength3 = parcel.readInt();
        this.A00 = componentSpliceListLength3;
        int componentSpliceListLength4 = parcel.readInt();
        this.A01 = componentSpliceListLength4;
    }

    public static C11707Dz A00(Parcel parcel) {
        return new C11707Dz(parcel);
    }

    public static /* synthetic */ C11707Dz A01(Parcel parcel) {
        return A00(parcel);
    }

    public static /* synthetic */ C11707Dz A03(C11939I4 c11939i4) {
        return A02(c11939i4);
    }

    public void A04(Parcel parcel) {
        parcel.writeLong(this.A04);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        int size = this.A06.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A02(parcel);
        }
        parcel.writeLong(this.A05);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        int componentSpliceListSize = this.A02;
        parcel.writeInt(componentSpliceListSize);
        int componentSpliceListSize2 = this.A00;
        parcel.writeInt(componentSpliceListSize2);
        int componentSpliceListSize3 = this.A01;
        parcel.writeInt(componentSpliceListSize3);
    }

    public static /* synthetic */ void A05(C11707Dz c11707Dz, Parcel parcel) {
        c11707Dz.A04(parcel);
    }
}
