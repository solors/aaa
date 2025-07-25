package p1068z4;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p695h5.IUserTagProcessor;
import p738j5.EventUtils;
import p738j5.LogUtils;

/* renamed from: z4.e */
/* loaded from: classes6.dex */
public class UserTagDataManager {

    /* renamed from: a */
    private final String f118720a;

    /* renamed from: b */
    private final UserTagData f118721b;

    /* renamed from: c */
    private Map<String, String> f118722c;

    /* renamed from: d */
    private final List<UserTagUpdateListener> f118723d;

    /* renamed from: e */
    private final Map<String, List<UserTagUpdateListener>> f118724e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UserTagDataManager.java */
    /* renamed from: z4.e$b */
    /* loaded from: classes6.dex */
    public static class C45124b {

        /* renamed from: a */
        private static final UserTagDataManager f118725a = new UserTagDataManager();
    }

    /* renamed from: b */
    public static UserTagDataManager m774b() {
        return C45124b.f118725a;
    }

    /* renamed from: a */
    public void m775a(UserTagUpdateListener userTagUpdateListener) {
        if (userTagUpdateListener != null && !this.f118723d.contains(userTagUpdateListener)) {
            this.f118723d.add(userTagUpdateListener);
            userTagUpdateListener.mo695a(this.f118721b);
        }
    }

    /* renamed from: c */
    public UserTagData m773c() {
        return this.f118721b;
    }

    /* renamed from: d */
    public void m772d(IUserTagProcessor.EnumC33479a enumC33479a) {
        Map<String, String> m825a = this.f118721b.m825a();
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(this.f118722c.keySet());
        hashSet.addAll(m825a.keySet());
        boolean z = true;
        for (String str : hashSet) {
            if (!TextUtils.equals(this.f118722c.get(str), m825a.get(str))) {
                if (enumC33479a != IUserTagProcessor.EnumC33479a.INIT) {
                    LogUtils.m18537b("UserTag_UpdateManager", "notifyUserDataUpdate tagKey: " + str);
                }
                m771e(str);
                z = false;
            }
        }
        if (z) {
            return;
        }
        this.f118722c = m825a;
        LogUtils.m18537b("UserTag_UpdateManager", "notifyUserDataUpdate: " + this.f118721b);
        EventUtils.m18544a(this.f118721b.m824b(), enumC33479a);
        if (!this.f118723d.isEmpty()) {
            for (UserTagUpdateListener userTagUpdateListener : this.f118723d) {
                userTagUpdateListener.mo695a(this.f118721b);
            }
        }
    }

    /* renamed from: e */
    public void m771e(String str) {
        List<UserTagUpdateListener> list = this.f118724e.get(str);
        if (list == null) {
            return;
        }
        for (UserTagUpdateListener userTagUpdateListener : list) {
            userTagUpdateListener.mo695a(this.f118721b);
        }
    }

    private UserTagDataManager() {
        this.f118720a = "UserTag_UpdateManager";
        UserTagData userTagData = new UserTagData();
        this.f118721b = userTagData;
        this.f118722c = userTagData.m825a();
        this.f118723d = new ArrayList();
        this.f118724e = new HashMap();
    }
}
