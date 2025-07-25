package com.taurusx.tax.p617k;

import com.smaato.sdk.video.vast.model.Tracking;
import com.taurusx.tax.p606j.C28518e;
import com.taurusx.tax.p606j.C28530n;
import com.taurusx.tax.vast.VastFractionalProgressTracker;
import com.taurusx.tax.vast.VastTracker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* renamed from: com.taurusx.tax.k.f */
/* loaded from: classes7.dex */
public class C28570f {

    /* renamed from: a */
    public final Node f74060a;

    public C28570f(Node node) {
        C28530n.m37997a(node);
        this.f74060a = node;
    }

    /* renamed from: a */
    public final List<String> m37912a(String str) {
        C28530n.m37997a(str);
        ArrayList arrayList = new ArrayList();
        Node m38014c = C28518e.m38014c(this.f74060a, "TrackingEvents");
        if (m38014c == null) {
            return arrayList;
        }
        for (Node node : C28518e.m38018b(m38014c, Tracking.NAME, "event", Collections.singletonList(str))) {
            String m38030a = C28518e.m38030a(node);
            if (m38030a != null) {
                arrayList.add(m38030a);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final List<VastTracker> m37910b(String str) {
        ArrayList arrayList = (ArrayList) m37912a(str);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new VastTracker.Builder((String) it.next()).build());
        }
        return arrayList2;
    }

    /* renamed from: a */
    public final void m37911a(List<VastFractionalProgressTracker> list, List<String> list2, float f) {
        C28530n.m37996a(list, "trackers cannot be null");
        C28530n.m37996a(list2, "urls cannot be null");
        for (String str : list2) {
            list.add(new VastFractionalProgressTracker.Builder(str, f).build());
        }
    }
}
