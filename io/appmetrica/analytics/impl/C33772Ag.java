package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Ag */
/* loaded from: classes9.dex */
public final class C33772Ag extends BaseRequestConfig.BaseRequestArguments {
    @Nullable

    /* renamed from: a */
    public final String f92571a;
    @Nullable

    /* renamed from: b */
    public final Location f92572b;

    /* renamed from: c */
    public final boolean f92573c;

    /* renamed from: d */
    public final boolean f92574d;

    /* renamed from: e */
    public final int f92575e;

    /* renamed from: f */
    public final int f92576f;

    /* renamed from: g */
    public final int f92577g;

    /* renamed from: h */
    public final boolean f92578h;

    /* renamed from: i */
    public final boolean f92579i;
    @Nullable

    /* renamed from: j */
    public final Map<String, String> f92580j;

    /* renamed from: k */
    public final int f92581k;

    public C33772Ag(@NonNull C33835D4 c33835d4) {
        this(c33835d4.f92689a, c33835d4.f92690b, c33835d4.f92691c, c33835d4.f92692d, c33835d4.f92693e, c33835d4.f92694f, c33835d4.f92695g, c33835d4.f92696h, c33835d4.f92697i, c33835d4.f92698j, c33835d4.f92699k);
    }

    /* renamed from: a */
    public static C33772Ag m22776a() {
        return new C33772Ag(null, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* renamed from: b */
    public final C33772Ag mergeFrom(@NonNull C33835D4 c33835d4) {
        return new C33772Ag((String) WrapUtils.getOrDefaultNullable(c33835d4.f92689a, this.f92571a), (Boolean) WrapUtils.getOrDefaultNullable(c33835d4.f92690b, Boolean.valueOf(this.f92573c)), (Location) WrapUtils.getOrDefaultNullable(c33835d4.f92691c, this.f92572b), (Boolean) WrapUtils.getOrDefaultNullable(c33835d4.f92692d, Boolean.valueOf(this.f92574d)), (Integer) WrapUtils.getOrDefaultNullable(c33835d4.f92693e, Integer.valueOf(this.f92575e)), (Integer) WrapUtils.getOrDefaultNullable(c33835d4.f92694f, Integer.valueOf(this.f92576f)), (Integer) WrapUtils.getOrDefaultNullable(c33835d4.f92695g, Integer.valueOf(this.f92577g)), (Boolean) WrapUtils.getOrDefaultNullable(c33835d4.f92696h, Boolean.valueOf(this.f92578h)), (Boolean) WrapUtils.getOrDefaultNullable(c33835d4.f92697i, Boolean.valueOf(this.f92579i)), (Map) WrapUtils.getOrDefaultNullable(c33835d4.f92698j, this.f92580j), (Integer) WrapUtils.getOrDefaultNullable(c33835d4.f92699k, Integer.valueOf(this.f92581k)));
    }

    public C33772Ag(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4) {
        this.f92571a = str;
        Boolean bool5 = Boolean.FALSE;
        this.f92573c = ((Boolean) WrapUtils.getOrDefault(bool, bool5)).booleanValue();
        this.f92572b = location;
        this.f92574d = ((Boolean) WrapUtils.getOrDefault(bool2, bool5)).booleanValue();
        this.f92575e = Math.max(10, ((Integer) WrapUtils.getOrDefault(num, 10)).intValue());
        this.f92576f = ((Integer) WrapUtils.getOrDefault(num2, 7)).intValue();
        this.f92577g = ((Integer) WrapUtils.getOrDefault(num3, 90)).intValue();
        this.f92578h = ((Boolean) WrapUtils.getOrDefault(bool3, bool5)).booleanValue();
        this.f92579i = ((Boolean) WrapUtils.getOrDefault(bool4, Boolean.TRUE)).booleanValue();
        this.f92580j = map;
        this.f92581k = ((Integer) WrapUtils.getOrDefault(num4, 1000)).intValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: a */
    public final boolean compareWithOtherArguments(@NonNull C33835D4 c33835d4) {
        Location location;
        float verticalAccuracyMeters;
        float verticalAccuracyMeters2;
        float speedAccuracyMetersPerSecond;
        float speedAccuracyMetersPerSecond2;
        float bearingAccuracyDegrees;
        float bearingAccuracyDegrees2;
        Map<String, String> map;
        String str;
        Boolean bool = c33835d4.f92690b;
        if (bool == null || this.f92573c == bool.booleanValue()) {
            Boolean bool2 = c33835d4.f92692d;
            if (bool2 == null || this.f92574d == bool2.booleanValue()) {
                Integer num = c33835d4.f92693e;
                if (num == null || this.f92575e == num.intValue()) {
                    Integer num2 = c33835d4.f92694f;
                    if (num2 == null || this.f92576f == num2.intValue()) {
                        Integer num3 = c33835d4.f92695g;
                        if (num3 == null || this.f92577g == num3.intValue()) {
                            Boolean bool3 = c33835d4.f92696h;
                            if (bool3 == null || this.f92578h == bool3.booleanValue()) {
                                Boolean bool4 = c33835d4.f92697i;
                                if (bool4 == null || this.f92579i == bool4.booleanValue()) {
                                    String str2 = c33835d4.f92689a;
                                    if (str2 == null || ((str = this.f92571a) != null && str.equals(str2))) {
                                        Map<String, String> map2 = c33835d4.f92698j;
                                        if (map2 == null || ((map = this.f92580j) != null && map.equals(map2))) {
                                            Integer num4 = c33835d4.f92699k;
                                            if (num4 == null || this.f92581k == num4.intValue()) {
                                                Location location2 = c33835d4.f92691c;
                                                if (location2 != null && (location = this.f92572b) != location2) {
                                                    if (location == null || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || Double.compare(location2.getLatitude(), location.getLatitude()) != 0 || Double.compare(location2.getLongitude(), location.getLongitude()) != 0 || Double.compare(location2.getAltitude(), location.getAltitude()) != 0 || Float.compare(location2.getSpeed(), location.getSpeed()) != 0 || Float.compare(location2.getBearing(), location.getBearing()) != 0 || Float.compare(location2.getAccuracy(), location.getAccuracy()) != 0) {
                                                        return false;
                                                    }
                                                    if (AndroidUtils.isApiAchieved(26)) {
                                                        verticalAccuracyMeters = location2.getVerticalAccuracyMeters();
                                                        verticalAccuracyMeters2 = location.getVerticalAccuracyMeters();
                                                        if (Float.compare(verticalAccuracyMeters, verticalAccuracyMeters2) != 0) {
                                                            return false;
                                                        }
                                                        speedAccuracyMetersPerSecond = location2.getSpeedAccuracyMetersPerSecond();
                                                        speedAccuracyMetersPerSecond2 = location.getSpeedAccuracyMetersPerSecond();
                                                        if (Float.compare(speedAccuracyMetersPerSecond, speedAccuracyMetersPerSecond2) != 0) {
                                                            return false;
                                                        }
                                                        bearingAccuracyDegrees = location2.getBearingAccuracyDegrees();
                                                        bearingAccuracyDegrees2 = location.getBearingAccuracyDegrees();
                                                        if (Float.compare(bearingAccuracyDegrees, bearingAccuracyDegrees2) != 0) {
                                                            return false;
                                                        }
                                                    }
                                                    if (location.getProvider() != null) {
                                                        if (!location.getProvider().equals(location2.getProvider())) {
                                                            return false;
                                                        }
                                                    } else if (location2.getProvider() != null) {
                                                        return false;
                                                    }
                                                    if (location.getExtras() != null) {
                                                        if (!location.getExtras().equals(location2.getExtras())) {
                                                            return false;
                                                        }
                                                    } else if (location2.getExtras() != null) {
                                                        return false;
                                                    }
                                                }
                                                return true;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
