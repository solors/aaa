package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.InterfaceC0152Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.material.C16310R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes5.dex */
public final class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {
    public static final int DEF_STYLE_RES = C16310R.C16317style.Widget_MaterialComponents_CircularProgressIndicator;
    public static final int INDICATOR_DIRECTION_CLOCKWISE = 0;
    public static final int INDICATOR_DIRECTION_COUNTERCLOCKWISE = 1;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes5.dex */
    public @interface IndicatorDirection {
    }

    public CircularProgressIndicator(@NonNull Context context) {
        this(context, null);
    }

    /* renamed from: q */
    private void m71181q() {
        setIndeterminateDrawable(IndeterminateDrawable.createCircularDrawable(getContext(), (CircularProgressIndicatorSpec) this.f37996b));
        setProgressDrawable(DeterminateDrawable.createCircularDrawable(getContext(), (CircularProgressIndicatorSpec) this.f37996b));
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f37996b).indicatorDirection;
    }

    @InterfaceC0152Px
    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f37996b).indicatorInset;
    }

    @InterfaceC0152Px
    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f37996b).indicatorSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* renamed from: p */
    public CircularProgressIndicatorSpec mo71130h(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public void setIndicatorDirection(int i) {
        ((CircularProgressIndicatorSpec) this.f37996b).indicatorDirection = i;
        invalidate();
    }

    public void setIndicatorInset(@InterfaceC0152Px int i) {
        S s = this.f37996b;
        if (((CircularProgressIndicatorSpec) s).indicatorInset != i) {
            ((CircularProgressIndicatorSpec) s).indicatorInset = i;
            invalidate();
        }
    }

    public void setIndicatorSize(@InterfaceC0152Px int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        S s = this.f37996b;
        if (((CircularProgressIndicatorSpec) s).indicatorSize != max) {
            ((CircularProgressIndicatorSpec) s).indicatorSize = max;
            ((CircularProgressIndicatorSpec) s).mo71127c();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((CircularProgressIndicatorSpec) this.f37996b).mo71127c();
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C16310R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i, DEF_STYLE_RES);
        m71181q();
    }
}
