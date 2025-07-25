package com.meevii.push.permission;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import p772l6.PushEvent;
import p844q6.DataManager;

/* renamed from: com.meevii.push.permission.g */
/* loaded from: classes5.dex */
public class PushPermissionManager {

    /* renamed from: a */
    private IPushPermissionCustomUI f61597a;

    /* renamed from: b */
    private OnPushPermissionCallback f61598b;

    /* renamed from: c */
    private OnFullScreenIntentPermissionCallback f61599c;

    /* compiled from: PushPermissionManager.java */
    /* renamed from: com.meevii.push.permission.g$b */
    /* loaded from: classes5.dex */
    public static class C23333b {

        /* renamed from: a */
        private static final PushPermissionManager f61600a = new PushPermissionManager();
    }

    /* renamed from: a */
    public static PushPermissionManager m47887a() {
        return C23333b.f61600a;
    }

    /* renamed from: b */
    public String m47886b() {
        return DataManager.m12928g().m12923l("key_request_full_screen_intent_permission_position", "");
    }

    /* renamed from: c */
    public IPushPermissionCustomUI m47885c() {
        return this.f61597a;
    }

    /* renamed from: d */
    public String m47884d() {
        return DataManager.m12928g().m12923l("key_request_permission_position", "");
    }

    /* renamed from: e */
    public void m47883e(IPushPermissionCustomUI iPushPermissionCustomUI) {
        this.f61597a = iPushPermissionCustomUI;
    }

    /* renamed from: f */
    public boolean m47882f(Context context) {
        if (PushPermissionUtils.m47860e(context) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m47881g(Context context) {
        return PushPermissionUtils.m47863b(context);
    }

    /* renamed from: h */
    public boolean m47880h(Context context) {
        if (PushPermissionUtils.m47859f(context) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public void m47879i(Activity activity, int i) {
        int i2;
        if (PushPermissionUtils.m47857h(i)) {
            if (activity == null) {
                m47876l(new NullPointerException("activity cannot be null"));
                return;
            }
            boolean m47863b = PushPermissionUtils.m47863b(activity);
            PushEvent.m15669e(m47863b ? 1 : 0);
            if (m47863b) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            m47877k(i2);
        }
    }

    /* renamed from: j */
    public void m47878j() {
        OnFullScreenIntentPermissionCallback onFullScreenIntentPermissionCallback = this.f61599c;
        if (onFullScreenIntentPermissionCallback != null) {
            onFullScreenIntentPermissionCallback.onGotoSetting();
        }
    }

    /* renamed from: k */
    public void m47877k(int i) {
        OnFullScreenIntentPermissionCallback onFullScreenIntentPermissionCallback = this.f61599c;
        if (onFullScreenIntentPermissionCallback != null) {
            onFullScreenIntentPermissionCallback.onResult(i);
            this.f61599c = null;
        }
    }

    /* renamed from: l */
    public void m47876l(Throwable th) {
        PushEvent.m15670d(th.getMessage());
        OnFullScreenIntentPermissionCallback onFullScreenIntentPermissionCallback = this.f61599c;
        if (onFullScreenIntentPermissionCallback != null) {
            onFullScreenIntentPermissionCallback.onError(th);
            this.f61599c = null;
        }
    }

    /* renamed from: m */
    public void m47875m() {
        OnPushPermissionCallback onPushPermissionCallback = this.f61598b;
        if (onPushPermissionCallback != null) {
            onPushPermissionCallback.onGotoSetting();
        }
    }

    /* renamed from: n */
    public void m47874n(int i) {
        OnPushPermissionCallback onPushPermissionCallback = this.f61598b;
        if (onPushPermissionCallback != null) {
            onPushPermissionCallback.onResult(i);
            this.f61598b = null;
        }
    }

    /* renamed from: o */
    public void m47873o(Activity activity, int i) {
        int i2;
        if (PushPermissionUtils.m47856i(i)) {
            if (activity == null) {
                m47872p(new NullPointerException("activity cannot be null"));
                return;
            }
            boolean m47862c = PushPermissionUtils.m47862c(activity);
            PushEvent.m15664j(m47862c ? 1 : 0);
            if (m47862c) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            m47874n(i2);
        }
    }

    /* renamed from: p */
    public void m47872p(Throwable th) {
        PushEvent.m15661m(th.getMessage());
        OnPushPermissionCallback onPushPermissionCallback = this.f61598b;
        if (onPushPermissionCallback != null) {
            onPushPermissionCallback.onError(th);
            this.f61598b = null;
        }
    }

    /* renamed from: q */
    public void m47871q(Activity activity, String str) {
        try {
            if (activity == null) {
                m47876l(new NullPointerException("activity cannot be null"));
            } else if (PushPermissionUtils.m47863b(activity)) {
                m47877k(0);
            } else {
                DataManager.m12928g().m12911x("key_request_full_screen_intent_permission_position", str);
                PushEvent.m15671c(str);
                PushPermissionUtils.m47855j(activity);
            }
        } catch (Throwable th) {
            m47876l(th);
        }
    }

    /* renamed from: r */
    public void m47870r(Activity activity, String str, OnFullScreenIntentPermissionCallback onFullScreenIntentPermissionCallback) {
        this.f61599c = onFullScreenIntentPermissionCallback;
        m47871q(activity, str);
    }

    /* renamed from: s */
    public void m47869s(Activity activity, int i, String str) {
        try {
            if (activity == null) {
                m47872p(new NullPointerException("activity cannot be null"));
            } else if (PushPermissionUtils.m47862c(activity)) {
                m47874n(0);
            } else {
                DataManager.m12928g().m12911x("key_request_permission_position", str);
                PushEvent.m15662l("normal", str);
                PushPermissionUtils.m47853l(activity, i);
            }
        } catch (Throwable th) {
            m47872p(th);
        }
    }

    /* renamed from: t */
    public void m47868t(Activity activity, int i, String str, OnPushPermissionCallback onPushPermissionCallback) {
        this.f61598b = onPushPermissionCallback;
        m47869s(activity, i, str);
    }

    /* renamed from: u */
    public void m47867u(Activity activity, String str) {
        if (activity == null) {
            m47872p(new NullPointerException("activity cannot be null"));
        } else if (PushPermissionUtils.m47862c(activity)) {
            m47874n(0);
        } else {
            IPushPermissionCustomUI iPushPermissionCustomUI = this.f61597a;
            if (iPushPermissionCustomUI == null) {
                m47872p(new NullPointerException("PushPermissionCustomUI cannot be null"));
            } else if (iPushPermissionCustomUI.getLayoutId() != 0 && this.f61597a.getCancelViewId() != 0 && this.f61597a.getConfirmViewId() != 0) {
                DataManager.m12928g().m12911x("key_request_permission_position", str);
                PushEvent.m15662l("guide", str);
                activity.startActivity(new Intent(activity, PushPermissionActivity.class));
            } else {
                m47872p(new IllegalArgumentException("PushPermissionCustomUI layoutId、cancelViewId、confirmViewId cannot be null"));
            }
        }
    }

    /* renamed from: v */
    public void m47866v(Activity activity, String str, OnPushPermissionCallback onPushPermissionCallback) {
        this.f61598b = onPushPermissionCallback;
        m47867u(activity, str);
    }

    private PushPermissionManager() {
    }
}
