package p1059ya;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: JsonNode.kt */
@Metadata
/* renamed from: ya.h */
/* loaded from: classes8.dex */
public final class C45074h extends AbstractC45073g {
    @NotNull

    /* renamed from: a */
    private final JSONObject f118545a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45074h(@NotNull JSONObject value) {
        super(null);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f118545a = value;
    }

    @Override // p1059ya.AbstractC45073g
    @NotNull
    /* renamed from: a */
    public String mo1005a() {
        String jSONObject = this.f118545a.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "value.toString()");
        return jSONObject;
    }
}
