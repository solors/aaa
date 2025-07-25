package com.bytedance.adsdk.ugeno.p214bg.p215IL;

import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX;
import com.bytedance.adsdk.ugeno.p214bg.EnumC7053eqN;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.bytedance.adsdk.ugeno.bg.IL.bg */
/* loaded from: classes3.dex */
public abstract class AbstractC7042bg {

    /* renamed from: IL */
    protected String f15083IL;

    /* renamed from: bX */
    protected Map<Float, String> f15084bX;

    /* renamed from: bg */
    protected Context f15085bg;
    protected EnumC7053eqN eqN;

    /* renamed from: iR */
    protected AbstractView$OnTouchListenerC6981bX f15086iR;
    protected List<PropertyValuesHolder> ldr = new ArrayList();

    /* renamed from: zx */
    protected List<Keyframe> f15087zx = new ArrayList();

    public AbstractC7042bg(Context context, AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX, String str, Map<Float, String> map) {
        this.f15085bg = context;
        this.f15083IL = str;
        this.f15084bX = map;
        this.eqN = EnumC7053eqN.m90180bg(this.f15083IL);
        this.f15086iR = abstractView$OnTouchListenerC6981bX;
    }

    /* renamed from: IL */
    public abstract void mo90203IL();

    /* renamed from: bX */
    public void m90205bX() {
        Map<Float, String> map = this.f15084bX;
        if (map != null && map.size() > 0) {
            Map<Float, String> map2 = this.f15084bX;
            if (map2 instanceof TreeMap) {
                float floatValue = ((Float) ((TreeMap) map2).lastKey()).floatValue();
                if (floatValue != 100.0f) {
                    mo90202bg(100.0f, this.f15084bX.get(Float.valueOf(floatValue)));
                }
            }
        }
    }

    /* renamed from: bg */
    public abstract void mo90202bg(float f, String str);

    /* renamed from: bg */
    public boolean m90204bg() {
        Map<Float, String> map = this.f15084bX;
        if (map != null && map.size() > 0) {
            return this.f15084bX.containsKey(Float.valueOf(0.0f));
        }
        return false;
    }

    public void eqN() {
        Map<Float, String> map = this.f15084bX;
        if (map != null && map.size() > 0) {
            if (!m90204bg()) {
                mo90203IL();
            }
            for (Map.Entry<Float, String> entry : this.f15084bX.entrySet()) {
                if (entry != null) {
                    mo90202bg(entry.getKey().floatValue() / 100.0f, entry.getValue());
                }
            }
            m90205bX();
        }
    }

    public abstract TypeEvaluator ldr();

    /* renamed from: zx */
    public List<PropertyValuesHolder> mo90201zx() {
        String m90183IL = this.eqN.m90183IL();
        eqN();
        PropertyValuesHolder ofKeyframe = PropertyValuesHolder.ofKeyframe(m90183IL, (Keyframe[]) this.f15087zx.toArray(new Keyframe[0]));
        TypeEvaluator ldr = ldr();
        if (ldr != null) {
            ofKeyframe.setEvaluator(ldr);
        }
        this.ldr.add(ofKeyframe);
        return this.ldr;
    }
}
