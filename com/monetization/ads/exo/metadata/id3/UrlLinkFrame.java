package com.monetization.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.C31014o3;
import com.yandex.mobile.ads.impl.y32;

/* loaded from: classes7.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new C25542a();
    @Nullable

    /* renamed from: c */
    public final String f66296c;

    /* renamed from: d */
    public final String f66297d;

    /* renamed from: com.monetization.ads.exo.metadata.id3.UrlLinkFrame$a */
    /* loaded from: classes7.dex */
    final class C25542a implements Parcelable.Creator<UrlLinkFrame> {
        C25542a() {
        }

        @Override // android.os.Parcelable.Creator
        public final UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final UrlLinkFrame[] newArray(int i) {
            return new UrlLinkFrame[i];
        }
    }

    public UrlLinkFrame(String str, @Nullable String str2, String str3) {
        super(str);
        this.f66296c = str2;
        this.f66297d = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UrlLinkFrame.class != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        if (this.f66283b.equals(urlLinkFrame.f66283b) && y32.m27076a(this.f66296c, urlLinkFrame.f66296c) && y32.m27076a(this.f66297d, urlLinkFrame.f66297d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int m31189a = C31014o3.m31189a(this.f66283b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.f66296c;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (m31189a + i) * 31;
        String str2 = this.f66297d;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    @Override // com.monetization.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f66283b + ": url=" + this.f66297d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f66283b);
        parcel.writeString(this.f66296c);
        parcel.writeString(this.f66297d);
    }

    UrlLinkFrame(Parcel parcel) {
        super((String) y32.m27077a(parcel.readString()));
        this.f66296c = parcel.readString();
        this.f66297d = (String) y32.m27077a(parcel.readString());
    }
}
