package androidx.window.embedding;

import android.app.Activity;
import androidx.core.util.Consumer;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: EmbeddingBackend.kt */
@ExperimentalWindowApi
@Metadata
/* loaded from: classes2.dex */
public interface EmbeddingBackend {
    @NotNull
    Set<EmbeddingRule> getSplitRules();

    boolean isSplitSupported();

    void registerRule(@NotNull EmbeddingRule embeddingRule);

    void registerSplitListenerForActivity(@NotNull Activity activity, @NotNull Executor executor, @NotNull Consumer<List<SplitInfo>> consumer);

    void setSplitRules(@NotNull Set<? extends EmbeddingRule> set);

    void unregisterRule(@NotNull EmbeddingRule embeddingRule);

    void unregisterSplitListenerForActivity(@NotNull Consumer<List<SplitInfo>> consumer);
}
