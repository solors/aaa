package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.AbstractC15480w0;
import java.util.ArrayList;
import java.util.Iterator;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.model.vast.u */
/* loaded from: classes4.dex */
public final class C14628u {

    /* renamed from: a */
    public String f27758a;

    /* renamed from: b */
    public ArrayList f27759b;

    /* renamed from: a */
    public static C14628u m77747a(Node node) {
        C14613f c14613f;
        C14628u c14628u = new C14628u();
        c14628u.f27758a = AbstractC15480w0.m76447b(node, "version");
        ArrayList m76446c = AbstractC15480w0.m76446c(node, "Ad");
        if (!m76446c.isEmpty()) {
            c14628u.f27759b = new ArrayList();
            Iterator it = m76446c.iterator();
            while (it.hasNext()) {
                Node node2 = (Node) it.next();
                if (node2 == null) {
                    c14613f = null;
                } else {
                    C14613f c14613f2 = new C14613f();
                    c14613f2.f27716a = AbstractC15480w0.m76447b(node2, "id");
                    Node m76445d = AbstractC15480w0.m76445d(node2, "Wrapper");
                    if (m76445d != null) {
                        c14613f2.f27717b = C14633z.m77743c(m76445d);
                    }
                    Node m76445d2 = AbstractC15480w0.m76445d(node2, "InLine");
                    if (m76445d2 != null) {
                        c14613f2.f27718c = C14623p.m77750c(m76445d2);
                    }
                    c14613f = c14613f2;
                }
                c14628u.f27759b.add(c14613f);
            }
        }
        return c14628u;
    }

    public final String toString() {
        return new StringBuilder("Vast: version - " + this.f27758a + "\nAds: ").toString();
    }
}
