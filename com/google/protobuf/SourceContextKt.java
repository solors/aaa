package com.google.protobuf;

import com.google.protobuf.SourceContext;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SourceContextKt.kt */
@Metadata
/* loaded from: classes5.dex */
public final class SourceContextKt {
    @NotNull
    public static final SourceContextKt INSTANCE = new SourceContextKt();

    /* compiled from: SourceContextKt.kt */
    @Metadata
    @ProtoDslMarker
    /* loaded from: classes5.dex */
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final SourceContext.Builder _builder;

        /* compiled from: SourceContextKt.kt */
        @Metadata
        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(SourceContext.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(SourceContext.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ SourceContext _build() {
            SourceContext build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
            return build;
        }

        public final void clearFileName() {
            this._builder.clearFileName();
        }

        @NotNull
        public final String getFileName() {
            String fileName = this._builder.getFileName();
            Intrinsics.checkNotNullExpressionValue(fileName, "_builder.getFileName()");
            return fileName;
        }

        public final void setFileName(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setFileName(value);
        }

        private Dsl(SourceContext.Builder builder) {
            this._builder = builder;
        }
    }

    private SourceContextKt() {
    }
}
