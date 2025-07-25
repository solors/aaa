package io.bidmachine.analytics.internal;

import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C37566w;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.bidmachine.analytics.internal.n */
/* loaded from: classes9.dex */
public abstract class AbstractC35638n {

    /* renamed from: io.bidmachine.analytics.internal.n$d */
    /* loaded from: classes9.dex */
    static final class C35639d extends Lambda implements Function1 {

        /* renamed from: a */
        public static final C35639d f96538a = new C35639d();

        C35639d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final CharSequence invoke(Object obj) {
            return "?";
        }
    }

    /* renamed from: a */
    public static final void m20125a(List list, SQLiteDatabase sQLiteDatabase, int i, Function1 function1) {
        List<List> m17546f0;
        if (list == null) {
            function1.invoke(null);
            return;
        }
        sQLiteDatabase.beginTransaction();
        try {
            m17546f0 = _Collections.m17546f0(list, i);
            for (List list2 : m17546f0) {
                function1.invoke(list2);
            }
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m20124a(List list, SQLiteDatabase sQLiteDatabase, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 100;
        }
        m20125a(list, sQLiteDatabase, i, function1);
    }

    /* renamed from: a */
    public static final String[] m20126a(List list) {
        int m17154x;
        if (list != null) {
            m17154x = C37566w.m17154x(list, 10);
            ArrayList arrayList = new ArrayList(m17154x);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return (String[]) arrayList.toArray(new String[0]);
        }
        return null;
    }

    /* renamed from: a */
    public static final String m20123a(List list, String str) {
        String m17521z0;
        if (list != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" (");
            m17521z0 = _Collections.m17521z0(list, ",", null, null, 0, null, C35639d.f96538a, 30, null);
            sb2.append(m17521z0);
            sb2.append(')');
            return sb2.toString();
        }
        return null;
    }
}
