package p738j5;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;

/* renamed from: j5.d */
/* loaded from: classes6.dex */
public class GsonUtils {

    /* renamed from: a */
    private static Gson f98453a = new Gson();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GsonUtils.java */
    /* renamed from: j5.d$a */
    /* loaded from: classes6.dex */
    public class C37293a extends TypeToken<List<String>> {
        C37293a() {
        }
    }

    /* renamed from: a */
    public static List<String> m18541a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            List<String> list = (List) f98453a.fromJson(str, new C37293a().getType());
            if (list != null) {
                if (!list.isEmpty()) {
                    return list;
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: b */
    public static Gson m18540b() {
        return f98453a;
    }

    /* renamed from: c */
    public static String m18539c(Object obj) {
        return f98453a.toJson(obj);
    }
}
