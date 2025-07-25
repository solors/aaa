package com.bytedance.sdk.component.ldr.p261bg;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg;
import com.bytedance.sdk.component.ldr.p261bg.p262IL.p263IL.C7644IL;
import com.bytedance.sdk.component.ldr.p261bg.p262IL.p263IL.C7645bg;
import com.bytedance.sdk.component.ldr.p261bg.p262IL.p264bX.HandlerThreadC7648bX;
import com.bytedance.sdk.component.ldr.p261bg.p266bX.C7662bg;
import com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.C7693zx;
import com.bytedance.sdk.component.ldr.p261bg.p274zx.AbstractRunnableC7729zx;
import com.bytedance.sdk.component.utils.C7748VzQ;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioiic.C32664c2oc2i;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.sdk.component.ldr.bg.eqN */
/* loaded from: classes3.dex */
public class C7697eqN {

    /* renamed from: bg */
    public static final C7697eqN f16840bg = new C7697eqN();

    /* renamed from: bX */
    private boolean m88020bX() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: IL */
    private void m88023IL(C7663bg c7663bg, Context context) {
        C7660bX.m88150bg(context, "context == null");
        C7660bX.m88150bg(c7663bg, "AdLogConfig == null");
        C7660bX.m88150bg(c7663bg.eqN(), "AdLogDepend ==null");
    }

    /* renamed from: IL */
    public void m88025IL() {
        final InterfaceC7724zx m88153vb = C7659Kg.m88154iR().m88153vb();
        if (m88153vb == null || C7659Kg.m88154iR().ldr() == null || m88153vb.eqN() == null) {
            return;
        }
        if (C7659Kg.m88154iR().m88177IL()) {
            if (m88017bg(C7659Kg.m88154iR().ldr(), m88153vb)) {
                C7659Kg.m88154iR().m88170VB();
                return;
            } else if (m88020bX()) {
                m88153vb.eqN().execute(new AbstractRunnableC7729zx(C32664c2oc2i.c2oc2o) { // from class: com.bytedance.sdk.component.ldr.bg.eqN.3
                    {
                        C7697eqN.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        C7697eqN.this.m88024IL(m88153vb.ldr());
                    }
                });
                return;
            } else {
                m88024IL(m88153vb.ldr());
                return;
            }
        }
        C7659Kg.m88154iR().m88170VB();
    }

    /* renamed from: bg */
    public void m88015bg(C7663bg c7663bg, Context context) {
        m88023IL(c7663bg, context);
        C7659Kg.m88154iR().m88164bg(context);
        C7659Kg.m88154iR().m88163bg(c7663bg.m88104eo());
        C7659Kg.m88154iR().m88176IL(c7663bg.m88103iR());
        C7659Kg.m88154iR().m88167bX(c7663bg.m88119Kg());
        C7659Kg.m88154iR().m88161bg(c7663bg.m88123IL());
        C7659Kg.m88154iR().eqN(c7663bg.m88115WR());
        C7659Kg.m88154iR().m88151zx(c7663bg.ldr());
        C7659Kg.m88154iR().m88162bg(c7663bg.m88112bg() == null ? C7693zx.f16827bg : c7663bg.m88112bg());
        C7659Kg.m88154iR().m88175IL(c7663bg.m88116VB());
        C7659Kg.m88154iR().m88159bg(c7663bg.eqN());
        C7659Kg.m88154iR().m88156bg(c7663bg.m88114bX());
        C7659Kg.m88154iR().m88165bg(c7663bg.m88102zx());
        HandlerThreadC7648bX.m88256bg(c7663bg.m88117Ta());
        HandlerThreadC7648bX.m88266IL(c7663bg.m88118PX());
        m88016bg(c7663bg);
    }

    /* renamed from: IL */
    public void m88024IL(int i) {
        if (i == 0) {
            C7645bg.m88273IL();
        } else if (i == 1) {
            C7644IL.m88285IL();
        }
    }

    /* renamed from: IL */
    private void m88022IL(final InterfaceC7706bg interfaceC7706bg) {
        final InterfaceC7724zx m88153vb = C7659Kg.m88154iR().m88153vb();
        if (interfaceC7706bg == null || m88153vb == null || C7659Kg.m88154iR().ldr() == null || m88153vb.eqN() == null) {
            return;
        }
        if (C7659Kg.m88154iR().m88177IL()) {
            if (m88017bg(C7659Kg.m88154iR().ldr(), m88153vb)) {
                C7659Kg.m88154iR().m88160bg(interfaceC7706bg);
                return;
            }
            m88020bX();
            if (m88020bX()) {
                m88153vb.eqN().execute(new AbstractRunnableC7729zx("dispatchEvent") { // from class: com.bytedance.sdk.component.ldr.bg.eqN.4
                    {
                        C7697eqN.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        C7697eqN.this.m88013bg(interfaceC7706bg, m88153vb.ldr());
                    }
                });
                return;
            } else {
                m88013bg(interfaceC7706bg, m88153vb.ldr());
                return;
            }
        }
        C7659Kg.m88154iR().m88160bg(interfaceC7706bg);
    }

    /* renamed from: bg */
    private void m88016bg(C7663bg c7663bg) {
        Executor mo83352zx;
        if (Looper.myLooper() != Looper.getMainLooper() && C7662bg.m88147IL()) {
            C7662bg.m88138bg();
            return;
        }
        InterfaceC7724zx eqN = c7663bg.eqN();
        if (eqN == null || !C7662bg.m88147IL() || (mo83352zx = eqN.mo83352zx()) == null) {
            return;
        }
        mo83352zx.execute(new Runnable() { // from class: com.bytedance.sdk.component.ldr.bg.eqN.1
            {
                C7697eqN.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                C7662bg.m88138bg();
            }
        });
    }

