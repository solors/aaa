package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.AttrRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.material.C16310R;

/* loaded from: classes5.dex */
public class ShapeAppearanceModel {
    public static final CornerSize PILL = new RelativeCornerSize(0.5f);

    /* renamed from: a */
    CornerTreatment f38194a;

    /* renamed from: b */
    CornerTreatment f38195b;

    /* renamed from: c */
    CornerTreatment f38196c;

    /* renamed from: d */
    CornerTreatment f38197d;

    /* renamed from: e */
    CornerSize f38198e;

    /* renamed from: f */
    CornerSize f38199f;

    /* renamed from: g */
    CornerSize f38200g;

    /* renamed from: h */
    CornerSize f38201h;

    /* renamed from: i */
    EdgeTreatment f38202i;

    /* renamed from: j */
    EdgeTreatment f38203j;

    /* renamed from: k */
    EdgeTreatment f38204k;

    /* renamed from: l */
    EdgeTreatment f38205l;

    /* loaded from: classes5.dex */
    public static final class Builder {
        @NonNull

        /* renamed from: a */
        private CornerTreatment f38206a;
        @NonNull

        /* renamed from: b */
        private CornerTreatment f38207b;
        @NonNull

        /* renamed from: c */
        private CornerTreatment f38208c;
        @NonNull

        /* renamed from: d */
        private CornerTreatment f38209d;
        @NonNull

        /* renamed from: e */
        private CornerSize f38210e;
        @NonNull

        /* renamed from: f */
        private CornerSize f38211f;
        @NonNull

        /* renamed from: g */
        private CornerSize f38212g;
        @NonNull

        /* renamed from: h */
        private CornerSize f38213h;
        @NonNull

        /* renamed from: i */
        private EdgeTreatment f38214i;
        @NonNull

        /* renamed from: j */
        private EdgeTreatment f38215j;
        @NonNull

        /* renamed from: k */
        private EdgeTreatment f38216k;
        @NonNull

        /* renamed from: l */
        private EdgeTreatment f38217l;

        public Builder() {
            this.f38206a = MaterialShapeUtils.m71080b();
            this.f38207b = MaterialShapeUtils.m71080b();
            this.f38208c = MaterialShapeUtils.m71080b();
            this.f38209d = MaterialShapeUtils.m71080b();
            this.f38210e = new AbsoluteCornerSize(0.0f);
            this.f38211f = new AbsoluteCornerSize(0.0f);
            this.f38212g = new AbsoluteCornerSize(0.0f);
            this.f38213h = new AbsoluteCornerSize(0.0f);
            this.f38214i = MaterialShapeUtils.m71079c();
            this.f38215j = MaterialShapeUtils.m71079c();
            this.f38216k = MaterialShapeUtils.m71079c();
            this.f38217l = MaterialShapeUtils.m71079c();
        }

        /* renamed from: m */
        private static float m71062m(CornerTreatment cornerTreatment) {
            if (cornerTreatment instanceof RoundedCornerTreatment) {
                return ((RoundedCornerTreatment) cornerTreatment).f38193a;
            }
            if (cornerTreatment instanceof CutCornerTreatment) {
                return ((CutCornerTreatment) cornerTreatment).f38153a;
            }
            return -1.0f;
        }

        @NonNull
        public ShapeAppearanceModel build() {
            return new ShapeAppearanceModel(this);
        }

        @NonNull
        public Builder setAllCornerSizes(@NonNull CornerSize cornerSize) {
            return setTopLeftCornerSize(cornerSize).setTopRightCornerSize(cornerSize).setBottomRightCornerSize(cornerSize).setBottomLeftCornerSize(cornerSize);
        }

        @NonNull
        public Builder setAllCorners(int i, @Dimension float f) {
            return setAllCorners(MaterialShapeUtils.m71081a(i)).setAllCornerSizes(f);
        }

        @NonNull
        public Builder setAllEdges(@NonNull EdgeTreatment edgeTreatment) {
            return setLeftEdge(edgeTreatment).setTopEdge(edgeTreatment).setRightEdge(edgeTreatment).setBottomEdge(edgeTreatment);
        }

        @NonNull
        public Builder setBottomEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.f38216k = edgeTreatment;
            return this;
        }

        @NonNull
        public Builder setBottomLeftCorner(int i, @Dimension float f) {
            return setBottomLeftCorner(MaterialShapeUtils.m71081a(i)).setBottomLeftCornerSize(f);
        }

        @NonNull
        public Builder setBottomLeftCornerSize(@Dimension float f) {
            this.f38213h = new AbsoluteCornerSize(f);
            return this;
        }

