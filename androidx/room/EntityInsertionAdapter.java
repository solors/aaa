package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.p021db.SupportSQLiteStatement;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections.CollectionsJVM;
import kotlin.jvm.internal.C37598c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EntityInsertionAdapter.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public abstract class EntityInsertionAdapter<T> extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityInsertionAdapter(@NotNull RoomDatabase database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    protected abstract void bind(@Nullable SupportSQLiteStatement supportSQLiteStatement, T t);

    public final void insert(T t) {
        SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, t);
            acquire.executeInsert();
        } finally {
            release(acquire);
        }
    }

    public final long insertAndReturnId(T t) {
        SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, t);
            return acquire.executeInsert();
        } finally {
            release(acquire);
        }
    }

    @NotNull
    public final long[] insertAndReturnIdsArray(@NotNull Collection<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            long[] jArr = new long[entities.size()];
            int i = 0;
            for (T t : entities) {
                int i2 = i + 1;
                if (i < 0) {
                    C37563v.m17156w();
                }
                bind(acquire, t);
                jArr[i] = acquire.executeInsert();
                i = i2;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    @NotNull
    public final Long[] insertAndReturnIdsArrayBox(@NotNull Collection<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        Iterator<? extends T> it = entities.iterator();
        try {
            int size = entities.size();
            Long[] lArr = new Long[size];
            for (int i = 0; i < size; i++) {
                bind(acquire, it.next());
                lArr[i] = Long.valueOf(acquire.executeInsert());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    @NotNull
    public final List<Long> insertAndReturnIdsList(@NotNull T[] entities) {
        List m17177c;
        List<Long> m17179a;
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            m17177c = CollectionsJVM.m17177c();
            for (T t : entities) {
                bind(acquire, t);
                m17177c.add(Long.valueOf(acquire.executeInsert()));
            }
            m17179a = CollectionsJVM.m17179a(m17177c);
            return m17179a;
        } finally {
            release(acquire);
        }
    }

    public final void insert(@NotNull T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            for (T t : entities) {
                bind(acquire, t);
                acquire.executeInsert();
            }
        } finally {
            release(acquire);
        }
    }

    @NotNull
    public final long[] insertAndReturnIdsArray(@NotNull T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            long[] jArr = new long[entities.length];
            int length = entities.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                bind(acquire, entities[i]);
                jArr[i2] = acquire.executeInsert();
                i++;
                i2 = i3;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final Long[] insertAndReturnIdsArrayBox(@NotNull T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        Iterator m17055a = C37598c.m17055a(entities);
        try {
            int length = entities.length;
            Long[] lArr = new Long[length];
            for (int i = 0; i < length; i++) {
                bind(acquire, m17055a.next());
                lArr[i] = Long.valueOf(acquire.executeInsert());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    @NotNull
    public final List<Long> insertAndReturnIdsList(@NotNull Collection<? extends T> entities) {
        List m17177c;
        List<Long> m17179a;
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            m17177c = CollectionsJVM.m17177c();
            for (T t : entities) {
                bind(acquire, t);
                m17177c.add(Long.valueOf(acquire.executeInsert()));
            }
            m17179a = CollectionsJVM.m17179a(m17177c);
            return m17179a;
        } finally {
            release(acquire);
        }
    }

    public final void insert(@NotNull Iterable<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            for (T t : entities) {
                bind(acquire, t);
                acquire.executeInsert();
            }
        } finally {
            release(acquire);
        }
    }
}
