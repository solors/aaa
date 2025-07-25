package gatewayprotocol.p687v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.p687v1.GetTokenEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: GetTokenEventRequestKt.kt */
@Metadata
/* renamed from: gatewayprotocol.v1.GetTokenEventRequestKt */
/* loaded from: classes9.dex */
public final class GetTokenEventRequestKt {
    @NotNull
    public static final GetTokenEventRequestKt INSTANCE = new GetTokenEventRequestKt();

    /* compiled from: GetTokenEventRequestKt.kt */
    @Metadata
    @ProtoDslMarker
    /* renamed from: gatewayprotocol.v1.GetTokenEventRequestKt$Dsl */
    /* loaded from: classes9.dex */
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder _builder;

        /* compiled from: GetTokenEventRequestKt.kt */
        @Metadata
        /* renamed from: gatewayprotocol.v1.GetTokenEventRequestKt$Dsl$Companion */
        /* loaded from: classes9.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ GetTokenEventRequestOuterClass.GetTokenEventRequest _build() {
            GetTokenEventRequestOuterClass.GetTokenEventRequest build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
            return build;
        }

        public final void clearBanner() {
            this._builder.clearBanner();
        }

        public final void clearInterstitial() {
            this._builder.clearInterstitial();
        }

        public final void clearRewarded() {
            this._builder.clearRewarded();
        }

        public final void clearTokenId() {
            this._builder.clearTokenId();
        }

        @NotNull
        public final ByteString getBanner() {
            ByteString banner = this._builder.getBanner();
            Intrinsics.checkNotNullExpressionValue(banner, "_builder.getBanner()");
            return banner;
        }

        @NotNull
        public final ByteString getInterstitial() {
            ByteString interstitial = this._builder.getInterstitial();
            Intrinsics.checkNotNullExpressionValue(interstitial, "_builder.getInterstitial()");
            return interstitial;
        }

        @NotNull
        public final ByteString getRewarded() {
            ByteString rewarded = this._builder.getRewarded();
            Intrinsics.checkNotNullExpressionValue(rewarded, "_builder.getRewarded()");
            return rewarded;
        }

        @NotNull
        public final ByteString getTokenId() {
            ByteString tokenId = this._builder.getTokenId();
            Intrinsics.checkNotNullExpressionValue(tokenId, "_builder.getTokenId()");
            return tokenId;
        }

        public final boolean hasBanner() {
            return this._builder.hasBanner();
        }

        public final boolean hasInterstitial() {
            return this._builder.hasInterstitial();
        }

        public final boolean hasRewarded() {
            return this._builder.hasRewarded();
        }

        public final void setBanner(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setBanner(value);
        }

        public final void setInterstitial(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setInterstitial(value);
        }

        public final void setRewarded(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setRewarded(value);
        }

        public final void setTokenId(@NotNull ByteString value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setTokenId(value);
        }

        private Dsl(GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builder) {
            this._builder = builder;
        }
    }

    private GetTokenEventRequestKt() {
    }
}
