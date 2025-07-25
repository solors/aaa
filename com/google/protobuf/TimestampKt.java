package com.google.protobuf;

import com.google.protobuf.Timestamp;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TimestampKt.kt */
@Metadata
/* loaded from: classes5.dex */
public final class TimestampKt {
    @NotNull
    public static final TimestampKt INSTANCE = new TimestampKt();

    /* compiled from: TimestampKt.kt */
    @Metadata
    @ProtoDslMarker
    /* loaded from: classes5.dex */
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final Timestamp.Builder _builder;

        /* compiled from: TimestampKt.kt */
        @Metadata
        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(Timestamp.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(Timestamp.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ Timestamp _build() {
            Timestamp build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
            return build;
        }

        public final void clearNanos() {
            this._builder.clearNanos();
        }

        public final void clearSeconds() {
            this._builder.clearSeconds();
        }

        public final int getNanos() {
            return this._builder.getNanos();
        }

        public final long getSeconds() {
            return this._builder.getSeconds();
        }

        public final void setNanos(int i) {
            this._builder.setNanos(i);
        }

        public final void setSeconds(long j) {
            this._builder.setSeconds(j);
        }

        private Dsl(Timestamp.Builder builder) {
            this._builder = builder;
        }
    }

    private TimestampKt() {
    }
}
