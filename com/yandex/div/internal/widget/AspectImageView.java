package com.yandex.div.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import be.MathJVM;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.core.widget.C29788l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.InterfaceC37618e;
import kotlin.ranges._Ranges;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1072z8.C45193i;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: AspectImageView.kt */
@Metadata
/* loaded from: classes8.dex */
public class AspectImageView extends AppCompatImageView implements AspectView {

    /* renamed from: i */
    static final /* synthetic */ KProperty<Object>[] f76054i = {Reflection.m17039e(new MutablePropertyReference1Impl(AspectImageView.class, "gravity", "getGravity()I", 0)), Reflection.m17039e(new MutablePropertyReference1Impl(AspectImageView.class, "aspectRatio", "getAspectRatio()F", 0)), Reflection.m17039e(new MutablePropertyReference1Impl(AspectImageView.class, "imageScale", "getImageScale()Lcom/yandex/div/internal/widget/AspectImageView$Scale;", 0))};
    @NotNull

    /* renamed from: c */
    private final InterfaceC37618e f76055c;
    @NotNull

    /* renamed from: d */
    private final InterfaceC37618e f76056d;
    @NotNull

    /* renamed from: f */
    private final InterfaceC37618e f76057f;
    @NotNull

    /* renamed from: g */
    private final Matrix f76058g;

    /* renamed from: h */
    private boolean f76059h;

    /* compiled from: AspectImageView.kt */
    @Metadata
    /* renamed from: com.yandex.div.internal.widget.AspectImageView$a */
    /* loaded from: classes8.dex */
    public enum EnumC29793a {
        NO_SCALE,
        FIT,
        FILL,
        STRETCH
    }

