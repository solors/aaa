package p833p9;

import androidx.annotation.AnyThread;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: p9.k */
/* loaded from: classes8.dex */
public final class TemporaryDivStateCache {
    @NotNull

    /* renamed from: a */
    private final Map<String, Map<String, String>> f103170a = new LinkedHashMap();

    @AnyThread
    /* renamed from: a */
    public final void m13217a() {
        this.f103170a.clear();
    }

    @AnyThread
    @Nullable
    /* renamed from: b */
    public final String m13216b(@NotNull String cardId, @NotNull String path) {
        String str;
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(path, "path");
        synchronized (this.f103170a) {
            Map<String, String> map = this.f103170a.get(cardId);
            if (map != null) {
                str = map.get(path);
            } else {
                str = null;
            }
        }
        return str;
    }

    @AnyThread
    /* renamed from: c */
    public final void m13215c(@NotNull String cardId, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        m13214d(cardId, RemoteSettings.FORWARD_SLASH_STRING, stateId);
    }

    @AnyThread
    /* renamed from: d */
    public final void m13214d(@NotNull String cardId, @NotNull String path, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        synchronized (this.f103170a) {
            Map<String, Map<String, String>> map = this.f103170a;
            Map<String, String> map2 = map.get(cardId);
            if (map2 == null) {
                map2 = new LinkedHashMap<>();
                map.put(cardId, map2);
            }
            map2.put(path, stateId);
            Unit unit = Unit.f99208a;
        }
    }

    @AnyThread
    @Nullable
    /* renamed from: e */
    public final Map<String, String> m13213e(@NotNull String cardId) {
        Map<String, String> remove;
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        synchronized (this.f103170a) {
            remove = this.f103170a.remove(cardId);
        }
        return remove;
    }
}
