package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.impl.if */
/* loaded from: classes2.dex */
public final class C4585if extends AbstractC5837xa {
    public static final Parcelable.Creator<C4585if> CREATOR = new C4586a();

    /* renamed from: b */
    public final int f6888b;

    /* renamed from: c */
    public final int f6889c;

    /* renamed from: d */
    public final int f6890d;

    /* renamed from: f */
    public final int[] f6891f;

    /* renamed from: g */
    public final int[] f6892g;

    /* renamed from: com.applovin.impl.if$a */
    /* loaded from: classes2.dex */
    class C4586a implements Parcelable.Creator {
        C4586a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4585if[] newArray(int i) {
            return new C4585if[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4585if createFromParcel(Parcel parcel) {
            return new C4585if(parcel);
        }
    }

    public C4585if(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f6888b = i;
        this.f6889c = i2;
        this.f6890d = i3;
        this.f6891f = iArr;
        this.f6892g = iArr2;
    }

    @Override // com.applovin.impl.AbstractC5837xa, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4585if.class != obj.getClass()) {
            return false;
        }
        C4585if c4585if = (C4585if) obj;
        if (this.f6888b == c4585if.f6888b && this.f6889c == c4585if.f6889c && this.f6890d == c4585if.f6890d && Arrays.equals(this.f6891f, c4585if.f6891f) && Arrays.equals(this.f6892g, c4585if.f6892g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.f6888b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f6889c) * 31) + this.f6890d) * 31) + Arrays.hashCode(this.f6891f)) * 31) + Arrays.hashCode(this.f6892g);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6888b);
        parcel.writeInt(this.f6889c);
        parcel.writeInt(this.f6890d);
        parcel.writeIntArray(this.f6891f);
        parcel.writeIntArray(this.f6892g);
    }

    C4585if(Parcel parcel) {
        super("MLLT");
        this.f6888b = parcel.readInt();
        this.f6889c = parcel.readInt();
        this.f6890d = parcel.readInt();
        this.f6891f = (int[]) AbstractC5863xp.m93017a(parcel.createIntArray());
        this.f6892g = (int[]) AbstractC5863xp.m93017a(parcel.createIntArray());
    }
}
