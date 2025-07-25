package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.C4061af;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.impl.ua */
/* loaded from: classes2.dex */
public final class C5615ua implements C4061af.InterfaceC4063b {
    public static final Parcelable.Creator<C5615ua> CREATOR = new C5616a();

    /* renamed from: a */
    public final int f11124a;

    /* renamed from: b */
    public final String f11125b;

    /* renamed from: c */
    public final String f11126c;

    /* renamed from: d */
    public final String f11127d;

    /* renamed from: f */
    public final boolean f11128f;

    /* renamed from: g */
    public final int f11129g;

    /* renamed from: com.applovin.impl.ua$a */
    /* loaded from: classes2.dex */
    class C5616a implements Parcelable.Creator {
        C5616a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5615ua[] newArray(int i) {
            return new C5615ua[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5615ua createFromParcel(Parcel parcel) {
            return new C5615ua(parcel);
        }
    }

    public C5615ua(int i, String str, String str2, String str3, boolean z, int i2) {
        AbstractC4100b1.m100580a(i2 == -1 || i2 > 0);
        this.f11124a = i;
        this.f11125b = str;
        this.f11126c = str2;
        this.f11127d = str3;
        this.f11128f = z;
        this.f11129g = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.applovin.impl.C5615ua m94184a(java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C5615ua.m94184a(java.util.Map):com.applovin.impl.ua");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5615ua.class != obj.getClass()) {
            return false;
        }
        C5615ua c5615ua = (C5615ua) obj;
        if (this.f11124a == c5615ua.f11124a && AbstractC5863xp.m93016a((Object) this.f11125b, (Object) c5615ua.f11125b) && AbstractC5863xp.m93016a((Object) this.f11126c, (Object) c5615ua.f11126c) && AbstractC5863xp.m93016a((Object) this.f11127d, (Object) c5615ua.f11127d) && this.f11128f == c5615ua.f11128f && this.f11129g == c5615ua.f11129g) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = (this.f11124a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f11125b;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        String str2 = this.f11126c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.f11127d;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return ((((i6 + i4) * 31) + (this.f11128f ? 1 : 0)) * 31) + this.f11129g;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f11126c + "\", genre=\"" + this.f11125b + "\", bitrate=" + this.f11124a + ", metadataInterval=" + this.f11129g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11124a);
        parcel.writeString(this.f11125b);
        parcel.writeString(this.f11126c);
        parcel.writeString(this.f11127d);
        AbstractC5863xp.m93025a(parcel, this.f11128f);
        parcel.writeInt(this.f11129g);
    }

    C5615ua(Parcel parcel) {
        this.f11124a = parcel.readInt();
        this.f11125b = parcel.readString();
        this.f11126c = parcel.readString();
        this.f11127d = parcel.readString();
        this.f11128f = AbstractC5863xp.m93026a(parcel);
        this.f11129g = parcel.readInt();
    }
}
