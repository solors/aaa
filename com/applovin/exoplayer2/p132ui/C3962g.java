package com.applovin.exoplayer2.p132ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.applovin.impl.AbstractC4100b1;
import com.applovin.impl.AbstractC5863xp;
import com.applovin.impl.C3989a5;
import com.applovin.impl.C5815x2;

/* renamed from: com.applovin.exoplayer2.ui.g */
/* loaded from: classes2.dex */
final class C3962g {

    /* renamed from: A */
    private int f4402A;

    /* renamed from: B */
    private int f4403B;

    /* renamed from: C */
    private int f4404C;

    /* renamed from: D */
    private int f4405D;

    /* renamed from: E */
    private StaticLayout f4406E;

    /* renamed from: F */
    private StaticLayout f4407F;

    /* renamed from: G */
    private int f4408G;

    /* renamed from: H */
    private int f4409H;

    /* renamed from: I */
    private int f4410I;

    /* renamed from: J */
    private Rect f4411J;

    /* renamed from: a */
    private final float f4412a;

    /* renamed from: b */
    private final float f4413b;

    /* renamed from: c */
    private final float f4414c;

    /* renamed from: d */
    private final float f4415d;

    /* renamed from: e */
    private final float f4416e;

    /* renamed from: f */
    private final TextPaint f4417f;

    /* renamed from: g */
    private final Paint f4418g;

    /* renamed from: h */
    private final Paint f4419h;

    /* renamed from: i */
    private CharSequence f4420i;

    /* renamed from: j */
    private Layout.Alignment f4421j;

    /* renamed from: k */
    private Bitmap f4422k;

    /* renamed from: l */
    private float f4423l;

    /* renamed from: m */
    private int f4424m;

    /* renamed from: n */
    private int f4425n;

    /* renamed from: o */
    private float f4426o;

    /* renamed from: p */
    private int f4427p;

    /* renamed from: q */
    private float f4428q;

    /* renamed from: r */
    private float f4429r;

    /* renamed from: s */
    private int f4430s;

    /* renamed from: t */
    private int f4431t;

    /* renamed from: u */
    private int f4432u;

    /* renamed from: v */
    private int f4433v;

    /* renamed from: w */
    private int f4434w;

    /* renamed from: x */
    private float f4435x;

    /* renamed from: y */
    private float f4436y;

    /* renamed from: z */
    private float f4437z;

