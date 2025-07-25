package com.five_corp.p372ad.internal.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.FrameLayout;
import com.five_corp.p372ad.C13611f;
import com.five_corp.p372ad.CreativeType;
import com.five_corp.p372ad.internal.C14064o;
import com.five_corp.p372ad.internal.C14067r;
import com.five_corp.p372ad.internal.context.C13760i;
import com.five_corp.p372ad.internal.http.movcache.C13812h;
import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.movie.exoplayer.C13861c;
import com.five_corp.p372ad.internal.viewability.C14158b;

/* renamed from: com.five_corp.ad.internal.view.H */
/* loaded from: classes4.dex */
public abstract class AbstractC14129H extends FrameLayout {

    /* renamed from: a */
    public final Context f26772a;

    /* renamed from: b */
    public final C13760i f26773b;

    /* renamed from: c */
    public final C14133c f26774c;

    /* renamed from: d */
    public final InterfaceC14128G f26775d;

    /* renamed from: e */
    public final C13836a f26776e;

    /* renamed from: f */
    public final C14064o f26777f;

    /* renamed from: g */
    public int f26778g;

    /* renamed from: h */
    public int f26779h;

    static {
        AbstractC14129H.class.toString();
    }

    public AbstractC14129H(Context context, C13760i c13760i, C14064o c14064o, InterfaceC14128G interfaceC14128G, C13836a c13836a) {
        super(context);
        this.f26772a = context;
        this.f26773b = c13760i;
        this.f26775d = interfaceC14128G;
        new Handler(Looper.getMainLooper());
        this.f26777f = c14064o;
        this.f26776e = c13836a;
        C14133c c14133c = new C14133c(context, new FrameLayout.LayoutParams(0, 0));
        this.f26774c = c14133c;
        addView(c14133c, new FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: a */
    public static AbstractC14129H m78072a(Context context, C13760i c13760i, C14064o c14064o, InterfaceC14128G interfaceC14128G, C13836a c13836a, C14067r c14067r, C13812h c13812h, C13861c c13861c) {
        CreativeType creativeType = c13760i.f25591b.f25184b;
        int i = AbstractC14127F.f26771a[creativeType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new C14125D(context, c13760i, c14064o, interfaceC14128G, c13836a);
            }
            throw new RuntimeException("Unknown CreativeType: " + creativeType.value);
        }
        return new C14126E(context, c13760i, c14064o, interfaceC14128G, c13836a, c14067r, c13812h, c13861c);
    }

    /* renamed from: a */
    public abstract void mo78071a(C14158b c14158b);

    /* renamed from: a */
    public abstract void mo78070a(boolean z);

    /* renamed from: c */
    public abstract boolean mo78069c();

    /* renamed from: d */
    public abstract void mo78068d();

    /* renamed from: e */
    public abstract void mo78067e();

    /* renamed from: f */
    public abstract void mo78066f();

    /* renamed from: g */
    public abstract void mo78065g();

    public abstract int getCurrentPositionMs();

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C14064o c14064o = this.f26777f;
        if (!c14064o.f26235b) {
            c14064o.f26235b = true;
            if (c14064o.f26236c) {
                ((C13611f) c14064o.f26234a).m78536l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z;
        super.onDetachedFromWindow();
        C14064o c14064o = this.f26777f;
        boolean z2 = c14064o.f26235b;
        if (z2 && c14064o.f26236c) {
            z = true;
        } else {
            z = false;
        }
        if (z2) {
            c14064o.f26235b = false;
            if (z) {
                ((C13611f) c14064o.f26234a).m78535m();
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        try {
            if (this.f26778g != i || this.f26779h != i2) {
                this.f26778g = i;
                this.f26779h = i2;
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                C14133c c14133c = this.f26774c;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(size, size2);
                c14133c.f26783a = layoutParams;
                for (int i3 = 0; i3 < c14133c.getChildCount(); i3++) {
                    c14133c.getChildAt(i3).setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th) {
            this.f26776e.m78269a(th);
        }
        super.onMeasure(i, i2);
    }
}
