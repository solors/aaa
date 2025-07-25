package p984t9;

import androidx.webkit.ProxyConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsJVM;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p984t9.BaseInputMask;
import sb.PhoneMasks;

/* compiled from: PhoneInputMask.kt */
@Metadata
/* renamed from: t9.e */
/* loaded from: classes8.dex */
public final class C44393e {
    @NotNull

    /* renamed from: a */
    private static final List<BaseInputMask.C44391c> f116528a;
    @NotNull

    /* renamed from: b */
    private static final BaseInputMask.C44390b f116529b;

    static {
        List<BaseInputMask.C44391c> m17175e;
        m17175e = CollectionsJVM.m17175e(new BaseInputMask.C44391c('0', "\\d", '_'));
        f116528a = m17175e;
        f116529b = new BaseInputMask.C44390b(m3175c(""), m17175e, false);
    }

    @NotNull
    /* renamed from: a */
    public static final List<BaseInputMask.C44391c> m3177a() {
        return f116528a;
    }

    @NotNull
    /* renamed from: b */
    public static final BaseInputMask.C44390b m3176b() {
        return f116529b;
    }

    @NotNull
    /* renamed from: c */
    public static final String m3175c(@NotNull String str) {
        boolean m16635B;
        Intrinsics.checkNotNullParameter(str, "<this>");
        m16635B = StringsJVM.m16635B(str);
        if (m16635B) {
            return "000000000000000";
        }
        JSONObject m10325a = PhoneMasks.f106654a.m10325a();
        int i = 0;
        while (true) {
            if (m10325a.has("value")) {
                break;
            }
            int length = str.length();
            String str2 = ProxyConfig.MATCH_ALL_SCHEMES;
            if (i >= length) {
                Object obj = m10325a.get(ProxyConfig.MATCH_ALL_SCHEMES);
                Intrinsics.m17073h(obj, "null cannot be cast to non-null type org.json.JSONObject");
                m10325a = (JSONObject) obj;
                break;
            }
            int i2 = i + 1;
            String valueOf = String.valueOf(str.charAt(i));
            if (m10325a.has(valueOf)) {
                str2 = valueOf;
            }
            Object obj2 = m10325a.get(str2);
            Intrinsics.m17073h(obj2, "null cannot be cast to non-null type org.json.JSONObject");
            m10325a = (JSONObject) obj2;
            i = i2;
        }
        return m10325a.getString("value") + "00";
    }
}
