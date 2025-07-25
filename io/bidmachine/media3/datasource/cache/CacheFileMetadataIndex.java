package io.bidmachine.media3.datasource.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.WorkerThread;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.database.DatabaseIOException;
import io.bidmachine.media3.database.DatabaseProvider;
import io.bidmachine.media3.database.VersionTable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: io.bidmachine.media3.datasource.cache.b */
/* loaded from: classes9.dex */
final class CacheFileMetadataIndex {
    private static final int COLUMN_INDEX_LAST_TOUCH_TIMESTAMP = 2;
    private static final int COLUMN_INDEX_LENGTH = 1;
    private static final int COLUMN_INDEX_NAME = 0;
    private static final String COLUMN_NAME = "name";
    private static final String TABLE_PREFIX = "ExoPlayerCacheFileMetadata";
    private static final String TABLE_SCHEMA = "(name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)";
    private static final int TABLE_VERSION = 1;
    private static final String WHERE_NAME_EQUALS = "name = ?";
    private final DatabaseProvider databaseProvider;
    private String tableName;
    private static final String COLUMN_LENGTH = "length";
    private static final String COLUMN_LAST_TOUCH_TIMESTAMP = "last_touch_timestamp";
    private static final String[] COLUMNS = {"name", COLUMN_LENGTH, COLUMN_LAST_TOUCH_TIMESTAMP};

    public CacheFileMetadataIndex(DatabaseProvider databaseProvider) {
        this.databaseProvider = databaseProvider;
    }

    @WorkerThread
    public static void delete(DatabaseProvider databaseProvider, long j) throws DatabaseIOException {
        String hexString = Long.toHexString(j);
        try {
            String tableName = getTableName(hexString);
            SQLiteDatabase writableDatabase = databaseProvider.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            VersionTable.removeVersion(writableDatabase, 2, hexString);
            dropTable(writableDatabase, tableName);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    private static void dropTable(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    private Cursor getCursor() {
        Assertions.checkNotNull(this.tableName);
        return this.databaseProvider.getReadableDatabase().query(this.tableName, COLUMNS, null, null, null, null, null);
    }

    private static String getTableName(String str) {
        return TABLE_PREFIX + str;
    }

    @WorkerThread
    public Map<String, CacheFileMetadata> getAll() throws DatabaseIOException {
        try {
            Cursor cursor = getCursor();
            HashMap hashMap = new HashMap(cursor.getCount());
            while (cursor.moveToNext()) {
                hashMap.put((String) Assertions.checkNotNull(cursor.getString(0)), new CacheFileMetadata(cursor.getLong(1), cursor.getLong(2)));
            }
            cursor.close();
            return hashMap;
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @WorkerThread
    public void initialize(long j) throws DatabaseIOException {
        try {
            String hexString = Long.toHexString(j);
            this.tableName = getTableName(hexString);
            if (VersionTable.getVersion(this.databaseProvider.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                VersionTable.setVersion(writableDatabase, 2, hexString, 1);
                dropTable(writableDatabase, this.tableName);
                writableDatabase.execSQL("CREATE TABLE " + this.tableName + " " + TABLE_SCHEMA);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @WorkerThread
    public void remove(String str) throws DatabaseIOException {
        Assertions.checkNotNull(this.tableName);
        try {
            this.databaseProvider.getWritableDatabase().delete(this.tableName, WHERE_NAME_EQUALS, new String[]{str});
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @WorkerThread
    public void removeAll(Set<String> set) throws DatabaseIOException {
        Assertions.checkNotNull(this.tableName);
        try {
            SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                writableDatabase.delete(this.tableName, WHERE_NAME_EQUALS, new String[]{it.next()});
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    @WorkerThread
    public void set(String str, long j, long j2) throws DatabaseIOException {
        Assertions.checkNotNull(this.tableName);
        try {
            SQLiteDatabase writableDatabase = this.databaseProvider.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put(COLUMN_LENGTH, Long.valueOf(j));
            contentValues.put(COLUMN_LAST_TOUCH_TIMESTAMP, Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.tableName, null, contentValues);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }
}
