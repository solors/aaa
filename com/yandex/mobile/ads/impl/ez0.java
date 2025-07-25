package com.yandex.mobile.ads.impl;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ez0 {

    /* renamed from: a */
    private static final Pattern f78847a = Pattern.compile("(<script)(.*)(src=\"mraid\\.js\")(.*)(<\\/script>)");

    /* renamed from: a */
    public static boolean m34407a(@NotNull String htmlResponse) {
        Intrinsics.checkNotNullParameter(htmlResponse, "htmlResponse");
        return f78847a.matcher(htmlResponse).find();
    }
}
