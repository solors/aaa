package com.bytedance.adsdk.ugeno.p214bg.p215IL;

import android.animation.FloatEvaluator;
import android.animation.Keyframe;
import android.animation.TypeEvaluator;
import android.content.Context;
import com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX;
import com.bytedance.adsdk.ugeno.p214bg.EnumC7053eqN;
import com.bytedance.adsdk.ugeno.p222iR.C7114Kg;
import com.bytedance.adsdk.ugeno.p222iR.C7117bX;
import java.util.TreeMap;

/* renamed from: com.bytedance.adsdk.ugeno.bg.IL.IL */
/* loaded from: classes3.dex */
public class C7039IL extends AbstractC7042bg {

    /* renamed from: com.bytedance.adsdk.ugeno.bg.IL.IL$1 */
    /* loaded from: classes3.dex */
    static /* synthetic */ class C70401 {

        /* renamed from: bg */
        static final /* synthetic */ int[] f15082bg;

        static {
            int[] iArr = new int[EnumC7053eqN.values().length];
            f15082bg = iArr;
            try {
                iArr[EnumC7053eqN.TRANSLATE_X.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15082bg[EnumC7053eqN.TRANSLATE_Y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15082bg[EnumC7053eqN.SCALE_X.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15082bg[EnumC7053eqN.SCALE_Y.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15082bg[EnumC7053eqN.ROTATE_X.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15082bg[EnumC7053eqN.ROTATE_Y.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15082bg[EnumC7053eqN.ROTATE_Z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15082bg[EnumC7053eqN.ALPHA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15082bg[EnumC7053eqN.BORDER_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public C7039IL(Context context, AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX, String str, TreeMap<Float, String> treeMap) {
        super(context, abstractView$OnTouchListenerC6981bX, str, treeMap);
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.p215IL.AbstractC7042bg
    /* renamed from: IL */
    public void mo90203IL() {
        float m90379PX;
        switch (C70401.f15082bg[this.eqN.ordinal()]) {
            case 1:
                m90379PX = this.f15086iR.m90379PX();
                break;
            case 2:
                m90379PX = this.f15086iR.m90377Ta();
                break;
            case 3:
                m90379PX = this.f15086iR.yDt();
                break;
            case 4:
                m90379PX = this.f15086iR.m90380Lq();
                break;
            case 5:
                m90379PX = this.f15086iR.m90347vb();
                break;
            case 6:
                m90379PX = this.f15086iR.xxp();
                break;
            case 7:
                m90379PX = this.f15086iR.VzQ();
                break;
            case 8:
                m90379PX = this.f15086iR.tuV();
                break;
            case 9:
                m90379PX = this.f15086iR.m90388Fy();
                break;
            default:
                m90379PX = 0.0f;
                break;
        }
        this.f15087zx.add(Keyframe.ofFloat(0.0f, m90379PX));
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.p215IL.AbstractC7042bg
    /* renamed from: bg */
    public void mo90202bg(float f, String str) {
        float m90009bg;
        if (!this.f15083IL.startsWith(EnumC7053eqN.TRANSLATE.m90181bg()) && this.eqN != EnumC7053eqN.BORDER_RADIUS) {
            m90009bg = C7117bX.m90002bg(str, 0.0f);
        } else {
            m90009bg = C7114Kg.m90009bg(this.f15085bg, C7117bX.m90002bg(str, 0.0f));
        }
        this.f15087zx.add(Keyframe.ofFloat(f, m90009bg));
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.p215IL.AbstractC7042bg
    public TypeEvaluator ldr() {
        return new FloatEvaluator();
    }
}
