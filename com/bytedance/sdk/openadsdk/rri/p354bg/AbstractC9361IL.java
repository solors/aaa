package com.bytedance.sdk.openadsdk.rri.p354bg;

import android.view.View;
import androidx.core.view.InputDeviceCompat;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import com.bytedance.sdk.openadsdk.rri.p354bg.C9370zx;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.sdk.openadsdk.rri.bg.IL */
/* loaded from: classes3.dex */
public abstract class AbstractC9361IL {

    /* renamed from: IL */
    protected AbstractC8967tuV f20883IL;

    /* renamed from: Kg */
    private final Integer f20884Kg;

    /* renamed from: WR */
    private volatile boolean f20885WR = false;

    /* renamed from: bX */
    protected final AtomicBoolean f20886bX;

    /* renamed from: bg */
    protected WeakReference<View> f20887bg;
    private final AtomicLong eqN;

    /* renamed from: iR */
    private final int f20888iR;
    private final C9370zx.C9371bg ldr;

    /* renamed from: zx */
    private final AtomicBoolean f20889zx;

    public AbstractC9361IL(Integer num, View view, AbstractC8967tuV abstractC8967tuV, int i, C9370zx.C9371bg c9371bg) {
        this.f20884Kg = num;
        this.f20888iR = i;
        this.f20883IL = abstractC8967tuV;
        this.ldr = c9371bg;
        m82942bg(view);
        this.f20886bX = new AtomicBoolean(false);
        this.eqN = new AtomicLong(-1L);
        this.f20889zx = new AtomicBoolean(false);
    }

    /* renamed from: bg */
    public static AbstractC9361IL m82941bg(boolean z, Integer num, View view, AbstractC8967tuV abstractC8967tuV, C9370zx.C9371bg c9371bg) {
        return z ? new C9362Kg(num, view, abstractC8967tuV, c9371bg) : new C9363bX(num, view, abstractC8967tuV, c9371bg);
    }

    /* renamed from: IL */
    public int m82948IL() {
        View view;
        boolean z;
        if (m82944WR()) {
            return 1;
        }
        WeakReference<View> weakReference = this.f20887bg;
        if (weakReference != null) {
            view = weakReference.get();
        } else {
            view = null;
        }
        if (view == null || this.f20885WR) {
            return 3;
        }
        if (!m82945VB().equals(view.getTag(InputDeviceCompat.SOURCE_HDMI))) {
            m82940eo();
            C9370zx.m82922IL(m82945VB());
            return 3;
        }
        if (m82945VB().equals(view.getTag(InputDeviceCompat.SOURCE_HDMI)) && mo82933bX()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 1;
        }
        return 2;
    }

    /* renamed from: IL */
    protected abstract void mo82935IL(int i);

    /* renamed from: Kg */
    public void m82947Kg() {
        this.eqN.set(-1L);
    }

    /* renamed from: PX */
    public boolean mo82937PX() {
        return this.f20886bX.get();
    }

    /* renamed from: Ta */
    public void m82946Ta() {
        this.f20886bX.set(false);
        m82947Kg();
    }

    /* renamed from: VB */
    public Integer m82945VB() {
        return this.f20884Kg;
    }

    /* renamed from: WR */
    public boolean m82944WR() {
        return this.f20889zx.get();
    }

    /* renamed from: bX */
    protected abstract boolean mo82933bX();

    /* renamed from: eo */
    public void m82940eo() {
        this.f20885WR = true;
        C9367iR.m82929IL(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void eqN() {
        if (this.f20889zx.compareAndSet(false, true)) {
            C9365eqN.m82931bg(this.f20883IL, m82938zx(), this.ldr);
        }
    }

    /* renamed from: iR */
    public void m82939iR() {
        if (m82944WR()) {
            return;
        }
        if (!this.f20886bX.get()) {
            m82947Kg();
        } else if (!this.eqN.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.eqN.get() >= this.f20888iR) {
            eqN();
        }
    }

    public abstract int ldr();

    /* renamed from: zx */
    protected C9364bg m82938zx() {
        WeakReference<View> weakReference = this.f20887bg;
        if (weakReference == null) {
            return new C9364bg(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        if (view == null) {
            return new C9364bg(0, 0, 0.0f);
        }
        return new C9364bg(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    /* renamed from: bg */
    public void mo82936bg() {
        if (this.f20886bX.compareAndSet(false, true)) {
            C9367iR.m82927bg(this);
        }
    }

    /* renamed from: bg */
    public void m82943bg(int i) {
        if (i == 4) {
            mo82936bg();
        } else if (i == 8) {
            m82946Ta();
        } else if (i == 9) {
            eqN();
        } else {
            mo82935IL(i);
        }
    }

    /* renamed from: bg */
    public void m82942bg(View view) {
        if (view != null) {
            view.setTag(InputDeviceCompat.SOURCE_HDMI, m82945VB());
        }
        this.f20887bg = new WeakReference<>(view);
    }
}
