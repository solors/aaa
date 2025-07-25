package kotlin.time;

import ee.DurationUnitJvm;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlin.time.e */
/* loaded from: classes7.dex */
class DurationUnit extends C37701d {
    @NotNull
    /* renamed from: d */
    public static final DurationUnitJvm m16447d(char c, boolean z) {
        if (!z) {
            if (c == 'D') {
                return DurationUnitJvm.f90133j;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c);
        } else if (c == 'H') {
            return DurationUnitJvm.f90132i;
        } else {
            if (c == 'M') {
                return DurationUnitJvm.f90131h;
            }
            if (c == 'S') {
                return DurationUnitJvm.f90130g;
            }
            throw new IllegalArgumentException("Invalid duration ISO time unit: " + c);
        }
    }

    @NotNull
    /* renamed from: e */
    public static final DurationUnitJvm m16446e(@NotNull String shortName) {
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        int hashCode = shortName.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && shortName.equals("us")) {
                                    return DurationUnitJvm.f90128d;
                                }
                            } else if (shortName.equals("ns")) {
                                return DurationUnitJvm.f90127c;
                            }
                        } else if (shortName.equals("ms")) {
                            return DurationUnitJvm.f90129f;
                        }
                    } else if (shortName.equals("s")) {
                        return DurationUnitJvm.f90130g;
                    }
                } else if (shortName.equals("m")) {
                    return DurationUnitJvm.f90131h;
                }
            } else if (shortName.equals("h")) {
                return DurationUnitJvm.f90132i;
            }
        } else if (shortName.equals("d")) {
            return DurationUnitJvm.f90133j;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }
}