    public C3962g(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.f4416e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f4415d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f4412a = round;
        this.f4413b = round;
        this.f4414c = round;
        TextPaint textPaint = new TextPaint();
        this.f4417f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f4418g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f4419h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a1  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m101115b() {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p132ui.C3962g.m101115b():void");
    }

    /* renamed from: a */
    public void m101117a(C3989a5 c3989a5, C5815x2 c5815x2, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        int i5;
        boolean z = c3989a5.f4491d == null;
        if (!z) {
            i5 = ViewCompat.MEASURED_STATE_MASK;
        } else if (TextUtils.isEmpty(c3989a5.f4488a)) {
            return;
        } else {
            i5 = c3989a5.f4499m ? c3989a5.f4500n : c5815x2.f11866c;
        }
        if (m101116a(this.f4420i, c3989a5.f4488a) && AbstractC5863xp.m93016a(this.f4421j, c3989a5.f4489b) && this.f4422k == c3989a5.f4491d && this.f4423l == c3989a5.f4492f && this.f4424m == c3989a5.f4493g && AbstractC5863xp.m93016a(Integer.valueOf(this.f4425n), Integer.valueOf(c3989a5.f4494h)) && this.f4426o == c3989a5.f4495i && AbstractC5863xp.m93016a(Integer.valueOf(this.f4427p), Integer.valueOf(c3989a5.f4496j)) && this.f4428q == c3989a5.f4497k && this.f4429r == c3989a5.f4498l && this.f4430s == c5815x2.f11864a && this.f4431t == c5815x2.f11865b && this.f4432u == i5 && this.f4434w == c5815x2.f11867d && this.f4433v == c5815x2.f11868e && AbstractC5863xp.m93016a(this.f4417f.getTypeface(), c5815x2.f11869f) && this.f4435x == f && this.f4436y == f2 && this.f4437z == f3 && this.f4402A == i && this.f4403B == i2 && this.f4404C == i3 && this.f4405D == i4) {
            m101118a(canvas, z);
            return;
        }
        this.f4420i = c3989a5.f4488a;
        this.f4421j = c3989a5.f4489b;
        this.f4422k = c3989a5.f4491d;
        this.f4423l = c3989a5.f4492f;
        this.f4424m = c3989a5.f4493g;
        this.f4425n = c3989a5.f4494h;
        this.f4426o = c3989a5.f4495i;
        this.f4427p = c3989a5.f4496j;
        this.f4428q = c3989a5.f4497k;
        this.f4429r = c3989a5.f4498l;
        this.f4430s = c5815x2.f11864a;
        this.f4431t = c5815x2.f11865b;
        this.f4432u = i5;
        this.f4434w = c5815x2.f11867d;
        this.f4433v = c5815x2.f11868e;
        this.f4417f.setTypeface(c5815x2.f11869f);
        this.f4435x = f;
        this.f4436y = f2;
        this.f4437z = f3;
        this.f4402A = i;
        this.f4403B = i2;
        this.f4404C = i3;
        this.f4405D = i4;
        if (z) {
            AbstractC4100b1.m100583a(this.f4420i);
            m101115b();
        } else {
            AbstractC4100b1.m100583a(this.f4422k);
            m101120a();
        }
        m101118a(canvas, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m101120a() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f4422k
            int r1 = r7.f4404C
            int r2 = r7.f4402A
            int r1 = r1 - r2
            int r3 = r7.f4405D
            int r4 = r7.f4403B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f4426o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f4423l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f4428q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f4429r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L2e
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            goto L3f
        L2e:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
        L3f:
            int r3 = r7.f4427p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L48
            float r3 = (float) r1
        L46:
            float r2 = r2 - r3
            goto L4e
        L48:
            if (r3 != r5) goto L4e
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L46
        L4e:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f4425n
            if (r3 != r6) goto L59
            float r3 = (float) r0
        L57:
            float r4 = r4 - r3
            goto L5f
        L59:
            if (r3 != r5) goto L5f
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L57
        L5f:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.f4411J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.p132ui.C3962g.m101120a():void");
    }

    /* renamed from: a */
    private void m101118a(Canvas canvas, boolean z) {
        if (z) {
            m101114b(canvas);
            return;
        }
        AbstractC4100b1.m100583a(this.f4411J);
        AbstractC4100b1.m100583a(this.f4422k);
        m101119a(canvas);
    }

    /* renamed from: a */
    private void m101119a(Canvas canvas) {
        canvas.drawBitmap(this.f4422k, (Rect) null, this.f4411J, this.f4419h);
    }

    /* renamed from: b */
    private void m101114b(Canvas canvas) {
        StaticLayout staticLayout = this.f4406E;
        StaticLayout staticLayout2 = this.f4407F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.f4408G, this.f4409H);
        if (Color.alpha(this.f4432u) > 0) {
            this.f4418g.setColor(this.f4432u);
            canvas.drawRect(-this.f4410I, 0.0f, staticLayout.getWidth() + this.f4410I, staticLayout.getHeight(), this.f4418g);
        }
        int i = this.f4434w;
        if (i == 1) {
            this.f4417f.setStrokeJoin(Paint.Join.ROUND);
            this.f4417f.setStrokeWidth(this.f4412a);
            this.f4417f.setColor(this.f4433v);
            this.f4417f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i == 2) {
            TextPaint textPaint = this.f4417f;
            float f = this.f4413b;
            float f2 = this.f4414c;
            textPaint.setShadowLayer(f, f2, f2, this.f4433v);
        } else if (i == 3 || i == 4) {
            boolean z = i == 3;
            int i2 = z ? -1 : this.f4433v;
            int i3 = z ? this.f4433v : -1;
            float f3 = this.f4413b / 2.0f;
            this.f4417f.setColor(this.f4430s);
            this.f4417f.setStyle(Paint.Style.FILL);
            float f4 = -f3;
            this.f4417f.setShadowLayer(this.f4413b, f4, f4, i2);
            staticLayout2.draw(canvas);
            this.f4417f.setShadowLayer(this.f4413b, f3, f3, i3);
        }
        this.f4417f.setColor(this.f4430s);
        this.f4417f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f4417f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(save);
    }

    /* renamed from: a */
    private static boolean m101116a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }
}
