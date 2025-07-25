package io.appmetrica.analytics.modulesapi.internal.service;

import io.appmetrica.analytics.modulesapi.internal.common.TableDescription;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes9.dex */
public abstract class ModuleServicesDatabase {
    @NotNull
    public abstract List<TableDescription> getTables();
}
