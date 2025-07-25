package com.amazon.device.simplesignin.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class RequestId implements Parcelable {
    public static final Parcelable.Creator<RequestId> CREATOR = new Parcelable.Creator<RequestId>() { // from class: com.amazon.device.simplesignin.model.RequestId.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RequestId createFromParcel(Parcel parcel) {
            return new RequestId(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RequestId[] newArray(int i) {
            return new RequestId[i];
        }
    };

    /* renamed from: id */
    private final String f3441id;

    public RequestId(String str) {
        this.f3441id = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f3441id;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3441id);
    }

    public RequestId() {
        this.f3441id = UUID.randomUUID().toString();
    }
}
