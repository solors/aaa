package com.p551my.target;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.p551my.target.common.views.StarsRatingView;
import java.util.HashMap;

/* renamed from: com.my.target.o0 */
/* loaded from: classes7.dex */
public class View$OnTouchListenerC25966o0 extends ViewGroup implements View.OnTouchListener {

    /* renamed from: a */
    public final C26038q9 f67414a;

    /* renamed from: b */
    public final TextView f67415b;

    /* renamed from: c */
    public final TextView f67416c;

    /* renamed from: d */
    public final Button f67417d;

    /* renamed from: e */
    public final C25869ka f67418e;

    /* renamed from: f */
    public final StarsRatingView f67419f;

    /* renamed from: g */
    public final TextView f67420g;

    /* renamed from: h */
    public final HashMap f67421h;

    /* renamed from: i */
    public final boolean f67422i;

    /* renamed from: j */
    public View.OnClickListener f67423j;

    /* renamed from: k */
    public View.OnClickListener f67424k;

    /* renamed from: l */
    public int f67425l;

    /* renamed from: m */
    public int f67426m;

    /* renamed from: n */
    public int f67427n;

    public View$OnTouchListenerC25966o0(boolean z, Context context) {
        super(context);
        this.f67421h = new HashMap();
        this.f67422i = z;
        this.f67418e = C25869ka.m43585e(context);
        this.f67414a = new C26038q9(context);
        this.f67415b = new TextView(context);
        this.f67416c = new TextView(context);
        this.f67417d = new Button(context);
        this.f67419f = new StarsRatingView(context);
        this.f67420g = new TextView(context);
        m43302a();
    }

    /* renamed from: a */
    public final void m43302a() {
        StarsRatingView starsRatingView;
        C25869ka c25869ka;
        int i;
        C25869ka.m43602a(this, 0, 0, -3355444, this.f67418e.m43598b(1), 0);
        this.f67426m = this.f67418e.m43598b(2);
        this.f67427n = this.f67418e.m43598b(12);
        this.f67417d.setPadding(this.f67418e.m43598b(15), this.f67418e.m43598b(10), this.f67418e.m43598b(15), this.f67418e.m43598b(10));
        this.f67417d.setMinimumWidth(this.f67418e.m43598b(100));
        this.f67417d.setTransformationMethod(null);
        this.f67417d.setSingleLine();
        if (this.f67422i) {
            this.f67417d.setTextSize(20.0f);
        } else {
            this.f67417d.setTextSize(18.0f);
        }
        Button button = this.f67417d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        button.setEllipsize(truncateAt);
        this.f67417d.setElevation(this.f67418e.m43598b(2));
        this.f67425l = this.f67418e.m43598b(12);
        C25869ka.m43595b(this.f67417d, -16733198, -16746839, this.f67418e.m43598b(2));
        this.f67417d.setTextColor(-1);
        if (this.f67422i) {
            this.f67415b.setTextSize(20.0f);
        } else {
            this.f67415b.setTextSize(18.0f);
        }
        this.f67415b.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.f67415b.setTypeface(null, 1);
        this.f67415b.setLines(1);
        this.f67415b.setEllipsize(truncateAt);
        this.f67416c.setTextColor(-7829368);
        this.f67416c.setLines(2);
        if (this.f67422i) {
            this.f67416c.setTextSize(20.0f);
        } else {
            this.f67416c.setTextSize(18.0f);
        }
        this.f67416c.setEllipsize(truncateAt);
        if (this.f67422i) {
            starsRatingView = this.f67419f;
            c25869ka = this.f67418e;
            i = 24;
        } else {
            starsRatingView = this.f67419f;
            c25869ka = this.f67418e;
            i = 18;
        }
        starsRatingView.setStarSize(c25869ka.m43598b(i));
        this.f67419f.setStarsPadding(this.f67418e.m43598b(4));
        C25869ka.m43594b(this, "card_view");
        C25869ka.m43594b(this.f67415b, "card_title_text");
        C25869ka.m43594b(this.f67416c, "card_description_text");
        C25869ka.m43594b(this.f67420g, "card_domain_text");
        C25869ka.m43594b(this.f67417d, "card_cta_button");
        C25869ka.m43594b(this.f67419f, "card_stars_view");
        C25869ka.m43594b(this.f67414a, "card_image");
        addView(this.f67414a);
        addView(this.f67416c);
        addView(this.f67415b);
        addView(this.f67417d);
        addView(this.f67419f);
        addView(this.f67420g);
    }

    @NonNull
    public Button getCtaButtonView() {
        return this.f67417d;
    }

    @NonNull
    public TextView getDescriptionTextView() {
        return this.f67416c;
    }

