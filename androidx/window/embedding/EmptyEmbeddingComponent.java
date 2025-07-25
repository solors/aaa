package androidx.window.embedding;

import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: EmbeddingCompat.kt */
@Metadata
/* loaded from: classes2.dex */
final class EmptyEmbeddingComponent implements ActivityEmbeddingComponent {
    public void setEmbeddingRules(@NotNull Set<androidx.window.extensions.embedding.EmbeddingRule> splitRules) {
        Intrinsics.checkNotNullParameter(splitRules, "splitRules");
    }

    public void setSplitInfoCallback(@NotNull Consumer<List<androidx.window.extensions.embedding.SplitInfo>> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
    }
}
