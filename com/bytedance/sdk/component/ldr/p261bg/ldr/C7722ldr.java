package com.bytedance.sdk.component.ldr.p261bg.ldr;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.C7680bX;
import com.p552ot.pubsub.p553a.C26484a;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.ldr.bg.ldr.ldr */
/* loaded from: classes3.dex */
public class C7722ldr implements InterfaceC7723zx {

    /* renamed from: bg */
    private Context f16897bg;

    public C7722ldr(Context context) {
        this.f16897bg = context;
    }

    /* renamed from: IL */
    public static String m87939IL() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.ldr.InterfaceC7723zx
    /* renamed from: bX */
    public void mo87937bX(C7721eqN c7721eqN) {
        C7680bX.m88073bg(this.f16897bg, "trackurl", "id=?", new String[]{c7721eqN.m87947bg()});
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.ldr.InterfaceC7723zx
    /* renamed from: bg */
    public List<C7721eqN> mo87936bg() {
        LinkedList linkedList = new LinkedList();
        Cursor m88071bg = C7680bX.m88071bg(this.f16897bg, "trackurl", null, null, null, null, null, null);
        if (m88071bg != null) {
            while (m88071bg.moveToNext()) {
                try {
                    try {
                        String string = m88071bg.getString(m88071bg.getColumnIndex("id"));
                        String string2 = m88071bg.getString(m88071bg.getColumnIndex("url"));
                        boolean z = m88071bg.getInt(m88071bg.getColumnIndex("replaceholder")) > 0;
                        int i = m88071bg.getInt(m88071bg.getColumnIndex(C26484a.f69196M));
                        int i2 = m88071bg.getInt(m88071bg.getColumnIndex("url_type"));
                        String string3 = m88071bg.getString(m88071bg.getColumnIndex("ad_id"));
                        String string4 = m88071bg.getString(m88071bg.getColumnIndex("error_code"));
                        String string5 = m88071bg.getString(m88071bg.getColumnIndex("error_msg"));
                        C7721eqN c7721eqN = new C7721eqN(string, string2, z, i2, string3);
                        c7721eqN.m87946bg(i);
                        if (!TextUtils.isEmpty(string4)) {
                            c7721eqN.m87945bg(string4);
                        }
                        if (!TextUtils.isEmpty(string5)) {
                            c7721eqN.m87953IL(string5);
                        }
                        linkedList.add(c7721eqN);
                    } finally {
                        m88071bg.close();
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.ldr.InterfaceC7723zx
    /* renamed from: IL */
    public void mo87938IL(C7721eqN c7721eqN) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", c7721eqN.m87947bg());
        contentValues.put("url", c7721eqN.m87955IL());
        contentValues.put("replaceholder", Integer.valueOf(c7721eqN.m87949bX() ? 1 : 0));
        contentValues.put(C26484a.f69196M, Integer.valueOf(c7721eqN.eqN()));
        contentValues.put("error_code", c7721eqN.m87941iR());
        contentValues.put("error_msg", c7721eqN.m87950WR());
        contentValues.put("url_type", Integer.valueOf(c7721eqN.m87940zx()));
        contentValues.put("ad_id", c7721eqN.ldr());
        C7680bX.m88074bg(this.f16897bg, "trackurl", contentValues, "id=?", new String[]{c7721eqN.m87947bg()});
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.ldr.InterfaceC7723zx
    /* renamed from: bg */
    public C7721eqN mo87934bg(String str) {
        Cursor m88071bg = C7680bX.m88071bg(this.f16897bg, "trackurl", null, "id=?", new String[]{str}, null, null, null);
        if (m88071bg != null && m88071bg.moveToFirst()) {
            try {
                String string = m88071bg.getString(m88071bg.getColumnIndex("id"));
                String string2 = m88071bg.getString(m88071bg.getColumnIndex("url"));
                boolean z = m88071bg.getInt(m88071bg.getColumnIndex("replaceholder")) > 0;
                int i = m88071bg.getInt(m88071bg.getColumnIndex(C26484a.f69196M));
                int i2 = m88071bg.getInt(m88071bg.getColumnIndex("url_type"));
                String string3 = m88071bg.getString(m88071bg.getColumnIndex("ad_id"));
                String string4 = m88071bg.getString(m88071bg.getColumnIndex("error_code"));
                String string5 = m88071bg.getString(m88071bg.getColumnIndex("error_msg"));
                C7721eqN c7721eqN = new C7721eqN(string, string2, z, i2, string3);
                c7721eqN.m87946bg(i);
                if (!TextUtils.isEmpty(string4)) {
                    c7721eqN.m87945bg(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    c7721eqN.m87953IL(string5);
                }
                return c7721eqN;
            } catch (Throwable th) {
                try {
                    th.getMessage();
                    m88071bg.close();
                    m88071bg = null;
                } finally {
                    m88071bg.close();
                }
            }
        }
        if (m88071bg != null) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.ldr.InterfaceC7723zx
    /* renamed from: bg */
    public void mo87935bg(C7721eqN c7721eqN) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", c7721eqN.m87947bg());
        contentValues.put("url", c7721eqN.m87955IL());
        contentValues.put("replaceholder", Integer.valueOf(c7721eqN.m87949bX() ? 1 : 0));
        contentValues.put(C26484a.f69196M, Integer.valueOf(c7721eqN.eqN()));
        contentValues.put("url_type", Integer.valueOf(c7721eqN.m87940zx()));
        contentValues.put("ad_id", c7721eqN.ldr());
        contentValues.put("error_code", c7721eqN.m87941iR());
        contentValues.put("error_msg", c7721eqN.m87950WR());
        C7680bX.m88075bg(this.f16897bg, "trackurl", contentValues);
    }
}
