package com.monetization.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.yandex.mobile.ads.C29880R;
import com.yandex.mobile.ads.impl.xz1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class CallToActionView extends Button {
    @Nullable

    /* renamed from: a */
    private CharSequence f66436a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public CallToActionView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    private static Drawable m44294a(Context context, int i) {
        return ContextCompat.getDrawable(context, i);
    }

    @Override // android.widget.TextView
    @Nullable
    public final CharSequence getText() {
        return this.f66436a;
    }

    @Override // android.widget.TextView
    public void setText(@NotNull CharSequence text, @NotNull TextView.BufferType type) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(type, "type");
        if (text instanceof String) {
            this.f66436a = text;
        }
        super.setText(this.f66436a, TextView.BufferType.SPANNABLE);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public CallToActionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public final void m44295a() {
        setSpannableFactory(Spannable.Factory.getInstance());
        setText(this.f66436a);
    }

    public /* synthetic */ CallToActionView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"CustomViewStyleable"})
    public CallToActionView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        Intrinsics.checkNotNullParameter(context, "context");
        int i3 = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C29880R.styleable.MonetizationAdsInternalIconButton, i, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            int resourceId = obtainStyledAttributes.getResourceId(C29880R.styleable.MonetizationAdsInternalIconButton_monetization_internal_icon, 0);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C29880R.styleable.f76503xb7de9e0b, 0);
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(C29880R.styleable.f76502x33a8c81d, 0);
            obtainStyledAttributes.recycle();
            r0 = resourceId != 0 ? m44294a(context, resourceId) : null;
            i2 = dimensionPixelSize2;
            i3 = dimensionPixelSize;
        } else {
            i2 = 0;
        }
        setSpannableFactory(new xz1(r0, i3, i2));
    }
}
