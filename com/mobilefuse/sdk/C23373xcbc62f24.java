package com.mobilefuse.sdk;

import android.app.Activity;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: Try.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.AppLifecycleHelper$getActivityLifecycleCallbacks$1$onActivityResumed$$inlined$runnableTry$1 */
/* loaded from: classes7.dex */
public final class C23373xcbc62f24 extends Lambda implements Functions<Unit> {
    final /* synthetic */ Activity $activity$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23373xcbc62f24(Activity activity) {
        super(0);
        this.$activity$inlined = activity;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            AppLifecycleHelper appLifecycleHelper = AppLifecycleHelper.INSTANCE;
            appLifecycleHelper.onActivityActivated(this.$activity$inlined);
            appLifecycleHelper.callActivityObservers(new C23374x6081b814(this));
            appLifecycleHelper.onApplicationTransitionToForeground();
        } catch (Throwable th) {
            int i = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
