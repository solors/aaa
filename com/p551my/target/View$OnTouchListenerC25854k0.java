package com.p551my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.p551my.target.common.views.StarsRatingView;
import com.p551my.target.nativeads.constants.NativeAdColor;
import java.util.HashMap;

/* renamed from: com.my.target.k0 */
/* loaded from: classes7.dex */
public class View$OnTouchListenerC25854k0 extends FrameLayout implements View.OnTouchListener {

    /* renamed from: a */
    public final TextView f67072a;

    /* renamed from: b */
    public final TextView f67073b;

    /* renamed from: c */
    public final TextView f67074c;

    /* renamed from: d */
    public final LinearLayout f67075d;

    /* renamed from: e */
    public final LinearLayout f67076e;

    /* renamed from: f */
    public final TextView f67077f;

    /* renamed from: g */
    public final StarsRatingView f67078g;

    /* renamed from: h */
    public final TextView f67079h;

    /* renamed from: i */
    public final C25869ka f67080i;

    /* renamed from: j */
    public final boolean f67081j;

    /* renamed from: k */
    public final HashMap f67082k;

    /* renamed from: l */
    public String f67083l;

    /* renamed from: m */
    public View.OnClickListener f67084m;

    public View$OnTouchListenerC25854k0(Context context, C25869ka c25869ka, boolean z) {
        super(context);
        this.f67082k = new HashMap();
        TextView textView = new TextView(context);
        this.f67072a = textView;
        this.f67073b = new TextView(context);
        TextView textView2 = new TextView(context);
        this.f67074c = textView2;
        this.f67075d = new LinearLayout(context);
        TextView textView3 = new TextView(context);
        this.f67077f = textView3;
        StarsRatingView starsRatingView = new StarsRatingView(context);
        this.f67078g = starsRatingView;
        TextView textView4 = new TextView(context);
        this.f67079h = textView4;
        this.f67076e = new LinearLayout(context);
        C25869ka.m43594b(textView, "title_text");
        C25869ka.m43594b(textView2, "description_text");
        C25869ka.m43594b(textView3, "disclaimer_text");
        C25869ka.m43594b(starsRatingView, "stars_view");
        C25869ka.m43594b(textView4, "votes_text");
        this.f67080i = c25869ka;
        this.f67081j = z;
    }

