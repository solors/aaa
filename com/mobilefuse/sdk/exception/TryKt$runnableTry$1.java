package com.mobilefuse.sdk.exception;

import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.exception.TryKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: Try.kt */
@Metadata
/* loaded from: classes7.dex */
public final class TryKt$runnableTry$1 extends Lambda implements Functions<Unit> {
    final /* synthetic */ Functions $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TryKt$runnableTry$1(Functions functions) {
        super(0);
        this.$block = functions;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke */
    public final void invoke2() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.$block.invoke();
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
