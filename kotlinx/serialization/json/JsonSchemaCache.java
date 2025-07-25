package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import se.SchemaCache;

@Metadata
/* renamed from: kotlinx.serialization.json.w */
/* loaded from: classes8.dex */
public final class JsonSchemaCache {
    @NotNull
    /* renamed from: a */
    public static final SchemaCache m15868a(@NotNull Json json) {
        Intrinsics.checkNotNullParameter(json, "<this>");
        return json.m15947f();
    }
}
