package com.amazon.p047a.p048a.p061i;

import com.ironsource.C21114v8;

/* renamed from: com.amazon.a.a.i.c */
/* loaded from: classes2.dex */
public class PromptContent {

    /* renamed from: a */
    private final String f2431a;

    /* renamed from: b */
    private final String f2432b;

    /* renamed from: c */
    private final String f2433c;

    /* renamed from: d */
    private final String[] f2434d;

    /* renamed from: e */
    private final EnumC3530a[] f2435e;

    /* renamed from: f */
    private final boolean f2436f;

    /* renamed from: g */
    private final boolean f2437g;

    /* renamed from: h */
    private final int f2438h;

    /* renamed from: i */
    private final int f2439i;

    /* compiled from: PromptContent.java */
    /* renamed from: com.amazon.a.a.i.c$a */
    /* loaded from: classes2.dex */
    public enum EnumC3530a {
        DEFAULT,
        HELP,
        DEEPLINK
    }

    public PromptContent(String str, String str2, String str3, boolean z) {
        this(str, str2, str3, z, false);
    }

    /* renamed from: a */
    public String m103098a() {
        return this.f2434d[this.f2438h];
    }

    /* renamed from: b */
    public String[] m103097b() {
        return this.f2434d;
    }

    /* renamed from: c */
    public EnumC3530a[] m103096c() {
        return this.f2435e;
    }

    /* renamed from: d */
    public String m103095d() {
        return this.f2433c;
    }

    /* renamed from: e */
    public String m103094e() {
        return this.f2432b;
    }

    /* renamed from: f */
    public String m103093f() {
        return this.f2431a;
    }

    /* renamed from: g */
    public int m103092g() {
        return this.f2439i;
    }

    /* renamed from: h */
    public boolean m103091h() {
        return this.f2436f;
    }

    /* renamed from: i */
    public boolean m103090i() {
        return this.f2437g;
    }

    public String toString() {
        return "PromptContent: [ title:" + this.f2431a + ", message: " + this.f2433c + ", label: " + this.f2434d[0] + ", visible: " + this.f2436f + ", shouldShowFixup: " + this.f2437g + C21114v8.C21123i.f54139e;
    }

    public PromptContent(String str, String str2, String str3, boolean z, boolean z2) {
        this(str, str2, new String[]{str3}, new EnumC3530a[]{EnumC3530a.DEFAULT}, z, z2, 0);
    }

    public PromptContent(String str, String str2, String[] strArr, EnumC3530a[] enumC3530aArr, boolean z, boolean z2, int i) {
        this(new String[]{str}, str2, strArr, enumC3530aArr, z, z2, i);
    }

    public PromptContent(String[] strArr, String str, String[] strArr2, EnumC3530a[] enumC3530aArr, boolean z, boolean z2, int i) {
        this(strArr, str, strArr2, enumC3530aArr, z, z2, i, -1);
    }

    public PromptContent(String[] strArr, String str, String[] strArr2, EnumC3530a[] enumC3530aArr, boolean z, boolean z2, int i, int i2) {
        String str2 = strArr[0];
        this.f2431a = str2;
        if (strArr.length > 1) {
            this.f2432b = strArr[1];
        } else {
            this.f2432b = str2;
        }
        this.f2433c = str;
        this.f2434d = strArr2;
        this.f2435e = enumC3530aArr;
        this.f2436f = z;
        this.f2437g = z2;
        this.f2438h = i;
        this.f2439i = i2;
    }
}
