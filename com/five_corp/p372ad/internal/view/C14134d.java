package com.five_corp.p372ad.internal.view;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.five_corp.p372ad.internal.layouter.C13831i;
import com.five_corp.p372ad.internal.layouter.InterfaceC13834l;
import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.p373ad.custom_layout.C13648i;
import java.util.Locale;

/* renamed from: com.five_corp.ad.internal.view.d */
/* loaded from: classes4.dex */
public final class C14134d extends FrameLayout implements InterfaceC13834l {

    /* renamed from: a */
    public final TextView f26784a;

    /* renamed from: b */
    public final C14135e f26785b;

    /* renamed from: c */
    public final float f26786c;

    /* renamed from: d */
    public final C13836a f26787d;

    public C14134d(Context context, C13648i c13648i, int i, C13836a c13836a) {
        super(context);
        float f;
        this.f26787d = c13836a;
        C14135e c14135e = new C14135e(context, c13648i, c13836a);
        this.f26785b = c14135e;
        addView(c14135e, new FrameLayout.LayoutParams(-1, -1));
        TextView textView = new TextView(context);
        this.f26784a = textView;
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        textView.setTextSize(0, getHeight() * 0.8f);
        textView.setTextColor(AbstractC14130I.m78062a(c13648i.f25318d));
        textView.setSingleLine();
        addView(textView, layoutParams);
        if (i >= 100000) {
            f = 0.5f;
        } else if (i >= 10000) {
            f = 0.65f;
        } else {
            this.f26786c = 0.8f;
            return;
        }
        this.f26786c = f;
    }

    @Override // com.five_corp.p372ad.internal.layouter.InterfaceC13834l
    /* renamed from: a */
    public final void mo78061a(C13831i c13831i) {
        TextView textView = this.f26784a;
        Locale locale = Locale.ENGLISH;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c13831i.f25823b / 1000);
        textView.setText(sb2.toString());
        C14135e c14135e = this.f26785b;
        c14135e.getClass();
        c14135e.f26791d = c13831i.f25825d;
        c14135e.invalidate();
        invalidate();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        try {
            this.f26784a.setTextSize(0, getHeight() * this.f26786c);
        } catch (Throwable th) {
            this.f26787d.m78269a(th);
        }
    }
}
