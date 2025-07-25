package com.monetization.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.y32;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new C25534a();

    /* renamed from: c */
    public final String f66265c;

    /* renamed from: d */
    public final int f66266d;

    /* renamed from: e */
    public final int f66267e;

    /* renamed from: f */
    public final long f66268f;

    /* renamed from: g */
    public final long f66269g;

    /* renamed from: h */
    private final Id3Frame[] f66270h;

    /* renamed from: com.monetization.ads.exo.metadata.id3.ChapterFrame$a */
    /* loaded from: classes7.dex */
    final class C25534a implements Parcelable.Creator<ChapterFrame> {
        C25534a() {
        }

        @Override // android.os.Parcelable.Creator
        public final ChapterFrame createFromParcel(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ChapterFrame[] newArray(int i) {
            return new ChapterFrame[i];
        }
    }

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super("CHAP");
        this.f66265c = str;
        this.f66266d = i;
        this.f66267e = i2;
        this.f66268f = j;
        this.f66269g = j2;
        this.f66270h = id3FrameArr;
    }

    @Override // com.monetization.ads.exo.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ChapterFrame.class != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        if (this.f66266d == chapterFrame.f66266d && this.f66267e == chapterFrame.f66267e && this.f66268f == chapterFrame.f66268f && this.f66269g == chapterFrame.f66269g && y32.m27076a(this.f66265c, chapterFrame.f66265c) && Arrays.equals(this.f66270h, chapterFrame.f66270h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (((((((this.f66266d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f66267e) * 31) + ((int) this.f66268f)) * 31) + ((int) this.f66269g)) * 31;
        String str = this.f66265c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f66265c);
        parcel.writeInt(this.f66266d);
        parcel.writeInt(this.f66267e);
        parcel.writeLong(this.f66268f);
        parcel.writeLong(this.f66269g);
        parcel.writeInt(this.f66270h.length);
        for (Id3Frame id3Frame : this.f66270h) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }

    ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.f66265c = (String) y32.m27077a(parcel.readString());
        this.f66266d = parcel.readInt();
        this.f66267e = parcel.readInt();
        this.f66268f = parcel.readLong();
        this.f66269g = parcel.readLong();
        int readInt = parcel.readInt();
        this.f66270h = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f66270h[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }
}
