package com.google.protobuf;

import com.google.protobuf.Empty;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: EmptyKt.kt */
@Metadata
/* loaded from: classes5.dex */
public final class EmptyKt {
    @NotNull
    public static final EmptyKt INSTANCE = new EmptyKt();

    /* compiled from: EmptyKt.kt */
    @Metadata
    @ProtoDslMarker
    /* loaded from: classes5.dex */
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final Empty.Builder _builder;

        /* compiled from: EmptyKt.kt */
        @Metadata
        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(Empty.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(Empty.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ Empty _build() {
            Empty build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
            return build;
        }

        private Dsl(Empty.Builder builder) {
            this._builder = builder;
        }
    }

    private EmptyKt() {
    }
}
