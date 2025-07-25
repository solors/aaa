package com.mobilefuse.sdk;

import com.mobilefuse.sdk.AppLifecycleHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AppLifecycleHelper.kt */
@Metadata
/* loaded from: classes7.dex */
final class AppLifecycleHelper$onApplicationTransitionToForeground$1$1 extends Lambda implements Function1<AppLifecycleHelper.ActivityLifecycleObserver, Unit> {
    public static final AppLifecycleHelper$onApplicationTransitionToForeground$1$1 INSTANCE = new AppLifecycleHelper$onApplicationTransitionToForeground$1$1();

    AppLifecycleHelper$onApplicationTransitionToForeground$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver) {
        invoke2(activityLifecycleObserver);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull AppLifecycleHelper.ActivityLifecycleObserver it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.onApplicationInForeground();
    }
}
