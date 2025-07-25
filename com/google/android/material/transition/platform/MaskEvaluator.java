package com.google.android.material.transition.platform;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.RequiresApi;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.transition.platform.MaterialContainerTransform;

@RequiresApi(21)
/* loaded from: classes5.dex */
class MaskEvaluator {

    /* renamed from: a */
    private final Path f39088a = new Path();

    /* renamed from: b */
    private final Path f39089b = new Path();

    /* renamed from: c */
    private final Path f39090c = new Path();

    /* renamed from: d */
    private final ShapeAppearancePathProvider f39091d = ShapeAppearancePathProvider.getInstance();

    /* renamed from: e */
    private ShapeAppearanceModel f39092e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m70232a(Canvas canvas) {
        canvas.clipPath(this.f39088a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m70231b(float f, ShapeAppearanceModel shapeAppearanceModel, ShapeAppearanceModel shapeAppearanceModel2, RectF rectF, RectF rectF2, RectF rectF3, MaterialContainerTransform.ProgressThresholds progressThresholds) {
        ShapeAppearanceModel m70149o = TransitionUtils.m70149o(shapeAppearanceModel, shapeAppearanceModel2, rectF, rectF3, progressThresholds.getStart(), progressThresholds.getEnd(), f);
        this.f39092e = m70149o;
        this.f39091d.calculatePath(m70149o, 1.0f, rectF2, this.f39089b);
        this.f39091d.calculatePath(this.f39092e, 1.0f, rectF3, this.f39090c);
        this.f39088a.op(this.f39089b, this.f39090c, Path.Op.UNION);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public ShapeAppearanceModel m70230c() {
        return this.f39092e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public Path m70229d() {
        return this.f39088a;
    }
}
