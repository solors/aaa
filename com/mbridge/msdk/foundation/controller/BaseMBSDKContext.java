package com.mbridge.msdk.foundation.controller;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.authoritycontroller.BaseSDKAuthorityController;
import com.mbridge.msdk.foundation.controller.authoritycontroller.SDKAuthorityController;
import com.mbridge.msdk.foundation.same.report.ReportUtil;
import com.mbridge.msdk.foundation.tools.BaseSameDiTool;
import com.mbridge.msdk.foundation.tools.CrashInfoAuthor;
import com.mbridge.msdk.foundation.tools.SameDiTool;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.SameOptimizedController;
import com.mbridge.msdk.foundation.tools.SameTool;
import com.mbridge.msdk.foundation.tools.SharedPreferencesUtils;
import com.mbridge.msdk.p411c.Setting;
import com.mbridge.msdk.p411c.SettingManager;
import com.mbridge.msdk.p411c.SettingManagerDiff;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.controller.a */
/* loaded from: classes6.dex */
public abstract class BaseMBSDKContext {

    /* renamed from: a */
    public static final String f56089a = MBSDKContext.class.getSimpleName();

    /* renamed from: b */
    public static HashMap<String, String> f56090b = new HashMap<>();

    /* renamed from: c */
    protected String f56091c;

    /* renamed from: d */
    protected Context f56092d;

    /* renamed from: e */
    protected String f56093e;

    /* renamed from: g */
    private WeakReference<Activity> f56095g;

    /* renamed from: h */
    private String f56096h;

    /* renamed from: i */
    private int f56097i;

    /* renamed from: l */
    private String f56100l;

    /* renamed from: m */
    private String f56101m;

    /* renamed from: n */
    private int f56102n;

    /* renamed from: p */
    private WeakReference<Context> f56104p;

    /* renamed from: q */
    private JSONObject f56105q;

    /* renamed from: s */
    private String f56107s;

    /* renamed from: f */
    private final CrashInfoAuthor f56094f = new CrashInfoAuthor();

    /* renamed from: j */
    private JSONObject f56098j = new JSONObject();

    /* renamed from: k */
    private boolean f56099k = false;

    /* renamed from: o */
    private ConcurrentHashMap<String, String> f56103o = new ConcurrentHashMap<>();

    /* renamed from: r */
    private int f56106r = 0;

    /* compiled from: BaseMBSDKContext.java */
    /* renamed from: com.mbridge.msdk.foundation.controller.a$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC21897a {
    }

    /* renamed from: a */
    public final WeakReference<Activity> m52805a() {
        return this.f56095g;
    }

    /* renamed from: a */
    protected abstract void mo52747a(InterfaceC21897a interfaceC21897a);

    /* renamed from: b */
    public final String m52796b() {
        if (!TextUtils.isEmpty(this.f56100l)) {
            return this.f56100l;
        }
        Context context = this.f56092d;
        if (context != null) {
            return (String) SharedPreferencesUtils.m51698a(context, "sp_appKey", "");
        }
        return null;
    }

    /* renamed from: c */
    public final Context m52792c() {
        return this.f56092d;
    }

    /* renamed from: d */
    public final CrashInfoAuthor m52789d() {
        return this.f56094f;
    }

