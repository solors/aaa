package com.vungle.ads.internal.p623ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MediaView.kt */
@Metadata
/* renamed from: com.vungle.ads.internal.ui.view.MediaView */
/* loaded from: classes7.dex */
public final class MediaView extends RelativeLayout {
    private ImageView imageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    private final void initView(Context context) {
        this.imageView = new ImageView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        ImageView imageView = this.imageView;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.m17056y("imageView");
            imageView = null;
        }
        imageView.setLayoutParams(layoutParams);
        ImageView imageView3 = this.imageView;
        if (imageView3 == null) {
            Intrinsics.m17056y("imageView");
            imageView3 = null;
        }
        imageView3.setAdjustViewBounds(true);
        ImageView imageView4 = this.imageView;
        if (imageView4 == null) {
            Intrinsics.m17056y("imageView");
        } else {
            imageView2 = imageView4;
        }
        addView(imageView2);
        requestLayout();
    }

    public final void destroy() {
        ImageView imageView = this.imageView;
        ImageView imageView2 = null;
        if (imageView == null) {
            Intrinsics.m17056y("imageView");
            imageView = null;
        }
        imageView.setImageDrawable(null);
        ImageView imageView3 = this.imageView;
        if (imageView3 == null) {
            Intrinsics.m17056y("imageView");
            imageView3 = null;
        }
        if (imageView3.getParent() != null) {
            ImageView imageView4 = this.imageView;
            if (imageView4 == null) {
                Intrinsics.m17056y("imageView");
                imageView4 = null;
            }
            ViewParent parent = imageView4.getParent();
            Intrinsics.m17073h(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            ImageView imageView5 = this.imageView;
            if (imageView5 == null) {
                Intrinsics.m17056y("imageView");
            } else {
                imageView2 = imageView5;
            }
            viewGroup.removeView(imageView2);
        }
    }

    @NotNull
    public final ImageView getMainImage$vungle_ads_release() {
        ImageView imageView = this.imageView;
        if (imageView == null) {
            Intrinsics.m17056y("imageView");
            return null;
        }
        return imageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        initView(context);
    }
}
