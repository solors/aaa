package p695h5;

import android.content.Context;
import java.util.List;
import java.util.Map;
import p028b5.UserTagAdData;
import p040c5.ConfigData;
import p1068z4.UserTagData;
import p682g5.SpManager;

/* renamed from: h5.a */
/* loaded from: classes6.dex */
public abstract class BaseUserTagProcessor implements IUserTagProcessor {

    /* renamed from: a */
    private final UserTagData f91338a;

    public BaseUserTagProcessor(UserTagData userTagData) {
        this.f91338a = userTagData;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public static SpManager.C33210c m23695k(Context context) {
        return SpManager.m24298a().m24297b(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public static SpManager.C33210c m23694l(Context context) {
        return SpManager.m24298a().m24296c(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public static SpManager.C33210c m23693m(Context context) {
        return SpManager.m24298a().m24295d(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: n */
    public static SpManager.C33210c m23692n(Context context) {
        return SpManager.m24298a().m24294e(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: o */
    public static SpManager.C33210c m23691o(Context context) {
        return SpManager.m24298a().m24293f(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: p */
    public static SpManager.C33210c m23690p(Context context) {
        return SpManager.m24298a().m24292g(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: q */
    public static SpManager.C33210c m23689q(Context context) {
        return SpManager.m24298a().m24291h(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public static SpManager.C33210c m23688r(Context context) {
        return SpManager.m24298a().m24289j(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public UserTagData m23687s() {
        return this.f91338a;
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: a */
    public void mo717a(UserTagAdData userTagAdData) {
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: b */
    public void mo716b(UserTagAdData userTagAdData) {
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: d */
    public void mo714d(ConfigData configData) {
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: f */
    public void mo712f(String str) {
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: g */
    public void mo711g(Map<String, String> map) {
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: h */
    public void mo710h(Map<String, String> map) {
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: j */
    public void mo708j(Map<String, String> map) {
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: e */
    public void mo713e(String str, List<String> list) {
    }

    @Override // p695h5.IUserTagProcessor
    /* renamed from: i */
    public void mo709i(String str, String str2) {
    }
}
