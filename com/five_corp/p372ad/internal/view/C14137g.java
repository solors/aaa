package com.five_corp.p372ad.internal.view;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.five_corp.p372ad.internal.context.C13760i;
import com.five_corp.p372ad.internal.layouter.C13827e;
import com.five_corp.p372ad.internal.layouter.C13833k;
import com.five_corp.p372ad.internal.layouter.InterfaceC13826d;
import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.p373ad.custom_layout.C13643d;
import com.five_corp.p372ad.internal.viewability.C14157a;

/* renamed from: com.five_corp.ad.internal.view.g */
/* loaded from: classes4.dex */
public final class C14137g extends FrameLayout {

    /* renamed from: a */
    public final C14157a f26795a;

    /* renamed from: b */
    public final C13827e f26796b;

    public C14137g(Context context, C13836a c13836a, View view, InterfaceC13826d interfaceC13826d, C13760i c13760i, String str, C14157a c14157a, C13643d c13643d, C13833k c13833k) {
        super(context);
        this.f26795a = c14157a;
        this.f26796b = new C13827e(this, context, c13836a, view, interfaceC13826d, c13760i, str, c14157a, c13643d, c13833k);
    }

    /* renamed from: a */
    public final void m78060a() {
        this.f26796b.m78298a();
    }

    public C13643d getCustomLayoutConfig() {
        return this.f26796b.f25792g;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        C13827e c13827e = this.f26796b;
        c13827e.getClass();
        try {
            if (c13827e.f25794i != i || c13827e.f25795j != i2) {
                c13827e.f25794i = i;
                c13827e.f25795j = i2;
                c13827e.m78296a(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            }
        } catch (Exception e) {
            c13827e.f25789d.m78269a(e);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        C14157a c14157a = this.f26795a;
        synchronized (c14157a.f26824g) {
            c14157a.f26825h = z;
        }
    }
}
