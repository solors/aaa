package com.inmobi.media;

import android.content.ContentValues;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.lb */
/* loaded from: classes6.dex */
public final class C19360lb extends AbstractC19534y3 {
    public C19360lb() {
        super("telemetry", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, eventSource TEXT NOT NULL, ts TEXT NOT NULL)");
    }

    @Override // com.inmobi.media.AbstractC19518x1
    /* renamed from: a */
    public final Object mo59524a(ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        String asString = contentValues.getAsString("eventType");
        String asString2 = contentValues.getAsString("payload");
        String asString3 = contentValues.getAsString("eventSource");
        String asString4 = contentValues.getAsString("ts");
        Intrinsics.checkNotNullExpressionValue(asString4, "getAsString(...)");
        long parseLong = Long.parseLong(asString4);
        Intrinsics.m17074g(asString);
        Intrinsics.m17074g(asString3);
        C19374mb c19374mb = new C19374mb(asString, asString2, asString3);
        c19374mb.f48922b = parseLong;
        Integer asInteger = contentValues.getAsInteger("id");
        Intrinsics.checkNotNullExpressionValue(asInteger, "getAsInteger(...)");
        c19374mb.f48923c = asInteger.intValue();
        return c19374mb;
    }

    @Override // com.inmobi.media.AbstractC19518x1
    /* renamed from: b */
    public final ContentValues mo59523b(Object obj) {
        C19374mb item = (C19374mb) obj;
        Intrinsics.checkNotNullParameter(item, "item");
        item.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventType", item.f48921a);
        contentValues.put("payload", item.m59562a());
        contentValues.put("eventSource", item.f48516e);
        contentValues.put("ts", String.valueOf(item.f48922b));
        return contentValues;
    }
}
