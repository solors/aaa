package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.AbstractC15480w0;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.model.vast.z */
/* loaded from: classes4.dex */
public final class C14633z extends AbstractC14614g {

    /* renamed from: h */
    public String f27765h;

    public C14633z() {
        this.f27724f = 1;
    }

    /* renamed from: c */
    public static C14633z m77743c(Node node) {
        C14633z c14633z = new C14633z();
        super.m77753b(node);
        c14633z.f27765h = AbstractC15480w0.m76449a(AbstractC15480w0.m76445d(node, "VASTAdTagURI"));
        return c14633z;
    }
}
