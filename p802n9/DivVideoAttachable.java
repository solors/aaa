package p802n9;

import com.yandex.div.core.player.DivPlayer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sb.DivVideoScale;

@Metadata
/* renamed from: n9.d */
/* loaded from: classes8.dex */
public interface DivVideoAttachable {
    default void attach(@NotNull DivPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
    }

    @Nullable
    default DivPlayer getAttachedPlayer() {
        return null;
    }

    default void setScale(@NotNull DivVideoScale videoScale) {
        Intrinsics.checkNotNullParameter(videoScale, "videoScale");
    }

    default void detach() {
    }

    default void setVisibleOnScreen(boolean z) {
    }
}
