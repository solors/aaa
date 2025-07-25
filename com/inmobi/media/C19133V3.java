package com.inmobi.media;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.V3 */
/* loaded from: classes6.dex */
public final class C19133V3 implements InterfaceC19459sc {

    /* renamed from: a */
    public final /* synthetic */ C19146W3 f47854a;

    public C19133V3(C19146W3 c19146w3) {
        this.f47854a = c19146w3;
    }

    @Override // com.inmobi.media.InterfaceC19459sc
    /* renamed from: a */
    public final void mo59909a(ArrayList visibleViews, ArrayList invisibleViews) {
        Intrinsics.checkNotNullParameter(visibleViews, "visibleViews");
        Intrinsics.checkNotNullParameter(invisibleViews, "invisibleViews");
        Iterator it = visibleViews.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            InterfaceC19417pc interfaceC19417pc = (InterfaceC19417pc) this.f47854a.f47894i.get(view);
            if (interfaceC19417pc != null) {
                interfaceC19417pc.mo59958a(view, true);
            }
        }
        Iterator it2 = invisibleViews.iterator();
        while (it2.hasNext()) {
            View view2 = (View) it2.next();
            InterfaceC19417pc interfaceC19417pc2 = (InterfaceC19417pc) this.f47854a.f47894i.get(view2);
            if (interfaceC19417pc2 != null) {
                interfaceC19417pc2.mo59958a(view2, false);
            }
        }
    }
}
