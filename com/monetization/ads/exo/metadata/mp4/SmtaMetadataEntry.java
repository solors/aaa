package com.monetization.ads.exo.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.monetization.ads.exo.metadata.Metadata;

/* loaded from: classes7.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new C25547a();

    /* renamed from: b */
    public final float f66311b;

    /* renamed from: c */
    public final int f66312c;

    /* renamed from: com.monetization.ads.exo.metadata.mp4.SmtaMetadataEntry$a */
    /* loaded from: classes7.dex */
    final class C25547a implements Parcelable.Creator<SmtaMetadataEntry> {
        C25547a() {
        }

        @Override // android.os.Parcelable.Creator
        public final SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return new SmtaMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SmtaMetadataEntry[] newArray(int i) {
            return new SmtaMetadataEntry[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SmtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        if (this.f66311b == smtaMetadataEntry.f66311b && this.f66312c == smtaMetadataEntry.f66312c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f66311b).hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f66312c;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f66311b + ", svcTemporalLayerCount=" + this.f66312c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f66311b);
        parcel.writeInt(this.f66312c);
    }

    public SmtaMetadataEntry(int i, float f) {
        this.f66311b = f;
        this.f66312c = i;
    }

    private SmtaMetadataEntry(Parcel parcel) {
        this.f66311b = parcel.readFloat();
        this.f66312c = parcel.readInt();
    }
}
