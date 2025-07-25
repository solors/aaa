package com.monetization.ads.exo.offline;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.monetization.ads.exo.offline.DownloadRequest;
import com.yandex.mobile.ads.impl.C31064ou;
import com.yandex.mobile.ads.impl.InterfaceC31154pu;
import com.yandex.mobile.ads.impl.a20;
import com.yandex.mobile.ads.impl.b20;
import com.yandex.mobile.ads.impl.cf2;
import com.yandex.mobile.ads.impl.nx1;
import com.yandex.mobile.ads.impl.w52;
import com.yandex.mobile.ads.impl.y32;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.monetization.ads.exo.offline.a */
/* loaded from: classes7.dex */
public final class C25572a implements cf2 {

    /* renamed from: e */
    private static final String f66368e;

    /* renamed from: f */
    private static final String[] f66369f;

    /* renamed from: b */
    private final InterfaceC31154pu f66371b;
    @GuardedBy("initializationLock")

    /* renamed from: d */
    private boolean f66373d;

    /* renamed from: a */
    private final String f66370a = "ExoPlayerDownloads";

    /* renamed from: c */
    private final Object f66372c = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.monetization.ads.exo.offline.a$a */
    /* loaded from: classes7.dex */
    public static final class C25573a implements a20 {

        /* renamed from: b */
        private final Cursor f66374b;

        /* renamed from: a */
        public final C25574b m44337a() {
            return C25572a.m44350a(this.f66374b);
        }

        /* renamed from: b */
        public final int m44335b() {
            return this.f66374b.getPosition();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f66374b.close();
        }

        private C25573a(Cursor cursor) {
            this.f66374b = cursor;
        }

        /* renamed from: a */
        public final boolean m44336a(int i) {
            return this.f66374b.moveToPosition(i);
        }
    }

    static {
        int[] iArr = {3, 4};
        StringBuilder sb2 = new StringBuilder("state IN (");
        for (int i = 0; i < 2; i++) {
            if (i > 0) {
                sb2.append(',');
            }
            sb2.append(iArr[i]);
        }
        sb2.append(')');
        f66368e = sb2.toString();
        f66369f = new String[]{"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    }

    public C25572a(nx1 nx1Var, int i) {
        this.f66371b = nx1Var;
    }

    /* renamed from: a */
    public final a20 m44344a(int... iArr) throws C31064ou {
        String sb2;
        m44353a();
        if (iArr.length == 0) {
            sb2 = "1";
        } else {
            StringBuilder sb3 = new StringBuilder("state IN (");
            for (int i = 0; i < iArr.length; i++) {
                if (i > 0) {
                    sb3.append(',');
                }
                sb3.append(iArr[i]);
            }
            sb3.append(')');
            sb2 = sb3.toString();
        }
        return new C25573a(m44345a(sb2, (String[]) null));
    }

    @Nullable
    /* renamed from: b */
    public final C25574b m44341b(String str) throws C31064ou {
        m44353a();
        try {
            Cursor m44345a = m44345a("id = ?", new String[]{str});
            if (m44345a.getCount() == 0) {
                m44345a.close();
                return null;
            }
            m44345a.moveToNext();
            C25574b m44350a = m44350a(m44345a);
            m44345a.close();
            return m44350a;
        } catch (SQLiteException e) {
            throw new C31064ou(e);
        }
    }

    /* renamed from: c */
    public final void m44338c(String str) throws C31064ou {
        m44353a();
        try {
            this.f66371b.getWritableDatabase().delete(this.f66370a, "id = ?", new String[]{str});
        } catch (Throwable th) {
            throw new C31064ou(th);
        }
    }

    /* renamed from: c */
    public final void m44340c() throws C31064ou {
        m44353a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.f66371b.getWritableDatabase().update(this.f66370a, contentValues, null, null);
        } catch (Throwable th) {
            throw new C31064ou(th);
        }
    }

    /* renamed from: a */
    public final void m44348a(C25574b c25574b) throws C31064ou {
        m44353a();
        try {
            m44347a(c25574b, this.f66371b.getWritableDatabase());
        } catch (Throwable th) {
            throw new C31064ou(th);
        }
    }

    /* renamed from: b */
    public final void m44343b() throws C31064ou {
        m44353a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.f66371b.getWritableDatabase().update(this.f66370a, contentValues, "state = 2", null);
        } catch (Throwable th) {
            throw new C31064ou(th);
        }
    }

