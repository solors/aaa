package sg.bigo.ads.controller.p947c;

import android.graphics.Rect;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* renamed from: sg.bigo.ads.controller.c.g */
/* loaded from: classes10.dex */
public final class C43986g {
    @Nullable

    /* renamed from: a */
    private Rect f115316a;

    /* renamed from: b */
    private final int f115317b = 2;

    public C43986g(@NonNull JSONObject jSONObject) {
        String optString = jSONObject.optString("start_coordinate");
        String optString2 = jSONObject.optString("end_coordinate");
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
            String[] split = optString.split(",");
            String[] split2 = optString2.split(",");
            if (split.length == 2 && split2.length == 2) {
                try {
                    int parseFloat = (int) (Float.parseFloat(split[0]) * 1000.0f);
                    int parseFloat2 = (int) (Float.parseFloat(split2[0]) * 1000.0f);
                    int parseFloat3 = (int) (Float.parseFloat(split[1]) * 1000.0f);
                    int parseFloat4 = (int) (Float.parseFloat(split2[1]) * 1000.0f);
                    this.f115316a = new Rect(Math.min(parseFloat, parseFloat2), Math.min(parseFloat3, parseFloat4), Math.max(parseFloat, parseFloat2), Math.max(parseFloat3, parseFloat4));
                } catch (NumberFormatException unused) {
                }
            }
        }
    }
}
