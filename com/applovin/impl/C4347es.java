package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.es */
/* loaded from: classes2.dex */
public class C4347es {

    /* renamed from: f */
    public static final C4347es f5968f = new C4347es();

    /* renamed from: a */
    private final C4347es f5969a;

    /* renamed from: b */
    private final String f5970b;

    /* renamed from: c */
    private final Map f5971c;

    /* renamed from: d */
    protected String f5972d;

    /* renamed from: e */
    protected final List f5973e;

    private C4347es() {
        this.f5969a = null;
        this.f5970b = "";
        this.f5971c = Collections.emptyMap();
        this.f5972d = "";
        this.f5973e = Collections.emptyList();
    }

    /* renamed from: a */
    public List m99450a(String str) {
        if (str != null) {
            ArrayList arrayList = new ArrayList(this.f5973e.size());
            for (C4347es c4347es : this.f5973e) {
                if (str.equalsIgnoreCase(c4347es.m99447c())) {
                    arrayList.add(c4347es);
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    /* renamed from: b */
    public List m99449b() {
        return Collections.unmodifiableList(this.f5973e);
    }

    /* renamed from: c */
    public String m99447c() {
        return this.f5970b;
    }

    /* renamed from: d */
    public String m99445d() {
        return this.f5972d;
    }

    public String toString() {
        return "XmlNode{elementName='" + this.f5970b + "', text='" + this.f5972d + "', attributes=" + this.f5971c + '}';
    }

    /* renamed from: b */
    public C4347es m99448b(String str) {
        if (str != null) {
            if (this.f5973e.size() > 0) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this);
                while (!arrayList.isEmpty()) {
                    C4347es c4347es = (C4347es) arrayList.get(0);
                    arrayList.remove(0);
                    if (str.equalsIgnoreCase(c4347es.m99447c())) {
                        return c4347es;
                    }
                    arrayList.addAll(c4347es.m99449b());
                }
                return null;
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    /* renamed from: c */
    public C4347es m99446c(String str) {
        if (str != null) {
            for (C4347es c4347es : this.f5973e) {
                if (str.equalsIgnoreCase(c4347es.m99447c())) {
                    return c4347es;
                }
            }
            return null;
        }
        throw new IllegalArgumentException("No name specified.");
    }

    /* renamed from: a */
    public Map m99451a() {
        return this.f5971c;
    }

    public C4347es(String str, Map map, C4347es c4347es) {
        this.f5969a = c4347es;
        this.f5970b = str;
        this.f5971c = Collections.unmodifiableMap(map);
        this.f5973e = new ArrayList();
    }
}
