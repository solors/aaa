package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.C4061af;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.applovin.impl.kk */
/* loaded from: classes2.dex */
public final class C4720kk implements C4061af.InterfaceC4063b {
    public static final Parcelable.Creator<C4720kk> CREATOR = new C4721a();

    /* renamed from: a */
    public final float f7555a;

    /* renamed from: b */
    public final int f7556b;

    /* renamed from: com.applovin.impl.kk$a */
    /* loaded from: classes2.dex */
    class C4721a implements Parcelable.Creator {
        C4721a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4720kk[] newArray(int i) {
            return new C4720kk[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4720kk createFromParcel(Parcel parcel) {
            return new C4720kk(parcel, (C4721a) null);
        }
    }

    public C4720kk(float f, int i) {
        this.f7555a = f;
        this.f7556b = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4720kk.class != obj.getClass()) {
            return false;
        }
        C4720kk c4720kk = (C4720kk) obj;
        if (this.f7555a == c4720kk.f7555a && this.f7556b == c4720kk.f7556b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((AbstractC4173c9.m100234a(this.f7555a) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f7556b;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f7555a + ", svcTemporalLayerCount=" + this.f7556b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f7555a);
        parcel.writeInt(this.f7556b);
    }

    private C4720kk(Parcel parcel) {
        this.f7555a = parcel.readFloat();
        this.f7556b = parcel.readInt();
    }

    /* synthetic */ C4720kk(Parcel parcel, C4721a c4721a) {
        this(parcel);
    }
}
