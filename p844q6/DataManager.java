package p844q6;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import p636d7.MD5Util;

/* renamed from: q6.a */
/* loaded from: classes5.dex */
public class DataManager {

    /* renamed from: c */
    private static final DataManager f103454c = new DataManager();

    /* renamed from: a */
    private SharedPreferences f103455a;

    /* renamed from: b */
    private RequestData f103456b;

    /* renamed from: g */
    public static DataManager m12928g() {
        return f103454c;
    }

    /* renamed from: a */
    public boolean m12934a(RequestData requestData) {
        if (!requestData.m12909a()) {
            return false;
        }
        return !TextUtils.equals(MD5Util.m25700b(requestData.toString()), this.f103455a.getString("key_data_sign", ""));
    }

    /* renamed from: b */
    public void m12933b() {
        SharedPreferences.Editor edit = this.f103455a.edit();
        edit.putString("key_data_sign", "");
        edit.apply();
    }

    /* renamed from: c */
    public int m12932c() {
        int i = this.f103455a.getInt("key_sound_channel_id_suffix", 1);
        this.f103455a.edit().putInt("key_sound_channel_id_suffix", i + 1).apply();
        return i;
    }

    /* renamed from: d */
    public int m12931d() {
        int i = this.f103455a.getInt("key_auto_notification_id", 1000);
        this.f103455a.edit().putInt("key_auto_notification_id", i + 1).apply();
        return i;
    }

    /* renamed from: e */
    public boolean m12930e(String str, boolean z) {
        return this.f103455a.getBoolean(str, z);
    }

    /* renamed from: f */
    public long m12929f() {
        return m12926i("key_cold_start_time", -1L);
    }

    /* renamed from: h */
    public int m12927h(String str, int i) {
        return this.f103455a.getInt(str, i);
    }

    /* renamed from: i */
    public long m12926i(String str, long j) {
        return this.f103455a.getLong(str, j);
    }

    /* renamed from: j */
    public String m12925j() {
        return this.f103455a.getString("key_data_luid", null);
    }

    /* renamed from: k */
    public RequestData m12924k() {
        return this.f103456b;
    }

    /* renamed from: l */
    public String m12923l(String str, String str2) {
        return this.f103455a.getString(str, str2);
    }

    /* renamed from: m */
    public void m12922m(Context context) {
        if (this.f103455a != null) {
            return;
        }
        this.f103455a = context.getSharedPreferences("meevii-push-preferences", 0);
    }

    /* renamed from: n */
    public boolean m12921n() {
        return this.f103455a.getBoolean("key_disable_success", true);
    }

    /* renamed from: o */
    public boolean m12920o() {
        return this.f103455a.getBoolean("key_push_enable", true);
    }

    /* renamed from: p */
    public void m12919p(RequestData requestData) {
        if (!requestData.m12909a()) {
            return;
        }
        String m25700b = MD5Util.m25700b(requestData.toString());
        if (TextUtils.equals(m25700b, this.f103455a.getString("key_data_sign", ""))) {
            return;
        }
        SharedPreferences.Editor edit = this.f103455a.edit();
        edit.putString("key_data_sign", m25700b);
        edit.apply();
    }

    /* renamed from: q */
    public void m12918q(String str, boolean z) {
        this.f103455a.edit().putBoolean(str, z).apply();
    }

    /* renamed from: r */
    public void m12917r(boolean z) {
        SharedPreferences.Editor edit = this.f103455a.edit();
        edit.putBoolean("key_disable_success", z);
        edit.apply();
    }

    /* renamed from: s */
    public void m12916s(boolean z) {
        this.f103455a.edit().putBoolean("key_push_enable", z).apply();
    }

    /* renamed from: t */
    public void m12915t(String str, int i) {
        this.f103455a.edit().putInt(str, i).apply();
    }

    /* renamed from: u */
    public void m12914u(String str, long j) {
        this.f103455a.edit().putLong(str, j).apply();
    }

    /* renamed from: v */
    public void m12913v(String str) {
        this.f103455a.edit().putString("key_data_luid", str).apply();
        RequestData requestData = this.f103456b;
        if (requestData != null) {
            requestData.m12892r(str);
        }
    }

    /* renamed from: w */
    public void m12912w(RequestData requestData) {
        this.f103456b = requestData;
    }

    /* renamed from: x */
    public void m12911x(String str, String str2) {
        this.f103455a.edit().putString(str, str2).apply();
    }

    /* renamed from: y */
    public void m12910y() {
        m12914u("key_cold_start_time", System.currentTimeMillis());
    }
}
