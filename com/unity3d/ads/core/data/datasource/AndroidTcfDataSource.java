package com.unity3d.ads.core.data.datasource;

import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidTcfDataSource.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidTcfDataSource implements TcfDataSource {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String TCF_TCSTRING_KEY = "IABTCF_TCString";

    /* compiled from: AndroidTcfDataSource.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.unity3d.ads.core.data.datasource.TcfDataSource
    @Nullable
    public String getTcfString() {
        return AndroidPreferences.getString(ClientProperties.getAppName() + "_settings", "IABTCF_TCString");
    }
}
