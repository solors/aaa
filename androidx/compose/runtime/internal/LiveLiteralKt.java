package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LiveLiteral.kt */
@Metadata
/* loaded from: classes.dex */
public final class LiveLiteralKt {
    private static boolean isLiveLiteralsEnabled;
    @NotNull
    private static final HashMap<String, SnapshotState<Object>> liveLiteralCache = new HashMap<>();

    @InternalComposeApi
    public static final void enableLiveLiterals() {
        isLiveLiteralsEnabled = true;
    }

    public static final boolean isLiveLiteralsEnabled() {
        return isLiveLiteralsEnabled;
    }

    @ComposeCompilerApi
    @InternalComposeApi
    @NotNull
    public static final <T> State<T> liveLiteral(@NotNull String key, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        HashMap<String, SnapshotState<Object>> hashMap = liveLiteralCache;
        SnapshotState<Object> snapshotState = hashMap.get(key);
        if (snapshotState == null) {
            snapshotState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t, null, 2, null);
            hashMap.put(key, snapshotState);
        }
        return snapshotState;
    }

    @InternalComposeApi
    public static final void updateLiveLiteralValue(@NotNull String key, @Nullable Object obj) {
        boolean z;
        Intrinsics.checkNotNullParameter(key, "key");
        HashMap<String, SnapshotState<Object>> hashMap = liveLiteralCache;
        SnapshotState<Object> snapshotState = hashMap.get(key);
        if (snapshotState == null) {
            snapshotState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
            hashMap.put(key, snapshotState);
            z = false;
        } else {
            z = true;
        }
        SnapshotState<Object> snapshotState2 = snapshotState;
        if (z) {
            snapshotState2.setValue(obj);
        }
    }

    @ComposeCompilerApi
    @InternalComposeApi
    public static /* synthetic */ void isLiveLiteralsEnabled$annotations() {
    }
}
