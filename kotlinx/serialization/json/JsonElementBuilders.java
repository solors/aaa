package kotlinx.serialization.json;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: kotlinx.serialization.json.b */
/* loaded from: classes8.dex */
public final class JsonElementBuilders {
    @NotNull

    /* renamed from: a */
    private final List<JsonElement> f99712a = new ArrayList();

    /* renamed from: a */
    public final boolean m15946a(@NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        this.f99712a.add(element);
        return true;
    }

    @NotNull
    /* renamed from: b */
    public final JsonArray m15945b() {
        return new JsonArray(this.f99712a);
    }
}
