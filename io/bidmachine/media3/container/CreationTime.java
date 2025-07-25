package io.bidmachine.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.common.primitives.Longs;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MediaMetadata;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public final class CreationTime implements Metadata.Entry {
    public static final Parcelable.Creator<CreationTime> CREATOR = new C35941a();
    public final long timestampMs;

    /* renamed from: io.bidmachine.media3.container.CreationTime$a */
    /* loaded from: classes9.dex */
    class C35941a implements Parcelable.Creator<CreationTime> {
        C35941a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CreationTime createFromParcel(Parcel parcel) {
            return new CreationTime(parcel, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CreationTime[] newArray(int i) {
            return new CreationTime[i];
        }
    }

    /* synthetic */ CreationTime(Parcel parcel, C35941a c35941a) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CreationTime) && this.timestampMs == ((CreationTime) obj).timestampMs) {
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.media3.common.Metadata.Entry
    @Nullable
    public /* bridge */ /* synthetic */ byte[] getWrappedMetadataBytes() {
        return super.getWrappedMetadataBytes();
    }

    @Override // io.bidmachine.media3.common.Metadata.Entry
    @Nullable
    public /* bridge */ /* synthetic */ Format getWrappedMetadataFormat() {
        return super.getWrappedMetadataFormat();
    }

    public int hashCode() {
        return Longs.hashCode(this.timestampMs);
    }

    @Override // io.bidmachine.media3.common.Metadata.Entry
    public /* bridge */ /* synthetic */ void populateMediaMetadata(MediaMetadata.Builder builder) {
        super.populateMediaMetadata(builder);
    }

    public String toString() {
        Object valueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Creation time: ");
        long j = this.timestampMs;
        if (j == -2082844800000L) {
            valueOf = "unset";
        } else {
            valueOf = Long.valueOf(j);
        }
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.timestampMs);
    }

    public CreationTime(long j) {
        this.timestampMs = j;
    }

    private CreationTime(Parcel parcel) {
        this.timestampMs = parcel.readLong();
    }
}
