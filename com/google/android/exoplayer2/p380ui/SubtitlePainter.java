package com.google.android.exoplayer2.p380ui;

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
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

/* renamed from: com.google.android.exoplayer2.ui.SubtitlePainter */
/* loaded from: classes4.dex */
final class SubtitlePainter {

    /* renamed from: A */
    private int f35608A;

    /* renamed from: B */
    private int f35609B;

    /* renamed from: C */
    private int f35610C;

    /* renamed from: D */
    private int f35611D;

    /* renamed from: E */
    private StaticLayout f35612E;

    /* renamed from: F */
    private StaticLayout f35613F;

    /* renamed from: G */
    private int f35614G;

    /* renamed from: H */
    private int f35615H;

    /* renamed from: I */
    private int f35616I;

    /* renamed from: J */
    private Rect f35617J;

    /* renamed from: a */
    private final float f35618a;

    /* renamed from: b */
    private final float f35619b;

    /* renamed from: c */
    private final float f35620c;

    /* renamed from: d */
    private final float f35621d;

    /* renamed from: e */
    private final float f35622e;

    /* renamed from: f */
    private final TextPaint f35623f;

    /* renamed from: g */
    private final Paint f35624g;

    /* renamed from: h */
    private final Paint f35625h;
    @Nullable

    /* renamed from: i */
    private CharSequence f35626i;
    @Nullable

    /* renamed from: j */
    private Layout.Alignment f35627j;
    @Nullable

    /* renamed from: k */
    private Bitmap f35628k;

    /* renamed from: l */
    private float f35629l;

    /* renamed from: m */
    private int f35630m;

    /* renamed from: n */
    private int f35631n;

    /* renamed from: o */
    private float f35632o;

    /* renamed from: p */
    private int f35633p;

    /* renamed from: q */
    private float f35634q;

    /* renamed from: r */
    private float f35635r;

    /* renamed from: s */
    private int f35636s;

    /* renamed from: t */
    private int f35637t;

    /* renamed from: u */
    private int f35638u;

    /* renamed from: v */
    private int f35639v;

    /* renamed from: w */
    private int f35640w;

    /* renamed from: x */
    private float f35641x;

    /* renamed from: y */
    private float f35642y;

    /* renamed from: z */
    private float f35643z;

