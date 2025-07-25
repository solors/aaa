package gatewayprotocol.p687v1;

import com.google.protobuf.kotlin.ProtoDslMarker;
import gatewayprotocol.p687v1.TestDataOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TestDataKt.kt */
@Metadata
/* renamed from: gatewayprotocol.v1.TestDataKt */
/* loaded from: classes9.dex */
public final class TestDataKt {
    @NotNull
    public static final TestDataKt INSTANCE = new TestDataKt();

    /* compiled from: TestDataKt.kt */
    @Metadata
    @ProtoDslMarker
    /* renamed from: gatewayprotocol.v1.TestDataKt$Dsl */
    /* loaded from: classes9.dex */
    public static final class Dsl {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final TestDataOuterClass.TestData.Builder _builder;

        /* compiled from: TestDataKt.kt */
        @Metadata
        /* renamed from: gatewayprotocol.v1.TestDataKt$Dsl$Companion */
        /* loaded from: classes9.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Dsl _create(TestDataOuterClass.TestData.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public /* synthetic */ Dsl(TestDataOuterClass.TestData.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        public final /* synthetic */ TestDataOuterClass.TestData _build() {
            TestDataOuterClass.TestData build = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "_builder.build()");
            return build;
        }

        public final void clearForceCampaignId() {
            this._builder.clearForceCampaignId();
        }

        public final void clearForceCountry() {
            this._builder.clearForceCountry();
        }

        public final void clearForceCountrySubdivision() {
            this._builder.clearForceCountrySubdivision();
        }

        public final void clearForceExchangeTestMode() {
            this._builder.clearForceExchangeTestMode();
        }

        @NotNull
        public final String getForceCampaignId() {
            String forceCampaignId = this._builder.getForceCampaignId();
            Intrinsics.checkNotNullExpressionValue(forceCampaignId, "_builder.getForceCampaignId()");
            return forceCampaignId;
        }

        @NotNull
        public final String getForceCountry() {
            String forceCountry = this._builder.getForceCountry();
            Intrinsics.checkNotNullExpressionValue(forceCountry, "_builder.getForceCountry()");
            return forceCountry;
        }

        @NotNull
        public final String getForceCountrySubdivision() {
            String forceCountrySubdivision = this._builder.getForceCountrySubdivision();
            Intrinsics.checkNotNullExpressionValue(forceCountrySubdivision, "_builder.getForceCountrySubdivision()");
            return forceCountrySubdivision;
        }

        public final int getForceExchangeTestMode() {
            return this._builder.getForceExchangeTestMode();
        }

        public final boolean hasForceCampaignId() {
            return this._builder.hasForceCampaignId();
        }

        public final boolean hasForceCountry() {
            return this._builder.hasForceCountry();
        }

        public final boolean hasForceCountrySubdivision() {
            return this._builder.hasForceCountrySubdivision();
        }

        public final boolean hasForceExchangeTestMode() {
            return this._builder.hasForceExchangeTestMode();
        }

        public final void setForceCampaignId(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setForceCampaignId(value);
        }

        public final void setForceCountry(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setForceCountry(value);
        }

        public final void setForceCountrySubdivision(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setForceCountrySubdivision(value);
        }

        public final void setForceExchangeTestMode(int i) {
            this._builder.setForceExchangeTestMode(i);
        }

        private Dsl(TestDataOuterClass.TestData.Builder builder) {
            this._builder = builder;
        }
    }

    private TestDataKt() {
    }
}
