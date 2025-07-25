package com.monetization.ads.exo.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.monetization.ads.exo.metadata.Metadata;

/* loaded from: classes7.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new C25544a();

    /* renamed from: b */
    public final long f66302b;

    /* renamed from: c */
    public final long f66303c;

    /* renamed from: d */
    public final long f66304d;

    /* renamed from: e */
    public final long f66305e;

    /* renamed from: f */
    public final long f66306f;

    /* renamed from: com.monetization.ads.exo.metadata.mp4.MotionPhotoMetadata$a */
    /* loaded from: classes7.dex */
    final class C25544a implements Parcelable.Creator<MotionPhotoMetadata> {
        C25544a() {
        }

        @Override // android.os.Parcelable.Creator
        public final MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MotionPhotoMetadata[] newArray(int i) {
            return new MotionPhotoMetadata[i];
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
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        if (this.f66302b == motionPhotoMetadata.f66302b && this.f66303c == motionPhotoMetadata.f66303c && this.f66304d == motionPhotoMetadata.f66304d && this.f66305e == motionPhotoMetadata.f66305e && this.f66306f == motionPhotoMetadata.f66306f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f66302b;
        long j2 = this.f66303c;
        long j3 = this.f66304d;
        long j4 = this.f66305e;
        long j5 = this.f66306f;
        return ((((((((((int) (j ^ (j >>> 32))) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) ((j5 >>> 32) ^ j5));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f66302b + ", photoSize=" + this.f66303c + ", photoPresentationTimestampUs=" + this.f66304d + ", videoStartPosition=" + this.f66305e + ", videoSize=" + this.f66306f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f66302b);
        parcel.writeLong(this.f66303c);
        parcel.writeLong(this.f66304d);
        parcel.writeLong(this.f66305e);
        parcel.writeLong(this.f66306f);
    }

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.f66302b = j;
        this.f66303c = j2;
        this.f66304d = j3;
        this.f66305e = j4;
        this.f66306f = j5;
    }

    private MotionPhotoMetadata(Parcel parcel) {
        this.f66302b = parcel.readLong();
        this.f66303c = parcel.readLong();
        this.f66304d = parcel.readLong();
        this.f66305e = parcel.readLong();
        this.f66306f = parcel.readLong();
    }
}
