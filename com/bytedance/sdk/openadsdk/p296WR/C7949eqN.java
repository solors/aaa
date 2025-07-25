package com.bytedance.sdk.openadsdk.p296WR;

import android.content.Context;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7191Ta;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7194VB;
import com.bytedance.sdk.component.p228IL.p229bg.C7219ldr;
import com.bytedance.sdk.component.p275zx.InterfaceC7778Lq;
import com.bytedance.sdk.component.p275zx.InterfaceC7831eo;
import com.bytedance.sdk.component.p275zx.InterfaceC7832eqN;
import com.bytedance.sdk.component.p275zx.InterfaceC7849tC;
import com.bytedance.sdk.component.p275zx.InterfaceC7853zx;
import com.bytedance.sdk.component.p275zx.p276IL.C7774eqN;
import com.bytedance.sdk.component.p275zx.p276IL.C7775zx;
import com.bytedance.sdk.component.p275zx.p277bX.C7785IL;
import com.bytedance.sdk.component.p275zx.p277bX.C7823zx;
import com.bytedance.sdk.component.p275zx.p277bX.p279bX.C7795IL;
import com.bytedance.sdk.component.p275zx.p277bX.p280bg.C7808bg;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.model.C8948Lq;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;
import com.bytedance.sdk.openadsdk.utils.C9531VW;
import com.bytedance.sdk.openadsdk.utils.ZQc;
import com.bytedance.sdk.openadsdk.xxp.C9585bX;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.sdk.openadsdk.WR.eqN */
/* loaded from: classes3.dex */
public class C7949eqN {

    /* renamed from: com.bytedance.sdk.openadsdk.WR.eqN$bg */
    /* loaded from: classes3.dex */
    public static final class C7950bg {

        /* renamed from: bg */
        private static final InterfaceC7778Lq f17305bg = m87356bg(C8838VzQ.m84740bg());

        /* renamed from: IL */
        public static InterfaceC7831eo m87360IL(String str) {
            return m87355bg(f17305bg.mo87369bg(str).mo87565zx(ZQc.eqN(C8838VzQ.m84740bg())).eqN(ZQc.m82538bX(C8838VzQ.m84740bg())));
        }

        /* renamed from: IL */
        public static InterfaceC7831eo m87361IL(C8948Lq c8948Lq) {
            return m87355bg(f17305bg.mo87369bg(c8948Lq.m84303bg()).mo87575bg(c8948Lq.m84307IL()).mo87578IL(c8948Lq.m84304bX()).mo87565zx(ZQc.eqN(C8838VzQ.m84740bg())).eqN(ZQc.m82538bX(C8838VzQ.m84740bg())).mo87567bg(c8948Lq.m84299iR()));
        }

