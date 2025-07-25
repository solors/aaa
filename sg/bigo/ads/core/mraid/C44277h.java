package sg.bigo.ads.core.mraid;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C21114v8;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid.C32180coo2iico;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.pubnative.lite.sdk.mraid.nativefeature.MRAIDNativeFeatureProvider;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.p933u.C43799c;
import sg.bigo.ads.common.p933u.C43807g;
import sg.bigo.ads.common.p933u.p934a.RunnableC43792e;
import sg.bigo.ads.common.p933u.p935b.C43795a;
import sg.bigo.ads.common.p933u.p935b.C43798d;
import sg.bigo.ads.common.p933u.p936c.C43800a;
import sg.bigo.ads.common.utils.C43825h;
import sg.bigo.ads.common.utils.C43834p;

/* renamed from: sg.bigo.ads.core.mraid.h */
/* loaded from: classes10.dex */
public final class C44277h {

    /* renamed from: a */
    private static final String[] f116238a = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ"};

    /* renamed from: b */
    private static Set<String> f116239b = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: sg.bigo.ads.core.mraid.h$a */
    /* loaded from: classes10.dex */
    public static class AsyncTaskC44281a extends AsyncTask<String, Void, Boolean> {

        /* renamed from: a */
        private final Context f116249a;

        /* renamed from: b */
        private final InterfaceC44282a f116250b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: sg.bigo.ads.core.mraid.h$a$a */
        /* loaded from: classes10.dex */
        public interface InterfaceC44282a {
            /* renamed from: a */
            void mo3444a();

            /* renamed from: b */
            void mo3443b();
        }

