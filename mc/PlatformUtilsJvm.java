package mc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: mc.s */
/* loaded from: classes9.dex */
public final class PlatformUtilsJvm {
    @NotNull
    /* renamed from: a */
    public static final PlatformUtils m15214a(@NotNull C38274r c38274r) {
        Intrinsics.checkNotNullParameter(c38274r, "<this>");
        return PlatformUtils.Jvm;
    }

    /* renamed from: b */
    public static final boolean m15213b(@NotNull C38274r c38274r) {
        Intrinsics.checkNotNullParameter(c38274r, "<this>");
        String property = System.getProperty("io.ktor.development");
        if (property == null || !Boolean.parseBoolean(property)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m15212c(@NotNull C38274r c38274r) {
        Intrinsics.checkNotNullParameter(c38274r, "<this>");
        return true;
    }
}
