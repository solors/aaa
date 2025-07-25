package sg.bigo.ads.controller.landing;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public class LandingPageStyleConfig implements Parcelable {
    public static final Parcelable.Creator<LandingPageStyleConfig> CREATOR = new Parcelable.Creator<LandingPageStyleConfig>() { // from class: sg.bigo.ads.controller.landing.LandingPageStyleConfig.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LandingPageStyleConfig createFromParcel(Parcel parcel) {
            return new LandingPageStyleConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LandingPageStyleConfig[] newArray(int i) {
            return new LandingPageStyleConfig[i];
        }
    };

    /* renamed from: a */
    public final int f115589a;

    /* renamed from: b */
    public final int f115590b;

    /* renamed from: c */
    public final int f115591c;

    /* renamed from: d */
    public final int f115592d;

    /* renamed from: e */
    public final int f115593e;

    /* renamed from: f */
    public final float f115594f;

    /* renamed from: g */
    public final Class<? extends C44072c> f115595g;

    protected LandingPageStyleConfig(Parcel parcel) {
        this.f115595g = (Class) parcel.readSerializable();
        this.f115591c = parcel.readInt();
        this.f115589a = parcel.readInt();
        this.f115590b = parcel.readInt();
        this.f115592d = parcel.readInt();
        this.f115593e = parcel.readInt();
        this.f115594f = parcel.readFloat();
    }

    /* renamed from: a */
    public final boolean m4062a() {
        if (this.f115595g != null && this.f115592d > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m4061b() {
        if (this.f115589a == 0) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f115595g);
        parcel.writeInt(this.f115591c);
        parcel.writeInt(this.f115589a);
        parcel.writeInt(this.f115590b);
        parcel.writeInt(this.f115592d);
        parcel.writeInt(this.f115593e);
        parcel.writeFloat(this.f115594f);
    }

    public LandingPageStyleConfig(Class<? extends C44072c> cls, int i, int i2, int i3, int i4, int i5, float f) {
        this.f115595g = cls;
        this.f115591c = i;
        this.f115589a = i2;
        this.f115590b = i3;
        this.f115592d = i4;
        this.f115593e = i5;
        this.f115594f = f;
    }
}
