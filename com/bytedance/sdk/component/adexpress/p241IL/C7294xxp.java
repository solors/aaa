package com.bytedance.sdk.component.adexpress.p241IL;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.component.adexpress.eqN.C7495eqN;
import com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7288eo;
import com.bytedance.sdk.component.adexpress.p253zx.AbstractC7563bg;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.component.adexpress.IL.xxp */
/* loaded from: classes3.dex */
public class C7294xxp implements InterfaceC7288eo {

    /* renamed from: IL */
    private AbstractC7563bg f15780IL;

    /* renamed from: bX */
    private InterfaceC7279Kg f15781bX;

    /* renamed from: bg */
    private Context f15782bg;
    private C7282Ta eqN;
    private AtomicBoolean ldr = new AtomicBoolean(false);

    /* renamed from: zx */
    private ScheduledFuture<?> f15783zx;

    /* renamed from: com.bytedance.sdk.component.adexpress.IL.xxp$bg */
    /* loaded from: classes3.dex */
    private class RunnableC7296bg implements Runnable {

        /* renamed from: bX */
        private int f15787bX;

        /* renamed from: bg */
        InterfaceC7288eo.InterfaceC7289bg f15788bg;

        public RunnableC7296bg(int i, InterfaceC7288eo.InterfaceC7289bg interfaceC7289bg) {
            this.f15787bX = i;
            this.f15788bg = interfaceC7289bg;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f15787bX == 1) {
                C7294xxp.this.f15780IL.m88539bg(true);
                C7294xxp.this.m89277bg(this.f15788bg, 107, null);
            }
        }
    }

    public C7294xxp(Context context, C7282Ta c7282Ta, AbstractC7563bg abstractC7563bg, InterfaceC7279Kg interfaceC7279Kg) {
        this.f15782bg = context;
        this.eqN = c7282Ta;
        this.f15781bX = interfaceC7279Kg;
        this.f15780IL = abstractC7563bg;
        abstractC7563bg.m88544bg(this.f15781bX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bX */
    public void m89278bX() {
        try {
            ScheduledFuture<?> scheduledFuture = this.f15783zx;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.f15783zx.cancel(false);
                this.f15783zx = null;
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: IL */
    public AbstractC7563bg m89280IL() {
        return this.f15780IL;
    }

    @Override // com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7288eo
    /* renamed from: bg */
    public boolean mo84922bg(final InterfaceC7288eo.InterfaceC7289bg interfaceC7289bg) {
        int ldr = this.eqN.ldr();
        if (ldr < 0) {
            m89277bg(interfaceC7289bg, 107, "time is ".concat(String.valueOf(ldr)));
        } else {
            this.f15783zx = C7495eqN.m88664bg(new RunnableC7296bg(1, interfaceC7289bg), ldr, TimeUnit.MILLISECONDS);
            this.f15780IL.mo84828bg(new InterfaceC7291iR() { // from class: com.bytedance.sdk.component.adexpress.IL.xxp.1
                @Override // com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7291iR
                /* renamed from: bg */
                public void mo84917bg(View view, C7297yDt c7297yDt) {
                    InterfaceC7280Lq mo89289IL;
                    C7294xxp.this.m89278bX();
                    if (interfaceC7289bg.mo89287bX() || (mo89289IL = interfaceC7289bg.mo89289IL()) == null) {
                        return;
                    }
                    mo89289IL.mo85633bg(C7294xxp.this.f15780IL, c7297yDt);
                    interfaceC7289bg.mo89283bg(true);
                }

                @Override // com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7291iR
                /* renamed from: bg */
                public void mo84918bg(int i, String str) {
                    C7294xxp.this.m89277bg(interfaceC7289bg, i, str);
                }
            });
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.adexpress.p241IL.InterfaceC7288eo
    /* renamed from: bg */
    public void mo84923bg() {
        this.f15780IL.eqN();
        m89278bX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bg */
    public void m89277bg(InterfaceC7288eo.InterfaceC7289bg interfaceC7289bg, int i, String str) {
        InterfaceC7280Lq mo89289IL;
        if (interfaceC7289bg.mo89287bX() || this.ldr.get()) {
            return;
        }
        m89278bX();
        this.eqN.m89328zx().mo85765bg(i, str);
        if (interfaceC7289bg.mo89288IL(this)) {
            interfaceC7289bg.mo89284bg(this);
        } else if (interfaceC7289bg.mo89287bX() || (mo89289IL = interfaceC7289bg.mo89289IL()) == null) {
            return;
        } else {
            interfaceC7289bg.mo89283bg(true);
            mo89289IL.mo85826a_(i);
        }
        this.ldr.getAndSet(true);
    }
}
