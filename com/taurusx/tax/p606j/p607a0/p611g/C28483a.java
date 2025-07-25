package com.taurusx.tax.p606j.p607a0.p611g;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p606j.p607a0.C28467a;
import com.taurusx.tax.p606j.p607a0.C28469c;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.j.a0.g.a */
/* loaded from: classes7.dex */
public class C28483a extends C28467a {
    public C28483a(Context context) {
        super(context);
    }

    @Override // com.taurusx.tax.p606j.p607a0.C28467a
    /* renamed from: a */
    public C28469c mo38066a() {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        LogUtil.m37905d(stringFogImpl.m23824a(new byte[]{76, SignedBytes.MAX_POWER_OF_TWO, 77, 83, 77, 82, SignedBytes.MAX_POWER_OF_TWO}, new byte[]{56, 33}), stringFogImpl.m23824a(new byte[]{98, 72, 112, 78, 108, 23, 36, 3, 42, 3}, new byte[]{4, 45}));
        String str = "";
        try {
            Cursor query = this.f73901a.getContentResolver().query(Uri.parse(stringFogImpl.m23824a(new byte[]{-30, 65, -17, 90, -28, SignedBytes.MAX_POWER_OF_TWO, -11, 20, -82, 1, -30, 65, -20, 0, -9, 71, -9, 65, -81, 88, -20, 93, -81, 103, -27, 126, -13, 65, -9, 71, -27, 75, -13, 1, -56, 74, -28, SignedBytes.MAX_POWER_OF_TWO, -11, 71, -25, 71, -28, 92, -56, 74, -82, 97, -64, 103, -59}, new byte[]{-127, 46})), null, null, null, null);
            if (query != null) {
                if (query.moveToNext()) {
                    str = query.getString(query.getColumnIndex(stringFogImpl.m23824a(new byte[]{-51, 72, -41, 92, -34}, new byte[]{-69, 41})));
                } else {
                    str = null;
                }
                query.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            StringFogImpl stringFogImpl2 = C28162a.f73047a;
            String m23824a = stringFogImpl2.m23824a(new byte[]{41, 48, 40, 35, 40, 34, 37}, new byte[]{93, 81});
            LogUtil.m37905d(m23824a, stringFogImpl2.m23824a(new byte[]{-26, 59, -12, 61, -24, 100, -96, 47, -11, 59, -14, 39, -96, 46, -14, 49, -10, 55, -28, 59, -14, 126, -27, 38, -29, 59, -16, 42, -23, 49, -18, 126}, new byte[]{UnsignedBytes.MAX_POWER_OF_TWO, 94}) + e);
        } catch (Throwable th) {
            th.printStackTrace();
            StringFogImpl stringFogImpl3 = C28162a.f73047a;
            String m23824a2 = stringFogImpl3.m23824a(new byte[]{13, 17, 12, 2, 12, 3, 1}, new byte[]{121, 112});
            LogUtil.m37905d(m23824a2, stringFogImpl3.m23824a(new byte[]{-107, -10, -121, -16, -101, -87, -45, -30, -122, -10, -127, -22, -45, -29, -127, -4, -123, -6, -105, -10, -127, -77, -106, -21, -112, -10, -125, -25, -102, -4, -99, -77}, new byte[]{-13, -109}) + th);
        }
        if (!TextUtils.isEmpty(str)) {
            StringFogImpl stringFogImpl4 = C28162a.f73047a;
            String m23824a3 = stringFogImpl4.m23824a(new byte[]{-42, -48, -41, -61, -41, -62, -38}, new byte[]{-94, -79});
            LogUtil.m37905d(m23824a3, stringFogImpl4.m23824a(new byte[]{116, -125, 102, -123, 122, -36, 50, -127, 119, -110, 50, -87, 83, -81, 86, -58, 97, -109, 113, -123, 119, -107, 97, -57, 50, -87, 83, -81, 86, -58, 123, -107, 50}, new byte[]{18, -26}) + str);
            return new C28469c(str, false);
        }
        StringFogImpl stringFogImpl5 = C28162a.f73047a;
        LogUtil.m37905d(stringFogImpl5.m23824a(new byte[]{116, -93, 117, -80, 117, -79, 120}, new byte[]{0, -62}), stringFogImpl5.m23824a(new byte[]{-104, 15, -118, 9, -106, 80, -34, 13, -101, 30, -34, 37, -65, 35, -70, 74, -104, 11, -105, 6, -101, 14, -33}, new byte[]{-2, 106}));
        return null;
    }
}
