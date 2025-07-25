package com.mbridge.msdk.dycreator.baseview.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes6.dex */
public class MBGradientAndShadowTextView extends TextView {

    /* renamed from: a */
    private int f55847a;

    /* renamed from: b */
    private int f55848b;

    /* renamed from: c */
    private int f55849c;

    /* renamed from: d */
    private int f55850d;

    /* renamed from: e */
    private LinearGradient f55851e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    /* loaded from: classes6.dex */
    public static class GradientAndShadowParameters {
        public int gradientEndColor;
        public int gradientStartColor;
        public int shadowColor;
        public int textSize = 40;
        public float shadowRadius = 3.0f;
        public float shadowDx = 1.5f;
        public float shadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context) {
        super(context);
        this.f55847a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f55848b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f55849c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f55850d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        m52991a();
    }

    /* renamed from: a */
    private void m52991a() {
        setTextSize(this.f55850d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.f55851e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f55847a, this.f55848b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.f55849c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.f55851e);
        super.onDraw(canvas);
    }

    public MBGradientAndShadowTextView(Context context, GradientAndShadowParameters gradientAndShadowParameters) {
        super(context);
        this.f55847a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f55848b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f55849c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f55850d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (gradientAndShadowParameters != null) {
            this.f55847a = gradientAndShadowParameters.gradientStartColor;
            this.f55848b = gradientAndShadowParameters.gradientEndColor;
            this.f55849c = gradientAndShadowParameters.shadowColor;
            this.f55850d = gradientAndShadowParameters.textSize;
            this.mShadowRadius = gradientAndShadowParameters.shadowRadius;
            this.mShadowDx = gradientAndShadowParameters.shadowDx;
            this.mShadowDy = gradientAndShadowParameters.shadowDy;
        }
        m52991a();
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55847a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f55848b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f55849c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f55850d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55847a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f55848b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f55849c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f55850d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    @RequiresApi(api = 21)
    public MBGradientAndShadowTextView(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f55847a = AcquireRewardPopViewConst.DEFAULT_COLOR_FFFBED;
        this.f55848b = AcquireRewardPopViewConst.DEFAULT_COLOR_FFBD6F;
        this.f55849c = AcquireRewardPopViewConst.DEFAULT_COLOR_EC7501;
        this.f55850d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }
}
