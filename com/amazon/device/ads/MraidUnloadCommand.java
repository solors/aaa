package com.amazon.device.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class MraidUnloadCommand extends MraidCommand {
    static final String NAME = "unload";

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getMraidName() {
        return "unload";
    }

    @Override // com.amazon.device.ads.MraidCommand
    public void execute(JSONObject jSONObject, DTBAdMRAIDController dTBAdMRAIDController) throws JSONException {
        dTBAdMRAIDController.onMRAIDUnload();
    }

    @Override // com.amazon.device.ads.MraidCommand
    public String getName() {
        return "unload";
    }
}
