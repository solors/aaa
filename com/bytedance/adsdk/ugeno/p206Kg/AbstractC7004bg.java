package com.bytedance.adsdk.ugeno.p206Kg;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.bytedance.adsdk.ugeno.Kg.bg */
/* loaded from: classes3.dex */
public abstract class AbstractC7004bg implements Parcelable {

    /* renamed from: IL */
    private final Parcelable f15003IL;

    /* renamed from: bg */
    public static final AbstractC7004bg f15002bg = new AbstractC7004bg() { // from class: com.bytedance.adsdk.ugeno.Kg.bg.1
    };
    public static final Parcelable.Creator<AbstractC7004bg> CREATOR = new Parcelable.ClassLoaderCreator<AbstractC7004bg>() { // from class: com.bytedance.adsdk.ugeno.Kg.bg.2
        @Override // android.os.Parcelable.Creator
        /* renamed from: bg */
        public AbstractC7004bg createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: bg */
        public AbstractC7004bg createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbstractC7004bg.f15002bg;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: bg */
        public AbstractC7004bg[] newArray(int i) {
            return new AbstractC7004bg[i];
        }
    };

    /* renamed from: bg */
    public final Parcelable m90292bg() {
        return this.f15003IL;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f15003IL, i);
    }

    private AbstractC7004bg() {
        this.f15003IL = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC7004bg(Parcelable parcelable) {
        if (parcelable != null) {
            this.f15003IL = parcelable == f15002bg ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC7004bg(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f15003IL = readParcelable == null ? f15002bg : readParcelable;
    }
}
