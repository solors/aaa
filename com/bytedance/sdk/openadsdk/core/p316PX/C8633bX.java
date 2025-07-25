package com.bytedance.sdk.openadsdk.core.p316PX;

import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import com.bytedance.sdk.openadsdk.core.p316PX.p317IL.C8622bX;
import com.bytedance.sdk.openadsdk.core.p316PX.p318bX.C8637bg;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.PX.bX */
/* loaded from: classes3.dex */
public class C8633bX {

    /* renamed from: IL */
    protected int f19037IL;

    /* renamed from: Kg */
    protected String f19038Kg;

    /* renamed from: PX */
    private AbstractC8967tuV f19039PX;

    /* renamed from: VB */
    private final AtomicBoolean f19040VB = new AtomicBoolean(false);

    /* renamed from: WR */
    protected String f19041WR = "endcard_click";

    /* renamed from: bX */
    protected C8637bg.EnumC8641bg f19042bX;

    /* renamed from: bg */
    protected int f19043bg;

    /* renamed from: eo */
    private String f19044eo;
    protected C8637bg.EnumC8640IL eqN;

    /* renamed from: iR */
    protected List<C8622bX> f19045iR;
    protected List<C8622bX> ldr;

    /* renamed from: zx */
    protected String f19046zx;

    /* renamed from: com.bytedance.sdk.openadsdk.core.PX.bX$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C86341 {

        /* renamed from: bg */
        static final /* synthetic */ int[] f19047bg;

        static {
            int[] iArr = new int[C8637bg.EnumC8640IL.values().length];
            f19047bg = iArr;
            try {
                iArr[C8637bg.EnumC8640IL.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19047bg[C8637bg.EnumC8640IL.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19047bg[C8637bg.EnumC8640IL.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C8633bX(int i, int i2, C8637bg.EnumC8641bg enumC8641bg, C8637bg.EnumC8640IL enumC8640IL, String str, List<C8622bX> list, List<C8622bX> list2, String str2) {
        this.ldr = new ArrayList();
        this.f19045iR = new ArrayList();
        this.f19043bg = i;
        this.f19037IL = i2;
        this.f19042bX = enumC8641bg;
        this.eqN = enumC8640IL;
        this.f19046zx = str;
        this.ldr = list;
        this.f19045iR = list2;
        this.f19038Kg = str2;
    }

    /* renamed from: IL */
    public int m85496IL() {
        return this.f19043bg;
    }

    /* renamed from: bX */
    public int m85493bX() {
        return this.f19037IL;
    }

    /* renamed from: bg */
    public void m85490bg(long j) {
        C8622bX.m85514bg(this.ldr, null, j, this.f19044eo, new C8622bX.C8626IL(this.f19041WR, this.f19039PX));
    }

    public String eqN() {
        int i = C86341.f19047bg[this.eqN.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.f19043bg + "\" height=\"" + this.f19037IL + "\" src=\"" + this.f19046zx + "\"></iframe>";
                }
                return null;
            }
            return this.f19046zx;
        }
        C8637bg.EnumC8641bg enumC8641bg = this.f19042bX;
        if (enumC8641bg == C8637bg.EnumC8641bg.IMAGE) {
            return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.f19046zx + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
        } else if (enumC8641bg == C8637bg.EnumC8641bg.JAVASCRIPT) {
            return "<script src=\"" + this.f19046zx + "\"></script>";
        } else {
            return null;
        }
    }

    public String ldr() {
        return this.f19046zx;
    }

    /* renamed from: zx */
    public String m85486zx() {
        if (this.eqN == C8637bg.EnumC8640IL.STATIC_RESOURCE && this.f19042bX == C8637bg.EnumC8641bg.IMAGE) {
            return this.f19046zx;
        }
        return null;
    }

    /* renamed from: bg */
    public static float m85491bg(int i, int i2, int i3, int i4, C8637bg.EnumC8640IL enumC8640IL, C8637bg.EnumC8641bg enumC8641bg) {
        if (i2 == 0 || i4 == 0) {
            return 0.0f;
        }
        float f = i;
        float f2 = i3;
        return m85489bg(enumC8640IL, enumC8641bg) / ((Math.abs((f / i2) - (f2 / i4)) + Math.abs((f - f2) / f)) + 1.0f);
    }

    /* renamed from: IL */
    public void m85495IL(long j) {
        if (this.f19040VB.compareAndSet(false, true)) {
            C8622bX.m85523IL(this.f19045iR, null, j, this.f19044eo);
        }
    }

    /* renamed from: IL */
    public static C8633bX m85494IL(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        String optString = jSONObject.optString("creativeType", C8637bg.EnumC8641bg.NONE.toString());
        String optString2 = jSONObject.optString("resourceType", C8637bg.EnumC8640IL.HTML_RESOURCE.toString());
        String optString3 = jSONObject.optString("contentUrl");
        String optString4 = jSONObject.optString("clickThroughUri");
        JSONArray optJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(new C8622bX.C8628bg(optJSONArray.optString(i)).m85507bg());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
            arrayList2.add(new C8622bX.C8628bg(optJSONArray2.optString(i2)).m85507bg());
        }
        return new C8633bX(optInt, optInt2, C8637bg.EnumC8641bg.valueOf(optString), C8637bg.EnumC8640IL.valueOf(optString2), optString3, arrayList, arrayList2, optString4);
    }

    /* renamed from: bg */
    private static float m85489bg(C8637bg.EnumC8640IL enumC8640IL, C8637bg.EnumC8641bg enumC8641bg) {
        int i = C86341.f19047bg[enumC8640IL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        } else if (C8637bg.EnumC8641bg.JAVASCRIPT.equals(enumC8641bg)) {
            return 1.0f;
        } else {
            return C8637bg.EnumC8641bg.IMAGE.equals(enumC8641bg) ? 0.8f : 0.0f;
        }
    }

    /* renamed from: bg */
    public void m85487bg(String str) {
        this.f19044eo = str;
    }

    /* renamed from: bg */
    public JSONObject mo85492bg() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.f19043bg);
        jSONObject.put("height", this.f19037IL);
        jSONObject.put("creativeType", this.f19042bX.toString());
        jSONObject.put("resourceType", this.eqN.toString());
        jSONObject.put("contentUrl", this.f19046zx);
        jSONObject.put("clickThroughUri", this.f19038Kg);
        jSONObject.put("clickTrackers", C8622bX.m85517bg(this.ldr));
        jSONObject.put("creativeViewTrackers", C8622bX.m85517bg(this.f19045iR));
        return jSONObject;
    }

    /* renamed from: bg */
    public void m85488bg(AbstractC8967tuV abstractC8967tuV) {
        this.f19039PX = abstractC8967tuV;
    }
}
