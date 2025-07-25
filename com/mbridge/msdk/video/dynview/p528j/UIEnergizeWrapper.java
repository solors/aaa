package com.mbridge.msdk.video.dynview.p528j;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.MBFrameLayout;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBTextView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeFramLayout;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeTextView;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.tools.ResourceUtil;
import com.mbridge.msdk.foundation.tools.SameTool;
import com.mbridge.msdk.video.dynview.ViewOption;
import com.mbridge.msdk.video.dynview.p515a.UIConfig;
import com.mbridge.msdk.video.dynview.p523h.MBridgeUIAnim;
import com.mbridge.msdk.video.dynview.p524i.p526b.UIDrawableUtil;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.video.dynview.widget.MBridgeRelativeLayout;
import com.mbridge.msdk.video.module.MBridgeClickCTAView;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.j.b */
/* loaded from: classes6.dex */
public final class UIEnergizeWrapper {

    /* renamed from: a */
    private String f60366a = "mbridge_top_play_bg";

    /* renamed from: b */
    private String f60367b = "mbridge_top_finger_bg";

    /* renamed from: c */
    private String f60368c = "mbridge_bottom_play_bg";

    /* renamed from: d */
    private String f60369d = "mbridge_bottom_finger_bg";

    /* renamed from: e */
    private String f60370e = "mbridge_tv_count";

    /* renamed from: f */
    private String f60371f = "mbridge_sound_switch";

    /* renamed from: g */
    private String f60372g = "mbridge_top_control";

    /* renamed from: h */
    private String f60373h = "mbridge_tv_title";

    /* renamed from: i */
    private String f60374i = "mbridge_tv_desc";

    /* renamed from: j */
    private String f60375j = "mbridge_tv_install";

    /* renamed from: k */
    private String f60376k = "mbridge_sv_starlevel";

    /* renamed from: l */
    private String f60377l = "mbridge_sv_heat_count_level";

    /* renamed from: m */
    private String f60378m = "mbridge_tv_cta";

    /* renamed from: n */
    private String f60379n = "mbridge_native_ec_controller";

    /* renamed from: o */
    private String f60380o = "mbridge_reward_shape_choice_rl";

    /* renamed from: p */
    private String f60381p = "#FFFFFF";

    /* renamed from: q */
    private String f60382q = "#FF000000";

    /* renamed from: r */
    private String f60383r = "#40000000";

    /* renamed from: s */
    private String f60384s = "#CAEF79";

    /* renamed from: t */
    private String f60385t = "#2196F3";

    /* renamed from: u */
    private String f60386u = "#402196F3";

    /* renamed from: v */
    private String f60387v = "#8FC31F";

    /* renamed from: w */
    private String f60388w = "#03A9F4";

    /* renamed from: x */
    private String f60389x = "#FF89C120";

    /* renamed from: y */
    private String f60390y = "#FF2BAE5D";

    /* renamed from: z */
    private boolean f60391z = false;

    /* renamed from: a */
    public final void m48889a(View view, Map<String, Object> map) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        if (view == null || !(view instanceof MBridgeFramLayout)) {
            return;
        }
        MBridgeFramLayout mBridgeFramLayout = (MBridgeFramLayout) view;
        AnimatorSet animatorSet = new AnimatorSet();
        if (view.getContext() != null) {
            if (map != null && map.containsKey("is_dy_success")) {
                this.f60391z = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            if (this.f60391z) {
                imageView = (ImageView) view.findViewById(m48886b(this.f60366a));
                imageView2 = (ImageView) view.findViewById(m48886b(this.f60367b));
                imageView3 = (ImageView) view.findViewById(m48886b(this.f60368c));
                imageView4 = (ImageView) view.findViewById(m48886b(this.f60369d));
            } else {
                imageView = (ImageView) view.findViewById(m48888a(this.f60366a));
                imageView2 = (ImageView) view.findViewById(m48888a(this.f60367b));
                imageView3 = (ImageView) view.findViewById(m48888a(this.f60368c));
                imageView4 = (ImageView) view.findViewById(m48888a(this.f60369d));
            }
            ObjectAnimator m48951a = imageView != null ? new MBridgeUIAnim().m48951a(imageView) : null;
            ObjectAnimator m48946b = imageView2 != null ? new MBridgeUIAnim().m48946b(imageView2) : null;
            ObjectAnimator m48951a2 = imageView3 != null ? new MBridgeUIAnim().m48951a(imageView3) : null;
            ObjectAnimator m48946b2 = imageView4 != null ? new MBridgeUIAnim().m48946b(imageView4) : null;
            if (m48951a == null || m48951a2 == null || m48946b == null || m48946b2 == null) {
                return;
            }
            animatorSet.playTogether(m48951a, m48951a2, m48946b, m48946b2);
            mBridgeFramLayout.setAnimatorSet(animatorSet);
        }
    }

