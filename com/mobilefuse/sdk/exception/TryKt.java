package com.mobilefuse.sdk.exception;

import com.mobilefuse.sdk.StabilityHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: Try.kt */
@Metadata
/* loaded from: classes7.dex */
public final class TryKt {

    @Metadata
    /* loaded from: classes7.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ExceptionHandlingStrategy.values().length];
            $EnumSwitchMapping$0 = iArr;
            ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
            iArr[exceptionHandlingStrategy.ordinal()] = 1;
            ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.Ignore;
            iArr[exceptionHandlingStrategy2.ordinal()] = 2;
            int[] iArr2 = new int[ExceptionHandlingStrategy.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[exceptionHandlingStrategy.ordinal()] = 1;
            iArr2[exceptionHandlingStrategy2.ordinal()] = 2;
        }
    }

    @NotNull
    public static final <T> Either<Throwable, T> gracefullyHandleException(@NotNull Functions<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            return new SuccessResult(block.invoke());
        } catch (Throwable th) {
            if (WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            return new ErrorResult(th);
        }
    }

    public static final void handleExceptions(@NotNull Functions<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            block.invoke();
        } catch (Throwable th) {
            int i = WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public static final Functions<Unit> runnableTry(@NotNull Functions<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return new TryKt$runnableTry$1(block);
    }

    public static final void handleExceptions(@NotNull String source, @NotNull Functions<Unit> block) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(block, "block");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            block.invoke();
        } catch (Throwable th) {
            int i = WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException(source, th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public static final <T> Either<Throwable, T> gracefullyHandleException(@NotNull String source, @NotNull Functions<? extends T> block) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(block, "block");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            return new SuccessResult(block.invoke());
        } catch (Throwable th) {
            if (WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException(source, th);
            }
            return new ErrorResult(th);
        }
    }

    public static final void handleExceptions(@NotNull String source, @NotNull ExceptionHandlingStrategy strategy, @NotNull Functions<Unit> block) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            block.invoke();
        } catch (Throwable th) {
            int i = WhenMappings.$EnumSwitchMapping$0[strategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException(source, th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public static final <T> Either<Throwable, T> gracefullyHandleException(@NotNull String source, @NotNull ExceptionHandlingStrategy strategy, @NotNull Functions<? extends T> block) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return new SuccessResult(block.invoke());
        } catch (Throwable th) {
            if (WhenMappings.$EnumSwitchMapping$1[strategy.ordinal()] == 1) {
                StabilityHelper.logException(source, th);
            }
            return new ErrorResult(th);
        }
    }

    public static final void handleExceptions(@NotNull ExceptionHandlingStrategy strategy, @NotNull Functions<Unit> block) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            block.invoke();
        } catch (Throwable th) {
            int i = WhenMappings.$EnumSwitchMapping$0[strategy.ordinal()];
            if (i == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public static final <T> Either<Throwable, T> gracefullyHandleException(@NotNull ExceptionHandlingStrategy strategy, @NotNull Functions<? extends T> block) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return new SuccessResult(block.invoke());
        } catch (Throwable th) {
            if (WhenMappings.$EnumSwitchMapping$1[strategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th);
            }
            return new ErrorResult(th);
        }
    }
}
