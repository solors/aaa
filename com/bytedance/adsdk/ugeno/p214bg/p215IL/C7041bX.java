package com.bytedance.adsdk.ugeno.p214bg.p215IL;

import android.animation.ArgbEvaluator;
import android.animation.IntEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX;
import com.bytedance.adsdk.ugeno.p214bg.EnumC7053eqN;
import com.bytedance.adsdk.ugeno.p222iR.C7117bX;
import com.bytedance.adsdk.ugeno.p222iR.C7118bg;
import java.util.TreeMap;

/* renamed from: com.bytedance.adsdk.ugeno.bg.IL.bX */
/* loaded from: classes3.dex */
public class C7041bX extends AbstractC7042bg {
    public C7041bX(Context context, AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX, String str, TreeMap<Float, String> treeMap) {
        super(context, abstractView$OnTouchListenerC6981bX, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.p215IL.AbstractC7042bg
    /* renamed from: IL */
    public void mo90203IL() {
        if (this.eqN == EnumC7053eqN.BACKGROUND_COLOR) {
            this.f15087zx.add(Keyframe.ofInt(0.0f, this.f15086iR.ZQc()));
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.p215IL.AbstractC7042bg
    /* renamed from: bg */
    public void mo90202bg(float f, String str) {
        Keyframe ofInt;
        if (this.eqN == EnumC7053eqN.BACKGROUND_COLOR) {
            ofInt = Keyframe.ofInt(f, C7118bg.m89995bg(str));
        } else {
            ofInt = Keyframe.ofInt(f, C7117bX.m90001bg(str, 0));
        }
        this.f15087zx.add(ofInt);
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.p215IL.AbstractC7042bg
    public TypeEvaluator ldr() {
        if (this.eqN == EnumC7053eqN.BACKGROUND_COLOR) {
            return new ArgbEvaluator();
        }
        return new IntEvaluator();
    }
}
