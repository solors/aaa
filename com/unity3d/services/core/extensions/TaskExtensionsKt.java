package com.unity3d.services.core.extensions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: TaskExtensions.kt */
@Metadata
/* loaded from: classes7.dex */
public final class TaskExtensionsKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0083 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x012c -> B:45:0x0132). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0147 -> B:49:0x0153). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> java.lang.Object withRetry(long r20, int r22, double r23, @org.jetbrains.annotations.NotNull java.lang.Exception r25, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r26, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super T> r27) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.extensions.TaskExtensionsKt.withRetry(long, int, double, java.lang.Exception, kotlin.jvm.functions.Function2, kotlin.coroutines.d):java.lang.Object");
    }

    public static /* synthetic */ Object withRetry$default(long j, int i, double d, Exception exc, Function2 function2, Continuation continuation, int i2, Object obj) {
        long j2;
        int i3;
        double d2;
        if ((i2 & 1) != 0) {
            j2 = 5000;
        } else {
            j2 = j;
        }
        if ((i2 & 2) != 0) {
            i3 = 6;
        } else {
            i3 = i;
        }
        if ((i2 & 4) != 0) {
            d2 = 2.0d;
        } else {
            d2 = d;
        }
        return withRetry(j2, i3, d2, exc, function2, continuation);
    }
}