    /* renamed from: bg */
    public void m88004bg(boolean z) {
        C7659Kg.m88154iR().m88156bg(z);
    }

    /* renamed from: bg */
    private boolean m88017bg(Context context, InterfaceC7724zx interfaceC7724zx) {
        if (context == null || interfaceC7724zx == null) {
            return false;
        }
        if (interfaceC7724zx.ldr() == 2) {
            return true;
        }
        if (interfaceC7724zx.ldr() == 1) {
            return interfaceC7724zx.yDt();
        }
        try {
            return C7748VzQ.m87853bg(context);
        } catch (Throwable th) {
            th.getMessage();
            return true;
        }
    }

    /* renamed from: bg */
    public void m88019bg() {
        final InterfaceC7724zx m88153vb = C7659Kg.m88154iR().m88153vb();
        if (m88153vb == null || C7659Kg.m88154iR().ldr() == null || m88153vb.eqN() == null) {
            return;
        }
        if (C7659Kg.m88154iR().m88177IL()) {
            if (m88017bg(C7659Kg.m88154iR().ldr(), m88153vb)) {
                C7659Kg.m88154iR().m88169WR();
                return;
            } else if (m88020bX()) {
                m88153vb.eqN().execute(new AbstractRunnableC7729zx("start") { // from class: com.bytedance.sdk.component.ldr.bg.eqN.2
                    {
                        C7697eqN.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        C7697eqN.this.m88018bg(m88153vb.ldr());
                    }
                });
                return;
            } else {
                m88018bg(m88153vb.ldr());
                return;
            }
        }
        C7659Kg.m88154iR().m88169WR();
    }

    /* renamed from: bg */
    public void m88018bg(int i) {
        if (i == 0) {
            C7645bg.m88271bg();
        } else if (i == 1) {
            C7644IL.m88283bg();
        }
    }

    /* renamed from: bg */
    public void m88014bg(InterfaceC7706bg interfaceC7706bg) {
        m88022IL(interfaceC7706bg);
    }

    /* renamed from: bg */
    public void m88013bg(InterfaceC7706bg interfaceC7706bg, int i) {
        if (i == 0) {
            C7645bg.m88270bg(interfaceC7706bg);
        } else if (i == 1) {
            C7644IL.m88276bg(interfaceC7706bg);
        }
    }

    /* renamed from: bg */
    public void m88006bg(final String str, final List<String> list, final boolean z, Map<String, String> map, final int i, final String str2) {
        final InterfaceC7724zx m88153vb = C7659Kg.m88154iR().m88153vb();
        if (m88153vb == null || C7659Kg.m88154iR().ldr() == null || m88153vb.eqN() == null) {
            return;
        }
        if (m88153vb.mo83368Kg()) {
            if (m88153vb.ldr() == 1) {
                if (list == null || list.isEmpty()) {
                    return;
                }
            } else if (m88153vb.ldr() == 0 && (TextUtils.isEmpty(str) || list == null || list.isEmpty())) {
                return;
            }
            if (C7659Kg.m88154iR().m88177IL() && !m88017bg(C7659Kg.m88154iR().ldr(), m88153vb)) {
                if (m88020bX()) {
                    m88153vb.eqN().execute(new AbstractRunnableC7729zx("trackFailed") { // from class: com.bytedance.sdk.component.ldr.bg.eqN.5
                        {
                            C7697eqN.this = this;
                        }

                        @Override // java.lang.Runnable
                        public void run() {
                            C7697eqN.this.m88007bg(str, list, z, m88153vb.ldr(), i, str2);
                        }
                    });
                    return;
                } else {
                    m88007bg(str, list, z, m88153vb.ldr(), i, str2);
                    return;
                }
            }
            C7659Kg.m88154iR().m88158bg(str, list, z, map, i, str2);
        }
    }

    /* renamed from: bg */
    public void m88007bg(String str, List<String> list, boolean z, int i, int i2, String str2) {
        if (i == 0) {
            C7645bg.m88268bg(str, list, z);
        } else if (i == 1) {
            C7644IL.m88275bg(str, list, z, i2, str2);
        }
    }

    /* renamed from: bg */
    public void m88005bg(final String str, final boolean z) {
        final InterfaceC7724zx m88153vb = C7659Kg.m88154iR().m88153vb();
        if (m88153vb == null || C7659Kg.m88154iR().ldr() == null || m88153vb.eqN() == null || !m88153vb.mo83368Kg()) {
            return;
        }
        if (m88153vb.ldr() == 0 && TextUtils.isEmpty(str)) {
            return;
        }
        if (C7659Kg.m88154iR().m88177IL() && !m88017bg(C7659Kg.m88154iR().ldr(), m88153vb)) {
            if (m88020bX()) {
                m88153vb.eqN().execute(new AbstractRunnableC7729zx("trackFailed") { // from class: com.bytedance.sdk.component.ldr.bg.eqN.6
                    {
                        C7697eqN.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        C7697eqN.this.m88008bg(str, m88153vb.ldr(), z);
                    }
                });
                return;
            } else {
                m88008bg(str, m88153vb.ldr(), z);
                return;
            }
        }
        C7659Kg.m88154iR().m88157bg(str, z);
    }

    /* renamed from: bg */
    public void m88008bg(String str, int i, boolean z) {
        if (i == 0) {
            C7645bg.m88269bg(str);
        } else if (i == 1) {
            C7644IL.m88274bg(str, z);
        }
    }
}
