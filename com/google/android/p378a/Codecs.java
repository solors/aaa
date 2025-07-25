package com.google.android.p378a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.a.c */
/* loaded from: classes4.dex */
public final class Codecs {
    static {
        Codecs.class.getClassLoader();
    }

    private Codecs() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m76347a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m76346b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: c */
    public static void m76345c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 1);
    }
}
