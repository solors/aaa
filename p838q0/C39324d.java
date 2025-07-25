package p838q0;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import p002a1.C0003a;
import p1033x0.InterfaceC44663b;
import p1049y0.C44996b;
import p870s0.C39573h;
import p870s0.InterfaceServiceConnectionC39566a;

/* renamed from: q0.d */
/* loaded from: classes3.dex */
public final class C39324d implements InterfaceC44663b {

    /* renamed from: a */
    public C0003a f103400a = new C0003a(this);

    /* renamed from: b */
    public Context f103401b;

    /* renamed from: c */
    public InterfaceServiceConnectionC39566a f103402c;

    /* renamed from: d */
    public C39573h f103403d;

    public C39324d(Context context, InterfaceServiceConnectionC39566a interfaceServiceConnectionC39566a, C39573h c39573h) {
        this.f103401b = context.getApplicationContext();
        this.f103402c = interfaceServiceConnectionC39566a;
        this.f103403d = c39573h;
    }

    /* renamed from: a */
    public final void m13003a() {
        C0003a c0003a;
        C44996b.m1101a("%s : start", "OneDTPropertyWatchdog");
        Context context = this.f103401b;
        if (context != null && (c0003a = this.f103400a) != null && !c0003a.f41b) {
            IntentFilter intentFilter = new IntentFilter("com.dt.ignite.service.action.PROPERTY_CHANGED");
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(c0003a, intentFilter, 4);
            } else {
                context.registerReceiver(c0003a, intentFilter);
            }
            this.f103400a.f41b = true;
        }
    }
}
