package com.bytedance.adsdk.ugeno.p214bg.p216bg;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.ugeno.bg.bg.bg */
/* loaded from: classes3.dex */
public abstract class AbstractC7049bg {

    /* renamed from: IL */
    protected AbstractView$OnTouchListenerC6981bX f15104IL;

    /* renamed from: bX */
    private String f15105bX;

    /* renamed from: bg */
    protected JSONObject f15106bg;

    /* renamed from: com.bytedance.adsdk.ugeno.bg.bg.bg$bg */
    /* loaded from: classes3.dex */
    public static class C7050bg {
        /* renamed from: bg */
        public static AbstractC7049bg m90188bg(AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX, JSONObject jSONObject) {
            if (abstractView$OnTouchListenerC6981bX == null || jSONObject == null) {
                return null;
            }
            String optString = jSONObject.optString("type");
            optString.hashCode();
            char c = 65535;
            switch (optString.hashCode()) {
                case -1881872635:
                    if (optString.equals("stretch")) {
                        c = 0;
                        break;
                    }
                    break;
                case -930826704:
                    if (optString.equals("ripple")) {
                        c = 1;
                        break;
                    }
                    break;
                case -920177947:
                    if (optString.equals("rub_in")) {
                        c = 2;
                        break;
                    }
                    break;
                case 109407595:
                    if (optString.equals("shine")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return new C7052zx(abstractView$OnTouchListenerC6981bX, jSONObject);
                case 1:
                    return new C7047IL(abstractView$OnTouchListenerC6981bX, jSONObject);
                case 2:
                    return new C7048bX(abstractView$OnTouchListenerC6981bX, jSONObject);
                case 3:
                    return new C7051eqN(abstractView$OnTouchListenerC6981bX, jSONObject);
                default:
                    return null;
            }
        }
    }

    public AbstractC7049bg(AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX, JSONObject jSONObject) {
        this.f15106bg = jSONObject;
        this.f15104IL = abstractView$OnTouchListenerC6981bX;
        m90189bg();
    }

    /* renamed from: IL */
    public abstract void mo90187IL();

    /* renamed from: bX */
    public abstract List<PropertyValuesHolder> mo90186bX();

    /* renamed from: bg */
    public void m90189bg() {
        this.f15105bX = this.f15106bg.optString("type");
        mo90187IL();
    }

    /* renamed from: bg */
    public abstract void mo90185bg(int i, int i2);

    /* renamed from: bg */
    public abstract void mo90184bg(Canvas canvas);

    public String eqN() {
        return this.f15105bX;
    }
}
