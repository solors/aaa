package net.pubnative.lite.sdk.models.request;

import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;

/* loaded from: classes10.dex */
public class DataExtension extends JsonModel {
    @BindField
    public String segclass;
    @BindField
    public Long segtax;

    public DataExtension(Long l, String str) {
        this.segtax = l;
        this.segclass = str;
    }
}
