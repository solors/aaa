package p656eb;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p656eb.JSONSerializable;

@Metadata
/* renamed from: eb.b */
/* loaded from: classes8.dex */
public interface JsonTemplate<T extends JSONSerializable> {
    @NotNull
    /* renamed from: a */
    T mo7039a(@NotNull ParsingEnvironment parsingEnvironment, @NotNull JSONObject jSONObject);
}
