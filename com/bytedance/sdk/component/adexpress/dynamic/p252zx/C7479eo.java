package com.bytedance.sdk.component.adexpress.dynamic.p252zx;

import com.bytedance.sdk.component.adexpress.dynamic.p252zx.C7470IL;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.zx.eo */
/* loaded from: classes3.dex */
public class C7479eo {
    /* renamed from: bg */
    public static float m88710bg(float f) {
        return (float) Math.ceil((f * 16.0f) / 16.0f);
    }

    /* renamed from: bg */
    public static List<C7470IL.C7473bg> m88709bg(float f, List<C7470IL.C7473bg> list) {
        ArrayList<C7470IL.C7473bg> arrayList = new ArrayList();
        for (C7470IL.C7473bg c7473bg : list) {
            arrayList.add((C7470IL.C7473bg) c7473bg.clone());
        }
        boolean z = true;
        int i = 0;
        int i2 = 0;
        for (C7470IL.C7473bg c7473bg2 : arrayList) {
            if (c7473bg2.f16249IL) {
                i = (int) (i + c7473bg2.f16251bg);
            } else {
                i2 = (int) (i2 + c7473bg2.f16251bg);
                z = false;
            }
        }
        if (!z || f <= i) {
            float f2 = i;
            int i3 = (f > f2 ? 1 : (f == f2 ? 0 : -1));
            float f3 = i3 < 0 ? f / f2 : 1.0f;
            int i4 = (f > f2 ? 1 : (f == f2 ? 0 : -1));
            float f4 = i4 > 0 ? (f - f2) / i2 : 0.0f;
            if (f4 > 1.0f) {
                ArrayList arrayList2 = new ArrayList();
                boolean z2 = false;
                for (C7470IL.C7473bg c7473bg3 : arrayList) {
                    if (!c7473bg3.f16249IL) {
                        float f5 = c7473bg3.f16250bX;
                        if (f5 != 0.0f && c7473bg3.f16251bg * f4 > f5) {
                            c7473bg3.f16251bg = f5;
                            c7473bg3.f16249IL = true;
                            z2 = true;
                        }
                    }
                    arrayList2.add(c7473bg3);
                }
                if (z2) {
                    return m88709bg(f, arrayList2);
                }
            }
            int i5 = 0;
            for (C7470IL.C7473bg c7473bg4 : arrayList) {
                if (c7473bg4.f16249IL) {
                    c7473bg4.f16251bg = m88710bg(c7473bg4.f16251bg * f3);
                } else {
                    c7473bg4.f16251bg = m88710bg(c7473bg4.f16251bg * f4);
                }
                i5 = (int) (i5 + c7473bg4.f16251bg);
            }
            float f6 = i5;
            if (f6 < f) {
                float f7 = f - f6;
                for (int i6 = 0; i6 < arrayList.size() && f7 > 0.0f; i6 = (i6 + 1) % arrayList.size()) {
                    C7470IL.C7473bg c7473bg5 = (C7470IL.C7473bg) arrayList.get(i6);
                    if ((i3 < 0 && c7473bg5.f16249IL) || (i4 > 0 && !c7473bg5.f16249IL)) {
                        c7473bg5.f16251bg += 0.0625f;
                        f7 -= 0.0625f;
                    }
                }
            }
            return arrayList;
        }
        return arrayList;
    }
}
