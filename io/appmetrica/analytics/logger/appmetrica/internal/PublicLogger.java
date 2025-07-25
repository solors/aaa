package io.appmetrica.analytics.logger.appmetrica.internal;

import com.ironsource.C21114v8;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class PublicLogger extends BaseReleaseLogger {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private static final PublicLogger f95779a = new PublicLogger("");

    @Metadata
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PublicLogger getAnonymousInstance() {
            return PublicLogger.f95779a;
        }

        private Companion() {
        }
    }

    public PublicLogger(@NotNull String str) {
        super(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, C21114v8.C21123i.f54137d + str + ']');
    }

    @NotNull
    public static final PublicLogger getAnonymousInstance() {
        return Companion.getAnonymousInstance();
    }
}
