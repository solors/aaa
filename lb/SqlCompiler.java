package lb;

import android.database.sqlite.SQLiteStatement;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: lb.j */
/* loaded from: classes8.dex */
public interface SqlCompiler {
    @NotNull
    /* renamed from: a */
    ReadState mo15565a(@NotNull String str, @NotNull String... strArr);

    @NotNull
    SQLiteStatement compileStatement(@NotNull String str);
}
