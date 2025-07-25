package com.amazon.device.ads;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MraidCloseCommand extends MraidCommand {
    static final String NAME = "close";

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getMraidName() {
        return "close";
    }

    @Override // com.amazon.device.ads.MraidCommand
    public void execute(JSONObject jSONObject, DTBAdMRAIDController dTBAdMRAIDController) {
        dTBAdMRAIDController.onMRAIDClose();
    }

    @Override // com.amazon.device.ads.MraidCommand
    public String getName() {
        return "close";
    }
}
