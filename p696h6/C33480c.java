package p696h6;

import android.annotation.SuppressLint;
import com.p552ot.pubsub.util.C26601v;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: DateUtils.java */
/* renamed from: h6.c */
/* loaded from: classes6.dex */
public class C33480c {

    /* renamed from: a */
    private static final ThreadLocal<DateFormat> f91350a = new C33481a();

    /* compiled from: DateUtils.java */
    /* renamed from: h6.c$a */
    /* loaded from: classes6.dex */
    class C33481a extends ThreadLocal<DateFormat> {
        C33481a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        @SuppressLint({"SimpleDateFormat"})
        /* renamed from: a */
        public DateFormat initialValue() {
            return new SimpleDateFormat(C26601v.f69840g);
        }
    }

    /* renamed from: a */
    public static String m23676a() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) f91350a.get();
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(date);
    }
}