        public AsyncTaskC44281a(@NonNull Context context, @NonNull InterfaceC44282a interfaceC44282a) {
            this.f116249a = context.getApplicationContext();
            this.f116250b = interfaceC44282a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Boolean doInBackground(@NonNull String[] strArr) {
            FileOutputStream fileOutputStream;
            FileOutputStream fileOutputStream2;
            Throwable th;
            Boolean bool;
            C43799c<C43800a> m4957a;
            C43800a c43800a;
            InputStream inputStream;
            if (strArr == null || strArr.length == 0 || strArr[0] == null) {
                return Boolean.FALSE;
            }
            File m4842d = C43834p.m4842d();
            m4842d.mkdirs();
            String str = strArr[0];
            BufferedInputStream bufferedInputStream = null;
            try {
                C43795a c43795a = new C43795a(new C43798d(str));
                c43795a.f114617k = RunnableC43792e.m4993a();
                m4957a = C43807g.m4957a(c43795a);
                c43800a = m4957a.f114622a;
            } catch (Exception unused) {
                fileOutputStream2 = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
            if (c43800a != null && (inputStream = c43800a.f114625b) != null) {
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
                try {
                    File file = new File(m4842d, m3446a(str, m4957a.f114622a.f114626c));
                    fileOutputStream2 = new FileOutputStream(file);
                    try {
                        m3447a(bufferedInputStream2, fileOutputStream2);
                        C44283b c44283b = new C44283b(file.toString(), (byte) 0);
                        MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(this.f116249a, c44283b);
                        c44283b.f116253c = mediaScannerConnection;
                        mediaScannerConnection.connect();
                        bool = Boolean.TRUE;
                        m3448a(bufferedInputStream2);
                    } catch (Exception unused2) {
                        bufferedInputStream = bufferedInputStream2;
                        try {
                            bool = Boolean.FALSE;
                            m3448a(bufferedInputStream);
                            m3448a(fileOutputStream2);
                            return bool;
                        } catch (Throwable th3) {
                            th = th3;
                            Throwable th4 = th;
                            fileOutputStream = fileOutputStream2;
                            th = th4;
                            m3448a(bufferedInputStream);
                            m3448a(fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        bufferedInputStream = bufferedInputStream2;
                        Throwable th42 = th;
                        fileOutputStream = fileOutputStream2;
                        th = th42;
                        m3448a(bufferedInputStream);
                        m3448a(fileOutputStream);
                        throw th;
                    }
                } catch (Exception unused3) {
                    fileOutputStream2 = null;
                } catch (Throwable th6) {
                    th = th6;
                    fileOutputStream = null;
                    bufferedInputStream = bufferedInputStream2;
                    m3448a(bufferedInputStream);
                    m3448a(fileOutputStream);
                    throw th;
                }
                m3448a(fileOutputStream2);
                return bool;
            }
            Boolean bool2 = Boolean.FALSE;
            m3448a((Closeable) null);
            m3448a((Closeable) null);
            return bool2;
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 != null && bool2.booleanValue()) {
                this.f116250b.mo3444a();
            } else {
                this.f116250b.mo3443b();
            }
        }

        @Nullable
        /* renamed from: a */
        private static String m3446a(@NonNull String str, @Nullable C43825h<List<String>> c43825h) {
            if (c43825h == null) {
                return null;
            }
            String name = new File(String.valueOf(str.hashCode())).getName();
            List<String> m4884a = c43825h.m4884a("content-type");
            if (m4884a == null || m4884a.isEmpty()) {
                return name;
            }
            if (m4884a.get(0) == null) {
                return name;
            }
            for (String str2 : m4884a.get(0).split(";")) {
                if (str2.contains("image/")) {
                    String str3 = "." + str2.split(RemoteSettings.FORWARD_SLASH_STRING)[1];
                    if (name.endsWith(str3)) {
                        return name;
                    }
                    return name + str3;
                }
            }
            return name;
        }

        /* renamed from: a */
        private static void m3448a(Closeable closeable) {
            if (closeable == null) {
                return;
            }
            try {
                closeable.close();
            } catch (Exception unused) {
                C43782a.m5009a(0, "MraidBridge", "Unable to close stream. Ignoring.");
            }
        }

        /* renamed from: a */
        private static void m3447a(InputStream inputStream, OutputStream outputStream) {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return;
                }
                outputStream.write(bArr, 0, read);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.core.mraid.h$b */
    /* loaded from: classes10.dex */
    public static class C44283b implements MediaScannerConnection.MediaScannerConnectionClient {

        /* renamed from: a */
        private final String f116251a;

        /* renamed from: b */
        private final String f116252b;

        /* renamed from: c */
        private MediaScannerConnection f116253c;

        private C44283b(String str) {
            this.f116251a = str;
            this.f116252b = null;
        }

        @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
        public final void onMediaScannerConnected() {
            MediaScannerConnection mediaScannerConnection = this.f116253c;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.scanFile(this.f116251a, this.f116252b);
            }
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public final void onScanCompleted(String str, Uri uri) {
            MediaScannerConnection mediaScannerConnection = this.f116253c;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.disconnect();
            }
        }

        /* synthetic */ C44283b(String str, byte b) {
            this(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.core.mraid.h$c */
    /* loaded from: classes10.dex */
    public interface InterfaceC44284c {
        /* renamed from: a */
        void mo3441a(C44252d c44252d);
    }

    /* renamed from: a */
    private static Date m3454a(String str) {
        Date date = null;
        for (String str2 : f116238a) {
            try {
                date = new SimpleDateFormat(str2, Locale.US).parse(str);
            } catch (ParseException unused) {
            }
            if (date != null) {
                break;
            }
        }
        return date;
    }

    /* renamed from: b */
    private static String m3452b(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        boolean[] zArr = new boolean[7];
        String[] split = str.split(",");
        for (String str3 : split) {
            int parseInt = Integer.parseInt(str3);
            if (parseInt == 7) {
                parseInt = 0;
            }
            if (!zArr[parseInt]) {
                StringBuilder sb3 = new StringBuilder();
                switch (parseInt) {
                    case 0:
                        str2 = "SU";
                        break;
                    case 1:
                        str2 = "MO";
                        break;
                    case 2:
                        str2 = "TU";
                        break;
                    case 3:
                        str2 = "WE";
                        break;
                    case 4:
                        str2 = "TH";
                        break;
                    case 5:
                        str2 = "FR";
                        break;
                    case 6:
                        str2 = "SA";
                        break;
                    default:
                        throw new IllegalArgumentException("invalid day of week ".concat(String.valueOf(parseInt)));
                }
                sb3.append(str2);
                sb3.append(",");
                sb2.append(sb3.toString());
                zArr[parseInt] = true;
            }
        }
        if (split.length != 0) {
            sb2.deleteCharAt(sb2.length() - 1);
            return sb2.toString();
        }
        throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
    }

    /* renamed from: c */
    private static String m3450c(String str) {
        StringBuilder sb2 = new StringBuilder();
        boolean[] zArr = new boolean[63];
        String[] split = str.split(",");
        for (String str2 : split) {
            int parseInt = Integer.parseInt(str2);
            int i = parseInt + 31;
            if (!zArr[i]) {
                StringBuilder sb3 = new StringBuilder();
                if (parseInt == 0 || parseInt < -31 || parseInt > 31) {
                    throw new IllegalArgumentException("invalid day of month ".concat(String.valueOf(parseInt)));
                }
                sb3.append(String.valueOf(parseInt));
                sb3.append(",");
                sb2.append(sb3.toString());
                zArr[i] = true;
            }
        }
        if (split.length != 0) {
            sb2.deleteCharAt(sb2.length() - 1);
            return sb2.toString();
        }
        throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static boolean m3449d(Context context) {
        return m3459a(context, new Intent("android.intent.action.INSERT").setType(C32180coo2iico.cii2c2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m3453b(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return m3459a(context, intent);
    }

    /* renamed from: c */
    public static boolean m3451c(Context context) {
        return "mounted".equals(Environment.getExternalStorageState()) && m3458a(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3457a(final Context context, String str, final InterfaceC44284c interfaceC44284c) {
        if (f116239b.contains(str)) {
            C43782a.m5010a(0, 3, "MraidBridge", "Image downloading task has been created");
            return;
        }
        f116239b.add(str);
        m3455a(new AsyncTaskC44281a(context, new AsyncTaskC44281a.InterfaceC44282a() { // from class: sg.bigo.ads.core.mraid.h.1
            @Override // sg.bigo.ads.core.mraid.C44277h.AsyncTaskC44281a.InterfaceC44282a
            /* renamed from: a */
            public final void mo3444a() {
                C43782a.m5010a(0, 3, "MraidBridge", "Image successfully saved.");
            }

            @Override // sg.bigo.ads.core.mraid.C44277h.AsyncTaskC44281a.InterfaceC44282a
            /* renamed from: b */
            public final void mo3443b() {
                Toast.makeText(context, "Image failed to download.", 0).show();
                C43782a.m5009a(0, "MraidBridge", "Error downloading and saving image file.");
                interfaceC44284c.mo3441a(new C44252d("Error downloading and saving image file."));
            }
        }), str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m3456a(Context context, Map<String, String> map) {
        String str;
        if (!m3449d(context)) {
            C43782a.m5009a(0, "MraidBridge", "unsupported action createCalendarEvent for devices pre-ICS");
            throw new C44252d("Action is unsupported on this device (need Android version Ice Cream Sandwich or above)");
        }
        try {
            HashMap hashMap = new HashMap();
            if (!map.containsKey("description") || !map.containsKey("start")) {
                throw new IllegalArgumentException("Missing start and description fields");
            }
            hashMap.put("title", map.get("description"));
            if (!map.containsKey("start") || map.get("start") == null) {
                throw new IllegalArgumentException("Invalid calendar event: start is null.");
            }
            Date m3454a = m3454a(map.get("start"));
            if (m3454a == null) {
                throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
            }
            hashMap.put(MRAIDNativeFeatureProvider.EXTRA_EVENT_BEGIN_TIME, Long.valueOf(m3454a.getTime()));
            if (map.containsKey("end") && map.get("end") != null) {
                Date m3454a2 = m3454a(map.get("end"));
                if (m3454a2 == null) {
                    throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
                }
                hashMap.put("endTime", Long.valueOf(m3454a2.getTime()));
            }
            if (map.containsKey("location")) {
                hashMap.put(MRAIDNativeFeatureProvider.EVENT_LOCATION, map.get("location"));
            }
            if (map.containsKey("summary")) {
                hashMap.put("description", map.get("summary"));
            }
            if (map.containsKey("transparency")) {
                hashMap.put("availability", Integer.valueOf(map.get("transparency").equals(C21114v8.C21122h.f54047T) ? 1 : 0));
            }
            StringBuilder sb2 = new StringBuilder();
            if (map.containsKey("frequency")) {
                String str2 = map.get("frequency");
                int parseInt = map.containsKey("interval") ? Integer.parseInt(map.get("interval")) : -1;
                if ("daily".equals(str2)) {
                    sb2.append("FREQ=DAILY;");
                    if (parseInt != -1) {
                        str = "INTERVAL=" + parseInt + ";";
                        sb2.append(str);
                    }
                } else if ("weekly".equals(str2)) {
                    sb2.append("FREQ=WEEKLY;");
                    if (parseInt != -1) {
                        sb2.append("INTERVAL=" + parseInt + ";");
                    }
                    if (map.containsKey("daysInWeek")) {
                        String m3452b = m3452b(map.get("daysInWeek"));
                        if (m3452b == null) {
                            throw new IllegalArgumentException("invalid ");
                        }
                        str = "BYDAY=" + m3452b + ";";
                        sb2.append(str);
                    }
                } else if (!"monthly".equals(str2)) {
                    throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
                } else {
                    sb2.append("FREQ=MONTHLY;");
                    if (parseInt != -1) {
                        sb2.append("INTERVAL=" + parseInt + ";");
                    }
                    if (map.containsKey("daysInMonth")) {
                        String m3450c = m3450c(map.get("daysInMonth"));
                        if (m3450c == null) {
                            throw new IllegalArgumentException();
                        }
                        str = "BYMONTHDAY=" + m3450c + ";";
                        sb2.append(str);
                    }
                }
            }
            hashMap.put("rrule", sb2.toString());
            Intent type = new Intent("android.intent.action.INSERT").setType(C32180coo2iico.cii2c2);
            for (String str3 : hashMap.keySet()) {
                Object obj = hashMap.get(str3);
                if (obj instanceof Long) {
                    type.putExtra(str3, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    type.putExtra(str3, ((Integer) obj).intValue());
                } else {
                    type.putExtra(str3, (String) obj);
                }
            }
            type.setFlags(268435456);
            context.startActivity(type);
        } catch (ActivityNotFoundException unused) {
            C43782a.m5009a(0, "MraidBridge", "no calendar app installed");
            throw new C44252d("Action is unsupported on this device - no calendar app installed");
        } catch (IllegalArgumentException e) {
            C43782a.m5009a(0, "MraidBridge", "create calendar: invalid parameters " + e.getMessage());
            throw new C44252d(e);
        } catch (Exception e2) {
            C43782a.m5009a(0, "MraidBridge", "could not create calendar event");
            throw new C44252d(e2);
        }
    }

    /* renamed from: a */
    private static <P> void m3455a(@NonNull final AsyncTask<P, ?, ?> asyncTask, @Nullable final P... pArr) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, pArr);
            return;
        }
        C43782a.m5010a(0, 3, "MraidBridge", "Posting AsyncTask to main thread for execution.");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: sg.bigo.ads.core.mraid.h.2
            @Override // java.lang.Runnable
            public final void run() {
                asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, pArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m3461a(@NonNull Activity activity) {
        return (activity.getWindow() == null || (activity.getWindow().getAttributes().flags & 16777216) == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m3460a(Context context) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return m3459a(context, intent);
    }

    /* renamed from: a */
    private static boolean m3459a(@NonNull Context context, @NonNull Intent intent) {
        return !context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }

    /* renamed from: a */
    private static boolean m3458a(@NonNull Context context, @NonNull String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
