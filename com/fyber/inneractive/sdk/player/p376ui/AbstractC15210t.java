package com.fyber.inneractive.sdk.player.p376ui;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fyber.inneractive.sdk.C14169R;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.config.global.features.EnumC14375v;
import com.fyber.inneractive.sdk.flow.endcard.AbstractC14501b;
import com.fyber.inneractive.sdk.flow.endcard.C14503d;
import com.fyber.inneractive.sdk.flow.endcard.C14505f;
import com.fyber.inneractive.sdk.ignite.EnumC14568m;
import com.fyber.inneractive.sdk.model.vast.EnumC14616i;
import com.fyber.inneractive.sdk.util.AbstractC15471s;
import com.fyber.inneractive.sdk.util.C15448g0;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.ui.t */
/* loaded from: classes4.dex */
public abstract class AbstractC15210t extends AbstractC15187e {

    /* renamed from: i */
    public final int f30121i;

    /* renamed from: j */
    public final int f30122j;

    /* renamed from: k */
    public final int f30123k;

    /* renamed from: l */
    public ViewGroup f30124l;

    /* renamed from: m */
    public Button f30125m;

    /* renamed from: n */
    public int f30126n;

    /* renamed from: o */
    public int f30127o;

    /* renamed from: p */
    public boolean f30128p;

    /* renamed from: q */
    public ViewGroup f30129q;

    /* renamed from: r */
    public ViewGroup f30130r;

    /* renamed from: s */
    public final C15448g0 f30131s;

    /* renamed from: t */
    public C15448g0 f30132t;

    /* renamed from: u */
    public TextView f30133u;

    /* renamed from: v */
    public final C14388r f30134v;

    /* renamed from: w */
    public ObjectAnimator f30135w;

    /* renamed from: x */
    public boolean f30136x;

    /* renamed from: y */
    public final String f30137y;

    /* renamed from: z */
    public final C15448g0 f30138z;

    public AbstractC15210t(Context context, C14388r c14388r, String str) {
        super(context);
        this.f30126n = -1;
        this.f30127o = -1;
        this.f30128p = false;
        this.f30131s = new C15448g0(0, 0);
        this.f30136x = false;
        this.f30138z = new C15448g0(0, 0);
        IAlog.m76529a("%sctor called", IAlog.m76531a(this));
        int tickFractions = getTickFractions();
        this.f30122j = tickFractions;
        this.f30121i = getMaxTickFactor();
        this.f30123k = 1000 / tickFractions;
        setBackgroundColor(getResources().getColor(C14169R.C14170color.ia_video_background_color));
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f30134v = c14388r;
        this.f30137y = str;
    }

    /* renamed from: a */
    public abstract void mo77071a(int i, int i2);

    /* renamed from: a */
    public abstract void mo77069a(AbstractC14501b abstractC14501b, C15184b c15184b);

    /* renamed from: a */
    public abstract void mo77066a(boolean z);

    /* renamed from: a */
    public void mo77065a(boolean z, int i, int i2) {
        this.f30126n = i;
        this.f30127o = i2;
        this.f30128p = z;
    }

    /* renamed from: a */
    public abstract void mo77063a(boolean z, EnumC14568m enumC14568m);

    /* renamed from: a */
    public abstract void mo77062a(boolean z, String str);

    /* renamed from: b */
    public abstract void mo77061b(boolean z);

    /* renamed from: c */
    public abstract void mo77060c(boolean z);

    /* renamed from: d */
    public abstract void mo77059d(boolean z);

    public void destroy() {
        mo77054g();
        setVisibility(8);
        if (this.f30049g != null) {
            this.f30049g = null;
        }
        IAlog.m76529a("%sdestroyed called", IAlog.m76531a(this));
    }

    /* renamed from: e */
    public abstract void mo77058e();

    /* renamed from: e */
    public abstract void mo77057e(boolean z);

    /* renamed from: f */
    public abstract void mo77056f();

    /* renamed from: f */
    public abstract void mo77055f(boolean z);

    /* renamed from: g */
    public abstract void mo77054g();

    /* renamed from: g */
    public abstract void mo77053g(boolean z);

    public ViewGroup getDefaultEndCardContainer() {
        return this.f30129q;
    }

    public abstract View getEndCardView();

    public int getMaxTickFactor() {
        return 1000;
    }

    public ViewGroup getTextureHost() {
        return this.f30124l;
    }

    public int getTickFractions() {
        return 5;
    }

    public abstract View[] getTrackingFriendlyView();

    public abstract View[] getTrackingFriendlyViewObstructionPurposeOther();

    public int getVideoHeight() {
        return this.f30127o;
    }

