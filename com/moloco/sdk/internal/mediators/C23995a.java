package com.moloco.sdk.internal.mediators;

import ee.DurationUnitJvm;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C37700c;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.mediators.a */
/* loaded from: classes7.dex */
public final class C23995a {
    /* renamed from: a */
    public static final long m47229a(@Nullable String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 76100) {
                if (hashCode != 63085501) {
                    if (hashCode == 347625656 && str.equals("LevelPlay")) {
                        return C37700c.m16452s(8, DurationUnitJvm.f90130g);
                    }
                } else if (str.equals("AdMob")) {
                    return C37700c.m16452s(8, DurationUnitJvm.f90130g);
                }
            } else if (str.equals("MAX")) {
                return C37700c.m16452s(8, DurationUnitJvm.f90130g);
            }
        }
        return C37700c.m16452s(9, DurationUnitJvm.f90130g);
    }

    /* renamed from: b */
    public static final boolean m47228b(@Nullable String str) {
        if (!Intrinsics.m17075f(str, "MAX") && !Intrinsics.m17075f(str, "LevelPlay") && !Intrinsics.m17075f(str, "AdMob")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final long m47227c(@Nullable String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 76100) {
                if (hashCode != 63085501) {
                    if (hashCode == 347625656 && str.equals("LevelPlay")) {
                        return C37700c.m16452s(26, DurationUnitJvm.f90130g);
                    }
                } else if (str.equals("AdMob")) {
                    return C37700c.m16452s(26, DurationUnitJvm.f90130g);
                }
            } else if (str.equals("MAX")) {
                return C37700c.m16452s(26, DurationUnitJvm.f90130g);
            }
        }
        return C37700c.m16452s(14, DurationUnitJvm.f90130g);
    }

    /* renamed from: d */
    public static final long m47226d(@Nullable String str) {
        if (Intrinsics.m17075f(str, "MAX")) {
            return C37700c.m16452s(8, DurationUnitJvm.f90130g);
        }
        if (Intrinsics.m17075f(str, "AdMob")) {
            return C37700c.m16452s(58, DurationUnitJvm.f90130g);
        }
        return C37700c.m16452s(8, DurationUnitJvm.f90130g);
    }
}
