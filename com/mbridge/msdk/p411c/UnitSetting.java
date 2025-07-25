package com.mbridge.msdk.p411c;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.c.k */
/* loaded from: classes6.dex */
public final class UnitSetting extends BaseUnitSetting {
    /* renamed from: c */
    public static UnitSetting m53252c(String str) {
        UnitSetting unitSetting = new UnitSetting();
        try {
            unitSetting.m53341b(str);
            unitSetting.m53312p(1);
            unitSetting.m53316n(1);
            unitSetting.m53314o(5);
            unitSetting.m53338c(1);
            unitSetting.m53336d(1);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("UnitSetting", e.getMessage());
            }
        }
        return unitSetting;
    }

    /* renamed from: d */
    public static UnitSetting m53251d(String str) {
        UnitSetting unitSetting = new UnitSetting();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(8);
        arrayList2.add(8);
        unitSetting.m53312p(1);
        unitSetting.m53341b(str);
        unitSetting.m53345a(arrayList);
        unitSetting.m53340b(arrayList2);
        unitSetting.m53316n(1);
        unitSetting.m53338c(-2);
        unitSetting.m53336d(-2);
        unitSetting.m53314o(5);
        unitSetting.m53347a(3600L);
        unitSetting.m53328h(2);
        unitSetting.m53348a(1);
        unitSetting.m53320l(100);
        unitSetting.m53334e(0);
        unitSetting.m53332f(1);
        unitSetting.m53326i(0);
        unitSetting.m53318m(60);
        unitSetting.m53324j(10);
        unitSetting.m53322k(60);
        return unitSetting;
    }

    /* renamed from: e */
    public static UnitSetting m53250e(String str) {
        UnitSetting unitSetting = new UnitSetting();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(1);
            unitSetting.m53345a(arrayList);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(30);
            unitSetting.m53340b(arrayList2);
            unitSetting.m53341b(str);
            unitSetting.m53312p(1);
            unitSetting.m53316n(1);
            unitSetting.m53338c(-2);
            unitSetting.m53336d(-2);
            unitSetting.m53314o(5);
            unitSetting.m53347a(3600L);
            unitSetting.m53328h(2);
            unitSetting.m53348a(3);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51824b("UnitSetting", e.getMessage());
            }
        }
        return unitSetting;
    }

    /* renamed from: f */
    public static UnitSetting m53249f(String str) {
        UnitSetting m53247y = m53247y();
        m53247y.m53348a(0);
        return m53247y;
    }

    /* renamed from: g */
    public static UnitSetting m53248g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return BaseUnitSetting.m53344a(new JSONObject(str));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                SameLogTool.m51823b("UnitSetting", "parseSetting", e);
            }
            return null;
        }
    }

    /* renamed from: y */
    public static UnitSetting m53247y() {
        return new UnitSetting();
    }
}
