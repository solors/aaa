package com.learnings.learningsanalyze.repository.database;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.learnings.learningsanalyze.repository.database.Database;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p828p4.AnalyzeDao;
import p842q4.EventEntity;
import p842q4.EventPropertiesEntity;
import p842q4.PublicPropertiesEntity;
import p842q4.UserPropertiesEntity;

@androidx.room.Database(entities = {EventEntity.class, EventPropertiesEntity.class, UserPropertiesEntity.class, PublicPropertiesEntity.class}, exportSchema = false, version = 1)
/* loaded from: classes6.dex */
public abstract class Database extends RoomDatabase {

    /* renamed from: a */
    private static Database f54872a;

    /* renamed from: b */
    private static final Executor f54873b = Executors.newFixedThreadPool(4, new ThreadFactoryC21370a());

    /* renamed from: c */
    private static final Executor f54874c = new Executor() { // from class: p4.c
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            Database.m53663g(runnable);
        }
    };

    /* renamed from: com.learnings.learningsanalyze.repository.database.Database$a */
    /* loaded from: classes6.dex */
    class ThreadFactoryC21370a implements ThreadFactory {

        /* renamed from: b */
        private final AtomicInteger f54875b = new AtomicInteger(0);

        ThreadFactoryC21370a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("database_io_" + this.f54875b.getAndIncrement());
            return thread;
        }
    }

    /* renamed from: d */
    public static Database m53666d() {
        Database database = f54872a;
        if (database != null) {
            return database;
        }
        throw new NullPointerException("Must init before use database");
    }

    /* renamed from: e */
    public static void m53665e(Context context) {
        if (f54872a == null) {
            RoomDatabase.Builder allowMainThreadQueries = Room.databaseBuilder(context, Database.class, "learnings_analyze_db").fallbackToDestructiveMigrationOnDowngrade().allowMainThreadQueries();
            Executor executor = f54874c;
            f54872a = (Database) allowMainThreadQueries.setQueryExecutor(executor).setTransactionExecutor(executor).build();
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m53664f(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m53663g(final Runnable runnable) {
        f54873b.execute(new Runnable() { // from class: p4.d
            @Override // java.lang.Runnable
            public final void run() {
                Database.m53664f(runnable);
            }
        });
    }

    /* renamed from: c */
    public abstract AnalyzeDao mo53662c();
}