        @NonNull
        public Builder setBottomRightCorner(int i, @Dimension float f) {
            return setBottomRightCorner(MaterialShapeUtils.m71081a(i)).setBottomRightCornerSize(f);
        }

        @NonNull
        public Builder setBottomRightCornerSize(@Dimension float f) {
            this.f38212g = new AbsoluteCornerSize(f);
            return this;
        }

        @NonNull
        public Builder setLeftEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.f38217l = edgeTreatment;
            return this;
        }

        @NonNull
        public Builder setRightEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.f38215j = edgeTreatment;
            return this;
        }

        @NonNull
        public Builder setTopEdge(@NonNull EdgeTreatment edgeTreatment) {
            this.f38214i = edgeTreatment;
            return this;
        }

        @NonNull
        public Builder setTopLeftCorner(int i, @Dimension float f) {
            return setTopLeftCorner(MaterialShapeUtils.m71081a(i)).setTopLeftCornerSize(f);
        }

        @NonNull
        public Builder setTopLeftCornerSize(@Dimension float f) {
            this.f38210e = new AbsoluteCornerSize(f);
            return this;
        }

        @NonNull
        public Builder setTopRightCorner(int i, @Dimension float f) {
            return setTopRightCorner(MaterialShapeUtils.m71081a(i)).setTopRightCornerSize(f);
        }

        @NonNull
        public Builder setTopRightCornerSize(@Dimension float f) {
            this.f38211f = new AbsoluteCornerSize(f);
            return this;
        }

        @NonNull
        public Builder setBottomLeftCornerSize(@NonNull CornerSize cornerSize) {
            this.f38213h = cornerSize;
            return this;
        }

        @NonNull
        public Builder setBottomRightCornerSize(@NonNull CornerSize cornerSize) {
            this.f38212g = cornerSize;
            return this;
        }

        @NonNull
        public Builder setTopLeftCornerSize(@NonNull CornerSize cornerSize) {
            this.f38210e = cornerSize;
            return this;
        }

        @NonNull
        public Builder setTopRightCornerSize(@NonNull CornerSize cornerSize) {
            this.f38211f = cornerSize;
            return this;
        }

        @NonNull
        public Builder setAllCorners(@NonNull CornerTreatment cornerTreatment) {
            return setTopLeftCorner(cornerTreatment).setTopRightCorner(cornerTreatment).setBottomRightCorner(cornerTreatment).setBottomLeftCorner(cornerTreatment);
        }

        @NonNull
        public Builder setBottomLeftCorner(int i, @NonNull CornerSize cornerSize) {
            return setBottomLeftCorner(MaterialShapeUtils.m71081a(i)).setBottomLeftCornerSize(cornerSize);
        }

        @NonNull
        public Builder setBottomRightCorner(int i, @NonNull CornerSize cornerSize) {
            return setBottomRightCorner(MaterialShapeUtils.m71081a(i)).setBottomRightCornerSize(cornerSize);
        }

        @NonNull
        public Builder setTopLeftCorner(int i, @NonNull CornerSize cornerSize) {
            return setTopLeftCorner(MaterialShapeUtils.m71081a(i)).setTopLeftCornerSize(cornerSize);
        }

        @NonNull
        public Builder setTopRightCorner(int i, @NonNull CornerSize cornerSize) {
            return setTopRightCorner(MaterialShapeUtils.m71081a(i)).setTopRightCornerSize(cornerSize);
        }

        @NonNull
        public Builder setAllCornerSizes(@Dimension float f) {
            return setTopLeftCornerSize(f).setTopRightCornerSize(f).setBottomRightCornerSize(f).setBottomLeftCornerSize(f);
        }

        @NonNull
        public Builder setBottomLeftCorner(@NonNull CornerTreatment cornerTreatment) {
            this.f38209d = cornerTreatment;
            float m71062m = m71062m(cornerTreatment);
            if (m71062m != -1.0f) {
                setBottomLeftCornerSize(m71062m);
            }
            return this;
        }

        @NonNull
        public Builder setBottomRightCorner(@NonNull CornerTreatment cornerTreatment) {
            this.f38208c = cornerTreatment;
            float m71062m = m71062m(cornerTreatment);
            if (m71062m != -1.0f) {
                setBottomRightCornerSize(m71062m);
            }
            return this;
        }

        @NonNull
        public Builder setTopLeftCorner(@NonNull CornerTreatment cornerTreatment) {
            this.f38206a = cornerTreatment;
            float m71062m = m71062m(cornerTreatment);
            if (m71062m != -1.0f) {
                setTopLeftCornerSize(m71062m);
            }
            return this;
        }

        @NonNull
        public Builder setTopRightCorner(@NonNull CornerTreatment cornerTreatment) {
            this.f38207b = cornerTreatment;
            float m71062m = m71062m(cornerTreatment);
            if (m71062m != -1.0f) {
                setTopRightCornerSize(m71062m);
            }
            return this;
        }

        public Builder(@NonNull ShapeAppearanceModel shapeAppearanceModel) {
            this.f38206a = MaterialShapeUtils.m71080b();
            this.f38207b = MaterialShapeUtils.m71080b();
            this.f38208c = MaterialShapeUtils.m71080b();
            this.f38209d = MaterialShapeUtils.m71080b();
            this.f38210e = new AbsoluteCornerSize(0.0f);
            this.f38211f = new AbsoluteCornerSize(0.0f);
            this.f38212g = new AbsoluteCornerSize(0.0f);
            this.f38213h = new AbsoluteCornerSize(0.0f);
            this.f38214i = MaterialShapeUtils.m71079c();
            this.f38215j = MaterialShapeUtils.m71079c();
            this.f38216k = MaterialShapeUtils.m71079c();
            this.f38217l = MaterialShapeUtils.m71079c();
            this.f38206a = shapeAppearanceModel.f38194a;
            this.f38207b = shapeAppearanceModel.f38195b;
            this.f38208c = shapeAppearanceModel.f38196c;
            this.f38209d = shapeAppearanceModel.f38197d;
            this.f38210e = shapeAppearanceModel.f38198e;
            this.f38211f = shapeAppearanceModel.f38199f;
            this.f38212g = shapeAppearanceModel.f38200g;
            this.f38213h = shapeAppearanceModel.f38201h;
            this.f38214i = shapeAppearanceModel.f38202i;
            this.f38215j = shapeAppearanceModel.f38203j;
            this.f38216k = shapeAppearanceModel.f38204k;
            this.f38217l = shapeAppearanceModel.f38205l;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes5.dex */
    public interface CornerSizeUnaryOperator {
        @NonNull
        CornerSize apply(@NonNull CornerSize cornerSize);
    }

    @NonNull
    /* renamed from: a */
    private static Builder m71077a(Context context, @StyleRes int i, @StyleRes int i2, int i3) {
        return m71076b(context, i, i2, new AbsoluteCornerSize(i3));
    }

    @NonNull
    /* renamed from: b */
    private static Builder m71076b(Context context, @StyleRes int i, @StyleRes int i2, @NonNull CornerSize cornerSize) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C16310R.styleable.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(C16310R.styleable.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(C16310R.styleable.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(C16310R.styleable.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(C16310R.styleable.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(C16310R.styleable.ShapeAppearance_cornerFamilyBottomLeft, i3);
            CornerSize m71075c = m71075c(obtainStyledAttributes, C16310R.styleable.ShapeAppearance_cornerSize, cornerSize);
            CornerSize m71075c2 = m71075c(obtainStyledAttributes, C16310R.styleable.ShapeAppearance_cornerSizeTopLeft, m71075c);
            CornerSize m71075c3 = m71075c(obtainStyledAttributes, C16310R.styleable.ShapeAppearance_cornerSizeTopRight, m71075c);
            CornerSize m71075c4 = m71075c(obtainStyledAttributes, C16310R.styleable.ShapeAppearance_cornerSizeBottomRight, m71075c);
            return new Builder().setTopLeftCorner(i4, m71075c2).setTopRightCorner(i5, m71075c3).setBottomRightCorner(i6, m71075c4).setBottomLeftCorner(i7, m71075c(obtainStyledAttributes, C16310R.styleable.ShapeAppearance_cornerSizeBottomLeft, m71075c));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @NonNull
    public static Builder builder() {
        return new Builder();
    }

    @NonNull
    /* renamed from: c */
    private static CornerSize m71075c(TypedArray typedArray, int i, @NonNull CornerSize cornerSize) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cornerSize;
        }
        int i2 = peekValue.type;
        if (i2 == 5) {
            return new AbsoluteCornerSize(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i2 == 6) {
            return new RelativeCornerSize(peekValue.getFraction(1.0f, 1.0f));
        }
        return cornerSize;
    }

    @NonNull
    public EdgeTreatment getBottomEdge() {
        return this.f38204k;
    }

    @NonNull
    public CornerTreatment getBottomLeftCorner() {
        return this.f38197d;
    }

    @NonNull
    public CornerSize getBottomLeftCornerSize() {
        return this.f38201h;
    }

    @NonNull
    public CornerTreatment getBottomRightCorner() {
        return this.f38196c;
    }

    @NonNull
    public CornerSize getBottomRightCornerSize() {
        return this.f38200g;
    }

    @NonNull
    public EdgeTreatment getLeftEdge() {
        return this.f38205l;
    }

    @NonNull
    public EdgeTreatment getRightEdge() {
        return this.f38203j;
    }

    @NonNull
    public EdgeTreatment getTopEdge() {
        return this.f38202i;
    }

    @NonNull
    public CornerTreatment getTopLeftCorner() {
        return this.f38194a;
    }

    @NonNull
    public CornerSize getTopLeftCornerSize() {
        return this.f38198e;
    }

    @NonNull
    public CornerTreatment getTopRightCorner() {
        return this.f38195b;
    }

    @NonNull
    public CornerSize getTopRightCornerSize() {
        return this.f38199f;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean isRoundRect(@NonNull RectF rectF) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f38205l.getClass().equals(EdgeTreatment.class) && this.f38203j.getClass().equals(EdgeTreatment.class) && this.f38202i.getClass().equals(EdgeTreatment.class) && this.f38204k.getClass().equals(EdgeTreatment.class)) {
            z = true;
        } else {
            z = false;
        }
        float cornerSize = this.f38198e.getCornerSize(rectF);
        if (this.f38199f.getCornerSize(rectF) == cornerSize && this.f38201h.getCornerSize(rectF) == cornerSize && this.f38200g.getCornerSize(rectF) == cornerSize) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((this.f38195b instanceof RoundedCornerTreatment) && (this.f38194a instanceof RoundedCornerTreatment) && (this.f38196c instanceof RoundedCornerTreatment) && (this.f38197d instanceof RoundedCornerTreatment)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z && z2 && z3) {
            return true;
        }
        return false;
    }

    @NonNull
    public Builder toBuilder() {
        return new Builder(this);
    }

    @NonNull
    public ShapeAppearanceModel withCornerSize(float f) {
        return toBuilder().setAllCornerSizes(f).build();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ShapeAppearanceModel withTransformedCornerSizes(@NonNull CornerSizeUnaryOperator cornerSizeUnaryOperator) {
        return toBuilder().setTopLeftCornerSize(cornerSizeUnaryOperator.apply(getTopLeftCornerSize())).setTopRightCornerSize(cornerSizeUnaryOperator.apply(getTopRightCornerSize())).setBottomLeftCornerSize(cornerSizeUnaryOperator.apply(getBottomLeftCornerSize())).setBottomRightCornerSize(cornerSizeUnaryOperator.apply(getBottomRightCornerSize())).build();
    }

    private ShapeAppearanceModel(@NonNull Builder builder) {
        this.f38194a = builder.f38206a;
        this.f38195b = builder.f38207b;
        this.f38196c = builder.f38208c;
        this.f38197d = builder.f38209d;
        this.f38198e = builder.f38210e;
        this.f38199f = builder.f38211f;
        this.f38200g = builder.f38212g;
        this.f38201h = builder.f38213h;
        this.f38202i = builder.f38214i;
        this.f38203j = builder.f38215j;
        this.f38204k = builder.f38216k;
        this.f38205l = builder.f38217l;
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        return builder(context, attributeSet, i, i2, 0);
    }

    @NonNull
    public ShapeAppearanceModel withCornerSize(@NonNull CornerSize cornerSize) {
        return toBuilder().setAllCornerSizes(cornerSize).build();
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2, int i3) {
        return builder(context, attributeSet, i, i2, new AbsoluteCornerSize(i3));
    }

    @NonNull
    public static Builder builder(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2, @NonNull CornerSize cornerSize) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16310R.styleable.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C16310R.styleable.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C16310R.styleable.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return m71076b(context, resourceId, resourceId2, cornerSize);
    }

    @NonNull
    public static Builder builder(Context context, @StyleRes int i, @StyleRes int i2) {
        return m71077a(context, i, i2, 0);
    }

    public ShapeAppearanceModel() {
        this.f38194a = MaterialShapeUtils.m71080b();
        this.f38195b = MaterialShapeUtils.m71080b();
        this.f38196c = MaterialShapeUtils.m71080b();
        this.f38197d = MaterialShapeUtils.m71080b();
        this.f38198e = new AbsoluteCornerSize(0.0f);
        this.f38199f = new AbsoluteCornerSize(0.0f);
        this.f38200g = new AbsoluteCornerSize(0.0f);
        this.f38201h = new AbsoluteCornerSize(0.0f);
        this.f38202i = MaterialShapeUtils.m71079c();
        this.f38203j = MaterialShapeUtils.m71079c();
        this.f38204k = MaterialShapeUtils.m71079c();
        this.f38205l = MaterialShapeUtils.m71079c();
    }
}
