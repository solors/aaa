package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.p021db.SupportSQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* compiled from: SharedSQLiteStatement.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public abstract class SharedSQLiteStatement {
    @NotNull
    private final RoomDatabase database;
    @NotNull
    private final AtomicBoolean lock;
    @NotNull
    private final InterfaceC38501j stmt$delegate;

    public SharedSQLiteStatement(@NotNull RoomDatabase database) {
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(database, "database");
        this.database = database;
        this.lock = new AtomicBoolean(false);
        m14554a = LazyJVM.m14554a(new SharedSQLiteStatement$stmt$2(this));
        this.stmt$delegate = m14554a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SupportSQLiteStatement createNewStatement() {
        return this.database.compileStatement(createQuery());
    }

    private final SupportSQLiteStatement getStmt() {
        return (SupportSQLiteStatement) this.stmt$delegate.getValue();
    }

    @NotNull
    public SupportSQLiteStatement acquire() {
        assertNotMainThread();
        return getStmt(this.lock.compareAndSet(false, true));
    }

    protected void assertNotMainThread() {
        this.database.assertNotMainThread();
    }

    @NotNull
    protected abstract String createQuery();

    public void release(@NotNull SupportSQLiteStatement statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == getStmt()) {
            this.lock.set(false);
        }
    }

    private final SupportSQLiteStatement getStmt(boolean z) {
        if (z) {
            return getStmt();
        }
        return createNewStatement();
    }
}
