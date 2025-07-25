package sg.bigo.ads.controller.p946b;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.p903a.InterfaceC43527k;
import sg.bigo.ads.common.C43722n;
import sg.bigo.ads.common.InterfaceC43615f;

/* renamed from: sg.bigo.ads.controller.b.g */
/* loaded from: classes10.dex */
public final class C43973g implements InterfaceC43527k, InterfaceC43615f {

    /* renamed from: a */
    boolean f115210a = true;

    /* renamed from: b */
    boolean f115211b = false;

    /* renamed from: c */
    int f115212c = 0;

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: a */
    public final void mo4441a(@NonNull Parcel parcel) {
        C43722n.m5117a(parcel, this.f115210a);
        C43722n.m5117a(parcel, this.f115211b);
        parcel.writeInt(this.f115212c);
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: b */
    public final void mo4437b(@NonNull Parcel parcel) {
        this.f115210a = C43722n.m5112b(parcel, true);
        this.f115210a = C43722n.m5112b(parcel, false);
        this.f115212c = C43722n.m5126a(parcel, 0);
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43527k
    /* renamed from: c */
    public final int mo4448c() {
        return this.f115212c;
    }

    @NonNull
    public final String toString() {
        return "{isNativeVideoClickable=" + this.f115210a + ", isNativeVideoClickable=" + this.f115210a + ", clickTriggerType=" + this.f115212c + '}';
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43527k
    /* renamed from: a */
    public final boolean mo4450a() {
        return this.f115210a;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43527k
    /* renamed from: b */
    public final boolean mo4449b() {
        return this.f115211b;
    }
}
