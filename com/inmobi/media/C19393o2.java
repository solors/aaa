package com.inmobi.media;

import android.content.ContentValues;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.inmobi.media.o2 */
/* loaded from: classes6.dex */
public final class C19393o2 extends Lambda implements Function1 {

    /* renamed from: a */
    public static final C19393o2 f48556a = new C19393o2();

    public C19393o2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ContentValues contentValues = (ContentValues) obj;
        Intrinsics.checkNotNullParameter(contentValues, "contentValues");
        if (contentValues.getAsString("config_value") != null) {
            return contentValues.getAsLong("update_ts");
        }
        return null;
    }
}
