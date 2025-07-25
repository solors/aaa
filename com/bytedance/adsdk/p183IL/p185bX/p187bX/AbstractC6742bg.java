package com.bytedance.adsdk.p183IL.p185bX.p187bX;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.p183IL.C6687WR;
import com.bytedance.adsdk.p183IL.C6821eo;
import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.adsdk.p183IL.C6873zx;
import com.bytedance.adsdk.p183IL.ldr.C6863ldr;
import com.bytedance.adsdk.p183IL.p185bX.p186IL.C6709Kg;
import com.bytedance.adsdk.p183IL.p185bX.p186IL.C6719bg;
import com.bytedance.adsdk.p183IL.p185bX.p186IL.C6730yDt;
import com.bytedance.adsdk.p183IL.p185bX.p187bX.C6748zx;
import com.bytedance.adsdk.p183IL.p189bg.C6795bg;
import com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg;
import com.bytedance.adsdk.p183IL.p189bg.p190IL.C6773Kg;
import com.bytedance.adsdk.p183IL.p189bg.p190IL.C6789eqN;
import com.bytedance.adsdk.p183IL.p189bg.p190IL.C6792xxp;
import com.bytedance.adsdk.p183IL.p189bg.p191bg.InterfaceC6807bX;
import com.bytedance.adsdk.p183IL.p189bg.p191bg.InterfaceC6820zx;
import com.bytedance.adsdk.p183IL.p193zx.C6894eo;
import com.bytedance.component.sdk.annotation.FloatRange;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: com.bytedance.adsdk.IL.bX.bX.bg */
/* loaded from: classes3.dex */
public abstract class AbstractC6742bg implements AbstractC6781bg.InterfaceC6785bg, InterfaceC6820zx {
    private boolean DDQ;

    /* renamed from: Fy */
    private final String f14388Fy;

    /* renamed from: IL */
    final C6687WR f14389IL;
    private List<AbstractC6742bg> JAA;

    /* renamed from: Ja */
    private final List<AbstractC6781bg<?, ?>> f14390Ja;

    /* renamed from: LZ */
    private C6773Kg f14392LZ;

    /* renamed from: Lq */
    private final RectF f14393Lq;

    /* renamed from: Ta */
    private final Paint f14395Ta;

    /* renamed from: Uq */
    private Paint f14396Uq;

    /* renamed from: Uw */
    private boolean f14397Uw;

    /* renamed from: VW */
    private float f14399VW;
    private final RectF VzQ;
    private final Matrix aGH;

    /* renamed from: bX */
    final C6748zx f14401bX;

    /* renamed from: bg */
    final Matrix f14402bg;
    final C6792xxp eqN;
    private AbstractC6742bg kMt;
    BlurMaskFilter ldr;
    private AbstractC6742bg rri;

    /* renamed from: tC */
    private C6789eqN f14405tC;
    private final RectF tuV;

    /* renamed from: vb */
    private final RectF f14406vb;
    private final RectF xxp;
    private final Paint yDt;

    /* renamed from: zx */
    float f14407zx;

    /* renamed from: iR */
    private final Path f14404iR = new Path();

    /* renamed from: Kg */
    private final Matrix f14391Kg = new Matrix();

    /* renamed from: WR */
    private final Matrix f14400WR = new Matrix();

    /* renamed from: eo */
    private final Paint f14403eo = new C6795bg(1);

    /* renamed from: VB */
    private final Paint f14398VB = new C6795bg(1, PorterDuff.Mode.DST_IN);

    /* renamed from: PX */
    private final Paint f14394PX = new C6795bg(1, PorterDuff.Mode.DST_OUT);

    /* renamed from: com.bytedance.adsdk.IL.bX.bX.bg$2 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C67442 {

        /* renamed from: IL */
        static final /* synthetic */ int[] f14409IL;

        /* renamed from: bg */
        static final /* synthetic */ int[] f14410bg;