    /* renamed from: a */
    public void m43668a(boolean z) {
        int m43598b;
        int m43598b2;
        this.f67076e.setOrientation(1);
        this.f67076e.setGravity(1);
        this.f67072a.setGravity(1);
        this.f67072a.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        layoutParams.leftMargin = this.f67080i.m43598b(8);
        layoutParams.rightMargin = this.f67080i.m43598b(8);
        this.f67072a.setLayoutParams(layoutParams);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        this.f67073b.setLayoutParams(layoutParams2);
        this.f67073b.setLines(1);
        this.f67073b.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        this.f67074c.setGravity(1);
        this.f67074c.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        if (z) {
            this.f67074c.setTextSize(2, 12.0f);
            this.f67074c.setLines(2);
            this.f67074c.setEllipsize(TextUtils.TruncateAt.END);
            layoutParams3.topMargin = 0;
            layoutParams3.leftMargin = this.f67080i.m43598b(4);
            m43598b = this.f67080i.m43598b(4);
        } else {
            this.f67074c.setTextSize(2, 16.0f);
            layoutParams3.topMargin = this.f67080i.m43598b(8);
            layoutParams3.leftMargin = this.f67080i.m43598b(16);
            m43598b = this.f67080i.m43598b(16);
        }
        layoutParams3.rightMargin = m43598b;
        layoutParams3.gravity = 1;
        this.f67074c.setLayoutParams(layoutParams3);
        this.f67075d.setOrientation(0);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        this.f67075d.setLayoutParams(layoutParams4);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(this.f67080i.m43598b(73), this.f67080i.m43598b(12));
        layoutParams5.topMargin = this.f67080i.m43598b(4);
        layoutParams5.rightMargin = this.f67080i.m43598b(4);
        this.f67078g.setLayoutParams(layoutParams5);
        this.f67079h.setTextColor(NativeAdColor.STANDARD_GREY);
        this.f67079h.setTextSize(2, 14.0f);
        this.f67077f.setTextColor(NativeAdColor.STANDARD_GREY);
        this.f67077f.setGravity(1);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 1;
        if (z) {
            layoutParams6.leftMargin = this.f67080i.m43598b(4);
            m43598b2 = this.f67080i.m43598b(4);
        } else {
            layoutParams6.leftMargin = this.f67080i.m43598b(16);
            m43598b2 = this.f67080i.m43598b(16);
        }
        layoutParams6.rightMargin = m43598b2;
        layoutParams6.gravity = 1;
        this.f67077f.setLayoutParams(layoutParams6);
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams7.gravity = 17;
        addView(this.f67076e, layoutParams7);
        this.f67076e.addView(this.f67072a);
        this.f67076e.addView(this.f67073b);
        this.f67076e.addView(this.f67075d);
        this.f67076e.addView(this.f67074c);
        this.f67076e.addView(this.f67077f);
        this.f67075d.addView(this.f67078g);
        this.f67075d.addView(this.f67079h);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.f67082k.containsKey(view)) {
            return false;
        }
        if (!((Boolean) this.f67082k.get(view)).booleanValue()) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 3) {
                    setBackgroundColor(-1);
                }
            } else {
                setBackgroundColor(-1);
                View.OnClickListener onClickListener = this.f67084m;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        } else {
            setBackgroundColor(NativeAdColor.BACKGROUND_TOUCH);
        }
        return true;
    }

    public void setBanner(@NonNull C25655b4 c25655b4) {
        TextView textView;
        int i;
        float f;
        this.f67083l = c25655b4.getNavigationType();
        this.f67072a.setText(c25655b4.getTitle());
        this.f67074c.setText(c25655b4.getDescription());
        this.f67078g.setRating(c25655b4.getRating());
        this.f67079h.setText(String.valueOf(c25655b4.getVotes()));
        if ("store".equals(c25655b4.getNavigationType())) {
            C25869ka.m43594b(this.f67073b, "category_text");
            String category = c25655b4.getCategory();
            String subCategory = c25655b4.getSubCategory();
            String str = "";
            if (!TextUtils.isEmpty(category)) {
                str = "" + category;
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(subCategory)) {
                str = str + ", ";
            }
            if (!TextUtils.isEmpty(subCategory)) {
                str = str + subCategory;
            }
            if (!TextUtils.isEmpty(str)) {
                this.f67073b.setText(str);
                this.f67073b.setVisibility(0);
            } else {
                this.f67073b.setVisibility(8);
            }
            this.f67075d.setVisibility(0);
            this.f67075d.setGravity(16);
            if (c25655b4.getRating() > 0.0f) {
                this.f67078g.setVisibility(0);
                if (c25655b4.getVotes() > 0) {
                    this.f67079h.setVisibility(0);
                    textView = this.f67073b;
                    i = -3355444;
                }
            } else {
                this.f67078g.setVisibility(8);
            }
            this.f67079h.setVisibility(8);
            textView = this.f67073b;
            i = -3355444;
        } else {
            C25869ka.m43594b(this.f67073b, "domain_text");
            this.f67075d.setVisibility(8);
            this.f67073b.setText(c25655b4.getDomain());
            this.f67075d.setVisibility(8);
            textView = this.f67073b;
            i = -16733198;
        }
        textView.setTextColor(i);
        if (TextUtils.isEmpty(c25655b4.getDisclaimer())) {
            this.f67077f.setVisibility(8);
        } else {
            this.f67077f.setVisibility(0);
            this.f67077f.setText(c25655b4.getDisclaimer());
        }
        if (this.f67081j) {
            this.f67072a.setTextSize(2, 32.0f);
            this.f67074c.setTextSize(2, 24.0f);
            f = 18.0f;
            this.f67077f.setTextSize(2, 18.0f);
        } else {
            this.f67072a.setTextSize(2, 20.0f);
            f = 16.0f;
            this.f67074c.setTextSize(2, 16.0f);
            this.f67077f.setTextSize(2, 14.0f);
        }
        this.f67073b.setTextSize(2, f);
    }

    /* renamed from: a */
    public void m43669a(C26205x0 c26205x0, View.OnClickListener onClickListener) {
        HashMap hashMap;
        TextView textView;
        boolean z;
        if (c26205x0.f68183m) {
            setOnClickListener(onClickListener);
            C25869ka.m43605a(this, -1, (int) NativeAdColor.BACKGROUND_TOUCH);
            return;
        }
        this.f67084m = onClickListener;
        this.f67072a.setOnTouchListener(this);
        this.f67073b.setOnTouchListener(this);
        this.f67074c.setOnTouchListener(this);
        this.f67078g.setOnTouchListener(this);
        this.f67079h.setOnTouchListener(this);
        setOnTouchListener(this);
        this.f67082k.put(this.f67072a, Boolean.valueOf(c26205x0.f68171a));
        if ("store".equals(this.f67083l)) {
            hashMap = this.f67082k;
            textView = this.f67073b;
            z = c26205x0.f68181k;
        } else {
            hashMap = this.f67082k;
            textView = this.f67073b;
            z = c26205x0.f68180j;
        }
        hashMap.put(textView, Boolean.valueOf(z));
        this.f67082k.put(this.f67074c, Boolean.valueOf(c26205x0.f68172b));
        this.f67082k.put(this.f67078g, Boolean.valueOf(c26205x0.f68175e));
        this.f67082k.put(this.f67079h, Boolean.valueOf(c26205x0.f68176f));
        this.f67082k.put(this, Boolean.valueOf(c26205x0.f68182l));
    }
}
