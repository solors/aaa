package com.bytedance.sdk.openadsdk.eqN.p344bg;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.bg.yDt */
/* loaded from: classes3.dex */
public class C9256yDt {

    /* renamed from: bg */
    public static C9256yDt f20687bg = new C9256yDt();

    /* renamed from: IL */
    private C9257bg f20688IL;

    /* renamed from: bX */
    private final Map<String, C9257bg> f20689bX = new HashMap();
    private volatile boolean eqN;

    /* renamed from: com.bytedance.sdk.openadsdk.eqN.bg.yDt$bg */
    /* loaded from: classes3.dex */
    public static class C9257bg {

        /* renamed from: IL */
        private final int f20690IL;

        /* renamed from: bg */
        private final int f20691bg;

        public C9257bg(int i, int i2) {
            this.f20691bg = (i < 0 || i > 5) ? 3 : 3;
            this.f20690IL = i2 < 10 ? 30 : i2;
        }

        /* renamed from: IL */
        public int m83278IL() {
            return this.f20690IL;
        }

        /* renamed from: bg */
        public int m83277bg() {
            return this.f20691bg;
        }
    }

    /* renamed from: IL */
    private int m83286IL() {
        C9257bg c9257bg = this.f20688IL;
        if (c9257bg != null) {
            return c9257bg.m83277bg();
        }
        return 3;
    }

    /* renamed from: bX */
    private int m83284bX() {
        C9257bg c9257bg = this.f20688IL;
        if (c9257bg != null) {
            return c9257bg.m83278IL();
        }
        return 30;
    }

    /* renamed from: bg */
    public void m83282bg(C9257bg c9257bg) {
        this.f20688IL = c9257bg;
    }

    /* renamed from: bg */
    public void m83280bg(String str, C9257bg c9257bg) {
        if (TextUtils.isEmpty(str) || c9257bg == null) {
            return;
        }
        this.f20689bX.put(str, c9257bg);
    }

    /* renamed from: IL */
    public int m83285IL(String str) {
        C9257bg c9257bg = this.f20689bX.get(str);
        if (c9257bg == null) {
            return m83284bX();
        }
        return c9257bg.m83278IL();
    }

    /* renamed from: bg */
    public int m83281bg(String str) {
        if (m83283bg()) {
            C9257bg c9257bg = this.f20689bX.get(str);
            if (c9257bg == null) {
                return m83286IL();
            }
            return c9257bg.m83277bg();
        }
        return 4;
    }

    /* renamed from: bg */
    public boolean m83283bg() {
        return this.eqN;
    }

    /* renamed from: bg */
    public void m83279bg(boolean z) {
        this.eqN = z;
    }
}
