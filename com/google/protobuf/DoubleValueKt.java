package com.google.protobuf;

import com.google.protobuf.DoubleValue;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DoubleValueKt.kt */
@Metadata
/* loaded from: classes5.dex */
public final class DoubleValueKt {
    @NotNull
    public static final DoubleValueKt INSTANCE = new DoubleValueKt();

    /* compiled from: DoubleValueKt.kt */
    @Metadata
    @ProtoDslMarker
    /* loaded from: classes5.dex */
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final DoubleValue.Builder _builder;

        /* compiled from: DoubleValueKt.kt */
        @Metadata
        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(DoubleValue.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(DoubleValue.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ DoubleValue _build() {
            DoubleValue build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
            return build;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final double getValue() {
            return this._builder.getValue();
        }

        public final void setValue(double d) {
            this._builder.setValue(d);
        }

        private Dsl(DoubleValue.Builder builder) {
            this._builder = builder;
        }
    }

    private DoubleValueKt() {
    }
}
