package com.google.android.exoplayer2.upstream.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.WorkerThread;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.database.VersionTable;
import com.google.android.exoplayer2.util.Assertions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
final class CacheFileMetadataIndex {

    /* renamed from: c */
    private static final String[] f35968c = {"name", "length", "last_touch_timestamp"};

    /* renamed from: a */
    private final DatabaseProvider f35969a;

    /* renamed from: b */
    private String f35970b;

    public CacheFileMetadataIndex(DatabaseProvider databaseProvider) {
        this.f35969a = databaseProvider;
    }

    /* renamed from: a */
    private static void m72733a(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    /* renamed from: b */
    private Cursor m72732b() {
        Assertions.checkNotNull(this.f35970b);
        return this.f35969a.getReadableDatabase().query(this.f35970b, f35968c, null, null, null, null, null);
    }

    /* renamed from: c */
    private static String m72731c(String str) {
        return "ExoPlayerCacheFileMetadata" + str;
    }

    @WorkerThread
    public static void delete(DatabaseProvider databaseProvider, long j) throws DatabaseIOException {
        String hexString = Long.toHexString(j);
        try {
            String m72731c = m72731c(hexString);
            SQLiteDatabase writableDatabase = databaseProvider.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            VersionTable.removeVersion(writableDatabase, 2, hexString);
            m72733a(writableDatabase, m72731c);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @WorkerThread
    public Map<String, CacheFileMetadata> getAll() throws DatabaseIOException {
        try {
            Cursor m72732b = m72732b();
            HashMap hashMap = new HashMap(m72732b.getCount());
            while (m72732b.moveToNext()) {
                hashMap.put((String) Assertions.checkNotNull(m72732b.getString(0)), new CacheFileMetadata(m72732b.getLong(1), m72732b.getLong(2)));
            }
            m72732b.close();
            return hashMap;
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @WorkerThread
    public void initialize(long j) throws DatabaseIOException {
        try {
            String hexString = Long.toHexString(j);
            this.f35970b = m72731c(hexString);
            if (VersionTable.getVersion(this.f35969a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f35969a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                VersionTable.setVersion(writableDatabase, 2, hexString, 1);
                m72733a(writableDatabase, this.f35970b);
                writableDatabase.execSQL("CREATE TABLE " + this.f35970b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @WorkerThread
    public void remove(String str) throws DatabaseIOException {
        Assertions.checkNotNull(this.f35970b);
        try {
            this.f35969a.getWritableDatabase().delete(this.f35970b, "name = ?", new String[]{str});
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @WorkerThread
    public void removeAll(Set<String> set) throws DatabaseIOException {
        Assertions.checkNotNull(this.f35970b);
        try {
            SQLiteDatabase writableDatabase = this.f35969a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                writableDatabase.delete(this.f35970b, "name = ?", new String[]{it.next()});
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @WorkerThread
    public void set(String str, long j, long j2) throws DatabaseIOException {
        Assertions.checkNotNull(this.f35970b);
        try {
            SQLiteDatabase writableDatabase = this.f35969a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.f35970b, null, contentValues);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }
}
