package com.bykv.p135vk.openvk.preload.geckox.model;

import com.bykv.p135vk.openvk.preload.p155a.p156a.SerializedName;
import java.util.List;
import java.util.Map;

/* renamed from: com.bykv.vk.openvk.preload.geckox.model.ComponentModel */
/* loaded from: classes3.dex */
public class ComponentModel {
    @SerializedName(m91667a = "packages")
    private Map<String, List<UpdatePackage>> packages;
    @SerializedName(m91667a = "universal_strategies")
    private Map<String, C6648a> universalStrategies;

    /* renamed from: com.bykv.vk.openvk.preload.geckox.model.ComponentModel$a */
    /* loaded from: classes3.dex */
    public static class C6648a {
    }

    public Map<String, List<UpdatePackage>> getPackages() {
        return this.packages;
    }

    public Map<String, C6648a> getUniversalStrategies() {
        return this.universalStrategies;
    }
}
