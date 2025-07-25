package com.mobilefuse.sdk;

import android.app.Activity;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: Try.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.AppLifecycleHelper$getActivityLifecycleCallbacks$1$onActivityPaused$$inlined$handleExceptions$lambda$1 */
/* loaded from: classes7.dex */
public final class C23371xa9f5767c extends Lambda implements Functions<Unit> {
    final /* synthetic */ Activity $activity$inlined;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppLifecycleHelper.kt */
    @Metadata
    /* renamed from: com.mobilefuse.sdk.AppLifecycleHelper$getActivityLifecycleCallbacks$1$onActivityPaused$$inlined$handleExceptions$lambda$1$1 */
    /* loaded from: classes7.dex */
    public static final class C233721 extends Lambda implements Function1<AppLifecycleHelper.ActivityLifecycleObserver, Unit> {
        C233721() {
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
            it.onActivityPaused(C23371xa9f5767c.this.$activity$inlined);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23371xa9f5767c(Activity activity) {
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
            AppLifecycleHelper.INSTANCE.callActivityObservers(new C233721());
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
