package com.mobilefuse.sdk.service;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MobileFuseServices.kt */
@Metadata
/* loaded from: classes7.dex */
public final class ServicesInitResult {
    @NotNull
    private final Map<MobileFuseService, Boolean> servicesResultMap;

    public ServicesInitResult(@NotNull Map<MobileFuseService, Boolean> servicesResultMap) {
        Intrinsics.checkNotNullParameter(servicesResultMap, "servicesResultMap");
        this.servicesResultMap = servicesResultMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ServicesInitResult copy$default(ServicesInitResult servicesInitResult, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = servicesInitResult.servicesResultMap;
        }
        return servicesInitResult.copy(map);
    }

    @NotNull
    public final Map<MobileFuseService, Boolean> component1() {
        return this.servicesResultMap;
    }

    @NotNull
    public final ServicesInitResult copy(@NotNull Map<MobileFuseService, Boolean> servicesResultMap) {
        Intrinsics.checkNotNullParameter(servicesResultMap, "servicesResultMap");
        return new ServicesInitResult(servicesResultMap);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!(obj instanceof ServicesInitResult) || !Intrinsics.m17075f(this.servicesResultMap, ((ServicesInitResult) obj).servicesResultMap)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @NotNull
    public final Map<MobileFuseService, Boolean> getServicesResultMap() {
        return this.servicesResultMap;
    }

    public int hashCode() {
        Map<MobileFuseService, Boolean> map = this.servicesResultMap;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "ServicesInitResult(servicesResultMap=" + this.servicesResultMap + ")";
    }
}
