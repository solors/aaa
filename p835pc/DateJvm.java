package p835pc;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: pc.a */
/* loaded from: classes9.dex */
public final class DateJvm {

    /* renamed from: a */
    private static final TimeZone f103183a = TimeZone.getTimeZone("GMT");

    @NotNull
    /* renamed from: a */
    public static final Date m13199a(@Nullable Long l) {
        Calendar calendar = Calendar.getInstance(f103183a, Locale.ROOT);
        Intrinsics.m17074g(calendar);
        return m13197c(calendar, l);
    }

    /* renamed from: b */
    public static /* synthetic */ Date m13198b(Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = null;
        }
        return m13199a(l);
    }

    @NotNull
    /* renamed from: c */
    public static final Date m13197c(@NotNull Calendar calendar, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(calendar, "<this>");
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        int i = calendar.get(15) + calendar.get(16);
        return new Date(calendar.get(13), calendar.get(12), calendar.get(11), EnumC39298d.f103210c.m13192a(((calendar.get(7) + 7) - 2) % 7), calendar.get(5), calendar.get(6), EnumC39296c.f103195c.m13194a(calendar.get(2)), calendar.get(1), calendar.getTimeInMillis() + i);
    }
}
