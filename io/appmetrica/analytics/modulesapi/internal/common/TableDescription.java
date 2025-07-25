package io.appmetrica.analytics.modulesapi.internal.common;

import io.appmetrica.analytics.coreapi.internal.p723db.DatabaseScript;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public interface TableDescription {
    @NotNull
    List<String> getColumnNames();

    @NotNull
    String getCreateTableScript();

    @NotNull
    Map<Integer, DatabaseScript> getDatabaseProviderUpgradeScript();

    @NotNull
    String getDropTableScript();

    @NotNull
    String getTableName();
}
