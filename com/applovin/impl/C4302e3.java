package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.impl.e3 */
/* loaded from: classes2.dex */
public final class C4302e3 extends AbstractC5837xa {
    public static final Parcelable.Creator<C4302e3> CREATOR = new C4303a();

    /* renamed from: b */
    public final String f5757b;

    /* renamed from: c */
    public final int f5758c;

    /* renamed from: d */
    public final int f5759d;

    /* renamed from: f */
    public final long f5760f;

    /* renamed from: g */
    public final long f5761g;

    /* renamed from: h */
    private final AbstractC5837xa[] f5762h;

    /* renamed from: com.applovin.impl.e3$a */
    /* loaded from: classes2.dex */
    class C4303a implements Parcelable.Creator {
        C4303a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4302e3[] newArray(int i) {
            return new C4302e3[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4302e3 createFromParcel(Parcel parcel) {
            return new C4302e3(parcel);
        }
    }

    C4302e3(Parcel parcel) {
        super("CHAP");
        this.f5757b = (String) AbstractC5863xp.m93017a((Object) parcel.readString());
        this.f5758c = parcel.readInt();
        this.f5759d = parcel.readInt();
        this.f5760f = parcel.readLong();
        this.f5761g = parcel.readLong();
        int readInt = parcel.readInt();
        this.f5762h = new AbstractC5837xa[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f5762h[i] = (AbstractC5837xa) parcel.readParcelable(AbstractC5837xa.class.getClassLoader());
        }
    }

    @Override // com.applovin.impl.AbstractC5837xa, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4302e3.class != obj.getClass()) {
            return false;
        }
        C4302e3 c4302e3 = (C4302e3) obj;
        if (this.f5758c == c4302e3.f5758c && this.f5759d == c4302e3.f5759d && this.f5760f == c4302e3.f5760f && this.f5761g == c4302e3.f5761g && AbstractC5863xp.m93016a((Object) this.f5757b, (Object) c4302e3.f5757b) && Arrays.equals(this.f5762h, c4302e3.f5762h)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = (((((((this.f5758c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f5759d) * 31) + ((int) this.f5760f)) * 31) + ((int) this.f5761g)) * 31;
        String str = this.f5757b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5757b);
        parcel.writeInt(this.f5758c);
        parcel.writeInt(this.f5759d);
        parcel.writeLong(this.f5760f);
        parcel.writeLong(this.f5761g);
        parcel.writeInt(this.f5762h.length);
        for (AbstractC5837xa abstractC5837xa : this.f5762h) {
            parcel.writeParcelable(abstractC5837xa, 0);
        }
    }

    public C4302e3(String str, int i, int i2, long j, long j2, AbstractC5837xa[] abstractC5837xaArr) {
        super("CHAP");
        this.f5757b = str;
        this.f5758c = i;
        this.f5759d = i2;
        this.f5760f = j;
        this.f5761g = j2;
        this.f5762h = abstractC5837xaArr;
    }
}
