package com.monetization.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.y32;

/* loaded from: classes7.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new C25536a();

    /* renamed from: c */
    public final String f66276c;

    /* renamed from: d */
    public final String f66277d;

    /* renamed from: e */
    public final String f66278e;

    /* renamed from: com.monetization.ads.exo.metadata.id3.CommentFrame$a */
    /* loaded from: classes7.dex */
    final class C25536a implements Parcelable.Creator<CommentFrame> {
        C25536a() {
        }

        @Override // android.os.Parcelable.Creator
        public final CommentFrame createFromParcel(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CommentFrame[] newArray(int i) {
            return new CommentFrame[i];
        }
    }

    public CommentFrame(String str, String str2, String str3) {
        super("COMM");
        this.f66276c = str;
        this.f66277d = str2;
        this.f66278e = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CommentFrame.class != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        if (y32.m27076a(this.f66277d, commentFrame.f66277d) && y32.m27076a(this.f66276c, commentFrame.f66276c) && y32.m27076a(this.f66278e, commentFrame.f66278e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f66276c;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f66277d;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f66278e;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    @Override // com.monetization.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f66283b + ": language=" + this.f66276c + ", description=" + this.f66277d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f66283b);
        parcel.writeString(this.f66276c);
        parcel.writeString(this.f66278e);
    }

    CommentFrame(Parcel parcel) {
        super("COMM");
        this.f66276c = (String) y32.m27077a(parcel.readString());
        this.f66277d = (String) y32.m27077a(parcel.readString());
        this.f66278e = (String) y32.m27077a(parcel.readString());
    }
}
