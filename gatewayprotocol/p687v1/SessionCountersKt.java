package gatewayprotocol.p687v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.p687v1.SessionCountersOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SessionCountersKt.kt */
@Metadata
/* renamed from: gatewayprotocol.v1.SessionCountersKt */
/* loaded from: classes9.dex */
public final class SessionCountersKt {
    @NotNull
    public static final SessionCountersKt INSTANCE = new SessionCountersKt();

    /* compiled from: SessionCountersKt.kt */
    @Metadata
    @ProtoDslMarker
    /* renamed from: gatewayprotocol.v1.SessionCountersKt$Dsl */
    /* loaded from: classes9.dex */
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final SessionCountersOuterClass.SessionCounters.Builder _builder;

        /* compiled from: SessionCountersKt.kt */
        @Metadata
        /* renamed from: gatewayprotocol.v1.SessionCountersKt$Dsl$Companion */
        /* loaded from: classes9.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(SessionCountersOuterClass.SessionCounters.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(SessionCountersOuterClass.SessionCounters.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ SessionCountersOuterClass.SessionCounters _build() {
            SessionCountersOuterClass.SessionCounters build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
            return build;
        }

        public final void clearBannerImpressions() {
            this._builder.clearBannerImpressions();
        }

        public final void clearBannerLoadRequests() {
            this._builder.clearBannerLoadRequests();
        }

        public final void clearBannerRequestsAdm() {
            this._builder.clearBannerRequestsAdm();
        }

        public final void clearLoadRequests() {
            this._builder.clearLoadRequests();
        }

        public final void clearLoadRequestsAdm() {
            this._builder.clearLoadRequestsAdm();
        }

        public final int getBannerImpressions() {
            return this._builder.getBannerImpressions();
        }

        public final int getBannerLoadRequests() {
            return this._builder.getBannerLoadRequests();
        }

        public final int getBannerRequestsAdm() {
            return this._builder.getBannerRequestsAdm();
        }

        public final int getLoadRequests() {
            return this._builder.getLoadRequests();
        }

        public final int getLoadRequestsAdm() {
            return this._builder.getLoadRequestsAdm();
        }

        public final void setBannerImpressions(int i) {
            this._builder.setBannerImpressions(i);
        }

        public final void setBannerLoadRequests(int i) {
            this._builder.setBannerLoadRequests(i);
        }

        public final void setBannerRequestsAdm(int i) {
            this._builder.setBannerRequestsAdm(i);
        }

        public final void setLoadRequests(int i) {
            this._builder.setLoadRequests(i);
        }

        public final void setLoadRequestsAdm(int i) {
            this._builder.setLoadRequestsAdm(i);
        }

        private Dsl(SessionCountersOuterClass.SessionCounters.Builder builder) {
            this._builder = builder;
        }
    }

    private SessionCountersKt() {
    }
}
