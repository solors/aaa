package com.taurusx.tax.vast;

import com.taurusx.tax.p606j.C28530n;
import org.w3c.dom.Node;

/* loaded from: classes7.dex */
public class VastIconXmlManager {
    public static final String DURATION = "duration";
    public static final String HEIGHT = "height";
    public static final String ICON_CLICKS = "IconClicks";
    public static final String ICON_CLICK_THROUGH = "IconClickThrough";
    public static final String ICON_CLICK_TRACKING = "IconClickTracking";
    public static final String ICON_VIEW_TRACKING = "IconViewTracking";
    public static final String OFFSET = "offset";
    public static final String WIDTH = "width";

    /* renamed from: a */
    public final Node f74340a;

    /* renamed from: b */
    public final VastResourceXmlManager f74341b;

    public VastIconXmlManager(Node node) {
        C28530n.m37997a(node);
        this.f74340a = node;
        this.f74341b = new VastResourceXmlManager(node);
    }
}
