package com.bytedance.sdk.component.p275zx.p283bg;

import com.bytedance.sdk.component.p275zx.InterfaceC7779PX;
import com.bytedance.sdk.component.p275zx.InterfaceC7783WR;
import com.bytedance.sdk.component.p275zx.p277bX.p279bX.C7796bX;
import java.util.WeakHashMap;

/* renamed from: com.bytedance.sdk.component.zx.bg.IL */
/* loaded from: classes3.dex */
public class C7827IL {
    /* renamed from: bg */
    public static InterfaceC7779PX m87583bg() {
        return new InterfaceC7779PX() { // from class: com.bytedance.sdk.component.zx.bg.IL.1

            /* renamed from: bg */
            private WeakHashMap<String, String> f17101bg = new WeakHashMap<>();

            @Override // com.bytedance.sdk.component.p275zx.InterfaceC7779PX
            /* renamed from: IL */
            public String mo87582IL(InterfaceC7783WR interfaceC7783WR) {
                return m87580bg(interfaceC7783WR.mo87756bg());
            }

            @Override // com.bytedance.sdk.component.p275zx.InterfaceC7779PX
            /* renamed from: bg */
            public String mo87581bg(InterfaceC7783WR interfaceC7783WR) {
                return m87580bg(interfaceC7783WR.mo87756bg() + "#width=" + interfaceC7783WR.mo87770IL() + "#height=" + interfaceC7783WR.mo87758bX() + "#scaletype=" + interfaceC7783WR.eqN() + "#bitmapConfig=" + interfaceC7783WR.ldr());
            }

            /* renamed from: bg */
            private String m87580bg(String str) {
                String str2 = this.f17101bg.get(str);
                if (str2 == null) {
                    String m87719bg = C7796bX.m87719bg(str);
                    this.f17101bg.put(str, m87719bg);
                    return m87719bg;
                }
                return str2;
            }
        };
    }
}
