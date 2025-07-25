package com.bytedance.sdk.component.adexpress.p243bg.p244IL;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.bytedance.sdk.component.adexpress.p243bg.p245bX.C7316IL;
import com.bytedance.sdk.component.adexpress.p243bg.p245bX.C7317bX;
import com.bytedance.sdk.component.adexpress.p243bg.p246bg.C7324bg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.component.adexpress.bg.IL.ldr */
/* loaded from: classes3.dex */
public class C7310ldr {

    /* renamed from: IL */
    private static volatile C7310ldr f15814IL = null;

    /* renamed from: bg */
    public static int f15815bg = 20;

    /* renamed from: zx */
    private volatile ConcurrentHashMap<String, C7317bX> f15818zx;
    private final Object eqN = new Object();
    private AtomicBoolean ldr = new AtomicBoolean(false);

    /* renamed from: iR */
    private LruCache<String, C7316IL> f15817iR = new LruCache<String, C7316IL>(f15815bg) { // from class: com.bytedance.sdk.component.adexpress.bg.IL.ldr.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: bg */
        public int sizeOf(String str, C7316IL c7316il) {
            return 1;
        }
    };

    /* renamed from: bX */
    private Set<String> f15816bX = Collections.synchronizedSet(new HashSet());

    private C7310ldr() {
    }

    /* renamed from: bg */
    public static void m89181bg(int i) {
        f15815bg = i;
    }

