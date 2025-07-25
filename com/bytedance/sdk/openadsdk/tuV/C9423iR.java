package com.bytedance.sdk.openadsdk.tuV;

/* renamed from: com.bytedance.sdk.openadsdk.tuV.iR */
/* loaded from: classes3.dex */
public class C9423iR {

    /* renamed from: bg */
    private static InterfaceC9424bg f21048bg;

    /* renamed from: com.bytedance.sdk.openadsdk.tuV.iR$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC9424bg {
        /* renamed from: bg */
        void mo82731bg(String str, String str2, Throwable th);
    }

    /* renamed from: bg */
    public static void m82733bg(InterfaceC9424bg interfaceC9424bg) {
        f21048bg = interfaceC9424bg;
    }

    /* renamed from: bg */
    public static boolean m82734bg() {
        return f21048bg != null;
    }

    /* renamed from: bg */
    public static void m82732bg(String str, String str2, Throwable th) {
        if (f21048bg == null) {
            return;
        }
        if (th == null) {
            th = new Throwable();
        }
        f21048bg.mo82731bg(str, str2, th);
    }
}
