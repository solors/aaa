package android.support.p013v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.RatingCompat */
/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0086a();

    /* renamed from: b */
    private final int f234b;

    /* renamed from: c */
    private final float f235c;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    /* loaded from: classes.dex */
    class C0086a implements Parcelable.Creator<RatingCompat> {
        C0086a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    RatingCompat(int i, float f) {
        this.f234b = i;
        this.f235c = f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f234b;
    }

    public String toString() {
        String valueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Rating:style=");
        sb2.append(this.f234b);
        sb2.append(" rating=");
        float f = this.f235c;
        if (f < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f);
        }
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f234b);
        parcel.writeFloat(this.f235c);
    }
}
