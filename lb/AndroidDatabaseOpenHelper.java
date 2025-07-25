package lb;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lb.DatabaseOpenHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sa.C39638b;

@Metadata
/* renamed from: lb.a */
/* loaded from: classes8.dex */
public class AndroidDatabaseOpenHelper implements DatabaseOpenHelper {
    @NotNull

    /* renamed from: a */
    private final SQLiteOpenHelper f100854a;
    @NotNull

    /* renamed from: b */
    private final C38133c f100855b;
    @NotNull

    /* renamed from: c */
    private final Object f100856c;
    @NotNull

    /* renamed from: d */
    private final Map<SQLiteDatabase, C38134d> f100857d;

    /* compiled from: AndroidDatabaseOpenHelper.kt */
    @Metadata
    /* renamed from: lb.a$a */
    /* loaded from: classes8.dex */
    public static final class C38131a extends SQLiteOpenHelper {

        /* renamed from: b */
        final /* synthetic */ DatabaseOpenHelper.InterfaceC38136a f100858b;

        /* renamed from: c */
        final /* synthetic */ AndroidDatabaseOpenHelper f100859c;

        /* renamed from: d */
        final /* synthetic */ DatabaseOpenHelper.InterfaceC38138c f100860d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C38131a(Context context, String str, int i, DatabaseOpenHelper.InterfaceC38136a interfaceC38136a, AndroidDatabaseOpenHelper androidDatabaseOpenHelper, DatabaseOpenHelper.InterfaceC38138c interfaceC38138c) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i);
            this.f100858b = interfaceC38136a;
            this.f100859c = androidDatabaseOpenHelper;
            this.f100860d = interfaceC38138c;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(@NotNull SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            db.setForeignKeyConstraintsEnabled(true);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(@NotNull SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            this.f100858b.mo15575a(this.f100859c.m15583c(sqLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(@NotNull SQLiteDatabase sqLiteDatabase, int i, int i2) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            this.f100860d.mo15574a(this.f100859c.m15583c(sqLiteDatabase), i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidDatabaseOpenHelper.kt */
    @Metadata
    /* renamed from: lb.a$b */
    /* loaded from: classes8.dex */
    public final class C38132b implements DatabaseOpenHelper.InterfaceC38137b {
        @NotNull

        /* renamed from: b */
        private final SQLiteDatabase f100861b;
        @NotNull

        /* renamed from: c */
        private final C38134d f100862c;

        /* renamed from: d */
        final /* synthetic */ AndroidDatabaseOpenHelper f100863d;

        public C38132b(@NotNull AndroidDatabaseOpenHelper androidDatabaseOpenHelper, @NotNull SQLiteDatabase mDb, C38134d mOpenCloseInfo) {
            Intrinsics.checkNotNullParameter(mDb, "mDb");
            Intrinsics.checkNotNullParameter(mOpenCloseInfo, "mOpenCloseInfo");
            this.f100863d = androidDatabaseOpenHelper;
            this.f100861b = mDb;
            this.f100862c = mOpenCloseInfo;
        }

        @Override // lb.DatabaseOpenHelper.InterfaceC38137b
        public void beginTransaction() {
            this.f100861b.beginTransaction();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f100863d.f100855b.m15582a(this.f100861b);
        }

        @Override // lb.DatabaseOpenHelper.InterfaceC38137b
        @NotNull
        public SQLiteStatement compileStatement(@NotNull String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            SQLiteStatement compileStatement = this.f100861b.compileStatement(sql);
            Intrinsics.checkNotNullExpressionValue(compileStatement, "mDb.compileStatement(sql)");
            return compileStatement;
        }

        @Override // lb.DatabaseOpenHelper.InterfaceC38137b
        public void endTransaction() {
            this.f100861b.endTransaction();
        }

        @Override // lb.DatabaseOpenHelper.InterfaceC38137b
        public void execSQL(@NotNull String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.f100861b.execSQL(sql);
        }

        @Override // lb.DatabaseOpenHelper.InterfaceC38137b
        @NotNull
        public Cursor rawQuery(@NotNull String query, @Nullable String[] strArr) {
            Intrinsics.checkNotNullParameter(query, "query");
            Cursor rawQuery = this.f100861b.rawQuery(query, strArr);
            Intrinsics.checkNotNullExpressionValue(rawQuery, "mDb.rawQuery(query, selectionArgs)");
            return rawQuery;
        }

        @Override // lb.DatabaseOpenHelper.InterfaceC38137b
        public void setTransactionSuccessful() {
            this.f100861b.setTransactionSuccessful();
        }
    }

    /* compiled from: AndroidDatabaseOpenHelper.kt */
    @Metadata
    /* renamed from: lb.a$c */
    /* loaded from: classes8.dex */
    private static final class C38133c {
        @NotNull

        /* renamed from: a */
        private final SQLiteOpenHelper f100864a;
        @NotNull

        /* renamed from: b */
        private final Set<Thread> f100865b;

        /* renamed from: c */
        private int f100866c;
        @Nullable

        /* renamed from: d */
        private SQLiteDatabase f100867d;
        @NotNull

        /* renamed from: e */
        private final Set<Thread> f100868e;

        /* renamed from: f */
        private int f100869f;
        @Nullable

        /* renamed from: g */
        private SQLiteDatabase f100870g;

        public C38133c(@NotNull SQLiteOpenHelper databaseHelper) {
            Intrinsics.checkNotNullParameter(databaseHelper, "databaseHelper");
            this.f100864a = databaseHelper;
            this.f100865b = new LinkedHashSet();
            this.f100868e = new LinkedHashSet();
        }

        /* renamed from: a */
        public final synchronized void m15582a(@NotNull SQLiteDatabase mDb) {
            Intrinsics.checkNotNullParameter(mDb, "mDb");
            if (Intrinsics.m17075f(mDb, this.f100870g)) {
                this.f100868e.remove(Thread.currentThread());
                if (this.f100868e.isEmpty()) {
                    while (true) {
                        int i = this.f100869f;
                        this.f100869f = i - 1;
                        if (i <= 0) {
                            break;
                        }
                        SQLiteDatabase sQLiteDatabase = this.f100870g;
                        Intrinsics.m17074g(sQLiteDatabase);
                        sQLiteDatabase.close();
                    }
                }
            } else if (Intrinsics.m17075f(mDb, this.f100867d)) {
                this.f100865b.remove(Thread.currentThread());
                if (this.f100865b.isEmpty()) {
                    while (true) {
                        int i2 = this.f100866c;
                        this.f100866c = i2 - 1;
                        if (i2 <= 0) {
                            break;
                        }
                        SQLiteDatabase sQLiteDatabase2 = this.f100867d;
                        Intrinsics.m17074g(sQLiteDatabase2);
                        sQLiteDatabase2.close();
                    }
                }
            } else {
                C39638b.m12001k("Trying to close unknown database from DatabaseManager");
                mDb.close();
            }
        }

        @NotNull
        /* renamed from: b */
        public final synchronized SQLiteDatabase m15581b() {
            SQLiteDatabase sQLiteDatabase;
            this.f100867d = this.f100864a.getReadableDatabase();
            this.f100866c++;
            Set<Thread> set = this.f100865b;
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(currentThread, "currentThread()");
            set.add(currentThread);
            sQLiteDatabase = this.f100867d;
            Intrinsics.m17074g(sQLiteDatabase);
            return sQLiteDatabase;
        }

        @NotNull
        /* renamed from: c */
        public final synchronized SQLiteDatabase m15580c() {
            SQLiteDatabase sQLiteDatabase;
            this.f100870g = this.f100864a.getWritableDatabase();
            this.f100869f++;
            Set<Thread> set = this.f100868e;
            Thread currentThread = Thread.currentThread();
            Intrinsics.checkNotNullExpressionValue(currentThread, "currentThread()");
            set.add(currentThread);
            sQLiteDatabase = this.f100870g;
            Intrinsics.m17074g(sQLiteDatabase);
            return sQLiteDatabase;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AndroidDatabaseOpenHelper.kt */
    @Metadata
    /* renamed from: lb.a$d */
    /* loaded from: classes8.dex */
    public static final class C38134d {

        /* renamed from: a */
        private int f100871a;

        /* renamed from: a */
        public final int m15579a() {
            return this.f100871a;
        }

        /* renamed from: b */
        public final void m15578b(int i) {
            this.f100871a = i;
        }
    }

    public AndroidDatabaseOpenHelper(@NotNull Context context, @NotNull String name, int i, @NotNull DatabaseOpenHelper.InterfaceC38136a ccb, @NotNull DatabaseOpenHelper.InterfaceC38138c ucb) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(ccb, "ccb");
        Intrinsics.checkNotNullParameter(ucb, "ucb");
        this.f100856c = new Object();
        this.f100857d = new HashMap();
        C38131a c38131a = new C38131a(context, name, i, ccb, this, ucb);
        this.f100854a = c38131a;
        this.f100855b = new C38133c(c38131a);
    }

    /* renamed from: b */
    private C38134d m15584b(SQLiteDatabase sQLiteDatabase) {
        C38134d c38134d;
        synchronized (this.f100856c) {
            c38134d = this.f100857d.get(sQLiteDatabase);
            if (c38134d == null) {
                c38134d = new C38134d();
                this.f100857d.put(sQLiteDatabase, c38134d);
            }
            c38134d.m15578b(c38134d.m15579a() + 1);
            c38134d.m15579a();
        }
        return c38134d;
    }

    @VisibleForTesting
    @NotNull
    /* renamed from: c */
    public DatabaseOpenHelper.InterfaceC38137b m15583c(@NotNull SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return new C38132b(this, sqLiteDatabase, m15584b(sqLiteDatabase));
    }

    @Override // lb.DatabaseOpenHelper
    @NotNull
    public DatabaseOpenHelper.InterfaceC38137b getReadableDatabase() {
        return m15583c(this.f100855b.m15581b());
    }

    @Override // lb.DatabaseOpenHelper
    @NotNull
    public DatabaseOpenHelper.InterfaceC38137b getWritableDatabase() {
        return m15583c(this.f100855b.m15580c());
    }
}
