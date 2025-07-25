package sg.bigo.ads.controller.p947c;

import androidx.annotation.NonNull;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.core.InterfaceC43550c;

/* renamed from: sg.bigo.ads.controller.c.f */
/* loaded from: classes10.dex */
public final class C43985f implements InterfaceC43550c.InterfaceC43551a {

    /* renamed from: a */
    private final int f115313a;

    /* renamed from: b */
    private final int f115314b;

    /* renamed from: c */
    private final List<Object> f115315c = new ArrayList();

    public C43985f(@NonNull JSONObject jSONObject) {
        this.f115313a = jSONObject.optInt(CampaignEx.JSON_KEY_CLICK_MODE, 2);
        this.f115314b = jSONObject.optInt("wrong_click_time", 500);
        JSONArray optJSONArray = jSONObject.optJSONArray("reconfirm_click_region");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    this.f115315c.add(new C43986g(optJSONObject));
                }
            }
        }
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43551a
    /* renamed from: a */
    public final int mo4313a() {
        return this.f115313a;
    }

    @Override // sg.bigo.ads.api.core.InterfaceC43550c.InterfaceC43551a
    /* renamed from: b */
    public final int mo4312b() {
        return this.f115314b;
    }
}
