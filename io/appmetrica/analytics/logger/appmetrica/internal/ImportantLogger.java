package io.appmetrica.analytics.logger.appmetrica.internal;

import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.logger.common.BaseImportantLogger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public final class ImportantLogger extends BaseImportantLogger {
    @NotNull
    public static final ImportantLogger INSTANCE = new ImportantLogger();

    private ImportantLogger() {
        super(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA);
    }
}
