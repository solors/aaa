package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.C4061af;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.impl.ed */
/* loaded from: classes2.dex */
public final class C4318ed implements C4061af.InterfaceC4063b {
    public static final Parcelable.Creator<C4318ed> CREATOR = new C4319a();

    /* renamed from: a */
    public final String f5881a;

    /* renamed from: b */
    public final byte[] f5882b;

    /* renamed from: c */
    public final int f5883c;

    /* renamed from: d */
    public final int f5884d;

    /* renamed from: com.applovin.impl.ed$a */
    /* loaded from: classes2.dex */
    class C4319a implements Parcelable.Creator {
        C4319a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4318ed[] newArray(int i) {
            return new C4318ed[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4318ed createFromParcel(Parcel parcel) {
            return new C4318ed(parcel, null);
        }
    }

    private C4318ed(Parcel parcel) {
        this.f5881a = (String) AbstractC5863xp.m93017a((Object) parcel.readString());
        this.f5882b = (byte[]) AbstractC5863xp.m93017a((Object) parcel.createByteArray());
        this.f5883c = parcel.readInt();
        this.f5884d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4318ed.class != obj.getClass()) {
            return false;
        }
        C4318ed c4318ed = (C4318ed) obj;
        if (this.f5881a.equals(c4318ed.f5881a) && Arrays.equals(this.f5882b, c4318ed.f5882b) && this.f5883c == c4318ed.f5883c && this.f5884d == c4318ed.f5884d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f5881a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f5882b)) * 31) + this.f5883c) * 31) + this.f5884d;
    }

    public String toString() {
        return "mdta: key=" + this.f5881a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5881a);
        parcel.writeByteArray(this.f5882b);
        parcel.writeInt(this.f5883c);
        parcel.writeInt(this.f5884d);
    }

    /* synthetic */ C4318ed(Parcel parcel, C4319a c4319a) {
        this(parcel);
    }

    public C4318ed(String str, byte[] bArr, int i, int i2) {
        this.f5881a = str;
        this.f5882b = bArr;
        this.f5883c = i;
        this.f5884d = i2;
    }
}
