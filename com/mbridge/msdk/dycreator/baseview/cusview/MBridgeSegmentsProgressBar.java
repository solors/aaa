package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.foundation.tools.ResourceUtil;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class MBridgeSegmentsProgressBar extends LinearLayout {

    /* renamed from: a */
    private final String f55763a;

    /* renamed from: b */
    private int f55764b;

    /* renamed from: c */
    private int f55765c;

    /* renamed from: d */
    private int f55766d;

    /* renamed from: e */
    private int f55767e;

    /* renamed from: f */
    private int f55768f;

    /* renamed from: g */
    private int f55769g;

    /* renamed from: h */
    private int f55770h;

    /* renamed from: i */
    private List<ProgressBar> f55771i;

    /* renamed from: j */
    private TextView f55772j;

    /* renamed from: k */
    private String f55773k;

    /* renamed from: l */
    private boolean f55774l;

    public MBridgeSegmentsProgressBar(Context context) {
        super(context);
        this.f55763a = "MBridgeSegmentsProgressBar";
        this.f55765c = 1;
        this.f55766d = 20;
        this.f55767e = 10;
        this.f55768f = 1;
        this.f55769g = -1711276033;
        this.f55770h = -1;
        this.f55771i = new ArrayList();
        this.f55774l = false;
    }

    /* renamed from: a */
    private void m53019a() {
        Drawable drawable;
        try {
            this.f55774l = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th) {
            SameLogTool.m51824b("MBridgeSegmentsProgressBar", th.getMessage());
        }
        try {
            if (this.f55765c == 1) {
                setOrientation(1);
                if (TextUtils.isEmpty(this.f55773k)) {
                    this.f55773k = this.f55774l ? "正在播放第%s个，共%s个视频" : "The %s is playing, %s videos.";
                }
            }
            if (this.f55765c == 2) {
                setOrientation(0);
                if (TextUtils.isEmpty(this.f55773k)) {
                    this.f55773k = this.f55774l ? "广告 %s/%s" : "ADS %s/%s";
                }
            }
            this.f55771i.clear();
            removeAllViews();
            setBackground(m53016c());
            TextView textView = new TextView(getContext());
            this.f55772j = textView;
            textView.setTextColor(-1);
            this.f55772j.setTextSize(12.0f);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            this.f55772j.setLayoutParams(layoutParams);
            if (this.f55765c == 1) {
                layoutParams.gravity = 5;
                TextView textView2 = this.f55772j;
                int i = this.f55766d;
                textView2.setPadding(i / 2, 15, i / 2, 5);
            }
            if (this.f55765c == 2) {
                this.f55772j.setGravity(16);
                TextView textView3 = this.f55772j;
                int i2 = this.f55766d;
                textView3.setPadding(i2 / 2, 0, i2 / 2, 0);
            }
            int m51605a = ResourceUtil.m51605a(getContext(), "mbridge_reward_video_icon", "drawable");
            if (m51605a != 0 && (drawable = getContext().getResources().getDrawable(m51605a)) != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
                this.f55772j.setCompoundDrawables(drawable, null, null, null);
                this.f55772j.setCompoundDrawablePadding(5);
            }
            this.f55772j.setText(m53018a(this.f55768f));
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, 25);
            linearLayout.setLayoutParams(layoutParams2);
            for (int i3 = 0; i3 < this.f55764b; i3++) {
                ProgressBar progressBar = new ProgressBar(getContext(), null, 16842872);
                progressBar.setMax(100);
                progressBar.setProgress(0);
                progressBar.setProgressDrawable(m53017b());
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 20, 1.0f);
                int i4 = this.f55766d;
                layoutParams3.leftMargin = i4 / 2;
                layoutParams3.rightMargin = i4 / 2;
                progressBar.setLayoutParams(layoutParams3);
                linearLayout.addView(progressBar);
                this.f55771i.add(progressBar);
            }
            int i5 = this.f55765c;
            if (i5 == 1) {
                setPadding(15, 10, 15, 25);
                addView(this.f55772j);
                addView(linearLayout);
            } else if (i5 == 2) {
                setPadding(15, 0, 15, 25);
                layoutParams2.gravity = 16;
                layoutParams2.weight = 1.0f;
                addView(linearLayout);
                addView(this.f55772j);
            } else {
                addView(linearLayout);
            }
        } catch (Throwable th2) {
            SameLogTool.m51824b("MBridgeSegmentsProgressBar", th2.getMessage());
        }
    }

    /* renamed from: b */
    private LayerDrawable m53017b() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.f55767e);
        gradientDrawable.setColor(this.f55769g);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(this.f55767e);
        gradientDrawable2.setColor(this.f55770h);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ScaleDrawable(gradientDrawable2, 3, 1.0f, -1.0f)});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908301);
        return layerDrawable;
    }

    /* renamed from: c */
    private GradientDrawable m53016c() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setDither(true);
        gradientDrawable.setColors(new int[]{0, 1291845632});
        return gradientDrawable;
    }

    public void dismiss() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(1000L);
        alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBridgeSegmentsProgressBar.this.setVisibility(8);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        startAnimation(alphaAnimation);
    }

    public void init(int i, int i2) {
        this.f55764b = i;
        this.f55765c = i2;
        m53019a();
    }

    public void setIndicatorText(String str) {
        this.f55773k = str;
    }

    public void setProgress(int i, int i2) {
        try {
            if (this.f55771i.size() == 0) {
                return;
            }
            if (i2 < this.f55771i.size()) {
                this.f55771i.get(i2).setProgress(i);
            }
            int i3 = i2 + 1;
            if (i3 > this.f55768f) {
                this.f55768f = i3;
                TextView textView = this.f55772j;
                if (textView != null) {
                    textView.setText(m53018a(i3));
                }
            }
        } catch (Throwable th) {
            SameLogTool.m51824b("MBridgeSegmentsProgressBar", th.getMessage());
        }
    }

    public void init(int i, int i2, int i3, int i4) {
        this.f55764b = i;
        this.f55765c = i2;
        this.f55770h = i3;
        this.f55769g = i4;
        m53019a();
    }

    public void init(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f55764b = i;
        this.f55765c = i2;
        this.f55770h = i3;
        this.f55769g = i4;
        this.f55766d = i5;
        this.f55767e = i6;
        m53019a();
    }

    public MBridgeSegmentsProgressBar(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55763a = "MBridgeSegmentsProgressBar";
        this.f55765c = 1;
        this.f55766d = 20;
        this.f55767e = 10;
        this.f55768f = 1;
        this.f55769g = -1711276033;
        this.f55770h = -1;
        this.f55771i = new ArrayList();
        this.f55774l = false;
    }

    public MBridgeSegmentsProgressBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55763a = "MBridgeSegmentsProgressBar";
        this.f55765c = 1;
        this.f55766d = 20;
        this.f55767e = 10;
        this.f55768f = 1;
        this.f55769g = -1711276033;
        this.f55770h = -1;
        this.f55771i = new ArrayList();
        this.f55774l = false;
    }

    @RequiresApi(api = 21)
    public MBridgeSegmentsProgressBar(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f55763a = "MBridgeSegmentsProgressBar";
        this.f55765c = 1;
        this.f55766d = 20;
        this.f55767e = 10;
        this.f55768f = 1;
        this.f55769g = -1711276033;
        this.f55770h = -1;
        this.f55771i = new ArrayList();
        this.f55774l = false;
    }

    /* renamed from: a */
    private StringBuilder m53018a(int i) {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append(String.format(this.f55773k, Integer.valueOf(i), Integer.valueOf(this.f55764b)));
        } catch (Throwable th) {
            sb2.append(this.f55764b);
            sb2.append("videos, the");
            sb2.append(i);
            sb2.append(" is playing.");
            SameLogTool.m51824b("MBridgeSegmentsProgressBar", th.getMessage());
        }
        return sb2;
    }
}
