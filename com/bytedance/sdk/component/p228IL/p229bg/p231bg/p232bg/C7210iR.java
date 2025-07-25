package com.bytedance.sdk.component.p228IL.p229bg.p231bg.p232bg;

import android.text.TextUtils;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7191Ta;
import com.bytedance.sdk.component.p228IL.p229bg.AbstractC7220xxp;
import com.bytedance.sdk.component.p228IL.p229bg.C7214eo;
import com.bytedance.sdk.component.p228IL.p229bg.C7219ldr;
import com.bytedance.sdk.component.p228IL.p229bg.EnumC7190PX;
import com.bytedance.sdk.component.p254bX.p255bg.C7569bg;
import com.bytedance.sdk.component.utils.C7741PX;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.IL.bg.bg.bg.iR */
/* loaded from: classes3.dex */
public class C7210iR extends AbstractC7189Lq {

    /* renamed from: bg */
    public static int f15542bg = -1;

    /* renamed from: IL */
    HttpURLConnection f15543IL;

    /* renamed from: bX */
    AbstractC7191Ta f15544bX;
    int eqN;

    /* renamed from: zx */
    String f15545zx;

    public C7210iR(HttpURLConnection httpURLConnection, AbstractC7191Ta abstractC7191Ta) {
        this.eqN = f15542bg;
        this.f15543IL = httpURLConnection;
        this.f15544bX = abstractC7191Ta;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq
    /* renamed from: IL */
    public long mo89614IL() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq
    /* renamed from: Kg */
    public EnumC7190PX mo89613Kg() {
        return EnumC7190PX.HTTP_1_1;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq
    /* renamed from: WR */
    public C7214eo mo89612WR() {
        if (m89607eo() != null && m89607eo().f15503IL != null) {
            return new C7214eo(m89607eo().f15503IL);
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq
    /* renamed from: bX */
    public int mo89611bX() {
        try {
            return this.f15543IL.getResponseCode();
        } catch (Exception unused) {
            return this.eqN;
        }
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq
    /* renamed from: bg */
    public long mo89610bg() {
        return 0L;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            ldr().close();
        } catch (Exception unused) {
        }
    }

    /* renamed from: eo */
    public AbstractC7191Ta m89607eo() {
        return this.f15544bX;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq
    public boolean eqN() {
        if (mo89611bX() >= 200 && mo89611bX() < 300) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq
    /* renamed from: iR */
    public C7219ldr mo89606iR() {
        if (this.f15543IL == null) {
            return new C7219ldr(new String[0]);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : this.f15543IL.getHeaderFields().entrySet()) {
            for (String str : entry.getValue()) {
                if (!"Content-Range".equalsIgnoreCase(entry.getKey()) || mo89611bX() != 206) {
                    arrayList.add(entry.getKey());
                    arrayList.add(str);
                }
            }
        }
        return new C7219ldr((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq
    public AbstractC7220xxp ldr() {
        C7205Kg c7205Kg;
        C7569bg c7569bg;
        C7569bg c7569bg2;
        AbstractC7191Ta abstractC7191Ta = this.f15544bX;
        if (abstractC7191Ta != null && (c7569bg2 = abstractC7191Ta.f15503IL) != null) {
            c7569bg2.m88513VB();
        }
        try {
            try {
                c7205Kg = new C7205Kg(this.f15543IL);
            } catch (Throwable th) {
                C7741PX.m87880IL(th.getMessage());
                c7205Kg = null;
            }
        } catch (Exception unused) {
            HttpURLConnection httpURLConnection = this.f15543IL;
            c7205Kg = new C7205Kg(httpURLConnection, httpURLConnection.getErrorStream());
        }
        AbstractC7191Ta abstractC7191Ta2 = this.f15544bX;
        if (abstractC7191Ta2 != null && (c7569bg = abstractC7191Ta2.f15503IL) != null) {
            c7569bg.m88514Ta();
        }
        return c7205Kg;
    }

    public String toString() {
        return "";
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq
    /* renamed from: zx */
    public String mo89605zx() throws IOException {
        if (!TextUtils.isEmpty(this.f15545zx)) {
            return this.f15545zx;
        }
        return this.f15543IL.getResponseMessage();
    }

    /* renamed from: bg */
    public String m89609bg(String str) {
        HttpURLConnection httpURLConnection = this.f15543IL;
        return httpURLConnection == null ? "" : httpURLConnection.getHeaderField(str);
    }

    @Override // com.bytedance.sdk.component.p228IL.p229bg.AbstractC7189Lq
    /* renamed from: bg */
    public String mo89608bg(String str, String str2) {
        return !TextUtils.isEmpty(m89609bg(str)) ? m89609bg(str) : str2;
    }

    public C7210iR(int i, String str, AbstractC7191Ta abstractC7191Ta) {
        this.f15545zx = str;
        this.f15544bX = abstractC7191Ta;
        this.eqN = i;
    }
}
