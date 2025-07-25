package androidx.work.impl.utils;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(26)
@Metadata
/* renamed from: androidx.work.impl.utils.DurationApi26Impl */
/* loaded from: classes2.dex */
public final class DurationApi26 {
    @DoNotInline
    public static final long toMillisCompat(@NotNull Duration duration) {
        long millis;
        Intrinsics.checkNotNullParameter(duration, "<this>");
        millis = duration.toMillis();
        return millis;
    }
}
