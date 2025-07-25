package com.bytedance.sdk.openadsdk.eqN.p344bg;

import android.content.Context;
import com.bytedance.sdk.component.ldr.p261bg.C7642IL;
import com.bytedance.sdk.component.ldr.p261bg.C7663bg;
import com.bytedance.sdk.component.ldr.p261bg.eqN.p271IL.C7705bg;
import com.bytedance.sdk.component.ldr.p261bg.eqN.p272bg.C7708bg;
import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.core.C8617PX;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.eqN.C9165bX;
import com.bytedance.sdk.openadsdk.eqN.C9224bg;
import com.bytedance.sdk.openadsdk.multipro.C9307IL;
import com.bytedance.sdk.openadsdk.yDt.p364bX.InterfaceC9624IL;
import com.maticoo.sdk.utils.event.Event;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.bg.eqN */
/* loaded from: classes3.dex */
public class C9252eqN {

    /* renamed from: bg */
    public static AtomicInteger f20675bg = new AtomicInteger(0);

    /* renamed from: IL */
    public static final AtomicBoolean f20674IL = new AtomicBoolean(false);

    /* renamed from: IL */
    public static void m83302IL() {
        C7642IL.m88294bX();
    }

    /* renamed from: bX */
    public static void m83301bX() {
        try {
            C7642IL.eqN();
            C7642IL.m88286zx();
        } catch (Throwable th) {
            C7741PX.m87873bg("AdLogSwitchUtils", th.getMessage());
        }
    }

    /* renamed from: bg */
    public static void m83299bg(Context context, boolean z) {
        if (f20674IL.compareAndSet(false, true)) {
            C7642IL.m88292bg(new C7663bg.C7665bg().m88089bg(new C9239eo()).m88094IL(C7705bg.m88000bX()).m88093bX(C7705bg.m87998zx()).m88087bg(C7705bg.eqN()).m88085bg(z).m88086bg(new C9233VB()).m88088bg(C9229Kg.f20636bg).m88095IL(C8838VzQ.eqN().yDt()).m88091bg(C8838VzQ.eqN().mo83806Lq()).m88090bg(C8838VzQ.eqN().bOf()).m88092bg(), context);
            m83302IL();
        }
    }

    /* renamed from: bg */
    public static void m83298bg(C9224bg c9224bg) {
        C7708bg c7708bg = new C7708bg(c9224bg.eqN(), c9224bg);
        c7708bg.mo87996IL(c9224bg.m83379zx() ? (byte) 1 : (byte) 2);
        c7708bg.mo87984bg((byte) 0);
        if (C7642IL.m88295IL()) {
            m83299bg(C8838VzQ.m84740bg(), C9307IL.m83088bX());
        }
        C7642IL.m88291bg(c7708bg);
    }

    /* renamed from: bg */
    public static InterfaceC9624IL m83300bg() {
        return C9230PX.f20638bg;
    }

    /* renamed from: bg */
    public static void m83295bg(final List<String> list, final int i, final String str) {
        if (list == null) {
            return;
        }
        C9165bX.m83428bg(new AbstractRunnableC7227Kg(Event.DEFAULT_TYPE) { // from class: com.bytedance.sdk.openadsdk.eqN.bg.eqN.1
            @Override // java.lang.Runnable
            public void run() {
                if (C7642IL.m88295IL()) {
                    C9252eqN.m83299bg(C8838VzQ.m84740bg(), C9307IL.m83088bX());
                }
                C7642IL.m88290bg(C8617PX.m85532bg(C8838VzQ.m84740bg()), list, true, i, str);
            }
        });
    }

    /* renamed from: bg */
    public static void m83297bg(String str) {
        m83296bg(str, false);
    }

    /* renamed from: bg */
    public static void m83296bg(String str, boolean z) {
        if (C7642IL.m88295IL()) {
            m83299bg(C8838VzQ.m84740bg(), C9307IL.m83088bX());
        }
        C7642IL.m88288bg(str, z);
    }
}
