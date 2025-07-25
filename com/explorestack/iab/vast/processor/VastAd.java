package com.explorestack.iab.vast.processor;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.utils.C10512g;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p734j1.C37250e;
import p734j1.C37263g;
import p734j1.EnumC37246a;
import p767l1.C37895d;
import p767l1.C37896e;
import p767l1.C37898g;
import p767l1.C37904m;
import p767l1.C37905n;

/* loaded from: classes3.dex */
public class VastAd implements Parcelable {
    public static final Parcelable.Creator<VastAd> CREATOR = new C10584a();
    @Nullable

    /* renamed from: b */
    private C37250e f24257b;
    @NonNull

    /* renamed from: c */
    private final C37904m f24258c;
    @NonNull

    /* renamed from: d */
    private final C37905n f24259d;

    /* renamed from: f */
    private ArrayList<C37898g> f24260f;

    /* renamed from: g */
    private ArrayList<String> f24261g;

    /* renamed from: h */
    private ArrayList<String> f24262h;

    /* renamed from: i */
    private ArrayList<String> f24263i;

    /* renamed from: j */
    private ArrayList<String> f24264j;

    /* renamed from: k */
    private EnumMap<EnumC37246a, List<String>> f24265k;

    /* renamed from: l */
    private C37896e f24266l;

    /* renamed from: m */
    private List<C37895d> f24267m = new ArrayList();

    /* renamed from: com.explorestack.iab.vast.processor.VastAd$a */
    /* loaded from: classes3.dex */
    class C10584a implements Parcelable.Creator<VastAd> {
        C10584a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public VastAd createFromParcel(Parcel parcel) {
            return new VastAd(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public VastAd[] newArray(int i) {
            return new VastAd[i];
        }
    }

    protected VastAd(Parcel parcel) {
        this.f24258c = (C37904m) parcel.readSerializable();
        this.f24259d = (C37905n) parcel.readSerializable();
        this.f24260f = (ArrayList) parcel.readSerializable();
        this.f24261g = parcel.createStringArrayList();
        this.f24262h = parcel.createStringArrayList();
        this.f24263i = parcel.createStringArrayList();
        this.f24264j = parcel.createStringArrayList();
        this.f24265k = (EnumMap) parcel.readSerializable();
        this.f24266l = (C37896e) parcel.readSerializable();
        parcel.readList(this.f24267m, C37895d.class.getClassLoader());
    }

    /* renamed from: a */
    void m79019a(@NonNull C37263g c37263g) {
        C37250e c37250e = this.f24257b;
        if (c37250e != null) {
            c37250e.m18654X(c37263g);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m79018c(ArrayList<String> arrayList) {
        this.f24263i = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m79017d(EnumMap<EnumC37246a, List<String>> enumMap) {
        this.f24265k = enumMap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m79016f(C37896e c37896e) {
        this.f24266l = c37896e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m79015g(ArrayList<C37898g> arrayList) {
        this.f24260f = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m79014h(ArrayList<String> arrayList) {
        this.f24262h = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m79013i(ArrayList<String> arrayList) {
        this.f24261g = arrayList;
    }

    /* renamed from: j */
    public List<C37895d> m79012j() {
        return this.f24267m;
    }

    /* renamed from: k */
    public C37896e m79011k() {
        return this.f24266l;
    }

    /* renamed from: l */
    public C37898g m79010l(Context context) {
        ArrayList<C37898g> arrayList = this.f24260f;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C37898g> it = this.f24260f.iterator();
            while (it.hasNext()) {
                C37898g next = it.next();
                int m15801Y = next.m15801Y();
                int m15805U = next.m15805U();
                if (m15801Y > -1 && m15805U > -1) {
                    if (C10512g.m79291z(context) && m15801Y == 728 && m15805U == 90) {
                        return next;
                    }
                    if (!C10512g.m79291z(context) && m15801Y == 320 && m15805U == 50) {
                        return next;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: m */
    public String m79009m() {
        if (this.f24258c.m15784Z() != null) {
            return this.f24258c.m15784Z().m15732R();
        }
        return null;
    }

    /* renamed from: n */
    public List<String> m79008n() {
        return this.f24263i;
    }

    /* renamed from: o */
    public C37898g m79007o(int i, int i2) {
        ArrayList<C37898g> arrayList = this.f24260f;
        if (arrayList != null && !arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            Iterator<C37898g> it = this.f24260f.iterator();
            while (it.hasNext()) {
                C37898g next = it.next();
                int m15801Y = next.m15801Y();
                int m15805U = next.m15805U();
                if (m15801Y > -1 && m15805U > -1) {
                    float max = Math.max(m15801Y, m15805U) / Math.min(m15801Y, m15805U);
                    if (Math.min(m15801Y, m15805U) >= 250 && max <= 2.5d && next.m15800Z()) {
                        hashMap.put(Float.valueOf(m15801Y / m15805U), next);
                    }
                }
            }
            if (!hashMap.isEmpty()) {
                float f = i / i2;
                Set<Float> keySet = hashMap.keySet();
                float floatValue = ((Float) keySet.iterator().next()).floatValue();
                for (Float f2 : keySet) {
                    float floatValue2 = f2.floatValue();
                    if (Math.abs(floatValue - f) > Math.abs(floatValue2 - f)) {
                        floatValue = floatValue2;
                    }
                }
                return (C37898g) hashMap.get(Float.valueOf(floatValue));
            }
        }
        m79019a(C37263g.f98422m);
        return null;
    }

    @Nullable
    /* renamed from: p */
    public Float m79006p() {
        return this.f24258c.m15787W();
    }

    /* renamed from: q */
    public List<String> m79005q() {
        return this.f24262h;
    }

    /* renamed from: r */
    public List<String> m79004r() {
        return this.f24261g;
    }

    @NonNull
    /* renamed from: s */
    public C37905n m79003s() {
        return this.f24259d;
    }

    /* renamed from: t */
    public Map<EnumC37246a, List<String>> m79002t() {
        return this.f24265k;
    }

    /* renamed from: u */
    public ArrayList<String> m79001u() {
        return this.f24264j;
    }

    /* renamed from: v */
    public void m79000v(@NonNull List<C37895d> list) {
        this.f24267m = list;
    }

    /* renamed from: w */
    public void m78999w(@Nullable C37250e c37250e) {
        this.f24257b = c37250e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f24258c);
        parcel.writeSerializable(this.f24259d);
        parcel.writeSerializable(this.f24260f);
        parcel.writeStringList(this.f24261g);
        parcel.writeStringList(this.f24262h);
        parcel.writeStringList(this.f24263i);
        parcel.writeStringList(this.f24264j);
        parcel.writeSerializable(this.f24265k);
        parcel.writeSerializable(this.f24266l);
        parcel.writeList(this.f24267m);
    }

    /* renamed from: x */
    public void m78998x(ArrayList<String> arrayList) {
        this.f24264j = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public VastAd(@NonNull C37904m c37904m, @NonNull C37905n c37905n) {
        this.f24258c = c37904m;
        this.f24259d = c37905n;
    }
}
