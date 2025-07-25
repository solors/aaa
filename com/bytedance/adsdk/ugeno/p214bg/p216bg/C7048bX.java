package com.bytedance.adsdk.ugeno.p214bg.p216bg;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.util.Log;
import android.view.View;
import com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX;
import com.bytedance.adsdk.ugeno.p214bg.EnumC7053eqN;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.ugeno.bg.bg.bX */
/* loaded from: classes3.dex */
public class C7048bX extends AbstractC7049bg {

    /* renamed from: Kg */
    private Paint f15097Kg;

    /* renamed from: VB */
    private Matrix f15098VB;

    /* renamed from: WR */
    private PorterDuffXfermode f15099WR;

    /* renamed from: bX */
    private String f15100bX;

    /* renamed from: eo */
    private LinearGradient f15101eo;
    private float eqN;

    /* renamed from: iR */
    private Paint f15102iR;
    private View ldr;

    /* renamed from: zx */
    private float f15103zx;

    public C7048bX(AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX, JSONObject jSONObject) {
        super(abstractView$OnTouchListenerC6981bX, jSONObject);
        this.ldr = this.f15104IL.m90372WR();
        Paint paint = new Paint();
        this.f15102iR = paint;
        paint.setAntiAlias(true);
        this.ldr.setLayerType(2, null);
        this.f15099WR = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f15097Kg = new Paint();
        this.f15098VB = new Matrix();
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.p216bg.AbstractC7049bg
    /* renamed from: IL */
    public void mo90187IL() {
        this.f15100bX = this.f15106bg.optString("direction", "left");
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.p216bg.AbstractC7049bg
    /* renamed from: bX */
    public List<PropertyValuesHolder> mo90186bX() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(PropertyValuesHolder.ofFloat("rubIn", 0.0f, 1.0f));
        arrayList.add(PropertyValuesHolder.ofFloat(EnumC7053eqN.ALPHA.m90183IL(), 0.0f, 1.0f));
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.p216bg.AbstractC7049bg
    /* renamed from: bg */
    public void mo90184bg(Canvas canvas) {
        char c;
        try {
            if (this.f15104IL.m90350jz() > 0.0f) {
                int m90350jz = (int) (this.eqN * this.f15104IL.m90350jz());
                int m90350jz2 = (int) (this.f15103zx * this.f15104IL.m90350jz());
                this.f15102iR.setXfermode(this.f15099WR);
                String str = this.f15100bX;
                switch (str.hashCode()) {
                    case -1383228885:
                        if (str.equals("bottom")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 115029:
                        if (str.equals(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3317767:
                        if (str.equals("left")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 108511772:
                        if (str.equals("right")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    float f = m90350jz;
                    canvas.drawRect(f, 0.0f, this.eqN, this.f15103zx, this.f15102iR);
                    this.f15098VB.setTranslate(f, this.f15103zx);
                    this.f15101eo.setLocalMatrix(this.f15098VB);
                    this.f15097Kg.setShader(this.f15101eo);
                    if (this.f15104IL.m90350jz() <= 1.0f && this.f15104IL.m90350jz() > 0.9f) {
                        this.f15097Kg.setAlpha((int) (255.0f - (this.f15104IL.m90350jz() * 255.0f)));
                    }
                    canvas.drawRect(0.0f, 0.0f, f, this.f15103zx, this.f15097Kg);
                } else if (c == 1) {
                    float f2 = m90350jz;
                    canvas.drawRect(0.0f, 0.0f, this.eqN - f2, this.f15103zx, this.f15102iR);
                    this.f15098VB.setTranslate(this.eqN - f2, 0.0f);
                    this.f15101eo.setLocalMatrix(this.f15098VB);
                    this.f15097Kg.setShader(this.f15101eo);
                    if (this.f15104IL.m90350jz() <= 1.0f && this.f15104IL.m90350jz() > 0.9f) {
                        this.f15097Kg.setAlpha((int) (255.0f - (this.f15104IL.m90350jz() * 255.0f)));
                    }
                    float f3 = this.eqN;
                    canvas.drawRect(f3, this.f15103zx, f3 - f2, 0.0f, this.f15097Kg);
                } else if (c == 2) {
                    float f4 = m90350jz2;
                    canvas.drawRect(0.0f, f4, this.eqN, this.f15103zx, this.f15102iR);
                    this.f15098VB.setTranslate(0.0f, f4);
                    this.f15101eo.setLocalMatrix(this.f15098VB);
                    this.f15097Kg.setShader(this.f15101eo);
                    if (this.f15104IL.m90350jz() <= 1.0f && this.f15104IL.m90350jz() > 0.9f) {
                        this.f15097Kg.setAlpha((int) (255.0f - (this.f15104IL.m90350jz() * 255.0f)));
                    }
                    canvas.drawRect(0.0f, 0.0f, this.eqN, f4, this.f15097Kg);
                } else if (c != 3) {
                } else {
                    float f5 = m90350jz2;
                    canvas.drawRect(0.0f, 0.0f, this.eqN, this.f15103zx - f5, this.f15102iR);
                    this.f15098VB.setTranslate(0.0f, this.f15103zx - f5);
                    this.f15101eo.setLocalMatrix(this.f15098VB);
                    this.f15097Kg.setShader(this.f15101eo);
                    if (this.f15104IL.m90350jz() <= 1.0f && this.f15104IL.m90350jz() > 0.9f) {
                        this.f15097Kg.setAlpha((int) (255.0f - (this.f15104IL.m90350jz() * 255.0f)));
                    }
                    float f6 = this.eqN;
                    float f7 = this.f15103zx;
                    canvas.drawRect(f6, f7, 0.0f, f7 - f5, this.f15097Kg);
                }
            }
        } catch (Throwable th) {
            Log.e("BaseEffectWrapper", th.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.p216bg.AbstractC7049bg
    /* renamed from: bg */
    public void mo90185bg(int i, int i2) {
        this.eqN = i;
        this.f15103zx = i2;
        String str = this.f15100bX;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1383228885:
                if (str.equals("bottom")) {
                    c = 0;
                    break;
                }
                break;
            case 115029:
                if (str.equals(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                    c = 1;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 2;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f15101eo = new LinearGradient(0.0f, -this.f15103zx, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                return;
            case 1:
                this.f15101eo = new LinearGradient(0.0f, this.f15103zx, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                return;
            case 2:
                this.f15101eo = new LinearGradient(this.eqN, 0.0f, 0.0f, 0.0f, 0, -1, Shader.TileMode.CLAMP);
                return;
            case 3:
                this.f15101eo = new LinearGradient(-this.eqN, 0.0f, 0.0f, this.f15103zx, 0, -1, Shader.TileMode.CLAMP);
                return;
            default:
                return;
        }
    }
}
