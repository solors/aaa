package com.inmobi.media;

import android.content.ContentValues;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.z2 */
/* loaded from: classes6.dex */
public final class C19547z2 extends AbstractC19518x1 {
    public C19547z2() {
        super("c_data", "(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, e_data TEXT NOT NULL, timestamp INTEGER NOT NULL )");
        Intrinsics.checkNotNullExpressionValue(C19547z2.class.getSimpleName(), "getSimpleName(...)");
    }

    @Override // com.inmobi.media.AbstractC19518x1
    /* renamed from: a */
    public final Object mo59524a(ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        String asString = contentValues.getAsString("e_data");
        Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
        Long asLong = contentValues.getAsLong("timestamp");
        Intrinsics.checkNotNullExpressionValue(asLong, "getAsLong(...)");
        return new C19464t3(asString, asLong.longValue());
    }

    @Override // com.inmobi.media.AbstractC19518x1
    /* renamed from: b */
    public final ContentValues mo59523b(Object obj) {
        C19464t3 data = (C19464t3) obj;
        Intrinsics.checkNotNullParameter(data, "data");
        ContentValues contentValues = new ContentValues();
        contentValues.put("e_data", data.f48676a);
        contentValues.put("timestamp", Long.valueOf(data.f48677b));
        return contentValues;
    }
}
