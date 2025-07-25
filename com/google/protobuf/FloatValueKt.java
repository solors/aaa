package com.google.protobuf;

import com.google.protobuf.FloatValue;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FloatValueKt.kt */
@Metadata
/* loaded from: classes5.dex */
public final class FloatValueKt {
    @NotNull
    public static final FloatValueKt INSTANCE = new FloatValueKt();

    /* compiled from: FloatValueKt.kt */
    @Metadata
    @ProtoDslMarker
    /* loaded from: classes5.dex */
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final FloatValue.Builder _builder;

        /* compiled from: FloatValueKt.kt */
        @Metadata
        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(FloatValue.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(FloatValue.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ FloatValue _build() {
            FloatValue build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
            return build;
        }

        public final void clearValue() {
            this._builder.clearValue();
        }

        public final float getValue() {
            return this._builder.getValue();
        }

        public final void setValue(float f) {
            this._builder.setValue(f);
        }

        private Dsl(FloatValue.Builder builder) {
            this._builder = builder;
        }
    }

    private FloatValueKt() {
    }
}
