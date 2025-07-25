package com.bytedance.sdk.component.adexpress.p243bg.p244IL;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.eqN.C7495eqN;
import com.bytedance.sdk.component.adexpress.p243bg.p245bX.C7318bg;
import com.bytedance.sdk.component.adexpress.p243bg.p246bg.C7324bg;
import com.bytedance.sdk.component.adexpress.p253zx.C7566zx;
import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.component.utils.C7748VzQ;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.sdk.component.adexpress.bg.IL.zx */
/* loaded from: classes3.dex */
public class C7312zx extends AbstractC7305bX {

    /* renamed from: IL */
    private static volatile C7312zx f15820IL;

    /* renamed from: bg */
    private static File f15821bg;

    /* renamed from: bX */
    private AtomicBoolean f15823bX = new AtomicBoolean(true);
    private AtomicBoolean eqN = new AtomicBoolean(false);

    /* renamed from: zx */
    private boolean f15825zx = false;
    private AtomicBoolean ldr = new AtomicBoolean(false);

    /* renamed from: iR */
    private AtomicInteger f15824iR = new AtomicInteger(0);

    /* renamed from: Kg */
    private AtomicLong f15822Kg = new AtomicLong();

    private C7312zx() {
        m89166eo();
    }

    /* renamed from: IL */
    public static C7312zx m89176IL() {
        if (f15820IL == null) {
            synchronized (C7312zx.class) {
                if (f15820IL == null) {
                    f15820IL = new C7312zx();
                }
            }
        }
        return f15820IL;
    }

    /* renamed from: Kg */
    public static File m89174Kg() {
        if (f15821bg == null) {
            try {
                File file = new File(new File(C7307eqN.m89199bg(), "tt_tmpl_pkg"), "template");
                file.mkdirs();
                f15821bg = file;
            } catch (Throwable th) {
                C7741PX.m87871bg("TemplateManager", "getTemplateDir error", th);
            }
        }
        return f15821bg;
    }

    /* renamed from: VB */
    private void m89173VB() {
        if (this.f15824iR.getAndSet(0) > 0 && System.currentTimeMillis() - this.f15822Kg.get() > 600000) {
            m89165iR();
        }
    }

    /* renamed from: eo */
    private void m89166eo() {
        C7495eqN.m88666IL(new AbstractRunnableC7227Kg("init") { // from class: com.bytedance.sdk.component.adexpress.bg.IL.zx.1
            @Override // java.lang.Runnable
            public void run() {
                C7304Kg.m89222bg();
                C7312zx.this.f15823bX.set(false);
                C7312zx.this.eqN();
                C7312zx.this.m89165iR();
                if (C7324bg.m89118bg().m89119bX() != null && C7748VzQ.m87853bg(C7324bg.m89118bg().m89119bX().mo85794IL())) {
                    C7324bg.m89118bg().m89119bX().mo85787bX().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.bg.IL.zx.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (C7324bg.m89118bg().m89119bX() != null) {
                                C7324bg.m89118bg().m89119bX().eqN();
                            }
                        }
                    });
                }
            }
        }, 10);
    }

    /* renamed from: WR */
    public void m89172WR() {
        this.ldr.set(true);
        this.f15825zx = false;
        this.eqN.set(false);
    }

    /* renamed from: bX */
    public void m89171bX() {
        m89166eo();
    }

    public void eqN() {
        C7318bg m89225IL = C7304Kg.m89225IL();
        if (m89225IL != null && m89225IL.m89140iR()) {
            boolean m89168bg = m89168bg(m89225IL);
            if (!m89168bg) {
                C7304Kg.eqN();
            }
            this.f15825zx = m89168bg;
        }
    }

    /* renamed from: iR */
    public void m89165iR() {
        m89167bg(false);
    }

    public C7318bg ldr() {
        return C7304Kg.m89225IL();
    }

    /* renamed from: zx */
    public boolean m89164zx() {
        return this.f15825zx;
    }

    /* renamed from: bg */
    public boolean m89168bg(C7318bg c7318bg) {
        if (c7318bg == null) {
            return false;
        }
        return m89205bg(c7318bg.m89145bg()) || m89213bg(c7318bg.m89139zx()) || m89207bg(c7318bg.ldr());
    }

    @Override // com.bytedance.sdk.component.adexpress.p243bg.p244IL.AbstractC7305bX
    /* renamed from: bg */
    public File mo89170bg() {
        return m89174Kg();
    }

    /* renamed from: bg */
    public void m89167bg(boolean z) {
        List<C7318bg.C7320bg> list;
        boolean z2;
        if (this.f15823bX.get()) {
            return;
        }
        try {
            if (this.eqN.get()) {
                if (z) {
                    this.f15824iR.getAndIncrement();
                    return;
                }
                return;
            }
            boolean z3 = true;
            this.eqN.set(true);
            C7318bg mo85780zx = C7324bg.m89118bg().m89119bX().mo85780zx();
            C7318bg m89225IL = C7304Kg.m89225IL();
            if (mo85780zx != null && mo85780zx.m89140iR()) {
                if (!C7304Kg.m89224IL(mo85780zx)) {
                    this.eqN.set(false);
                    this.f15822Kg.set(System.currentTimeMillis());
                    return;
                }
                if (C7324bg.m89118bg().m89119bX() != null) {
                    C7324bg.m89118bg().m89119bX().mo85787bX().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.bg.IL.zx.2
                        @Override // java.lang.Runnable
                        public void run() {
                            C7566zx.m88531bg().m88537IL();
                        }
                    });
                }
                C7304Kg.m89221bg(mo85780zx);
                boolean m89209bg = (mo85780zx.m89139zx() == null || TextUtils.isEmpty(mo85780zx.m89139zx().m89135bg())) ? false : m89209bg(mo85780zx.m89139zx().m89135bg());
                if (mo85780zx.m89145bg().size() != 0) {
                    list = m89212bg(mo85780zx, m89225IL);
                    z2 = list != null;
                } else {
                    list = null;
                    z2 = m89209bg;
                }
                if (!m89209bg) {
                    List<C7318bg.C7320bg> m89219IL = m89219IL(mo85780zx, m89225IL);
                    if (list == null || m89219IL == null) {
                        list = m89219IL;
                    } else {
                        list.addAll(m89219IL);
                    }
                    if (m89219IL == null) {
                        z3 = false;
                    }
                    if (m89219IL == null) {
                        this.eqN.set(false);
                    }
                    z2 = z3;
                }
                if (z2 && m89168bg(mo85780zx)) {
                    C7304Kg.m89221bg(mo85780zx);
                    C7304Kg.m89223bX();
                    m89217IL(list);
                }
                eqN();
                this.eqN.set(false);
                this.f15822Kg.set(System.currentTimeMillis());
                m89173VB();
                return;
            }
            this.eqN.set(false);
            m89214bg(109);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: IL */
    public void m89175IL(boolean z) {
        this.ldr.set(z);
    }
}
