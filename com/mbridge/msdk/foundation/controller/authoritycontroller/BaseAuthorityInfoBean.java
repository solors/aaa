package com.mbridge.msdk.foundation.controller.authoritycontroller;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.p428a.p429a.SharedPerferenceManager;

/* renamed from: com.mbridge.msdk.foundation.controller.authoritycontroller.a */
/* loaded from: classes6.dex */
public class BaseAuthorityInfoBean {
    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m52777a(int i) {
        SharedPerferenceManager.m52898a().m52894a(MBridgeConstans.AUTHORITY_GENERAL_DATA, String.valueOf(i));
        SharedPerferenceManager.m52898a().m52894a(MBridgeConstans.AUTHORITY_DEVICE_ID, String.valueOf(i));
        SharedPerferenceManager.m52898a().m52894a(MBridgeConstans.AUTHORITY_SERIAL_ID, String.valueOf(i));
    }

    public void authDeviceIdStatus(int i) {
        SharedPerferenceManager.m52898a().m52894a(MBridgeConstans.AUTHORITY_DEVICE_ID, String.valueOf(i));
    }

    public void authGenDataStatus(int i) {
        SharedPerferenceManager.m52898a().m52894a(MBridgeConstans.AUTHORITY_GENERAL_DATA, String.valueOf(i));
    }

    public void authOther(int i) {
        SharedPerferenceManager.m52898a().m52894a(MBridgeConstans.AUTHORITY_OTHER, String.valueOf(i));
    }

    public void authSerialIdStatus(int i) {
        SharedPerferenceManager.m52898a().m52894a(MBridgeConstans.AUTHORITY_SERIAL_ID, String.valueOf(i));
    }

    public int getAuthDeviceIdStatus() {
        if (!SharedPerferenceManager.m52898a().m52897a(MBridgeConstans.AUTHORITY_DEVICE_ID).equals("")) {
            return Integer.parseInt(SharedPerferenceManager.m52898a().m52897a(MBridgeConstans.AUTHORITY_DEVICE_ID));
        }
        return 1;
    }

    public int getAuthGenDataStatus() {
        if (!SharedPerferenceManager.m52898a().m52897a(MBridgeConstans.AUTHORITY_GENERAL_DATA).equals("")) {
            return Integer.parseInt(SharedPerferenceManager.m52898a().m52897a(MBridgeConstans.AUTHORITY_GENERAL_DATA));
        }
        return 1;
    }

    public int getAuthSerialIdStatus() {
        if (!SharedPerferenceManager.m52898a().m52897a(MBridgeConstans.AUTHORITY_SERIAL_ID).equals("")) {
            return Integer.parseInt(SharedPerferenceManager.m52898a().m52897a(MBridgeConstans.AUTHORITY_SERIAL_ID));
        }
        return 1;
    }
}