    private void eqN(String str) {
        LruCache<String, C7316IL> lruCache;
        if (!TextUtils.isEmpty(str) && (lruCache = this.f15817iR) != null && lruCache.size() > 0) {
            synchronized (this.eqN) {
                this.f15817iR.remove(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: IL */
    public Set<String> m89185IL(String str) {
        if (!TextUtils.isEmpty(str) && C7324bg.m89118bg().m89120IL() != null) {
            HashSet hashSet = new HashSet();
            Cursor mo85795bg = C7324bg.m89118bg().m89120IL().mo85795bg("template_diff_new", null, "rit=?", new String[]{str}, null, null, null);
            try {
                if (mo85795bg != null) {
                    try {
                        if (mo85795bg.moveToFirst()) {
                            do {
                                hashSet.add(mo85795bg.getString(mo85795bg.getColumnIndex("id")));
                            } while (mo85795bg.moveToNext());
                            return hashSet;
                        }
                    } catch (Exception e) {
                        Log.e("TmplDbHelper", "", e);
                    }
                }
            } finally {
                mo85795bg.close();
            }
        }
        return null;
    }

    /* renamed from: bX */
    void m89183bX(String str) {
        C7317bX c7317bX;
        try {
            if (this.f15818zx == null || this.f15818zx.isEmpty() || (c7317bX = this.f15818zx.get(str)) == null) {
                return;
            }
            if (!TextUtils.isEmpty(c7317bX.m89152bg()) && C7324bg.m89118bg().ldr() != null) {
                C7324bg.m89118bg().ldr();
            }
            this.f15818zx.remove(str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bg */
    public static C7310ldr m89182bg() {
        if (f15814IL == null) {
            synchronized (C7310ldr.class) {
                if (f15814IL == null) {
                    f15814IL = new C7310ldr();
                }
            }
        }
        return f15814IL;
    }

    /* renamed from: bX */
    public static String m89184bX() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)").toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public C7316IL m89179bg(String str) {
        C7316IL c7316il;
        C7316IL m89158bg;
        if (TextUtils.isEmpty(str) || C7324bg.m89118bg().m89120IL() == null) {
            return null;
        }
        synchronized (this.eqN) {
            c7316il = this.f15817iR.get(String.valueOf(str));
        }
        if (c7316il != null) {
            return c7316il;
        }
        Cursor mo85795bg = C7324bg.m89118bg().m89120IL().mo85795bg("template_diff_new", null, "id=?", new String[]{str}, null, null, null);
        if (mo85795bg != null) {
            try {
                if (mo85795bg.moveToFirst()) {
                    do {
                        String string = mo85795bg.getString(mo85795bg.getColumnIndex("rit"));
                        String string2 = mo85795bg.getString(mo85795bg.getColumnIndex("id"));
                        String string3 = mo85795bg.getString(mo85795bg.getColumnIndex("md5"));
                        String string4 = mo85795bg.getString(mo85795bg.getColumnIndex("url"));
                        String string5 = mo85795bg.getString(mo85795bg.getColumnIndex("data"));
                        m89158bg = new C7316IL().m89157bg(string).m89162IL(string2).m89160bX(string3).eqN(string4).m89154zx(string5).ldr(mo85795bg.getString(mo85795bg.getColumnIndex("version"))).m89158bg(Long.valueOf(mo85795bg.getLong(mo85795bg.getColumnIndex("update_time"))));
                        synchronized (this.eqN) {
                            this.f15817iR.put(string2, m89158bg);
                        }
                        this.f15816bX.add(string2);
                    } while (mo85795bg.moveToNext());
                    return m89158bg;
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: IL */
    public List<C7316IL> m89186IL() {
        if (C7324bg.m89118bg().m89120IL() == null) {
            return null;
        }
        boolean z = this.ldr.get();
        this.ldr.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor mo85795bg = C7324bg.m89118bg().m89120IL().mo85795bg("template_diff_new", null, null, null, null, null, null);
        if (mo85795bg != null) {
            while (mo85795bg.moveToNext()) {
                try {
                    String string = mo85795bg.getString(mo85795bg.getColumnIndex("rit"));
                    String string2 = mo85795bg.getString(mo85795bg.getColumnIndex("id"));
                    String string3 = mo85795bg.getString(mo85795bg.getColumnIndex("md5"));
                    String string4 = mo85795bg.getString(mo85795bg.getColumnIndex("url"));
                    String string5 = mo85795bg.getString(mo85795bg.getColumnIndex("data"));
                    String string6 = mo85795bg.getString(mo85795bg.getColumnIndex("version"));
                    arrayList.add(new C7316IL().m89157bg(string).m89162IL(string2).m89160bX(string3).eqN(string4).m89154zx(string5).ldr(string6).m89158bg(Long.valueOf(mo85795bg.getLong(mo85795bg.getColumnIndex("update_time")))));
                    synchronized (this.eqN) {
                        this.f15817iR.put(string2, arrayList.get(arrayList.size() - 1));
                    }
                    this.f15816bX.add(string2);
                    if (!z && C7324bg.m89118bg().ldr() != null) {
                        if (this.f15818zx == null) {
                            this.f15818zx = new ConcurrentHashMap<>();
                        }
                        if (string2 != null && !this.f15818zx.contains(string2)) {
                            this.f15818zx.put(string2, new C7317bX(string, string2, string3));
                        }
                    }
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void m89180bg(C7316IL c7316il, boolean z) {
        if (c7316il == null || C7324bg.m89118bg().m89120IL() == null || TextUtils.isEmpty(c7316il.m89163IL())) {
            return;
        }
        Cursor mo85795bg = C7324bg.m89118bg().m89120IL().mo85795bg("template_diff_new", null, "id=?", new String[]{c7316il.m89163IL()}, null, null, null);
        boolean z2 = mo85795bg != null && mo85795bg.getCount() > 0;
        if (mo85795bg != null) {
            try {
                r3 = mo85795bg.moveToFirst() ? mo85795bg.getString(mo85795bg.getColumnIndex("rit")) : null;
                mo85795bg.close();
            } catch (Throwable unused) {
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", c7316il.m89159bg());
        contentValues.put("id", c7316il.m89163IL());
        contentValues.put("md5", c7316il.m89161bX());
        contentValues.put("url", c7316il.eqN());
        contentValues.put("data", c7316il.m89155zx());
        contentValues.put("version", c7316il.ldr());
        contentValues.put("update_time", c7316il.m89156iR());
        if (z2) {
            C7324bg.m89118bg().m89120IL().mo85797bg("template_diff_new", contentValues, "id=?", new String[]{c7316il.m89163IL()});
        } else {
            C7324bg.m89118bg().m89120IL().mo85798bg("template_diff_new", contentValues);
        }
        synchronized (this.eqN) {
            this.f15817iR.put(c7316il.m89163IL(), c7316il);
        }
        this.f15816bX.add(c7316il.m89163IL());
        if (z) {
            return;
        }
        try {
            if (C7324bg.m89118bg().ldr() == null) {
                return;
            }
            if (this.f15818zx == null) {
                this.f15818zx = new ConcurrentHashMap<>();
            }
            C7317bX c7317bX = new C7317bX(c7316il.m89159bg(), c7316il.m89163IL(), c7316il.m89161bX());
            this.f15818zx.put(c7316il.m89163IL(), c7317bX);
            if (r3 != null) {
                C7324bg.m89118bg().ldr();
                c7317bX.m89153IL();
            }
            C7324bg.m89118bg().ldr();
            c7316il.m89159bg();
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public void m89178bg(Set<String> set) {
        if (set == null || set.isEmpty() || C7324bg.m89118bg().m89120IL() == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                eqN(strArr[i]);
                C7324bg.m89118bg().m89120IL().mo85796bg("template_diff_new", "id=?", new String[]{strArr[i]});
                m89183bX(strArr[i]);
            }
        }
    }
}
