package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.TCStringManager;
import com.mbridge.msdk.foundation.p428a.p429a.SharedPerferenceManager;
import com.mbridge.msdk.foundation.same.p441f.ThreadPoolUtils;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.mbridge.msdk.out.OnCompletionListener;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.controller.authoritycontroller.b */
/* loaded from: classes6.dex */
public abstract class BaseSDKAuthorityController {

    /* renamed from: c */
    private static boolean f56111c = true;

    /* renamed from: d */
    private static boolean f56112d = true;

    /* renamed from: b */
    protected AuthorityInfoBean f56114b;

    /* renamed from: g */
    private TCStringManager f56117g;

    /* renamed from: a */
    public ArrayList<String> f56113a = new ArrayList<>();

    /* renamed from: e */
    private int f56115e = 3;

    /* renamed from: f */
    private String f56116f = "";

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseSDKAuthorityController() {
        m52764c();
    }

    /* renamed from: b */
    public static boolean m52767b() {
        return f56112d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m52755j() {
        int i;
        boolean m52730b = this.f56117g.m52730b();
        m52762c(this.f56117g.m52734a());
        if (m52730b) {
            i = 1;
        } else {
            i = 2;
        }
        m52763c(i);
        this.f56114b.authDeviceIdStatus(m52730b ? 1 : 0);
    }

    /* renamed from: b */
    protected abstract int mo52754b(String str);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public final void m52764c() {
        this.f56114b = new AuthorityInfoBean();
        try {
            if (SharedPerferenceManager.m52898a().m52897a(MBridgeConstans.AUTHORITY_GENERAL_DATA).equals("")) {
                this.f56114b.authGenDataStatus(1);
            }
            if (SharedPerferenceManager.m52898a().m52897a(MBridgeConstans.AUTHORITY_DEVICE_ID).equals("")) {
                this.f56114b.authDeviceIdStatus(1);
            }
            if (SharedPerferenceManager.m52898a().m52897a(MBridgeConstans.AUTHORITY_SERIAL_ID).equals("")) {
                this.f56114b.authSerialIdStatus(1);
            }
            if (SharedPerferenceManager.m52898a().m52897a(MBridgeConstans.AUTHORITY_OTHER).equals("")) {
                this.f56114b.authOther(1);
            }
            this.f56113a.add(MBridgeConstans.AUTHORITY_GENERAL_DATA);
            this.f56113a.add(MBridgeConstans.AUTHORITY_DEVICE_ID);
            this.f56113a.add(MBridgeConstans.AUTHORITY_SERIAL_ID);
            this.f56113a.add(MBridgeConstans.AUTHORITY_OTHER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public final AuthorityInfoBean m52761d() {
        AuthorityInfoBean authorityInfoBean = this.f56114b;
        if (authorityInfoBean != null) {
            return authorityInfoBean;
        }
        AuthorityInfoBean authorityInfoBean2 = new AuthorityInfoBean();
        authorityInfoBean2.m52777a(1);
        return authorityInfoBean2;
    }

    /* renamed from: e */
    public final boolean m52760e() {
        int i = this.f56115e;
        if (i == 1 || i == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m52759f() {
        return SharedPerferenceManager.m52898a().m52896a(MBridgeConstans.AUTHORITY_COPPA, 0);
    }

    /* renamed from: g */
    public final int m52758g() {
        return this.f56115e;
    }

    /* renamed from: h */
    public final String m52757h() {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < this.f56113a.size(); i++) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("keyname", String.valueOf(this.f56113a.get(i)));
                jSONObject.put("client_status", m52770a(this.f56113a.get(i)));
                jSONObject.put("server_status", mo52754b(this.f56113a.get(i)));
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    /* renamed from: i */
    public final String m52756i() {
        return this.f56116f;
    }

    /* renamed from: b */
    public static void m52765b(boolean z) {
        f56112d = z;
    }

    /* renamed from: a */
    public static boolean m52776a() {
        return f56111c;
    }

    /* renamed from: b */
    public final void m52766b(int i) {
        SharedPerferenceManager.m52898a().m52891b(MBridgeConstans.AUTHORITY_DNT, i);
    }

    /* renamed from: a */
    public static void m52768a(boolean z) {
        f56111c = z;
    }

    /* renamed from: a */
    public final void m52775a(int i) {
        if (this.f56114b != null) {
            m52763c(i);
        }
    }

    /* renamed from: a */
    public final void m52773a(final Context context, final OnCompletionListener onCompletionListener) {
        if (onCompletionListener != null) {
            ThreadPoolUtils.m52227b().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.authoritycontroller.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    BaseSDKAuthorityController.this.m52774a(context);
                    onCompletionListener.onCompletion();
                }
            });
        } else {
            m52774a(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final int m52770a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String m52897a = SharedPerferenceManager.m52898a().m52897a(str);
                if (TextUtils.isEmpty(m52897a)) {
                    return 0;
                }
                return Integer.parseInt(m52897a);
            }
        } catch (Exception e) {
            SameLogTool.m51824b("SDKAuthorityController", e.getMessage());
        }
        return 0;
    }

    /* renamed from: a */
    public final void m52769a(String str, int i) {
        if (this.f56114b != null) {
            if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                this.f56114b.authGenDataStatus(i);
            } else if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                this.f56114b.authDeviceIdStatus(i);
            } else if (str.equals(MBridgeConstans.AUTHORITY_ALL_INFO)) {
                this.f56114b.m52777a(i);
            } else if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
                this.f56114b.authSerialIdStatus(i);
            } else if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
                this.f56114b.authOther(i);
            }
        }
    }

    /* renamed from: c */
    private void m52763c(int i) {
        this.f56115e = i != 1 ? 2 : 1;
    }

    /* renamed from: c */
    private void m52762c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f56116f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m52774a(Context context) {
        try {
            if (this.f56117g == null) {
                TCStringManager tCStringManager = new TCStringManager(context);
                this.f56117g = tCStringManager;
                tCStringManager.m52733a(new TCStringManager.InterfaceC21908a() { // from class: com.mbridge.msdk.foundation.controller.authoritycontroller.b.2
                    @Override // com.mbridge.msdk.foundation.controller.TCStringManager.InterfaceC21908a
                    /* renamed from: a */
                    public final void mo52726a() {
                        BaseSDKAuthorityController.this.m52755j();
                    }
                });
            }
            m52755j();
        } catch (Throwable th) {
            SameLogTool.m51824b("SDKAuthorityController", th.getMessage());
        }
    }
}
