package com.ironsource;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.ironsource.t2 */
/* loaded from: classes6.dex */
public class C20997t2 implements Parcelable {
    public static final Parcelable.Creator<C20997t2> CREATOR = new C20998a();

    /* renamed from: a */
    private String f53527a;

    /* renamed from: b */
    private String f53528b;

    /* renamed from: c */
    private String f53529c;

    /* renamed from: d */
    private boolean f53530d;

    /* renamed from: e */
    private int f53531e;

    /* renamed from: f */
    private ArrayList<String> f53532f;

    /* renamed from: g */
    private ArrayList<String> f53533g;

    /* renamed from: h */
    private ArrayList<String> f53534h;

    /* renamed from: i */
    private ArrayList<String> f53535i;

    /* renamed from: j */
    private String f53536j;

    /* renamed from: k */
    private String f53537k;

    /* renamed from: l */
    private Map<String, String> f53538l;

    /* renamed from: com.ironsource.t2$a */
    /* loaded from: classes6.dex */
    class C20998a implements Parcelable.Creator<C20997t2> {
        C20998a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C20997t2 createFromParcel(Parcel parcel) {
            return new C20997t2(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C20997t2[] newArray(int i) {
            return new C20997t2[i];
        }
    }

    public C20997t2() {
        m54839i();
    }

    /* renamed from: a */
    private Map<String, String> m54860a(String str) {
        IronLog ironLog;
        String th;
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            ironLog = IronLog.INTERNAL;
            th = e.toString();
            ironLog.error(th);
            return hashMap;
        } catch (Throwable th2) {
            C20086i9.m57997d().m58003a(th2);
            ironLog = IronLog.INTERNAL;
            th = th2.toString();
            ironLog.error(th);
            return hashMap;
        }
        return hashMap;
    }

    /* renamed from: i */
    private void m54839i() {
        this.f53530d = false;
        this.f53531e = -1;
        this.f53532f = new ArrayList<>();
        this.f53533g = new ArrayList<>();
        this.f53534h = new ArrayList<>();
        this.f53535i = new ArrayList<>();
        this.f53537k = "";
        this.f53536j = "";
        this.f53538l = new HashMap();
    }

    /* renamed from: b */
    public String m54856b() {
        return this.f53529c;
    }

    /* renamed from: c */
    public int m54853c() {
        return this.f53531e;
    }

    /* renamed from: d */
    public String m54850d() {
        return this.f53536j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Map<String, String> m54847e() {
        return this.f53538l;
    }

    /* renamed from: f */
    public String m54845f() {
        return this.f53537k;
    }

    /* renamed from: g */
    public String m54843g() {
        return this.f53527a;
    }

    /* renamed from: h */
    public String m54841h() {
        return this.f53528b;
    }

    /* renamed from: j */
    public void m54836j(String str) {
        this.f53528b = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        try {
            sb2.append("shouldRestore:");
            sb2.append(this.f53530d);
            sb2.append(", ");
            sb2.append("displayedProduct:");
            sb2.append(this.f53531e);
            sb2.append(", ");
            sb2.append("ISReportInit:");
            sb2.append(this.f53532f);
            sb2.append(", ");
            sb2.append("ISInitSuccess:");
            sb2.append(this.f53533g);
            sb2.append(", ");
            sb2.append("ISAppKey");
            sb2.append(this.f53536j);
            sb2.append(", ");
            sb2.append("ISUserId");
            sb2.append(this.f53537k);
            sb2.append(", ");
            sb2.append("ISExtraParams");
            sb2.append(this.f53538l);
            sb2.append(", ");
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            parcel.writeByte(this.f53530d ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f53531e);
            parcel.writeString(this.f53527a);
            parcel.writeString(this.f53528b);
            parcel.writeString(this.f53529c);
            parcel.writeString(this.f53536j);
            parcel.writeString(this.f53537k);
            parcel.writeString(new JSONObject(this.f53538l).toString());
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
        }
    }

    private C20997t2(Parcel parcel) {
        m54839i();
        try {
            this.f53530d = parcel.readByte() != 0;
            this.f53531e = parcel.readInt();
            this.f53527a = parcel.readString();
            this.f53528b = parcel.readString();
            this.f53529c = parcel.readString();
            this.f53536j = parcel.readString();
            this.f53537k = parcel.readString();
            this.f53538l = m54860a(parcel.readString());
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            m54839i();
        }
    }

    /* renamed from: a */
    public void m54862a() {
        this.f53531e = -1;
    }

    /* renamed from: b */
    public void m54854b(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            this.f53535i.remove(str);
        } else if (this.f53535i.indexOf(str) == -1) {
            this.f53535i.add(str);
        }
    }

    /* renamed from: c */
    public void m54851c(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            this.f53532f.remove(str);
        } else if (this.f53532f.indexOf(str) == -1) {
            this.f53532f.add(str);
        }
    }

    /* renamed from: d */
    public void m54848d(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            this.f53534h.remove(str);
        } else if (this.f53534h.indexOf(str) == -1) {
            this.f53534h.add(str);
        }
    }

    /* renamed from: e */
    public boolean m54846e(String str) {
        return !TextUtils.isEmpty(str) && this.f53534h.indexOf(str) > -1;
    }

    /* renamed from: f */
    public void m54844f(String str) {
        this.f53529c = str;
    }

    /* renamed from: g */
    public void m54842g(String str) {
        this.f53536j = str;
    }

    /* renamed from: h */
    public void m54840h(String str) {
        this.f53537k = str;
    }

    /* renamed from: i */
    public void m54838i(String str) {
        this.f53527a = str;
    }

    /* renamed from: j */
    public boolean m54837j() {
        return this.f53530d;
    }

    /* synthetic */ C20997t2(Parcel parcel, C20998a c20998a) {
        this(parcel);
    }

    /* renamed from: a */
    public void m54861a(int i) {
        this.f53531e = i;
    }

    /* renamed from: b */
    public boolean m54855b(String str) {
        return !TextUtils.isEmpty(str) && this.f53533g.indexOf(str) > -1;
    }

    /* renamed from: c */
    public boolean m54852c(String str) {
        return !TextUtils.isEmpty(str) && this.f53535i.indexOf(str) > -1;
    }

    /* renamed from: d */
    public boolean m54849d(String str) {
        return !TextUtils.isEmpty(str) && this.f53532f.indexOf(str) > -1;
    }

    /* renamed from: a */
    public void m54859a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!z) {
            this.f53533g.remove(str);
        } else if (this.f53533g.indexOf(str) == -1) {
            this.f53533g.add(str);
        }
    }

    /* renamed from: a */
    public void m54858a(Map<String, String> map) {
        this.f53538l = map;
    }

    /* renamed from: a */
    public void m54857a(boolean z) {
        this.f53530d = z;
    }
}
