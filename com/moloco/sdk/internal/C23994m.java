package com.moloco.sdk.internal;

import com.moloco.sdk.publisher.MediationInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p761kc.C37469l;

/* renamed from: com.moloco.sdk.internal.m */
/* loaded from: classes7.dex */
public final class C23994m {
    /* renamed from: a */
    public static final void m47231a(@NotNull C37469l c37469l, @Nullable String str, @Nullable String str2, @Nullable MediationInfo mediationInfo) {
        Intrinsics.checkNotNullParameter(c37469l, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            sb2.append("MolocoSDK/" + str + ';');
        }
        if (mediationInfo != null) {
            sb2.append("Mediator/" + mediationInfo.getName() + ';');
        }
        if (str2 != null) {
            sb2.append("Android/" + str2 + ';');
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply {\n…$it;\") }\n    }.toString()");
        c37469l.mo15205e("X-Moloco-User-Agent", sb3);
    }

    /* renamed from: b */
    public static /* synthetic */ void m47230b(C37469l c37469l, String str, String str2, MediationInfo mediationInfo, int i, Object obj) {
        if ((i & 4) != 0) {
            mediationInfo = null;
        }
        m47231a(c37469l, str, str2, mediationInfo);
    }
}
