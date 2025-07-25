package com.taurusx.tax.p617k;

import android.text.TextUtils;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.Tracking;
import com.taurusx.tax.p606j.C28518e;
import com.taurusx.tax.p606j.C28530n;
import com.taurusx.tax.vast.VastResourceXmlManager;
import com.taurusx.tax.vast.VastTracker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.w3c.dom.Node;

/* renamed from: com.taurusx.tax.k.d */
/* loaded from: classes7.dex */
public class C28568d {

    /* renamed from: a */
    public final Node f74058a;

    /* renamed from: b */
    public final VastResourceXmlManager f74059b;

    public C28568d(Node node) {
        C28530n.m37996a(node, "companionNode cannot be null");
        this.f74058a = node;
        this.f74059b = new VastResourceXmlManager(node);
    }

    /* renamed from: a */
    public List<VastTracker> m37914a() {
        ArrayList arrayList = new ArrayList();
        List<Node> m38012d = C28518e.m38012d(this.f74058a, Companion.COMPANION_CLICK_TRACKING);
        if (m38012d == null) {
            return arrayList;
        }
        for (Node node : m38012d) {
            String m38030a = C28518e.m38030a(node);
            if (!TextUtils.isEmpty(m38030a)) {
                arrayList.add(new VastTracker.Builder(m38030a).build());
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public List<VastTracker> m37913b() {
        ArrayList arrayList = new ArrayList();
        Node m38014c = C28518e.m38014c(this.f74058a, "TrackingEvents");
        if (m38014c == null) {
            return arrayList;
        }
        for (Node node : C28518e.m38018b(m38014c, Tracking.NAME, "event", Collections.singletonList("creativeView"))) {
            String m38030a = C28518e.m38030a(node);
            if (m38030a != null) {
                arrayList.add(new VastTracker.Builder(m38030a).build());
            }
        }
        return arrayList;
    }
}