    public int getVideoWidth() {
        return this.f30126n;
    }

    /* renamed from: h */
    public final boolean m77052h() {
        if (this.f30129q.getVisibility() != 0 && this.f30130r.getChildCount() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public abstract boolean mo77051i();

    /* renamed from: j */
    public abstract void mo77050j();

    /* renamed from: k */
    public abstract void mo77049k();

    /* renamed from: l */
    public abstract boolean mo77048l();

    /* renamed from: m */
    public abstract void mo77047m();

    /* renamed from: n */
    public abstract void mo77046n();

    /* renamed from: o */
    public abstract void mo77045o();

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        mo77086a(this.f30138z, size, size2);
        C15448g0 c15448g0 = this.f30138z;
        int i3 = c15448g0.f30598a;
        if (i3 > 0 && c15448g0.f30599b > 0) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(this.f30138z.f30599b, 1073741824);
            i = makeMeasureSpec;
        } else {
            c15448g0.f30598a = size;
            c15448g0.f30599b = size2;
        }
        if (!this.f30131s.equals(this.f30138z)) {
            C15448g0 c15448g02 = this.f30131s;
            C15448g0 c15448g03 = this.f30138z;
            c15448g02.getClass();
            c15448g02.f30598a = c15448g03.f30598a;
            c15448g02.f30599b = c15448g03.f30599b;
            mo77045o();
        }
        super.onMeasure(i, i2);
    }

    public abstract void setAppInfoButtonRound(TextView textView);

    public abstract void setMuteButtonState(boolean z);

    public abstract void setRemainingTime(String str);

    public abstract void setSkipText(String str);

    /* renamed from: a */
    public void mo77068a(C14503d c14503d, C15184b c15184b) {
        ViewGroup defaultEndCardContainer = getDefaultEndCardContainer();
        if (defaultEndCardContainer != null) {
            defaultEndCardContainer.setVisibility(0);
            InterfaceC15196n interfaceC15196n = this.f30049g;
            C14505f c14505f = (C14505f) c14503d.m77861f();
            c14505f.m77855a(c15184b, interfaceC15196n);
            ViewGroup viewGroup = c14505f.f27462c;
            AbstractC15471s.m76465a(viewGroup);
            defaultEndCardContainer.addView(viewGroup);
            c14503d.m77856a(c14503d.f27456d, c14503d.f27454b);
        }
    }

    /* renamed from: a */
    public final void m77064a(boolean z, long j) {
        ViewGroup viewGroup;
        ObjectAnimator objectAnimator = this.f30135w;
        if (objectAnimator != null) {
            if (objectAnimator.getDuration() <= j) {
                ViewGroup viewGroup2 = this.f30130r;
                if (viewGroup2 != null) {
                    m77070a((View) viewGroup2.getParent(), 4);
                }
                this.f30135w.start();
                this.f30135w.addListener(new C15199q(this));
            } else {
                this.f30136x = true;
                this.f30135w = null;
                ViewGroup viewGroup3 = this.f30130r;
                if (viewGroup3 != null && viewGroup3.getParent() != null) {
                    ((View) this.f30130r.getParent()).setOnTouchListener(null);
                }
            }
            if (z && (viewGroup = this.f30129q) != null) {
                viewGroup.setVisibility(0);
                return;
            }
            ViewGroup viewGroup4 = this.f30130r;
            if (viewGroup4 != null) {
                viewGroup4.setVisibility(0);
            }
        }
    }

    /* renamed from: a */
    public final void m77070a(View view, int i) {
        if (view != null) {
            view.setOnTouchListener(new View$OnTouchListenerC15209s(new GestureDetector(view.getContext(), new C15200r(this, view, new int[2], i))));
        }
    }

    /* renamed from: a */
    public final void m77067a(C15184b c15184b) {
        if (this.f30130r != null) {
            if (EnumC14616i.Static == c15184b.f30020f && (!EnumC14375v.NONE.equals(c15184b.f30025k))) {
                ViewGroup viewGroup = this.f30130r;
                EnumC14375v enumC14375v = c15184b.f30025k;
                int i = c15184b.f30026l;
                if (this.f30136x || !EnumC14375v.ZOOM_IN.equals(enumC14375v)) {
                    return;
                }
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(viewGroup, PropertyValuesHolder.ofFloat(View.SCALE_X, 0.0f, 1.0f), PropertyValuesHolder.ofFloat(View.SCALE_Y, 0.0f, 1.0f));
                this.f30135w = ofPropertyValuesHolder;
                ofPropertyValuesHolder.setDuration(i);
                return;
            }
            this.f30130r.setVisibility(0);
        }
    }
}
