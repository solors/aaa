package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.C5631ud;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.impl.v0 */
/* loaded from: classes2.dex */
public final class C5669v0 extends AbstractC5837xa {
    public static final Parcelable.Creator<C5669v0> CREATOR = new C5670a();

    /* renamed from: b */
    public final String f11421b;

    /* renamed from: c */
    public final String f11422c;

    /* renamed from: d */
    public final int f11423d;

    /* renamed from: f */
    public final byte[] f11424f;

    /* renamed from: com.applovin.impl.v0$a */
    /* loaded from: classes2.dex */
    class C5670a implements Parcelable.Creator {
        C5670a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5669v0[] newArray(int i) {
            return new C5669v0[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5669v0 createFromParcel(Parcel parcel) {
            return new C5669v0(parcel);
        }
    }

    C5669v0(Parcel parcel) {
        super("APIC");
        this.f11421b = (String) AbstractC5863xp.m93017a((Object) parcel.readString());
        this.f11422c = parcel.readString();
        this.f11423d = parcel.readInt();
        this.f11424f = (byte[]) AbstractC5863xp.m93017a((Object) parcel.createByteArray());
    }

    @Override // com.applovin.impl.C4061af.InterfaceC4063b
    /* renamed from: a */
    public void mo92341a(C5631ud.C5633b c5633b) {
        c5633b.m94136a(this.f11424f, this.f11423d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5669v0.class != obj.getClass()) {
            return false;
        }
        C5669v0 c5669v0 = (C5669v0) obj;
        if (this.f11423d == c5669v0.f11423d && AbstractC5863xp.m93016a((Object) this.f11421b, (Object) c5669v0.f11421b) && AbstractC5863xp.m93016a((Object) this.f11422c, (Object) c5669v0.f11422c) && Arrays.equals(this.f11424f, c5669v0.f11424f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = (this.f11423d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f11421b;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        String str2 = this.f11422c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return ((i4 + i3) * 31) + Arrays.hashCode(this.f11424f);
    }

    @Override // com.applovin.impl.AbstractC5837xa
    public String toString() {
        return this.f11957a + ": mimeType=" + this.f11421b + ", description=" + this.f11422c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11421b);
        parcel.writeString(this.f11422c);
        parcel.writeInt(this.f11423d);
        parcel.writeByteArray(this.f11424f);
    }

    public C5669v0(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f11421b = str;
        this.f11422c = str2;
        this.f11423d = i;
        this.f11424f = bArr;
    }
}
