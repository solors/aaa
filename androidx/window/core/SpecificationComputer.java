package androidx.window.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SpecificationComputer.kt */
@Metadata
/* loaded from: classes2.dex */
public abstract class SpecificationComputer<T> {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* compiled from: SpecificationComputer.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SpecificationComputer startSpecification$default(Companion companion, Object obj, String str, VerificationMode verificationMode, Logger logger, int i, Object obj2) {
            if ((i & 2) != 0) {
                verificationMode = BuildConfig.INSTANCE.getVerificationMode();
            }
            if ((i & 4) != 0) {
                logger = AndroidLogger.INSTANCE;
            }
            return companion.startSpecification(obj, str, verificationMode, logger);
        }

        @NotNull
        public final <T> SpecificationComputer<T> startSpecification(@NotNull T t, @NotNull String tag, @NotNull VerificationMode verificationMode, @NotNull Logger logger) {
            Intrinsics.checkNotNullParameter(t, "<this>");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(verificationMode, "verificationMode");
            Intrinsics.checkNotNullParameter(logger, "logger");
            return new ValidSpecification(t, tag, verificationMode, logger);
        }
    }

    /* compiled from: SpecificationComputer.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public enum VerificationMode {
        STRICT,
        LOG,
        QUIET
    }

    @Nullable
    public abstract T compute();

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    public final String createMessage(@NotNull Object value, @NotNull String message) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(message, "message");
        return message + " value: " + value;
    }

    @NotNull
    public abstract SpecificationComputer<T> require(@NotNull String str, @NotNull Function1<? super T, Boolean> function1);
}
