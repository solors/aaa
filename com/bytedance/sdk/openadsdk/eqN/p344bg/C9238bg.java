package com.bytedance.sdk.openadsdk.eqN.p344bg;

import com.bytedance.sdk.openadsdk.multipro.eqN.C9351bg;
import com.bytedance.sdk.openadsdk.yDt.C9601bX;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.bg.bg */
/* loaded from: classes3.dex */
public class C9238bg {

    /* renamed from: bg */
    public static final C9228IL f20653bg = new C9228IL(0);

    /* renamed from: IL */
    public static final C9228IL f20651IL = new C9228IL(1);

    /* renamed from: bX */
    public static final C9228IL f20652bX = new C9228IL(2);
    public static final C9228IL eqN = new C9228IL(0);

    /* renamed from: zx */
    public static final C9228IL f20654zx = new C9228IL(1);
    public static final C9228IL ldr = new C9228IL(2);

    /* renamed from: IL */
    public static void m83336IL() {
        try {
            C9601bX.m82298IL("net_upload_monitor", C9351bg.m83003IL("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", ""));
            C9351bg.m82995bg("tt_sdk_event_net_ad");
            C9601bX.m82298IL("net_upload_monitor", C9351bg.m83003IL("tt_sdk_event_net_state", "tt_sdk_event_net_state", ""));
            C9351bg.m82995bg("tt_sdk_event_net_state");
            C9601bX.m82298IL("net_upload_monitor", C9351bg.m83003IL("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", ""));
            C9351bg.m82995bg("tt_sdk_event_net_trail");
            C9601bX.m82298IL("db_upload_monitor", C9351bg.m83003IL("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", ""));
            C9351bg.m82995bg("tt_sdk_event_db_ad");
            C9601bX.m82298IL("db_upload_monitor", C9351bg.m83003IL("tt_sdk_event_db_state", "tt_sdk_event_db_state", ""));
            C9351bg.m82995bg("tt_sdk_event_db_state");
            C9601bX.m82298IL("db_upload_monitor", C9351bg.m83003IL("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", ""));
            C9351bg.m82995bg("tt_sdk_event_db_trail");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bg */
    public static void m83318bg(C9228IL c9228il, boolean z, int i, long j) {
        try {
            c9228il.f20634iR.getAndSet(true);
            if (z) {
                c9228il.f20633bg.incrementAndGet();
                c9228il.f20632bX.addAndGet(j);
                return;
            }
            c9228il.f20631IL.incrementAndGet();
            Integer num = c9228il.ldr.get(Integer.valueOf(i));
            if (num != null) {
                c9228il.ldr.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
            } else {
                c9228il.ldr.put(Integer.valueOf(i), 1);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bg */
    public static void m83319bg(C9228IL c9228il, boolean z) {
        try {
            c9228il.f20634iR.getAndSet(true);
            if (z) {
                c9228il.f20633bg.incrementAndGet();
            } else {
                c9228il.f20631IL.incrementAndGet();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bg */
    public static void m83320bg(C9228IL c9228il) {
        try {
            c9228il.f20634iR.getAndSet(true);
            c9228il.f20635zx.incrementAndGet();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bg */
    public static void m83324bg() {
        try {
            C9228IL c9228il = f20653bg;
            if (c9228il.f20634iR.get()) {
                C9351bg.m82987bg("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", c9228il.m83377bg().toString());
            }
            C9228IL c9228il2 = f20651IL;
            if (c9228il2.f20634iR.get()) {
                C9351bg.m82987bg("tt_sdk_event_net_state", "tt_sdk_event_net_state", c9228il2.m83377bg().toString());
            }
            C9228IL c9228il3 = f20652bX;
            if (c9228il3.f20634iR.get()) {
                C9351bg.m82987bg("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", c9228il3.m83377bg().toString());
            }
            C9228IL c9228il4 = eqN;
            if (c9228il4.f20634iR.get()) {
                C9351bg.m82987bg("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", c9228il4.m83378IL().toString());
            }
            C9228IL c9228il5 = f20654zx;
            if (c9228il5.f20634iR.get()) {
                C9351bg.m82987bg("tt_sdk_event_db_state", "tt_sdk_event_db_state", c9228il5.m83378IL().toString());
            }
            C9228IL c9228il6 = ldr;
            if (c9228il6.f20634iR.get()) {
                C9351bg.m82987bg("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", c9228il6.m83378IL().toString());
            }
        } catch (Throwable unused) {
        }
    }
}
