package com.p551my.target;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.o7 */
/* loaded from: classes7.dex */
public class C25984o7 {

    /* renamed from: a */
    public final C25752f7 f67494a;

    /* renamed from: b */
    public final C25832j f67495b;

    public C25984o7(C25752f7 c25752f7, C25832j c25832j) {
        this.f67494a = c25752f7;
        this.f67495b = c25832j;
    }

    /* renamed from: a */
    public void m43237a(final C26272z6 c26272z6, boolean z, Context context) {
        if (c26272z6.isHasNotification() != z) {
            c26272z6.setHasNotification(z);
            final Context applicationContext = context.getApplicationContext();
            AbstractC25671c0.m44124b(new Runnable() { // from class: com.my.target.ke
                {
                    C25984o7.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C25984o7.this.m43238a(c26272z6, applicationContext);
                }
            });
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void m43238a(C26272z6 c26272z6, Context context) {
        String m43239a = m43239a(c26272z6);
        if (m43239a == null) {
            return;
        }
        C25904m1 m43479b = C25904m1.m43479b(context);
        if (m43479b != null) {
            m43479b.m43489a(this.f67495b.getSlotId(), m43239a, true);
            return;
        }
        AbstractC25846ja.m43680a("NotificationHandler: Unable to open disk cache and save text data for slotId - " + this.f67495b.getSlotId());
    }

    /* renamed from: a */
    public static C25984o7 m43240a(C25752f7 c25752f7, C25832j c25832j) {
        return new C25984o7(c25752f7, c25832j);
    }

    /* renamed from: a */
    public final String m43239a(C26272z6 c26272z6) {
        JSONObject m43912j;
        String id2 = c26272z6.getId();
        try {
            m43912j = this.f67494a.m43912j();
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("NotificationHandler: Error updating cached notification for section " + this.f67494a.m43913i() + " and banner " + id2 + " - " + th);
        }
        if (m43912j == null) {
            AbstractC25846ja.m43680a("NotificationHandler: Unable to change cached notification for banner " + id2 + " - no raw data in section");
            return null;
        }
        JSONObject jSONObject = m43912j.getJSONObject(this.f67494a.m43913i());
        if (jSONObject == null) {
            AbstractC25846ja.m43680a("NotificationHandler: Unable to change cached notification for banner " + id2 + " - no section object in raw data");
            return null;
        }
        JSONArray jSONArray = jSONObject.getJSONArray("banners");
        if (jSONArray == null) {
            AbstractC25846ja.m43680a("NotificationHandler: Uunable to change cached notification for banner " + id2 + " - no banners array in section object");
            return null;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
            String string = jSONObject2.getString("bannerID");
            if (string != null && string.equals(id2)) {
                jSONObject2.put("hasNotification", c26272z6.isHasNotification());
                AbstractC25846ja.m43680a("NotificationHandler: Notification changed in raw data for banner " + id2);
                return m43912j.toString();
            }
        }
        return null;
    }
}
