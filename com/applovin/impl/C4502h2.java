package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.impl.h2 */
/* loaded from: classes2.dex */
public final class C4502h2 extends AbstractC5837xa {
    public static final Parcelable.Creator<C4502h2> CREATOR = new C4503a();

    /* renamed from: b */
    public final byte[] f6526b;

    /* renamed from: com.applovin.impl.h2$a */
    /* loaded from: classes2.dex */
    class C4503a implements Parcelable.Creator {
        C4503a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4502h2[] newArray(int i) {
            return new C4502h2[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4502h2 createFromParcel(Parcel parcel) {
            return new C4502h2(parcel);
        }
    }

    C4502h2(Parcel parcel) {
        super((String) AbstractC5863xp.m93017a((Object) parcel.readString()));
        this.f6526b = (byte[]) AbstractC5863xp.m93017a((Object) parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4502h2.class != obj.getClass()) {
            return false;
        }
        C4502h2 c4502h2 = (C4502h2) obj;
        if (this.f11957a.equals(c4502h2.f11957a) && Arrays.equals(this.f6526b, c4502h2.f6526b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f11957a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f6526b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11957a);
        parcel.writeByteArray(this.f6526b);
    }

    public C4502h2(String str, byte[] bArr) {
        super(str);
        this.f6526b = bArr;
    }
}
