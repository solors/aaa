package com.bytedance.sdk.openadsdk.p297bX;

import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.InterfaceC8512Fy;
import com.bytedance.sdk.openadsdk.eqN.C9224bg;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.bX.IL */
/* loaded from: classes3.dex */
public class C8105IL {

    /* renamed from: bg */
    private static volatile C8105IL f17754bg;

    /* renamed from: IL */
    private final InterfaceC8512Fy<C9224bg> f17755IL = C8838VzQ.m84741bX();

    private C8105IL() {
    }

    /* renamed from: bg */
    public static C8105IL m87010bg() {
        if (f17754bg == null) {
            synchronized (C8105IL.class) {
                if (f17754bg == null) {
                    f17754bg = new C8105IL();
                }
            }
        }
        return f17754bg;
    }

    /* renamed from: bg */
    public void m87009bg(@NonNull String str, List<FilterWord> list, String str2) {
        m87008bg(str, list, null, null, str2);
    }

    /* renamed from: bg */
    public void m87008bg(@NonNull String str, List<FilterWord> list, String str2, String str3, String str4) {
        this.f17755IL.mo85559bg(str, list, str2, str3, str4);
    }
}
