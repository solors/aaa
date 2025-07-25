package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.applovin.impl.vk */
/* loaded from: classes2.dex */
public final class C5705vk extends AbstractC5518sk {
    public static final Parcelable.Creator<C5705vk> CREATOR = new C5706a();

    /* renamed from: com.applovin.impl.vk$a */
    /* loaded from: classes2.dex */
    class C5706a implements Parcelable.Creator {
        C5706a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5705vk[] newArray(int i) {
            return new C5705vk[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5705vk createFromParcel(Parcel parcel) {
            return new C5705vk();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
    }
}
