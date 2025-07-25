package io.appmetrica.analytics.impl;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.km */
/* loaded from: classes9.dex */
public final class C34678km {

    /* renamed from: a */
    public final HashMap f94804a;

    public C34678km(@NonNull String str, @NonNull HashMap<String, List<String>> hashMap) {
        this.f94804a = hashMap;
    }

    @VisibleForTesting(otherwise = 5)
    /* renamed from: a */
    public final HashMap<String, List<String>> m21478a() {
        return this.f94804a;
    }

    /* renamed from: a */
    public final boolean m21477a(SQLiteDatabase sQLiteDatabase) {
        try {
            boolean z = true;
            for (Map.Entry entry : this.f94804a.entrySet()) {
                Cursor query = sQLiteDatabase.query((String) entry.getKey(), null, null, null, null, null, null);
                if (query == null) {
                    AbstractC34679kn.m21474a(query);
                    return false;
                }
                String str = (String) entry.getKey();
                List asList = Arrays.asList(query.getColumnNames());
                Collections.sort(asList);
                z &= ((List) entry.getValue()).equals(asList);
                AbstractC34679kn.m21474a(query);
            }
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }
}
