package kotlinx.serialization.json;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: JsonElementBuilders.kt */
@Metadata
/* renamed from: kotlinx.serialization.json.t */
/* loaded from: classes8.dex */
public final class C37873t {
    @NotNull

    /* renamed from: a */
    private final Map<String, JsonElement> f99760a = new LinkedHashMap();

    @NotNull
    /* renamed from: a */
    public final JsonObject m15874a() {
        return new JsonObject(this.f99760a);
    }

    @Nullable
    /* renamed from: b */
    public final JsonElement m15873b(@NotNull String key, @NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f99760a.put(key, element);
    }
}
