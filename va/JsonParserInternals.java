package va;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p656eb.JSONSerializable;

@Metadata
/* renamed from: va.i */
/* loaded from: classes8.dex */
public final class JsonParserInternals {
    @Nullable
    /* renamed from: a */
    public static final Object m2604a(@NotNull JSONObject jSONObject, @NotNull String key) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Object opt = jSONObject.opt(key);
        if (Intrinsics.m17075f(opt, JSONObject.NULL)) {
            return null;
        }
        return opt;
    }

    @NotNull
    /* renamed from: b */
    public static final <T extends JSONSerializable> JSONArray m2603b(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(((JSONSerializable) it.next()).mo7023q());
        }
        return jSONArray;
    }
}
