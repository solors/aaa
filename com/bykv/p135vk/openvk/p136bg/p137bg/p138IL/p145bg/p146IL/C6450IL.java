package com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p145bg.p146IL;

import android.content.Context;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p148zx.C6488IL;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.C6492bX;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p151bX.C6494bX;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p154zx.InterfaceC6518bg;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7191Ta;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7194VB;
import com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7177IL;
import com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7198bX;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL */
/* loaded from: classes3.dex */
public class C6450IL {

    /* renamed from: IL */
    private C6494bX f13456IL;

    /* renamed from: bg */
    private Context f13458bg;
    private File eqN;

    /* renamed from: zx */
    private File f13460zx;

    /* renamed from: bX */
    private volatile boolean f13457bX = false;
    private final List<InterfaceC6518bg.InterfaceC6519bg> ldr = new ArrayList();

    /* renamed from: iR */
    private volatile boolean f13459iR = false;

    public C6450IL(Context context, C6494bX c6494bX) {
        this.eqN = null;
        this.f13460zx = null;
        this.f13458bg = context;
        this.f13456IL = c6494bX;
        this.eqN = C6488IL.m91770IL(c6494bX.m91722IL(), c6494bX.yDt());
        this.f13460zx = C6488IL.m91769bX(c6494bX.m91722IL(), c6494bX.yDt());
    }

    /* renamed from: bX */
    private void m91902bX() {
        AbstractC7194VB.C7195bg c7195bg;
        if (C6492bX.eqN() != null) {
            c7195bg = C6492bX.eqN().m89641IL();
        } else {
            c7195bg = new AbstractC7194VB.C7195bg("v_preload");
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c7195bg.m89637bg(this.f13456IL.m91700vb(), timeUnit).m89640IL(this.f13456IL.xxp(), timeUnit).m89639bX(this.f13456IL.VzQ(), timeUnit);
        AbstractC7194VB m89638bg = c7195bg.m89638bg();
        AbstractC7191Ta.C7192bg c7192bg = new AbstractC7191Ta.C7192bg();
        final long length = this.eqN.length();
        int m91712bX = this.f13456IL.m91712bX();
        boolean m91703eo = this.f13456IL.m91703eo();
        int m91709bg = this.f13456IL.m91709bg();
        if (m91709bg > 0) {
            if (m91709bg >= this.f13456IL.m91713WR()) {
                m91703eo = true;
            } else {
                m91712bX = m91709bg;
            }
        }
        c7192bg.m89650bg("videoPreload").m89655bg(6);
        if (m91703eo) {
            c7192bg.m89648bg("RANGE", "bytes=" + length + "-").m89658IL(this.f13456IL.m91715Ta()).m89656bg().m89659IL();
        } else {
            c7192bg.m89648bg("RANGE", "bytes=" + length + "-" + m91712bX).m89658IL(this.f13456IL.m91715Ta()).m89656bg().m89659IL();
        }
        m89638bg.mo89615bg(c7192bg.m89659IL()).mo89624bg(new InterfaceC7198bX() { // from class: com.bykv.vk.openvk.bg.bg.IL.bg.IL.IL.1
            {
                C6450IL.this = this;
            }

            @Override // com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7198bX
            /* renamed from: bg */
            public void mo83141bg(InterfaceC7177IL interfaceC7177IL, IOException iOException) {
                C6450IL c6450il = C6450IL.this;
                c6450il.m91894bg(c6450il.f13456IL, 601, iOException.getMessage());
                C6452bX.m91887bg(C6450IL.this.f13456IL);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:164:0x015d A[Catch: all -> 0x0174, TryCatch #1 {all -> 0x0174, blocks: (B:162:0x0150, B:164:0x015d, B:165:0x0161), top: B:171:0x0150 }] */
            /* JADX WARN: Type inference failed for: r13v5 */
            @Override // com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7198bX
            /* renamed from: bg */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void mo83142bg(com.bytedance.sdk.component.p228IL.p229bg.InterfaceC7177IL r18, com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq r19) throws java.io.IOException {
                /*
                    Method dump skipped, instructions count: 421
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p145bg.p146IL.C6450IL.C64511.mo83142bg(com.bytedance.sdk.component.IL.bg.IL, com.bytedance.sdk.component.IL.bg.Lq):void");
            }
        });
    }

    public void eqN() {
        try {
            this.f13460zx.delete();
            this.eqN.delete();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: zx */
    public void m91890zx() {
        try {
            if (this.eqN.renameTo(this.f13460zx)) {
                return;
            }
            throw new IOException("Error renaming file " + this.eqN + " to " + this.f13460zx + " for completion!");
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* renamed from: IL */
    private boolean m91906IL() {
        if (this.f13460zx.exists()) {
            return true;
        }
        if (!this.f13456IL.m91703eo()) {
            if (this.eqN.length() >= this.f13456IL.m91712bX()) {
                return true;
            }
            if (this.f13456IL.m91709bg() > 0 && this.eqN.length() >= this.f13456IL.m91709bg()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: bg */
    public void m91893bg(InterfaceC6518bg.InterfaceC6519bg interfaceC6519bg) {
        if (this.f13459iR) {
            synchronized (InterfaceC6518bg.InterfaceC6519bg.class) {
                this.ldr.add(interfaceC6519bg);
            }
            return;
        }
        this.ldr.add(interfaceC6519bg);
        if (m91906IL()) {
            this.f13456IL.m91701iR(1);
            m91895bg(this.f13456IL, 200);
            C6452bX.m91887bg(this.f13456IL);
            return;
        }
        this.f13459iR = true;
        this.f13456IL.m91701iR(0);
        m91902bX();
    }

    /* renamed from: IL */
    public void m91903IL(C6494bX c6494bX, int i) {
        synchronized (InterfaceC6518bg.InterfaceC6519bg.class) {
            for (InterfaceC6518bg.InterfaceC6519bg interfaceC6519bg : this.ldr) {
                if (interfaceC6519bg != null) {
                    interfaceC6519bg.mo84964IL(c6494bX, i);
                }
            }
        }
    }

    /* renamed from: bg */
    public void m91892bg(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: bg */
    public C6494bX m91900bg() {
        return this.f13456IL;
    }

    /* renamed from: bg */
    public void m91891bg(boolean z) {
        this.f13457bX = z;
    }

    /* renamed from: bg */
    public void m91895bg(C6494bX c6494bX, int i) {
        synchronized (InterfaceC6518bg.InterfaceC6519bg.class) {
            for (InterfaceC6518bg.InterfaceC6519bg interfaceC6519bg : this.ldr) {
                if (interfaceC6519bg != null) {
                    interfaceC6519bg.mo84963bg(c6494bX, i);
                }
            }
        }
    }

    /* renamed from: bg */
    public void m91894bg(C6494bX c6494bX, int i, String str) {
        synchronized (InterfaceC6518bg.InterfaceC6519bg.class) {
            for (InterfaceC6518bg.InterfaceC6519bg interfaceC6519bg : this.ldr) {
                if (interfaceC6519bg != null) {
                    interfaceC6519bg.mo84962bg(c6494bX, i, str);
                }
            }
        }
    }
}
