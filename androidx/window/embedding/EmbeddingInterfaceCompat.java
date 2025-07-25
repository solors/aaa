package androidx.window.embedding;

import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: EmbeddingInterfaceCompat.kt */
@ExperimentalWindowApi
@Metadata
/* loaded from: classes2.dex */
public interface EmbeddingInterfaceCompat {

    /* compiled from: EmbeddingInterfaceCompat.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public interface EmbeddingCallbackInterface {
        void onSplitInfoChanged(@NotNull List<SplitInfo> list);
    }

    void setEmbeddingCallback(@NotNull EmbeddingCallbackInterface embeddingCallbackInterface);

    void setSplitRules(@NotNull Set<? extends EmbeddingRule> set);
}
