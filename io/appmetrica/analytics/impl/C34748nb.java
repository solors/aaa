package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import java.io.Closeable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.nb */
/* loaded from: classes9.dex */
public final class C34748nb implements InterfaceC33891Fa, Closeable {

    /* renamed from: a */
    public final HashMap f94997a = new HashMap();

    /* renamed from: b */
    public final HashMap f94998b = new HashMap();

    /* renamed from: c */
    public final String f94999c = "preferences";

    /* renamed from: d */
    public final C34721mb f95000d;

    /* renamed from: e */
    public volatile boolean f95001e;

    /* renamed from: f */
    public final InterfaceC35058z6 f95002f;

    public C34748nb(InterfaceC35058z6 interfaceC35058z6) {
        this.f95002f = interfaceC35058z6;
        C34721mb c34721mb = new C34721mb(this, String.format(Locale.US, "IAA-DW-%s", Integer.valueOf(ThreadFactoryC34480dd.m21823a())));
        this.f95000d = c34721mb;
        c34721mb.start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0022 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Long] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m21304a(io.appmetrica.analytics.impl.C34748nb r13) {
        /*
            java.lang.String r0 = "type"
            java.lang.String r1 = "value"
            java.lang.String r2 = "key"
            r13.getClass()
            r3 = 0
            io.appmetrica.analytics.impl.z6 r4 = r13.f95002f     // Catch: java.lang.Throwable -> L85
            android.database.sqlite.SQLiteDatabase r4 = r4.mo20727a()     // Catch: java.lang.Throwable -> L85
            if (r4 == 0) goto L86
            java.lang.String r6 = r13.f94999c     // Catch: java.lang.Throwable -> L86
            java.lang.String[] r7 = new java.lang.String[]{r2, r1, r0}     // Catch: java.lang.Throwable -> L86
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r5 = r4
            android.database.Cursor r5 = r5.query(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L86
        L22:
            boolean r6 = r5.moveToNext()     // Catch: java.lang.Throwable -> L83
            if (r6 == 0) goto L83
            int r6 = r5.getColumnIndexOrThrow(r2)     // Catch: java.lang.Throwable -> L83
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L83
            int r7 = r5.getColumnIndexOrThrow(r1)     // Catch: java.lang.Throwable -> L83
            java.lang.String r7 = r5.getString(r7)     // Catch: java.lang.Throwable -> L83
            int r8 = r5.getColumnIndexOrThrow(r0)     // Catch: java.lang.Throwable -> L83
            int r8 = r5.getInt(r8)     // Catch: java.lang.Throwable -> L83
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L83
            if (r9 != 0) goto L22
            r9 = 1
            if (r8 == r9) goto L66
            r9 = 2
            if (r8 == r9) goto L61
            r9 = 3
            if (r8 == r9) goto L5c
            r9 = 4
            if (r8 == r9) goto L7b
            r9 = 5
            if (r8 == r9) goto L57
        L55:
            r7 = r3
            goto L7b
        L57:
            java.lang.Float r7 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseFloat(r7)     // Catch: java.lang.Throwable -> L83
            goto L7b
        L5c:
            java.lang.Long r7 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseLong(r7)     // Catch: java.lang.Throwable -> L83
            goto L7b
        L61:
            java.lang.Integer r7 = io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils.parseInt(r7)     // Catch: java.lang.Throwable -> L83
            goto L7b
        L66:
            java.lang.String r8 = "true"
            boolean r8 = r8.equals(r7)     // Catch: java.lang.Throwable -> L83
            if (r8 == 0) goto L71
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L83
            goto L7b
        L71:
            java.lang.String r8 = "false"
            boolean r7 = r8.equals(r7)     // Catch: java.lang.Throwable -> L83
            if (r7 == 0) goto L55
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L83
        L7b:
            if (r7 == 0) goto L22
            java.util.HashMap r8 = r13.f94997a     // Catch: java.lang.Throwable -> L83
            r8.put(r6, r7)     // Catch: java.lang.Throwable -> L83
            goto L22
        L83:
            r3 = r5
            goto L86
        L85:
            r4 = r3
        L86:
            io.appmetrica.analytics.impl.AbstractC34679kn.m21474a(r3)
            io.appmetrica.analytics.impl.z6 r13 = r13.f95002f
            r13.mo20726a(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C34748nb.m21304a(io.appmetrica.analytics.impl.nb):void");
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33891Fa
    /* renamed from: b */
    public final void mo21207b() {
        synchronized (this.f95000d) {
            this.f95000d.notifyAll();
        }
    }

    /* renamed from: c */
    public final void m21300c() {
        if (!this.f95001e) {
            try {
                this.f94997a.wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f95000d.isRunning()) {
            this.f95000d.stopRunning();
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33891Fa
    public final boolean getBoolean(String str, boolean z) {
        Object m21301b = m21301b(str);
        if (m21301b instanceof Boolean) {
            return ((Boolean) m21301b).booleanValue();
        }
        return z;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33891Fa
    public final int getInt(String str, int i) {
        Object m21301b = m21301b(str);
        if (m21301b instanceof Integer) {
            return ((Integer) m21301b).intValue();
        }
        return i;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33891Fa
    public final long getLong(String str, long j) {
        Object m21301b = m21301b(str);
        if (m21301b instanceof Long) {
            return ((Long) m21301b).longValue();
        }
        return j;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33891Fa
    public final String getString(String str, String str2) {
        Object m21301b = m21301b(str);
        if (m21301b instanceof String) {
            return (String) m21301b;
        }
        return str2;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33891Fa
    public final InterfaceC33891Fa remove(String str) {
        synchronized (this.f94997a) {
            m21300c();
            this.f94997a.remove(str);
        }
        synchronized (this.f95000d) {
            this.f94998b.put(str, this);
            this.f95000d.notifyAll();
        }
        return this;
    }

    /* renamed from: b */
    public final Object m21301b(String str) {
        Object obj;
        synchronized (this.f94997a) {
            m21300c();
            obj = this.f94997a.get(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static void m21303a(C34748nb c34748nb, HashMap hashMap) {
        SQLiteDatabase sQLiteDatabase;
        c34748nb.getClass();
        int size = hashMap.size();
        ContentValues[] contentValuesArr = new ContentValues[size];
        int i = 0;
        for (Map.Entry entry : hashMap.entrySet()) {
            ContentValues contentValues = new ContentValues();
            Object value = entry.getValue();
            contentValues.put("key", (String) entry.getKey());
            if (value == c34748nb) {
                contentValues.putNull("value");
            } else if (value instanceof String) {
                contentValues.put("value", (String) value);
                contentValues.put("type", (Integer) 4);
            } else if (value instanceof Long) {
                contentValues.put("value", (Long) value);
                contentValues.put("type", (Integer) 3);
            } else if (value instanceof Integer) {
                contentValues.put("value", (Integer) value);
                contentValues.put("type", (Integer) 2);
            } else if (value instanceof Boolean) {
                contentValues.put("value", String.valueOf(((Boolean) value).booleanValue()));
                contentValues.put("type", (Integer) 1);
            } else if (value instanceof Float) {
                contentValues.put("value", (Float) value);
                contentValues.put("type", (Integer) 5);
            }
            contentValuesArr[i] = contentValues;
            i++;
        }
        SQLiteDatabase sQLiteDatabase2 = null;
        try {
            sQLiteDatabase = c34748nb.f95002f.mo20727a();
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.beginTransaction();
                    for (int i2 = 0; i2 < size; i2++) {
                        ContentValues contentValues2 = contentValuesArr[i2];
                        if (contentValues2.getAsString("value") == null) {
                            sQLiteDatabase.delete(c34748nb.f94999c, "key = ?", new String[]{contentValues2.getAsString("key")});
                        } else {
                            sQLiteDatabase.insertWithOnConflict(c34748nb.f94999c, null, contentValues2, 5);
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (Throwable unused) {
                    sQLiteDatabase2 = sQLiteDatabase;
                    if (sQLiteDatabase2 != null) {
                        try {
                            sQLiteDatabase2.endTransaction();
                        } catch (Throwable unused2) {
                        }
                    }
                    sQLiteDatabase = sQLiteDatabase2;
                    c34748nb.f95002f.mo20726a(sQLiteDatabase);
                }
            }
            if (sQLiteDatabase != null) {
                try {
                    sQLiteDatabase.endTransaction();
                } catch (Throwable unused3) {
                }
            }
        } catch (Throwable unused4) {
        }
        c34748nb.f95002f.mo20726a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33891Fa
    /* renamed from: a */
    public final synchronized InterfaceC33891Fa mo21209a(String str, String str2) {
        m21302a(str, (Object) str2);
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33891Fa
    /* renamed from: a */
    public final InterfaceC33891Fa mo21210a(String str, long j) {
        m21302a(str, Long.valueOf(j));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33891Fa
    /* renamed from: a */
    public final synchronized InterfaceC33891Fa mo21213a(int i, String str) {
        m21302a(str, Integer.valueOf(i));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33891Fa
    /* renamed from: a */
    public final InterfaceC33891Fa mo21208a(String str, boolean z) {
        m21302a(str, Boolean.valueOf(z));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33891Fa
    /* renamed from: a */
    public final InterfaceC33891Fa mo21211a(String str, float f) {
        m21302a(str, Float.valueOf(f));
        return this;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33891Fa
    /* renamed from: a */
    public final boolean mo21212a(String str) {
        boolean containsKey;
        synchronized (this.f94997a) {
            m21300c();
            containsKey = this.f94997a.containsKey(str);
        }
        return containsKey;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33891Fa
    /* renamed from: a */
    public final Set mo21214a() {
        HashSet hashSet;
        synchronized (this.f94997a) {
            hashSet = new HashSet(this.f94997a.keySet());
        }
        return hashSet;
    }

    /* renamed from: a */
    public final void m21302a(String str, Object obj) {
        synchronized (this.f94997a) {
            m21300c();
            this.f94997a.put(str, obj);
        }
        synchronized (this.f95000d) {
            this.f94998b.put(str, obj);
            this.f95000d.notifyAll();
        }
    }
}
