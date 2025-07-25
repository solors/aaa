package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.C4061af;

/* renamed from: com.applovin.impl.z0 */
/* loaded from: classes2.dex */
public final class C5940z0 implements C4061af.InterfaceC4063b {
    public static final Parcelable.Creator<C5940z0> CREATOR = new C5941a();

    /* renamed from: a */
    public final int f12403a;

    /* renamed from: b */
    public final String f12404b;

    public C5940z0(int i, String str) {
        this.f12403a = i;
        this.f12404b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "Ait(controlCode=" + this.f12403a + ",url=" + this.f12404b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12404b);
        parcel.writeInt(this.f12403a);
    }

    /* renamed from: com.applovin.impl.z0$a */
    /* loaded from: classes2.dex */
    class C5941a implements Parcelable.Creator {
        C5941a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5940z0 createFromParcel(Parcel parcel) {
            return new C5940z0(parcel.readInt(), (String) AbstractC4100b1.m100583a((Object) parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5940z0[] newArray(int i) {
            return new C5940z0[i];
        }
    }
}
