package com.pubmatic.sdk.video.player;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.R$color;
import com.pubmatic.sdk.video.R$dimen;
import com.pubmatic.sdk.video.R$integer;
import com.pubmatic.sdk.webrendering.POBUIUtil;

/* renamed from: com.pubmatic.sdk.video.player.k */
/* loaded from: classes7.dex */
abstract class AbstractC26873k {
    @NonNull
    /* renamed from: a */
    public static FrameLayout.LayoutParams m39978a(@NonNull Context context, int i, int i2, @Nullable ImageButton imageButton) {
        int dimensionPixelOffset;
        if (imageButton != null) {
            dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.pob_mute_button_left_margin) + ((int) imageButton.getX()) + imageButton.getLayoutParams().width;
        } else {
            dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.pob_mute_button_left_margin);
        }
        int dimensionPixelOffset2 = imageButton != null ? context.getResources().getDimensionPixelOffset(R$dimen.pob_industry_icon_top_margin) + ((int) imageButton.getY()) : context.getResources().getDimensionPixelOffset(R$dimen.pob_mute_button_bottom_margin);
        int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(R$dimen.pob_industry_icon_min_height);
        int dimensionPixelOffset4 = context.getResources().getDimensionPixelOffset(R$dimen.pob_industry_icon_max_height);
        int dimensionPixelOffset5 = context.getResources().getDimensionPixelOffset(R$dimen.pob_industry_icon_min_width);
        int dimensionPixelOffset6 = context.getResources().getDimensionPixelOffset(R$dimen.pob_industry_icon_max_width);
        int convertDpToPixel = POBUtils.convertDpToPixel(i2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(Math.min(dimensionPixelOffset6, Math.max(dimensionPixelOffset5, POBUtils.convertDpToPixel(i))), Math.min(dimensionPixelOffset4, Math.max(dimensionPixelOffset3, convertDpToPixel)));
        layoutParams.leftMargin = dimensionPixelOffset;
        layoutParams.topMargin = dimensionPixelOffset2;
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m39975b(@NonNull View view, int i) {
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
            view.animate().alpha(1.0f).setDuration(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public static TextView m39977a(@NonNull Context context, int i, @Nullable String str, int i2) {
        Resources resources = context.getResources();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, resources.getDimensionPixelOffset(R$dimen.pob_control_height));
        layoutParams.gravity = 8388693;
        layoutParams.bottomMargin = resources.getDimensionPixelOffset(R$dimen.pob_learn_more_bottom_margin);
        layoutParams.rightMargin = resources.getDimensionPixelOffset(R$dimen.pob_learn_more_right_margin);
        TextView createTextView = POBUIUtil.createTextView(context, str, resources.getDimensionPixelOffset(R$dimen.pob_text_size), i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(resources.getDimensionPixelOffset(R$dimen.pob_learn_more_radius));
        gradientDrawable.setColor(i2);
        gradientDrawable.setStroke(resources.getDimensionPixelOffset(R$dimen.pob_control_stroke_width), resources.getColor(R$color.pob_controls_stroke_color));
        gradientDrawable.setAlpha(resources.getInteger(R$integer.pob_controls_alpha));
        createTextView.setBackground(gradientDrawable);
        int i3 = layoutParams.rightMargin;
        createTextView.setPadding(i3, 0, i3, 0);
        createTextView.setMaxWidth(resources.getDimensionPixelOffset(R$dimen.pob_learn_more_width_max));
        createTextView.setMaxLines(1);
        createTextView.setEllipsize(TextUtils.TruncateAt.END);
        createTextView.setLayoutParams(layoutParams);
        return createTextView;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m39976a(@NonNull View view, int i) {
        if (view.getVisibility() == 0) {
            long j = i;
            view.animate().alpha(0.0f).setDuration(j);
            new Handler().postDelayed(new RunnableC26872j(view), j);
        }
    }
}
