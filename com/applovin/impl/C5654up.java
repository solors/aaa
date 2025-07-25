package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.impl.up */
/* loaded from: classes2.dex */
public final class C5654up extends AbstractC5837xa {
    public static final Parcelable.Creator<C5654up> CREATOR = new C5655a();

    /* renamed from: b */
    public final String f11400b;

    /* renamed from: c */
    public final String f11401c;

    /* renamed from: com.applovin.impl.up$a */
    /* loaded from: classes2.dex */
    class C5655a implements Parcelable.Creator {
        C5655a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5654up[] newArray(int i) {
            return new C5654up[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5654up createFromParcel(Parcel parcel) {
            return new C5654up(parcel);
        }
    }

    C5654up(Parcel parcel) {
        super((String) AbstractC5863xp.m93017a((Object) parcel.readString()));
        this.f11400b = parcel.readString();
        this.f11401c = (String) AbstractC5863xp.m93017a((Object) parcel.readString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5654up.class != obj.getClass()) {
            return false;
        }
        C5654up c5654up = (C5654up) obj;
        if (this.f11957a.equals(c5654up.f11957a) && AbstractC5863xp.m93016a((Object) this.f11400b, (Object) c5654up.f11400b) && AbstractC5863xp.m93016a((Object) this.f11401c, (Object) c5654up.f11401c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (this.f11957a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f11400b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.f11401c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    @Override // com.applovin.impl.AbstractC5837xa
    public String toString() {
        return this.f11957a + ": url=" + this.f11401c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11957a);
        parcel.writeString(this.f11400b);
        parcel.writeString(this.f11401c);
    }

    public C5654up(String str, String str2, String str3) {
        super(str);
        this.f11400b = str2;
        this.f11401c = str3;
    }
}
