package com.bytedance.sdk.openadsdk.p286Kg;

import android.text.TextUtils;
import com.bytedance.sdk.component.p257iR.p258IL.AbstractC7611bX;
import com.bytedance.sdk.openadsdk.utils.C9531VW;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.Kg.eqN */
/* loaded from: classes3.dex */
public final class C7883eqN extends AbstractC7882bg {

    /* renamed from: bg */
    public static InterfaceC7881bX f17205bg;

    /* renamed from: bg */
    public static String m87491bg(AbstractC7611bX abstractC7611bX, String str) {
        if (!C9531VW.m82562bX()) {
            return str;
        }
        InterfaceC7881bX m87493bg = C7880IL.m87493bg("net");
        if (m87493bg == null) {
            return str;
        }
        Map map = (Map) m87493bg.mo87492bg(1, str);
        if (map == null) {
            return str;
        }
        String str2 = (String) map.get("url");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get("header");
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                abstractC7611bX.m88401IL(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}
