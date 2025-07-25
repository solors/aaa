package com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p143zx;

import android.text.TextUtils;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.C6492bX;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7191Ta;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7194VB;
import java.io.IOException;
import java.util.Map;

/* renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.zx.eqN */
/* loaded from: classes3.dex */
public class C6444eqN implements InterfaceC6440IL {

    /* renamed from: bg */
    private AbstractC7194VB f13443bg;

    public C6444eqN() {
        this.f13443bg = null;
        this.f13443bg = C6492bX.eqN();
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p143zx.InterfaceC6440IL
    /* renamed from: bg */
    public AbstractC6443bg mo91943bg(C6446zx c6446zx) throws IOException {
        AbstractC7191Ta.C7192bg c7192bg = new AbstractC7191Ta.C7192bg();
        try {
            Map<String, String> map = c6446zx.f13448zx;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (!TextUtils.isEmpty(key)) {
                        String value = entry.getValue();
                        if (value == null) {
                            value = "";
                        }
                        c7192bg.m89657IL(key, value);
                    }
                }
            }
            AbstractC7189Lq mo89629IL = this.f13443bg.mo89615bg(c7192bg.m89658IL(c6446zx.f13445IL).m89656bg().m89650bg("videoPreloadLowVersion").m89655bg(6).m89659IL()).mo89629IL();
            mo89629IL.mo89611bX();
            return new C6445ldr(mo89629IL, c6446zx);
        } catch (Throwable unused) {
            return null;
        }
    }
}
