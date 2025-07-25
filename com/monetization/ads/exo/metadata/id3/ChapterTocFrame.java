package com.monetization.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.y32;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new C25535a();

    /* renamed from: c */
    public final String f66271c;

    /* renamed from: d */
    public final boolean f66272d;

    /* renamed from: e */
    public final boolean f66273e;

    /* renamed from: f */
    public final String[] f66274f;

    /* renamed from: g */
    private final Id3Frame[] f66275g;

    /* renamed from: com.monetization.ads.exo.metadata.id3.ChapterTocFrame$a */
    /* loaded from: classes7.dex */
    final class C25535a implements Parcelable.Creator<ChapterTocFrame> {
        C25535a() {
        }

        @Override // android.os.Parcelable.Creator
        public final ChapterTocFrame createFromParcel(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ChapterTocFrame[] newArray(int i) {
            return new ChapterTocFrame[i];
        }
    }

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super("CTOC");
        this.f66271c = str;
        this.f66272d = z;
        this.f66273e = z2;
        this.f66274f = strArr;
        this.f66275g = id3FrameArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterTocFrame.class != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        if (this.f66272d == chapterTocFrame.f66272d && this.f66273e == chapterTocFrame.f66273e && y32.m27076a(this.f66271c, chapterTocFrame.f66271c) && Arrays.equals(this.f66274f, chapterTocFrame.f66274f) && Arrays.equals(this.f66275g, chapterTocFrame.f66275g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = ((((this.f66272d ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.f66273e ? 1 : 0)) * 31;
        String str = this.f66271c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f66271c);
        parcel.writeByte(this.f66272d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f66273e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f66274f);
        parcel.writeInt(this.f66275g.length);
        for (Id3Frame id3Frame : this.f66275g) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.f66271c = (String) y32.m27077a(parcel.readString());
        this.f66272d = parcel.readByte() != 0;
        this.f66273e = parcel.readByte() != 0;
        this.f66274f = (String[]) y32.m27077a(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f66275g = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f66275g[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