    /* compiled from: AspectImageView.kt */
    @Metadata
    /* renamed from: com.yandex.div.internal.widget.AspectImageView$b */
    /* loaded from: classes8.dex */
    public /* synthetic */ class C29794b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC29793a.values().length];
            try {
                iArr[EnumC29793a.NO_SCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC29793a.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC29793a.FILL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC29793a.STRETCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AspectImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    private final void m36437a(int i, int i2) {
        boolean z;
        float aspectRatio = getAspectRatio();
        if (aspectRatio == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        boolean canResizeWidth = canResizeWidth(i);
        boolean canResizeHeight = canResizeHeight(i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (!canResizeWidth && !canResizeHeight) {
            measuredHeight = MathJVM.m103791d(measuredWidth / aspectRatio);
        } else if (!canResizeWidth && canResizeHeight) {
            measuredHeight = MathJVM.m103791d(measuredWidth / aspectRatio);
        } else if (canResizeWidth && !canResizeHeight) {
            measuredWidth = MathJVM.m103791d(measuredHeight * aspectRatio);
        } else if (canResizeWidth && canResizeHeight) {
            measuredHeight = MathJVM.m103791d(measuredWidth / aspectRatio);
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(measuredWidth, mode), View.MeasureSpec.makeMeasureSpec(measuredHeight, mode2));
    }

    /* renamed from: b */
    private final void m36436b(int i, int i2) {
        int m16917e;
        int m16917e2;
        float f;
        float f2;
        float f3;
        Drawable drawable = getDrawable();
        if (drawable != null) {
            m16917e = _Ranges.m16917e((i - getPaddingLeft()) - getPaddingRight(), 0);
            float f4 = m16917e;
            m16917e2 = _Ranges.m16917e((i2 - getPaddingTop()) - getPaddingBottom(), 0);
            float f5 = m16917e2;
            float intrinsicWidth = drawable.getIntrinsicWidth();
            float intrinsicHeight = drawable.getIntrinsicHeight();
            int absoluteGravity = GravityCompat.getAbsoluteGravity(getGravity(), ViewCompat.getLayoutDirection(this));
            EnumC29793a imageScale = getImageScale();
            int[] iArr = C29794b.$EnumSwitchMapping$0;
            int i3 = iArr[imageScale.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            f = f4 / intrinsicWidth;
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        f = Math.max(f4 / intrinsicWidth, f5 / intrinsicHeight);
                    }
                } else {
                    f = Math.min(f4 / intrinsicWidth, f5 / intrinsicHeight);
                }
            } else {
                f = 1.0f;
            }
            if (iArr[getImageScale().ordinal()] == 4) {
                f2 = f5 / intrinsicHeight;
            } else {
                f2 = f;
            }
            int i4 = absoluteGravity & 7;
            float f6 = 0.0f;
            if (i4 != 1) {
                if (i4 != 5) {
                    f3 = 0.0f;
                } else {
                    f3 = f4 - (intrinsicWidth * f);
                }
            } else {
                f3 = (f4 - (intrinsicWidth * f)) / 2;
            }
            int i5 = absoluteGravity & 112;
            if (i5 != 16) {
                if (i5 == 80) {
                    f6 = f5 - (intrinsicHeight * f2);
                }
            } else {
                f6 = (f5 - (intrinsicHeight * f2)) / 2;
            }
            Matrix matrix = this.f76058g;
            matrix.reset();
            matrix.postScale(f, f2);
            matrix.postTranslate(f3, f6);
            setImageMatrix(this.f76058g);
        }
    }

    protected boolean canResizeHeight(int i) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return true;
        }
        return false;
    }

    protected boolean canResizeWidth(int i) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return true;
        }
        return false;
    }

    public final float getAspectRatio() {
        return ((Number) this.f76056d.getValue(this, f76054i[1])).floatValue();
    }

    @Override // android.widget.ImageView, android.view.View
    public int getBaseline() {
        return getMeasuredHeight() - getPaddingBottom();
    }

    public final int getGravity() {
        return ((Number) this.f76055c.getValue(this, f76054i[0])).intValue();
    }

    @NotNull
    public final EnumC29793a getImageScale() {
        return (EnumC29793a) this.f76057f.getValue(this, f76054i[2]);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        this.f76059h = true;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if ((getImageMatrix() == null || Intrinsics.m17075f(getImageMatrix(), this.f76058g)) && this.f76059h && getWidth() > 0 && getHeight() > 0) {
            m36436b(getWidth(), getHeight());
            this.f76059h = false;
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f76059h = true;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m36437a(i, i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f76059h = true;
    }

    @Override // com.yandex.div.core.widget.AspectView
    public final void setAspectRatio(float f) {
        this.f76056d.setValue(this, f76054i[1], Float.valueOf(f));
    }

    public final void setGravity(int i) {
        this.f76055c.setValue(this, f76054i[0], Integer.valueOf(i));
    }

    public final void setImageScale(@NotNull EnumC29793a enumC29793a) {
        Intrinsics.checkNotNullParameter(enumC29793a, "<set-?>");
        this.f76057f.setValue(this, f76054i[2], enumC29793a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AspectImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AspectImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f76055c = C29788l.m36504b(0, null, 2, null);
        this.f76056d = AspectView.f76009X7.m36529a();
        this.f76057f = C29788l.m36502d(EnumC29793a.NO_SCALE, null, 2, null);
        this.f76058g = new Matrix();
        this.f76059h = true;
        super.setScaleType(ImageView.ScaleType.MATRIX);
        if (isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C45193i.AspectImageView, i, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…ageView, defStyleAttr, 0)");
            try {
                setGravity(obtainStyledAttributes.getInt(C45193i.AspectImageView_android_gravity, 0));
                setAspectRatio(obtainStyledAttributes.getFloat(C45193i.AspectImageView_aspectRatio, 0.0f));
                setImageScale(EnumC29793a.values()[obtainStyledAttributes.getInteger(C45193i.AspectImageView_imageScale, 0)]);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(@Nullable ImageView.ScaleType scaleType) {
    }
}
