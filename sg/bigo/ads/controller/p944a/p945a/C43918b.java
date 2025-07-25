package sg.bigo.ads.controller.p944a.p945a;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p552ot.pubsub.p553a.C26484a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.C43722n;
import sg.bigo.ads.common.InterfaceC43615f;
import sg.bigo.ads.common.utils.C43828k;
import sg.bigo.ads.controller.p944a.C43950d;
import sg.bigo.ads.controller.p944a.C43951e;
import sg.bigo.ads.controller.p944a.C43958j;

/* renamed from: sg.bigo.ads.controller.a.a.b */
/* loaded from: classes10.dex */
public class C43918b implements InterfaceC43615f {

    /* renamed from: a */
    public C43922b f115003a;

    /* renamed from: b */
    public C43922b f115004b;

    /* renamed from: c */
    public int f115005c;

    /* renamed from: d */
    private final String f115006d;

    /* renamed from: e */
    private final String f115007e;

    /* renamed from: f */
    private Map<C43920a, C43922b> f115008f;

    /* renamed from: g */
    private Map<C43920a, List<C43922b>> f115009g;

    /* renamed from: h */
    private int f115010h = 3;

    /* renamed from: i */
    private Map<C43920a, C43922b> f115011i = m4582a();

    /* renamed from: j */
    private Map<C43920a, List<C43922b>> f115012j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.controller.a.a.b$a */
    /* loaded from: classes10.dex */
    public static class C43920a implements InterfaceC43615f {

        /* renamed from: c */
        private static final InterfaceC43615f.InterfaceC43616a<C43920a> f115014c = new InterfaceC43615f.InterfaceC43616a<C43920a>() { // from class: sg.bigo.ads.controller.a.a.b.a.1
            @Override // sg.bigo.ads.common.InterfaceC43615f.InterfaceC43616a
            /* renamed from: a */
            public final /* synthetic */ C43920a mo4414a() {
                return new C43920a("", 0);
            }
        };

        /* renamed from: a */
        public String f115015a;

        /* renamed from: b */
        public int f115016b;

        protected C43920a(String str, int i) {
            String lowerCase;
            if (TextUtils.isEmpty(str)) {
                lowerCase = "all";
            } else {
                lowerCase = str.toLowerCase();
            }
            this.f115015a = lowerCase;
            this.f115016b = i;
        }

        @Override // sg.bigo.ads.common.InterfaceC43615f
        /* renamed from: b */
        public final void mo4437b(@NonNull Parcel parcel) {
            this.f115015a = C43722n.m5124a(parcel, "");
            this.f115016b = C43722n.m5126a(parcel, 0);
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C43920a) {
                C43920a c43920a = (C43920a) obj;
                if (TextUtils.equals(this.f115015a, c43920a.f115015a) && this.f115016b == c43920a.f115016b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.f115015a + "_" + this.f115016b).hashCode();
        }

        @NonNull
        public final String toString() {
            return super.toString();
        }

        @Override // sg.bigo.ads.common.InterfaceC43615f
        /* renamed from: a */
        public final void mo4441a(@NonNull Parcel parcel) {
            parcel.writeString(this.f115015a);
            parcel.writeInt(this.f115016b);
        }
    }

    /* renamed from: sg.bigo.ads.controller.a.a.b$b */
    /* loaded from: classes10.dex */
    public static class C43922b extends C43958j implements InterfaceC43615f {

        /* renamed from: d */
        private static final InterfaceC43615f.InterfaceC43616a<C43922b> f115017d = new InterfaceC43615f.InterfaceC43616a<C43922b>() { // from class: sg.bigo.ads.controller.a.a.b.b.1
            @Override // sg.bigo.ads.common.InterfaceC43615f.InterfaceC43616a
            /* renamed from: a */
            public final /* synthetic */ C43922b mo4414a() {
                return new C43922b("", 0);
            }
        };

        /* renamed from: c */
        boolean f115018c;

        protected C43922b(String str, int i) {
            super(str, i);
            this.f115018c = true;
        }

        @Override // sg.bigo.ads.common.InterfaceC43615f
        /* renamed from: a */
        public final void mo4441a(@NonNull Parcel parcel) {
            parcel.writeString(this.f115123a);
            parcel.writeInt(this.f115124b);
            C43722n.m5117a(parcel, this.f115018c);
        }

