package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public final class SchemaManager extends SQLiteOpenHelper {

    /* renamed from: d */
    private static final String f31275d = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: f */
    static int f31276f = 5;

    /* renamed from: g */
    private static final Migration f31277g;

    /* renamed from: h */
    private static final Migration f31278h;

    /* renamed from: i */
    private static final Migration f31279i;

    /* renamed from: j */
    private static final Migration f31280j;

    /* renamed from: k */
    private static final Migration f31281k;

    /* renamed from: l */
    private static final List<Migration> f31282l;

    /* renamed from: b */
    private final int f31283b;

    /* renamed from: c */
    private boolean f31284c;

    /* loaded from: classes4.dex */
    public interface Migration {
        void upgrade(SQLiteDatabase sQLiteDatabase);
    }

    static {
        Migration migration = new Migration() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.c0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                SchemaManager.m76144f(sQLiteDatabase);
            }
        };
        f31277g = migration;
        Migration migration2 = new Migration() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.d0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                SchemaManager.m76147a(sQLiteDatabase);
            }
        };
        f31278h = migration2;
        Migration migration3 = new Migration() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.e0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                SchemaManager.m76146b(sQLiteDatabase);
            }
        };
        f31279i = migration3;
        Migration migration4 = new Migration() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.f0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                SchemaManager.m76145e(sQLiteDatabase);
            }
        };
        f31280j = migration4;
        Migration migration5 = new Migration() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.g0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration
            public final void upgrade(SQLiteDatabase sQLiteDatabase) {
                SchemaManager.m76143h(sQLiteDatabase);
            }
        };
        f31281k = migration5;
        f31282l = Arrays.asList(migration, migration2, migration3, migration4, migration5);
    }

    public SchemaManager(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f31284c = false;
        this.f31283b = i;
    }

    /* renamed from: a */
    public static /* synthetic */ void m76147a(SQLiteDatabase sQLiteDatabase) {
        m76140l(sQLiteDatabase);
    }

    /* renamed from: b */
    public static /* synthetic */ void m76146b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }

    /* renamed from: e */
    public static /* synthetic */ void m76145e(SQLiteDatabase sQLiteDatabase) {
        m76138n(sQLiteDatabase);
    }

    /* renamed from: f */
    public static /* synthetic */ void m76144f(SQLiteDatabase sQLiteDatabase) {
        m76141k(sQLiteDatabase);
    }

    /* renamed from: h */
    public static /* synthetic */ void m76143h(SQLiteDatabase sQLiteDatabase) {
        m76137r(sQLiteDatabase);
    }

    /* renamed from: i */
    private void m76142i(SQLiteDatabase sQLiteDatabase) {
        if (!this.f31284c) {
            onConfigure(sQLiteDatabase);
        }
    }

    /* renamed from: k */
    public static /* synthetic */ void m76141k(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    /* renamed from: l */
    public static /* synthetic */ void m76140l(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* renamed from: n */
    public static /* synthetic */ void m76138n(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* renamed from: r */
    public static /* synthetic */ void m76137r(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f31275d);
    }

    /* renamed from: s */
    private void m76136s(SQLiteDatabase sQLiteDatabase, int i) {
        m76142i(sQLiteDatabase);
        m76135t(sQLiteDatabase, 0, i);
    }

    /* renamed from: t */
    private void m76135t(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<Migration> list = f31282l;
        if (i2 <= list.size()) {
            while (i < i2) {
                f31282l.get(i).upgrade(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f31284c = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m76136s(sQLiteDatabase, this.f31283b);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m76136s(sQLiteDatabase, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m76142i(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m76142i(sQLiteDatabase);
        m76135t(sQLiteDatabase, i, i2);
    }
}
