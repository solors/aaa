package com.bytedance.sdk.component.ldr.p261bg;

import android.content.Context;
import com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg;
import com.bytedance.sdk.component.ldr.p261bg.eqN.p271IL.C7705bg;
import com.bytedance.sdk.component.ldr.p261bg.ldr.C7720bg;
import com.bytedance.sdk.component.ldr.p261bg.p262IL.C7655eqN;
import com.bytedance.sdk.component.ldr.p261bg.p262IL.InterfaceC7646bX;
import com.bytedance.sdk.component.ldr.p261bg.p267bg.InterfaceC7696zx;
import com.bytedance.sdk.component.ldr.p261bg.p274zx.C7725IL;
import com.bytedance.sdk.component.ldr.p261bg.p274zx.InterfaceC7727bg;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.component.ldr.bg.Kg */
/* loaded from: classes3.dex */
public class C7659Kg {

    /* renamed from: Ta */
    private static C7659Kg f16754Ta;

    /* renamed from: eo */
    private static volatile InterfaceC7727bg f16755eo;

    /* renamed from: IL */
    private volatile C7705bg f16756IL;

    /* renamed from: Kg */
    private volatile boolean f16757Kg;

    /* renamed from: Lq */
    private long f16758Lq;

    /* renamed from: PX */
    private volatile Map<Integer, InterfaceC7646bX> f16759PX;

    /* renamed from: VB */
    private volatile InterfaceC7646bX f16760VB;

    /* renamed from: WR */
    private volatile InterfaceC7724zx f16761WR;

    /* renamed from: bX */
    private volatile C7705bg f16762bX;

    /* renamed from: bg */
    private volatile Context f16763bg;
    private volatile C7705bg eqN;

    /* renamed from: iR */
    private volatile InterfaceC7696zx f16764iR;
    private volatile C7705bg ldr;
    private final AtomicBoolean yDt = new AtomicBoolean(false);

    /* renamed from: zx */
    private volatile C7705bg f16765zx;

    private C7659Kg() {
    }

    /* renamed from: iR */
    public static synchronized C7659Kg m88154iR() {
        C7659Kg c7659Kg;
        synchronized (C7659Kg.class) {
            if (f16754Ta == null) {
                f16754Ta = new C7659Kg();
            }
            c7659Kg = f16754Ta;
        }
        return c7659Kg;
    }

    /* renamed from: zx */
    public static InterfaceC7727bg m88152zx() {
        if (f16755eo == null) {
            synchronized (C7659Kg.class) {
                if (f16755eo == null) {
                    f16755eo = new C7725IL();
                }
            }
        }
        return f16755eo;
    }

    /* renamed from: IL */
    public boolean m88177IL() {
        return this.f16757Kg;
    }

    /* renamed from: Kg */
    public InterfaceC7646bX m88174Kg() {
        return this.f16760VB;
    }

    /* renamed from: Lq */
    public C7705bg m88173Lq() {
        return this.f16765zx;
    }

    /* renamed from: PX */
    public C7705bg m88172PX() {
        return this.f16756IL;
    }

    /* renamed from: Ta */
    public C7705bg m88171Ta() {
        return this.f16762bX;
    }

    /* renamed from: VB */
    public void m88170VB() {
        C7655eqN.f16739bg.m88188bX();
    }

    /* renamed from: WR */
    public void m88169WR() {
        C7655eqN.f16739bg.m88189IL();
    }

    /* renamed from: bX */
    public Map<Integer, InterfaceC7646bX> m88168bX() {
        return this.f16759PX;
    }

    /* renamed from: bg */
    public boolean m88166bg() {
        return this.yDt.get();
    }

    /* renamed from: eo */
    public C7705bg m88155eo() {
        return this.ldr;
    }

    public InterfaceC7696zx eqN() {
        return this.f16764iR;
    }

    public Context ldr() {
        return this.f16763bg;
    }

    /* renamed from: vb */
    public InterfaceC7724zx m88153vb() {
        return this.f16761WR;
    }

    public long xxp() {
        return this.f16758Lq * 24 * 60 * 60 * 1000;
    }

    public C7705bg yDt() {
        return this.eqN;
    }

    /* renamed from: IL */
    public void m88175IL(boolean z) {
        this.f16757Kg = z;
    }

    /* renamed from: bX */
    public void m88167bX(C7705bg c7705bg) {
        this.f16762bX = c7705bg;
    }

    /* renamed from: bg */
    public void m88156bg(boolean z) {
        this.yDt.set(z);
    }

    public void eqN(C7705bg c7705bg) {
        this.eqN = c7705bg;
    }

    /* renamed from: IL */
    public void m88176IL(C7705bg c7705bg) {
        this.f16756IL = c7705bg;
    }

    /* renamed from: bg */
    public void m88162bg(InterfaceC7696zx interfaceC7696zx) {
        this.f16764iR = interfaceC7696zx;
    }

    /* renamed from: bg */
    public void m88164bg(Context context) {
        this.f16763bg = context;
    }

    /* renamed from: bg */
    public void m88163bg(InterfaceC7646bX interfaceC7646bX) {
        this.f16760VB = interfaceC7646bX;
    }

    /* renamed from: bg */
    public void m88161bg(C7705bg c7705bg) {
        this.ldr = c7705bg;
    }

    /* renamed from: bg */
    public void m88160bg(InterfaceC7706bg interfaceC7706bg) {
        if (interfaceC7706bg == null) {
            return;
        }
        interfaceC7706bg.mo87982bg(System.currentTimeMillis());
        C7655eqN.f16739bg.m88183bg(interfaceC7706bg, interfaceC7706bg.eqN());
    }

    /* renamed from: zx */
    public void m88151zx(C7705bg c7705bg) {
        this.f16765zx = c7705bg;
    }

    /* renamed from: bg */
    public void m88157bg(String str, boolean z) {
        C7720bg.m87958bg().mo87963bg(str, z);
    }

    /* renamed from: bg */
    public void m88158bg(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        C7720bg.m87958bg().mo87964bg(str, list, z, map, i, str2);
    }

    /* renamed from: bg */
    public void m88159bg(InterfaceC7724zx interfaceC7724zx) {
        this.f16761WR = interfaceC7724zx;
    }

    /* renamed from: bg */
    public void m88165bg(long j) {
        this.f16758Lq = j;
    }
}
