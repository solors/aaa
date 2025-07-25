package com.bytedance.sdk.openadsdk.ldr;

import com.bytedance.sdk.openadsdk.core.C8879bX;
import com.bytedance.sdk.openadsdk.core.C9095yDt;
import com.bytedance.sdk.openadsdk.p284Fy.C7862bg;
import com.ironsource.C21114v8;
import com.maticoo.sdk.utils.constant.KeyConstants;

/* renamed from: com.bytedance.sdk.openadsdk.ldr.bg */
/* loaded from: classes3.dex */
public class C9305bg {

    /* renamed from: bg */
    private static volatile C9305bg f20791bg;

    /* renamed from: IL */
    private boolean f20792IL;

    /* renamed from: Kg */
    private int[] f20793Kg;

    /* renamed from: Lq */
    private int f20794Lq;

    /* renamed from: PX */
    private int[] f20795PX;

    /* renamed from: Ta */
    private boolean f20796Ta;

    /* renamed from: VB */
    private boolean f20797VB;

    /* renamed from: WR */
    private int[] f20798WR;

    /* renamed from: bX */
    private boolean f20799bX;

    /* renamed from: eo */
    private boolean f20800eo;
    private boolean eqN;

    /* renamed from: iR */
    private int[] f20801iR;
    private int[] ldr;

    /* renamed from: vb */
    private boolean f20802vb;
    private boolean xxp;
    private boolean yDt;

    /* renamed from: zx */
    private int[] f20803zx;

    private C9305bg() {
        m83121IL();
    }

    /* renamed from: Lq */
    public boolean m83114Lq() {
        return this.f20797VB;
    }

    /* renamed from: PX */
    public int[] m83113PX() {
        return this.f20793Kg;
    }

    /* renamed from: Ta */
    public int[] m83112Ta() {
        return this.f20798WR;
    }

    /* renamed from: VB */
    public int[] m83111VB() {
        return this.f20801iR;
    }

    public boolean VzQ() {
        return this.xxp;
    }

    /* renamed from: eo */
    public int[] m83096eo() {
        return this.ldr;
    }

    /* renamed from: vb */
    public int[] m83093vb() {
        return this.f20795PX;
    }

    public boolean xxp() {
        return this.f20796Ta;
    }

    public boolean yDt() {
        return this.f20800eo;
    }

    /* renamed from: Kg */
    public boolean m83116Kg() {
        return this.eqN;
    }

    /* renamed from: WR */
    public int[] m83110WR() {
        return this.f20803zx;
    }

    /* renamed from: iR */
    public boolean m83095iR() {
        return this.f20799bX;
    }

    public int eqN() {
        return this.f20794Lq;
    }

    public boolean ldr() {
        return this.f20792IL;
    }

    /* renamed from: zx */
    public boolean m83092zx() {
        return this.f20802vb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bX */
    public int[] m83104bX(String[] strArr) {
        int length = strArr.length;
        int[] iArr = new int[length];
        int i = 0;
        for (String str : strArr) {
            try {
                int parseInt = Integer.parseInt(str);
                iArr[i] = parseInt;
                if (parseInt > 0) {
                    i++;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (i != length) {
            int[] iArr2 = new int[i];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            return iArr2;
        }
        return iArr;
    }

    /* renamed from: IL */
    public void m83121IL() {
        C9095yDt.m83552IL().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ldr.bg.1
            @Override // java.lang.Runnable
            public void run() {
                C9305bg.this.yDt = C7862bg.m87502bg("feature_switch", false);
                if (!C9305bg.this.yDt) {
                    return;
                }
                try {
                    C9305bg.this.xxp = C7862bg.m87502bg("exclude_banner_native", false);
                    C9305bg.this.f20794Lq = C7862bg.m87505bg("feature_timer_interval", 10000);
                    C9305bg.this.f20802vb = C7862bg.m87502bg("enable_feature_cids", true);
                    String[] split = C7862bg.m87504bg("pag_ad_show_cnt", "1,3,5&session").split(C21114v8.C21123i.f54135c);
                    String[] split2 = C7862bg.m87504bg("pag_ad_click_cnt", "1,3,5&session").split(C21114v8.C21123i.f54135c);
                    String[] split3 = C7862bg.m87504bg("pag_video_play_cnt", "1,3,5&session").split(C21114v8.C21123i.f54135c);
                    String[] split4 = C7862bg.m87504bg("pag_dislike_cnt", "1,3,5session").split(",");
                    C9305bg c9305bg = C9305bg.this;
                    c9305bg.f20792IL = c9305bg.m83097bg(split);
                    C9305bg c9305bg2 = C9305bg.this;
                    c9305bg2.f20799bX = c9305bg2.m83097bg(split2);
                    C9305bg c9305bg3 = C9305bg.this;
                    c9305bg3.eqN = c9305bg3.m83097bg(split3);
                    C9305bg c9305bg4 = C9305bg.this;
                    c9305bg4.f20803zx = c9305bg4.m83117IL(split);
                    C9305bg c9305bg5 = C9305bg.this;
                    c9305bg5.ldr = c9305bg5.m83117IL(split2);
                    C9305bg c9305bg6 = C9305bg.this;
                    c9305bg6.f20801iR = c9305bg6.m83117IL(split3);
                    C9305bg c9305bg7 = C9305bg.this;
                    c9305bg7.f20795PX = c9305bg7.m83104bX(split4);
                    String[] split5 = C7862bg.m87504bg("pag_landingPage_stay_time", "1,3,5&session").split(C21114v8.C21123i.f54135c);
                    String[] split6 = C7862bg.m87504bg("pag_video_stay_time", "1,3,5&session").split(C21114v8.C21123i.f54135c);
                    C9305bg c9305bg8 = C9305bg.this;
                    c9305bg8.f20800eo = c9305bg8.m83097bg(split5);
                    C9305bg c9305bg9 = C9305bg.this;
                    c9305bg9.f20797VB = c9305bg9.m83097bg(split6);
                    C9305bg c9305bg10 = C9305bg.this;
                    c9305bg10.f20793Kg = c9305bg10.m83117IL(split5);
                    C9305bg c9305bg11 = C9305bg.this;
                    c9305bg11.f20798WR = c9305bg11.m83117IL(split6);
                    C9305bg.this.f20796Ta = C7862bg.m87502bg("pag_video_30p_session", true);
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IL */
    public int[] m83117IL(String[] strArr) {
        return strArr.length > 0 ? m83104bX(strArr[0].split(",")) : new int[0];
    }

    /* renamed from: bg */
    public static C9305bg m83103bg() {
        if (f20791bg == null) {
            synchronized (C8879bX.class) {
                if (f20791bg == null) {
                    f20791bg = new C9305bg();
                }
            }
        }
        return f20791bg;
    }

    /* renamed from: bX */
    public boolean m83108bX() {
        return this.yDt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bg */
    public boolean m83097bg(String[] strArr) {
        if (strArr.length == 2) {
            return KeyConstants.RequestBody.KEY_SESSION.equals(strArr[1]);
        }
        if (strArr.length == 1) {
            return KeyConstants.RequestBody.KEY_SESSION.equals(strArr[0]);
        }
        return false;
    }
}