        @Override // sg.bigo.ads.common.InterfaceC43615f
        /* renamed from: b */
        public final void mo4437b(@NonNull Parcel parcel) {
            this.f115123a = C43722n.m5124a(parcel, "");
            this.f115124b = C43722n.m5126a(parcel, 1);
            this.f115018c = C43722n.m5112b(parcel, true);
        }

        public final boolean equals(@Nullable Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof C43958j) {
                return TextUtils.equals(this.f115123a, ((C43958j) obj).m4511a());
            }
            return false;
        }

        public final int hashCode() {
            String str = this.f115123a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }
    }

    public C43918b(@NonNull String str, @Nullable String str2) {
        this.f115006d = str;
        this.f115007e = str2;
    }

    @NonNull
    /* renamed from: a */
    private static List<C43920a> m4578a(@NonNull C43920a c43920a) {
        ArrayList arrayList = new ArrayList();
        C43920a c43920a2 = new C43920a("all", 0);
        if (c43920a2.equals(c43920a)) {
            arrayList.add(0, c43920a);
            return arrayList;
        }
        arrayList.add(0, c43920a2);
        C43920a c43920a3 = new C43920a("all", c43920a.f115016b);
        if (c43920a3.equals(c43920a)) {
            arrayList.add(0, c43920a);
            return arrayList;
        }
        arrayList.add(0, c43920a3);
        C43920a c43920a4 = new C43920a(c43920a.f115015a, 0);
        if (c43920a4.equals(c43920a)) {
            arrayList.add(0, c43920a);
            return arrayList;
        }
        arrayList.add(0, c43920a4);
        arrayList.add(0, c43920a);
        return arrayList;
    }

    @Nullable
    /* renamed from: b */
    private C43922b m4575b(Map<C43920a, List<C43922b>> map, C43920a c43920a) {
        if (!C43828k.m4873a(map) && c43920a != null) {
            for (C43920a c43920a2 : m4578a(c43920a)) {
                C43922b c43922b = (C43922b) C43828k.m4875a((List<Object>) C43828k.m4876a(map.get(c43920a2), new Comparable<C43922b>() { // from class: sg.bigo.ads.controller.a.a.b.1
                    @Override // java.lang.Comparable
                    public final /* bridge */ /* synthetic */ int compareTo(C43922b c43922b2) {
                        C43922b c43922b3 = c43922b2;
                        if (c43922b3 != null && c43922b3.f115018c) {
                            return 1;
                        }
                        return 0;
                    }
                }));
                if (m4576a(c43922b)) {
                    return c43922b;
                }
            }
        }
        return null;
    }

    @NonNull
    public String toString() {
        return super.toString();
    }

    @NonNull
    /* renamed from: a */
    private Map<C43920a, C43922b> m4582a() {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(this.f115006d)) {
            hashMap.put(new C43920a("all", 0), new C43922b(this.f115006d, 0));
        }
        if (!TextUtils.isEmpty(this.f115007e)) {
            hashMap.put(new C43920a("ru", 0), new C43922b(this.f115007e, 0));
        }
        return hashMap;
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    @CallSuper
    /* renamed from: b */
    public void mo4437b(@NonNull Parcel parcel) {
        synchronized (this) {
            this.f115008f = C43722n.m5119a(parcel, C43920a.f115014c, C43922b.f115017d);
            this.f115009g = C43722n.m5114b(parcel, C43920a.f115014c, C43922b.f115017d);
            this.f115010h = C43722n.m5126a(parcel, 3);
            Map m5119a = C43722n.m5119a(parcel, C43920a.f115014c, C43922b.f115017d);
            this.f115012j = C43722n.m5114b(parcel, C43920a.f115014c, C43922b.f115017d);
            this.f115003a = (C43922b) C43722n.m5115b(parcel, C43922b.f115017d);
            this.f115004b = (C43922b) C43722n.m5115b(parcel, C43922b.f115017d);
            this.f115005c = C43722n.m5126a(parcel, 0);
            this.f115011i = m4582a();
            HashSet hashSet = new HashSet();
            for (C43922b c43922b : this.f115011i.values()) {
                hashSet.add(c43922b.m4511a());
                if (!C43828k.m4873a(m5119a)) {
                    for (C43922b c43922b2 : m5119a.values()) {
                        if (TextUtils.equals(c43922b.m4511a(), c43922b2.m4511a())) {
                            c43922b.f115018c = c43922b2.f115018c;
                        }
                    }
                }
            }
            C43922b c43922b3 = this.f115004b;
            if (c43922b3 != null && c43922b3.m4510b() == 0 && !hashSet.contains(this.f115004b.m4511a())) {
                this.f115003a = this.f115004b;
                this.f115004b = null;
                this.f115005c = 0;
            }
        }
    }

    @Nullable
    /* renamed from: a */
    private static C43922b m4579a(Map<C43920a, C43922b> map, C43920a c43920a) {
        if (!C43828k.m4873a(map) && c43920a != null) {
            for (C43920a c43920a2 : m4578a(c43920a)) {
                C43922b c43922b = map.get(c43920a2);
                if (m4576a(c43922b)) {
                    return c43922b;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[RETURN] */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private sg.bigo.ads.controller.p944a.p945a.C43918b.C43922b m4577a(sg.bigo.ads.controller.p944a.p945a.C43918b.C43920a r6, boolean r7) {
        /*
            r5 = this;
            java.util.Map<sg.bigo.ads.controller.a.a.b$a, sg.bigo.ads.controller.a.a.b$b> r0 = r5.f115008f
            sg.bigo.ads.controller.a.a.b$b r0 = m4579a(r0, r6)
            boolean r1 = m4576a(r0)
            r2 = 0
            if (r1 != 0) goto L34
            java.util.Map<sg.bigo.ads.controller.a.a.b$a, java.util.List<sg.bigo.ads.controller.a.a.b$b>> r0 = r5.f115009g
            sg.bigo.ads.controller.a.a.b$b r0 = r5.m4575b(r0, r6)
            boolean r1 = m4576a(r0)
            if (r1 != 0) goto L34
            java.util.Map<sg.bigo.ads.controller.a.a.b$a, sg.bigo.ads.controller.a.a.b$b> r0 = r5.f115011i
            sg.bigo.ads.controller.a.a.b$b r0 = m4579a(r0, r6)
            boolean r1 = m4576a(r0)
            if (r1 != 0) goto L34
            java.util.Map<sg.bigo.ads.controller.a.a.b$a, java.util.List<sg.bigo.ads.controller.a.a.b$b>> r0 = r5.f115012j
            sg.bigo.ads.controller.a.a.b$b r0 = r5.m4575b(r0, r6)
            boolean r1 = m4576a(r0)
            if (r1 == 0) goto L32
            goto L34
        L32:
            r1 = r2
            goto L35
        L34:
            r1 = 1
        L35:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getBestHost "
            r3.<init>(r4)
            if (r1 == 0) goto L41
            java.lang.String r1 = "success"
            goto L43
        L41:
            java.lang.String r1 = "fail"
        L43:
            r3.append(r1)
            if (r7 == 0) goto L4b
            java.lang.String r7 = " after reset"
            goto L4d
        L4b:
            java.lang.String r7 = ""
        L4d:
            r3.append(r7)
            java.lang.String r7 = ", countryKey="
            r3.append(r7)
            r3.append(r6)
            java.lang.String r6 = ", currentHost="
            r3.append(r6)
            sg.bigo.ads.controller.a.a.b$b r6 = r5.f115004b
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r7 = 3
            java.lang.String r1 = "AntiBanHost"
            sg.bigo.ads.common.p932t.C43782a.m5010a(r2, r7, r1, r6)
            boolean r6 = m4576a(r0)
            if (r6 == 0) goto L73
            return r0
        L73:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.p944a.p945a.C43918b.m4577a(sg.bigo.ads.controller.a.a.b$a, boolean):sg.bigo.ads.controller.a.a.b$b");
    }

    @NonNull
    /* renamed from: a */
    public final C43951e m4581a(String str, int i) {
        boolean z;
        synchronized (this) {
            C43922b c43922b = this.f115004b;
            if (c43922b != null && this.f115005c < this.f115010h) {
                return new C43951e(c43922b, false, false);
            }
            C43920a c43920a = new C43920a(str, i);
            C43922b m4577a = m4577a(c43920a, false);
            if (m4576a(m4577a)) {
                z = false;
            } else {
                Map<C43920a, C43922b> map = this.f115008f;
                if (map != null) {
                    for (Map.Entry<C43920a, C43922b> entry : map.entrySet()) {
                        C43922b value = entry.getValue();
                        if (value != null) {
                            value.f115018c = true;
                        }
                    }
                }
                Map<C43920a, List<C43922b>> map2 = this.f115009g;
                if (map2 != null) {
                    for (Map.Entry<C43920a, List<C43922b>> entry2 : map2.entrySet()) {
                        List<C43922b> value2 = entry2.getValue();
                        if (!C43828k.m4877a((Collection) value2)) {
                            for (C43922b c43922b2 : value2) {
                                c43922b2.f115018c = true;
                            }
                        }
                    }
                }
                Map<C43920a, List<C43922b>> map3 = this.f115012j;
                if (map3 != null) {
                    for (Map.Entry<C43920a, List<C43922b>> entry3 : map3.entrySet()) {
                        List<C43922b> value3 = entry3.getValue();
                        if (!C43828k.m4877a((Collection) value3)) {
                            for (C43922b c43922b3 : value3) {
                                c43922b3.f115018c = true;
                            }
                        }
                    }
                }
                Map<C43920a, C43922b> map4 = this.f115011i;
                if (map4 != null) {
                    for (Map.Entry<C43920a, C43922b> entry4 : map4.entrySet()) {
                        C43922b value4 = entry4.getValue();
                        if (value4 != null) {
                            value4.f115018c = true;
                        }
                    }
                }
                this.f115003a = this.f115004b;
                this.f115004b = null;
                this.f115005c = 0;
                m4577a = m4577a(c43920a, true);
                z = true;
            }
            if (m4576a(m4577a)) {
                m4577a.f115018c = false;
                this.f115003a = this.f115004b;
                this.f115004b = new C43922b(m4577a.m4511a(), m4577a.m4510b());
                this.f115005c = 0;
            }
            if (this.f115004b == null) {
                this.f115004b = new C43922b(this.f115006d, 0);
            }
            return new C43951e(this.f115004b, z, true);
        }
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    @CallSuper
    /* renamed from: a */
    public void mo4441a(@NonNull Parcel parcel) {
        synchronized (this) {
            C43722n.m5122a(parcel, this.f115008f);
            C43722n.m5116b(parcel, this.f115009g);
            parcel.writeInt(this.f115010h);
            C43722n.m5122a(parcel, this.f115011i);
            C43722n.m5116b(parcel, this.f115012j);
            C43722n.m5118a(parcel, this.f115003a);
            C43722n.m5118a(parcel, this.f115004b);
            parcel.writeInt(this.f115005c);
        }
    }

    /* renamed from: a */
    public void mo4569a(@NonNull JSONObject jSONObject) {
        synchronized (this) {
            HashMap hashMap = new HashMap();
            JSONArray optJSONArray = jSONObject.optJSONArray("country_hosts");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString(C26484a.f69188E, "");
                        if (C43950d.m4528a(optString)) {
                            hashMap.put(new C43920a(optJSONObject.optString("country", "all"), optJSONObject.optInt("app_flag", 0)), new C43922b(optString, 1));
                        }
                    }
                }
            }
            HashMap hashMap2 = new HashMap();
            JSONArray optJSONArray2 = jSONObject.optJSONArray("backup_hosts");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                    if (optJSONObject2 != null) {
                        C43920a c43920a = new C43920a(optJSONObject2.optString("country", "all"), optJSONObject2.optInt("app_flag", 0));
                        List list = (List) hashMap2.get(c43920a);
                        if (list == null) {
                            list = new ArrayList();
                            hashMap2.put(c43920a, list);
                        }
                        JSONArray optJSONArray3 = optJSONObject2.optJSONArray("hosts");
                        if (optJSONArray3 != null) {
                            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                                String optString2 = optJSONArray3.optString(i3, "");
                                if (C43950d.m4528a(optString2)) {
                                    C43922b c43922b = new C43922b(optString2, 2);
                                    if (!list.contains(c43922b)) {
                                        list.add(c43922b);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            int optInt = jSONObject.optInt("threshold", 3);
            this.f115008f = hashMap;
            this.f115009g = hashMap2;
            this.f115010h = optInt;
            this.f115012j = new HashMap();
            this.f115011i = m4582a();
            this.f115003a = this.f115004b;
            this.f115004b = null;
            this.f115005c = 0;
        }
    }

    /* renamed from: a */
    public final boolean m4580a(String str, String str2) {
        synchronized (this) {
            if (C43950d.m4528a(str2)) {
                C43920a c43920a = new C43920a(str, 0);
                if (this.f115012j == null) {
                    this.f115012j = new HashMap();
                }
                List<C43922b> list = this.f115012j.get(c43920a);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f115012j.put(c43920a, list);
                }
                C43922b c43922b = new C43922b(str2, 3);
                if (list.contains(c43922b)) {
                    return false;
                }
                list.add(c43922b);
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m4576a(C43922b c43922b) {
        return c43922b != null && c43922b.f115018c;
    }
}
