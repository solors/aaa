package lb;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: lb.d */
/* loaded from: classes8.dex */
public interface DatabaseOpenHelper {

    /* compiled from: DatabaseOpenHelper.kt */
    @Metadata
    /* renamed from: lb.d$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC38136a {
        /* renamed from: a */
        void mo15575a(@NotNull InterfaceC38137b interfaceC38137b);
    }

    /* compiled from: DatabaseOpenHelper.kt */
    @Metadata
    /* renamed from: lb.d$b */
    /* loaded from: classes8.dex */
    public interface InterfaceC38137b extends Closeable {
        void beginTransaction();

        @NotNull
        SQLiteStatement compileStatement(@NotNull String str);

        void endTransaction();

        void execSQL(@NotNull String str);

        @NotNull
        Cursor rawQuery(@NotNull String str, @Nullable String[] strArr);

        void setTransactionSuccessful();
    }

    /* compiled from: DatabaseOpenHelper.kt */
    @Metadata
    /* renamed from: lb.d$c */
    /* loaded from: classes8.dex */
    public interface InterfaceC38138c {
        /* renamed from: a */
        void mo15574a(@NotNull InterfaceC38137b interfaceC38137b, int i, int i2);
    }

    @NotNull
    InterfaceC38137b getReadableDatabase();

    @NotNull
    InterfaceC38137b getWritableDatabase();
}
