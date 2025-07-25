package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.impl.rb */
/* loaded from: classes2.dex */
public final class C5259rb extends AbstractC5837xa {
    public static final Parcelable.Creator<C5259rb> CREATOR = new C5260a();

    /* renamed from: b */
    public final String f9416b;

    /* renamed from: c */
    public final String f9417c;

    /* renamed from: d */
    public final String f9418d;

    /* renamed from: com.applovin.impl.rb$a */
    /* loaded from: classes2.dex */
    class C5260a implements Parcelable.Creator {
        C5260a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5259rb[] newArray(int i) {
            return new C5259rb[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5259rb createFromParcel(Parcel parcel) {
            return new C5259rb(parcel);
        }
    }

    C5259rb(Parcel parcel) {
        super("----");
        this.f9416b = (String) AbstractC5863xp.m93017a((Object) parcel.readString());
        this.f9417c = (String) AbstractC5863xp.m93017a((Object) parcel.readString());
        this.f9418d = (String) AbstractC5863xp.m93017a((Object) parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5259rb.class != obj.getClass()) {
            return false;
        }
        C5259rb c5259rb = (C5259rb) obj;
        if (AbstractC5863xp.m93016a((Object) this.f9417c, (Object) c5259rb.f9417c) && AbstractC5863xp.m93016a((Object) this.f9416b, (Object) c5259rb.f9416b) && AbstractC5863xp.m93016a((Object) this.f9418d, (Object) c5259rb.f9418d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f9416b;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f9417c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f9418d;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    @Override // com.applovin.impl.AbstractC5837xa
    public String toString() {
        return this.f11957a + ": domain=" + this.f9416b + ", description=" + this.f9417c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11957a);
        parcel.writeString(this.f9416b);
        parcel.writeString(this.f9418d);
    }

    public C5259rb(String str, String str2, String str3) {
        super("----");
        this.f9416b = str;
        this.f9417c = str2;
        this.f9418d = str3;
    }
}
