package com.five_corp.p372ad.internal.storage;

import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.EnumC14106t;
import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.util.C14118f;
import com.five_corp.p372ad.internal.util.C14119g;
import java.io.File;
import java.util.ArrayList;

/* renamed from: com.five_corp.ad.internal.storage.c */
/* loaded from: classes4.dex */
public final class C14078c implements InterfaceC14077b {

    /* renamed from: a */
    public final File f26258a;

    /* renamed from: b */
    public final C13836a f26259b;

    public C14078c(File file, C13836a c13836a) {
        this.f26258a = new File(file, "com.five_corp");
        this.f26259b = c13836a;
    }

    /* renamed from: a */
    public final C14119g m78124a(String str) {
        C14118f m78121b = m78121b(str);
        if (!m78121b.f26746a) {
            return new C14119g(false, m78121b.f26747b);
        }
        if (!((Boolean) m78121b.f26748c).booleanValue()) {
            return new C14119g(true, null);
        }
        File file = new File(this.f26258a, str);
        try {
            if (!file.delete()) {
                EnumC14106t enumC14106t = EnumC14106t.f26457R2;
                return new C14119g(false, new C14068s(enumC14106t, "File path: " + file.getAbsolutePath(), null, null));
            }
            return new C14119g(true, null);
        } catch (SecurityException e) {
            EnumC14106t enumC14106t2 = EnumC14106t.f26464S2;
            return new C14119g(false, new C14068s(enumC14106t2, "File path: " + file.getAbsolutePath(), e, null));
        }
    }

    /* renamed from: b */
    public final C14118f m78121b(String str) {
        File file = new File(this.f26258a, str);
        try {
            return new C14118f(true, null, Boolean.valueOf(file.exists()));
        } catch (SecurityException e) {
            EnumC14106t enumC14106t = EnumC14106t.f26442P2;
            return new C14118f(false, new C14068s(enumC14106t, "File path: " + file.getAbsolutePath(), e, null), null);
        }
    }

    /* renamed from: c */
    public final C14118f m78120c(String str) {
        File file = new File(this.f26258a, str);
        try {
            return new C14118f(true, null, Integer.valueOf((int) file.length()));
        } catch (SecurityException e) {
            EnumC14106t enumC14106t = EnumC14106t.f26450Q2;
            return new C14118f(false, new C14068s(enumC14106t, "File path: " + file.getAbsolutePath(), e, null), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.five_corp.p372ad.internal.util.C14118f m78119d(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.five_corp.p372ad.internal.storage.C14078c.m78119d(java.lang.String):com.five_corp.ad.internal.util.f");
    }

    /* renamed from: e */
    public final C14119g m78118e(String str) {
        C14118f m78121b = m78121b(str);
        if (!m78121b.f26746a) {
            return new C14119g(false, m78121b.f26747b);
        }
        File file = new File(this.f26258a, str);
        try {
            if (!file.setReadable(true, false)) {
                EnumC14106t enumC14106t = EnumC14106t.f26558f3;
                return new C14119g(false, new C14068s(enumC14106t, "File path: " + file.getAbsolutePath(), null, null));
            }
            return new C14119g(true, null);
        } catch (SecurityException e) {
            EnumC14106t enumC14106t2 = EnumC14106t.f26566g3;
            return new C14119g(false, new C14068s(enumC14106t2, "File path: " + file.getAbsolutePath(), e, null));
        }
    }

    /* renamed from: b */
    public final C14119g m78122b() {
        try {
            if (this.f26258a.exists()) {
                return new C14119g(true, null);
            }
            if (!this.f26258a.mkdirs()) {
                EnumC14106t enumC14106t = EnumC14106t.f26520a3;
                return new C14119g(false, new C14068s(enumC14106t, "Data directory path: " + this.f26258a.getAbsolutePath(), null, null));
            } else if (!this.f26258a.setReadable(true, false)) {
                EnumC14106t enumC14106t2 = EnumC14106t.f26527b3;
                return new C14119g(false, new C14068s(enumC14106t2, "Data directory path: " + this.f26258a.getAbsolutePath(), null, null));
            } else if (!this.f26258a.setWritable(true, false)) {
                EnumC14106t enumC14106t3 = EnumC14106t.f26534c3;
                return new C14119g(false, new C14068s(enumC14106t3, "Data directory path: " + this.f26258a.getAbsolutePath(), null, null));
            } else if (!this.f26258a.setExecutable(true, false)) {
                EnumC14106t enumC14106t4 = EnumC14106t.f26542d3;
                return new C14119g(false, new C14068s(enumC14106t4, "Data directory path: " + this.f26258a.getAbsolutePath(), null, null));
            } else {
                return new C14119g(true, null);
            }
        } catch (SecurityException e) {
            EnumC14106t enumC14106t5 = EnumC14106t.f26550e3;
            return new C14119g(false, new C14068s(enumC14106t5, "Data directory path: " + this.f26258a.getAbsolutePath(), e, null));
        }
    }

    /* renamed from: a */
    public final C14118f m78125a() {
        try {
            File[] listFiles = this.f26258a.listFiles();
            ArrayList arrayList = new ArrayList();
            for (File file : listFiles) {
                arrayList.add(file.getName());
            }
            return new C14118f(true, null, arrayList);
        } catch (SecurityException e) {
            return new C14118f(false, new C14068s(EnumC14106t.f26434O2, "Data directory path: " + this.f26258a.getAbsolutePath(), e, null), null);
        }
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00e6: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:54:0x00e6 */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.five_corp.p372ad.internal.util.C14119g m78123a(java.lang.String r8, byte[] r9) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.five_corp.p372ad.internal.storage.C14078c.m78123a(java.lang.String, byte[]):com.five_corp.ad.internal.util.g");
    }
}
