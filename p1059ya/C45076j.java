package p1059ya;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: JsonUtils.kt */
@Metadata
/* renamed from: ya.j */
/* loaded from: classes8.dex */
public final class C45076j {
    @NotNull
    /* renamed from: a */
    public static final <R> List<R> m1000a(@NotNull JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "get(i)");
            if (!(obj instanceof Object)) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: b */
    public static final String m999b(@NotNull JSONArray jSONArray, int i) {
        Intrinsics.checkNotNullParameter(jSONArray, "<this>");
        return new JsonPrinter(i, 1).m1002c(jSONArray);
    }

    @NotNull
    /* renamed from: c */
    public static final String m998c(@NotNull JSONObject jSONObject, int i) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        return new JsonPrinter(i, 1).m1001d(jSONObject);
    }

    /* renamed from: d */
    public static /* synthetic */ String m997d(JSONArray jSONArray, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m999b(jSONArray, i);
    }

    /* renamed from: e */
    public static /* synthetic */ String m996e(JSONObject jSONObject, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return m998c(jSONObject, i);
    }
}
