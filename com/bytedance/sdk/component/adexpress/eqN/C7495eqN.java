package com.bytedance.sdk.component.adexpress.eqN;

import com.bytedance.sdk.component.adexpress.p243bg.p246bg.C7324bg;
import com.bytedance.sdk.component.adexpress.p243bg.p246bg.InterfaceC7323bX;
import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import com.bytedance.sdk.component.p233Kg.C7255ldr;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.component.adexpress.eqN.eqN */
/* loaded from: classes3.dex */
public class C7495eqN {
    /* renamed from: IL */
    public static void m88666IL(AbstractRunnableC7227Kg abstractRunnableC7227Kg, int i) {
        ExecutorService executorService;
        if (abstractRunnableC7227Kg == null) {
            return;
        }
        InterfaceC7323bX m89119bX = C7324bg.m89118bg().m89119bX();
        if (m89119bX != null) {
            executorService = m89119bX.mo85790Ta();
        } else {
            executorService = null;
        }
        if (executorService != null) {
            abstractRunnableC7227Kg.setPriority(i);
            executorService.execute(abstractRunnableC7227Kg);
            return;
        }
        C7255ldr.m89453bg(abstractRunnableC7227Kg);
    }

    /* renamed from: bg */
    public static void m88665bg(AbstractRunnableC7227Kg abstractRunnableC7227Kg, int i) {
        if (abstractRunnableC7227Kg == null) {
            return;
        }
        InterfaceC7323bX m89119bX = C7324bg.m89118bg().m89119bX();
        ExecutorService yDt = m89119bX != null ? m89119bX.yDt() : null;
        if (yDt != null) {
            abstractRunnableC7227Kg.setPriority(i);
            yDt.execute(abstractRunnableC7227Kg);
            return;
        }
        C7255ldr.m89452bg(abstractRunnableC7227Kg, i);
    }

    /* renamed from: bg */
    public static ScheduledFuture m88664bg(Runnable runnable, long j, TimeUnit timeUnit) {
        return C7255ldr.ldr().schedule(runnable, j, timeUnit);
    }
}
