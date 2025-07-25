package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.utils.C7730Fy;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.p340zx.C9103bX;
import com.bytedance.sdk.openadsdk.utils.ZQc;

/* loaded from: classes3.dex */
public class TTAdDislikeToast extends C9103bX {
    private static String sDislikeSendTip;
    private static String sDislikeTip;
    private static String sSkipText;
    private final Handler mHandler;
    private TextView mTextView;

    public TTAdDislikeToast(Context context) {
        this(context, null);
    }

    public static String getDislikeSendTip() {
        if (sDislikeSendTip == null) {
            Context m84740bg = C8838VzQ.m84740bg();
            sDislikeSendTip = C7730Fy.m87917bg(m84740bg, "tt_feedback_thank_text") + "\n" + C7730Fy.m87917bg(m84740bg, "tt_feedback_experience_text");
        }
        return sDislikeSendTip;
    }

    public static String getDislikeTip() {
        if (sDislikeTip == null) {
            sDislikeTip = C7730Fy.m87917bg(C8838VzQ.m84740bg(), "tt_feedback_submit_text");
        }
        return sDislikeTip;
    }

    public static String getSkipText() {
        if (sSkipText == null) {
            sSkipText = C7730Fy.m87917bg(C8838VzQ.m84740bg(), "tt_reward_screen_skip_tx");
        }
        return sSkipText;
    }

    private void initToast(Context context) {
        TextView textView = new TextView(context);
        this.mTextView = textView;
        textView.setClickable(false);
        this.mTextView.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = ZQc.m82537bX(getContext(), 75.0f);
        int m82537bX = ZQc.m82537bX(C8838VzQ.m84740bg(), 16.0f);
        int m82537bX2 = ZQc.m82537bX(C8838VzQ.m84740bg(), 12.0f);
        this.mTextView.setPadding(m82537bX, m82537bX2, m82537bX, m82537bX2);
        this.mTextView.setLayoutParams(layoutParams);
        this.mTextView.setTextColor(-1);
        this.mTextView.setTextSize(16.0f);
        this.mTextView.setGravity(GravityCompat.START);
        Drawable m87919bX = C7730Fy.m87919bX(getContext(), "tt_dislike_toast");
        int m82537bX3 = ZQc.m82537bX(getContext(), 16.0f);
        m87919bX.setBounds(0, 0, m82537bX3, m82537bX3);
        this.mTextView.setCompoundDrawablePadding(m82537bX3 / 2);
        this.mTextView.setCompoundDrawables(m87919bX, null, null, null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.argb(209, 37, 37, 37));
        gradientDrawable.setCornerRadius(ZQc.m82537bX(C8838VzQ.m84740bg(), 12.0f));
        this.mTextView.setBackground(gradientDrawable);
        addView(this.mTextView);
    }

    public static void onResourceUpdated() {
        Context m84740bg = C8838VzQ.m84740bg();
        sSkipText = C7730Fy.m87917bg(m84740bg, "tt_reward_screen_skip_tx");
        sDislikeTip = C7730Fy.m87917bg(m84740bg, "tt_feedback_submit_text");
        sDislikeSendTip = C7730Fy.m87917bg(m84740bg, "tt_feedback_thank_text") + "\n" + C7730Fy.m87917bg(m84740bg, "tt_feedback_experience_text");
    }

    public void hide() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void onDestroy() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void show(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.1
            @Override // java.lang.Runnable
            public void run() {
                if (TTAdDislikeToast.this.mTextView != null) {
                    TTAdDislikeToast.this.mTextView.setText(String.valueOf(str));
                }
                TTAdDislikeToast.this.setVisibility(0);
            }
        });
        this.mHandler.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.2
            @Override // java.lang.Runnable
            public void run() {
                TTAdDislikeToast.this.setVisibility(8);
            }
        }, 2000L);
    }

    public TTAdDislikeToast(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeToast(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHandler = new Handler(Looper.getMainLooper());
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        initToast(context);
    }
}
