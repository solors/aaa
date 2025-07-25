package gatewayprotocol.p687v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.p687v1.ErrorOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ErrorKt.kt */
@Metadata
/* renamed from: gatewayprotocol.v1.ErrorKt */
/* loaded from: classes9.dex */
public final class ErrorKt {
    @NotNull
    public static final ErrorKt INSTANCE = new ErrorKt();

    /* compiled from: ErrorKt.kt */
    @Metadata
    @ProtoDslMarker
    /* renamed from: gatewayprotocol.v1.ErrorKt$Dsl */
    /* loaded from: classes9.dex */
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final ErrorOuterClass.Error.Builder _builder;

        /* compiled from: ErrorKt.kt */
        @Metadata
        /* renamed from: gatewayprotocol.v1.ErrorKt$Dsl$Companion */
        /* loaded from: classes9.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(ErrorOuterClass.Error.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(ErrorOuterClass.Error.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ ErrorOuterClass.Error _build() {
            ErrorOuterClass.Error build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
            return build;
        }

        public final void clearErrorText() {
            this._builder.clearErrorText();
        }

        @NotNull
        public final String getErrorText() {
            String errorText = this._builder.getErrorText();
            Intrinsics.checkNotNullExpressionValue(errorText, "_builder.getErrorText()");
            return errorText;
        }

        public final void setErrorText(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setErrorText(value);
        }

        private Dsl(ErrorOuterClass.Error.Builder builder) {
            this._builder = builder;
        }
    }

    private ErrorKt() {
    }
}
