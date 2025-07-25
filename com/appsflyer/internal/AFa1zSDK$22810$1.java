package com.appsflyer.internal;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C21018tj;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class AFa1zSDK$22810$1 extends HashMap<String, String> {
    private /* synthetic */ Object AFInAppEventType$6c23efdc;

    public AFa1zSDK$22810$1(Object obj) {
        this.AFInAppEventType$6c23efdc = obj;
        put("aa", KeyConstants.Device.KEY_RO_ARCH);
        put(ImpressionData.IMPRESSION_DATA_KEY_ABTEST, KeyConstants.Device.KEY_RO_CHIPNAME);
        put(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, KeyConstants.Device.KEY_RO_BRIDGE);
        put("ad", KeyConstants.Device.KEY_NATIVE_BRIDGE);
        put(ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTEREVENT, KeyConstants.Device.KEY_RO_BRIDGE_EXEC);
        put(ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT, KeyConstants.Device.KEY_ISA_X86_FEATURES);
        put("ag", KeyConstants.Device.KEY_ISA_X86_VARIANT);
        put("ah", KeyConstants.Device.KEY_RO_ZYGOTE);
        put("ai", KeyConstants.Device.KEY_RO_MOCK_LOCATION);
        put("aj", KeyConstants.Device.KEY_RO_ISA_ARM);
        put("ak", KeyConstants.Device.KEY_ISA_ARM_FEATURES);
        put(CampaignEx.JSON_KEY_AD_AL, KeyConstants.Device.KEY_ISA_ARM_VARIANT);
        put("am", KeyConstants.Device.KEY_ISA_ARM64_FEATURES);
        put("an", KeyConstants.Device.KEY_ISA_ARM64_VARIANT);
        put("ao", "vzw.os.rooted");
        put(C21018tj.f53566c, KeyConstants.Device.KEY_RO_BUILD_USER);
        put("aq", KeyConstants.Device.KEY_RO_KERNEL_QEMU);
        put("ar", KeyConstants.Device.KEY_RO_HARDWARE);
        put(KeyConstants.Android.KEY_AS, KeyConstants.Device.KEY_RO_CPU_ABI);
        put("at", "ro.product.cpu.abilist");
        put("au", "ro.product.cpu.abilist32");
        put("av", KeyConstants.Device.KEY_RO_CPU_ABI_LIST_64);
    }
}
