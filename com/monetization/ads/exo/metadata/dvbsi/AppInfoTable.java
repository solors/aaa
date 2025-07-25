package com.monetization.ads.exo.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import com.monetization.ads.exo.metadata.Metadata;

/* loaded from: classes7.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new C25526a();

    /* renamed from: b */
    public final int f66231b;

    /* renamed from: c */
    public final String f66232c;

    /* renamed from: com.monetization.ads.exo.metadata.dvbsi.AppInfoTable$a */
    /* loaded from: classes7.dex */
    final class C25526a implements Parcelable.Creator<AppInfoTable> {
        C25526a() {
        }

        @Override // android.os.Parcelable.Creator
        public final AppInfoTable createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            readString.getClass();
            return new AppInfoTable(parcel.readInt(), readString);
        }

        @Override // android.os.Parcelable.Creator
        public final AppInfoTable[] newArray(int i) {
            return new AppInfoTable[i];
        }
    }

    public AppInfoTable(int i, String str) {
        this.f66231b = i;
        this.f66232c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "Ait(controlCode=" + this.f66231b + ",url=" + this.f66232c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f66232c);
        parcel.writeInt(this.f66231b);
    }
}
