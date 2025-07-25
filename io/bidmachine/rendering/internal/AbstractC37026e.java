package io.bidmachine.rendering.internal;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import io.bidmachine.rendering.internal.view.C37072e;
import io.bidmachine.rendering.model.ElementLayoutParams;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.bidmachine.rendering.internal.e */
/* loaded from: classes9.dex */
public abstract class AbstractC37026e {
    /* renamed from: a */
    public static void m19216a(ViewGroup viewGroup, C37072e c37072e, List list, InterfaceC36947a interfaceC36947a) {
        View mo19422k = interfaceC36947a.mo19422k();
        if (mo19422k == null) {
            AbstractC37037k.m19167a("AdViewPresenter", "AdsElement (%s) - Can't add ad element, view is null", interfaceC36947a);
            return;
        }
        Context context = c37072e.getContext();
        ElementLayoutParams layoutParams = interfaceC36947a.mo19464i().getLayoutParams();
        int widthPx = layoutParams.getWidthPx(context);
        int heightPx = layoutParams.getHeightPx(context);
        if (widthPx <= 0) {
            widthPx = -1;
        }
        if (heightPx <= 0) {
            heightPx = -1;
        }
        C37072e.C37073a c37073a = new C37072e.C37073a(widthPx, heightPx);
        c37073a.m19082a(context, layoutParams, list);
        mo19422k.setTranslationX(layoutParams.getTranslationXPx(context));
        mo19422k.setTranslationY(layoutParams.getTranslationYPx(context));
        c37072e.addView(mo19422k, c37073a);
        try {
            interfaceC36947a.mo19436a(viewGroup);
        } catch (Throwable th) {
            AbstractC37037k.m19161b(th);
        }
        AbstractC37037k.m19162b("AdViewPresenter", "AdsElement (%s) - view added (%s)", interfaceC36947a, mo19422k);
    }

    /* renamed from: a */
    public static void m19217a(ViewGroup viewGroup, C37072e c37072e, List list) {
        c37072e.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m19216a(viewGroup, c37072e, list, (InterfaceC36947a) it.next());
        }
    }

    /* renamed from: a */
    public static View m19215a(List list, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC36947a interfaceC36947a = (InterfaceC36947a) it.next();
            if (interfaceC36947a.mo19464i().getName().equals(str)) {
                return interfaceC36947a.mo19422k();
            }
        }
        return null;
    }
}
