package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.AbstractC15480w0;
import com.smaato.sdk.video.vast.model.InLine;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.model.vast.p */
/* loaded from: classes4.dex */
public final class C14623p extends AbstractC14614g {
    /* renamed from: c */
    public static C14623p m77750c(Node node) {
        C14623p c14623p = new C14623p();
        super.m77753b(node);
        AbstractC15480w0.m76449a(AbstractC15480w0.m76445d(node, InLine.AD_TITLE));
        AbstractC15480w0.m76449a(AbstractC15480w0.m76445d(node, InLine.DESCRIPTION));
        return c14623p;
    }
}
