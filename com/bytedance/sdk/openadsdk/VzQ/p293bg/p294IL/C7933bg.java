package com.bytedance.sdk.openadsdk.VzQ.p293bg.p294IL;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.C8879bX;
import com.ironsource.C19577ad;

/* renamed from: com.bytedance.sdk.openadsdk.VzQ.bg.IL.bg */
/* loaded from: classes3.dex */
public class C7933bg {

    /* renamed from: IL */
    private static volatile C7933bg f17274IL;

    /* renamed from: bg */
    private String f17275bg = "";

    private C7933bg() {
    }

    /* renamed from: bg */
    public static C7933bg m87401bg() {
        if (f17274IL == null) {
            synchronized (C7933bg.class) {
                if (f17274IL == null) {
                    f17274IL = new C7933bg();
                }
            }
        }
        return f17274IL;
    }

    /* renamed from: IL */
    public String m87403IL() {
        if (C8838VzQ.eqN().DDQ(C19577ad.f49047D0)) {
            if (!TextUtils.isEmpty(this.f17275bg)) {
                return this.f17275bg;
            }
            String m84508IL = C8879bX.m84507bg(C8838VzQ.m84740bg()).m84508IL(C19577ad.f49047D0, "");
            this.f17275bg = m84508IL;
            return m84508IL;
        }
        return "";
    }

    /* renamed from: IL */
    public void m87402IL(String str) {
        this.f17275bg = str;
    }

    /* renamed from: bg */
    public static void m87400bg(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C8879bX.m84507bg(C8838VzQ.m84740bg()).m84504bg(C19577ad.f49047D0, str);
    }
}
