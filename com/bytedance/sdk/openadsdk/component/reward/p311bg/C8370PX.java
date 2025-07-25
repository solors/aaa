package com.bytedance.sdk.openadsdk.component.reward.p311bg;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.component.utils.JAA;
import com.bytedance.sdk.openadsdk.activity.AbstractC8067ldr;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.bg.PX */
/* loaded from: classes3.dex */
public class C8370PX {

    /* renamed from: IL */
    private final C8396bg f18339IL;

    /* renamed from: bX */
    private boolean f18340bX = true;

    /* renamed from: bg */
    protected int f18341bg;
    private AbstractView$OnLayoutChangeListenerC8375bg eqN;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.sdk.openadsdk.component.reward.bg.PX$bg */
    /* loaded from: classes3.dex */
    public static abstract class AbstractView$OnLayoutChangeListenerC8375bg implements View.OnLayoutChangeListener {

        /* renamed from: IL */
        private int f18348IL;

        /* renamed from: bg */
        private int f18349bg;

        private AbstractView$OnLayoutChangeListenerC8375bg() {
        }

        /* renamed from: bg */
        abstract void mo86362bg(int i, int i2);

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 != this.f18349bg || i10 != this.f18348IL) {
                this.f18349bg = i9;
                this.f18348IL = i10;
                mo86362bg(i9, i10);
            }
        }
    }

    public C8370PX(C8396bg c8396bg) {
        this.f18341bg = 0;
        this.f18339IL = c8396bg;
        m86367bX();
        if (c8396bg.f18431bg == 2) {
            return;
        }
        try {
            this.f18341bg = ZQc.eqN(c8396bg.f18441uu, ZQc.m82534bg());
            if (!c8396bg.f18441uu.getWindow().hasFeature(1)) {
                c8396bg.f18441uu.requestWindowFeature(1);
            }
            c8396bg.f18441uu.getWindow().addFlags(16777344);
            if (c8396bg.GvG == 2 || !ZQc.m82539bX(c8396bg.f18441uu)) {
                c8396bg.f18441uu.getWindow().addFlags(1024);
            }
        } catch (Throwable th) {
            Log.e("TTAD.RFSM", "init: ", th);
        }
    }

    /* renamed from: bX */
    private void m86367bX() {
        C8396bg c8396bg = this.f18339IL;
        c8396bg.f18437lM = c8396bg.f18412IL.mo84004jf();
        if (26 == Build.VERSION.SDK_INT) {
            if (this.f18339IL.f18441uu.getResources().getConfiguration().orientation == 1) {
                this.f18339IL.GvG = 1;
                return;
            } else {
                this.f18339IL.GvG = 2;
                return;
            }
        }
        C8396bg c8396bg2 = this.f18339IL;
        c8396bg2.GvG = c8396bg2.f18412IL.xFs();
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private void eqN() {
        C8396bg c8396bg = this.f18339IL;
        if (c8396bg.GvG == 2) {
            if (c8396bg.bCU) {
                m86366bg(c8396bg.f18441uu, 8);
                return;
            } else {
                m86366bg(c8396bg.f18441uu, 0);
                return;
            }
        }
        m86366bg(c8396bg.f18441uu, 1);
    }

    private float ldr() {
        return ZQc.eqN(this.f18339IL.f18441uu, ZQc.m82540WR(this.f18339IL.f18441uu));
    }

    /* renamed from: zx */
    private float m86363zx() {
        return ZQc.eqN(this.f18339IL.f18441uu, ZQc.m82510eo(this.f18339IL.f18441uu));
    }

    /* renamed from: IL */
    public void mo86360IL(JAA jaa) {
        try {
            AbstractC8067ldr abstractC8067ldr = this.f18339IL.f18436kU;
            if (abstractC8067ldr == null || abstractC8067ldr.f17645WR <= 0) {
                final boolean z = true;
                final boolean z2 = this.f18340bX && C8838VzQ.eqN().ZQc() == 1;
                if (!this.f18340bX || !ZQc.m82539bX(this.f18339IL.f18441uu)) {
                    z = false;
                }
                if (z || z2) {
                    if (this.eqN == null) {
                        this.eqN = new AbstractView$OnLayoutChangeListenerC8375bg() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.PX.2

                            /* renamed from: bg */
                            boolean f18345bg;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super();
                            }

                            /* JADX WARN: Removed duplicated region for block: B:28:0x00e9 A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x001f, B:8:0x006a, B:10:0x0088, B:12:0x0097, B:14:0x00ab, B:15:0x00af, B:26:0x00e3, B:28:0x00e9, B:29:0x00ee, B:31:0x00fc, B:16:0x00b2, B:18:0x00bc, B:20:0x00d0, B:22:0x00d4, B:23:0x00da, B:25:0x00de, B:33:0x0102, B:35:0x0106, B:7:0x0045), top: B:38:0x0000 }] */
                            /* JADX WARN: Removed duplicated region for block: B:31:0x00fc A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:2:0x0000, B:4:0x000b, B:6:0x001f, B:8:0x006a, B:10:0x0088, B:12:0x0097, B:14:0x00ab, B:15:0x00af, B:26:0x00e3, B:28:0x00e9, B:29:0x00ee, B:31:0x00fc, B:16:0x00b2, B:18:0x00bc, B:20:0x00d0, B:22:0x00d4, B:23:0x00da, B:25:0x00de, B:33:0x0102, B:35:0x0106, B:7:0x0045), top: B:38:0x0000 }] */
                            /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
                            @Override // com.bytedance.sdk.openadsdk.component.reward.p311bg.C8370PX.AbstractView$OnLayoutChangeListenerC8375bg
                            /* renamed from: bg */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            void mo86362bg(int r7, int r8) {
                                /*
                                    Method dump skipped, instructions count: 269
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.p311bg.C8370PX.C83722.mo86362bg(int, int):void");
                            }
                        };
                    }
                    this.f18339IL.f18441uu.getWindow().getDecorView().addOnLayoutChangeListener(this.eqN);
                }
                this.f18340bX = false;
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: bg */
    public void mo86357bg(JAA jaa) {
        if (jaa == null) {
            return;
        }
        jaa.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.PX.1
            @Override // java.lang.Runnable
            public void run() {
                View findViewById;
                try {
                    View decorView = C8370PX.this.f18339IL.f18441uu.getWindow().getDecorView();
                    if (decorView != null && (findViewById = decorView.findViewById(16908335)) != null) {
                        findViewById.setVisibility(8);
                    }
                } catch (Exception unused) {
                }
            }
        }, 300L);
    }

    /* renamed from: bg */
    public void m86364bg(boolean z) {
        float min;
        float max;
        int max2;
        int i;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 != 26) {
            if (i3 == 27) {
                try {
                    eqN();
                } catch (Throwable unused) {
                }
            } else {
                eqN();
            }
        }
        float m86363zx = m86363zx();
        float ldr = ldr();
        if (this.f18339IL.GvG == 2) {
            min = Math.max(m86363zx, ldr);
            max = Math.min(m86363zx, ldr);
        } else {
            min = Math.min(m86363zx, ldr);
            max = Math.max(m86363zx, ldr);
        }
        Activity activity = this.f18339IL.f18441uu;
        int eqN = ZQc.eqN(activity, ZQc.m82534bg());
        if (this.f18339IL.GvG != 2) {
            if (ZQc.m82539bX(activity)) {
                max -= eqN;
            }
        } else if (ZQc.m82539bX(activity)) {
            min -= eqN;
        }
        if (z) {
            C8396bg c8396bg = this.f18339IL;
            c8396bg.gXn = (int) min;
            c8396bg.f18411GZ = (int) max;
            return;
        }
        C8396bg c8396bg2 = this.f18339IL;
        int i4 = 20;
        if (c8396bg2.GvG != 2) {
            float f = c8396bg2.f18437lM;
            if (f != 0.0f && f != 100.0f) {
                i = (int) Math.max((max - (((min - 20.0f) - 20.0f) / f)) / 2.0f, 0.0f);
                i2 = i;
                max2 = 20;
            }
            i4 = 0;
            max2 = 0;
            i = 0;
            i2 = 0;
        } else {
            float f2 = c8396bg2.f18437lM;
            if (f2 != 0.0f && f2 != 100.0f) {
                max2 = (int) Math.max((min - (((max - 20.0f) - 20.0f) * f2)) / 2.0f, 0.0f);
                i = 20;
                i2 = 20;
                i4 = max2;
            }
            i4 = 0;
            max2 = 0;
            i = 0;
            i2 = 0;
        }
        C8396bg c8396bg3 = this.f18339IL;
        float f3 = i4;
        float f4 = max2;
        c8396bg3.gXn = (int) ((min - f3) - f4);
        float f5 = i;
        float f6 = i2;
        c8396bg3.f18411GZ = (int) ((max - f5) - f6);
        activity.getWindow().getDecorView().setPadding(ZQc.m82537bX(activity, f3), ZQc.m82537bX(activity, f5), ZQc.m82537bX(activity, f4), ZQc.m82537bX(activity, f6));
    }

    /* renamed from: IL */
    private float[] m86368IL(int i) {
        float ldr = ldr();
        float m86363zx = m86363zx();
        int i2 = this.f18339IL.GvG;
        if ((i2 == 1) != (ldr > m86363zx)) {
            float f = ldr + m86363zx;
            m86363zx = f - m86363zx;
            ldr = f - m86363zx;
        }
        if (i2 == 1) {
            ldr -= i;
        } else {
            m86363zx -= i;
        }
        return new float[]{m86363zx, ldr};
    }

    /* renamed from: IL */
    public void mo86361IL() {
        if (this.eqN != null) {
            this.f18339IL.f18441uu.getWindow().getDecorView().removeOnLayoutChangeListener(this.eqN);
            this.eqN = null;
        }
    }

    /* renamed from: bg */
    public float[] mo86358bg(int i) {
        float[] fArr = new float[2];
        Activity activity = this.f18339IL.f18441uu;
        View decorView = activity.getWindow().getDecorView();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35 && this.f18339IL.f18412IL.mo84004jf() == 100.0f) {
            fArr[0] = decorView.getWidth() - decorView.getPaddingLeft();
            fArr[1] = decorView.getHeight() - decorView.getPaddingTop();
        } else {
            fArr[0] = decorView.getWidth() - (decorView.getPaddingLeft() * 2);
            fArr[1] = decorView.getHeight() - (decorView.getPaddingTop() * 2);
        }
        fArr[0] = ZQc.eqN(activity, fArr[0]);
        float eqN = ZQc.eqN(activity, fArr[1]);
        fArr[1] = eqN;
        if (fArr[0] < 10.0f || eqN < 10.0f) {
            fArr = m86368IL(this.f18341bg);
        }
        if (i2 != 26 && i2 != 27 && activity.getResources() != null && activity.getResources().getConfiguration() != null) {
            if ((activity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i) {
                if (i == 2) {
                    float f = fArr[0];
                    float f2 = fArr[1];
                    if (f < f2) {
                        fArr[1] = f;
                        fArr[0] = f2;
                    }
                } else {
                    float f3 = fArr[0];
                    float f4 = fArr[1];
                    if (f3 > f4) {
                        fArr[1] = f3;
                        fArr[0] = f4;
                    }
                }
            }
        }
        return fArr;
    }

    /* renamed from: bg */
    public void mo86359bg() {
        ZQc.m82532bg(this.f18339IL.f18441uu);
        this.f18339IL.f18441uu.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.PX.3
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (C8370PX.this.f18339IL.f18441uu.isFinishing()) {
                            return;
                        }
                        C8370PX.this.f18339IL.f18441uu.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.bg.PX.3.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ZQc.m82532bg(C8370PX.this.f18339IL.f18441uu);
                            }
                        }, 2500L);
                    } catch (Exception e) {
                        C7741PX.m87873bg("TTAD.RFSM", e.getMessage());
                    }
                }
            }
        });
    }

    /* renamed from: bg */
    private static void m86366bg(Activity activity, int i) {
        if (activity.getRequestedOrientation() == i) {
            return;
        }
        activity.setRequestedOrientation(i);
    }
}
