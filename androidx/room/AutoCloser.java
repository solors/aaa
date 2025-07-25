package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.sqlite.p021db.SupportSQLiteDatabase;
import androidx.sqlite.p021db.SupportSQLiteOpenHelper;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AutoCloser.kt */
@Metadata
/* loaded from: classes2.dex */
public final class AutoCloser {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final String autoCloseBug = "https://issuetracker.google.com/issues/new?component=413107&template=1096568";
    private long autoCloseTimeoutInMs;
    @NotNull
    private final Runnable autoCloser;
    @GuardedBy("lock")
    @Nullable
    private SupportSQLiteDatabase delegateDatabase;
    public SupportSQLiteOpenHelper delegateOpenHelper;
    @NotNull
    private final Runnable executeAutoCloser;
    @NotNull
    private final Executor executor;
    @NotNull
    private final Handler handler;
    @GuardedBy("lock")
    private long lastDecrementRefCountTimeStamp;
    @NotNull
    private final Object lock;
    private boolean manuallyClosed;
    @Nullable
    private Runnable onAutoCloseCallback;
    @GuardedBy("lock")
    private int refCount;

    /* compiled from: AutoCloser.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AutoCloser(long j, @NotNull TimeUnit autoCloseTimeUnit, @NotNull Executor autoCloseExecutor) {
        Intrinsics.checkNotNullParameter(autoCloseTimeUnit, "autoCloseTimeUnit");
        Intrinsics.checkNotNullParameter(autoCloseExecutor, "autoCloseExecutor");
        this.handler = new Handler(Looper.getMainLooper());
        this.lock = new Object();
        this.autoCloseTimeoutInMs = autoCloseTimeUnit.toMillis(j);
        this.executor = autoCloseExecutor;
        this.lastDecrementRefCountTimeStamp = SystemClock.uptimeMillis();
        this.executeAutoCloser = new Runnable() { // from class: androidx.room.a
            @Override // java.lang.Runnable
            public final void run() {
                AutoCloser.m104113a(AutoCloser.this);
            }
        };
        this.autoCloser = new Runnable() { // from class: androidx.room.b
            @Override // java.lang.Runnable
            public final void run() {
                AutoCloser.m104112b(AutoCloser.this);
            }
        };
    }

    /* renamed from: a */
    public static /* synthetic */ void m104113a(AutoCloser autoCloser) {
        executeAutoCloser$lambda$0(autoCloser);
    }

