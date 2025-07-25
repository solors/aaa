package com.taurusx.tax.vast;

import com.smaato.sdk.video.vast.model.Extension;
import com.taurusx.tax.p606j.C28518e;
import com.taurusx.tax.p606j.C28530n;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;

/* loaded from: classes7.dex */
public class VastExtensionParentXmlManager {

    /* renamed from: a */
    public final Node f74332a;

    public VastExtensionParentXmlManager(Node node) {
        C28530n.m37997a(node);
        this.f74332a = node;
    }

    /* renamed from: a */
    public List<VastExtensionXmlManager> m37816a() {
        ArrayList arrayList = new ArrayList();
        List<Node> m38012d = C28518e.m38012d(this.f74332a, Extension.NAME);
        if (m38012d == null) {
            return arrayList;
        }
        for (Node node : m38012d) {
            arrayList.add(new VastExtensionXmlManager(node));
        }
        return arrayList;
    }
}
