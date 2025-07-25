package gatewayprotocol.p687v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.p687v1.AllowedPiiOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AllowedPiiKt.kt */
@Metadata
/* renamed from: gatewayprotocol.v1.AllowedPiiKt */
/* loaded from: classes9.dex */
public final class AllowedPiiKt {
    @NotNull
    public static final AllowedPiiKt INSTANCE = new AllowedPiiKt();

    /* compiled from: AllowedPiiKt.kt */
    @Metadata
    @ProtoDslMarker
    /* renamed from: gatewayprotocol.v1.AllowedPiiKt$Dsl */
    /* loaded from: classes9.dex */
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final AllowedPiiOuterClass.AllowedPii.Builder _builder;

        /* compiled from: AllowedPiiKt.kt */
        @Metadata
        /* renamed from: gatewayprotocol.v1.AllowedPiiKt$Dsl$Companion */
        /* loaded from: classes9.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(AllowedPiiOuterClass.AllowedPii.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(AllowedPiiOuterClass.AllowedPii.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ AllowedPiiOuterClass.AllowedPii _build() {
            AllowedPiiOuterClass.AllowedPii build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
            return build;
        }

        public final void clearIdfa() {
            this._builder.clearIdfa();
        }

        public final void clearIdfv() {
            this._builder.clearIdfv();
        }

        public final boolean getIdfa() {
            return this._builder.getIdfa();
        }

        public final boolean getIdfv() {
            return this._builder.getIdfv();
        }

        public final void setIdfa(boolean z) {
            this._builder.setIdfa(z);
        }

        public final void setIdfv(boolean z) {
            this._builder.setIdfv(z);
        }

        private Dsl(AllowedPiiOuterClass.AllowedPii.Builder builder) {
            this._builder = builder;
        }
    }

    private AllowedPiiKt() {
    }
}
