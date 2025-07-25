package androidx.room;

import android.database.sqlite.SQLiteConstraintException;
import androidx.annotation.RestrictTo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsJVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;

/* compiled from: EntityUpsertionAdapter.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public final class EntityUpsertionAdapter<T> {
    @NotNull
    private final EntityInsertionAdapter<T> insertionAdapter;
    @NotNull
    private final EntityDeletionOrUpdateAdapter<T> updateAdapter;

    public EntityUpsertionAdapter(@NotNull EntityInsertionAdapter<T> insertionAdapter, @NotNull EntityDeletionOrUpdateAdapter<T> updateAdapter) {
        Intrinsics.checkNotNullParameter(insertionAdapter, "insertionAdapter");
        Intrinsics.checkNotNullParameter(updateAdapter, "updateAdapter");
        this.insertionAdapter = insertionAdapter;
        this.updateAdapter = updateAdapter;
    }

    private final void checkUniquenessException(SQLiteConstraintException sQLiteConstraintException) {
        boolean m16596P;
        String message = sQLiteConstraintException.getMessage();
        if (message != null) {
            m16596P = C37690r.m16596P(message, "1555", true);
            if (m16596P) {
                return;
            }
            throw sQLiteConstraintException;
        }
        throw sQLiteConstraintException;
    }

    public final void upsert(T t) {
        try {
            this.insertionAdapter.insert((EntityInsertionAdapter<T>) t);
        } catch (SQLiteConstraintException e) {
            checkUniquenessException(e);
            this.updateAdapter.handle(t);
        }
    }

    public final long upsertAndReturnId(T t) {
        try {
            return this.insertionAdapter.insertAndReturnId(t);
        } catch (SQLiteConstraintException e) {
            checkUniquenessException(e);
            this.updateAdapter.handle(t);
            return -1L;
        }
    }

    @NotNull
    public final long[] upsertAndReturnIdsArray(@NotNull T[] entities) {
        long j;
        Intrinsics.checkNotNullParameter(entities, "entities");
        int length = entities.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            try {
                j = this.insertionAdapter.insertAndReturnId(entities[i]);
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(entities[i]);
                j = -1;
            }
            jArr[i] = j;
        }
        return jArr;
    }

    @NotNull
    public final Long[] upsertAndReturnIdsArrayBox(@NotNull T[] entities) {
        long j;
        Intrinsics.checkNotNullParameter(entities, "entities");
        int length = entities.length;
        Long[] lArr = new Long[length];
        for (int i = 0; i < length; i++) {
            try {
                j = this.insertionAdapter.insertAndReturnId(entities[i]);
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(entities[i]);
                j = -1;
            }
            lArr[i] = Long.valueOf(j);
        }
        return lArr;
    }

    @NotNull
    public final List<Long> upsertAndReturnIdsList(@NotNull T[] entities) {
        List m17177c;
        List<Long> m17179a;
        Intrinsics.checkNotNullParameter(entities, "entities");
        m17177c = CollectionsJVM.m17177c();
        for (T t : entities) {
            try {
                m17177c.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t)));
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(t);
                m17177c.add(-1L);
            }
        }
        m17179a = CollectionsJVM.m17179a(m17177c);
        return m17179a;
    }

    public final void upsert(@NotNull T[] entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        for (T t : entities) {
            try {
                this.insertionAdapter.insert((EntityInsertionAdapter<T>) t);
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(t);
            }
        }
    }

    @NotNull
    public final long[] upsertAndReturnIdsArray(@NotNull Collection<? extends T> entities) {
        long j;
        Intrinsics.checkNotNullParameter(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            T next = it.next();
            try {
                j = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(next);
                j = -1;
            }
            jArr[i] = j;
        }
        return jArr;
    }

    @NotNull
    public final Long[] upsertAndReturnIdsArrayBox(@NotNull Collection<? extends T> entities) {
        long j;
        Intrinsics.checkNotNullParameter(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        Long[] lArr = new Long[size];
        for (int i = 0; i < size; i++) {
            T next = it.next();
            try {
                j = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(next);
                j = -1;
            }
            lArr[i] = Long.valueOf(j);
        }
        return lArr;
    }

    public final void upsert(@NotNull Iterable<? extends T> entities) {
        Intrinsics.checkNotNullParameter(entities, "entities");
        for (T t : entities) {
            try {
                this.insertionAdapter.insert((EntityInsertionAdapter<T>) t);
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(t);
            }
        }
    }

    @NotNull
    public final List<Long> upsertAndReturnIdsList(@NotNull Collection<? extends T> entities) {
        List m17177c;
        List<Long> m17179a;
        Intrinsics.checkNotNullParameter(entities, "entities");
        m17177c = CollectionsJVM.m17177c();
        for (T t : entities) {
            try {
                m17177c.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t)));
            } catch (SQLiteConstraintException e) {
                checkUniquenessException(e);
                this.updateAdapter.handle(t);
                m17177c.add(-1L);
            }
        }
        m17179a = CollectionsJVM.m17179a(m17177c);
        return m17179a;
    }
}
