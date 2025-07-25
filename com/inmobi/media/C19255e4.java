package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.e4 */
/* loaded from: classes6.dex */
public final class C19255e4 implements InterfaceC19459sc {

    /* renamed from: a */
    public final /* synthetic */ C19311i4 f48174a;

    public C19255e4(C19311i4 c19311i4) {
        this.f48174a = c19311i4;
    }

    @Override // com.inmobi.media.InterfaceC19459sc
    /* renamed from: a */
    public final void mo59909a(ArrayList visibleViews, ArrayList invisibleViews) {
        Object obj;
        Intrinsics.checkNotNullParameter(visibleViews, "visibleViews");
        Intrinsics.checkNotNullParameter(invisibleViews, "invisibleViews");
        Intrinsics.checkNotNullExpressionValue(this.f48174a.f48355d, "access$getTAG$p(...)");
        Objects.toString(visibleViews);
        Objects.toString(invisibleViews);
        Iterator it = visibleViews.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            C19283g4 c19283g4 = (C19283g4) this.f48174a.f48352a.get(view);
            if (c19283g4 == null) {
                this.f48174a.m60246a(view);
            } else {
                C19283g4 c19283g42 = (C19283g4) this.f48174a.f48353b.get(view);
                Object obj2 = c19283g4.f48251a;
                if (c19283g42 != null) {
                    obj = c19283g42.f48251a;
                } else {
                    obj = null;
                }
                if (!Intrinsics.m17075f(obj2, obj)) {
                    c19283g4.f48254d = SystemClock.uptimeMillis();
                    this.f48174a.f48353b.put(view, c19283g4);
                }
            }
        }
        Iterator it2 = invisibleViews.iterator();
        while (it2.hasNext()) {
            this.f48174a.f48353b.remove((View) it2.next());
        }
        C19311i4 c19311i4 = this.f48174a;
        if (!c19311i4.f48356e.hasMessages(0)) {
            c19311i4.f48356e.postDelayed(c19311i4.f48357f, c19311i4.f48358g);
        }
    }
}
