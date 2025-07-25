package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.core.widget.tuV */
/* loaded from: classes3.dex */
public class C9081tuV {

    /* renamed from: VB */
    private boolean f20271VB;

    /* renamed from: bg */
    private final InterfaceC9083bg f20274bg;
    private float eqN;

    /* renamed from: iR */
    private int f20276iR;
    private int ldr;

    /* renamed from: zx */
    private float f20277zx;

    /* renamed from: IL */
    private final boolean f20269IL = false;

    /* renamed from: bX */
    private boolean f20273bX = false;

    /* renamed from: Kg */
    private boolean f20270Kg = true;

    /* renamed from: WR */
    private boolean f20272WR = false;

    /* renamed from: eo */
    private final View.OnTouchListener f20275eo = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.tuV.1
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (C9081tuV.this.f20274bg.rri()) {
                if (!C9081tuV.this.f20273bX) {
                    return true;
                }
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 3) {
                        C9081tuV.this.f20271VB = false;
                    }
                } else {
                    if (Math.abs(x - C9081tuV.this.ldr) > 20.0f || Math.abs(y - C9081tuV.this.f20276iR) > 20.0f) {
                        C9081tuV.this.f20270Kg = false;
                    }
                    C9081tuV.this.f20270Kg = true;
                    C9081tuV.this.f20272WR = false;
                    C9081tuV.this.eqN = 0.0f;
                    C9081tuV.this.f20277zx = 0.0f;
                    C9081tuV.this.ldr = 0;
                    if (C9081tuV.this.f20274bg != null) {
                        C9081tuV.this.f20274bg.mo83603bg(view, C9081tuV.this.f20270Kg);
                    }
                    C9081tuV.this.f20271VB = false;
                }
            } else {
                C9081tuV c9081tuV = C9081tuV.this;
                c9081tuV.f20271VB = c9081tuV.m83612bg(motionEvent);
                C9081tuV.this.eqN = x;
                C9081tuV.this.f20277zx = y;
                C9081tuV.this.ldr = (int) x;
                C9081tuV.this.f20276iR = (int) y;
                C9081tuV.this.f20270Kg = true;
                if (C9081tuV.this.f20274bg != null && C9081tuV.this.f20273bX) {
                    C9081tuV.this.f20274bg.mo83603bg(view, true);
                }
            }
            if (!C9081tuV.this.f20273bX) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.tuV$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC9083bg {
        /* renamed from: bg */
        void mo83603bg(View view, boolean z);

        boolean rri();
    }

    public C9081tuV(InterfaceC9083bg interfaceC9083bg) {
        this.f20274bg = interfaceC9083bg;
    }

    /* renamed from: bg */
    public void m83611bg(View view) {
        if (view != null) {
            view.setOnTouchListener(this.f20275eo);
        }
    }

    /* renamed from: bg */
    public void m83605bg(boolean z) {
        this.f20273bX = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bg */
    public boolean m83612bg(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            int m82538bX = ZQc.m82538bX(C8838VzQ.m84740bg().getApplicationContext());
            int eqN = ZQc.eqN(C8838VzQ.m84740bg().getApplicationContext());
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float f = m82538bX;
            if (rawX <= f * 0.01f || rawX >= f * 0.99f) {
                return true;
            }
            float f2 = eqN;
            return rawY <= 0.01f * f2 || rawY >= f2 * 0.99f;
        }
        return false;
    }
}
