package com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.p270bg;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerProperties;
import com.bytedance.sdk.component.ldr.p261bg.C7659Kg;
import com.bytedance.sdk.component.ldr.p261bg.InterfaceC7724zx;
import com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg;
import com.bytedance.sdk.component.ldr.p261bg.eqN.p271IL.C7705bg;
import com.bytedance.sdk.component.ldr.p261bg.eqN.p272bg.C7708bg;
import com.bytedance.sdk.component.ldr.p261bg.p262IL.C7653bg;
import com.bytedance.sdk.component.ldr.p261bg.p262IL.C7655eqN;
import com.bytedance.sdk.component.ldr.p261bg.p266bX.C7661IL;
import com.bytedance.sdk.component.ldr.p261bg.p266bX.C7662bg;
import com.bytedance.sdk.component.ldr.p261bg.p267bg.InterfaceC7696zx;
import com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.C7680bX;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.ldr.bg.bg.bg.bg.bg */
/* loaded from: classes3.dex */
public class C7685bg extends AbstractC7683bX {

    /* renamed from: bX */
    private final Context f16820bX;

    /* renamed from: bg */
    protected List<String> f16821bg;
    private C7705bg eqN;

    public C7685bg(Context context, C7705bg c7705bg) {
        super(context);
        this.f16821bg = new ArrayList();
        this.f16820bX = context;
        this.eqN = c7705bg;
        if (c7705bg == null) {
            this.eqN = C7705bg.m88000bX();
        }
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.p270bg.AbstractC7683bX
    /* renamed from: IL */
    public String mo88039IL() {
        InterfaceC7696zx eqN = C7659Kg.m88154iR().eqN();
        if (eqN != null) {
            return eqN.mo83376IL();
        }
        return null;
    }

    /* renamed from: bX */
    public byte mo88052bX() {
        return (byte) 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0022, code lost:
        if (r0 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0024, code lost:
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x002f, code lost:
        if (r0 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0032, code lost:
        return r1;
     */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int m88060bg() {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            android.content.Context r2 = r10.m88064zx()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2f
            java.lang.String r3 = r10.mo88039IL()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2f
            java.lang.String r4 = "count(1)"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2f
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r0 = com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.C7680bX.m88071bg(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2f
            if (r0 == 0) goto L22
            r0.moveToFirst()     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2f
            int r1 = r0.getInt(r1)     // Catch: java.lang.Throwable -> L28 java.lang.Exception -> L2f
        L22:
            if (r0 == 0) goto L32
        L24:
            r0.close()     // Catch: java.lang.Exception -> L32
            goto L32
        L28:
            r1 = move-exception
            if (r0 == 0) goto L2e
            r0.close()     // Catch: java.lang.Exception -> L2e
        L2e:
            throw r1
        L2f:
            if (r0 == 0) goto L32
            goto L24
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.p270bg.C7685bg.m88060bg():int");
    }

    public byte eqN() {
        return (byte) 0;
    }

    /* renamed from: IL */
    public void m88061IL(List<InterfaceC7706bg> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (InterfaceC7706bg interfaceC7706bg : list) {
            linkedList.add(interfaceC7706bg.mo87989bX());
            C7662bg.m88127eo(interfaceC7706bg);
        }
        mo88039IL();
        linkedList.size();
        C7680bX.m88076bg(m88064zx(), "DELETE FROM " + mo88039IL() + " WHERE " + m88054bg("id", linkedList, 1000, true));
        m88068bX(linkedList);
    }

    /* renamed from: bg */
    public List<InterfaceC7706bg> m88057bg(int i, String str) {
        String str2;
        String[] strArr;
        String str3;
        String str4;
        Cursor m88071bg;
        long m88226bg = C7653bg.m88226bg(i, m88064zx());
        mo88039IL();
        if (m88226bg <= 0) {
            m88226bg = 1;
        } else if (m88226bg > 100) {
            m88226bg = 100;
        }
        String str5 = str + " DESC limit " + m88226bg;
        ArrayList arrayList = new ArrayList();
        this.f16821bg.clear();
        long xxp = C7659Kg.m88154iR().xxp();
        if (xxp > 0) {
            strArr = new String[]{String.valueOf(System.currentTimeMillis() - xxp)};
            str2 = "gen_time>?";
        } else {
            str2 = null;
            strArr = null;
        }
        if (C7662bg.eqN() && eqN() == 3) {
            str3 = "id";
            str4 = "value";
            m88071bg = C7680bX.m88071bg(m88064zx(), mo88039IL(), new String[]{"id", "value", "encrypt", AppsFlyerProperties.CHANNEL}, str2, strArr, null, null, str5);
        } else {
            str3 = "id";
            str4 = "value";
            m88071bg = C7680bX.m88071bg(m88064zx(), mo88039IL(), new String[]{str3, str4, "encrypt"}, str2, strArr, null, null, str5);
        }
        Cursor cursor = m88071bg;
        if (cursor != null) {
            try {
                InterfaceC7724zx m88153vb = C7659Kg.m88154iR().m88153vb();
                while (cursor.moveToNext()) {
                    try {
                        String string = cursor.getString(cursor.getColumnIndex(str3));
                        String string2 = cursor.getString(cursor.getColumnIndex(str4));
                        int i2 = cursor.getInt(cursor.getColumnIndex("encrypt"));
                        int i3 = (C7662bg.eqN() && eqN() == 3) ? cursor.getInt(cursor.getColumnIndex(AppsFlyerProperties.CHANNEL)) : 0;
                        if (i2 == 1) {
                            try {
                                string2 = m88153vb.mo83358bg(string2);
                            } catch (Throwable th) {
                                th = th;
                                th.getMessage();
                            }
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.f16821bg.add(string);
                        } else if (arrayList.size() > 100) {
                            break;
                        } else {
                            JSONObject jSONObject = new JSONObject(string2);
                            C7708bg c7708bg = new C7708bg(string, jSONObject);
                            c7708bg.mo87984bg(eqN());
                            c7708bg.mo87996IL(mo88052bX());
                            if (C7662bg.eqN() && eqN() == 3) {
                                c7708bg.mo87983bg(i3);
                            }
                            C7662bg.m88129bg(jSONObject, c7708bg);
                            arrayList.add(c7708bg);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } finally {
                try {
                    cursor.close();
                    if (!this.f16821bg.isEmpty()) {
                        m88053bg(this.f16821bg);
                        this.f16821bg.clear();
                    }
                } catch (Exception unused) {
                }
            }
        }
        mo88039IL();
        arrayList.size();
        return arrayList;
    }

    /* renamed from: IL */
    private void m88063IL(int i, long j) {
        if (j > 0 || i > 0) {
            C7680bX.m88073bg(m88064zx(), mo88039IL(), "gen_time <? OR retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i)});
            mo88039IL();
        }
    }

    /* renamed from: IL */
    public static String m88062IL(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    /* renamed from: bg */
    public List<InterfaceC7706bg> m88056bg(String str) {
        C7705bg c7705bg = this.eqN;
        if (c7705bg == null) {
            return new ArrayList();
        }
        return m88057bg(c7705bg.m88001IL(), str);
    }

    /* renamed from: bg */
    protected void m88053bg(List<String> list) {
        mo88039IL();
        list.size();
        C7680bX.m88076bg(m88064zx(), "DELETE FROM " + mo88039IL() + " WHERE " + m88054bg("id", list, 1000, true));
        C7661IL.m88148bg(C7655eqN.eqN.m88222GZ(), list.size());
        m88068bX(list);
    }

    /* renamed from: bg */
    public void m88058bg(int i, long j) {
        m88063IL(i, j);
    }

    /* renamed from: bg */
    public boolean m88059bg(int i) {
        if (this.eqN == null) {
            return false;
        }
        int m88060bg = m88060bg();
        int m87999bg = this.eqN.m87999bg();
        mo88039IL();
        return (C7662bg.m88141bX() && (i == 1 || i == 2)) ? m88060bg > 0 : m88060bg >= m87999bg;
    }

    /* renamed from: bg */
    private static String m88054bg(String str, List<?> list, int i, boolean z) {
        int i2;
        String str2 = z ? " IN " : " NOT IN ";
        String str3 = z ? " OR " : " AND ";
        int min = Math.min(i, 1000);
        int size = list.size();
        if (size % min == 0) {
            i2 = size / min;
        } else {
            i2 = (size / min) + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 * min;
            String m88055bg = m88055bg(TextUtils.join("','", list.subList(i4, Math.min(i4 + min, size))), "");
            if (i3 != 0) {
                sb2.append(str3);
            }
            sb2.append(str);
            sb2.append(str2);
            sb2.append("('");
            sb2.append(m88055bg);
            sb2.append("')");
        }
        String sb3 = sb2.toString();
        return m88055bg(sb3, str + str2 + "('')");
    }

    /* renamed from: bg */
    private static String m88055bg(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
