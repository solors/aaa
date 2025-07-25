package com.yandex.div.core.view2.errors;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorVisualMonitor.kt */
@Metadata
/* renamed from: com.yandex.div.core.view2.errors.l */
/* loaded from: classes8.dex */
public final class C29707l {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final String m36886b(Throwable th) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(th.getMessage());
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            sb2.append('\n');
            sb2.append(cause.getMessage());
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "result.toString()");
        return sb3;
    }
}
