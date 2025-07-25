package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RatingBar;
import androidx.annotation.AttrRes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public class gj1 extends RatingBar implements dj1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj1(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.RatingBar
    public final float getRating() {
        return super.getRating();
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (isClickable() && event.getAction() == 0) {
            return true;
        }
        return false;
    }

    @Override // android.widget.RatingBar, com.yandex.mobile.ads.impl.dj1
    public void setRating(float f) {
        super.setRating(f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj1(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj1(@NotNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
