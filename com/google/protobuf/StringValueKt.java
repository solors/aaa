package com.google.protobuf;

import com.google.protobuf.StringValue;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: StringValueKt.kt */
@Metadata
/* loaded from: classes5.dex */
public final class StringValueKt {
    @NotNull
    public static final StringValueKt INSTANCE = new StringValueKt();

    /* compiled from: StringValueKt.kt */
    @Metadata
    @ProtoDslMarker
    /* loaded from: classes5.dex */
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final StringValue.Builder _builder;

        /* compiled from: StringValueKt.kt */
        @Metadata
        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(StringValue.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(StringValue.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ StringValue _build() {
            StringValue build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
            return build;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        @NotNull
        public final String getValue() {
            String value = this._builder.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "_builder.getValue()");
            return value;
        }

        public final void setValue(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setValue(value);
        }

        private Dsl(StringValue.Builder builder) {
            this._builder = builder;
        }
    }

    private StringValueKt() {
    }
}
