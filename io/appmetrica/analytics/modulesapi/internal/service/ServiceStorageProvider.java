package io.appmetrica.analytics.modulesapi.internal.service;

import android.database.sqlite.SQLiteOpenHelper;
import io.appmetrica.analytics.coreapi.internal.data.TempCacheStorage;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public interface ServiceStorageProvider {
    @Nullable
    File getAppDataStorage();

    @Nullable
    File getAppFileStorage();

    @NotNull
    SQLiteOpenHelper getDbStorage();

    @Nullable
    File getSdkDataStorage();

    @NotNull
    TempCacheStorage getTempCacheStorage();

    @NotNull
    ModulePreferences legacyModulePreferences();

    @NotNull
    ModulePreferences modulePreferences(@NotNull String str);
}
