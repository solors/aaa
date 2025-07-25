package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class AppSetId {

    /* renamed from: a */
    private final String f92345a;

    /* renamed from: b */
    private final AppSetIdScope f92346b;

    public AppSetId(@Nullable String str, @NotNull AppSetIdScope appSetIdScope) {
        this.f92345a = str;
        this.f92346b = appSetIdScope;
    }

    public static /* synthetic */ AppSetId copy$default(AppSetId appSetId, String str, AppSetIdScope appSetIdScope, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appSetId.f92345a;
        }
        if ((i & 2) != 0) {
            appSetIdScope = appSetId.f92346b;
        }
        return appSetId.copy(str, appSetIdScope);
    }

    @Nullable
    public final String component1() {
        return this.f92345a;
    }

    @NotNull
    public final AppSetIdScope component2() {
        return this.f92346b;
    }

    @NotNull
    public final AppSetId copy(@Nullable String str, @NotNull AppSetIdScope appSetIdScope) {
        return new AppSetId(str, appSetIdScope);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSetId)) {
            return false;
        }
        AppSetId appSetId = (AppSetId) obj;
        if (Intrinsics.m17075f(this.f92345a, appSetId.f92345a) && this.f92346b == appSetId.f92346b) {
            return true;
        }
        return false;
    }

    @Nullable
    public final String getId() {
        return this.f92345a;
    }

    @NotNull
    public final AppSetIdScope getScope() {
        return this.f92346b;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f92345a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.f92346b.hashCode() + (hashCode * 31);
    }

    @NotNull
    public String toString() {
        return "AppSetId(id=" + this.f92345a + ", scope=" + this.f92346b + ')';
    }
}
