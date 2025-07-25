package com.p551my.target;

/* renamed from: com.my.target.w5 */
/* loaded from: classes7.dex */
public class C26191w5 {

    /* renamed from: a */
    public final int f68143a;

    /* renamed from: b */
    public final String f68144b;

    public C26191w5() {
        this.f68143a = -1;
        this.f68144b = "none";
    }

    /* renamed from: b */
    public static C26191w5 m42586b() {
        return new C26191w5();
    }

    /* renamed from: a */
    public int m42588a() {
        return this.f68143a;
    }

    public String toString() {
        return this.f68144b;
    }

    public C26191w5(String str, int i) {
        this.f68144b = str;
        this.f68143a = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public static C26191w5 m42587a(String str) {
        char c;
        str.hashCode();
        int i = 1;
        switch (str.hashCode()) {
            case 3387192:
                if (str.equals("none")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 729267099:
                if (str.equals("portrait")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1430647483:
                if (str.equals("landscape")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                i = -1;
                break;
            case 1:
                break;
            case 2:
                i = 0;
                break;
            default:
                return null;
        }
        return new C26191w5(str, i);
    }
}
