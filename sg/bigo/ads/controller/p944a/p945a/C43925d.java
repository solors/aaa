package sg.bigo.ads.controller.p944a.p945a;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.p903a.InterfaceC43524h;
import sg.bigo.ads.api.p903a.InterfaceC43526j;
import sg.bigo.ads.common.C43722n;
import sg.bigo.ads.common.InterfaceC43615f;
import sg.bigo.ads.common.InterfaceC43712l;

/* renamed from: sg.bigo.ads.controller.a.a.d */
/* loaded from: classes10.dex */
public final class C43925d implements InterfaceC43615f, InterfaceC43712l {

    /* renamed from: a */
    public int f115025a = 3;

    /* renamed from: b */
    public int f115026b = 2;

    /* renamed from: c */
    public int f115027c = 12;

    /* renamed from: d */
    public int f115028d = 3;

    /* renamed from: e */
    public int f115029e = 3;

    /* renamed from: f */
    public int f115030f = 10;

    /* renamed from: g */
    public int f115031g = 5;

    /* renamed from: h */
    private InterfaceC43524h f115032h;

    public C43925d(InterfaceC43524h interfaceC43524h) {
        this.f115032h = interfaceC43524h;
    }

    @Override // sg.bigo.ads.common.InterfaceC43712l
    /* renamed from: a */
    public final int mo4568a() {
        return this.f115025a;
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: b */
    public final void mo4437b(@NonNull Parcel parcel) {
        this.f115025a = C43722n.m5126a(parcel, 3);
        this.f115026b = C43722n.m5126a(parcel, 2);
        this.f115027c = C43722n.m5126a(parcel, 12);
        this.f115028d = C43722n.m5126a(parcel, 3);
        this.f115029e = C43722n.m5126a(parcel, 3);
        this.f115030f = C43722n.m5126a(parcel, 10);
        this.f115031g = C43722n.m5126a(parcel, 5);
    }

    @Override // sg.bigo.ads.common.InterfaceC43712l
    /* renamed from: c */
    public final int mo4565c() {
        return this.f115026b;
    }

    @Override // sg.bigo.ads.common.InterfaceC43712l
    /* renamed from: d */
    public final boolean mo4564d() {
        return m4567a(13);
    }

    @Override // sg.bigo.ads.common.InterfaceC43712l
    /* renamed from: e */
    public final int mo4563e() {
        return this.f115027c;
    }

    @Override // sg.bigo.ads.common.InterfaceC43712l
    /* renamed from: f */
    public final boolean mo4562f() {
        return m4567a(10);
    }

    @Override // sg.bigo.ads.common.InterfaceC43712l
    /* renamed from: g */
    public final int mo4561g() {
        return this.f115028d;
    }

    @Override // sg.bigo.ads.common.InterfaceC43712l
    /* renamed from: h */
    public final boolean mo4560h() {
        return m4567a(11);
    }

    @Override // sg.bigo.ads.common.InterfaceC43712l
    /* renamed from: i */
    public final int mo4559i() {
        return this.f115029e;
    }

    @Override // sg.bigo.ads.common.InterfaceC43712l
    /* renamed from: j */
    public final boolean mo4558j() {
        return m4567a(12);
    }

    @Override // sg.bigo.ads.common.InterfaceC43712l
    /* renamed from: k */
    public final int mo4557k() {
        return this.f115030f;
    }

    @Override // sg.bigo.ads.common.InterfaceC43712l
    /* renamed from: l */
    public final boolean mo4556l() {
        return m4567a(11);
    }

    @Override // sg.bigo.ads.common.InterfaceC43712l
    /* renamed from: m */
    public final int mo4555m() {
        return this.f115031g;
    }

    @Override // sg.bigo.ads.common.InterfaceC43712l
    /* renamed from: n */
    public final boolean mo4554n() {
        return m4567a(12);
    }

    @Override // sg.bigo.ads.common.InterfaceC43712l
    /* renamed from: o */
    public final boolean mo4553o() {
        return m4567a(18);
    }

    @Override // sg.bigo.ads.common.InterfaceC43712l
    /* renamed from: p */
    public final boolean mo4552p() {
        return m4567a(13);
    }

    @NonNull
    public final String toString() {
        return super.toString();
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: a */
    public final void mo4441a(@NonNull Parcel parcel) {
        synchronized (this) {
            parcel.writeInt(this.f115025a);
            parcel.writeInt(this.f115026b);
            parcel.writeInt(this.f115027c);
            parcel.writeInt(this.f115028d);
            parcel.writeInt(this.f115029e);
            parcel.writeInt(this.f115030f);
            parcel.writeInt(this.f115031g);
        }
    }

    @Override // sg.bigo.ads.common.InterfaceC43712l
    /* renamed from: b */
    public final boolean mo4566b() {
        return m4567a(13);
    }

    /* renamed from: a */
    private boolean m4567a(int i) {
        InterfaceC43524h interfaceC43524h = this.f115032h;
        InterfaceC43526j mo4461m = interfaceC43524h != null ? interfaceC43524h.mo4461m() : null;
        if (mo4461m != null) {
            return mo4461m.mo5375a(i);
        }
        return false;
    }
}
