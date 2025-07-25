package p701hb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: hb.a */
/* loaded from: classes8.dex */
public enum Severity {
    ERROR,
    WARNING,
    INFO,
    DEBUG,
    VERBOSE;

    /* renamed from: c */
    public final boolean m23624c(@NotNull Severity minLevel) {
        Intrinsics.checkNotNullParameter(minLevel, "minLevel");
        if (ordinal() >= minLevel.ordinal()) {
            return true;
        }
        return false;
    }
}
