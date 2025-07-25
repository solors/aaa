package com.inmobi.media;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.R6 */
/* loaded from: classes6.dex */
public final class C19084R6 implements InterfaceC19459sc {

    /* renamed from: a */
    public final /* synthetic */ C19097S6 f47661a;

    public C19084R6(C19097S6 c19097s6) {
        this.f47661a = c19097s6;
    }

    @Override // com.inmobi.media.InterfaceC19459sc
    /* renamed from: a */
    public final void mo59909a(ArrayList visibleViews, ArrayList invisibleViews) {
        Intrinsics.checkNotNullParameter(visibleViews, "visibleViews");
        Intrinsics.checkNotNullParameter(invisibleViews, "invisibleViews");
        Iterator it = visibleViews.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            InterfaceC19417pc interfaceC19417pc = (InterfaceC19417pc) this.f47661a.f47698f.get(view);
            if (interfaceC19417pc != null) {
                interfaceC19417pc.mo59958a(view, true);
            }
        }
        Iterator it2 = invisibleViews.iterator();
        while (it2.hasNext()) {
            View view2 = (View) it2.next();
            InterfaceC19417pc interfaceC19417pc2 = (InterfaceC19417pc) this.f47661a.f47698f.get(view2);
            if (interfaceC19417pc2 != null) {
                interfaceC19417pc2.mo59958a(view2, false);
            }
        }
    }
}
