package ie;

import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ie.v */
/* loaded from: classes8.dex */
public interface MainDispatcherFactory {
    @NotNull
    MainCoroutineDispatcher createDispatcher(@NotNull List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    @Nullable
    String hintOnError();
}
