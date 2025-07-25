package p695h5;

import java.util.List;
import java.util.Map;
import p028b5.UserTagAdData;
import p040c5.ConfigData;
import p1068z4.UserTagInitParameter;

/* renamed from: h5.b */
/* loaded from: classes6.dex */
public interface IUserTagProcessor {

    /* compiled from: IUserTagProcessor.java */
    /* renamed from: h5.b$a */
    /* loaded from: classes6.dex */
    public enum EnumC33479a {
        INIT,
        SET_CONFIG,
        SET_AF_DATA,
        ON_AD_FILL,
        ON_AD_IMPRESSION,
        ADD_LOCAL_TAG,
        REMOVE_LOCAL_TAG,
        SET_MO_FLOW_DOMAIN_TAG,
        SET_PM_FLOW_DOMAIN_TAG
    }

    /* renamed from: a */
    void mo717a(UserTagAdData userTagAdData);

    /* renamed from: b */
    void mo716b(UserTagAdData userTagAdData);

    /* renamed from: c */
    void mo715c(UserTagInitParameter userTagInitParameter);

    /* renamed from: d */
    void mo714d(ConfigData configData);

    /* renamed from: e */
    void mo713e(String str, List<String> list);

    /* renamed from: f */
    void mo712f(String str);

    /* renamed from: g */
    void mo711g(Map<String, String> map);

    /* renamed from: h */
    void mo710h(Map<String, String> map);

    /* renamed from: i */
    void mo709i(String str, String str2);

    /* renamed from: j */
    void mo708j(Map<String, String> map);
}
