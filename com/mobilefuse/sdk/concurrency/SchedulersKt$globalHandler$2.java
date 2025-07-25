package com.mobilefuse.sdk.concurrency;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: Schedulers.kt */
@Metadata
/* loaded from: classes7.dex */
final class SchedulersKt$globalHandler$2 extends Lambda implements Functions<Handler> {
    public static final SchedulersKt$globalHandler$2 INSTANCE = new SchedulersKt$globalHandler$2();

    SchedulersKt$globalHandler$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final Handler invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
