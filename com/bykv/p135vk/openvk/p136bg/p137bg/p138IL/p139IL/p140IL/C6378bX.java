package com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p139IL.p140IL;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.sdk.component.p233Kg.ThreadFactoryC7228WR;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX */
/* loaded from: classes3.dex */
public class C6378bX {

    /* renamed from: IL */
    private static volatile C6378bX f13298IL;

    /* renamed from: bX */
    private final C6382eqN f13299bX;

    /* renamed from: bg */
    private final SparseArray<Map<String, C6381bg>> f13300bg;
    private final Executor eqN;

    /* renamed from: zx */
    private volatile SQLiteStatement f13301zx;

    private C6378bX(Context context) {
        SparseArray<Map<String, C6381bg>> sparseArray = new SparseArray<>(2);
        this.f13300bg = sparseArray;
        this.eqN = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC7228WR(5, "video_proxy_db"));
        this.f13299bX = new C6382eqN(context.getApplicationContext());
        sparseArray.put(0, new ConcurrentHashMap());
        sparseArray.put(1, new ConcurrentHashMap());
    }

    /* renamed from: IL */
    private String m92088IL(int i) {
        if (i <= 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(i << 1);
        sb2.append("?");
        for (int i2 = 1; i2 < i; i2++) {
            sb2.append(",?");
        }
        return sb2.toString();
    }

    /* renamed from: bg */
    public static C6378bX m92085bg(Context context) {
        if (f13298IL == null) {
            synchronized (C6378bX.class) {
                if (f13298IL == null) {
                    f13298IL = new C6378bX(context);
                }
            }
        }
        return f13298IL;
    }

    /* renamed from: bg */
    public C6381bg m92081bg(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, C6381bg> map = this.f13300bg.get(i);
        C6381bg c6381bg = map == null ? null : map.get(str);
        if (c6381bg != null) {
            return c6381bg;
        }
        try {
            Cursor query = this.f13299bX.getReadableDatabase().query("video_http_header_t", null, "key=? AND flag=?", new String[]{str, String.valueOf(i)}, null, null, null, "1");
            if (query != null) {
                if (query.getCount() > 0 && query.moveToNext()) {
                    c6381bg = new C6381bg(query.getString(query.getColumnIndex("key")), query.getString(query.getColumnIndex("mime")), query.getInt(query.getColumnIndex("contentLength")), i, query.getString(query.getColumnIndex("extra")));
                }
                query.close();
            }
            if (c6381bg != null && map != null) {
                map.put(str, c6381bg);
            }
            return c6381bg;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: bg */
    public void m92082bg(final C6381bg c6381bg) {
        if (c6381bg != null) {
            Map<String, C6381bg> map = this.f13300bg.get(c6381bg.eqN);
            if (map != null) {
                map.put(c6381bg.f13308bg, c6381bg);
            }
            this.eqN.execute(new Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (C6378bX.this.f13301zx == null) {
                            C6378bX c6378bX = C6378bX.this;
                            c6378bX.f13301zx = c6378bX.f13299bX.getWritableDatabase().compileStatement("INSERT INTO video_http_header_t (key,mime,contentLength,flag,extra) VALUES(?,?,?,?,?)");
                        } else {
                            C6378bX.this.f13301zx.clearBindings();
                        }
                        C6378bX.this.f13301zx.bindString(1, c6381bg.f13308bg);
                        C6378bX.this.f13301zx.bindString(2, c6381bg.f13306IL);
                        C6378bX.this.f13301zx.bindLong(3, c6381bg.f13307bX);
                        C6378bX.this.f13301zx.bindLong(4, c6381bg.eqN);
                        C6378bX.this.f13301zx.bindString(5, c6381bg.f13309zx);
                        C6378bX.this.f13301zx.executeInsert();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    /* renamed from: bg */
    public void m92080bg(Collection<String> collection, int i) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        int size = collection.size() + 1;
        String[] strArr = new String[size];
        Map<String, C6381bg> map = this.f13300bg.get(i);
        int i2 = -1;
        for (String str : collection) {
            if (map != null) {
                map.remove(str);
            }
            i2++;
            strArr[i2] = str;
        }
        strArr[i2 + 1] = String.valueOf(i);
        try {
            SQLiteDatabase writableDatabase = this.f13299bX.getWritableDatabase();
            writableDatabase.delete("video_http_header_t", "key IN(" + m92088IL(size) + ") AND flag=?", strArr);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: bg */
    public void m92086bg(final int i) {
        Map<String, C6381bg> map = this.f13300bg.get(i);
        if (map != null) {
            map.clear();
        }
        this.eqN.execute(new Runnable() { // from class: com.bykv.vk.openvk.bg.bg.IL.IL.IL.bX.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    C6378bX.this.f13299bX.getWritableDatabase().delete("video_http_header_t", "flag=?", new String[]{String.valueOf(i)});
                } catch (Throwable unused) {
                }
            }
        });
    }
}
