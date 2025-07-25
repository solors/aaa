package androidx.window.layout;

import android.app.Activity;
import androidx.core.util.Consumer;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: WindowBackend.kt */
@Metadata
/* loaded from: classes2.dex */
public interface WindowBackend {
    void registerLayoutChangeCallback(@NotNull Activity activity, @NotNull Executor executor, @NotNull Consumer<WindowLayoutInfo> consumer);

    void unregisterLayoutChangeCallback(@NotNull Consumer<WindowLayoutInfo> consumer);
}
