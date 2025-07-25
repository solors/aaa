package com.mbridge.msdk.foundation.controller.authoritycontroller;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.p411c.Setting;
import com.mbridge.msdk.p411c.SettingManager;
import com.mbridge.msdk.p411c.SettingManagerDiff;

/* renamed from: com.mbridge.msdk.foundation.controller.authoritycontroller.c */
/* loaded from: classes6.dex */
public class SDKAuthorityController extends BaseSDKAuthorityController {

    /* renamed from: c */
    private static volatile SDKAuthorityController f56122c;

    private SDKAuthorityController() {
        m52764c();
    }

    /* renamed from: c */
    public static void m52752c(boolean z) {
    }

    /* renamed from: j */
    public static SDKAuthorityController m52751j() {
        if (f56122c == null) {
            synchronized (SDKAuthorityController.class) {
                if (f56122c == null) {
                    f56122c = new SDKAuthorityController();
                }
            }
        }
        return f56122c;
    }

    /* renamed from: k */
    public static boolean m52750k() {
        return true;
    }

    @Override // com.mbridge.msdk.foundation.controller.authoritycontroller.BaseSDKAuthorityController
    /* renamed from: b */
    public final int mo52754b(String str) {
        Setting m53279b = SettingManager.m53286a().m53279b(MBSDKContext.m52746m().m52779k());
        if (m53279b == null) {
            SettingManager.m53286a();
            m53279b = SettingManagerDiff.m53265a();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return m53279b.m53440aw();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return m53279b.m53441av();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
            return m53279b.m53439ax();
        }
        return -1;
    }

    /* renamed from: c */
    public final boolean m52753c(String str) {
        boolean z;
        Setting m53279b = SettingManager.m53286a().m53279b(MBSDKContext.m52746m().m52779k());
        boolean z2 = true;
        if (m53279b == null) {
            SettingManager.m53286a();
            m53279b = SettingManagerDiff.m53265a();
            z = true;
        } else {
            z = false;
        }
        int m53452ak = m53279b.m53452ak();
        boolean z3 = m53452ak != 0 ? m53452ak == 1 && mo52754b(str) == 1 : m52770a(str) == 1 && mo52754b(str) == 1;
        if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
            z3 = m52770a(str) == 1;
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID) && m52751j().m52758g() == 2) {
            if (m53279b.m53467aH() || z || m52770a(str) != 1) {
                z2 = false;
            }
            return z2;
        }
        return z3;
    }
}
