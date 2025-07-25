package com.bytedance.adsdk.ugeno.p214bg.p216bg;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.ugeno.bg.bg.zx */
/* loaded from: classes3.dex */
public class C7052zx extends AbstractC7049bg {

    /* renamed from: Kg */
    private boolean f15118Kg;

    /* renamed from: PX */
    private Path f15119PX;

    /* renamed from: Ta */
    private PorterDuffXfermode f15120Ta;

    /* renamed from: VB */
    private Path f15121VB;

    /* renamed from: WR */
    private boolean f15122WR;

    /* renamed from: bX */
    private float f15123bX;

    /* renamed from: eo */
    private Path f15124eo;
    private float eqN;

    /* renamed from: iR */
    private String f15125iR;
    private float ldr;

    /* renamed from: zx */
    private Paint f15126zx;

    public C7052zx(AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX, JSONObject jSONObject) {
        super(abstractView$OnTouchListenerC6981bX, jSONObject);
        this.f15118Kg = true;
        this.f15122WR = true;
        Paint paint = new Paint();
        this.f15126zx = paint;
        paint.setAntiAlias(true);
        this.f15104IL.m90372WR().setLayerType(2, null);
        this.f15120Ta = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f15124eo = new Path();
        this.f15121VB = new Path();
        this.f15119PX = new Path();
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.p216bg.AbstractC7049bg
    /* renamed from: IL */
    public void mo90187IL() {
        this.ldr = (float) this.f15106bg.optDouble("start", 0.0d);
        this.f15125iR = this.f15106bg.optString("direction", "center");
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.p216bg.AbstractC7049bg
    /* renamed from: bX */
    public List<PropertyValuesHolder> mo90186bX() {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(eqN(), this.ldr, 1.0f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(ofFloat);
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.p216bg.AbstractC7049bg
    /* renamed from: bg */
    public void mo90184bg(Canvas canvas) {
        if (this.f15104IL.m90371bN() > 0.0f) {
            int m90371bN = (int) (this.f15123bX * this.f15104IL.m90371bN());
            int m90371bN2 = (int) (this.eqN * this.f15104IL.m90371bN());
            this.f15126zx.setXfermode(this.f15120Ta);
            String str = this.f15125iR;
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1383228885:
                    if (str.equals("bottom")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        c = 1;
                        break;
                    }
                    break;
                case 115029:
                    if (str.equals(ViewHierarchyConstants.DIMENSION_TOP_KEY)) {
                        c = 2;
                        break;
                    }
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        c = 3;
                        break;
                    }
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    canvas.drawRect(0.0f, m90371bN2, this.f15123bX, this.eqN, this.f15126zx);
                    return;
                case 1:
                    this.f15124eo.reset();
                    this.f15121VB.reset();
                    this.f15119PX.reset();
                    this.f15124eo.addCircle(this.f15123bX / 2.0f, this.eqN / 2.0f, m90371bN, Path.Direction.CW);
                    Path path = this.f15121VB;
                    float f = this.f15123bX;
                    path.addRect(f / 2.0f, 0.0f, f, this.eqN, Path.Direction.CW);
                    this.f15121VB.op(this.f15124eo, Path.Op.DIFFERENCE);
                    this.f15119PX.addRect(0.0f, 0.0f, this.f15123bX / 2.0f, this.eqN, Path.Direction.CW);
                    this.f15119PX.op(this.f15124eo, Path.Op.DIFFERENCE);
                    canvas.drawPath(this.f15121VB, this.f15126zx);
                    canvas.drawPath(this.f15119PX, this.f15126zx);
                    return;
                case 2:
                    canvas.drawRect(0.0f, 0.0f, this.f15123bX, this.eqN - m90371bN2, this.f15126zx);
                    return;
                case 3:
                    canvas.drawRect(0.0f, 0.0f, this.f15123bX - m90371bN, this.eqN, this.f15126zx);
                    return;
                case 4:
                    canvas.drawRect(m90371bN, 0.0f, this.f15123bX, this.eqN, this.f15126zx);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.p214bg.p216bg.AbstractC7049bg
    /* renamed from: bg */
    public void mo90185bg(int i, int i2) {
        if (i > 0 && this.f15118Kg) {
            this.f15123bX = i;
            this.f15118Kg = false;
        }
        if (i2 <= 0 || !this.f15122WR) {
            return;
        }
        this.eqN = i2;
        this.f15122WR = false;
    }
}
