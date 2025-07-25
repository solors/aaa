package com.bytedance.sdk.openadsdk.utils;

import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import java.lang.ref.SoftReference;

/* renamed from: com.bytedance.sdk.openadsdk.utils.IL */
/* loaded from: classes3.dex */
public class C9499IL {

    /* renamed from: bg */
    public static SoftReference<AbstractC8967tuV> f21148bg;

    /* renamed from: bg */
    public static AbstractC8967tuV m82658bg() {
        SoftReference<AbstractC8967tuV> softReference = f21148bg;
        if (softReference != null) {
            return softReference.get();
        }
        return null;
    }

    /* renamed from: bg */
    public static void m82657bg(AbstractC8967tuV abstractC8967tuV) {
        if (abstractC8967tuV == null) {
            return;
        }
        f21148bg = new SoftReference<>(abstractC8967tuV);
    }
}
