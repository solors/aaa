package com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.p270bg;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.component.ldr.p261bg.C7659Kg;
import com.bytedance.sdk.component.ldr.p261bg.eqN.InterfaceC7706bg;
import com.bytedance.sdk.component.ldr.p261bg.eqN.p271IL.C7705bg;
import com.bytedance.sdk.component.ldr.p261bg.eqN.p272bg.C7708bg;
import com.bytedance.sdk.component.ldr.p261bg.p262IL.C7653bg;
import com.bytedance.sdk.component.ldr.p261bg.p262IL.C7655eqN;
import com.bytedance.sdk.component.ldr.p261bg.p266bX.C7661IL;
import com.bytedance.sdk.component.ldr.p261bg.p266bX.C7662bg;
import com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.C7680bX;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.ldr.bg.bg.bg.bg.iR */
/* loaded from: classes3.dex */
public class C7687iR extends AbstractC7683bX {

    /* renamed from: bX */
    private C7705bg f16822bX;

    /* renamed from: bg */
    protected List<String> f16823bg;

    public C7687iR(Context context, C7705bg c7705bg) {
        super(context);
        this.f16823bg = new ArrayList();
        this.f16822bX = c7705bg;
        if (c7705bg == null) {
            this.f16822bX = C7705bg.m88000bX();
        }
    }

    @Override // com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.p270bg.AbstractC7683bX
    /* renamed from: IL */
    public String mo88039IL() {
        return C7659Kg.m88154iR().eqN().eqN();
    }

    /* renamed from: bX */
    public byte mo88038bX() {
        return (byte) 2;
    }

    /* renamed from: bg */
    public byte mo88037bg() {
        return (byte) 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0021, code lost:
        if (r1 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0023, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0028, code lost:
        if (r1 == null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x002b, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int eqN() {
        /*
            r9 = this;
            r0 = 0
            android.content.Context r1 = r9.m88064zx()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = r9.mo88039IL()     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "count(1)"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L27
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.C7680bX.m88071bg(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L21
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L28
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L28
        L21:
            if (r1 == 0) goto L2b
        L23:
            r1.close()     // Catch: java.lang.Exception -> L2b
            goto L2b
        L27:
            r1 = 0
        L28:
            if (r1 == 0) goto L2b
            goto L23
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.ldr.p261bg.p267bg.p269bg.p270bg.C7687iR.eqN():int");
    }

    /* renamed from: bX */
    public static String m88047bX(String str) {
        return "CREATE TABLE IF NOT EXISTS " + str + " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)";
    }

    /* renamed from: IL */
    public List<InterfaceC7706bg> m88049IL(String str) {
        C7705bg c7705bg = this.f16822bX;
        if (c7705bg == null) {
            return new ArrayList();
        }
        return m88044bg(c7705bg.m88001IL(), str);
    }

    /* renamed from: bg */
    public List<InterfaceC7706bg> m88044bg(int i, String str) {
        long m88226bg = C7653bg.m88226bg(i, m88064zx());
        if (m88226bg <= 0) {
            m88226bg = 1;
        } else if (m88226bg > 100) {
            m88226bg = 100;
        }
        ArrayList arrayList = new ArrayList();
        this.f16823bg.clear();
        Cursor m88071bg = C7680bX.m88071bg(m88064zx(), mo88039IL(), new String[]{"id", "value", "encrypt"}, null, null, null, null, str + " DESC limit " + m88226bg);
        if (m88071bg != null) {
            while (m88071bg.moveToNext()) {
                try {
                    try {
                        String string = m88071bg.getString(m88071bg.getColumnIndex("id"));
                        String string2 = m88071bg.getString(m88071bg.getColumnIndex("value"));
                        if (m88071bg.getInt(m88071bg.getColumnIndex("encrypt")) == 1) {
                            string2 = C7659Kg.m88154iR().m88153vb().mo83358bg(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.f16823bg.add(string);
                        } else if (arrayList.size() > 100) {
                            break;
                        } else {
                            C7708bg c7708bg = new C7708bg(string, new JSONObject(string2));
                            c7708bg.mo87996IL(mo88038bX());
                            c7708bg.mo87984bg(mo88037bg());
                            arrayList.add(c7708bg);
                        }
                    } catch (Throwable unused) {
                    }
                } finally {
                    try {
                        m88071bg.close();
                        if (!this.f16823bg.isEmpty()) {
                            m88041bg(this.f16823bg);
                            this.f16823bg.clear();
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: IL */
    public void m88048IL(List<InterfaceC7706bg> list) {
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
        C7680bX.m88076bg(m88064zx(), "DELETE FROM " + mo88039IL() + " WHERE " + m88042bg("id", linkedList, 1000, true));
        m88068bX(linkedList);
    }

    /* renamed from: IL */
    private void m88050IL(int i, long j) {
        C7680bX.m88073bg(m88064zx(), mo88039IL(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j), String.valueOf(i)});
    }

    /* renamed from: bg */
    protected void m88041bg(List<String> list) {
        mo88039IL();
        list.size();
        C7680bX.m88076bg(m88064zx(), "DELETE FROM " + mo88039IL() + " WHERE " + m88042bg("id", list, 1000, true));
        C7661IL.m88148bg(C7655eqN.eqN.m88222GZ(), list.size());
        m88068bX(list);
    }

    /* renamed from: bg */
    public void m88045bg(int i, long j) {
        m88050IL(i, j);
    }

    /* renamed from: bg */
    public boolean m88046bg(int i) {
        return this.f16822bX != null && eqN() >= this.f16822bX.m87999bg();
    }

    /* renamed from: bg */
    private static String m88042bg(String str, List<?> list, int i, boolean z) {
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
            String m88043bg = m88043bg(TextUtils.join("','", list.subList(i4, Math.min(i4 + min, size))), "");
            if (i3 != 0) {
                sb2.append(str3);
            }
            sb2.append(str);
            sb2.append(str2);
            sb2.append("('");
            sb2.append(m88043bg);
            sb2.append("')");
        }
        String sb3 = sb2.toString();
        return m88043bg(sb3, str + str2 + "('')");
    }

    /* renamed from: bg */
    private static String m88043bg(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}
