package p864ra;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p817oa.HistogramRecordConfiguration;
import sa.C39638b;
import sa.KAssert;

@Metadata
/* renamed from: ra.b */
/* loaded from: classes8.dex */
public final class HistogramUtils {
    @NotNull

    /* renamed from: a */
    public static final HistogramUtils f103760a = new HistogramUtils();

    private HistogramUtils() {
    }

    /* renamed from: a */
    public final boolean m12580a(@NotNull String callType, @NotNull HistogramRecordConfiguration configuration) {
        Intrinsics.checkNotNullParameter(callType, "callType");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        int hashCode = callType.hashCode();
        if (hashCode != 2106116) {
            if (hashCode != 2106217) {
                if (hashCode == 2688677 && callType.equals("Warm")) {
                    return configuration.mo13856i();
                }
            } else if (callType.equals("Cool")) {
                return configuration.mo13860c();
            }
        } else if (callType.equals("Cold")) {
            return configuration.mo13858e();
        }
        KAssert kAssert = KAssert.f104132a;
        if (C39638b.m11995q()) {
            C39638b.m12001k("Unknown histogram call type: " + callType);
        }
        return false;
    }
}
