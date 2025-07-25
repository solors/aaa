package com.google.protobuf;

import com.google.protobuf.Mixin;
import com.google.protobuf.kotlin.ProtoDslMarker;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MixinKt.kt */
@Metadata
/* loaded from: classes5.dex */
public final class MixinKt {
    @NotNull
    public static final MixinKt INSTANCE = new MixinKt();

    /* compiled from: MixinKt.kt */
    @Metadata
    @ProtoDslMarker
    /* loaded from: classes5.dex */
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final Mixin.Builder _builder;

        /* compiled from: MixinKt.kt */
        @Metadata
        /* loaded from: classes5.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(Mixin.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(Mixin.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ Mixin _build() {
            Mixin build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
            return build;
        }

        public final void clearName() {
            this._builder.clearName();
        }

        public final void clearRoot() {
            this._builder.clearRoot();
        }

        @NotNull
        public final String getName() {
            String name = this._builder.getName();
            Intrinsics.checkNotNullExpressionValue(name, "_builder.getName()");
            return name;
        }

        @NotNull
        public final String getRoot() {
            String root = this._builder.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "_builder.getRoot()");
            return root;
        }

        public final void setName(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setName(value);
        }

        public final void setRoot(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setRoot(value);
        }

        private Dsl(Mixin.Builder builder) {
            this._builder = builder;
        }
    }

    private MixinKt() {
    }
}
