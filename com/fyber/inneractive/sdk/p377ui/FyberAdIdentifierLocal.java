package com.fyber.inneractive.sdk.p377ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.C14169R;
import com.fyber.inneractive.sdk.cache.C14265b;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C14388r;
import com.fyber.inneractive.sdk.config.global.features.EnumC14354a;
import com.fyber.inneractive.sdk.network.C14688W;
import com.fyber.inneractive.sdk.p377ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.util.AbstractC15459m;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.widget.AbstractC15554a;

/* renamed from: com.fyber.inneractive.sdk.ui.FyberAdIdentifierLocal */
/* loaded from: classes4.dex */
public class FyberAdIdentifierLocal extends IFyberAdIdentifier implements View.OnClickListener {

    /* renamed from: m */
    public ImageView f30515m;

    /* renamed from: n */
    public TextView f30516n;

    /* renamed from: o */
    public boolean f30517o;

    /* renamed from: p */
    public Animator f30518p;

    /* renamed from: q */
    public float f30519q;

    /* renamed from: r */
    public Bitmap f30520r;

    public FyberAdIdentifierLocal(C14388r c14388r) {
        super(c14388r);
        this.f30517o = false;
        this.f30519q = 0.0f;
    }

    @Override // com.fyber.inneractive.sdk.p377ui.IFyberAdIdentifier
    /* renamed from: a */
    public final void mo76541a(View view) {
        LayoutInflater from = LayoutInflater.from(view.getContext());
        ViewGroup viewGroup = (ViewGroup) view.findViewById(C14169R.C14172id.ia_identifier_overlay);
        int i = 0;
        ViewGroup viewGroup2 = (ViewGroup) from.inflate(C14169R.C14173layout.ia_layout_fyber_ad_identifier, viewGroup, false);
        this.f30515m = (ImageView) viewGroup2.findViewById(C14169R.C14172id.ia_fyber_identifier_image);
        TextView textView = (TextView) viewGroup2.findViewById(C14169R.C14172id.ia_fyber_identifier_text);
        this.f30516n = textView;
        if (this.f30536j) {
            int i2 = this.f30528b;
            int i3 = this.f30529c;
            if (textView != null && textView.getLayoutParams() != null) {
                textView.getLayoutParams().width = AbstractC15459m.m76491a(i2);
                textView.getLayoutParams().height = AbstractC15459m.m76491a(i3);
            }
            ImageView imageView = this.f30515m;
            int i4 = this.f30530d;
            int i5 = this.f30531e;
            if (imageView != null && imageView.getLayoutParams() != null) {
                imageView.getLayoutParams().width = AbstractC15459m.m76491a(i4);
                imageView.getLayoutParams().height = AbstractC15459m.m76491a(i5);
            }
            TextView textView2 = this.f30516n;
            int i6 = this.f30532f;
            if (textView2 instanceof TextView) {
                textView2.setTextSize(i6);
            }
            m76544a(this.f30515m, this.f30533g);
            this.f30516n.setOnClickListener(this);
            this.f30516n.setText(this.f30534h);
            String str = this.f30535i;
            if (!TextUtils.isEmpty(str)) {
                IAConfigManager.f27060O.f27095s.m77724b(new C14688W(new C15401b(this), viewGroup.getContext(), new C14265b(str)));
            }
        }
        IFyberAdIdentifier.Corner corner = this.f30537k;
        if (corner == IFyberAdIdentifier.Corner.TOP_LEFT || corner == IFyberAdIdentifier.Corner.BOTTOM_LEFT) {
            viewGroup2.removeView(this.f30516n);
            viewGroup2.addView(this.f30516n);
            viewGroup2.setLayoutDirection(0);
        }
        viewGroup2.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC15402c(this));
        this.f30515m.setOnClickListener(this);
        m76545a();
        viewGroup.addView(viewGroup2);
        IFyberAdIdentifier.Corner corner2 = this.f30537k;
        corner2.getClass();
        int i7 = AbstractC15409j.f30549a[corner2.ordinal()];
        if (i7 == 1) {
            i = 51;
        } else if (i7 == 2) {
            i = 53;
        } else if (i7 == 3) {
            i = 83;
        } else if (i7 == 4) {
            i = 85;
        }
        AbstractC15459m.m76487a(viewGroup2, i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.f30515m) {
            if (this.f30518p == null) {
                AnimatorSet animatorSet = new AnimatorSet();
                ImageView imageView = this.f30515m;
                Property property = View.ROTATION_X;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, property, 90.0f);
                ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f30515m, "imageAlpha", 255, 25);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ofFloat, ofInt);
                animatorSet2.addListener(new C15403d(this, animatorSet));
                animatorSet2.setDuration(225L);
                this.f30518p = animatorSet2;
                animatorSet2.start();
                float f = 0.0f;
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f30515m, property, 0.0f);
                ObjectAnimator ofInt2 = ObjectAnimator.ofInt(this.f30515m, "imageAlpha", 25, 255);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.playTogether(ofFloat2, ofInt2);
                animatorSet3.setDuration(225L);
                TextView textView = this.f30516n;
                Property property2 = View.TRANSLATION_X;
                if (this.f30517o) {
                    f = this.f30519q;
                }
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textView, property2, f);
                ofFloat3.setDuration(450L);
                animatorSet.setDuration(450L);
                animatorSet.playTogether(ofFloat3, animatorSet3);
                animatorSet.addListener(new C15404e(this));
            }
        } else if (view == this.f30516n && this.f30538l == EnumC14354a.OPEN) {
            m76545a();
            IFyberAdIdentifier.ClickListener clickListener = this.f30527a;
            if (clickListener != null) {
                clickListener.mo76540a();
            }
        }
    }

    /* renamed from: a */
    public final void m76545a() {
        this.f30517o = false;
        this.f30516n.setTranslationX(0.0f);
        this.f30515m.setImageResource(C14169R.C14171drawable.ia_fyber_info_button);
        m76544a(this.f30515m, this.f30533g);
        Animator animator = this.f30518p;
        if (animator != null) {
            animator.removeAllListeners();
            this.f30518p = null;
        }
    }

    /* renamed from: a */
    public static void m76544a(ImageView imageView, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                AbstractC15554a.m76357a(imageView, ColorStateList.valueOf(Color.parseColor(str)));
                return;
            } catch (Exception unused) {
                IAlog.m76524f("could not parse color %s", str);
                return;
            }
        }
        AbstractC15554a.m76357a(imageView, null);
    }
}
