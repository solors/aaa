package p650e5;

import p665f5.AdValueTag;
import p738j5.DataProcessUtils;

/* renamed from: e5.a */
/* loaded from: classes6.dex */
public class AdValueData extends BaseTagData<AdValueTag, Double> {
    public AdValueData(AdValueTag adValueTag) {
        super(adValueTag, Double.valueOf(0.0d));
    }

    /* renamed from: c */
    public static AdValueData m25500c(String str, double d) {
        AdValueTag[] values;
        for (AdValueTag adValueTag : AdValueTag.values()) {
            if (DataProcessUtils.m18555b(adValueTag.m24944b(), str)) {
                return new AdValueData(adValueTag, Double.valueOf(d));
            }
        }
        return new AdValueData(AdValueTag.UNSET);
    }

    public AdValueData(AdValueTag adValueTag, Double d) {
        super(adValueTag, d);
    }
}
