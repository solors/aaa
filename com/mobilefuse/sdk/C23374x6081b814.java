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
/* renamed from: com.mobilefuse.sdk.AppLifecycleHelper$getActivityLifecycleCallbacks$1$onActivityResumed$$inlined$runnableTry$1$lambda$1 */
/* loaded from: classes7.dex */
final class C23374x6081b814 extends Lambda implements Function1<AppLifecycleHelper.ActivityLifecycleObserver, Unit> {
    final /* synthetic */ C23373xcbc62f24 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23374x6081b814(C23373xcbc62f24 c23373xcbc62f24) {
        super(1);
        this.this$0 = c23373xcbc62f24;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver) {
        invoke2(activityLifecycleObserver);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull AppLifecycleHelper.ActivityLifecycleObserver it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.onActivityResumed(this.this$0.$activity$inlined);
    }
}
