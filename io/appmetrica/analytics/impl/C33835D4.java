package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import java.util.Map;
import java.util.Objects;

/* renamed from: io.appmetrica.analytics.impl.D4 */
/* loaded from: classes9.dex */
public final class C33835D4 implements ArgumentsMerger {
    @Nullable

    /* renamed from: a */
    public final String f92689a;
    @Nullable

    /* renamed from: b */
    public final Boolean f92690b;
    @Nullable

    /* renamed from: c */
    public final Location f92691c;
    @Nullable

    /* renamed from: d */
    public final Boolean f92692d;
    @Nullable

    /* renamed from: e */
    public final Integer f92693e;
    @Nullable

    /* renamed from: f */
    public final Integer f92694f;
    @Nullable

    /* renamed from: g */
    public final Integer f92695g;
    @Nullable

    /* renamed from: h */
    public final Boolean f92696h;
    @Nullable

    /* renamed from: i */
    public final Boolean f92697i;
    @Nullable

    /* renamed from: j */
    public final Map<String, String> f92698j;
    @Nullable

    /* renamed from: k */
    public final Integer f92699k;
    @Nullable

    /* renamed from: l */
    public final Boolean f92700l;
    @Nullable

    /* renamed from: m */
    public final Boolean f92701m;

    public C33835D4(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4, Boolean bool5, Boolean bool6) {
        this.f92689a = str;
        this.f92690b = bool;
        this.f92691c = location;
        this.f92692d = bool2;
        this.f92693e = num;
        this.f92694f = num2;
        this.f92695g = num3;
        this.f92696h = bool3;
        this.f92697i = bool4;
        this.f92698j = map;
        this.f92699k = num4;
        this.f92700l = bool5;
        this.f92701m = bool6;
    }

    /* renamed from: a */
    public final boolean m22722a(@NonNull C33835D4 c33835d4) {
        return equals(c33835d4);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* renamed from: b */
    public final C33835D4 mergeFrom(@NonNull C33835D4 c33835d4) {
        return new C33835D4((String) WrapUtils.getOrDefaultNullable(this.f92689a, c33835d4.f92689a), (Boolean) WrapUtils.getOrDefaultNullable(this.f92690b, c33835d4.f92690b), (Location) WrapUtils.getOrDefaultNullable(this.f92691c, c33835d4.f92691c), (Boolean) WrapUtils.getOrDefaultNullable(this.f92692d, c33835d4.f92692d), (Integer) WrapUtils.getOrDefaultNullable(this.f92693e, c33835d4.f92693e), (Integer) WrapUtils.getOrDefaultNullable(this.f92694f, c33835d4.f92694f), (Integer) WrapUtils.getOrDefaultNullable(this.f92695g, c33835d4.f92695g), (Boolean) WrapUtils.getOrDefaultNullable(this.f92696h, c33835d4.f92696h), (Boolean) WrapUtils.getOrDefaultNullable(this.f92697i, c33835d4.f92697i), (Map) WrapUtils.getOrDefaultNullable(this.f92698j, c33835d4.f92698j), (Integer) WrapUtils.getOrDefaultNullable(this.f92699k, c33835d4.f92699k), (Boolean) WrapUtils.getOrDefaultNullable(this.f92700l, c33835d4.f92700l), (Boolean) WrapUtils.getOrDefaultNullable(this.f92701m, c33835d4.f92701m));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(@NonNull Object obj) {
        return equals((C33835D4) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C33835D4.class != obj.getClass()) {
            return false;
        }
        C33835D4 c33835d4 = (C33835D4) obj;
        if (!Objects.equals(this.f92689a, c33835d4.f92689a) || !Objects.equals(this.f92690b, c33835d4.f92690b) || !Objects.equals(this.f92691c, c33835d4.f92691c) || !Objects.equals(this.f92692d, c33835d4.f92692d) || !Objects.equals(this.f92693e, c33835d4.f92693e) || !Objects.equals(this.f92694f, c33835d4.f92694f) || !Objects.equals(this.f92695g, c33835d4.f92695g) || !Objects.equals(this.f92696h, c33835d4.f92696h) || !Objects.equals(this.f92697i, c33835d4.f92697i) || !Objects.equals(this.f92698j, c33835d4.f92698j) || !Objects.equals(this.f92699k, c33835d4.f92699k) || !Objects.equals(this.f92700l, c33835d4.f92700l)) {
            return false;
        }
        return Objects.equals(this.f92701m, c33835d4.f92701m);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        String str = this.f92689a;
        int i13 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i14 = i * 31;
        Boolean bool = this.f92690b;
        if (bool != null) {
            i2 = bool.hashCode();
        } else {
            i2 = 0;
        }
        int i15 = (i14 + i2) * 31;
        Location location = this.f92691c;
        if (location != null) {
            i3 = location.hashCode();
        } else {
            i3 = 0;
        }
        int i16 = (i15 + i3) * 31;
        Boolean bool2 = this.f92692d;
        if (bool2 != null) {
            i4 = bool2.hashCode();
        } else {
            i4 = 0;
        }
        int i17 = (i16 + i4) * 31;
        Integer num = this.f92693e;
        if (num != null) {
            i5 = num.hashCode();
        } else {
            i5 = 0;
        }
        int i18 = (i17 + i5) * 31;
        Integer num2 = this.f92694f;
        if (num2 != null) {
            i6 = num2.hashCode();
        } else {
            i6 = 0;
        }
        int i19 = (i18 + i6) * 31;
        Integer num3 = this.f92695g;
        if (num3 != null) {
            i7 = num3.hashCode();
        } else {
            i7 = 0;
        }
        int i20 = (i19 + i7) * 31;
        Boolean bool3 = this.f92696h;
        if (bool3 != null) {
            i8 = bool3.hashCode();
        } else {
            i8 = 0;
        }
        int i21 = (i20 + i8) * 31;
        Boolean bool4 = this.f92697i;
        if (bool4 != null) {
            i9 = bool4.hashCode();
        } else {
            i9 = 0;
        }
        int i22 = (i21 + i9) * 31;
        Map<String, String> map = this.f92698j;
        if (map != null) {
            i10 = map.hashCode();
        } else {
            i10 = 0;
        }
        int i23 = (i22 + i10) * 31;
        Integer num4 = this.f92699k;
        if (num4 != null) {
            i11 = num4.hashCode();
        } else {
            i11 = 0;
        }
        int i24 = (i23 + i11) * 31;
        Boolean bool5 = this.f92700l;
        if (bool5 != null) {
            i12 = bool5.hashCode();
        } else {
            i12 = 0;
        }
        int i25 = (i24 + i12) * 31;
        Boolean bool6 = this.f92701m;
        if (bool6 != null) {
            i13 = bool6.hashCode();
        }
        return i25 + i13;
    }

    public final String toString() {
        return "ReporterArguments{apiKey='" + this.f92689a + "', locationTracking=" + this.f92690b + ", manualLocation=" + this.f92691c + ", firstActivationAsUpdate=" + this.f92692d + ", sessionTimeout=" + this.f92693e + ", maxReportsCount=" + this.f92694f + ", dispatchPeriod=" + this.f92695g + ", logEnabled=" + this.f92696h + ", dataSendingEnabled=" + this.f92697i + ", clidsFromClient=" + this.f92698j + ", maxReportsInDbCount=" + this.f92699k + ", nativeCrashesEnabled=" + this.f92700l + ", revenueAutoTrackingEnabled=" + this.f92701m + '}';
    }

    public C33835D4(@NonNull CounterConfiguration counterConfiguration, @Nullable Map<String, String> map) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled());
    }

    public C33835D4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
