package androidx.compose.runtime.saveable;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Saver.kt */
@Metadata
/* loaded from: classes.dex */
public interface SaverScope {
    boolean canBeSaved(@NotNull Object obj);
}
