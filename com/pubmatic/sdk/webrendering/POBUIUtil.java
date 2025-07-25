package com.pubmatic.sdk.webrendering;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import com.pubmatic.sdk.common.log.POBLog;

/* loaded from: classes7.dex */
public class POBUIUtil {
    @NonNull
    /* renamed from: a */
    private static InsetDrawable m39928a(@NonNull Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        Resources resources = context.getResources();
        gradientDrawable.setColor(resources.getColor(R$color.pob_controls_background_color));
        gradientDrawable.setStroke(resources.getDimensionPixelOffset(R$dimen.pob_control_stroke_width), resources.getColor(R$color.pob_controls_stroke_color));
        gradientDrawable.setAlpha(resources.getInteger(R$integer.pob_controls_alpha));
        return new InsetDrawable((Drawable) gradientDrawable, resources.getDimensionPixelOffset(R$dimen.pob_control_padding));
    }

    @NonNull
    public static ImageButton createDsaInfoIconButton(@NonNull Context context, @IdRes int i, @DrawableRes int i2, boolean z, boolean z2) {
        FrameLayout.LayoutParams layoutParams;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.pob_dsa_icon_margin_fullscreen);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R$dimen.pob_dsa_icon_margin);
        ImageButton imageButton = new ImageButton(context);
        imageButton.setId(i);
        Resources resources = context.getResources();
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setBackgroundColor(0);
        imageButton.setImageResource(i2);
        imageButton.setPadding(0, 0, 0, 0);
        if (z) {
            layoutParams = new FrameLayout.LayoutParams(resources.getDimensionPixelOffset(R$dimen.pob_dsa_info_icon_width_full_screen), resources.getDimensionPixelOffset(R$dimen.pob_dsa_info_icon_height_full_screen));
            layoutParams.leftMargin = dimensionPixelOffset;
            if (z2) {
                layoutParams.bottomMargin = dimensionPixelOffset;
                layoutParams.gravity = 8388691;
            } else {
                layoutParams.topMargin = dimensionPixelOffset;
                layoutParams.gravity = 8388659;
            }
        } else {
            layoutParams = new FrameLayout.LayoutParams(resources.getDimensionPixelOffset(R$dimen.pob_dsa_info_icon_width), resources.getDimensionPixelOffset(R$dimen.pob_dsa_info_icon_height));
            layoutParams.setMargins(dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2, dimensionPixelOffset2);
            layoutParams.gravity = GravityCompat.START;
        }
        imageButton.setLayoutParams(layoutParams);
        return imageButton;
    }

    @NonNull
    public static ImageButton createSkipButton(@NonNull Context context, @IdRes int i, @DrawableRes int i2) {
        ImageButton imageButton = new ImageButton(context);
        imageButton.setId(i);
        Resources resources = context.getResources();
        imageButton.setBackground(m39928a(context));
        imageButton.setPadding(0, 0, 0, 0);
        imageButton.setImageResource(i2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(resources.getDimensionPixelOffset(R$dimen.pob_control_width), resources.getDimensionPixelOffset(R$dimen.pob_control_height));
        layoutParams.gravity = GravityCompat.END;
        layoutParams.rightMargin = resources.getDimensionPixelOffset(R$dimen.pob_close_button_right_margin);
        layoutParams.topMargin = resources.getDimensionPixelOffset(R$dimen.pob_close_button_top_margin);
        imageButton.setLayoutParams(layoutParams);
        return imageButton;
    }

    @NonNull
    public static TextView createSkipDurationTextView(@NonNull Context context, int i) {
        TextView createTextView = createTextView(context, "", context.getResources().getDimensionPixelOffset(R$dimen.pob_text_size), i);
        createTextView.setBackground(m39928a(context));
        createTextView.setPadding(0, 0, 0, 0);
        return createTextView;
    }

    @NonNull
    public static TextView createTextView(@NonNull Context context, @Nullable String str, float f, int i) {
        TextView textView = new TextView(context);
        textView.setAllCaps(false);
        textView.setGravity(17);
        textView.setTextColor(context.getResources().getColor(17170443));
        textView.setTextSize(0, f);
        textView.setTextAlignment(4);
        textView.setText(str);
        try {
            textView.setTypeface(Typeface.SANS_SERIF, 1);
        } catch (Exception unused) {
            POBLog.warn("POBUIUtil", "SANS_SERIF font not found!", new Object[0]);
        }
        textView.setId(i);
        return textView;
    }

    @NonNull
    public static FrameLayout.LayoutParams getLayoutParamsForTopRightPosition(@NonNull Context context) {
        Resources resources = context.getResources();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(resources.getDimensionPixelOffset(R$dimen.pob_control_width), resources.getDimensionPixelOffset(R$dimen.pob_control_height));
        layoutParams.gravity = GravityCompat.END;
        layoutParams.rightMargin = resources.getDimensionPixelOffset(R$dimen.pob_skip_control_right_margin);
        layoutParams.topMargin = resources.getDimensionPixelOffset(R$dimen.pob_skip_control_top_margin);
        return layoutParams;
    }

    @NonNull
    public static String getLocalizedStringForKey(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", context.getPackageName());
        if (identifier != 0) {
            String string = resources.getString(identifier);
            if (!string.isEmpty()) {
                return string;
            }
        }
        return str2;
    }

    public static void resizeDsaInfoBtn(@NonNull Context context, @NonNull ImageButton imageButton, boolean z) {
        FrameLayout.LayoutParams layoutParams;
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R$dimen.pob_dsa_icon_margin_fullscreen);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(R$dimen.pob_dsa_icon_margin);
        if (imageButton.getLayoutParams() != null) {
            layoutParams = (FrameLayout.LayoutParams) imageButton.getLayoutParams();
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        imageButton.setPadding(0, 0, 0, 0);
        if (z) {
            layoutParams.height = context.getResources().getDimensionPixelOffset(R$dimen.pob_dsa_info_icon_height_full_screen);
            layoutParams.width = context.getResources().getDimensionPixelOffset(R$dimen.pob_dsa_info_icon_width_full_screen);
            layoutParams.leftMargin = dimensionPixelOffset;
            layoutParams.bottomMargin = dimensionPixelOffset;
            layoutParams.gravity = 80;
        } else {
            Resources resources = context.getResources();
            int i = R$dimen.pob_dsa_info_icon_height;
            layoutParams.height = resources.getDimensionPixelOffset(i);
            layoutParams.width = context.getResources().getDimensionPixelOffset(i);
            layoutParams.leftMargin = dimensionPixelOffset2;
            layoutParams.topMargin = dimensionPixelOffset2;
            layoutParams.gravity = GravityCompat.START;
        }
        imageButton.setLayoutParams(layoutParams);
    }

    public static void updateSkipBtnColor(@NonNull Context context, @NonNull ImageView imageView, @ColorRes int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        Resources resources = context.getResources();
        gradientDrawable.setColor(resources.getColor(R$color.pob_skip_button_background_color));
        gradientDrawable.setStroke(resources.getDimensionPixelOffset(R$dimen.pob_control_stroke_width), resources.getColor(i));
        imageView.setBackground(new InsetDrawable((Drawable) gradientDrawable, resources.getDimensionPixelOffset(R$dimen.pob_control_padding)));
    }

    public static void updateSkipButtonToCloseButton(@NonNull ImageButton imageButton) {
        imageButton.setImageResource(R$drawable.pob_ic_close_black_24dp);
        imageButton.setId(R$id.pob_close_btn);
    }
}
