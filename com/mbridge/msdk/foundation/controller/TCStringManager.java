package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.smaato.sdk.core.gdpr.CmpApiConstants;

/* renamed from: com.mbridge.msdk.foundation.controller.e */
/* loaded from: classes6.dex */
public final class TCStringManager implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private String f56148a;

    /* renamed from: e */
    private int f56152e;

    /* renamed from: g */
    private boolean f56154g;

    /* renamed from: h */
    private boolean f56155h;

    /* renamed from: i */
    private boolean f56156i;

    /* renamed from: j */
    private boolean f56157j;

    /* renamed from: k */
    private boolean f56158k;

    /* renamed from: l */
    private InterfaceC21908a f56159l;

    /* renamed from: m */
    private final SharedPreferences f56160m;

    /* renamed from: b */
    private String f56149b = "";

    /* renamed from: c */
    private String f56150c = "";

    /* renamed from: d */
    private String f56151d = "";

    /* renamed from: f */
    private boolean f56153f = false;

    /* compiled from: TCStringManager.java */
    /* renamed from: com.mbridge.msdk.foundation.controller.e$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC21908a {
        /* renamed from: a */
        void mo52726a();
    }

    public TCStringManager(Context context) {
        this.f56148a = "";
        this.f56152e = 0;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        this.f56160m = defaultSharedPreferences;
        if (defaultSharedPreferences != null) {
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
        if (defaultSharedPreferences != null) {
            this.f56148a = defaultSharedPreferences.getString("IABTCF_TCString", "");
            this.f56152e = defaultSharedPreferences.getInt("IABTCF_gdprApplies", 0);
            m52732a(defaultSharedPreferences.getString(CmpApiConstants.IABTCF_PURPOSE_CONSENTS, ""));
            m52729b(defaultSharedPreferences.getString(CmpApiConstants.IABTCF_VENDOR_CONSENT, ""));
            m52728c(defaultSharedPreferences.getString("IABTCF_AddtlConsent", ""));
        }
    }

    /* renamed from: b */
    private void m52729b(String str) {
        this.f56156i = m52731a(str, 867);
        this.f56150c = str;
    }

    /* renamed from: c */
    private void m52728c(String str) {
        this.f56151d = str;
        if (TextUtils.isEmpty(str)) {
            this.f56157j = true;
        } else if (MBridgeConstans.GOOGLE_ATP_ID == -1) {
            this.f56158k = false;
        } else {
            this.f56158k = true;
            try {
                String[] split = str.split("~");
                if (split.length > 1) {
                    if (TextUtils.isEmpty(split[1])) {
                        this.f56157j = false;
                    } else {
                        this.f56157j = str.contains(String.valueOf(MBridgeConstans.GOOGLE_ATP_ID));
                    }
                }
            } catch (Throwable th) {
                SameLogTool.m51824b("TCStringManager", th.getMessage());
            }
        }
    }

    /* renamed from: d */
    private boolean m52727d(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.matches("[01]+");
        }
        return false;
    }

    /* renamed from: a */
    public final void m52733a(InterfaceC21908a interfaceC21908a) {
        if (interfaceC21908a != null) {
            this.f56159l = interfaceC21908a;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        char c;
        try {
            if (!TextUtils.isEmpty(str)) {
                switch (str.hashCode()) {
                    case -2004976699:
                        if (str.equals(CmpApiConstants.IABTCF_PURPOSE_CONSENTS)) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 83641339:
                        if (str.equals("IABTCF_gdprApplies")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1218895378:
                        if (str.equals("IABTCF_TCString")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1342914771:
                        if (str.equals("IABTCF_AddtlConsent")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1450203731:
                        if (str.equals(CmpApiConstants.IABTCF_VENDOR_CONSENT)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c != 0) {
                    if (c != 1) {
                        if (c != 2) {
                            if (c != 3) {
                                if (c == 4) {
                                    m52728c(sharedPreferences.getString("IABTCF_AddtlConsent", ""));
                                }
                            } else {
                                m52729b(sharedPreferences.getString(CmpApiConstants.IABTCF_VENDOR_CONSENT, ""));
                            }
                        } else {
                            m52732a(sharedPreferences.getString(CmpApiConstants.IABTCF_PURPOSE_CONSENTS, ""));
                        }
                    } else {
                        this.f56152e = sharedPreferences.getInt("IABTCF_gdprApplies", 0);
                    }
                } else {
                    this.f56148a = sharedPreferences.getString("IABTCF_TCString", "");
                }
                InterfaceC21908a interfaceC21908a = this.f56159l;
                if (interfaceC21908a != null) {
                    interfaceC21908a.mo52726a();
                }
            }
        } catch (Throwable th) {
            SameLogTool.m51824b("TCStringManager", th.getMessage());
        }
    }

    /* renamed from: a */
    public final String m52734a() {
        return this.f56148a;
    }

    /* renamed from: a */
    private void m52732a(String str) {
        this.f56154g = m52731a(str, 1);
        this.f56155h = m52731a(str, 2);
        this.f56149b = str;
    }

    /* renamed from: b */
    public final boolean m52730b() {
        boolean z = true;
        if (this.f56152e == 0) {
            this.f56153f = true;
            return true;
        }
        if (m52727d(this.f56149b) && m52727d(this.f56150c)) {
            if (MBridgeConstans.VERIFY_ATP_CONSENT) {
                if (!(this.f56156i || (this.f56158k && this.f56157j)) || !this.f56154g || !this.f56155h) {
                    z = false;
                }
                this.f56153f = z;
                return this.f56153f;
            } else if (!this.f56156i || !this.f56154g || !this.f56155h) {
                z = false;
            }
        }
        this.f56153f = z;
        return this.f56153f;
    }

    /* renamed from: a */
    private boolean m52731a(String str, int i) {
        return m52727d(str) && i <= str.length() && i >= 1 && '1' == str.charAt(i - 1);
    }
}
