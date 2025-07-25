package p989u0;

import com.fyber.inneractive.sdk.network.C14740w;
import com.fyber.inneractive.sdk.network.EnumC14730t;
import com.fyber.inneractive.sdk.util.IAlog;
import p036c1.AbstractC3413a;
import p1049y0.C44996b;

/* renamed from: u0.b */
/* loaded from: classes3.dex */
public final class C44417b {

    /* renamed from: b */
    public static final C44417b f116565b = new C44417b();

    /* renamed from: a */
    public InterfaceC44416a f116566a;

    /* renamed from: a */
    public static void m3083a(EnumC44419d enumC44419d, Exception exc) {
        m3082b(enumC44419d, AbstractC3413a.m103684a(exc, null));
    }

    /* renamed from: b */
    public static void m3082b(EnumC44419d enumC44419d, Object... objArr) {
        C44996b.m1101a("%s : dispatching event", "IgniteEventDispatcher");
        if (f116565b.f116566a != null) {
            EnumC14730t m77670a = EnumC14730t.m77670a(enumC44419d);
            if (m77670a == null) {
                IAlog.m76524f("%s : One DT Error: %s is missing in IAReportError map", "IgniteEventDispatcherWrapper", enumC44419d);
            } else {
                new C14740w(m77670a).m77657a(objArr).m77658a((String) null);
            }
        }
    }
}
