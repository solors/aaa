package com.monetization.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.y32;

/* loaded from: classes7.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new C25538a();

    /* renamed from: c */
    public final String f66284c;

    /* renamed from: d */
    public final String f66285d;

    /* renamed from: e */
    public final String f66286e;

    /* renamed from: com.monetization.ads.exo.metadata.id3.InternalFrame$a */
    /* loaded from: classes7.dex */
    final class C25538a implements Parcelable.Creator<InternalFrame> {
        C25538a() {
        }

        @Override // android.os.Parcelable.Creator
        public final InternalFrame createFromParcel(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final InternalFrame[] newArray(int i) {
            return new InternalFrame[i];
        }
    }

    public InternalFrame(String str, String str2, String str3) {
        super("----");
        this.f66284c = str;
        this.f66285d = str2;
        this.f66286e = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || InternalFrame.class != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        if (y32.m27076a(this.f66285d, internalFrame.f66285d) && y32.m27076a(this.f66284c, internalFrame.f66284c) && y32.m27076a(this.f66286e, internalFrame.f66286e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f66284c;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f66285d;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f66286e;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    @Override // com.monetization.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f66283b + ": domain=" + this.f66284c + ", description=" + this.f66285d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f66283b);
        parcel.writeString(this.f66284c);
        parcel.writeString(this.f66286e);
    }

    InternalFrame(Parcel parcel) {
        super("----");
        this.f66284c = (String) y32.m27077a(parcel.readString());
        this.f66285d = (String) y32.m27077a(parcel.readString());
        this.f66286e = (String) y32.m27077a(parcel.readString());
    }
}
