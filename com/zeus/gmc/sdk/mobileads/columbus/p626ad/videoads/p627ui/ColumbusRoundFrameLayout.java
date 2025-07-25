package com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.p627ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.zeus.gmc.sdk.mobileads.columbus.C32065R;
import com.zeus.gmc.sdk.mobileads.columbus.util.AndroidUtils;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.ui.ColumbusRoundFrameLayout */
/* loaded from: classes8.dex */
public class ColumbusRoundFrameLayout extends FrameLayout {
    private float c2oc2i;
    private int c2oc2o;
    private int cco22;
    private float ccoc2oic;
    private final Paint cicc2iiccc;
    private final float[] cicic;
    private float cii2c2;
    private final Path ciii2coi2;
    private float cioccoiococ;
    private float coi222o222;
    private final RectF coiic;
    private int coiio2;
    private float coo2iico;

    public ColumbusRoundFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    private void coo2iico(@Nullable AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C32065R.styleable.ColumbusRoundFrameLayout);
            if (AndroidUtils.isRTL(getContext())) {
                float dimension = obtainStyledAttributes.getDimension(C32065R.styleable.ColumbusRoundFrameLayout_columbus_round_top_right, this.coi222o222);
                this.coo2iico = dimension;
                this.coi222o222 = obtainStyledAttributes.getDimension(C32065R.styleable.ColumbusRoundFrameLayout_columbus_round_top_left, dimension);
                float dimension2 = obtainStyledAttributes.getDimension(C32065R.styleable.ColumbusRoundFrameLayout_columbus_round_bottom_right, this.cioccoiococ);
                this.c2oc2i = dimension2;
                this.cioccoiococ = obtainStyledAttributes.getDimension(C32065R.styleable.ColumbusRoundFrameLayout_columbus_round_bottom_left, dimension2);
            } else {
                this.coo2iico = obtainStyledAttributes.getDimension(C32065R.styleable.ColumbusRoundFrameLayout_columbus_round_top_left, this.coo2iico);
                this.coi222o222 = obtainStyledAttributes.getDimension(C32065R.styleable.ColumbusRoundFrameLayout_columbus_round_top_right, this.coi222o222);
                this.c2oc2i = obtainStyledAttributes.getDimension(C32065R.styleable.ColumbusRoundFrameLayout_columbus_round_bottom_left, this.c2oc2i);
                this.cioccoiococ = obtainStyledAttributes.getDimension(C32065R.styleable.ColumbusRoundFrameLayout_columbus_round_bottom_right, this.cioccoiococ);
            }
            this.c2oc2o = obtainStyledAttributes.getInt(C32065R.styleable.ColumbusRoundFrameLayout_columbus_round_width, this.c2oc2o);
            int i = obtainStyledAttributes.getInt(C32065R.styleable.ColumbusRoundFrameLayout_columbus_round_height, this.cco22);
            this.cco22 = i;
            int i2 = this.c2oc2o;
            if (i2 > 0 && i > 0) {
                float f = i2 / i;
                this.cii2c2 = f;
                setAspectRatio(f);
            }
            this.coiio2 = obtainStyledAttributes.getColor(C32065R.styleable.ColumbusRoundFrameLayout_columbus_round_border_color, this.coiio2);
            this.ccoc2oic = obtainStyledAttributes.getDimension(C32065R.styleable.ColumbusRoundFrameLayout_columbus_round_border_width, this.ccoc2oic);
            obtainStyledAttributes.recycle();
        }
        this.cicc2iiccc.setAntiAlias(true);
        float[] fArr = this.cicic;
        float f2 = this.coo2iico;
        fArr[0] = f2;
        fArr[1] = f2;
        float f3 = this.coi222o222;
        fArr[2] = f3;
        fArr[3] = f3;
        float f4 = this.cioccoiococ;
        fArr[4] = f4;
        fArr[5] = f4;
        float f5 = this.c2oc2i;
        fArr[6] = f5;
        fArr[7] = f5;
        setWillNotDraw(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.ccoc2oic > 0.0f) {
            canvas.save();
            this.cicc2iiccc.setStrokeWidth(this.ccoc2oic);
            this.cicc2iiccc.setColor(this.coiio2);
            this.cicc2iiccc.setStyle(Paint.Style.STROKE);
            canvas.drawPath(this.ciii2coi2, this.cicc2iiccc);
            canvas.restore();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.coo2iico > 0.0f || this.coi222o222 > 0.0f || this.c2oc2i > 0.0f || this.cioccoiococ > 0.0f) {
            this.ciii2coi2.reset();
            if (AndroidUtils.isRTL(getContext())) {
                this.coiic.left = getMeasuredWidth();
                this.coiic.right = 0.0f;
            } else {
                RectF rectF = this.coiic;
                rectF.left = 0.0f;
                rectF.right = getMeasuredWidth();
            }
            RectF rectF2 = this.coiic;
            rectF2.top = 0.0f;
            rectF2.bottom = getMeasuredHeight();
            this.ciii2coi2.addRoundRect(this.coiic, this.cicic, Path.Direction.CW);
            canvas.clipPath(this.ciii2coi2);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.cii2c2 > 0.0f) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode == 1073741824 && mode2 != 1073741824) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) / this.cii2c2), 1073741824));
                return;
            } else if (mode != 1073741824 && mode2 == 1073741824) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i2) * this.cii2c2), 1073741824), i2);
                return;
            } else {
                super.onMeasure(i, i2);
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setAspectRatio(float f) {
        requestLayout();
    }

    public ColumbusRoundFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColumbusRoundFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.coo2iico = 0.0f;
        this.coi222o222 = 0.0f;
        this.c2oc2i = 0.0f;
        this.cioccoiococ = 0.0f;
        this.c2oc2o = 0;
        this.cco22 = 0;
        this.cii2c2 = 0.0f;
        this.ciii2coi2 = new Path();
        this.coiic = new RectF();
        this.cicic = new float[8];
        this.cicc2iiccc = new Paint();
        this.ccoc2oic = 0.0f;
        this.coiio2 = 0;
        coo2iico(attributeSet);
    }

    public void coo2iico(float f, float f2, float f3, float f4) {
        this.coo2iico = f;
        this.coi222o222 = f2;
        this.cioccoiococ = f3;
        this.c2oc2i = f4;
        float[] fArr = this.cicic;
        fArr[0] = f;
        fArr[1] = f;
        fArr[2] = f2;
        fArr[3] = f2;
        fArr[4] = f3;
        fArr[5] = f3;
        fArr[6] = f4;
        fArr[7] = f4;
        invalidate();
    }
}
