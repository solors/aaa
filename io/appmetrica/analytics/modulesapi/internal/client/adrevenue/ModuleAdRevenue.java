package io.appmetrica.analytics.modulesapi.internal.client.adrevenue;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes9.dex */
public final class ModuleAdRevenue {

    /* renamed from: a */
    private final BigDecimal f95791a;

    /* renamed from: b */
    private final Currency f95792b;

    /* renamed from: c */
    private final ModuleAdType f95793c;

    /* renamed from: d */
    private final String f95794d;

    /* renamed from: e */
    private final String f95795e;

    /* renamed from: f */
    private final String f95796f;

    /* renamed from: g */
    private final String f95797g;

    /* renamed from: h */
    private final String f95798h;

    /* renamed from: i */
    private final String f95799i;

    /* renamed from: j */
    private final Map f95800j;

    /* renamed from: k */
    private final boolean f95801k;

    public ModuleAdRevenue(@NotNull BigDecimal bigDecimal, @NotNull Currency currency, @Nullable ModuleAdType moduleAdType, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Map<String, String> map, boolean z) {
        this.f95791a = bigDecimal;
        this.f95792b = currency;
        this.f95793c = moduleAdType;
        this.f95794d = str;
        this.f95795e = str2;
        this.f95796f = str3;
        this.f95797g = str4;
        this.f95798h = str5;
        this.f95799i = str6;
        this.f95800j = map;
        this.f95801k = z;
    }

    @Nullable
    public final String getAdNetwork() {
        return this.f95794d;
    }

    @Nullable
    public final String getAdPlacementId() {
        return this.f95797g;
    }

    @Nullable
    public final String getAdPlacementName() {
        return this.f95798h;
    }

    @NotNull
    public final BigDecimal getAdRevenue() {
        return this.f95791a;
    }

    @Nullable
    public final ModuleAdType getAdType() {
        return this.f95793c;
    }

    @Nullable
    public final String getAdUnitId() {
        return this.f95795e;
    }

    @Nullable
    public final String getAdUnitName() {
        return this.f95796f;
    }

    public final boolean getAutoCollected() {
        return this.f95801k;
    }

    @NotNull
    public final Currency getCurrency() {
        return this.f95792b;
    }

    @Nullable
    public final Map<String, String> getPayload() {
        return this.f95800j;
    }

    @Nullable
    public final String getPrecision() {
        return this.f95799i;
    }

    public /* synthetic */ ModuleAdRevenue(BigDecimal bigDecimal, Currency currency, ModuleAdType moduleAdType, String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, currency, (i & 4) != 0 ? null : moduleAdType, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : map, (i & 1024) != 0 ? true : z);
    }
}
