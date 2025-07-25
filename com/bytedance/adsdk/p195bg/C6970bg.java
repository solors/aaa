package com.bytedance.adsdk.p195bg;

import com.bytedance.adsdk.p195bg.p196IL.C6948bg;
import com.bytedance.adsdk.p195bg.p196IL.p201bg.C6951bg;
import com.bytedance.adsdk.ugeno.p213bX.InterfaceC7034bg;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.bg.bg */
/* loaded from: classes3.dex */
public class C6970bg implements InterfaceC7034bg {

    /* renamed from: com.bytedance.adsdk.bg.bg$bg */
    /* loaded from: classes3.dex */
    static class C6971bg implements InterfaceC7034bg.InterfaceC7035bg {

        /* renamed from: IL */
        private String f14875IL;

        /* renamed from: bg */
        private C6948bg f14876bg;

        private C6971bg(String str) {
            this.f14875IL = str;
            this.f14876bg = C6948bg.m90461bg(str);
        }

        /* renamed from: bg */
        public static C6971bg m90396bg(String str) {
            return new C6971bg(str);
        }

        @Override // com.bytedance.adsdk.ugeno.p213bX.InterfaceC7034bg.InterfaceC7035bg
        /* renamed from: bg */
        public Object mo90219bg(JSONObject jSONObject) {
            C6948bg c6948bg = this.f14876bg;
            if (c6948bg == null) {
                return this.f14875IL;
            }
            Object m90459bg = c6948bg.m90459bg(jSONObject);
            if (m90459bg instanceof String) {
                return m90459bg;
            }
            if (m90459bg instanceof C6951bg) {
                return String.valueOf(C6975iR.m90394bg((C6951bg) m90459bg));
            }
            return String.valueOf(m90459bg);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p213bX.InterfaceC7034bg
    /* renamed from: bg */
    public InterfaceC7034bg.InterfaceC7035bg mo90220bg(String str) {
        return C6971bg.m90396bg(str);
    }
}
