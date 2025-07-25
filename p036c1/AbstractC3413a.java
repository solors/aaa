package p036c1;

import android.text.TextUtils;
import android.util.Pair;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import p989u0.EnumC44418c;

/* renamed from: c1.a */
/* loaded from: classes3.dex */
public abstract class AbstractC3413a {
    /* renamed from: a */
    public static Object[] m103684a(Throwable th, EnumC44418c enumC44418c) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new Pair("exception_name", th.getClass().getSimpleName()));
        arrayList.add(new Pair("description", th.getMessage()));
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringBuffer = stringWriter.getBuffer().toString();
        if (!TextUtils.isEmpty(stringBuffer)) {
            arrayList.add(new Pair("stack_trace", stringBuffer));
        }
        if (enumC44418c != null) {
            arrayList.add(new Pair("error_code", enumC44418c.m3081b()));
        }
        Object[] objArr = new Object[arrayList.size() * 2];
        int i = 1;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Pair pair = (Pair) arrayList.get(i3);
            objArr[i2] = pair.first;
            objArr[i] = pair.second;
            i2 += 2;
            i += 2;
        }
        return objArr;
    }
}
