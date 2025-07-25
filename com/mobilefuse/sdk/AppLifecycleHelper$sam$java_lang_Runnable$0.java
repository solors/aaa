package com.mobilefuse.sdk;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppLifecycleHelper.kt */
@Metadata
/* loaded from: classes7.dex */
final class AppLifecycleHelper$sam$java_lang_Runnable$0 implements Runnable {
    private final /* synthetic */ Functions function;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppLifecycleHelper$sam$java_lang_Runnable$0(Functions functions) {
        this.function = functions;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        Intrinsics.checkNotNullExpressionValue(this.function.invoke(), "invoke(...)");
    }
}
