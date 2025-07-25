package com.inmobi.media;

import android.content.ContentValues;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.R5 */
/* loaded from: classes6.dex */
public final class C19083R5 extends AbstractC19518x1 {

    /* renamed from: b */
    public C18892D4 f47660b;

    static {
        Intrinsics.checkNotNullExpressionValue(C19083R5.class.getSimpleName(), "getSimpleName(...)");
    }

    public C19083R5() {
        super("logs_v2", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, filename TEXT NOT NULL, saveTimestamp INTEGER NOT NULL, retryCount INTEGER NOT NULL, hasLoggerFinished INTEGER NOT NULL, checkpoints INTEGER NOT NULL,lastRetryTimestamp INTEGER NOT NULL )");
    }

    @Override // com.inmobi.media.AbstractC19518x1
    /* renamed from: a */
    public final Object mo59524a(ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        String asString = contentValues.getAsString("filename");
        Long asLong = contentValues.getAsLong("saveTimestamp");
        Integer asInteger = contentValues.getAsInteger("retryCount");
        Long asLong2 = contentValues.getAsLong("lastRetryTimestamp");
        Integer asInteger2 = contentValues.getAsInteger("checkpoints");
        Integer asInteger3 = contentValues.getAsInteger("hasLoggerFinished");
        boolean z = asInteger3 != null && asInteger3.intValue() == 1;
        Intrinsics.m17074g(asString);
        Intrinsics.m17074g(asLong);
        long longValue = asLong.longValue();
        Intrinsics.m17074g(asInteger);
        int intValue = asInteger.intValue();
        Intrinsics.m17074g(asLong2);
        long longValue2 = asLong2.longValue();
        Intrinsics.m17074g(asInteger2);
        return new C19071Q5(asString, longValue, intValue, longValue2, z, asInteger2.intValue());
    }

    @Override // com.inmobi.media.AbstractC19518x1
    /* renamed from: b */
    public final ContentValues mo59523b(Object obj) {
        C19071Q5 item = (C19071Q5) obj;
        Intrinsics.checkNotNullParameter(item, "item");
        ContentValues contentValues = new ContentValues();
        contentValues.put("filename", item.f47638a);
        contentValues.put("saveTimestamp", Long.valueOf(item.f47639b));
        contentValues.put("retryCount", Integer.valueOf(item.f47640c));
        contentValues.put("lastRetryTimestamp", Long.valueOf(item.f47641d));
        contentValues.put("checkpoints", Integer.valueOf(item.f47643f));
        contentValues.put("hasLoggerFinished", Integer.valueOf(item.f47642e ? 1 : 0));
        return contentValues;
    }

    /* renamed from: a */
    public final void m60745a(C19071Q5 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        m59591a("filename=\"" + data.f47638a + '\"', null);
    }

    /* renamed from: b */
    public final void m60744b(C19071Q5 data) {
        Intrinsics.checkNotNullParameter(data, "data");
        m59590b(data, "filename=\"" + data.f47638a + '\"', null);
        if (this.f47660b != null) {
            C18892D4.m61164a();
        }
    }
}
