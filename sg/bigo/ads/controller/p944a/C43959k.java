package sg.bigo.ads.controller.p944a;

import android.os.Parcel;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.C43722n;
import sg.bigo.ads.common.InterfaceC43615f;

/* renamed from: sg.bigo.ads.controller.a.k */
/* loaded from: classes10.dex */
public class C43959k implements InterfaceC43615f {

    /* renamed from: a */
    String f115125a;

    /* renamed from: b */
    public boolean f115126b;

    /* renamed from: c */
    private String f115127c;

    public C43959k() {
    }

    public C43959k(String str, String str2, boolean z) {
        this.f115127c = str;
        this.f115125a = str2;
        this.f115126b = z;
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    @CallSuper
    /* renamed from: a */
    public void mo4441a(@NonNull Parcel parcel) {
        parcel.writeString(this.f115127c);
        parcel.writeString(this.f115125a);
        C43722n.m5117a(parcel, this.f115126b);
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    @CallSuper
    /* renamed from: b */
    public void mo4437b(@NonNull Parcel parcel) {
        this.f115127c = C43722n.m5124a(parcel, "");
        this.f115125a = C43722n.m5124a(parcel, "");
        this.f115126b = C43722n.m5112b(parcel, false);
    }

    @NonNull
    public String toString() {
        return super.toString();
    }
}
