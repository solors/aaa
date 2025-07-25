package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class PlatformIdentifiers {

    /* renamed from: a */
    private final SimpleAdvertisingIdGetter f92352a;

    /* renamed from: b */
    private final AppSetIdProvider f92353b;

    public PlatformIdentifiers(@NotNull SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, @NotNull AppSetIdProvider appSetIdProvider) {
        this.f92352a = simpleAdvertisingIdGetter;
        this.f92353b = appSetIdProvider;
    }

    public static /* synthetic */ PlatformIdentifiers copy$default(PlatformIdentifiers platformIdentifiers, SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, AppSetIdProvider appSetIdProvider, int i, Object obj) {
        if ((i & 1) != 0) {
            simpleAdvertisingIdGetter = platformIdentifiers.f92352a;
        }
        if ((i & 2) != 0) {
            appSetIdProvider = platformIdentifiers.f92353b;
        }
        return platformIdentifiers.copy(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    @NotNull
    public final SimpleAdvertisingIdGetter component1() {
        return this.f92352a;
    }

    @NotNull
    public final AppSetIdProvider component2() {
        return this.f92353b;
    }

    @NotNull
    public final PlatformIdentifiers copy(@NotNull SimpleAdvertisingIdGetter simpleAdvertisingIdGetter, @NotNull AppSetIdProvider appSetIdProvider) {
        return new PlatformIdentifiers(simpleAdvertisingIdGetter, appSetIdProvider);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformIdentifiers)) {
            return false;
        }
        PlatformIdentifiers platformIdentifiers = (PlatformIdentifiers) obj;
        if (Intrinsics.m17075f(this.f92352a, platformIdentifiers.f92352a) && Intrinsics.m17075f(this.f92353b, platformIdentifiers.f92353b)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final SimpleAdvertisingIdGetter getAdvIdentifiersProvider() {
        return this.f92352a;
    }

    @NotNull
    public final AppSetIdProvider getAppSetIdProvider() {
        return this.f92353b;
    }

    public int hashCode() {
        return this.f92353b.hashCode() + (this.f92352a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PlatformIdentifiers(advIdentifiersProvider=" + this.f92352a + ", appSetIdProvider=" + this.f92353b + ')';
    }
}