        static {
            int[] iArr = new int[C6709Kg.EnumC6710bg.values().length];
            f14409IL = iArr;
            try {
                iArr[C6709Kg.EnumC6710bg.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14409IL[C6709Kg.EnumC6710bg.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14409IL[C6709Kg.EnumC6710bg.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14409IL[C6709Kg.EnumC6710bg.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[C6748zx.EnumC6750bg.values().length];
            f14410bg = iArr2;
            try {
                iArr2[C6748zx.EnumC6750bg.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f14410bg[C6748zx.EnumC6750bg.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f14410bg[C6748zx.EnumC6750bg.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f14410bg[C6748zx.EnumC6750bg.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f14410bg[C6748zx.EnumC6750bg.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f14410bg[C6748zx.EnumC6750bg.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f14410bg[C6748zx.EnumC6750bg.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public AbstractC6742bg(C6687WR c6687wr, C6748zx c6748zx) {
        C6795bg c6795bg = new C6795bg(1);
        this.f14395Ta = c6795bg;
        this.yDt = new C6795bg(PorterDuff.Mode.CLEAR);
        this.f14393Lq = new RectF();
        this.f14406vb = new RectF();
        this.xxp = new RectF();
        this.VzQ = new RectF();
        this.tuV = new RectF();
        this.f14402bg = new Matrix();
        this.f14390Ja = new ArrayList();
        this.f14397Uw = true;
        this.f14407zx = 0.0f;
        this.aGH = new Matrix();
        this.f14399VW = 1.0f;
        this.f14389IL = c6687wr;
        this.f14401bX = c6748zx;
        this.f14388Fy = c6748zx.ldr() + "#draw";
        if (c6748zx.m90917PX() == C6748zx.EnumC6749IL.INVERT) {
            c6795bg.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            c6795bg.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        C6792xxp m90893eo = c6748zx.m90918Lq().m90893eo();
        this.eqN = m90893eo;
        m90893eo.m90818bg((AbstractC6781bg.InterfaceC6785bg) this);
        if (c6748zx.m90910eo() != null && !c6748zx.m90910eo().isEmpty()) {
            C6773Kg c6773Kg = new C6773Kg(c6748zx.m90910eo());
            this.f14392LZ = c6773Kg;
            for (AbstractC6781bg<C6730yDt, Path> abstractC6781bg : c6773Kg.m90858IL()) {
                abstractC6781bg.m90841bg(this);
            }
            for (AbstractC6781bg<Integer, Integer> abstractC6781bg2 : this.f14392LZ.m90857bX()) {
                m90931bg(abstractC6781bg2);
                abstractC6781bg2.m90841bg(this);
            }
        }
        m90949PX();
    }

    /* renamed from: Lq */
    private void m90950Lq() {
        if (this.JAA != null) {
            return;
        }
        if (this.kMt == null) {
            this.JAA = Collections.emptyList();
            return;
        }
        this.JAA = new ArrayList();
        for (AbstractC6742bg abstractC6742bg = this.kMt; abstractC6742bg != null; abstractC6742bg = abstractC6742bg.kMt) {
            this.JAA.add(abstractC6742bg);
        }
    }

    /* renamed from: PX */
    private void m90949PX() {
        boolean z = true;
        if (!this.f14401bX.eqN().isEmpty()) {
            C6789eqN c6789eqN = new C6789eqN(this.f14401bX.eqN());
            this.f14405tC = c6789eqN;
            c6789eqN.m90842bg();
            this.f14405tC.m90841bg(new AbstractC6781bg.InterfaceC6785bg() { // from class: com.bytedance.adsdk.IL.bX.bX.bg.1
                {
                    AbstractC6742bg.this = this;
                }

                @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6785bg
                /* renamed from: bg */
                public void mo90776bg() {
                    boolean z2;
                    AbstractC6742bg abstractC6742bg = AbstractC6742bg.this;
                    if (abstractC6742bg.f14405tC.m90829WR() == 1.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    abstractC6742bg.m90952IL(z2);
                }
            });
            if (this.f14405tC.mo90813iR().floatValue() != 1.0f) {
                z = false;
            }
            m90952IL(z);
            m90931bg(this.f14405tC);
            return;
        }
        m90952IL(true);
    }

    /* renamed from: Ta */
    private void m90948Ta() {
        this.f14389IL.invalidateSelf();
    }

    private boolean yDt() {
        if (this.f14392LZ.m90858IL().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.f14392LZ.m90856bg().size(); i++) {
            if (this.f14392LZ.m90856bg().get(i).m91063bg() != C6709Kg.EnumC6710bg.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: IL */
    public C6748zx m90957IL() {
        return this.f14401bX;
    }

    /* renamed from: Kg */
    public boolean m90951Kg() {
        return this.f14397Uw;
    }

    /* renamed from: VB */
    public C6894eo mo90925VB() {
        return this.f14401bX.kMt();
    }

    /* renamed from: WR */
    public String m90947WR() {
        return this.f14401bX.ldr();
    }

    @Override // com.bytedance.adsdk.p183IL.p189bg.p191bg.InterfaceC6807bX
    /* renamed from: bg */
    public void mo90775bg(List<InterfaceC6807bX> list, List<InterfaceC6807bX> list2) {
    }

    /* renamed from: eo */
    public C6719bg mo90924eo() {
        return this.f14401bX.rri();
    }

    public Matrix eqN() {
        return this.aGH;
    }

    /* renamed from: iR */
    boolean m90929iR() {
        C6773Kg c6773Kg = this.f14392LZ;
        if (c6773Kg != null && !c6773Kg.m90858IL().isEmpty()) {
            return true;
        }
        return false;
    }

    public float ldr() {
        return this.f14399VW;
    }

    /* renamed from: zx */
    public String m90928zx() {
        C6748zx c6748zx = this.f14401bX;
        if (c6748zx != null) {
            return c6748zx.m90909iR();
        }
        return null;
    }

    private void eqN(Canvas canvas, Matrix matrix, AbstractC6781bg<C6730yDt, Path> abstractC6781bg, AbstractC6781bg<Integer, Integer> abstractC6781bg2) {
        C6863ldr.m90616bg(canvas, this.f14393Lq, this.f14398VB);
        this.f14404iR.set(abstractC6781bg.mo90813iR());
        this.f14404iR.transform(matrix);
        this.f14403eo.setAlpha((int) (abstractC6781bg2.mo90813iR().intValue() * 2.55f));
        canvas.drawPath(this.f14404iR, this.f14403eo);
        canvas.restore();
    }

    /* renamed from: IL */
    public void m90953IL(AbstractC6742bg abstractC6742bg) {
        this.kMt = abstractC6742bg;
    }

    /* renamed from: bX */
    boolean m90946bX() {
        return this.rri != null;
    }

    /* renamed from: IL */
    private void m90954IL(RectF rectF, Matrix matrix) {
        if (m90946bX() && this.f14401bX.m90917PX() != C6748zx.EnumC6749IL.INVERT) {
            this.VzQ.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.rri.mo90772bg(this.VzQ, matrix, true);
            if (rectF.intersect(this.VzQ)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: bX */
    private void m90945bX(float f) {
        this.f14389IL.kMt().m90735bX().m90594bg(this.f14401bX.ldr(), f);
    }

    /* renamed from: bg */
    public static AbstractC6742bg m90934bg(C6733IL c6733il, C6748zx c6748zx, C6687WR c6687wr, C6832iR c6832iR, Context context) {
        switch (C67442.f14410bg[c6748zx.m90915VB().ordinal()]) {
            case 1:
                return new C6746iR(c6687wr, c6748zx, c6733il, c6832iR);
            case 2:
                return new C6733IL(c6687wr, c6748zx, c6832iR.m90743IL(c6748zx.m90909iR()), c6832iR, context);
            case 3:
                return new C6735Kg(c6687wr, c6748zx);
            case 4:
                if (m90935bg(c6687wr, c6748zx)) {
                    return new C6741bX(c6687wr, c6748zx, context);
                }
                return new C6745eqN(c6687wr, c6748zx);
            case 5:
                return new C6747ldr(c6687wr, c6748zx);
            case 6:
                return new C6736WR(c6687wr, c6748zx);
            default:
                Objects.toString(c6748zx.m90915VB());
                return null;
        }
    }

    /* renamed from: zx */
    private void m90927zx(Canvas canvas, Matrix matrix, AbstractC6781bg<C6730yDt, Path> abstractC6781bg, AbstractC6781bg<Integer, Integer> abstractC6781bg2) {
        C6863ldr.m90616bg(canvas, this.f14393Lq, this.f14398VB);
        canvas.drawRect(this.f14393Lq, this.f14403eo);
        this.f14394PX.setAlpha((int) (abstractC6781bg2.mo90813iR().intValue() * 2.55f));
        this.f14404iR.set(abstractC6781bg.mo90813iR());
        this.f14404iR.transform(matrix);
        canvas.drawPath(this.f14404iR, this.f14394PX);
        canvas.restore();
    }

    /* renamed from: bX */
    private void m90944bX(Canvas canvas, Matrix matrix, AbstractC6781bg<C6730yDt, Path> abstractC6781bg, AbstractC6781bg<Integer, Integer> abstractC6781bg2) {
        C6863ldr.m90616bg(canvas, this.f14393Lq, this.f14394PX);
        canvas.drawRect(this.f14393Lq, this.f14403eo);
        this.f14394PX.setAlpha((int) (abstractC6781bg2.mo90813iR().intValue() * 2.55f));
        this.f14404iR.set(abstractC6781bg.mo90813iR());
        this.f14404iR.transform(matrix);
        canvas.drawPath(this.f14404iR, this.f14394PX);
        canvas.restore();
    }

    /* renamed from: IL */
    public void mo90923IL(Canvas canvas, Matrix matrix, int i) {
        m90941bg(i);
    }

    /* renamed from: IL */
    private void m90955IL(Canvas canvas, Matrix matrix, AbstractC6781bg<C6730yDt, Path> abstractC6781bg, AbstractC6781bg<Integer, Integer> abstractC6781bg2) {
        C6863ldr.m90616bg(canvas, this.f14393Lq, this.f14403eo);
        canvas.drawRect(this.f14393Lq, this.f14403eo);
        this.f14404iR.set(abstractC6781bg.mo90813iR());
        this.f14404iR.transform(matrix);
        this.f14403eo.setAlpha((int) (abstractC6781bg2.mo90813iR().intValue() * 2.55f));
        canvas.drawPath(this.f14404iR, this.f14394PX);
        canvas.restore();
    }

    /* renamed from: bg */
    private static boolean m90935bg(C6687WR c6687wr, C6748zx c6748zx) {
        C6821eo ldr;
        if (c6687wr == null || c6748zx == null || (ldr = c6687wr.ldr(c6748zx.m90909iR())) == null) {
            return false;
        }
        return "text:".equals(ldr.m90769WR());
    }

    /* renamed from: bg */
    public void mo90930bg(boolean z) {
        if (z && this.f14396Uq == null) {
            this.f14396Uq = new C6795bg();
        }
        this.DDQ = z;
    }

    /* renamed from: IL */
    public void m90952IL(boolean z) {
        if (z != this.f14397Uw) {
            this.f14397Uw = z;
            m90948Ta();
        }
    }

    @Override // com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg.InterfaceC6785bg
    /* renamed from: bg */
    public void mo90776bg() {
        m90948Ta();
    }

    /* renamed from: bg */
    public void m90933bg(AbstractC6742bg abstractC6742bg) {
        this.rri = abstractC6742bg;
    }

    /* renamed from: IL */
    public BlurMaskFilter m90956IL(float f) {
        if (this.f14407zx == f) {
            return this.ldr;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.ldr = blurMaskFilter;
        this.f14407zx = f;
        return blurMaskFilter;
    }

    /* renamed from: bg */
    public void m90931bg(AbstractC6781bg<?, ?> abstractC6781bg) {
        if (abstractC6781bg == null) {
            return;
        }
        this.f14390Ja.add(abstractC6781bg);
    }

    /* renamed from: bg */
    public void mo90772bg(RectF rectF, Matrix matrix, boolean z) {
        this.f14393Lq.set(0.0f, 0.0f, 0.0f, 0.0f);
        m90950Lq();
        this.f14402bg.set(matrix);
        if (z) {
            List<AbstractC6742bg> list = this.JAA;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f14402bg.preConcat(this.JAA.get(size).eqN.eqN());
                }
            } else {
                AbstractC6742bg abstractC6742bg = this.kMt;
                if (abstractC6742bg != null) {
                    this.f14402bg.preConcat(abstractC6742bg.eqN.eqN());
                }
            }
        }
        this.f14402bg.preConcat(this.eqN.eqN());
    }

    @Override // com.bytedance.adsdk.p183IL.p189bg.p191bg.InterfaceC6820zx
    /* renamed from: bg */
    public void mo90773bg(Canvas canvas, Matrix matrix, int i) {
        Paint paint;
        Integer mo90813iR;
        C6873zx.m90580bg(this.f14388Fy);
        if (this.f14397Uw && !this.f14401bX.m90908tC()) {
            m90950Lq();
            C6873zx.m90580bg("Layer#parentMatrix");
            this.aGH.set(matrix);
            this.f14391Kg.reset();
            this.f14391Kg.set(matrix);
            for (int size = this.JAA.size() - 1; size >= 0; size--) {
                this.f14391Kg.preConcat(this.JAA.get(size).eqN.eqN());
            }
            C6873zx.m90583IL("Layer#parentMatrix");
            AbstractC6781bg<?, Integer> m90821bg = this.eqN.m90821bg();
            int intValue = (int) ((((i / 255.0f) * ((m90821bg == null || (mo90813iR = m90821bg.mo90813iR()) == null) ? 100 : mo90813iR.intValue())) / 100.0f) * 255.0f);
            if (!m90946bX() && !m90929iR()) {
                this.f14391Kg.preConcat(this.eqN.eqN());
                C6873zx.m90580bg("Layer#drawLayer");
                mo90923IL(canvas, this.f14391Kg, intValue);
                C6873zx.m90583IL("Layer#drawLayer");
                m90945bX(C6873zx.m90583IL(this.f14388Fy));
                return;
            }
            C6873zx.m90580bg("Layer#computeBounds");
            mo90772bg(this.f14393Lq, this.f14391Kg, false);
            m90954IL(this.f14393Lq, matrix);
            this.f14391Kg.preConcat(this.eqN.eqN());
            m90936bg(this.f14393Lq, this.f14391Kg);
            this.f14406vb.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
            canvas.getMatrix(this.f14400WR);
            if (!this.f14400WR.isIdentity()) {
                Matrix matrix2 = this.f14400WR;
                matrix2.invert(matrix2);
                this.f14400WR.mapRect(this.f14406vb);
            }
            if (!this.f14393Lq.intersect(this.f14406vb)) {
                this.f14393Lq.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
            C6873zx.m90583IL("Layer#computeBounds");
            if (this.f14393Lq.width() >= 1.0f && this.f14393Lq.height() >= 1.0f) {
                C6873zx.m90580bg("Layer#saveLayer");
                this.f14403eo.setAlpha(255);
                C6863ldr.m90616bg(canvas, this.f14393Lq, this.f14403eo);
                C6873zx.m90583IL("Layer#saveLayer");
                m90940bg(canvas);
                C6873zx.m90580bg("Layer#drawLayer");
                mo90923IL(canvas, this.f14391Kg, intValue);
                C6873zx.m90583IL("Layer#drawLayer");
                if (m90929iR()) {
                    m90939bg(canvas, this.f14391Kg);
                }
                if (m90946bX()) {
                    C6873zx.m90580bg("Layer#drawMatte");
                    C6873zx.m90580bg("Layer#saveLayer");
                    C6863ldr.m90615bg(canvas, this.f14393Lq, this.f14395Ta, 19);
                    C6873zx.m90583IL("Layer#saveLayer");
                    m90940bg(canvas);
                    this.rri.mo90773bg(canvas, matrix, intValue);
                    C6873zx.m90580bg("Layer#restoreLayer");
                    canvas.restore();
                    C6873zx.m90583IL("Layer#restoreLayer");
                    C6873zx.m90583IL("Layer#drawMatte");
                }
                C6873zx.m90580bg("Layer#restoreLayer");
                canvas.restore();
                C6873zx.m90583IL("Layer#restoreLayer");
            }
            if (this.DDQ && (paint = this.f14396Uq) != null) {
                paint.setStyle(Paint.Style.STROKE);
                this.f14396Uq.setColor(-251901);
                this.f14396Uq.setStrokeWidth(4.0f);
                canvas.drawRect(this.f14393Lq, this.f14396Uq);
                this.f14396Uq.setStyle(Paint.Style.FILL);
                this.f14396Uq.setColor(1357638635);
                canvas.drawRect(this.f14393Lq, this.f14396Uq);
            }
            m90945bX(C6873zx.m90583IL(this.f14388Fy));
            return;
        }
        C6873zx.m90583IL(this.f14388Fy);
    }

    /* renamed from: bg */
    private void m90940bg(Canvas canvas) {
        C6873zx.m90580bg("Layer#clearLayer");
        RectF rectF = this.f14393Lq;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.yDt);
        C6873zx.m90583IL("Layer#clearLayer");
    }

    /* renamed from: bg */
    private void m90936bg(RectF rectF, Matrix matrix) {
        this.xxp.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (m90929iR()) {
            int size = this.f14392LZ.m90856bg().size();
            for (int i = 0; i < size; i++) {
                C6709Kg c6709Kg = this.f14392LZ.m90856bg().get(i);
                Path mo90813iR = this.f14392LZ.m90858IL().get(i).mo90813iR();
                if (mo90813iR != null) {
                    this.f14404iR.set(mo90813iR);
                    this.f14404iR.transform(matrix);
                    int i2 = C67442.f14409IL[c6709Kg.m91063bg().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        return;
                    }
                    if ((i2 == 3 || i2 == 4) && c6709Kg.eqN()) {
                        return;
                    }
                    this.f14404iR.computeBounds(this.tuV, false);
                    if (i == 0) {
                        this.xxp.set(this.tuV);
                    } else {
                        RectF rectF2 = this.xxp;
                        rectF2.set(Math.min(rectF2.left, this.tuV.left), Math.min(this.xxp.top, this.tuV.top), Math.max(this.xxp.right, this.tuV.right), Math.max(this.xxp.bottom, this.tuV.bottom));
                    }
                }
            }
            if (rectF.intersect(this.xxp)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    /* renamed from: bg */
    public void m90941bg(int i) {
        this.f14399VW = ((this.eqN.m90821bg() != null ? this.eqN.m90821bg().mo90813iR().intValue() : 100) / 100.0f) * (i / 255.0f);
    }

    /* renamed from: bg */
    private void m90939bg(Canvas canvas, Matrix matrix) {
        C6873zx.m90580bg("Layer#saveLayer");
        C6863ldr.m90615bg(canvas, this.f14393Lq, this.f14398VB, 19);
        if (Build.VERSION.SDK_INT < 28) {
            m90940bg(canvas);
        }
        C6873zx.m90583IL("Layer#saveLayer");
        for (int i = 0; i < this.f14392LZ.m90856bg().size(); i++) {
            C6709Kg c6709Kg = this.f14392LZ.m90856bg().get(i);
            AbstractC6781bg<C6730yDt, Path> abstractC6781bg = this.f14392LZ.m90858IL().get(i);
            AbstractC6781bg<Integer, Integer> abstractC6781bg2 = this.f14392LZ.m90857bX().get(i);
            int i2 = C67442.f14409IL[c6709Kg.m91063bg().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.f14403eo.setColor(ViewCompat.MEASURED_STATE_MASK);
                        this.f14403eo.setAlpha(255);
                        canvas.drawRect(this.f14393Lq, this.f14403eo);
                    }
                    if (c6709Kg.eqN()) {
                        m90944bX(canvas, matrix, abstractC6781bg, abstractC6781bg2);
                    } else {
                        m90938bg(canvas, matrix, abstractC6781bg);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (c6709Kg.eqN()) {
                            m90955IL(canvas, matrix, abstractC6781bg, abstractC6781bg2);
                        } else {
                            m90937bg(canvas, matrix, abstractC6781bg, abstractC6781bg2);
                        }
                    }
                } else if (c6709Kg.eqN()) {
                    m90927zx(canvas, matrix, abstractC6781bg, abstractC6781bg2);
                } else {
                    eqN(canvas, matrix, abstractC6781bg, abstractC6781bg2);
                }
            } else if (yDt()) {
                this.f14403eo.setAlpha(255);
                canvas.drawRect(this.f14393Lq, this.f14403eo);
            }
        }
        C6873zx.m90580bg("Layer#restoreLayer");
        canvas.restore();
        C6873zx.m90583IL("Layer#restoreLayer");
    }

    /* renamed from: bg */
    private void m90937bg(Canvas canvas, Matrix matrix, AbstractC6781bg<C6730yDt, Path> abstractC6781bg, AbstractC6781bg<Integer, Integer> abstractC6781bg2) {
        this.f14404iR.set(abstractC6781bg.mo90813iR());
        this.f14404iR.transform(matrix);
        this.f14403eo.setAlpha((int) (abstractC6781bg2.mo90813iR().intValue() * 2.55f));
        canvas.drawPath(this.f14404iR, this.f14403eo);
    }

    /* renamed from: bg */
    private void m90938bg(Canvas canvas, Matrix matrix, AbstractC6781bg<C6730yDt, Path> abstractC6781bg) {
        this.f14404iR.set(abstractC6781bg.mo90813iR());
        this.f14404iR.transform(matrix);
        canvas.drawPath(this.f14404iR, this.f14394PX);
    }

    /* renamed from: bg */
    public void mo90942bg(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        this.eqN.m90820bg(f);
        if (this.f14392LZ != null) {
            for (int i = 0; i < this.f14392LZ.m90858IL().size(); i++) {
                this.f14392LZ.m90858IL().get(i).mo90814bg(f);
            }
        }
        C6789eqN c6789eqN = this.f14405tC;
        if (c6789eqN != null) {
            c6789eqN.mo90814bg(f);
        }
        AbstractC6742bg abstractC6742bg = this.rri;
        if (abstractC6742bg != null) {
            abstractC6742bg.mo90942bg(f);
        }
        for (int i2 = 0; i2 < this.f14390Ja.size(); i2++) {
            this.f14390Ja.get(i2).mo90814bg(f);
        }
    }
}
