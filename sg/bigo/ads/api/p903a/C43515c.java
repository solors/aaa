package sg.bigo.ads.api.p903a;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.InterfaceC43615f;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.api.a.c */
/* loaded from: classes10.dex */
public final class C43515c implements InterfaceC43615f {

    /* renamed from: a */
    public static final C43515c f114023a = new C43515c();

    /* renamed from: b */
    public static final InterfaceC43615f.InterfaceC43616a<C43515c> f114024b = new InterfaceC43615f.InterfaceC43616a<C43515c>() { // from class: sg.bigo.ads.api.a.c.1
        @Override // sg.bigo.ads.common.InterfaceC43615f.InterfaceC43616a
        /* renamed from: a */
        public final /* synthetic */ C43515c mo4414a() {
            return new C43515c((byte) 0);
        }
    };

    /* renamed from: c */
    private String f114025c;

    private C43515c() {
    }

    /* synthetic */ C43515c(byte b) {
        this();
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: a */
    public final void mo4441a(@NonNull Parcel parcel) {
        parcel.writeString(this.f114025c);
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: b */
    public final void mo4437b(@NonNull Parcel parcel) {
        this.f114025c = parcel.readString();
    }

    public final String toString() {
        return C43836q.m4835a(this.f114025c);
    }

    public C43515c(String str) {
        this.f114025c = str;
    }
}
