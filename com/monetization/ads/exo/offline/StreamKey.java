package com.monetization.ads.exo.offline;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new C25571a();

    /* renamed from: b */
    public final int f66365b;

    /* renamed from: c */
    public final int f66366c;

    /* renamed from: d */
    public final int f66367d;

    /* renamed from: com.monetization.ads.exo.offline.StreamKey$a */
    /* loaded from: classes7.dex */
    final class C25571a implements Parcelable.Creator<StreamKey> {
        C25571a() {
        }

        @Override // android.os.Parcelable.Creator
        public final StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final StreamKey[] newArray(int i) {
            return new StreamKey[i];
        }
    }

    public StreamKey(int i, int i2, int i3) {
        this.f66365b = i;
        this.f66366c = i2;
        this.f66367d = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        StreamKey streamKey2 = streamKey;
        int i = this.f66365b - streamKey2.f66365b;
        if (i == 0) {
            int i2 = this.f66366c - streamKey2.f66366c;
            if (i2 == 0) {
                return this.f66367d - streamKey2.f66367d;
            }
            return i2;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        if (this.f66365b == streamKey.f66365b && this.f66366c == streamKey.f66366c && this.f66367d == streamKey.f66367d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f66365b * 31) + this.f66366c) * 31) + this.f66367d;
    }

    public final String toString() {
        return this.f66365b + "." + this.f66366c + "." + this.f66367d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f66365b);
        parcel.writeInt(this.f66366c);
        parcel.writeInt(this.f66367d);
    }

    StreamKey(Parcel parcel) {
        this.f66365b = parcel.readInt();
        this.f66366c = parcel.readInt();
        this.f66367d = parcel.readInt();
    }
}
