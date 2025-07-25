package com.google.common.html;

import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class HtmlEscapers {

    /* renamed from: a */
    private static final Escaper f41202a = Escapers.builder().addEscape('\"', "&quot;").addEscape('\'', "&#39;").addEscape('&', "&amp;").addEscape('<', "&lt;").addEscape('>', "&gt;").build();

    private HtmlEscapers() {
    }

    public static Escaper htmlEscaper() {
        return f41202a;
    }
}
