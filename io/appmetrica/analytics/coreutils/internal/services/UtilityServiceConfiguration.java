package io.appmetrica.analytics.coreutils.internal.services;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class UtilityServiceConfiguration {

    /* renamed from: a */
    private final long f92447a;

    /* renamed from: b */
    private final long f92448b;

    public UtilityServiceConfiguration() {
        this(0L, 0L, 3, null);
    }

    public static /* synthetic */ UtilityServiceConfiguration copy$default(UtilityServiceConfiguration utilityServiceConfiguration, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = utilityServiceConfiguration.f92447a;
        }
        if ((i & 2) != 0) {
            j2 = utilityServiceConfiguration.f92448b;
        }
        return utilityServiceConfiguration.copy(j, j2);
    }

    public final long component1() {
        return this.f92447a;
    }

    public final long component2() {
        return this.f92448b;
    }

    @NotNull
    public final UtilityServiceConfiguration copy(long j, long j2) {
        return new UtilityServiceConfiguration(j, j2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtilityServiceConfiguration)) {
            return false;
        }
        UtilityServiceConfiguration utilityServiceConfiguration = (UtilityServiceConfiguration) obj;
        if (this.f92447a == utilityServiceConfiguration.f92447a && this.f92448b == utilityServiceConfiguration.f92448b) {
            return true;
        }
        return false;
    }

    public final long getInitialConfigTime() {
        return this.f92447a;
    }

    public final long getLastUpdateConfigTime() {
        return this.f92448b;
    }

    public int hashCode() {
        return Long.hashCode(this.f92448b) + (Long.hashCode(this.f92447a) * 31);
    }

    @NotNull
    public String toString() {
        return "UtilityServiceConfiguration(initialConfigTime=" + this.f92447a + ", lastUpdateConfigTime=" + this.f92448b + ')';
    }

    public UtilityServiceConfiguration(long j, long j2) {
        this.f92447a = j;
        this.f92448b = j2;
    }

    public /* synthetic */ UtilityServiceConfiguration(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2);
    }
}
