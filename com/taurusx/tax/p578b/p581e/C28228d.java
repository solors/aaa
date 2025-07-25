package com.taurusx.tax.p578b.p581e;

import android.content.Context;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p593d.C28305b;
import org.json.JSONException;
import org.json.JSONObject;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.b.e.d */
/* loaded from: classes7.dex */
public class C28228d implements C28305b.InterfaceC28306a {

    /* renamed from: a */
    public final /* synthetic */ String f73316a;

    /* renamed from: b */
    public final /* synthetic */ Context f73317b;

    /* renamed from: c */
    public final /* synthetic */ String f73318c;

    /* renamed from: d */
    public final /* synthetic */ JSONObject f73319d;

    public C28228d(String str, Context context, String str2, JSONObject jSONObject) {
        this.f73316a = str;
        this.f73317b = context;
        this.f73318c = str2;
        this.f73319d = jSONObject;
    }

    @Override // com.taurusx.tax.p593d.C28305b.InterfaceC28306a
    public void onResult(int i, String str, String str2) {
        if (i >= 200 && i < 400) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            String m23824a = stringFogImpl.m23824a(new byte[]{36, 39, 37, 52, 37, 53, 40, 107, 34, 35, 60, 35, 49, 53, 53}, new byte[]{80, 70});
            LogUtil.m37901iv(m23824a, this.f73316a + stringFogImpl.m23824a(new byte[]{-122, 68, -101, 69, -43, 85, -121, SignedBytes.MAX_POWER_OF_TWO, -106, 74, -43, 83, -112, 82, UnsignedBytes.MAX_POWER_OF_TWO, 77, -127, 1, -106, 78, -111, 68, -43, 27, -43, 122}, new byte[]{-11, 33}) + i + stringFogImpl.m23824a(new byte[]{-95, 86, -36, 23, -113, 29, -36, SignedBytes.MAX_POWER_OF_TWO, -36}, new byte[]{-4, 122}) + str);
            C28220b.m38389a(this.f73317b).m38390a();
            return;
        }
        StringFogImpl stringFogImpl2 = C28162a.f73047a;
        String m23824a2 = stringFogImpl2.m23824a(new byte[]{97, 126, 96, 109, 96, 108, 109, 50, 103, 122, 121, 122, 116, 108, 112}, new byte[]{21, 31});
        LogUtil.m37901iv(m23824a2, this.f73316a + stringFogImpl2.m23824a(new byte[]{-99, 70, UnsignedBytes.MAX_POWER_OF_TWO, 71, -50, 87, -100, 66, -115, 72, -50, 81, -117, 80, -101, 79, -102, 3, -115, 76, -118, 70, -50, 25, -50, 120}, new byte[]{-18, 35}) + i + stringFogImpl2.m23824a(new byte[]{-45, -77, -82, -14, -3, -8, -82, -91, -82}, new byte[]{-114, -97}) + str + stringFogImpl2.m23824a(new byte[]{Byte.MAX_VALUE, 11, Byte.MAX_VALUE, 82, 45, 75, Byte.MAX_VALUE, 29, Byte.MAX_VALUE}, new byte[]{95, 39}) + this.f73318c);
        try {
            this.f73319d.put(stringFogImpl2.m23824a(new byte[]{-43, 26, -52}, new byte[]{-96, 104}), this.f73318c);
            this.f73319d.put(stringFogImpl2.m23824a(new byte[]{-65, 107, -68, 123, -88, 125, -71}, new byte[]{-51, 14}), stringFogImpl2.m23824a(new byte[]{11, -56, 8, -45}, new byte[]{123, -89}));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Context context = this.f73317b;
        if (context != null) {
            C28220b.m38389a(context).m38385a(this.f73319d.toString());
        } else {
            C28220b.m38389a(TaurusXAds.getContext()).m38385a(this.f73319d.toString());
        }
    }
}