    /* renamed from: a */
    public final void m44352a(int i) throws C31064ou {
        m44353a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            this.f66371b.getWritableDatabase().update(this.f66370a, contentValues, f66368e, null);
        } catch (Throwable th) {
            throw new C31064ou(th);
        }
    }

    /* renamed from: b */
    private static C25574b m44342b(Cursor cursor) {
        String str;
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        DownloadRequest.C25570b c25570b = new DownloadRequest.C25570b(Uri.parse(string2), string);
        String string3 = cursor.getString(1);
        if ("dash".equals(string3)) {
            str = "application/dash+xml";
        } else if ("hls".equals(string3)) {
            str = "application/x-mpegURL";
        } else {
            str = "ss".equals(string3) ? "application/vnd.ms-sstr+xml" : "video/x-unknown";
        }
        DownloadRequest m44359a = c25570b.m44355b(str).m44357a(m44346a(cursor.getString(3))).m44358a(cursor.getString(4)).m44356a(cursor.getBlob(5)).m44359a();
        b20 b20Var = new b20();
        b20Var.f77052a = cursor.getLong(13);
        b20Var.f77053b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new C25574b(m44359a, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, b20Var);
    }

    /* renamed from: a */
    public final void m44351a(int i, String str) throws C31064ou {
        m44353a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i));
            SQLiteDatabase writableDatabase = this.f66371b.getWritableDatabase();
            String str2 = this.f66370a;
            writableDatabase.update(str2, contentValues, f66368e + " AND id = ?", new String[]{str});
        } catch (Throwable th) {
            throw new C31064ou(th);
        }
    }

    /* renamed from: a */
    private void m44353a() throws C31064ou {
        ArrayList<C25574b> arrayList;
        synchronized (this.f66372c) {
            if (this.f66373d) {
                return;
            }
            int m28026a = w52.m28026a(this.f66371b.getReadableDatabase(), 0, "");
            if (m28026a != 3) {
                SQLiteDatabase writableDatabase = this.f66371b.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                w52.m28025a(writableDatabase, 0, "", 3);
                if (m28026a == 2) {
                    arrayList = m44349a(writableDatabase);
                } else {
                    arrayList = new ArrayList();
                }
                writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f66370a);
                writableDatabase.execSQL("CREATE TABLE " + this.f66370a + " (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                for (C25574b c25574b : arrayList) {
                    m44347a(c25574b, writableDatabase);
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
            this.f66373d = true;
        }
    }

    /* renamed from: a */
    private void m44347a(C25574b c25574b, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = c25574b.f66375a.f66355f;
        if (bArr == null) {
            bArr = y32.f88015f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", c25574b.f66375a.f66351b);
        contentValues.put("mime_type", c25574b.f66375a.f66353d);
        contentValues.put("uri", c25574b.f66375a.f66352c.toString());
        List<StreamKey> list = c25574b.f66375a.f66354e;
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            StreamKey streamKey = list.get(i);
            sb2.append(streamKey.f66365b);
            sb2.append('.');
            sb2.append(streamKey.f66366c);
            sb2.append('.');
            sb2.append(streamKey.f66367d);
            sb2.append(',');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        contentValues.put("stream_keys", sb2.toString());
        contentValues.put("custom_cache_key", c25574b.f66375a.f66356g);
        contentValues.put("data", c25574b.f66375a.f66357h);
        contentValues.put("state", Integer.valueOf(c25574b.f66376b));
        contentValues.put("start_time_ms", Long.valueOf(c25574b.f66377c));
        contentValues.put("update_time_ms", Long.valueOf(c25574b.f66378d));
        contentValues.put("content_length", Long.valueOf(c25574b.f66379e));
        contentValues.put("stop_reason", Integer.valueOf(c25574b.f66380f));
        contentValues.put("failure_reason", Integer.valueOf(c25574b.f66381g));
        contentValues.put("percent_downloaded", Float.valueOf(c25574b.f66382h.f77053b));
        contentValues.put("bytes_downloaded", Long.valueOf(c25574b.f66382h.f77052a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow(this.f66370a, null, contentValues);
    }

    /* renamed from: a */
    private ArrayList m44349a(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (y32.m27086a(sQLiteDatabase, this.f66370a)) {
            Cursor query = sQLiteDatabase.query(this.f66370a, new String[]{"id", "title", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    arrayList.add(m44342b(query));
                } catch (Throwable th) {
                    if (query != null) {
                        try {
                            query.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            query.close();
            return arrayList;
        }
        return arrayList;
    }

    /* renamed from: a */
    private Cursor m44345a(String str, @Nullable String[] strArr) throws C31064ou {
        try {
            return this.f66371b.getReadableDatabase().query(this.f66370a, f66369f, str, strArr, null, null, "start_time_ms ASC");
        } catch (Throwable th) {
            throw new C31064ou(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static C25574b m44350a(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        DownloadRequest.C25570b m44357a = new DownloadRequest.C25570b(Uri.parse(string2), string).m44355b(cursor.getString(1)).m44357a(m44346a(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        DownloadRequest m44359a = m44357a.m44354b(blob).m44358a(cursor.getString(4)).m44356a(cursor.getBlob(5)).m44359a();
        b20 b20Var = new b20();
        b20Var.f77052a = cursor.getLong(13);
        b20Var.f77053b = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new C25574b(m44359a, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, b20Var);
    }

    /* renamed from: a */
    private static ArrayList m44346a(@Nullable String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        int i = y32.f88010a;
        for (String str2 : str.split(",", -1)) {
            String[] split = str2.split("\\.", -1);
            if (split.length == 3) {
                arrayList.add(new StreamKey(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2])));
            } else {
                throw new IllegalStateException();
            }
        }
        return arrayList;
    }
}
