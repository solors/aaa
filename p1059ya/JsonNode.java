package p1059ya;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;

@Metadata
/* renamed from: ya.f */
/* loaded from: classes8.dex */
public final class JsonNode extends AbstractC45073g {
    @NotNull

    /* renamed from: a */
    private final JSONArray f118544a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonNode(@NotNull JSONArray value) {
        super(null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f118544a = value;
    }

    @Override // p1059ya.AbstractC45073g
    @NotNull
    /* renamed from: a */
    public String mo1005a() {
        String jSONArray = this.f118544a.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray, "value.toString()");
        return jSONArray;
    }
}
