package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.p370X.AbstractC11953IK;
import com.facebook.ads.redexgen.p370X.C11698Dq;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class PrivFrame extends Id3Frame {
    public static byte[] A02;
    public static final Parcelable.Creator<PrivFrame> CREATOR;
    public final String A00;
    public final byte[] A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 35);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{42, 48, Byte.MAX_VALUE, 103, 126, 117, 98, 45, 59, 57, 34, 61};
    }

    static {
        A01();
        CREATOR = new C11698Dq();
    }

    public PrivFrame(Parcel parcel) {
        super(A00(8, 4, 72));
        this.A00 = parcel.readString();
        this.A01 = parcel.createByteArray();
    }

    public PrivFrame(String str, byte[] bArr) {
        super(A00(8, 4, 72));
        this.A00 = str;
        this.A01 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return AbstractC11953IK.A0g(this.A00, privFrame.A00) && Arrays.equals(this.A01, privFrame.A01);
    }

    public final int hashCode() {
        int i = 17 * 31;
        int result = this.A00 != null ? this.A00.hashCode() : 0;
        return ((i + result) * 31) + Arrays.hashCode(this.A01);
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(0, 8, 51) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A01);
    }
}
