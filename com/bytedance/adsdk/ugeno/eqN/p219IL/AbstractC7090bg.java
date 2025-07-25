package com.bytedance.adsdk.ugeno.eqN.p219IL;

import com.bytedance.adsdk.ugeno.eqN.C7086IL;
import com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import net.pubnative.lite.sdk.vpaid.enums.EventConstants;

/* renamed from: com.bytedance.adsdk.ugeno.eqN.IL.bg */
/* loaded from: classes3.dex */
public abstract class AbstractC7090bg {

    /* renamed from: bg */
    public static final HashSet<String> f15250bg = new HashSet<>(Arrays.asList("convert", "dislike", "openAppPermission", "openAppPolicy", "openPrivacy", "openAppFunction", "close", EventConstants.SKIP, "videoControl", "pauseVideo", "resumeVideo", "muteVideo"));

    /* renamed from: IL */
    protected C7086IL.C7087bg f15251IL;

    /* renamed from: bX */
    protected AbstractView$OnTouchListenerC6981bX f15252bX;
    protected String eqN;

    /* renamed from: iR */
    protected String f15253iR;
    protected Map<String, String> ldr;

    /* renamed from: zx */
    protected String f15254zx;

    /* renamed from: com.bytedance.adsdk.ugeno.eqN.IL.bg$bg */
    /* loaded from: classes3.dex */
    public static class C7091bg {
        /* renamed from: bg */
        public static AbstractC7090bg m90046bg(AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX, String str, C7086IL.C7087bg c7087bg) {
            if (c7087bg == null) {
                return null;
            }
            String m90053IL = c7087bg.m90053IL();
            if (AbstractC7090bg.f15250bg.contains(m90053IL)) {
                return new C7089bX(abstractView$OnTouchListenerC6981bX, str, c7087bg);
            }
            m90053IL.hashCode();
            if (!m90053IL.equals("update")) {
                if (!m90053IL.equals("emit")) {
                    return null;
                }
                return new C7088IL(abstractView$OnTouchListenerC6981bX, str, c7087bg);
            }
            return new C7092eqN(abstractView$OnTouchListenerC6981bX, str, c7087bg);
        }
    }

    public AbstractC7090bg(AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX, String str, C7086IL.C7087bg c7087bg) {
        this.f15252bX = abstractView$OnTouchListenerC6981bX;
        this.f15251IL = c7087bg;
        this.f15253iR = str;
        m90052IL();
    }

    /* renamed from: IL */
    private void m90052IL() {
        C7086IL.C7087bg c7087bg = this.f15251IL;
        if (c7087bg == null) {
            return;
        }
        this.eqN = c7087bg.m90049bg();
        this.f15254zx = this.f15251IL.m90053IL();
        this.ldr = this.f15251IL.m90050bX();
    }

    /* renamed from: bg */
    public abstract void mo90045bg();
}
