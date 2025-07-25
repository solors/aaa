package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.C4061af;
import com.applovin.impl.C5631ud;
import java.util.Arrays;

/* renamed from: com.applovin.impl.va */
/* loaded from: classes2.dex */
public final class C5685va implements C4061af.InterfaceC4063b {
    public static final Parcelable.Creator<C5685va> CREATOR = new C5686a();

    /* renamed from: a */
    public final byte[] f11473a;

    /* renamed from: b */
    public final String f11474b;

    /* renamed from: c */
    public final String f11475c;

    /* renamed from: com.applovin.impl.va$a */
    /* loaded from: classes2.dex */
    class C5686a implements Parcelable.Creator {
        C5686a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5685va[] newArray(int i) {
            return new C5685va[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5685va createFromParcel(Parcel parcel) {
            return new C5685va(parcel);
        }
    }

    C5685va(Parcel parcel) {
        this.f11473a = (byte[]) AbstractC4100b1.m100583a(parcel.createByteArray());
        this.f11474b = parcel.readString();
        this.f11475c = parcel.readString();
    }

    @Override // com.applovin.impl.C4061af.InterfaceC4063b
    /* renamed from: a */
    public void mo92341a(C5631ud.C5633b c5633b) {
        String str = this.f11474b;
        if (str != null) {
            c5633b.m94104k(str);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5685va.class == obj.getClass()) {
            return Arrays.equals(this.f11473a, ((C5685va) obj).f11473a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f11473a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f11474b, this.f11475c, Integer.valueOf(this.f11473a.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f11473a);
        parcel.writeString(this.f11474b);
        parcel.writeString(this.f11475c);
    }

    public C5685va(byte[] bArr, String str, String str2) {
        this.f11473a = bArr;
        this.f11474b = str;
        this.f11475c = str2;
    }
}
