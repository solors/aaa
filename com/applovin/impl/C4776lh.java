package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.C4061af;
import com.applovin.impl.C5631ud;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.impl.lh */
/* loaded from: classes2.dex */
public final class C4776lh implements C4061af.InterfaceC4063b {
    public static final Parcelable.Creator<C4776lh> CREATOR = new C4777a();

    /* renamed from: a */
    public final int f7758a;

    /* renamed from: b */
    public final String f7759b;

    /* renamed from: c */
    public final String f7760c;

    /* renamed from: d */
    public final int f7761d;

    /* renamed from: f */
    public final int f7762f;

    /* renamed from: g */
    public final int f7763g;

    /* renamed from: h */
    public final int f7764h;

    /* renamed from: i */
    public final byte[] f7765i;

    /* renamed from: com.applovin.impl.lh$a */
    /* loaded from: classes2.dex */
    class C4777a implements Parcelable.Creator {
        C4777a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4776lh[] newArray(int i) {
            return new C4776lh[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4776lh createFromParcel(Parcel parcel) {
            return new C4776lh(parcel);
        }
    }

    public C4776lh(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f7758a = i;
        this.f7759b = str;
        this.f7760c = str2;
        this.f7761d = i2;
        this.f7762f = i3;
        this.f7763g = i4;
        this.f7764h = i5;
        this.f7765i = bArr;
    }

    @Override // com.applovin.impl.C4061af.InterfaceC4063b
    /* renamed from: a */
    public void mo92341a(C5631ud.C5633b c5633b) {
        c5633b.m94136a(this.f7765i, this.f7758a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4776lh.class != obj.getClass()) {
            return false;
        }
        C4776lh c4776lh = (C4776lh) obj;
        if (this.f7758a == c4776lh.f7758a && this.f7759b.equals(c4776lh.f7759b) && this.f7760c.equals(c4776lh.f7760c) && this.f7761d == c4776lh.f7761d && this.f7762f == c4776lh.f7762f && this.f7763g == c4776lh.f7763g && this.f7764h == c4776lh.f7764h && Arrays.equals(this.f7765i, c4776lh.f7765i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((this.f7758a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f7759b.hashCode()) * 31) + this.f7760c.hashCode()) * 31) + this.f7761d) * 31) + this.f7762f) * 31) + this.f7763g) * 31) + this.f7764h) * 31) + Arrays.hashCode(this.f7765i);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f7759b + ", description=" + this.f7760c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7758a);
        parcel.writeString(this.f7759b);
        parcel.writeString(this.f7760c);
        parcel.writeInt(this.f7761d);
        parcel.writeInt(this.f7762f);
        parcel.writeInt(this.f7763g);
        parcel.writeInt(this.f7764h);
        parcel.writeByteArray(this.f7765i);
    }

    C4776lh(Parcel parcel) {
        this.f7758a = parcel.readInt();
        this.f7759b = (String) AbstractC5863xp.m93017a((Object) parcel.readString());
        this.f7760c = (String) AbstractC5863xp.m93017a((Object) parcel.readString());
        this.f7761d = parcel.readInt();
        this.f7762f = parcel.readInt();
        this.f7763g = parcel.readInt();
        this.f7764h = parcel.readInt();
        this.f7765i = (byte[]) AbstractC5863xp.m93017a((Object) parcel.createByteArray());
    }
}
