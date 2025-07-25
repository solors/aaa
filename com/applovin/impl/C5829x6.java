package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: com.applovin.impl.x6 */
/* loaded from: classes2.dex */
public final class C5829x6 implements Comparator, Parcelable {
    public static final Parcelable.Creator<C5829x6> CREATOR = new C5830a();

    /* renamed from: a */
    private final C5831b[] f11933a;

    /* renamed from: b */
    private int f11934b;

    /* renamed from: c */
    public final String f11935c;

    /* renamed from: d */
    public final int f11936d;

    /* renamed from: com.applovin.impl.x6$a */
    /* loaded from: classes2.dex */
    class C5830a implements Parcelable.Creator {
        C5830a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5829x6[] newArray(int i) {
            return new C5829x6[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5829x6 createFromParcel(Parcel parcel) {
            return new C5829x6(parcel);
        }
    }

    /* renamed from: com.applovin.impl.x6$b */
    /* loaded from: classes2.dex */
    public static final class C5831b implements Parcelable {
        public static final Parcelable.Creator<C5831b> CREATOR = new C5832a();

        /* renamed from: a */
        private int f11937a;

        /* renamed from: b */
        public final UUID f11938b;

        /* renamed from: c */
        public final String f11939c;

        /* renamed from: d */
        public final String f11940d;

        /* renamed from: f */
        public final byte[] f11941f;

        /* renamed from: com.applovin.impl.x6$b$a */
        /* loaded from: classes2.dex */
        class C5832a implements Parcelable.Creator {
            C5832a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C5831b[] newArray(int i) {
                return new C5831b[i];
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C5831b createFromParcel(Parcel parcel) {
                return new C5831b(parcel);
            }
        }

        C5831b(Parcel parcel) {
            this.f11938b = new UUID(parcel.readLong(), parcel.readLong());
            this.f11939c = parcel.readString();
            this.f11940d = (String) AbstractC5863xp.m93017a((Object) parcel.readString());
            this.f11941f = parcel.createByteArray();
        }

        /* renamed from: a */
        public boolean m93220a(UUID uuid) {
            return AbstractC5538t2.f10798a.equals(this.f11938b) || uuid.equals(this.f11938b);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C5831b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            C5831b c5831b = (C5831b) obj;
            if (!AbstractC5863xp.m93016a((Object) this.f11939c, (Object) c5831b.f11939c) || !AbstractC5863xp.m93016a((Object) this.f11940d, (Object) c5831b.f11940d) || !AbstractC5863xp.m93016a(this.f11938b, c5831b.f11938b) || !Arrays.equals(this.f11941f, c5831b.f11941f)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            if (this.f11937a == 0) {
                int hashCode2 = this.f11938b.hashCode() * 31;
                String str = this.f11939c;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                this.f11937a = ((((hashCode2 + hashCode) * 31) + this.f11940d.hashCode()) * 31) + Arrays.hashCode(this.f11941f);
            }
            return this.f11937a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f11938b.getMostSignificantBits());
            parcel.writeLong(this.f11938b.getLeastSignificantBits());
            parcel.writeString(this.f11939c);
            parcel.writeString(this.f11940d);
            parcel.writeByteArray(this.f11941f);
        }

        /* renamed from: a */
        public C5831b m93219a(byte[] bArr) {
            return new C5831b(this.f11938b, this.f11939c, this.f11940d, bArr);
        }

        public C5831b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f11938b = (UUID) AbstractC4100b1.m100583a(uuid);
            this.f11939c = str;
            this.f11940d = (String) AbstractC4100b1.m100583a((Object) str2);
            this.f11941f = bArr;
        }

        public C5831b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }
    }

    C5829x6(Parcel parcel) {
        this.f11935c = parcel.readString();
        C5831b[] c5831bArr = (C5831b[]) AbstractC5863xp.m93017a((Object) ((C5831b[]) parcel.createTypedArray(C5831b.CREATOR)));
        this.f11933a = c5831bArr;
        this.f11936d = c5831bArr.length;
    }

    /* renamed from: a */
    public C5829x6 m93223a(String str) {
        return AbstractC5863xp.m93016a((Object) this.f11935c, (Object) str) ? this : new C5829x6(str, false, this.f11933a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5829x6.class != obj.getClass()) {
            return false;
        }
        C5829x6 c5829x6 = (C5829x6) obj;
        if (AbstractC5863xp.m93016a((Object) this.f11935c, (Object) c5829x6.f11935c) && Arrays.equals(this.f11933a, c5829x6.f11933a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        if (this.f11934b == 0) {
            String str = this.f11935c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f11934b = (hashCode * 31) + Arrays.hashCode(this.f11933a);
        }
        return this.f11934b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11935c);
        parcel.writeTypedArray(this.f11933a, 0);
    }

    /* renamed from: a */
    public C5831b m93225a(int i) {
        return this.f11933a[i];
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(C5831b c5831b, C5831b c5831b2) {
        UUID uuid = AbstractC5538t2.f10798a;
        if (uuid.equals(c5831b.f11938b)) {
            return uuid.equals(c5831b2.f11938b) ? 0 : 1;
        }
        return c5831b.f11938b.compareTo(c5831b2.f11938b);
    }

    private C5829x6(String str, boolean z, C5831b... c5831bArr) {
        this.f11935c = str;
        c5831bArr = z ? (C5831b[]) c5831bArr.clone() : c5831bArr;
        this.f11933a = c5831bArr;
        this.f11936d = c5831bArr.length;
        Arrays.sort(c5831bArr, this);
    }

    public C5829x6(String str, C5831b... c5831bArr) {
        this(str, true, c5831bArr);
    }

    public C5829x6(List list) {
        this(null, false, (C5831b[]) list.toArray(new C5831b[0]));
    }

    public C5829x6(C5831b... c5831bArr) {
        this(null, c5831bArr);
    }
}
