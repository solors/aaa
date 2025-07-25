package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.C4061af;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.impl.mf */
/* loaded from: classes2.dex */
public final class C4954mf implements C4061af.InterfaceC4063b {
    public static final Parcelable.Creator<C4954mf> CREATOR = new C4955a();

    /* renamed from: a */
    public final long f8427a;

    /* renamed from: b */
    public final long f8428b;

    /* renamed from: c */
    public final long f8429c;

    /* renamed from: d */
    public final long f8430d;

    /* renamed from: f */
    public final long f8431f;

    /* renamed from: com.applovin.impl.mf$a */
    /* loaded from: classes2.dex */
    class C4955a implements Parcelable.Creator {
        C4955a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4954mf[] newArray(int i) {
            return new C4954mf[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4954mf createFromParcel(Parcel parcel) {
            return new C4954mf(parcel, null);
        }
    }

    public C4954mf(long j, long j2, long j3, long j4, long j5) {
        this.f8427a = j;
        this.f8428b = j2;
        this.f8429c = j3;
        this.f8430d = j4;
        this.f8431f = j5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4954mf.class != obj.getClass()) {
            return false;
        }
        C4954mf c4954mf = (C4954mf) obj;
        if (this.f8427a == c4954mf.f8427a && this.f8428b == c4954mf.f8428b && this.f8429c == c4954mf.f8429c && this.f8430d == c4954mf.f8430d && this.f8431f == c4954mf.f8431f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((AbstractC5261rc.m95911a(this.f8427a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + AbstractC5261rc.m95911a(this.f8428b)) * 31) + AbstractC5261rc.m95911a(this.f8429c)) * 31) + AbstractC5261rc.m95911a(this.f8430d)) * 31) + AbstractC5261rc.m95911a(this.f8431f);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f8427a + ", photoSize=" + this.f8428b + ", photoPresentationTimestampUs=" + this.f8429c + ", videoStartPosition=" + this.f8430d + ", videoSize=" + this.f8431f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8427a);
        parcel.writeLong(this.f8428b);
        parcel.writeLong(this.f8429c);
        parcel.writeLong(this.f8430d);
        parcel.writeLong(this.f8431f);
    }

    private C4954mf(Parcel parcel) {
        this.f8427a = parcel.readLong();
        this.f8428b = parcel.readLong();
        this.f8429c = parcel.readLong();
        this.f8430d = parcel.readLong();
        this.f8431f = parcel.readLong();
    }

    /* synthetic */ C4954mf(Parcel parcel, C4955a c4955a) {
        this(parcel);
    }
}