        /* renamed from: bg */
        private static InterfaceC7778Lq m87356bg(Context context) {
            return C7785IL.m87777bg(context, new C7823zx.C7825bg().m87592bg(new C7808bg(Math.max(Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 83886080), 10485760), 41943040L, new File(CacheDirFactory.getImageCacheDir()))).m87589bg(new InterfaceC7849tC() { // from class: com.bytedance.sdk.openadsdk.WR.eqN.bg.2
                @Override // com.bytedance.sdk.component.p275zx.InterfaceC7849tC
                /* renamed from: bg */
                public ExecutorService mo87346bg() {
                    return C9519VJ.m82592IL();
                }
            }).m87590bg(new InterfaceC7832eqN() { // from class: com.bytedance.sdk.openadsdk.WR.eqN.bg.1
                @Override // com.bytedance.sdk.component.p275zx.InterfaceC7832eqN
                /* renamed from: IL */
                public C7774eqN mo87348bg(InterfaceC7853zx interfaceC7853zx) {
                    C7775zx c7775zx;
                    AbstractC7194VB m88311zx = C9585bX.m82322bg().m82324IL().m88311zx();
                    AbstractC7191Ta m89659IL = new AbstractC7191Ta.C7192bg().m89658IL(interfaceC7853zx.mo87547bg()).m89656bg().m89659IL();
                    AbstractC7189Lq abstractC7189Lq = null;
                    if (interfaceC7853zx.mo87548bX()) {
                        c7775zx = new C7775zx();
                    } else {
                        c7775zx = null;
                    }
                    if (c7775zx != null) {
                        c7775zx.m87779bg(System.currentTimeMillis());
                    }
                    try {
                        abstractC7189Lq = m88311zx.mo89615bg(m89659IL).mo89629IL();
                        if (c7775zx != null) {
                            c7775zx.m87781IL(System.currentTimeMillis());
                        }
                        Map<String, String> m87347bg = m87347bg(interfaceC7853zx, abstractC7189Lq);
                        byte[] eqN = abstractC7189Lq.ldr().eqN();
                        if (c7775zx != null) {
                            c7775zx.m87780bX(System.currentTimeMillis());
                        }
                        C7774eqN c7774eqN = new C7774eqN(abstractC7189Lq.mo89611bX(), eqN, "", m87347bg);
                        c7774eqN.m87782bg(c7775zx);
                        return c7774eqN;
                    } catch (Throwable th) {
                        try {
                            return m87349bg(c7775zx, th);
                        } finally {
                            C7795IL.m87725bg(abstractC7189Lq);
                        }
                    }
                }

                /* renamed from: bg */
                private Map<String, String> m87347bg(InterfaceC7853zx interfaceC7853zx, AbstractC7189Lq abstractC7189Lq) {
                    if (interfaceC7853zx.mo87549IL()) {
                        C7219ldr mo89606iR = abstractC7189Lq.mo89606iR();
                        HashMap hashMap = new HashMap();
                        int m89567bg = mo89606iR.m89567bg();
                        for (int i = 0; i < m89567bg; i++) {
                            String m89566bg = mo89606iR.m89566bg(i);
                            String m89568IL = mo89606iR.m89568IL(i);
                            if (m89566bg != null) {
                                hashMap.put(m89566bg, m89568IL);
                            }
                        }
                        return hashMap;
                    }
                    return null;
                }

                /* renamed from: bg */
                private C7774eqN m87349bg(C7775zx c7775zx, Throwable th) {
                    th.getMessage();
                    if (c7775zx != null) {
                        c7775zx.m87780bX(System.currentTimeMillis());
                    }
                    C7774eqN c7774eqN = new C7774eqN(98765, th, "net failed");
                    c7774eqN.m87782bg(c7775zx);
                    return c7774eqN;
                }
            }).m87593bg());
        }

        /* renamed from: IL */
        public static InputStream m87359IL(String str, String str2) {
            return f17305bg.mo87368bg(str, str2);
        }

        /* renamed from: IL */
        public static boolean m87358IL(String str, String str2, String str3) {
            return f17305bg.mo87367bg(str, str2, str3);
        }

        /* renamed from: bg */
        private static InterfaceC7831eo m87355bg(InterfaceC7831eo interfaceC7831eo) {
            return C9531VW.m82561bg() ? interfaceC7831eo.mo87570bg(new C7953zx()) : interfaceC7831eo;
        }
    }

    /* renamed from: bg */
    public static InterfaceC7831eo m87364bg(String str) {
        return C7950bg.m87360IL(str);
    }

    /* renamed from: bg */
    public static InterfaceC7831eo m87365bg(C8948Lq c8948Lq) {
        return C7950bg.m87361IL(c8948Lq);
    }

    /* renamed from: bg */
    public static InputStream m87363bg(String str, String str2) {
        return C7950bg.m87359IL(str, str2);
    }

    /* renamed from: bg */
    public static boolean m87362bg(String str, String str2, String str3) {
        return C7950bg.m87358IL(str, str2, str3);
    }

    /* renamed from: bg */
    public static InterfaceC7778Lq m87366bg() {
        return C7950bg.f17305bg;
    }
}
