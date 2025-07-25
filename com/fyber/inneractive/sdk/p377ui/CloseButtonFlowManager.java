package com.fyber.inneractive.sdk.p377ui;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.C14169R;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.util.AbstractC15459m;

/* renamed from: com.fyber.inneractive.sdk.ui.CloseButtonFlowManager */
/* loaded from: classes4.dex */
public class CloseButtonFlowManager {

    /* renamed from: a */
    public final View f30509a;

    /* renamed from: b */
    public final TextView f30510b;

    /* renamed from: c */
    public final View f30511c;

    /* renamed from: d */
    public final ImageView f30512d;

    /* renamed from: e */
    public final FrameLayout f30513e;

    /* renamed from: f */
    public boolean f30514f = false;

    public CloseButtonFlowManager(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        View findViewById = inneractiveFullscreenAdActivity.findViewById(C14169R.C14172id.ia_fl_close_button);
        this.f30509a = findViewById;
        this.f30510b = (TextView) inneractiveFullscreenAdActivity.findViewById(C14169R.C14172id.ia_tv_close_button);
        View findViewById2 = inneractiveFullscreenAdActivity.findViewById(C14169R.C14172id.ia_clickable_close_button);
        this.f30511c = findViewById2;
        this.f30512d = (ImageView) inneractiveFullscreenAdActivity.findViewById(C14169R.C14172id.ia_iv_close_button);
        this.f30513e = (FrameLayout) inneractiveFullscreenAdActivity.findViewById(C14169R.C14172id.close_button_container);
        findViewById.setVisibility(8);
        findViewById2.setOnClickListener(new View$OnClickListenerC15400a(inneractiveFullscreenAdActivity));
    }

    /* renamed from: a */
    public final void m76546a(boolean z, int i, int i2) {
        int i3;
        int i4;
        if (z && !this.f30514f) {
            this.f30509a.setAlpha(0.0f);
            this.f30512d.setAlpha(0.0f);
        } else {
            this.f30509a.setAlpha(1.0f);
            this.f30512d.setAlpha(1.0f);
        }
        this.f30510b.setText("");
        this.f30510b.setVisibility(8);
        if (i >= 5) {
            int round = Math.round((AbstractC15459m.m76483b() * i) + 0.5f);
            this.f30512d.getLayoutParams().width = round;
            this.f30512d.getLayoutParams().height = round;
        }
        if (i2 >= 5) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f30509a.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f30511c.getLayoutParams();
            int round2 = Math.round((AbstractC15459m.m76483b() * i2) + 0.5f);
            int i5 = ((FrameLayout.LayoutParams) this.f30512d.getLayoutParams()).width;
            int i6 = round2 - i5;
            if (round2 > i5 && i6 > (i4 = layoutParams.rightMargin)) {
                int i7 = (i5 / 2) + (round2 / 2) + i4;
                layoutParams2.width = i7;
                layoutParams2.height = i7;
                layoutParams.gravity = 53;
                i3 = 0;
            } else {
                layoutParams2.width = round2;
                layoutParams2.height = round2;
                i3 = layoutParams.rightMargin;
                if (i6 < i3) {
                    i3 -= i6 / 2;
                }
            }
            layoutParams2.setMargins(i3, i3, i3, i3);
            layoutParams2.gravity = 17;
        }
        this.f30509a.setVisibility(0);
        this.f30512d.setVisibility(0);
        this.f30511c.setVisibility(0);
    }
}
