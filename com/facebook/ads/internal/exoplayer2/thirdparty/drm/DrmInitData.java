package com.facebook.ads.internal.exoplayer2.thirdparty.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.p370X.AbstractC114409b;
import com.facebook.ads.redexgen.p370X.AbstractC11914Hf;
import com.facebook.ads.redexgen.p370X.AbstractC11953IK;
import com.facebook.ads.redexgen.p370X.C11562Ba;
import com.facebook.ads.redexgen.p370X.C11563Bb;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* loaded from: assets/audience_network.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new C11562Ba();
    public int A00;
    public final int A01;
    public final String A02;
    public final SchemeData[] A03;

    /* loaded from: assets/audience_network.dex */
    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new C11563Bb();
        public int A00;
        public final String A01;
        public final String A02;
        public final boolean A03;
        public final byte[] A04;
        public final UUID A05;

        public SchemeData(Parcel parcel) {
            this.A05 = new UUID(parcel.readLong(), parcel.readLong());
            this.A01 = parcel.readString();
            this.A02 = parcel.readString();
            this.A04 = parcel.createByteArray();
            this.A03 = parcel.readByte() != 0;
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr, boolean z) {
            this.A05 = (UUID) AbstractC11914Hf.A01(uuid);
            this.A01 = str;
            this.A02 = (String) AbstractC11914Hf.A01(str2);
            this.A04 = bArr;
            this.A03 = z;
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        public SchemeData(UUID uuid, String str, byte[] bArr, boolean z) {
            this(uuid, null, str, bArr, z);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof SchemeData) {
                if (obj == this) {
                    return true;
                }
                SchemeData schemeData = (SchemeData) obj;
                return AbstractC11953IK.A0g(this.A01, schemeData.A01) && AbstractC11953IK.A0g(this.A02, schemeData.A02) && AbstractC11953IK.A0g(this.A05, schemeData.A05) && Arrays.equals(this.A04, schemeData.A04);
            }
            return false;
        }

        public final int hashCode() {
            if (this.A00 == 0) {
                int result = this.A05.hashCode();
                int i = result * 31;
                int result2 = this.A01 == null ? 0 : this.A01.hashCode();
                int result3 = Arrays.hashCode(this.A04);
                this.A00 = ((((i + result2) * 31) + this.A02.hashCode()) * 31) + result3;
            }
            return this.A00;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.A05.getMostSignificantBits());
            parcel.writeLong(this.A05.getLeastSignificantBits());
            parcel.writeString(this.A01);
            parcel.writeString(this.A02);
            parcel.writeByteArray(this.A04);
            parcel.writeByte(this.A03 ? (byte) 1 : (byte) 0);
        }
    }

    public DrmInitData(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        this.A01 = this.A03.length;
    }

    public DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
        this.A02 = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        Arrays.sort(schemeDataArr, this);
        this.A03 = schemeDataArr;
        this.A01 = schemeDataArr.length;
    }

    public DrmInitData(String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    public DrmInitData(List<SchemeData> schemeDatas) {
        this(null, false, (SchemeData[]) schemeDatas.toArray(new SchemeData[schemeDatas.size()]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this(null, schemeDataArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00 */
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        if (AbstractC114409b.A05.equals(schemeData.A05)) {
            return AbstractC114409b.A05.equals(schemeData2.A05) ? 0 : 1;
        }
        return schemeData.A05.compareTo(schemeData2.A05);
    }

    public final SchemeData A01(int i) {
        return this.A03[i];
    }

    public final DrmInitData A02(String str) {
        if (AbstractC11953IK.A0g(this.A02, str)) {
            return this;
        }
        return new DrmInitData(str, false, this.A03);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        if (AbstractC11953IK.A0g(this.A02, drmInitData.A02) && Arrays.equals(this.A03, drmInitData.A03)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = this.A02 == null ? 0 : this.A02.hashCode();
            int i = result * 31;
            int result2 = Arrays.hashCode(this.A03);
            this.A00 = i + result2;
        }
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeTypedArray(this.A03, 0);
    }
}
