package lb;

import android.database.SQLException;
import androidx.annotation.WorkerThread;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: lb.l */
/* loaded from: classes8.dex */
public interface StorageStatement {
    @WorkerThread
    /* renamed from: a */
    void mo15551a(@NotNull SqlCompiler sqlCompiler) throws SQLException;
}
