package com.amazon.device.ads;

import com.maticoo.sdk.mraid.Consts;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MraidProperty.java */
/* loaded from: classes2.dex */
class OrientationProperty extends MraidProperty {
    boolean allowOrientationChange;
    boolean forceOrientation;

    OrientationProperty(Map<String, String> map) {
        super("orientationProperty");
        this.allowOrientationChange = Boolean.parseBoolean(map.get(Consts.OrientationPpropertiesAllowOrientationChange));
        this.forceOrientation = Boolean.parseBoolean(map.get(Consts.OrientationPpropertiesForceOrientation));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.amazon.device.ads.MraidProperty
    public void formJSON(JSONObject jSONObject) throws JSONException {
    }
}
