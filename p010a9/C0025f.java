package p010a9;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: DivActionTypedDictSetValueHandler.kt */
@Metadata
/* renamed from: a9.f */
/* loaded from: classes8.dex */
public final class C0025f {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final JSONObject m105820b(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> keys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject2.put(next, jSONObject.get(next));
        }
        return jSONObject2;
    }
}
