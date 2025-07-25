package p1068z4;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import com.learnings.usertag.debug.UserTagDebugActivity;
import com.learnings.usertag.debug.UserTagDebugManager;
import java.util.List;
import java.util.Map;
import p006a5.AfDataManager;
import p006a5.AfDataUpdateListener;
import p738j5.LogUtils;
import p738j5.ThreadUtils;

/* renamed from: z4.p */
/* loaded from: classes6.dex */
public class UserTagDispatcher {

    /* renamed from: a */
    private volatile boolean f118738a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UserTagDispatcher.java */
    /* renamed from: z4.p$b */
    /* loaded from: classes6.dex */
    public static class C45136b {

        /* renamed from: a */
        private static final UserTagDispatcher f118739a = new UserTagDispatcher();
    }

    /* renamed from: A */
    public static /* synthetic */ void m769A(String str) {
        UserTagDebugManager.m53572a().m53566g(str);
    }

    /* renamed from: o */
    public static UserTagDispatcher m748o() {
        return C45136b.f118739a;
    }

    /* renamed from: r */
    public static /* synthetic */ void m745r(AfDataUpdateListener afDataUpdateListener) {
        AfDataManager.m105854b().m105855a(afDataUpdateListener);
    }

    /* renamed from: s */
    public static /* synthetic */ void m744s(String str, String str2) {
        UserTagProcessorManager.m705m().mo709i(str, str2);
    }

    /* renamed from: t */
    public static /* synthetic */ void m743t(String str, List list) {
        UserTagProcessorManager.m705m().mo713e(str, list);
    }

    /* renamed from: u */
    public static /* synthetic */ void m742u(UserTagUpdateListener userTagUpdateListener) {
        UserTagDataManager.m774b().m775a(userTagUpdateListener);
    }

    /* renamed from: v */
    public static /* synthetic */ void m741v(Activity activity) {
        activity.startActivity(new Intent(activity, UserTagDebugActivity.class));
    }

    /* renamed from: w */
    public static /* synthetic */ void m740w(String str) {
        UserTagProcessorManager.m705m().mo712f(str);
    }

    /* renamed from: x */
    public static /* synthetic */ void m739x(Map map) {
        UserTagProcessorManager.m705m().mo708j(map);
    }

    /* renamed from: y */
    public static /* synthetic */ void m738y(Map map) {
        UserTagProcessorManager.m705m().mo710h(map);
    }

    /* renamed from: z */
    public static /* synthetic */ void m737z(Map map) {
        UserTagProcessorManager.m705m().mo711g(map);
    }

    /* renamed from: B */
    public void m768B(final Activity activity) {
        if (activity == null) {
            return;
        }
        ThreadUtils.m18526a(new Runnable() { // from class: z4.k
            @Override // java.lang.Runnable
            public final void run() {
                UserTagDispatcher.m741v(activity);
            }
        });
    }

    /* renamed from: C */
    public void m767C(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ThreadUtils.m18526a(new Runnable() { // from class: z4.j
            @Override // java.lang.Runnable
            public final void run() {
                UserTagDispatcher.m740w(str);
            }
        });
    }

    /* renamed from: D */
    public void m766D(final Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            ThreadUtils.m18526a(new Runnable() { // from class: z4.h
                @Override // java.lang.Runnable
                public final void run() {
                    UserTagDispatcher.m739x(map);
                }
            });
        }
    }

    /* renamed from: E */
    public void m765E(final Map<String, String> map) {
        ThreadUtils.m18526a(new Runnable() { // from class: z4.i
            @Override // java.lang.Runnable
            public final void run() {
                UserTagDispatcher.m738y(map);
            }
        });
    }

    /* renamed from: F */
    public void m764F(final Map<String, String> map) {
        ThreadUtils.m18526a(new Runnable() { // from class: z4.l
            @Override // java.lang.Runnable
            public final void run() {
                UserTagDispatcher.m737z(map);
            }
        });
    }

    /* renamed from: G */
    public void m763G(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ThreadUtils.m18526a(new Runnable() { // from class: z4.f
            @Override // java.lang.Runnable
            public final void run() {
                UserTagDispatcher.m769A(str);
            }
        });
    }

    /* renamed from: k */
    public void m752k(final AfDataUpdateListener afDataUpdateListener) {
        if (afDataUpdateListener == null) {
            return;
        }
        ThreadUtils.m18526a(new Runnable() { // from class: z4.n
            @Override // java.lang.Runnable
            public final void run() {
                UserTagDispatcher.m745r(afDataUpdateListener);
            }
        });
    }

    /* renamed from: l */
    public void m751l(final String str, final String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            ThreadUtils.m18526a(new Runnable() { // from class: z4.g
                @Override // java.lang.Runnable
                public final void run() {
                    UserTagDispatcher.m744s(str, str2);
                }
            });
        }
    }

    /* renamed from: m */
    public void m750m(final String str, final List<String> list) {
        if (!TextUtils.isEmpty(str) && list != null && !list.isEmpty()) {
            ThreadUtils.m18526a(new Runnable() { // from class: z4.m
                @Override // java.lang.Runnable
                public final void run() {
                    UserTagDispatcher.m743t(str, list);
                }
            });
        }
    }

    /* renamed from: n */
    public void m749n(final UserTagUpdateListener userTagUpdateListener) {
        if (userTagUpdateListener == null) {
            return;
        }
        ThreadUtils.m18526a(new Runnable() { // from class: z4.o
            @Override // java.lang.Runnable
            public final void run() {
                UserTagDispatcher.m742u(userTagUpdateListener);
            }
        });
    }

    /* renamed from: p */
    public UserTagData m747p() {
        return UserTagDataManager.m774b().m773c();
    }

    /* renamed from: q */
    public void m746q(UserTagInitParameter userTagInitParameter) {
        if (this.f118738a) {
            return;
        }
        LogUtils.m18536c(userTagInitParameter.m730f());
        UserTagProcessorManager.m705m().m700r((Application) userTagInitParameter.m735a().getApplicationContext());
        UserTagProcessorManager.m705m().mo715c(userTagInitParameter);
        this.f118738a = true;
    }

    private UserTagDispatcher() {
    }
}
