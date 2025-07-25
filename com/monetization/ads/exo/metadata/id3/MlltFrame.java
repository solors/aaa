package com.monetization.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.y32;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new C25539a();

    /* renamed from: c */
    public final int f66287c;

    /* renamed from: d */
    public final int f66288d;

    /* renamed from: e */
    public final int f66289e;

    /* renamed from: f */
    public final int[] f66290f;

    /* renamed from: g */
    public final int[] f66291g;

    /* renamed from: com.monetization.ads.exo.metadata.id3.MlltFrame$a */
    /* loaded from: classes7.dex */
    final class C25539a implements Parcelable.Creator<MlltFrame> {
        C25539a() {
        }

        @Override // android.os.Parcelable.Creator
        public final MlltFrame createFromParcel(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MlltFrame[] newArray(int i) {
            return new MlltFrame[i];
        }
    }

    public MlltFrame(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f66287c = i;
        this.f66288d = i2;
        this.f66289e = i3;
        this.f66290f = iArr;
        this.f66291g = iArr2;
    }

    @Override // com.monetization.ads.exo.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MlltFrame.class != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        if (this.f66287c == mlltFrame.f66287c && this.f66288d == mlltFrame.f66288d && this.f66289e == mlltFrame.f66289e && Arrays.equals(this.f66290f, mlltFrame.f66290f) && Arrays.equals(this.f66291g, mlltFrame.f66291g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f66290f);
        return Arrays.hashCode(this.f66291g) + ((hashCode + ((((((this.f66287c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f66288d) * 31) + this.f66289e) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f66287c);
        parcel.writeInt(this.f66288d);
        parcel.writeInt(this.f66289e);
        parcel.writeIntArray(this.f66290f);
        parcel.writeIntArray(this.f66291g);
    }

    MlltFrame(Parcel parcel) {
        super("MLLT");
        this.f66287c = parcel.readInt();
        this.f66288d = parcel.readInt();
        this.f66289e = parcel.readInt();
        this.f66290f = (int[]) y32.m27077a(parcel.createIntArray());
        this.f66291g = (int[]) y32.m27077a(parcel.createIntArray());
    }
}
