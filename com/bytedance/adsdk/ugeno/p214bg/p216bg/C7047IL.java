package com.bytedance.adsdk.ugeno.p214bg.p216bg;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX;
import com.bytedance.adsdk.ugeno.p222iR.C7118bg;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.ugeno.bg.bg.IL */
/* loaded from: classes3.dex */
public class C7047IL extends AbstractC7049bg {

    /* renamed from: iR */
    private static final int f15094iR = Color.parseColor("#7ed321");

    /* renamed from: bX */
    private int f15095bX;
    private int eqN;
    private Paint ldr;

    /* renamed from: zx */
    private int f15096zx;

    public C7047IL(AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX, JSONObject jSONObject) {
        super(abstractView$OnTouchListenerC6981bX, jSONObject);
        Paint paint = new Paint();
        this.ldr = paint;
        paint.setAntiAlias(true);
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.p216bg.AbstractC7049bg
    /* renamed from: IL */
    public void mo90187IL() {
        this.f15095bX = C7118bg.m89993bg(this.f15106bg.optString("backgroundColor"), f15094iR);
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.p216bg.AbstractC7049bg
    /* renamed from: bX */
    public List<PropertyValuesHolder> mo90186bX() {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(eqN(), 0.0f, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ofFloat);
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.p216bg.AbstractC7049bg
    /* renamed from: bg */
    public void mo90184bg(Canvas canvas) {
        try {
            if (this.f15104IL.m90349qC() > 0.0f) {
                this.ldr.setColor(this.f15095bX);
                this.ldr.setAlpha((int) ((1.0f - this.f15104IL.m90349qC()) * 255.0f));
                ((ViewGroup) this.f15104IL.m90372WR().getParent()).setClipChildren(true);
                int i = this.eqN;
                int i2 = this.f15096zx;
                canvas.drawCircle(i, i2, Math.min(i, i2) * 2 * this.f15104IL.m90349qC(), this.ldr);
            }
        } catch (Throwable th) {
            Log.d("BaseEffectWrapper", "ripple animation error " + th.getMessage());
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.p216bg.AbstractC7049bg
    /* renamed from: bg */
    public void mo90185bg(int i, int i2) {
        this.eqN = i / 2;
        this.f15096zx = i2 / 2;
    }
}
