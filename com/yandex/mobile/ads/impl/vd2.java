package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Indent;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class vd2 {
    @NotNull

    /* renamed from: a */
    private static final String f86708a;
    @NotNull

    /* renamed from: b */
    private static final String f86709b;

    /* renamed from: c */
    public static final /* synthetic */ int f86710c = 0;

    static {
        C37612s0 c37612s0 = C37612s0.f99333a;
        Locale locale = Locale.US;
        String format = String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function(%3$s) { \n      return %4$s.%1$s(%2$s, %3$s); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", Arrays.copyOf(new Object[]{"onAdRender", "document.querySelector('#rtb').offsetHeight", "testTag", "AdPerformActionsJSI"}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        f86708a = format;
        String format2 = String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function() { \n      return %2$s.%1$s(); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", Arrays.copyOf(new Object[]{"getBannerInfo", "AdPerformActionsJSI"}, 2));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        f86709b = format2;
    }

    @NotNull
    /* renamed from: a */
    public static String m28359a(int i, int i2) {
        String m16649f;
        m16649f = Indent.m16649f("\n\n        <style>ytag.container { width:" + i + "px; height:" + i2 + "px; }</style>\n\n        ");
        return m16649f;
    }

    @NotNull
    /* renamed from: b */
    public static String m28358b() {
        return f86708a;
    }

    @NotNull
    /* renamed from: a */
    public static String m28360a(int i) {
        return "<body style='width:" + i + "px;'>";
    }

    @NotNull
    /* renamed from: a */
    public static String m28361a() {
        return f86709b;
    }
}
