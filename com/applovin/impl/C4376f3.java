package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.impl.f3 */
/* loaded from: classes2.dex */
public final class C4376f3 extends AbstractC5837xa {
    public static final Parcelable.Creator<C4376f3> CREATOR = new C4377a();

    /* renamed from: b */
    public final String f6042b;

    /* renamed from: c */
    public final boolean f6043c;

    /* renamed from: d */
    public final boolean f6044d;

    /* renamed from: f */
    public final String[] f6045f;

    /* renamed from: g */
    private final AbstractC5837xa[] f6046g;

    /* renamed from: com.applovin.impl.f3$a */
    /* loaded from: classes2.dex */
    class C4377a implements Parcelable.Creator {
        C4377a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4376f3[] newArray(int i) {
            return new C4376f3[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4376f3 createFromParcel(Parcel parcel) {
            return new C4376f3(parcel);
        }
    }

    C4376f3(Parcel parcel) {
        super("CTOC");
        this.f6042b = (String) AbstractC5863xp.m93017a((Object) parcel.readString());
        this.f6043c = parcel.readByte() != 0;
        this.f6044d = parcel.readByte() != 0;
        this.f6045f = (String[]) AbstractC5863xp.m93017a((Object) parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f6046g = new AbstractC5837xa[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f6046g[i] = (AbstractC5837xa) parcel.readParcelable(AbstractC5837xa.class.getClassLoader());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4376f3.class != obj.getClass()) {
            return false;
        }
        C4376f3 c4376f3 = (C4376f3) obj;
        if (this.f6043c == c4376f3.f6043c && this.f6044d == c4376f3.f6044d && AbstractC5863xp.m93016a((Object) this.f6042b, (Object) c4376f3.f6042b) && Arrays.equals(this.f6045f, c4376f3.f6045f) && Arrays.equals(this.f6046g, c4376f3.f6046g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = ((((this.f6043c ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.f6044d ? 1 : 0)) * 31;
        String str = this.f6042b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6042b);
        parcel.writeByte(this.f6043c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6044d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f6045f);
        parcel.writeInt(this.f6046g.length);
        for (AbstractC5837xa abstractC5837xa : this.f6046g) {
            parcel.writeParcelable(abstractC5837xa, 0);
        }
    }

    public C4376f3(String str, boolean z, boolean z2, String[] strArr, AbstractC5837xa[] abstractC5837xaArr) {
        super("CTOC");
        this.f6042b = str;
        this.f6043c = z;
        this.f6044d = z2;
        this.f6045f = strArr;
        this.f6046g = abstractC5837xaArr;
    }
}
