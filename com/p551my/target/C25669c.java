package com.p551my.target;

import com.p551my.target.common.models.ImageData;
import java.util.List;

/* renamed from: com.my.target.c */
/* loaded from: classes7.dex */
public class C25669c {

    /* renamed from: a */
    public final ImageData f66661a;

    /* renamed from: b */
    public final String f66662b;

    /* renamed from: c */
    public List f66663c;

    /* renamed from: com.my.target.c$a */
    /* loaded from: classes7.dex */
    public static class C25670a {

        /* renamed from: a */
        public final String f66664a;

        /* renamed from: b */
        public final String f66665b;

        /* renamed from: c */
        public final String f66666c;

        /* renamed from: d */
        public final String f66667d;

        /* renamed from: e */
        public final String f66668e;

        /* renamed from: f */
        public final boolean f66669f;

        public C25670a(String str, String str2, String str3, String str4, String str5, boolean z) {
            this.f66664a = str;
            this.f66665b = str2;
            this.f66666c = str3;
            this.f66667d = str4;
            this.f66668e = str5;
            this.f66669f = z;
        }

        /* renamed from: a */
        public static C25670a m44129a(String str, String str2, String str3, String str4, String str5, boolean z) {
            return new C25670a(str, str2, str3, str4, str5, z);
        }
    }

    public C25669c(ImageData imageData, String str) {
        this.f66661a = imageData;
        this.f66662b = str;
    }

    /* renamed from: a */
    public List m44134a() {
        return this.f66663c;
    }

    /* renamed from: b */
    public String m44131b() {
        return this.f66662b;
    }

    /* renamed from: c */
    public ImageData m44130c() {
        return this.f66661a;
    }

    /* renamed from: a */
    public static C25669c m44133a(ImageData imageData, String str) {
        return new C25669c(imageData, str);
    }

    /* renamed from: a */
    public void m44132a(List list) {
        this.f66663c = list;
    }
}
