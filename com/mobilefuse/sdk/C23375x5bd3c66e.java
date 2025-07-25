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
/* renamed from: com.mobilefuse.sdk.AppLifecycleHelper$getActivityLifecycleCallbacks$1$onActivityStopped$$inlined$runnableTry$1 */
/* loaded from: classes7.dex */
public final class C23375x5bd3c66e extends Lambda implements Functions<Unit> {
    final /* synthetic */ Activity $activity$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23375x5bd3c66e(Activity activity) {
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
            AppLifecycleHelper.INSTANCE.onActivityDeactivated(this.$activity$inlined);
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
