package p1064z0;

import android.text.TextUtils;
import org.json.JSONObject;
import p1049y0.C44996b;
import p838q0.C39323c;
import p989u0.C44417b;
import p989u0.EnumC44419d;

/* renamed from: z0.b */
/* loaded from: classes3.dex */
public final class C45106b {
    /* renamed from: a */
    public static C39323c m900a(String str) {
        if (TextUtils.isEmpty(str)) {
            C44996b.m1100b("%s : empty one dt", "OneDTParser");
            return new C39323c("", -1L);
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("data");
            if (optJSONObject != null && "onedtid".equalsIgnoreCase(optJSONObject.optString("propertyName", ""))) {
                return new C39323c(optJSONObject.optString("propertyValue", ""), optJSONObject.optLong("refreshTime", -1L));
            }
        } catch (Exception e) {
            C44417b.m3083a(EnumC44419d.ONE_DT_PARSE_ERROR, e);
            C44996b.m1100b("%s : failed parse one dt", "OneDTParser");
        }
        return new C39323c("", -1L);
    }
}
