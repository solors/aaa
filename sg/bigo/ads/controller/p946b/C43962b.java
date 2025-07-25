package sg.bigo.ads.controller.p946b;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.p903a.InterfaceC43514b;
import sg.bigo.ads.api.p903a.InterfaceC43528l;

/* renamed from: sg.bigo.ads.controller.b.b */
/* loaded from: classes10.dex */
public final class C43962b implements InterfaceC43514b {
    @Nullable

    /* renamed from: a */
    public C43974h f115135a;

    /* renamed from: b */
    String f115136b = "";
    @NonNull

    /* renamed from: c */
    private Map<Integer, Map<Integer, C43963a>> f115137c = new HashMap();

    /* renamed from: sg.bigo.ads.controller.b.b$a */
    /* loaded from: classes10.dex */
    public static class C43963a {

        /* renamed from: a */
        long f115138a;

        /* renamed from: b */
        int f115139b;

        /* renamed from: c */
        int f115140c;

        /* renamed from: d */
        long f115141d;

        /* renamed from: e */
        int f115142e;

        /* renamed from: f */
        int f115143f;

        /* renamed from: g */
        int f115144g;
    }

    /* renamed from: a */
    private C43963a m4507a(InterfaceC43528l interfaceC43528l) {
        int mo4438b;
        Map<Integer, C43963a> map;
        if (interfaceC43528l == null) {
            return null;
        }
        int mo4417v = interfaceC43528l.mo4417v();
        if (mo4417v == 0) {
            mo4417v = 1;
        }
        if (mo4417v == 3 || (mo4438b = interfaceC43528l.mo4438b()) == 2 || (map = this.f115137c.get(Integer.valueOf(mo4417v))) == null) {
            return null;
        }
        return map.get(Integer.valueOf(mo4438b));
    }

    /* renamed from: k */
    private C43963a m4497k(String str) {
        C43974h c43974h;
        if (TextUtils.isEmpty(str) || (c43974h = this.f115135a) == null) {
            return null;
        }
        return m4507a(c43974h.m4446a(str));
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: b */
    public final void mo4437b(@NonNull Parcel parcel) {
        mo4508a(parcel.readString());
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43514b
    /* renamed from: c */
    public final boolean mo4505c(String str) {
        C43974h c43974h;
        InterfaceC43528l m4446a;
        int mo4438b;
        if (TextUtils.isEmpty(str) || (c43974h = this.f115135a) == null || (m4446a = c43974h.m4446a(str)) == null) {
            return false;
        }
        int mo4417v = m4446a.mo4417v();
        if (mo4417v == 0) {
            mo4417v = 1;
        }
        if (mo4417v == 3 || (mo4438b = m4446a.mo4438b()) == 2 || mo4438b == 12) {
            return false;
        }
        return true;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43514b
    /* renamed from: d */
    public final String mo4504d(String str) {
        C43974h c43974h;
        InterfaceC43528l m4446a;
        if (TextUtils.isEmpty(str) || (c43974h = this.f115135a) == null || (m4446a = c43974h.m4446a(str)) == null) {
            return null;
        }
        return String.valueOf(m4446a.mo4438b());
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43514b
    /* renamed from: e */
    public final long mo4503e(String str) {
        C43963a m4497k = m4497k(str);
        if (m4497k != null) {
            return m4497k.f115138a;
        }
        return 0L;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43514b
    /* renamed from: f */
    public final int mo4502f(String str) {
        C43963a m4497k = m4497k(str);
        if (m4497k != null) {
            return m4497k.f115143f;
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43514b
    /* renamed from: g */
    public final int mo4501g(String str) {
        C43963a m4497k = m4497k(str);
        if (m4497k != null) {
            return m4497k.f115144g;
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43514b
    /* renamed from: h */
    public final int mo4500h(String str) {
        C43963a m4497k = m4497k(str);
        if (m4497k != null) {
            return m4497k.f115139b;
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43514b
    /* renamed from: i */
    public final boolean mo4499i(String str) {
        C43963a m4497k = m4497k(str);
        if (m4497k == null || m4497k.f115140c != 1) {
            return false;
        }
        return true;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43514b
    /* renamed from: j */
    public final long mo4498j(String str) {
        C43963a m4497k = m4497k(str);
        if (m4497k != null) {
            return m4497k.f115141d;
        }
        return 0L;
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: a */
    public final void mo4441a(@NonNull Parcel parcel) {
        parcel.writeString(this.f115136b);
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43514b
    /* renamed from: b */
    public final boolean mo4506b(String str) {
        C43963a m4497k = m4497k(str);
        return m4497k != null && m4497k.f115142e == 1;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43514b
    /* renamed from: a */
    public final void mo4508a(String str) {
        if (TextUtils.isEmpty(str)) {
            if (this.f115137c.isEmpty()) {
                return;
            }
            this.f115137c = new HashMap();
            return;
        }
        this.f115136b = str;
        try {
            JSONArray jSONArray = new JSONArray(str);
            HashMap hashMap = new HashMap();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    C43963a c43963a = new C43963a();
                    c43963a.f115138a = optJSONObject.optLong("tmax", 15L);
                    c43963a.f115139b = optJSONObject.optInt("cache_num", 2);
                    c43963a.f115140c = optJSONObject.optInt("single_ad", 0);
                    c43963a.f115141d = optJSONObject.optLong("single_tmax", 15L);
                    c43963a.f115142e = optJSONObject.optInt("tmax_switch", 0);
                    c43963a.f115143f = optJSONObject.optInt("tmax_strategy", 0);
                    c43963a.f115144g = optJSONObject.optInt("assign_strategy", 0);
                    JSONArray optJSONArray = optJSONObject.optJSONArray("auc_type");
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("ad_type");
                    if (optJSONArray != null && optJSONArray2 != null) {
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            int optInt = optJSONArray.optInt(i2);
                            if (optInt == 0) {
                                optInt = 1;
                            }
                            Map map = (Map) hashMap.get(Integer.valueOf(optInt));
                            if (map == null) {
                                map = new HashMap();
                                hashMap.put(Integer.valueOf(optInt), map);
                            }
                            for (int i3 = 0; i3 < optJSONArray2.length(); i3++) {
                                int optInt2 = optJSONArray2.optInt(i3);
                                if (((C43963a) map.get(Integer.valueOf(optInt2))) == null) {
                                    map.put(Integer.valueOf(optInt2), c43963a);
                                }
                            }
                        }
                    }
                }
            }
            this.f115137c = hashMap;
        } catch (JSONException unused) {
        }
    }
}
