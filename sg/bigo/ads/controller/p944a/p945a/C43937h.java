package sg.bigo.ads.controller.p944a.p945a;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.C43722n;
import sg.bigo.ads.common.InterfaceC43615f;

/* renamed from: sg.bigo.ads.controller.a.a.h */
/* loaded from: classes10.dex */
public final class C43937h implements InterfaceC43615f {

    /* renamed from: a */
    public long f115055a;

    /* renamed from: b */
    public long f115056b;

    /* renamed from: c */
    public long f115057c;

    /* renamed from: d */
    public long f115058d;

    /* renamed from: e */
    public long f115059e;

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: a */
    public final void mo4441a(@NonNull Parcel parcel) {
        synchronized (this) {
            parcel.writeLong(this.f115055a);
            parcel.writeLong(this.f115056b);
            parcel.writeLong(this.f115057c);
            parcel.writeLong(this.f115058d);
            parcel.writeLong(this.f115059e);
        }
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: b */
    public final void mo4437b(@NonNull Parcel parcel) {
        synchronized (this) {
            this.f115055a = C43722n.m5125a(parcel, 0L);
            this.f115056b = C43722n.m5125a(parcel, 0L);
            this.f115057c = C43722n.m5125a(parcel, 0L);
            this.f115058d = C43722n.m5125a(parcel, 0L);
            this.f115059e = C43722n.m5125a(parcel, 0L);
        }
    }

    @NonNull
    public final String toString() {
        return super.toString();
    }
}
