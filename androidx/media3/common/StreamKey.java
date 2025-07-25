package androidx.media3.common;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
/* loaded from: classes.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable, Bundleable {
    public final int groupIndex;
    public final int periodIndex;
    public final int streamIndex;
    public static final Parcelable.Creator<StreamKey> CREATOR = new Parcelable.Creator<StreamKey>() { // from class: androidx.media3.common.StreamKey.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StreamKey[] newArray(int i) {
            return new StreamKey[i];
        }
    };
    private static final String FIELD_PERIOD_INDEX = Util.intToStringMaxRadix(0);
    private static final String FIELD_GROUP_INDEX = Util.intToStringMaxRadix(1);
    private static final String FIELD_STREAM_INDEX = Util.intToStringMaxRadix(2);

    public StreamKey(int i, int i2) {
        this(0, i, i2);
    }

    public static StreamKey fromBundle(Bundle bundle) {
        return new StreamKey(bundle.getInt(FIELD_PERIOD_INDEX, 0), bundle.getInt(FIELD_GROUP_INDEX, 0), bundle.getInt(FIELD_STREAM_INDEX, 0));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StreamKey.class != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        if (this.periodIndex == streamKey.periodIndex && this.groupIndex == streamKey.groupIndex && this.streamIndex == streamKey.streamIndex) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.periodIndex * 31) + this.groupIndex) * 31) + this.streamIndex;
    }

    @Override // androidx.media3.common.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i = this.periodIndex;
        if (i != 0) {
            bundle.putInt(FIELD_PERIOD_INDEX, i);
        }
        int i2 = this.groupIndex;
        if (i2 != 0) {
            bundle.putInt(FIELD_GROUP_INDEX, i2);
        }
        int i3 = this.streamIndex;
        if (i3 != 0) {
            bundle.putInt(FIELD_STREAM_INDEX, i3);
        }
        return bundle;
    }

    public String toString() {
        return this.periodIndex + "." + this.groupIndex + "." + this.streamIndex;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.periodIndex);
        parcel.writeInt(this.groupIndex);
        parcel.writeInt(this.streamIndex);
    }

    public StreamKey(int i, int i2, int i3) {
        this.periodIndex = i;
        this.groupIndex = i2;
        this.streamIndex = i3;
    }

    @Override // java.lang.Comparable
    public int compareTo(StreamKey streamKey) {
        int i = this.periodIndex - streamKey.periodIndex;
        if (i == 0) {
            int i2 = this.groupIndex - streamKey.groupIndex;
            return i2 == 0 ? this.streamIndex - streamKey.streamIndex : i2;
        }
        return i;
    }

    StreamKey(Parcel parcel) {
        this.periodIndex = parcel.readInt();
        this.groupIndex = parcel.readInt();
        this.streamIndex = parcel.readInt();
    }
}
