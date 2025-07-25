package com.unity3d.ads.core.data.datasource;

import com.unity3d.services.core.misc.JsonStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidMediationDataSource.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidMediationDataSource implements MediationDataSource {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String MEDIATION_NAME = "name";
    @NotNull
    public static final String MEDIATION_NAME_KEY = "mediation.name.value";
    @NotNull
    private static final String MEDIATION_STORAGE_NAME = "mediation";
    @NotNull
    private static final String MEDIATION_VALUE = "value";
    @NotNull
    private static final String MEDIATION_VERSION = "version";
    @NotNull
    public static final String MEDIATION_VERSION_KEY = "mediation.version.value";
    @NotNull
    private final JsonStorage publicStorage;

    /* compiled from: AndroidMediationDataSource.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AndroidMediationDataSource(@NotNull JsonStorage publicStorage) {
        Intrinsics.checkNotNullParameter(publicStorage, "publicStorage");
        this.publicStorage = publicStorage;
    }

    @Override // com.unity3d.ads.core.data.datasource.MediationDataSource
    @Nullable
    public String getName() {
        return (String) this.publicStorage.get(MEDIATION_NAME_KEY);
    }

    @Override // com.unity3d.ads.core.data.datasource.MediationDataSource
    @Nullable
    public String getVersion() {
        return (String) this.publicStorage.get(MEDIATION_VERSION_KEY);
    }
}