    public static final void autoCloser$lambda$3(AutoCloser this$0) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.lock) {
            if (SystemClock.uptimeMillis() - this$0.lastDecrementRefCountTimeStamp < this$0.autoCloseTimeoutInMs) {
                return;
            }
            if (this$0.refCount != 0) {
                return;
            }
            Runnable runnable = this$0.onAutoCloseCallback;
            if (runnable != null) {
                runnable.run();
                unit = Unit.f99208a;
            } else {
                unit = null;
            }
            if (unit != null) {
                SupportSQLiteDatabase supportSQLiteDatabase = this$0.delegateDatabase;
                if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                    supportSQLiteDatabase.close();
                }
                this$0.delegateDatabase = null;
                Unit unit2 = Unit.f99208a;
                return;
            }
            throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568".toString());
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m104112b(AutoCloser autoCloser) {
        autoCloser$lambda$3(autoCloser);
    }

    public static final void executeAutoCloser$lambda$0(AutoCloser this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.executor.execute(this$0.autoCloser);
    }

    public final void closeDatabaseIfOpen() throws IOException {
        synchronized (this.lock) {
            this.manuallyClosed = true;
            SupportSQLiteDatabase supportSQLiteDatabase = this.delegateDatabase;
            if (supportSQLiteDatabase != null) {
                supportSQLiteDatabase.close();
            }
            this.delegateDatabase = null;
            Unit unit = Unit.f99208a;
        }
    }

    public final void decrementCountAndScheduleClose() {
        boolean z;
        synchronized (this.lock) {
            int i = this.refCount;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i2 = i - 1;
                this.refCount = i2;
                if (i2 == 0) {
                    if (this.delegateDatabase == null) {
                        return;
                    }
                    this.handler.postDelayed(this.executeAutoCloser, this.autoCloseTimeoutInMs);
                }
                Unit unit = Unit.f99208a;
                return;
            }
            throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement".toString());
        }
    }

    public final <V> V executeRefCountingFunction(@NotNull Function1<? super SupportSQLiteDatabase, ? extends V> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return block.invoke(incrementCountAndEnsureDbIsOpen());
        } finally {
            decrementCountAndScheduleClose();
        }
    }

    @Nullable
    public final SupportSQLiteDatabase getDelegateDatabase$room_runtime_release() {
        return this.delegateDatabase;
    }

    @NotNull
    public final SupportSQLiteOpenHelper getDelegateOpenHelper() {
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.delegateOpenHelper;
        if (supportSQLiteOpenHelper != null) {
            return supportSQLiteOpenHelper;
        }
        Intrinsics.m17056y("delegateOpenHelper");
        return null;
    }

    public final long getLastDecrementRefCountTimeStamp$room_runtime_release() {
        return this.lastDecrementRefCountTimeStamp;
    }

    @Nullable
    public final Runnable getOnAutoCloseCallback$room_runtime_release() {
        return this.onAutoCloseCallback;
    }

    public final int getRefCount$room_runtime_release() {
        return this.refCount;
    }

    @VisibleForTesting
    public final int getRefCountForTest$room_runtime_release() {
        int i;
        synchronized (this.lock) {
            i = this.refCount;
        }
        return i;
    }

    @NotNull
    public final SupportSQLiteDatabase incrementCountAndEnsureDbIsOpen() {
        synchronized (this.lock) {
            this.handler.removeCallbacks(this.executeAutoCloser);
            this.refCount++;
            if (!this.manuallyClosed) {
                SupportSQLiteDatabase supportSQLiteDatabase = this.delegateDatabase;
                if (supportSQLiteDatabase != null && supportSQLiteDatabase.isOpen()) {
                    return supportSQLiteDatabase;
                }
                SupportSQLiteDatabase writableDatabase = getDelegateOpenHelper().getWritableDatabase();
                this.delegateDatabase = writableDatabase;
                return writableDatabase;
            }
            throw new IllegalStateException("Attempting to open already closed database.".toString());
        }
    }

    public final void init(@NotNull SupportSQLiteOpenHelper delegateOpenHelper) {
        Intrinsics.checkNotNullParameter(delegateOpenHelper, "delegateOpenHelper");
        setDelegateOpenHelper(delegateOpenHelper);
    }

    public final boolean isActive() {
        return !this.manuallyClosed;
    }

    public final void setAutoCloseCallback(@NotNull Runnable onAutoClose) {
        Intrinsics.checkNotNullParameter(onAutoClose, "onAutoClose");
        this.onAutoCloseCallback = onAutoClose;
    }

    public final void setDelegateDatabase$room_runtime_release(@Nullable SupportSQLiteDatabase supportSQLiteDatabase) {
        this.delegateDatabase = supportSQLiteDatabase;
    }

    public final void setDelegateOpenHelper(@NotNull SupportSQLiteOpenHelper supportSQLiteOpenHelper) {
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper, "<set-?>");
        this.delegateOpenHelper = supportSQLiteOpenHelper;
    }

    public final void setLastDecrementRefCountTimeStamp$room_runtime_release(long j) {
        this.lastDecrementRefCountTimeStamp = j;
    }

    public final void setOnAutoCloseCallback$room_runtime_release(@Nullable Runnable runnable) {
        this.onAutoCloseCallback = runnable;
    }

    public final void setRefCount$room_runtime_release(int i) {
        this.refCount = i;
    }
}
