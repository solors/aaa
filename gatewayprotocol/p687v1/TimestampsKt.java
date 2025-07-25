package gatewayprotocol.p687v1;

import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.p687v1.TimestampsOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TimestampsKt.kt */
@Metadata
/* renamed from: gatewayprotocol.v1.TimestampsKt */
/* loaded from: classes9.dex */
public final class TimestampsKt {
    @NotNull
    public static final TimestampsKt INSTANCE = new TimestampsKt();

    /* compiled from: TimestampsKt.kt */
    @Metadata
    @ProtoDslMarker
    /* renamed from: gatewayprotocol.v1.TimestampsKt$Dsl */
    /* loaded from: classes9.dex */
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final TimestampsOuterClass.Timestamps.Builder _builder;

        /* compiled from: TimestampsKt.kt */
        @Metadata
        /* renamed from: gatewayprotocol.v1.TimestampsKt$Dsl$Companion */
        /* loaded from: classes9.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(TimestampsOuterClass.Timestamps.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(TimestampsOuterClass.Timestamps.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ TimestampsOuterClass.Timestamps _build() {
            TimestampsOuterClass.Timestamps build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
            return build;
        }

        public final void clearSessionTimestamp() {
            this._builder.clearSessionTimestamp();
        }

        public final void clearTimestamp() {
            this._builder.clearTimestamp();
        }

        public final long getSessionTimestamp() {
            return this._builder.getSessionTimestamp();
        }

        @NotNull
        public final Timestamp getTimestamp() {
            Timestamp timestamp = this._builder.getTimestamp();
            Intrinsics.checkNotNullExpressionValue(timestamp, "_builder.getTimestamp()");
            return timestamp;
        }

        public final boolean hasTimestamp() {
            return this._builder.hasTimestamp();
        }

        public final void setSessionTimestamp(long j) {
            this._builder.setSessionTimestamp(j);
        }

        public final void setTimestamp(@NotNull Timestamp value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTimestamp(value);
        }

        private Dsl(TimestampsOuterClass.Timestamps.Builder builder) {
            this._builder = builder;
        }
    }

    private TimestampsKt() {
    }
}
