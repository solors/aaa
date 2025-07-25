package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.ads.exceptions.VastException;
import com.inmobi.commons.core.configs.AdConfig;
import com.inmobi.media.C19277fc;
import com.inmobi.media.C19292h;
import com.inmobi.media.InterfaceC19291gc;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* renamed from: com.inmobi.media.fc */
/* loaded from: classes6.dex */
public final class C19277fc {

    /* renamed from: a */
    public static final C19277fc f48233a = new C19277fc();

    /* renamed from: b */
    public static final InterfaceC38501j f48234b;

    /* renamed from: c */
    public static final InterfaceC38501j f48235c;

    static {
        InterfaceC38501j m14554a;
        InterfaceC38501j m14554a2;
        m14554a = LazyJVM.m14554a(C19263ec.f48192a);
        f48234b = m14554a;
        m14554a2 = LazyJVM.m14554a(C19249dc.f48169a);
        f48235c = m14554a2;
    }

    /* renamed from: a */
    public static void m60337a(final C19292h ad2, final AdConfig adConfig, final InterfaceC19291gc interfaceC19291gc, final InterfaceC18850A4 interfaceC18850A4) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(adConfig, "adConfig");
        ((ExecutorService) f48234b.getValue()).execute(new Runnable() { // from class: o3.z3
            @Override // java.lang.Runnable
            public final void run() {
                C19277fc.m60334b(C19292h.this, adConfig, interfaceC19291gc, interfaceC18850A4);
            }
        });
    }

    /* renamed from: b */
    public static final void m60334b(C19292h ad2, AdConfig adConfig, InterfaceC19291gc interfaceC19291gc, InterfaceC18850A4 interfaceC18850A4) {
        Intrinsics.checkNotNullParameter(ad2, "$ad");
        Intrinsics.checkNotNullParameter(adConfig, "$adConfig");
        C19277fc c19277fc = f48233a;
        try {
            if (c19277fc.m60335a(ad2.m60288s(), interfaceC19291gc)) {
                C19292h m59865a = AbstractC19488v.m59865a(ad2, adConfig, interfaceC18850A4);
                if (m59865a == null) {
                    c19277fc.m60336a(ad2, false, (short) 75);
                } else {
                    c19277fc.m60336a(m59865a, true, (short) 0);
                }
            }
        } catch (VastException e) {
            c19277fc.m60336a(ad2, false, e.getTelemetryErrorCode());
        } catch (JSONException unused) {
            c19277fc.m60336a(ad2, false, (short) 58);
        }
    }

    /* renamed from: a */
    public final synchronized boolean m60335a(String str, InterfaceC19291gc interfaceC19291gc) {
        List m17160s;
        InterfaceC38501j interfaceC38501j = f48235c;
        List list = (List) ((HashMap) interfaceC38501j.getValue()).get(str);
        if (list == null) {
            m17160s = C37563v.m17160s(new WeakReference(interfaceC19291gc));
            ((HashMap) interfaceC38501j.getValue()).put(str, m17160s);
            return true;
        }
        list.add(new WeakReference(interfaceC19291gc));
        return false;
    }

    /* renamed from: a */
    public final synchronized void m60336a(final C19292h c19292h, final boolean z, final short s) {
        Unit unit;
        List<WeakReference> list = (List) ((HashMap) f48235c.getValue()).remove(c19292h.m60288s());
        if (list != null) {
            for (WeakReference weakReference : list) {
                final InterfaceC19291gc interfaceC19291gc = (InterfaceC19291gc) weakReference.get();
                if (interfaceC19291gc != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: o3.y3
                        @Override // java.lang.Runnable
                        public final void run() {
                            C19277fc.m60338a(InterfaceC19291gc.this, c19292h, z, s);
                        }
                    });
                } else {
                    Intrinsics.checkNotNullExpressionValue("fc", "TAG");
                }
            }
            unit = Unit.f99208a;
        } else {
            unit = null;
        }
        if (unit == null) {
            Intrinsics.checkNotNullExpressionValue("fc", "TAG");
        }
    }

    /* renamed from: a */
    public static final void m60338a(InterfaceC19291gc interfaceC19291gc, C19292h ad2, boolean z, short s) {
        Intrinsics.checkNotNullParameter(ad2, "$ad");
        interfaceC19291gc.mo59763a(ad2, z, s);
    }
}
