package io.bidmachine.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.google.common.primitives.Floats;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.MediaMetadata;
import io.bidmachine.media3.common.Metadata;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public final class Mp4LocationData implements Metadata.Entry {
    public static final Parcelable.Creator<Mp4LocationData> CREATOR = new C35943a();
    public final float latitude;
    public final float longitude;

    /* renamed from: io.bidmachine.media3.container.Mp4LocationData$a */
    /* loaded from: classes9.dex */
    class C35943a implements Parcelable.Creator<Mp4LocationData> {
        C35943a() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Mp4LocationData createFromParcel(Parcel parcel) {
            return new Mp4LocationData(parcel, (C35943a) null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Mp4LocationData[] newArray(int i) {
            return new Mp4LocationData[i];
        }
    }

    /* synthetic */ Mp4LocationData(Parcel parcel, C35943a c35943a) {
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
        if (obj == null || Mp4LocationData.class != obj.getClass()) {
            return false;
        }
        Mp4LocationData mp4LocationData = (Mp4LocationData) obj;
        if (this.latitude == mp4LocationData.latitude && this.longitude == mp4LocationData.longitude) {
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
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Floats.hashCode(this.latitude)) * 31) + Floats.hashCode(this.longitude);
    }

    @Override // io.bidmachine.media3.common.Metadata.Entry
    public /* bridge */ /* synthetic */ void populateMediaMetadata(MediaMetadata.Builder builder) {
        super.populateMediaMetadata(builder);
    }

    public String toString() {
        return "xyz: latitude=" + this.latitude + ", longitude=" + this.longitude;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.latitude);
        parcel.writeFloat(this.longitude);
    }

    public Mp4LocationData(@FloatRange(from = -90.0d, m105511to = 90.0d) float f, @FloatRange(from = -180.0d, m105511to = 180.0d) float f2) {
        Assertions.checkArgument(f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f, "Invalid latitude or longitude");
        this.latitude = f;
        this.longitude = f2;
    }

    private Mp4LocationData(Parcel parcel) {
        this.latitude = parcel.readFloat();
        this.longitude = parcel.readFloat();
    }
}
