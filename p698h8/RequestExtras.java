package p698h8;

import android.os.Bundle;

/* renamed from: h8.a */
/* loaded from: classes7.dex */
public class RequestExtras {

    /* renamed from: b */
    public static String f91363b = "query_info_type";

    /* renamed from: c */
    public static String f91364c = "requester_type_5";

    /* renamed from: d */
    public static String f91365d = "UnityScar";

    /* renamed from: a */
    private String f91366a;

    public RequestExtras(String str) {
        this.f91366a = f91365d + str;
    }

    /* renamed from: a */
    public Bundle m23650a() {
        Bundle bundle = new Bundle();
        bundle.putString(f91363b, f91364c);
        return bundle;
    }

    /* renamed from: b */
    public String m23649b() {
        return this.f91366a;
    }
}
