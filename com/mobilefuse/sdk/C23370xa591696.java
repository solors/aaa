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
/* renamed from: com.mobilefuse.sdk.AppLifecycleHelper$getActivityLifecycleCallbacks$1$onActivityDestroyed$$inlined$runnableTry$1$lambda$1 */
/* loaded from: classes7.dex */
final class C23370xa591696 extends Lambda implements Function1<AppLifecycleHelper.ActivityLifecycleObserver, Unit> {
    final /* synthetic */ Try this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23370xa591696(Try r1) {
        super(1);
        this.this$0 = r1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver) {
        invoke2(activityLifecycleObserver);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull AppLifecycleHelper.ActivityLifecycleObserver it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.onActivityDestroyed(this.this$0.$activity$inlined);
    }
}