    @NonNull
    public TextView getDomainTextView() {
        return this.f67420g;
    }

    @NonNull
    public StarsRatingView getRatingView() {
        return this.f67419f;
    }

    @NonNull
    public C26038q9 getSmartImageView() {
        return this.f67414a;
    }

    @NonNull
    public TextView getTitleTextView() {
        return this.f67415b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5 = (i3 - i) - (this.f67426m * 2);
        if (!this.f67422i && getResources().getConfiguration().orientation == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C26038q9 c26038q9 = this.f67414a;
        c26038q9.layout(0, 0, c26038q9.getMeasuredWidth(), this.f67414a.getMeasuredHeight());
        if (z2) {
            this.f67415b.setTypeface(null, 1);
            this.f67415b.layout(0, this.f67414a.getBottom(), i5, this.f67414a.getBottom() + this.f67415b.getMeasuredHeight());
            C25869ka.m43605a(this, 0, 0);
            this.f67416c.layout(0, 0, 0, 0);
            this.f67417d.layout(0, 0, 0, 0);
            this.f67419f.layout(0, 0, 0, 0);
            this.f67420g.layout(0, 0, 0, 0);
            return;
        }
        this.f67415b.setTypeface(null, 0);
        C25869ka.m43602a(this, 0, 0, -3355444, this.f67418e.m43598b(1), 0);
        this.f67415b.layout(this.f67426m + this.f67427n, this.f67414a.getBottom(), this.f67415b.getMeasuredWidth() + this.f67426m + this.f67427n, this.f67414a.getBottom() + this.f67415b.getMeasuredHeight());
        this.f67416c.layout(this.f67426m + this.f67427n, this.f67415b.getBottom(), this.f67416c.getMeasuredWidth() + this.f67426m + this.f67427n, this.f67415b.getBottom() + this.f67416c.getMeasuredHeight());
        int measuredWidth = (i5 - this.f67417d.getMeasuredWidth()) / 2;
        Button button = this.f67417d;
        button.layout(measuredWidth, (i4 - button.getMeasuredHeight()) - this.f67427n, this.f67417d.getMeasuredWidth() + measuredWidth, i4 - this.f67427n);
        int measuredWidth2 = (i5 - this.f67419f.getMeasuredWidth()) / 2;
        this.f67419f.layout(measuredWidth2, (this.f67417d.getTop() - this.f67427n) - this.f67419f.getMeasuredHeight(), this.f67419f.getMeasuredWidth() + measuredWidth2, this.f67417d.getTop() - this.f67427n);
        int measuredWidth3 = (i5 - this.f67420g.getMeasuredWidth()) / 2;
        this.f67420g.layout(measuredWidth3, (this.f67417d.getTop() - this.f67420g.getMeasuredHeight()) - this.f67427n, this.f67420g.getMeasuredWidth() + measuredWidth3, this.f67417d.getTop() - this.f67427n);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        boolean z;
        int measuredHeight;
        int measuredHeight2;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = 0;
        if (!this.f67422i && getResources().getConfiguration().orientation == 2) {
            z = true;
        } else {
            z = false;
        }
        if (size != 0) {
            i3 = Integer.MIN_VALUE;
        }
        m43301a(size, size2, z, i3);
        if (z) {
            measuredHeight = size2 - this.f67415b.getMeasuredHeight();
            measuredHeight2 = this.f67426m;
        } else {
            measuredHeight = (((size2 - this.f67417d.getMeasuredHeight()) - (this.f67425l * 2)) - Math.max(this.f67419f.getMeasuredHeight(), this.f67420g.getMeasuredHeight())) - this.f67416c.getMeasuredHeight();
            measuredHeight2 = this.f67415b.getMeasuredHeight();
        }
        int i4 = measuredHeight - measuredHeight2;
        if (i4 <= size) {
            size = i4;
        }
        this.f67414a.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size, 1073741824));
        setMeasuredDimension(size, size2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r10 == r11) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
        if (r10 == r11) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
        r11.setPressed(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
        com.p551my.target.C25869ka.m43602a(r9, 0, 0, -3355444, r9.f67418e.m43598b(1), 0);
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r10, android.view.MotionEvent r11) {
        /*
            r9 = this;
            java.util.HashMap r0 = r9.f67421h
            boolean r0 = r0.containsKey(r10)
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.util.HashMap r0 = r9.f67421h
            java.lang.Object r0 = r0.get(r10)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r10.setClickable(r0)
            int r11 = r11.getAction()
            r2 = 1
            if (r11 == 0) goto L6d
            if (r11 == r2) goto L2d
            r3 = 3
            if (r11 == r3) goto L26
            goto L7d
        L26:
            if (r0 == 0) goto L7d
            android.widget.Button r11 = r9.f67417d
            if (r10 != r11) goto L5c
            goto L58
        L2d:
            android.view.View$OnClickListener r11 = r9.f67423j
            if (r11 == 0) goto L52
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            java.util.HashMap r3 = r9.f67421h
            android.widget.Button r4 = r9.f67417d
            java.lang.Object r3 = r3.get(r4)
            boolean r11 = r11.equals(r3)
            android.view.View$OnClickListener r3 = r9.f67424k
            if (r3 == 0) goto L4d
            android.widget.Button r4 = r9.f67417d
            if (r10 != r4) goto L4d
            if (r11 == 0) goto L4d
            r3.onClick(r10)
            goto L52
        L4d:
            android.view.View$OnClickListener r11 = r9.f67423j
            r11.onClick(r10)
        L52:
            if (r0 == 0) goto L7d
            android.widget.Button r11 = r9.f67417d
            if (r10 != r11) goto L5c
        L58:
            r11.setPressed(r1)
            goto L7d
        L5c:
            com.my.target.ka r10 = r9.f67418e
            int r7 = r10.m43598b(r2)
            r4 = 0
            r5 = 0
            r6 = -3355444(0xffffffffffcccccc, float:NaN)
            r8 = 0
            r3 = r9
            com.p551my.target.C25869ka.m43602a(r3, r4, r5, r6, r7, r8)
            goto L7d
        L6d:
            if (r0 == 0) goto L7d
            android.widget.Button r11 = r9.f67417d
            if (r10 != r11) goto L77
            r11.setPressed(r2)
            goto L7d
        L77:
            r10 = -3806472(0xffffffffffc5eaf8, float:NaN)
            r9.setBackgroundColor(r10)
        L7d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p551my.target.View$OnTouchListenerC25966o0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final void m43301a(int i, int i2, boolean z, int i3) {
        int i4 = this.f67426m * 2;
        int i5 = i2 - i4;
        int i6 = i - i4;
        if (z) {
            this.f67415b.measure(View.MeasureSpec.makeMeasureSpec(i, i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
            this.f67416c.measure(0, 0);
            this.f67419f.measure(0, 0);
            this.f67420g.measure(0, 0);
            this.f67417d.measure(0, 0);
            return;
        }
        this.f67415b.measure(View.MeasureSpec.makeMeasureSpec(i6 - (this.f67427n * 2), i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f67416c.measure(View.MeasureSpec.makeMeasureSpec(i6 - (this.f67427n * 2), i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f67419f.measure(View.MeasureSpec.makeMeasureSpec(i6, i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f67420g.measure(View.MeasureSpec.makeMeasureSpec(i6, i3), View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE));
        this.f67417d.measure(View.MeasureSpec.makeMeasureSpec(i6 - (this.f67427n * 2), i3), View.MeasureSpec.makeMeasureSpec(i5 - (this.f67427n * 2), Integer.MIN_VALUE));
    }

    /* renamed from: a */
    public void m43300a(View.OnClickListener onClickListener, C26205x0 c26205x0, View.OnClickListener onClickListener2) {
        this.f67423j = onClickListener;
        this.f67424k = onClickListener2;
        if (onClickListener == null || c26205x0 == null) {
            super.setOnClickListener(null);
            this.f67417d.setOnClickListener(null);
            return;
        }
        setOnTouchListener(this);
        this.f67414a.setOnTouchListener(this);
        this.f67415b.setOnTouchListener(this);
        this.f67416c.setOnTouchListener(this);
        this.f67419f.setOnTouchListener(this);
        this.f67420g.setOnTouchListener(this);
        this.f67417d.setOnTouchListener(this);
        boolean z = false;
        this.f67421h.put(this.f67414a, Boolean.valueOf(c26205x0.f68174d || c26205x0.f68183m));
        this.f67421h.put(this, Boolean.valueOf(c26205x0.f68182l || c26205x0.f68183m));
        this.f67421h.put(this.f67415b, Boolean.valueOf(c26205x0.f68171a || c26205x0.f68183m));
        this.f67421h.put(this.f67416c, Boolean.valueOf(c26205x0.f68172b || c26205x0.f68183m));
        this.f67421h.put(this.f67419f, Boolean.valueOf(c26205x0.f68175e || c26205x0.f68183m));
        this.f67421h.put(this.f67420g, Boolean.valueOf(c26205x0.f68180j || c26205x0.f68183m));
        HashMap hashMap = this.f67421h;
        Button button = this.f67417d;
        if (c26205x0.f68177g || c26205x0.f68183m) {
            z = true;
        }
        hashMap.put(button, Boolean.valueOf(z));
    }
}
