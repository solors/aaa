package com.monetization.ads.exo.drm;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C30937nf;
import com.yandex.mobile.ads.impl.C31014o3;
import com.yandex.mobile.ads.impl.C31219ql;
import com.yandex.mobile.ads.impl.y32;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes7.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new C25463a();

    /* renamed from: b */
    private final SchemeData[] f66092b;

    /* renamed from: c */
    private int f66093c;
    @Nullable

    /* renamed from: d */
    public final String f66094d;

    /* renamed from: e */
    public final int f66095e;

    /* renamed from: com.monetization.ads.exo.drm.DrmInitData$a */
    /* loaded from: classes7.dex */
    final class C25463a implements Parcelable.Creator<DrmInitData> {
        C25463a() {
        }

        @Override // android.os.Parcelable.Creator
        public final DrmInitData createFromParcel(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DrmInitData[] newArray(int i) {
            return new DrmInitData[i];
        }
    }

    public DrmInitData(ArrayList arrayList) {
        this(null, false, (SchemeData[]) arrayList.toArray(new SchemeData[0]));
    }

    /* renamed from: a */
    public final SchemeData m44519a(int i) {
        return this.f66092b[i];
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = C31219ql.f84416a;
        if (uuid.equals(schemeData3.f66097c)) {
            if (uuid.equals(schemeData4.f66097c)) {
                return 0;
            }
            return 1;
        }
        return schemeData3.f66097c.compareTo(schemeData4.f66097c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        if (y32.m27076a(this.f66094d, drmInitData.f66094d) && Arrays.equals(this.f66092b, drmInitData.f66092b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f66093c == 0) {
            String str = this.f66094d;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f66093c = (hashCode * 31) + Arrays.hashCode(this.f66092b);
        }
        return this.f66093c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f66094d);
        parcel.writeTypedArray(this.f66092b, 0);
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this(null, true, schemeDataArr);
    }

    @CheckResult
    /* renamed from: a */
    public final DrmInitData m44518a(@Nullable String str) {
        return y32.m27076a(this.f66094d, str) ? this : new DrmInitData(str, false, this.f66092b);
    }

    private DrmInitData(@Nullable String str, boolean z, SchemeData... schemeDataArr) {
        this.f66094d = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f66092b = schemeDataArr;
        this.f66095e = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    /* loaded from: classes7.dex */
    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new C25462a();

        /* renamed from: b */
        private int f66096b;

        /* renamed from: c */
        public final UUID f66097c;
        @Nullable

        /* renamed from: d */
        public final String f66098d;

        /* renamed from: e */
        public final String f66099e;
        @Nullable

        /* renamed from: f */
        public final byte[] f66100f;

        /* renamed from: com.monetization.ads.exo.drm.DrmInitData$SchemeData$a */
        /* loaded from: classes7.dex */
        final class C25462a implements Parcelable.Creator<SchemeData> {
            C25462a() {
            }

            @Override // android.os.Parcelable.Creator
            public final SchemeData createFromParcel(Parcel parcel) {
                return new SchemeData(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final SchemeData[] newArray(int i) {
                return new SchemeData[i];
            }
        }

        public SchemeData(UUID uuid, @Nullable String str, String str2, @Nullable byte[] bArr) {
            this.f66097c = (UUID) C30937nf.m31570a(uuid);
            this.f66098d = str;
            this.f66099e = (String) C30937nf.m31570a(str2);
            this.f66100f = bArr;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            if (!y32.m27076a(this.f66098d, schemeData.f66098d) || !y32.m27076a(this.f66099e, schemeData.f66099e) || !y32.m27076a(this.f66097c, schemeData.f66097c) || !Arrays.equals(this.f66100f, schemeData.f66100f)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode;
            if (this.f66096b == 0) {
                int hashCode2 = this.f66097c.hashCode() * 31;
                String str = this.f66098d;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                this.f66096b = Arrays.hashCode(this.f66100f) + C31014o3.m31189a(this.f66099e, (hashCode2 + hashCode) * 31, 31);
            }
            return this.f66096b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f66097c.getMostSignificantBits());
            parcel.writeLong(this.f66097c.getLeastSignificantBits());
            parcel.writeString(this.f66098d);
            parcel.writeString(this.f66099e);
            parcel.writeByteArray(this.f66100f);
        }

        SchemeData(Parcel parcel) {
            this.f66097c = new UUID(parcel.readLong(), parcel.readLong());
            this.f66098d = parcel.readString();
            this.f66099e = (String) y32.m27077a(parcel.readString());
            this.f66100f = parcel.createByteArray();
        }
    }

    DrmInitData(Parcel parcel) {
        this.f66094d = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) y32.m27077a((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.f66092b = schemeDataArr;
        this.f66095e = schemeDataArr.length;
    }
}
