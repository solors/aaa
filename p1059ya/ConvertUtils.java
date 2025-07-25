package p1059ya;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ya.c */
/* loaded from: classes8.dex */
public final class ConvertUtils {
    @Nullable
    /* renamed from: a */
    public static final Boolean m1009a(@NotNull Number number) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        int intValue = number.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /* renamed from: b */
    public static final boolean m1008b(int i) {
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            throw new IllegalArgumentException("Unable to convert " + i + " to boolean");
        }
        return false;
    }
}