    /* renamed from: e */
    public final Context m52787e() {
        WeakReference<Context> weakReference = this.f56104p;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: f */
    public final int m52785f() {
        return this.f56097i;
    }

    /* renamed from: g */
    public final String m52783g() {
        try {
            if (!TextUtils.isEmpty(this.f56093e)) {
                return this.f56093e;
            }
            Context context = this.f56092d;
            if (context != null) {
                String packageName = context.getPackageName();
                this.f56093e = packageName;
                return packageName;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: h */
    public final String m52782h() {
        if (!TextUtils.isEmpty(this.f56101m)) {
            return this.f56101m;
        }
        Context context = this.f56092d;
        if (context != null) {
            return (String) SharedPreferencesUtils.m51698a(context, "sp_wx_appKey", "");
        }
        return null;
    }

    /* renamed from: i */
    public final JSONObject m52781i() {
        return this.f56105q;
    }

    /* renamed from: j */
    public final int m52780j() {
        return this.f56106r;
    }

    /* renamed from: k */
    public final String m52779k() {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (!TextUtils.isEmpty(this.f56091c)) {
            return this.f56091c;
        }
        Context context = this.f56092d;
        if (context != null) {
            return (String) SharedPreferencesUtils.m51698a(context, "sp_appId", "");
        }
        return "";
    }

    /* renamed from: l */
    public final String m52778l() {
        if (!TextUtils.isEmpty(this.f56107s)) {
            return this.f56107s;
        }
        try {
            String md5 = SameMD5.getMD5(MBSDKContext.m52746m().m52779k() + MBSDKContext.m52746m().m52796b());
            this.f56107s = md5;
            return md5;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public final void m52798a(WeakReference<Activity> weakReference) {
        this.f56095g = weakReference;
    }

    /* renamed from: c */
    public final void m52791c(int i) {
        this.f56106r = i;
    }

    /* renamed from: d */
    public final void m52788d(String str) {
        Context context;
        try {
            this.f56091c = str;
            if (TextUtils.isEmpty(str) || (context = this.f56092d) == null) {
                return;
            }
            SharedPreferencesUtils.m51697b(context, "sp_appId", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public final void m52786e(String str) {
        Context context;
        try {
            this.f56100l = str;
            if (TextUtils.isEmpty(str) || (context = this.f56092d) == null) {
                return;
            }
            SharedPreferencesUtils.m51697b(context, "sp_appKey", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    public final void m52784f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f56093e = str;
    }

    /* renamed from: a */
    public final void m52803a(Context context) {
        if (context instanceof Activity) {
            this.f56104p = new WeakReference<>(context);
        }
    }

    /* renamed from: c */
    public final void m52790c(String str) {
        Context context;
        try {
            this.f56096h = str;
            if (TextUtils.isEmpty(str) || (context = this.f56092d) == null) {
                return;
            }
            SharedPreferencesUtils.m51697b(context, "applicationIds", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void m52804a(int i) {
        this.f56097i = i;
    }

    /* renamed from: b */
    public final void m52795b(int i) {
        this.f56102n = i;
    }

    /* renamed from: a */
    public final void m52801a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f56101m = str;
            Context context = this.f56092d;
            if (context != null) {
                SharedPreferencesUtils.m51697b(context, "sp_wx_appKey", str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void m52793b(String str) {
        try {
            if (this.f56103o != null && !TextUtils.isEmpty(str) && this.f56103o.containsKey(str)) {
                this.f56103o.remove(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void m52794b(Context context) {
        this.f56092d = context;
    }

    /* renamed from: a */
    public final BitmapDrawable m52800a(String str, int i) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.f56103o) == null || !concurrentHashMap.containsKey(str) || !SameOptimizedController.m51814a().m51810a("w_m_r_l", true)) {
            return null;
        }
        String str2 = this.f56103o.get(str);
        BitmapDrawable m51703n = SameTool.m51703n(str2);
        ReportUtil.m51954a(str, i, TextUtils.isEmpty(str2) ? 2 : 1, TextUtils.isEmpty(str2) ? "get watermark failed" : m51703n != null ? "" : "str to bitmap failed", m51703n == null ? 2 : 1, str2);
        return m51703n;
    }

    /* renamed from: a */
    public final void m52797a(JSONObject jSONObject) {
        this.f56105q = jSONObject;
    }

    /* renamed from: a */
    public final void m52802a(final InterfaceC21897a interfaceC21897a, final Handler handler) {
        if (this.f56099k) {
            return;
        }
        try {
            if (BaseSDKAuthorityController.m52776a() && SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                Object m51698a = SharedPreferencesUtils.m51698a(this.f56092d, MBridgeConstans.SP_GA_ID, "");
                Object m51698a2 = SharedPreferencesUtils.m51698a(this.f56092d, MBridgeConstans.SP_GA_ID_LIMIT, 0);
                if (m51698a instanceof String) {
                    String str = (String) m51698a;
                    if (!TextUtils.isEmpty(str)) {
                        BaseSameDiTool.m51657a(str);
                    } else {
                        BaseSameDiTool.m51654c();
                    }
                    if (m51698a2 instanceof Integer) {
                        BaseSameDiTool.m51660a(((Integer) m51698a2).intValue());
                    }
                }
            }
        } catch (Exception e) {
            SameLogTool.m51824b(f56089a, e.getMessage());
        }
        try {
            JSONObject jSONObject = new JSONObject();
            this.f56105q = jSONObject;
            jSONObject.put("webgl", 0);
        } catch (JSONException e2) {
            SameLogTool.m51824b(f56089a, e2.getMessage());
        }
        new Thread(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.a.1
            @Override // java.lang.Runnable
            public final void run() {
                int i;
                try {
                    SameDiTool.m51870p(BaseMBSDKContext.this.f56092d);
                    BaseMBSDKContext.this.mo52747a(interfaceC21897a);
                    BaseMBSDKContext baseMBSDKContext = BaseMBSDKContext.this;
                    SettingManager.m53285a(baseMBSDKContext.f56092d, baseMBSDKContext.f56091c);
                } catch (Exception e3) {
                    SameLogTool.m51824b(BaseMBSDKContext.f56089a, e3.getMessage());
                }
                if (SDKAuthorityController.m52751j().m52753c(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                    try {
                        if (BaseMBSDKContext.this.f56092d.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        SameDiTool.m51897c(i);
                    } catch (PackageManager.NameNotFoundException unused) {
                        SameDiTool.m51897c(0);
                    } catch (Throwable th) {
                        SameLogTool.m51824b(BaseMBSDKContext.f56089a, th.getMessage());
                    }
                }
                try {
                    Setting m53279b = SettingManager.m53286a().m53279b(MBSDKContext.m52746m().m52779k());
                    if (m53279b == null) {
                        SettingManager.m53286a();
                        m53279b = SettingManagerDiff.m53265a();
                    }
                    Message obtain = Message.obtain();
                    obtain.obj = m53279b;
                    obtain.what = 9;
                    handler.sendMessage(obtain);
                } catch (Exception e4) {
                    SameLogTool.m51824b(BaseMBSDKContext.f56089a, e4.getMessage());
                }
            }
        }).start();
    }

    /* renamed from: a */
    public final void m52799a(String str, JSONObject jSONObject) {
        if (SameOptimizedController.m51814a().m51810a("w_m_r_l", true)) {
            try {
                if (this.f56098j == null) {
                    this.f56098j = jSONObject;
                } else if (jSONObject != null) {
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        this.f56098j.put(next, jSONObject.get(next));
                    }
                }
                if (this.f56098j.has(MBridgeConstans.EXTRA_KEY_WM)) {
                    if (this.f56103o == null) {
                        this.f56103o = new ConcurrentHashMap<>();
                    }
                    this.f56103o.put(str, this.f56098j.getString(MBridgeConstans.EXTRA_KEY_WM));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
