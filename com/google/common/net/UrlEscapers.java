package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escaper;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class UrlEscapers {

    /* renamed from: a */
    private static final Escaper f41426a = new PercentEscaper(com.google.gdata.util.common.base.PercentEscaper.SAFECHARS_URLENCODER, true);

    /* renamed from: b */
    private static final Escaper f41427b = new PercentEscaper("-._~!$'()*,;&=@:+", false);

    /* renamed from: c */
    private static final Escaper f41428c = new PercentEscaper("-._~!$'()*,;&=@:+/?", false);

    private UrlEscapers() {
    }

    public static Escaper urlFormParameterEscaper() {
        return f41426a;
    }

    public static Escaper urlFragmentEscaper() {
        return f41428c;
    }

    public static Escaper urlPathSegmentEscaper() {
        return f41427b;
    }
}
