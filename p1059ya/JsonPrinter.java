package p1059ya;

import com.amazon.aps.shared.util.APSSharedUtil;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata
/* renamed from: ya.i */
/* loaded from: classes8.dex */
public final class JsonPrinter {
    @NotNull

    /* renamed from: c */
    private static final C45075a f118546c = new C45075a(null);

    /* renamed from: a */
    private final int f118547a;

    /* renamed from: b */
    private final int f118548b;

    /* compiled from: JsonPrinter.kt */
    @Metadata
    /* renamed from: ya.i$a */
    /* loaded from: classes8.dex */
    private static final class C45075a {
        private C45075a() {
        }

        public /* synthetic */ C45075a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public JsonPrinter(int i, int i2) {
        this.f118547a = i;
        this.f118548b = i2;
    }

    /* renamed from: a */
    private final JSONArray m1004a(JSONArray jSONArray, int i) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            Object opt = jSONArray.opt(i2);
            if (opt instanceof JSONObject) {
                if (i != 0) {
                    opt = m1003b((JSONObject) opt, i - 1);
                    jSONArray2.put(opt);
                }
                opt = APSSharedUtil.TRUNCATE_SEPARATOR;
                jSONArray2.put(opt);
            } else {
                if (opt instanceof JSONArray) {
                    if (i != 0) {
                        opt = m1004a((JSONArray) opt, i - 1);
                    }
                    opt = APSSharedUtil.TRUNCATE_SEPARATOR;
                }
                jSONArray2.put(opt);
            }
        }
        return jSONArray2;
    }

    /* renamed from: b */
    private final JSONObject m1003b(JSONObject jSONObject, int i) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys");
        while (keys.hasNext()) {
            String key = keys.next();
            Object opt = jSONObject.opt(key);
            Intrinsics.checkNotNullExpressionValue(key, "key");
            if (opt instanceof JSONObject) {
                if (i != 0) {
                    opt = m1003b((JSONObject) opt, i - 1);
                    jSONObject2.put(key, opt);
                }
                opt = APSSharedUtil.TRUNCATE_SEPARATOR;
                jSONObject2.put(key, opt);
            } else {
                if (opt instanceof JSONArray) {
                    if (i != 0) {
                        opt = m1004a((JSONArray) opt, i - 1);
                    }
                    opt = APSSharedUtil.TRUNCATE_SEPARATOR;
                }
                jSONObject2.put(key, opt);
            }
        }
        return jSONObject2;
    }

    @NotNull
    /* renamed from: c */
    public final String m1002c(@NotNull JSONArray json) throws JSONException {
        String jSONArray;
        String str;
        Intrinsics.checkNotNullParameter(json, "json");
        JSONArray m1004a = m1004a(json, this.f118548b);
        int i = this.f118547a;
        if (i == 0) {
            jSONArray = m1004a.toString();
            str = "copy.toString()";
        } else {
            jSONArray = m1004a.toString(i);
            str = "copy.toString(indentSpaces)";
        }
        Intrinsics.checkNotNullExpressionValue(jSONArray, str);
        return jSONArray;
    }

    @NotNull
    /* renamed from: d */
    public final String m1001d(@NotNull JSONObject json) throws JSONException {
        String jSONObject;
        String str;
        Intrinsics.checkNotNullParameter(json, "json");
        JSONObject m1003b = m1003b(json, this.f118548b);
        int i = this.f118547a;
        if (i == 0) {
            jSONObject = m1003b.toString();
            str = "copy.toString()";
        } else {
            jSONObject = m1003b.toString(i);
            str = "copy.toString(indentSpaces)";
        }
        Intrinsics.checkNotNullExpressionValue(jSONObject, str);
        return jSONObject;
    }
}
