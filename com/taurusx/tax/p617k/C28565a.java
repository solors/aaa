package com.taurusx.tax.p617k;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.smaato.sdk.video.vast.model.Tracking;
import com.smaato.sdk.video.vast.model.Verification;
import com.taurusx.tax.p606j.C28518e;
import com.taurusx.tax.vast.ViewabilityVendor;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.w3c.dom.Node;

/* renamed from: com.taurusx.tax.k.a */
/* loaded from: classes7.dex */
public class C28565a {

    /* renamed from: a */
    public final Set<ViewabilityVendor> f74055a = new HashSet();

    public C28565a(Node node) {
        if (node != null) {
            m37919a(node);
        }
    }

    /* renamed from: a */
    public final void m37919a(Node node) {
        List<Node> m38012d = C28518e.m38012d(C28518e.m38014c(node, "AdVerifications"), Verification.NAME);
        if (m38012d != null && !m38012d.isEmpty()) {
            for (Node node2 : m38012d) {
                Node m38028a = C28518e.m38028a(node2, "JavaScriptResource", "apiFramework", Collections.singletonList(CampaignEx.KEY_OMID));
                if (m38028a != null) {
                    Node m38028a2 = C28518e.m38028a(C28518e.m38014c(node2, "TrackingEvents"), Tracking.NAME, "event", Collections.singletonList("verificationNotExecuted"));
                    Node m38014c = C28518e.m38014c(node2, Verification.VERIFICATION_PARAMETERS);
                    ViewabilityVendor.Builder builder = new ViewabilityVendor.Builder(C28518e.m38030a(m38028a));
                    builder.withApiFramework(CampaignEx.KEY_OMID).withVendorKey(C28518e.m38029a(node2, Verification.VENDOR)).withVerificationParameters(C28518e.m38030a(m38014c)).withVerificationNotExecuted(C28518e.m38030a(m38028a2));
                    ViewabilityVendor build = builder.build();
                    if (build != null) {
                        this.f74055a.add(build);
                    }
                }
            }
        }
    }
}
