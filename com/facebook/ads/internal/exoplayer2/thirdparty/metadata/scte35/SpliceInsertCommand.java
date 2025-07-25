package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.p370X.C11702Du;
import com.facebook.ads.redexgen.p370X.C11703Dv;
import com.facebook.ads.redexgen.p370X.C11939I4;
import com.facebook.ads.redexgen.p370X.C11950IG;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static String[] A0D = {"o7T1oZxGxBAHWlRkOQbegsoO93grXIxk", "XvHj8Hk7hABY8IbbTIjHE9pA", "b34rJCODGAR2kw7", "DkxrTnoqNZJiwxANPjTMYz", "HEmBXoCf3O0IVvOMBCnyZOWE", "qlaxw3mTgaR0aM1", "MzIHyiWSWVKcGZIDQW3LWEN9ullkmdDP", "EF2bbwfelQ72cJWGrchq3sqAmXqEDeOA"};
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new C11702Du();
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List<C11703Dv> A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C11703Dv> list, boolean z5, long j4, int i, int i2, int i3) {
        this.A06 = j;
        this.A0B = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A0C = z4;
        this.A05 = j2;
        this.A04 = j3;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z5;
        this.A03 = j4;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.A06 = parcel.readLong();
        this.A0B = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        this.A0A = parcel.readByte() == 1;
        this.A0C = parcel.readByte() == 1;
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C11703Dv.A00(parcel));
        }
        this.A07 = Collections.unmodifiableList(arrayList);
        int componentSpliceListSize = parcel.readByte();
        this.A08 = componentSpliceListSize == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListSize2 = parcel.readInt();
        this.A02 = componentSpliceListSize2;
        int componentSpliceListSize3 = parcel.readInt();
        this.A00 = componentSpliceListSize3;
        int componentSpliceListSize4 = parcel.readInt();
        this.A01 = componentSpliceListSize4;
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, C11702Du c11702Du) {
        this(parcel);
    }

    public static SpliceInsertCommand A00(C11939I4 c11939i4, long j, C11950IG c11950ig) {
        long A0M = c11939i4.A0M();
        boolean z = (c11939i4.A0E() & 128) != 0;
        boolean z2 = false;
        boolean outOfNetworkIndicator = false;
        boolean z3 = false;
        long j2 = -9223372036854775807L;
        List emptyList = Collections.emptyList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z4 = false;
        long j3 = -9223372036854775807L;
        if (!z) {
            int A0E = c11939i4.A0E();
            z2 = (A0E & 128) != 0;
            outOfNetworkIndicator = (A0E & 64) != 0;
            boolean autoReturn = (A0E & 32) != 0;
            int i4 = A0E & 16;
            if (A0D[3].length() != 22) {
                throw new RuntimeException();
            }
            A0D[3] = "PfD4phwgK3fDtd36VsgCIY";
            if (i4 != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (outOfNetworkIndicator && !z3) {
                j2 = TimeSignalCommand.A00(c11939i4, j);
            }
            if (!outOfNetworkIndicator) {
                int componentCount = c11939i4.A0E();
                emptyList = new ArrayList(componentCount);
                for (int i5 = 0; i5 < componentCount; i5++) {
                    int componentTag = c11939i4.A0E();
                    long j4 = -9223372036854775807L;
                    if (!z3) {
                        j4 = TimeSignalCommand.A00(c11939i4, j);
                    }
                    emptyList.add(new C11703Dv(componentTag, j4, c11950ig.A07(j4), null));
                }
            }
            if (autoReturn) {
                long A0E2 = c11939i4.A0E();
                z4 = (A0E2 & 128) != 0;
                j3 = (1000 * (((A0E2 & 1) << 32) | c11939i4.A0M())) / 90;
            }
            i = c11939i4.A0I();
            i2 = c11939i4.A0E();
            i3 = c11939i4.A0E();
        }
        return new SpliceInsertCommand(A0M, z, z2, outOfNetworkIndicator, z3, j2, c11950ig.A07(j2), emptyList, z4, j3, i, i2, i3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        int size = this.A07.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            List<C11703Dv> list = this.A07;
            String[] strArr = A0D;
            String str = strArr[2];
            String str2 = strArr[5];
            int i3 = str.length();
            int componentSpliceListSize = str2.length();
            if (i3 != componentSpliceListSize) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[1] = "4YWbA25kauTneX5iGtOo38Lw";
            strArr2[4] = "7oIVhYtWgczHhLZ4eBK9i0jf";
            list.get(i2).A01(parcel);
        }
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        int componentSpliceListSize2 = this.A02;
        parcel.writeInt(componentSpliceListSize2);
        int componentSpliceListSize3 = this.A00;
        parcel.writeInt(componentSpliceListSize3);
        int componentSpliceListSize4 = this.A01;
        parcel.writeInt(componentSpliceListSize4);
    }
}
