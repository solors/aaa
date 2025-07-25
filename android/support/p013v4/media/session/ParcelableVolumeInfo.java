package android.support.p013v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0097a();

    /* renamed from: b */
    public int f263b;

    /* renamed from: c */
    public int f264c;

    /* renamed from: d */
    public int f265d;

    /* renamed from: f */
    public int f266f;

    /* renamed from: g */
    public int f267g;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    /* loaded from: classes.dex */
    class C0097a implements Parcelable.Creator<ParcelableVolumeInfo> {
        C0097a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f263b = parcel.readInt();
        this.f265d = parcel.readInt();
        this.f266f = parcel.readInt();
        this.f267g = parcel.readInt();
        this.f264c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f263b);
        parcel.writeInt(this.f265d);
        parcel.writeInt(this.f266f);
        parcel.writeInt(this.f267g);
        parcel.writeInt(this.f264c);
    }
}
