package com.amazon.device.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MraidUseCustomCloseCommand extends MraidCommand {
    static final String NAME = "useCustomClose";

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getMraidName() {
        return "useCustomClose";
    }

    @Override // com.amazon.device.ads.MraidCommand
    public void execute(JSONObject jSONObject, DTBAdMRAIDController dTBAdMRAIDController) throws JSONException {
        dTBAdMRAIDController.setUseCustomClose(jSONObject.getBoolean("state"));
    }

    @Override // com.amazon.device.ads.MraidCommand
    public String getName() {
        return "useCustomClose";
    }
}
