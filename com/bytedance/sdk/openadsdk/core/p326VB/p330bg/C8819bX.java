package com.bytedance.sdk.openadsdk.core.p326VB.p330bg;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.multipro.aidl.C9329bX;
import com.bytedance.sdk.openadsdk.multipro.p353bg.C9347bg;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.sdk.openadsdk.core.VB.bg.bX */
/* loaded from: classes3.dex */
public class C8819bX {

    /* renamed from: IL */
    private static volatile C8819bX f19451IL = null;

    /* renamed from: bg */
    public static int f19452bg = 20;

    /* renamed from: bX */
    private final Object f19453bX = new Object();
    private final LruCache<String, C8821bg> eqN = new LruCache<String, C8821bg>(f19452bg) { // from class: com.bytedance.sdk.openadsdk.core.VB.bg.bX.1
        {
            C8819bX.this = this;
        }

        @Override // android.util.LruCache
        /* renamed from: bg */
        public int sizeOf(String str, C8821bg c8821bg) {
            return 1;
        }
    };

    private C8819bX() {
    }

    /* renamed from: bX */
    public static String m84857bX() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS ugen_template (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , rit TEXT , update_time TEXT)").toString();
    }

    /* renamed from: bg */
    public static C8819bX m84856bg() {
        if (f19451IL == null) {
            synchronized (C8819bX.class) {
                if (f19451IL == null) {
                    f19451IL = new C8819bX();
                }
            }
        }
        return f19451IL;
    }

    public static String eqN() {
        return "ALTER TABLE ugen_template ADD COLUMN rit TEXT ";
    }

    /* renamed from: IL */
    public List<C8821bg> m84859IL() {
        ArrayList arrayList = new ArrayList();
        C9329bX c9329bX = new C9329bX(C9347bg.m83025bg(C8838VzQ.m84740bg(), "ugen_template", null, null, null, null, null, null));
        try {
            if (c9329bX.moveToFirst()) {
                do {
                    int columnIndex = c9329bX.getColumnIndex("id");
                    int columnIndex2 = c9329bX.getColumnIndex("md5");
                    int columnIndex3 = c9329bX.getColumnIndex("url");
                    int columnIndex4 = c9329bX.getColumnIndex("data");
                    int columnIndex5 = c9329bX.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = c9329bX.getColumnIndex("rit");
                        String string = columnIndex6 != -1 ? c9329bX.getString(columnIndex6) : null;
                        String string2 = c9329bX.getString(columnIndex);
                        String string3 = c9329bX.getString(columnIndex2);
                        String string4 = c9329bX.getString(columnIndex3);
                        C8821bg m84844bg = new C8821bg().m84843bg(string2).m84849IL(string3).m84847bX(string4).eqN(c9329bX.getString(columnIndex4)).m84841zx(string).m84844bg(Long.valueOf(c9329bX.getLong(columnIndex5)));
                        arrayList.add(m84844bg);
                        synchronized (this.f19453bX) {
                            this.eqN.put(string2, m84844bg);
                        }
                    }
                } while (c9329bX.moveToNext());
            }
        } finally {
            try {
                return arrayList;
            } finally {
            }
        }
        return arrayList;
    }

    /* renamed from: bg */
    public C8821bg m84853bg(String str, String str2) {
        C8821bg c8821bg;
        C8821bg m84844bg;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f19453bX) {
            c8821bg = this.eqN.get(str);
        }
        if (c8821bg != null) {
            if (TextUtils.equals(str2, c8821bg.m84850IL())) {
                return c8821bg;
            }
            m84858IL(str2);
            return null;
        }
        C9329bX c9329bX = new C9329bX(C9347bg.m83025bg(C8838VzQ.m84740bg(), "ugen_template", null, "id=? AND md5=?", new String[]{str, str2}, null, null, null));
        try {
            if (c9329bX.moveToFirst()) {
                do {
                    int columnIndex = c9329bX.getColumnIndex("id");
                    int columnIndex2 = c9329bX.getColumnIndex("md5");
                    int columnIndex3 = c9329bX.getColumnIndex("url");
                    int columnIndex4 = c9329bX.getColumnIndex("data");
                    int columnIndex5 = c9329bX.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = c9329bX.getColumnIndex("rit");
                        String string = c9329bX.getString(columnIndex);
                        String string2 = c9329bX.getString(columnIndex2);
                        String string3 = c9329bX.getString(columnIndex3);
                        String string4 = c9329bX.getString(columnIndex4);
                        if (TextUtils.isEmpty(string4)) {
                            return null;
                        }
                        m84844bg = new C8821bg().m84843bg(string).m84849IL(string2).eqN(string4).m84847bX(string3).m84841zx(columnIndex6 != -1 ? c9329bX.getString(columnIndex6) : null).m84844bg(Long.valueOf(c9329bX.getLong(columnIndex5)));
                        synchronized (this.f19453bX) {
                            this.eqN.put(string, m84844bg);
                        }
                    }
                    return null;
                } while (c9329bX.moveToNext());
                return m84844bg;
            }
        } finally {
            try {
                return null;
            } finally {
            }
        }
        return null;
    }

    /* renamed from: IL */
    private void m84858IL(String str) {
        if (!TextUtils.isEmpty(str) && this.eqN.size() > 0) {
            synchronized (this.f19453bX) {
                this.eqN.remove(str);
            }
        }
    }

    /* renamed from: bg */
    public void m84855bg(C8821bg c8821bg) {
        if (c8821bg == null || TextUtils.isEmpty(c8821bg.m84846bg())) {
            return;
        }
        C9329bX c9329bX = new C9329bX(C9347bg.m83025bg(C8838VzQ.m84740bg(), "ugen_template", null, "id=?", new String[]{c8821bg.m84846bg()}, null, null, null));
        boolean z = c9329bX.getCount() > 0;
        try {
            c9329bX.close();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", c8821bg.m84846bg());
            contentValues.put("md5", c8821bg.m84850IL());
            contentValues.put("url", c8821bg.m84848bX());
            contentValues.put("data", c8821bg.m84842zx());
            contentValues.put("rit", c8821bg.ldr());
            contentValues.put("update_time", c8821bg.eqN());
            if (z) {
                C9347bg.m83027bg(C8838VzQ.m84740bg(), "ugen_template", contentValues, "id=?", new String[]{c8821bg.m84846bg()});
            } else {
                C9347bg.m83028bg(C8838VzQ.m84740bg(), "ugen_template", contentValues);
            }
            synchronized (this.f19453bX) {
                this.eqN.put(c8821bg.m84846bg(), c8821bg);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bg */
    public Set<C8821bg> m84854bg(String str) {
        C8821bg c8821bg;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        C9329bX c9329bX = new C9329bX(C9347bg.m83025bg(C8838VzQ.m84740bg(), "ugen_template", null, "rit=?", new String[]{str}, null, null, null));
        try {
            if (c9329bX.moveToFirst()) {
                do {
                    int columnIndex = c9329bX.getColumnIndex("id");
                    if (columnIndex != -1) {
                        String string = c9329bX.getString(columnIndex);
                        if (!TextUtils.isEmpty(string)) {
                            synchronized (this.f19453bX) {
                                c8821bg = this.eqN.get(string);
                            }
                            if (c8821bg != null) {
                                hashSet.add(c8821bg);
                            } else {
                                C8821bg c8821bg2 = new C8821bg();
                                int columnIndex2 = c9329bX.getColumnIndex("data");
                                if (columnIndex2 != -1) {
                                    String string2 = c9329bX.getString(columnIndex2);
                                    if (!TextUtils.isEmpty(string2)) {
                                        c8821bg2.eqN(string2);
                                        c8821bg2.m84843bg(string);
                                        c8821bg2.m84841zx(str);
                                        int columnIndex3 = c9329bX.getColumnIndex("md5");
                                        int columnIndex4 = c9329bX.getColumnIndex("url");
                                        int columnIndex5 = c9329bX.getColumnIndex("update_time");
                                        if (columnIndex3 != -1) {
                                            c8821bg2.m84849IL(c9329bX.getString(columnIndex3));
                                        }
                                        if (columnIndex4 != -1) {
                                            c8821bg2.m84847bX(c9329bX.getString(columnIndex4));
                                        }
                                        if (columnIndex5 != -1) {
                                            c8821bg2.m84844bg(Long.valueOf(c9329bX.getLong(columnIndex5)));
                                        }
                                        hashSet.add(c8821bg2);
                                        synchronized (this.f19453bX) {
                                            this.eqN.put(string, c8821bg2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (c9329bX.moveToNext());
            }
        } finally {
            try {
                return hashSet;
            } finally {
            }
        }
        return hashSet;
    }

    /* renamed from: bg */
    public void m84852bg(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (String str : strArr) {
                m84858IL(str);
                C9347bg.m83026bg(C8838VzQ.m84740bg(), "ugen_template", "id=?", new String[]{str});
            }
        }
    }
}
