package com.bytedance.sdk.openadsdk.yDt;

import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import com.bytedance.sdk.openadsdk.core.C8990rri;
import com.bytedance.sdk.openadsdk.eqN.p344bg.C9238bg;
import com.bytedance.sdk.openadsdk.eqN.p344bg.C9255ldr;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;
import com.bytedance.sdk.openadsdk.yDt.p365bg.C9636zx;

/* renamed from: com.bytedance.sdk.openadsdk.yDt.bg */
/* loaded from: classes3.dex */
public class C9629bg {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bX */
    public static void m82270bX() {
        C9238bg.m83336IL();
        C9636zx.eqN();
        C9255ldr.m83289bg();
        C8990rri.m83866bg();
    }

    /* renamed from: bg */
    public static void m82269bg() {
        if (C9519VJ.m82567zx()) {
            C9519VJ.m82577bg(new AbstractRunnableC7227Kg("DailyTaskHelper") { // from class: com.bytedance.sdk.openadsdk.yDt.bg.1
                @Override // java.lang.Runnable
                public void run() {
                    C9629bg.m82270bX();
                }
            });
        } else {
            m82270bX();
        }
    }
}
