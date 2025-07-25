package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import com.google.common.primitives.Floats;
import com.ironsource.mediationsdk.logger.IronSourceError;

@UnstableApi
/* loaded from: classes2.dex */
public final class Mp4LocationData implements Metadata.Entry {
    public static final Parcelable.Creator<Mp4LocationData> CREATOR = new Parcelable.Creator<Mp4LocationData>() { // from class: androidx.media3.container.Mp4LocationData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Mp4LocationData createFromParcel(Parcel parcel) {
            return new Mp4LocationData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Mp4LocationData[] newArray(int i) {
            return new Mp4LocationData[i];
        }
    };
    public final float latitude;
    public final float longitude;

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

    public int hashCode() {
        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + Floats.hashCode(this.latitude)) * 31) + Floats.hashCode(this.longitude);
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
