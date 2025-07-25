package sg.bigo.ads.core.mraid;

import android.graphics.Rect;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sg.bigo.ads.core.mraid.b */
/* loaded from: classes10.dex */
public final class C44239b {

    /* renamed from: a */
    final float f116149a;

    /* renamed from: b */
    final Rect f116150b;

    /* renamed from: c */
    final List<Rect> f116151c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C44239b(float f, Rect rect, List<Rect> list) {
        this.f116149a = f;
        this.f116150b = rect;
        this.f116151c = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static JSONArray m3563a(List<Rect> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Rect rect : list) {
            jSONArray.put(m3564a(rect));
        }
        return jSONArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static JSONObject m3564a(Rect rect) {
        if (rect == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", rect.left);
            jSONObject.put("y", rect.top);
            jSONObject.put("width", rect.width());
            jSONObject.put("height", rect.height());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
