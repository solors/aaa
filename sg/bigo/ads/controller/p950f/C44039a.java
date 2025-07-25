package sg.bigo.ads.controller.p950f;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.common.p906aa.C43592c;
import sg.bigo.ads.common.p910d.C43602a;
import sg.bigo.ads.common.p910d.InterfaceC43607c;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.controller.f.a */
/* loaded from: classes10.dex */
public final class C44039a implements InterfaceC43607c {

    /* renamed from: a */
    private static volatile C44039a f115542a;

    /* renamed from: b */
    private final List<InterfaceC44040a> f115543b = new ArrayList();

    /* renamed from: sg.bigo.ads.controller.f.a$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC44040a {
        /* renamed from: a */
        void mo4099a(boolean z);
    }

    @Override // sg.bigo.ads.common.p910d.InterfaceC43606b
    /* renamed from: a */
    public final void mo3527a(Context context, Intent intent) {
        boolean m5333b = C43592c.m5333b(context);
        C43782a.m5010a(0, 3, "NetworkStateReceiver", "Network state changed, available: ".concat(String.valueOf(m5333b)));
        synchronized (this.f115543b) {
            for (InterfaceC44040a interfaceC44040a : this.f115543b) {
                if (interfaceC44040a != null) {
                    interfaceC44040a.mo4099a(m5333b);
                } else {
                    C43782a.m5010a(0, 3, "NetworkStateReceiver", "OnNetworkStateChangeListener is null object reference");
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m4100a(Context context, @Nullable InterfaceC44040a interfaceC44040a) {
        synchronized (C44039a.class) {
            if (f115542a == null) {
                f115542a = new C44039a();
                C43602a.m5323a().m5321a(context, f115542a);
            }
            synchronized (f115542a.f115543b) {
                if (interfaceC44040a != null) {
                    f115542a.f115543b.add(interfaceC44040a);
                }
            }
        }
    }
}
