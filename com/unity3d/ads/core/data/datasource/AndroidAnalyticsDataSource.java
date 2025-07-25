package com.unity3d.ads.core.data.datasource;

import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidAnalyticsDataSource.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidAnalyticsDataSource implements AnalyticsDataSource {
    @Override // com.unity3d.ads.core.data.datasource.AnalyticsDataSource
    @Nullable
    public String getUserId() {
        return AndroidPreferences.getString(ClientProperties.getAppName() + ".v2.playerprefs", "unity.cloud_userid");
    }
}
