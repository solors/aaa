package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.AbstractC14552x;
import com.fyber.inneractive.sdk.response.AbstractC15386e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Calendar;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.network.B */
/* loaded from: classes4.dex */
public final class C14668B {

    /* renamed from: a */
    public SharedPreferences f27792a = null;

    /* renamed from: a */
    public static void m77734a(Context context, String str, String str2, AbstractC14552x abstractC14552x) {
        int i;
        if (context != null && str != null && abstractC14552x.mo77807c() != null) {
            C14668B c14668b = AbstractC14667A.f27791a;
            if (c14668b.f27792a == null) {
                c14668b.f27792a = context.getSharedPreferences("AutoWebActionPrefs", 0);
            }
            IAlog.m76525e("IAautoWebActionReporter: reporting action: %s", str);
            IAlog.m76525e("IAautoWebActionReporter: url: %s", str2);
            IAConfigManager iAConfigManager = IAConfigManager.f27060O;
            if (!iAConfigManager.f27085i.f27106c) {
                IAlog.m76529a("IAautoWebActionReporter: Report of Non user web actions disabled!", new Object[0]);
                return;
            }
            EnumC14730t enumC14730t = EnumC14730t.MRAID_AUTO_ACTION_DETECTED;
            InneractiveAdRequest inneractiveAdRequest = abstractC14552x.f27572a;
            AbstractC15386e mo77807c = abstractC14552x.mo77807c();
            JSONArray m77925b = abstractC14552x.f27574c.m77925b();
            C14740w c14740w = new C14740w(mo77807c);
            c14740w.f27930b = enumC14730t;
            c14740w.f27929a = inneractiveAdRequest;
            c14740w.f27932d = m77925b;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("action", str);
            } catch (Exception unused) {
                IAlog.m76524f("Got exception adding param to json object: %s, %s", "action", str);
            }
            if (!TextUtils.isEmpty(str2)) {
                try {
                    jSONObject.put("url", str2);
                } catch (Exception unused2) {
                    IAlog.m76524f("Got exception adding param to json object: %s, %s", "url", str2);
                }
            }
            long j = c14668b.f27792a.getLong("lastReportTS", 0L);
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            Calendar calendar = Calendar.getInstance(timeZone);
            Calendar calendar2 = Calendar.getInstance(timeZone);
            calendar2.setTimeInMillis(j);
            if (j > 0 && calendar.get(6) == calendar2.get(6)) {
                IAlog.m76525e("IAautoWebActionReporter: encountered same date", new Object[0]);
                i = c14668b.f27792a.getInt("numReportsToday", 0);
            } else {
                i = 0;
            }
            int i2 = iAConfigManager.f27085i.f27107d;
            int i3 = i + 1;
            IAlog.m76525e("IAautoWebActionReporter: day counter: %d max: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            if (i < i2) {
                IAlog.m76525e("IAautoWebActionReporter: adding ad data", new Object[0]);
                c14740w.f27935g = true;
            } else {
                IAlog.m76525e("IAautoWebActionReporter: not adding ad data", new Object[0]);
            }
            Integer valueOf = Integer.valueOf(i3);
            try {
                jSONObject.put("daily_count", valueOf);
            } catch (Exception unused3) {
                IAlog.m76524f("Got exception adding param to json object: %s, %s", "daily_count", valueOf);
            }
            c14740w.f27934f.put(jSONObject);
            c14740w.m77658a((String) null);
            SharedPreferences.Editor edit = c14668b.f27792a.edit();
            edit.putLong("lastReportTS", calendar.getTimeInMillis());
            edit.putInt("numReportsToday", i3);
            edit.apply();
            return;
        }
        IAlog.m76529a("Invalid report request parameters!", new Object[0]);
    }
}
