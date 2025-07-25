package com.google.common.xml;

import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;

@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes4.dex */
public class XmlEscapers {

    /* renamed from: a */
    private static final Escaper f42013a;

    /* renamed from: b */
    private static final Escaper f42014b;

    /* renamed from: c */
    private static final Escaper f42015c;

    static {
        Escapers.Builder builder = Escapers.builder();
        builder.setSafeRange((char) 0, (char) 65533);
        builder.setUnsafeReplacement("�");
        for (char c = 0; c <= 31; c = (char) (c + 1)) {
            if (c != '\t' && c != '\n' && c != '\r') {
                builder.addEscape(c, "�");
            }
        }
        builder.addEscape('&', "&amp;");
        builder.addEscape('<', "&lt;");
        builder.addEscape('>', "&gt;");
        f42014b = builder.build();
        builder.addEscape('\'', "&apos;");
        builder.addEscape('\"', "&quot;");
        f42013a = builder.build();
        builder.addEscape('\t', "&#x9;");
        builder.addEscape('\n', "&#xA;");
        builder.addEscape('\r', "&#xD;");
        f42015c = builder.build();
    }

    private XmlEscapers() {
    }

    public static Escaper xmlAttributeEscaper() {
        return f42015c;
    }

    public static Escaper xmlContentEscaper() {
        return f42014b;
    }
}
