package com.ironsource;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.c4 */
/* loaded from: classes6.dex */
public final class C19679c4 {
    @NotNull

    /* renamed from: a */
    private final Map<String, String> f49403a;

    public C19679c4() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static /* synthetic */ C19679c4 m59206a(C19679c4 c19679c4, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = c19679c4.f49403a;
        }
        return c19679c4.m59205a(map);
    }

    @NotNull
    /* renamed from: b */
    public final Map<String, String> m59204b() {
        return this.f49403a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C19679c4) && Intrinsics.m17075f(this.f49403a, ((C19679c4) obj).f49403a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f49403a.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.f49403a + ')';
    }

    public C19679c4(@NotNull Map<String, String> mediationTypes) {
        Intrinsics.checkNotNullParameter(mediationTypes, "mediationTypes");
        this.f49403a = mediationTypes;
    }

    @NotNull
    /* renamed from: a */
    public final C19679c4 m59205a(@NotNull Map<String, String> mediationTypes) {
        Intrinsics.checkNotNullParameter(mediationTypes, "mediationTypes");
        return new C19679c4(mediationTypes);
    }

    public /* synthetic */ C19679c4(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C37559r0.m17284j() : map);
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, String> m59207a() {
        return this.f49403a;
    }
}
