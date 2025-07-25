package la;

import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import na.DateTime;

/* compiled from: DateTimeFunctions.kt */
@Metadata
/* renamed from: la.f0 */
/* loaded from: classes8.dex */
public final class C37963f0 {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final Calendar m15628c(DateTime dateTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(dateTime.m14636f());
        calendar.setTimeInMillis(dateTime.m14637e());
        Intrinsics.checkNotNullExpressionValue(calendar, "calendar");
        return calendar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final Date m15627d(DateTime dateTime) {
        return new Date(dateTime.m14637e() - dateTime.m14636f().getRawOffset());
    }
}