    public SubtitlePainter(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.f35622e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f35621d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f35618a = round;
        this.f35619b = round;
        this.f35620c = round;
        TextPaint textPaint = new TextPaint();
        this.f35623f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f35624g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f35625h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* renamed from: a */
    private static boolean m72850a(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if (charSequence != charSequence2 && (charSequence == null || !charSequence.equals(charSequence2))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m72849b(Canvas canvas) {
        canvas.drawBitmap(this.f35628k, (Rect) null, this.f35617J, this.f35625h);
    }

    /* renamed from: c */
    private void m72848c(Canvas canvas, boolean z) {
        if (z) {
            m72847d(canvas);
            return;
        }
        Assertions.checkNotNull(this.f35617J);
        Assertions.checkNotNull(this.f35628k);
        m72849b(canvas);
    }

    /* renamed from: d */
    private void m72847d(Canvas canvas) {
        int i;
        StaticLayout staticLayout = this.f35612E;
        StaticLayout staticLayout2 = this.f35613F;
        if (staticLayout != null && staticLayout2 != null) {
            int save = canvas.save();
            canvas.translate(this.f35614G, this.f35615H);
            if (Color.alpha(this.f35638u) > 0) {
                this.f35624g.setColor(this.f35638u);
                canvas.drawRect(-this.f35616I, 0.0f, staticLayout.getWidth() + this.f35616I, staticLayout.getHeight(), this.f35624g);
            }
            int i2 = this.f35640w;
            boolean z = true;
            if (i2 == 1) {
                this.f35623f.setStrokeJoin(Paint.Join.ROUND);
                this.f35623f.setStrokeWidth(this.f35618a);
                this.f35623f.setColor(this.f35639v);
                this.f35623f.setStyle(Paint.Style.FILL_AND_STROKE);
                staticLayout2.draw(canvas);
            } else if (i2 == 2) {
                TextPaint textPaint = this.f35623f;
                float f = this.f35619b;
                float f2 = this.f35620c;
                textPaint.setShadowLayer(f, f2, f2, this.f35639v);
            } else if (i2 == 3 || i2 == 4) {
                if (i2 != 3) {
                    z = false;
                }
                int i3 = -1;
                if (z) {
                    i = -1;
                } else {
                    i = this.f35639v;
                }
                if (z) {
                    i3 = this.f35639v;
                }
                float f3 = this.f35619b / 2.0f;
                this.f35623f.setColor(this.f35636s);
                this.f35623f.setStyle(Paint.Style.FILL);
                float f4 = -f3;
                this.f35623f.setShadowLayer(this.f35619b, f4, f4, i);
                staticLayout2.draw(canvas);
                this.f35623f.setShadowLayer(this.f35619b, f3, f3, i3);
            }
            this.f35623f.setColor(this.f35636s);
            this.f35623f.setStyle(Paint.Style.FILL);
            staticLayout.draw(canvas);
            this.f35623f.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            canvas.restoreToCount(save);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m72846e() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f35628k
            int r1 = r7.f35610C
            int r2 = r7.f35608A
            int r1 = r1 - r2
            int r3 = r7.f35611D
            int r4 = r7.f35609B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f35632o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f35629l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f35634q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f35635r
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
            int r3 = r7.f35633p
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
            int r3 = r7.f35631n
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
            r7.f35617J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p380ui.SubtitlePainter.m72846e():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a2  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m72845f() {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p380ui.SubtitlePainter.m72845f():void");
    }

    public void draw(Cue cue, CaptionStyleCompat captionStyleCompat, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        if (cue.bitmap == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (TextUtils.isEmpty(cue.text)) {
                return;
            }
            if (cue.windowColorSet) {
                i5 = cue.windowColor;
            } else {
                i5 = captionStyleCompat.windowColor;
            }
        } else {
            i5 = ViewCompat.MEASURED_STATE_MASK;
        }
        if (m72850a(this.f35626i, cue.text) && Util.areEqual(this.f35627j, cue.textAlignment) && this.f35628k == cue.bitmap && this.f35629l == cue.line && this.f35630m == cue.lineType && Util.areEqual(Integer.valueOf(this.f35631n), Integer.valueOf(cue.lineAnchor)) && this.f35632o == cue.position && Util.areEqual(Integer.valueOf(this.f35633p), Integer.valueOf(cue.positionAnchor)) && this.f35634q == cue.size && this.f35635r == cue.bitmapHeight && this.f35636s == captionStyleCompat.foregroundColor && this.f35637t == captionStyleCompat.backgroundColor && this.f35638u == i5 && this.f35640w == captionStyleCompat.edgeType && this.f35639v == captionStyleCompat.edgeColor && Util.areEqual(this.f35623f.getTypeface(), captionStyleCompat.typeface) && this.f35641x == f && this.f35642y == f2 && this.f35643z == f3 && this.f35608A == i && this.f35609B == i2 && this.f35610C == i3 && this.f35611D == i4) {
            m72848c(canvas, z);
            return;
        }
        this.f35626i = cue.text;
        this.f35627j = cue.textAlignment;
        this.f35628k = cue.bitmap;
        this.f35629l = cue.line;
        this.f35630m = cue.lineType;
        this.f35631n = cue.lineAnchor;
        this.f35632o = cue.position;
        this.f35633p = cue.positionAnchor;
        this.f35634q = cue.size;
        this.f35635r = cue.bitmapHeight;
        this.f35636s = captionStyleCompat.foregroundColor;
        this.f35637t = captionStyleCompat.backgroundColor;
        this.f35638u = i5;
        this.f35640w = captionStyleCompat.edgeType;
        this.f35639v = captionStyleCompat.edgeColor;
        this.f35623f.setTypeface(captionStyleCompat.typeface);
        this.f35641x = f;
        this.f35642y = f2;
        this.f35643z = f3;
        this.f35608A = i;
        this.f35609B = i2;
        this.f35610C = i3;
        this.f35611D = i4;
        if (z) {
            Assertions.checkNotNull(this.f35626i);
            m72845f();
        } else {
            Assertions.checkNotNull(this.f35628k);
            m72846e();
        }
        m72848c(canvas, z);
    }
}
