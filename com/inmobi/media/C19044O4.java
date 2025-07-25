package com.inmobi.media;

import android.content.ContentValues;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.O4 */
/* loaded from: classes6.dex */
public final class C19044O4 extends AbstractC19534y3 {
    public C19044O4() {
        super("crash", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, componentType TEXT NOT NULL, eventId TEXT NOT NULL, eventType TEXT NOT NULL, payload TEXT NOT NULL, ts TEXT NOT NULL)");
    }

    @Override // com.inmobi.media.AbstractC19518x1
    /* renamed from: a */
    public final Object mo59524a(ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        String asString = contentValues.getAsString("eventId");
        String asString2 = contentValues.getAsString("eventType");
        String asString3 = contentValues.getAsString("componentType");
        String asString4 = contentValues.getAsString("payload");
        String asString5 = contentValues.getAsString("ts");
        Intrinsics.checkNotNullExpressionValue(asString5, "getAsString(...)");
        long parseLong = Long.parseLong(asString5);
        Intrinsics.m17074g(asString);
        Intrinsics.m17074g(asString3);
        Intrinsics.m17074g(asString2);
        C19082R4 c19082r4 = new C19082R4(asString, asString3, asString2, asString4);
        c19082r4.f48922b = parseLong;
        Integer asInteger = contentValues.getAsInteger("id");
        Intrinsics.checkNotNullExpressionValue(asInteger, "getAsInteger(...)");
        c19082r4.f48923c = asInteger.intValue();
        return c19082r4;
    }

    @Override // com.inmobi.media.AbstractC19518x1
    /* renamed from: b */
    public final ContentValues mo59523b(Object obj) {
        C19082R4 item = (C19082R4) obj;
        Intrinsics.checkNotNullParameter(item, "item");
        item.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("eventId", item.f47658e);
        contentValues.put("componentType", item.f47659f);
        contentValues.put("eventType", item.f48921a);
        contentValues.put("payload", item.m59562a());
        contentValues.put("ts", String.valueOf(item.f48922b));
        return contentValues;
    }
}