    /* renamed from: b */
    public final void m48887b(View view, ViewOption viewOption, Map<String, Object> map) {
        LinearLayout linearLayout;
        View findViewById;
        if (view == null || viewOption == null) {
            return;
        }
        if (view.getContext() != null) {
            if (map != null && map.containsKey("is_dy_success")) {
                this.f60391z = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            if (this.f60391z) {
                linearLayout = (LinearLayout) view.findViewById(m48886b(this.f60376k));
                findViewById = view.findViewById(m48886b(this.f60378m));
            } else {
                linearLayout = (LinearLayout) view.findViewById(m48888a(this.f60376k));
                findViewById = view.findViewById(m48888a(this.f60378m));
            }
            View view2 = findViewById;
            if (linearLayout != null && (linearLayout instanceof MBridgeLevelLayoutView)) {
                if (viewOption.m49028e() == 1) {
                    linearLayout.setOrientation(1);
                } else {
                    linearLayout.setOrientation(0);
                }
            }
            if (linearLayout != null && (linearLayout instanceof MBStarLevelLayoutView)) {
                linearLayout.setOrientation(0);
            }
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(m48888a(this.f60379n));
            if (relativeLayout != null) {
                if (relativeLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                    layoutParams.setMargins(layoutParams.leftMargin + UIConfig.f60210a, layoutParams.topMargin + UIConfig.f60212c, layoutParams.rightMargin + UIConfig.f60211b, layoutParams.bottomMargin + UIConfig.f60213d);
                    relativeLayout.setLayoutParams(layoutParams);
                }
                if (relativeLayout.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) relativeLayout.getLayoutParams();
                    layoutParams2.setMargins(layoutParams2.leftMargin + UIConfig.f60210a, layoutParams2.topMargin + UIConfig.f60212c, layoutParams2.rightMargin + UIConfig.f60211b, layoutParams2.bottomMargin + UIConfig.f60213d);
                    relativeLayout.setLayoutParams(layoutParams2);
                }
            }
            if (view2 != null) {
                if (view2 instanceof TextView) {
                    TextView textView = (TextView) view2;
                    textView.setTextColor(Color.parseColor(this.f60381p));
                    textView.setTextSize(22.0f);
                    UIDrawableUtil.m48932a(view2, 1.0f, viewOption.m49024i() == 1302 ? 25 : 5, this.f60384s, new String[]{this.f60389x, this.f60390y}, GradientDrawable.Orientation.LEFT_RIGHT);
                }
                try {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new MBridgeUIAnim().m48943c(view2));
                    animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.mbridge.msdk.video.dynview.j.b.1
                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                        }
                    });
                    if (view instanceof MBFrameLayout) {
                        ((MBFrameLayout) view).setAnimator(animatorSet);
                    }
                    if (view instanceof MBridgeFramLayout) {
                        ((MBridgeFramLayout) view).setAnimatorSet(animatorSet);
                    }
                    if (view instanceof MBridgeRelativeLayout) {
                        ((MBridgeRelativeLayout) view).setAnimatorSet(animatorSet);
                    }
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                    }
                }
            }
        }
        new MBridgeUIAnim().m48942c(view, 500L);
    }

    /* renamed from: a */
    public final void m48890a(View view, ViewOption viewOption, Map<String, Object> map) {
        TextView textView;
        TextView textView2;
        String str;
        String str2;
        RelativeLayout relativeLayout;
        RelativeLayout.LayoutParams layoutParams;
        Context context = view != null ? view.getContext() : null;
        if (context == null || viewOption == null) {
            return;
        }
        if (map != null && map.containsKey("is_dy_success")) {
            boolean booleanValue = ((Boolean) map.get("is_dy_success")).booleanValue();
            this.f60391z = booleanValue;
            if (booleanValue) {
                textView = (TextView) view.findViewById(m48886b(this.f60370e));
                textView2 = (TextView) view.findViewById(m48886b("mbridge_reward_click_tv"));
            } else {
                textView = (TextView) view.findViewById(m48888a(this.f60370e));
                textView2 = (TextView) view.findViewById(m48888a("mbridge_reward_click_tv"));
            }
        } else {
            textView = (TextView) view.findViewById(m48888a(this.f60370e));
            textView2 = (TextView) view.findViewById(m48888a("mbridge_reward_click_tv"));
        }
        if (textView != null) {
            textView.setBackgroundResource(ResourceUtil.m51605a(context, "mbridge_reward_shape_progress", "drawable"));
            textView.setTextColor(Color.parseColor(this.f60381p));
            textView.setTextSize(11.0f);
        }
        if (textView2 != null) {
            textView2.setTextSize(20.0f);
            if (textView2 instanceof MBridgeTextView) {
                ((MBridgeTextView) textView2).setObjectAnimator(new MBridgeUIAnim().m48943c(textView2));
            }
            if (textView2 instanceof MBTextView) {
                ((MBTextView) textView2).setAnimator(new MBridgeUIAnim().m48943c(textView2));
            }
        }
        String str3 = this.f60382q;
        String str4 = this.f60384s;
        int m49024i = viewOption.m49024i();
        float f = 10.0f;
        float f2 = 1.0f;
        if (m49024i == 302) {
            str = this.f60385t;
            str2 = this.f60388w;
            str3 = this.f60381p;
            str4 = this.f60386u;
        } else if (m49024i == 802) {
            str = this.f60381p;
            str3 = this.f60382q;
            str4 = this.f60383r;
            f = 25.0f;
            f2 = 0.5f;
            str2 = str;
        } else if (m49024i != 5002010) {
            str = this.f60387v;
            str2 = this.f60384s;
            f = 5.0f;
        } else {
            str = this.f60387v;
            str3 = this.f60381p;
            str4 = str;
            str2 = str4;
        }
        if (textView2 != null) {
            textView2.setTextColor(Color.parseColor(str3));
            UIDrawableUtil.m48932a(textView2, f2, f, str4, new String[]{str, str2}, GradientDrawable.Orientation.LEFT_RIGHT);
        }
        if (viewOption.m49027f() != null && (layoutParams = (RelativeLayout.LayoutParams) viewOption.m49027f().getLayoutParams()) != null) {
            layoutParams.setMargins(0, 0, 0, 0);
            viewOption.m49027f().setLayoutParams(layoutParams);
        }
        if (this.f60391z) {
            relativeLayout = (RelativeLayout) view.findViewById(m48886b(this.f60372g));
        } else {
            relativeLayout = (RelativeLayout) view.findViewById(m48888a(this.f60372g));
        }
        if (relativeLayout != null) {
            if (UIConfig.f60210a == 0 && UIConfig.f60211b == 0 && UIConfig.f60212c == 0 && UIConfig.f60213d == 0) {
                return;
            }
            relativeLayout.setVisibility(4);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
            alphaAnimation.setDuration(200L);
            relativeLayout.startAnimation(alphaAnimation);
            relativeLayout.setVisibility(0);
        }
    }

    /* renamed from: b */
    private int m48886b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    /* renamed from: a */
    public final void m48891a(View view, ViewOption viewOption) {
        Context context;
        int m51772a;
        if (view == null || viewOption == null || (context = view.getContext()) == null) {
            return;
        }
        if (viewOption.m49028e() == 1) {
            view.setBackground(context.getResources().getDrawable(ResourceUtil.m51605a(context, this.f60380o, "drawable")));
            TextView textView = (TextView) view.findViewById(m48888a(this.f60373h));
            if (textView != null) {
                textView.setTextColor(Color.parseColor(this.f60382q));
            }
            TextView textView2 = (TextView) view.findViewById(m48888a(this.f60374i));
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor(this.f60382q));
            }
            m51772a = SameTool.m51772a(context, 2.0f);
        } else {
            m51772a = SameTool.m51772a(context, 10.0f);
            view.getBackground().setAlpha(100);
        }
        int m51772a2 = SameTool.m51772a(context, 8.0f);
        View findViewById = view.findViewById(m48888a(this.f60375j));
        if (findViewById != null) {
            if (viewOption.m49027f() != null && (viewOption.m49027f() instanceof MBridgeClickCTAView)) {
                ((MBridgeClickCTAView) viewOption.m49027f()).setObjectAnimator(new MBridgeUIAnim().m48943c(findViewById));
            }
            if (findViewById instanceof TextView) {
                TextView textView3 = (TextView) findViewById;
                textView3.setTextColor(Color.parseColor(this.f60381p));
                textView3.setTextSize(15.0f);
                String str = this.f60384s;
                UIDrawableUtil.m48932a(textView3, 1.0f, 5.0f, str, new String[]{this.f60387v, str}, GradientDrawable.Orientation.LEFT_RIGHT);
            }
        }
        if (view.getLayoutParams() == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(m51772a, m51772a, m51772a, m51772a2);
            layoutParams.height = SameTool.m51772a(context, 60.0f);
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    private int m48888a(String str) {
        return ResourceUtil.m51605a(MBSDKContext.m52746m().m52792c(), str, "id");
    }
}
