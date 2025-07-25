package com.yandex.mobile.ads.impl;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* renamed from: com.yandex.mobile.ads.impl.zh */
/* loaded from: classes8.dex */
public final class C31987zh {
    @NotNull
    /* renamed from: a */
    public static C31896yh m26231a(@NotNull JSONObject jsonValue) {
        String str;
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(jsonValue, "jsonValue");
        Object opt = jsonValue.opt(ViewHierarchyConstants.DIMENSION_TOP_KEY);
        String str4 = null;
        if (opt instanceof String) {
            str = (String) opt;
        } else {
            str = null;
        }
        Object opt2 = jsonValue.opt("right");
        if (opt2 instanceof String) {
            str2 = (String) opt2;
        } else {
            str2 = null;
        }
        Object opt3 = jsonValue.opt("left");
        if (opt3 instanceof String) {
            str3 = (String) opt3;
        } else {
            str3 = null;
        }
        Object opt4 = jsonValue.opt("bottom");
        if (opt4 instanceof String) {
            str4 = (String) opt4;
        }
        return new C31896yh(str, str2, str3, str4);
    }
}
