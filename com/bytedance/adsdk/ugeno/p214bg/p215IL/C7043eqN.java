package com.bytedance.adsdk.ugeno.p214bg.p215IL;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX;
import com.bytedance.adsdk.ugeno.p214bg.EnumC7053eqN;
import com.bytedance.adsdk.ugeno.p222iR.C7114Kg;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.bytedance.adsdk.ugeno.bg.IL.eqN */
/* loaded from: classes3.dex */
public class C7043eqN extends AbstractC7042bg {

    /* renamed from: Kg */
    private List<Keyframe> f15088Kg;

    /* renamed from: com.bytedance.adsdk.ugeno.bg.IL.eqN$1 */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C70441 {

        /* renamed from: bg */
        static final /* synthetic */ int[] f15089bg;

        static {
            int[] iArr = new int[EnumC7053eqN.values().length];
            f15089bg = iArr;
            try {
                iArr[EnumC7053eqN.TRANSLATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15089bg[EnumC7053eqN.SCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C7043eqN(Context context, AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX, String str, Map<Float, String> map) {
        super(context, abstractView$OnTouchListenerC6981bX, str, map);
        this.f15088Kg = new ArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.p215IL.AbstractC7042bg
    /* renamed from: IL */
    public void mo90203IL() {
        Keyframe ofFloat;
        Keyframe ofFloat2;
        int i = C70441.f15089bg[this.eqN.ordinal()];
        if (i != 1) {
            if (i != 2) {
                ofFloat = null;
                ofFloat2 = null;
            } else {
                ofFloat = Keyframe.ofFloat(0.0f, this.f15086iR.yDt());
                ofFloat2 = Keyframe.ofFloat(0.0f, this.f15086iR.m90380Lq());
            }
        } else {
            ofFloat = Keyframe.ofFloat(0.0f, this.f15086iR.m90379PX());
            ofFloat2 = Keyframe.ofFloat(0.0f, this.f15086iR.m90377Ta());
        }
        if (ofFloat != null) {
            this.f15087zx.add(ofFloat);
        }
        if (ofFloat2 != null) {
            this.f15088Kg.add(ofFloat2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.p215IL.AbstractC7042bg
    /* renamed from: bg */
    public void mo90202bg(float f, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() != 2) {
                return;
            }
            float optDouble = (float) jSONArray.optDouble(0);
            float optDouble2 = (float) jSONArray.optDouble(1);
            if (this.eqN == EnumC7053eqN.TRANSLATE) {
                optDouble = C7114Kg.m90009bg(this.f15085bg, optDouble);
                optDouble2 = C7114Kg.m90009bg(this.f15085bg, optDouble2);
            }
            this.f15087zx.add(Keyframe.ofFloat(f, optDouble));
            this.f15088Kg.add(Keyframe.ofFloat(f, optDouble2));
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.p215IL.AbstractC7042bg
    public TypeEvaluator ldr() {
        return new FloatEvaluator();
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.p215IL.AbstractC7042bg
    /* renamed from: zx */
    public List<PropertyValuesHolder> mo90201zx() {
        String m90183IL = this.eqN.m90183IL();
        eqN();
        PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(m90183IL + "X", (Keyframe[]) this.f15087zx.toArray(new Keyframe[0]));
        this.ldr.add(ofKeyframe);
        PropertyValuesHolder ofKeyframe2 = PropertyValuesHolder.ofKeyframe(m90183IL + "Y", (Keyframe[]) this.f15088Kg.toArray(new Keyframe[0]));
        this.ldr.add(ofKeyframe2);
        TypeEvaluator ldr = ldr();
        if (ldr != null) {
            ofKeyframe.setEvaluator(ldr);
            ofKeyframe2.setEvaluator(ldr);
        }
        return this.ldr;
    }
}
