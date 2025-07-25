package sg.bigo.ads.controller.p946b;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.p903a.InterfaceC43513a;

/* renamed from: sg.bigo.ads.controller.b.a */
/* loaded from: classes10.dex */
final class C43961a implements InterfaceC43513a {

    /* renamed from: a */
    long f115128a;

    /* renamed from: b */
    String f115129b;

    /* renamed from: c */
    String f115130c;

    /* renamed from: d */
    String f115131d;

    /* renamed from: e */
    String f115132e;

    /* renamed from: f */
    String f115133f;

    /* renamed from: g */
    String f115134g;

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: a */
    public final void mo4441a(@NonNull Parcel parcel) {
        parcel.writeLong(this.f115128a);
        parcel.writeString(this.f115129b);
        parcel.writeString(this.f115130c);
        parcel.writeString(this.f115131d);
        parcel.writeString(this.f115132e);
        parcel.writeString(this.f115133f);
        parcel.writeString(this.f115134g);
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: b */
    public final void mo4437b(@NonNull Parcel parcel) {
        this.f115128a = parcel.readLong();
        this.f115129b = parcel.readString();
        this.f115130c = parcel.readString();
        this.f115131d = parcel.readString();
        this.f115132e = parcel.readString();
        this.f115133f = parcel.readString();
        this.f115134g = parcel.readString();
    }

    @NonNull
    public final String toString() {
        return "{expressId=" + this.f115128a + ", name='" + this.f115129b + "', url='" + this.f115130c + "', md5='" + this.f115131d + "', style='" + this.f115132e + "', adTypes='" + this.f115133f + "', fileId='" + this.f115134g + "'}";
    }
}
