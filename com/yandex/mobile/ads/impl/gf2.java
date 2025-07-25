package com.yandex.mobile.ads.impl;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes8.dex */
public final class gf2 {
    /* renamed from: a */
    public static boolean m33837a(@NotNull XmlPullParser p) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(p, "p");
        if (p.next() != 3) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m33836b(@NotNull XmlPullParser p) throws XmlPullParserException {
        Intrinsics.checkNotNullParameter(p, "p");
        if (p.getEventType() == 2) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: c */
    public static String m33835c(@NotNull XmlPullParser p) throws IOException, XmlPullParserException {
        String str;
        int i;
        boolean z;
        Intrinsics.checkNotNullParameter(p, "p");
        if (p.next() == 4) {
            str = p.getText();
            Intrinsics.checkNotNullExpressionValue(str, "getText(...)");
            p.nextTag();
        } else {
            str = "";
        }
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            if (Intrinsics.m17071j(str.charAt(i), 32) <= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i2, length + 1).toString();
    }

    /* renamed from: d */
    public static void m33834d(@NotNull XmlPullParser parser) throws IOException, XmlPullParserException {
        Intrinsics.checkNotNullParameter(parser, "parser");
        if (parser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                int next = parser.next();
                if (next != 2) {
                    if (next == 3) {
                        i--;
                    }
                } else {
                    i++;
                }
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
