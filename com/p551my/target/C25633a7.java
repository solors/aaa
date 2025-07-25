package com.p551my.target;

import android.content.Context;
import android.text.TextUtils;
import com.p551my.target.common.models.ImageData;
import org.json.JSONObject;

/* renamed from: com.my.target.a7 */
/* loaded from: classes7.dex */
public class C25633a7 {

    /* renamed from: a */
    public final C25752f7 f66606a;

    /* renamed from: b */
    public final C25625a1 f66607b;

    public C25633a7(C25752f7 c25752f7, C26073s c26073s, C25832j c25832j, Context context) {
        this.f66606a = c25752f7;
        this.f66607b = C25625a1.m44252a(c26073s, c25832j, context);
    }

    /* renamed from: a */
    public static C25633a7 m44228a(C25752f7 c25752f7, C26073s c26073s, C25832j c25832j, Context context) {
        return new C25633a7(c25752f7, c26073s, c25832j, context);
    }

    /* renamed from: a */
    public void m44227a(JSONObject jSONObject, C26272z6 c26272z6) {
        this.f66607b.m44250a(jSONObject, c26272z6);
        c26272z6.setHasNotification(jSONObject.optBoolean("hasNotification", c26272z6.isHasNotification()));
        c26272z6.setBanner(jSONObject.optBoolean("Banner", c26272z6.isBanner()));
        c26272z6.setRequireCategoryHighlight(jSONObject.optBoolean("RequireCategoryHighlight", c26272z6.isRequireCategoryHighlight()));
        c26272z6.setItemHighlight(jSONObject.optBoolean("ItemHighlight", c26272z6.isItemHighlight()));
        c26272z6.setMain(jSONObject.optBoolean("Main", c26272z6.isMain()));
        c26272z6.setRequireWifi(jSONObject.optBoolean("RequireWifi", c26272z6.isRequireWifi()));
        c26272z6.setSubItem(jSONObject.optBoolean("subitem", c26272z6.isSubItem()));
        c26272z6.setBubbleId(jSONObject.optString("bubble_id", c26272z6.getBubbleId()));
        c26272z6.setLabelType(jSONObject.optString("labelType", c26272z6.getLabelType()));
        c26272z6.setStatus(jSONObject.optString("status", c26272z6.getStatus()));
        c26272z6.setMrgsId(jSONObject.optInt("mrgs_id"));
        c26272z6.setCoins(jSONObject.optInt("coins"));
        c26272z6.setCoinsIconBgColor(AbstractC26267z4.m42255a(jSONObject, "coins_icon_bgcolor", c26272z6.getCoinsIconBgColor()));
        c26272z6.setCoinsIconTextColor(AbstractC26267z4.m42255a(jSONObject, "coins_icon_textcolor", c26272z6.getCoinsIconTextColor()));
        String optString = jSONObject.optString("icon_hd");
        if (!TextUtils.isEmpty(optString)) {
            c26272z6.setIcon(ImageData.newImageData(optString));
        }
        String optString2 = jSONObject.optString("coins_icon_hd");
        if (!TextUtils.isEmpty(optString2)) {
            c26272z6.setCoinsIcon(ImageData.newImageData(optString2));
        }
        String optString3 = jSONObject.optString("cross_notif_icon_hd");
        if (!TextUtils.isEmpty(optString3)) {
            c26272z6.setCrossNotifIcon(ImageData.newImageData(optString3));
        }
        String m43923d = this.f66606a.m43923d();
        if (!TextUtils.isEmpty(m43923d)) {
            c26272z6.setBubbleIcon(ImageData.newImageData(m43923d));
        }
        String m43921e = this.f66606a.m43921e();
        if (!TextUtils.isEmpty(m43921e)) {
            c26272z6.setGotoAppIcon(ImageData.newImageData(m43921e));
        }
        String m43915h = this.f66606a.m43915h();
        if (!TextUtils.isEmpty(m43915h)) {
            c26272z6.setLabelIcon(ImageData.newImageData(m43915h));
        }
        String status = c26272z6.getStatus();
        if (status != null) {
            String m43929a = this.f66606a.m43929a(status);
            if (!TextUtils.isEmpty(m43929a)) {
                c26272z6.setStatusIcon(ImageData.newImageData(m43929a));
            }
        }
        String m43917g = this.f66606a.m43917g();
        if (!c26272z6.isItemHighlight() || TextUtils.isEmpty(m43917g)) {
            return;
        }
        c26272z6.setItemHighlightIcon(ImageData.newImageData(m43917g));
    }
}
