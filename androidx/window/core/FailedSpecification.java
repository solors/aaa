package androidx.window.core;

import androidx.window.core.SpecificationComputer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections._Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: SpecificationComputer.kt */
@Metadata
/* loaded from: classes2.dex */
final class FailedSpecification<T> extends SpecificationComputer<T> {
    @NotNull
    private final WindowStrictModeException exception;
    @NotNull
    private final Logger logger;
    @NotNull
    private final String message;
    @NotNull
    private final String tag;
    @NotNull
    private final T value;
    @NotNull
    private final SpecificationComputer.VerificationMode verificationMode;

    /* compiled from: SpecificationComputer.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpecificationComputer.VerificationMode.values().length];
            iArr[SpecificationComputer.VerificationMode.STRICT.ordinal()] = 1;
            iArr[SpecificationComputer.VerificationMode.LOG.ordinal()] = 2;
            iArr[SpecificationComputer.VerificationMode.QUIET.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FailedSpecification(@NotNull T value, @NotNull String tag, @NotNull String message, @NotNull Logger logger, @NotNull SpecificationComputer.VerificationMode verificationMode) {
        List m17336P;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
        this.value = value;
        this.tag = tag;
        this.message = message;
        this.logger = logger;
        this.verificationMode = verificationMode;
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(createMessage(value, message));
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        m17336P = _Arrays.m17336P(stackTrace, 2);
        Object[] array = m17336P.toArray(new StackTraceElement[0]);
        if (array != null) {
            windowStrictModeException.setStackTrace((StackTraceElement[]) array);
            this.exception = windowStrictModeException;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // androidx.window.core.SpecificationComputer
    @Nullable
    public T compute() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.verificationMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return null;
            }
            this.logger.debug(this.tag, createMessage(this.value, this.message));
            return null;
        }
        throw this.exception;
    }

    @NotNull
    public final WindowStrictModeException getException() {
        return this.exception;
    }

    @NotNull
    public final Logger getLogger() {
        return this.logger;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @NotNull
    public final T getValue() {
        return this.value;
    }

    @NotNull
    public final SpecificationComputer.VerificationMode getVerificationMode() {
        return this.verificationMode;
    }

    @Override // androidx.window.core.SpecificationComputer
    @NotNull
    public SpecificationComputer<T> require(@NotNull String message, @NotNull Function1<? super T, Boolean> condition) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(condition, "condition");
        return this;
    }
}
