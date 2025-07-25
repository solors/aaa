package com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C21114v8;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.AbstractC32582cioccoiococ;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.C32574c2oc2i;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.C32579cicic;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.C32583coi222o222;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.C32584coiic;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.C32585coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.pubnative.lite.sdk.mraid.nativefeature.MRAIDNativeFeatureProvider;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.coo2iico */
/* loaded from: classes8.dex */
public class C32180coo2iico {
    private static final String c2oc2i = "end";
    private static final int c2oc2o = 31;
    private static final String[] cco22 = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ"};
    public static final String cii2c2 = "vnd.android.cursor.item/event";
    private static final String cioccoiococ = "INTERVAL=";
    private static final String coi222o222 = "start";
    private static final String coo2iico = "MraidNativeCommandHandler";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.coo2iico$c2oc2o */
    /* loaded from: classes8.dex */
    public interface InterfaceC32183c2oc2o {
        void coo2iico(MraidCommandException mraidCommandException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.coo2iico$cioccoiococ */
    /* loaded from: classes8.dex */
    public static class C32184cioccoiococ implements MediaScannerConnection.MediaScannerConnectionClient {
        private MediaScannerConnection c2oc2i;
        private final String coi222o222;
        private final String coo2iico;

        /* synthetic */ C32184cioccoiococ(String str, String str2, DialogInterface$OnClickListenerC32186coo2iico dialogInterface$OnClickListenerC32186coo2iico) {
            this(str, str2);
        }

        @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
        public void onMediaScannerConnected() {
            MediaScannerConnection mediaScannerConnection = this.c2oc2i;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.scanFile(this.coo2iico, this.coi222o222);
            }
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            MediaScannerConnection mediaScannerConnection = this.c2oc2i;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.disconnect();
            }
        }

        private C32184cioccoiococ(String str, String str2) {
            this.coo2iico = str;
            this.coi222o222 = str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void coo2iico(MediaScannerConnection mediaScannerConnection) {
            this.c2oc2i = mediaScannerConnection;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.coo2iico$coi222o222 */
    /* loaded from: classes8.dex */
    public class C32185coi222o222 implements AsyncTaskC32181c2oc2i.InterfaceC32182coo2iico {
        final /* synthetic */ InterfaceC32183c2oc2o coo2iico;

        C32185coi222o222(InterfaceC32183c2oc2o interfaceC32183c2oc2o) {
            this.coo2iico = interfaceC32183c2oc2o;
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid.C32180coo2iico.AsyncTaskC32181c2oc2i.InterfaceC32182coo2iico
        public void coi222o222() {
            MLog.m25892d(C32180coo2iico.coo2iico, "Image successfully saved.");
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid.C32180coo2iico.AsyncTaskC32181c2oc2i.InterfaceC32182coo2iico
        public void coo2iico() {
            MLog.m25892d(C32180coo2iico.coo2iico, "Error downloading and saving image file.");
            this.coo2iico.coo2iico(new MraidCommandException("Error downloading and saving image file."));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.coo2iico$coo2iico */
    /* loaded from: classes8.dex */
    public class DialogInterface$OnClickListenerC32186coo2iico implements DialogInterface.OnClickListener {
        final /* synthetic */ InterfaceC32183c2oc2o c2oc2i;
        final /* synthetic */ String coi222o222;
        final /* synthetic */ Context coo2iico;

        DialogInterface$OnClickListenerC32186coo2iico(Context context, String str, InterfaceC32183c2oc2o interfaceC32183c2oc2o) {
            this.coo2iico = context;
            this.coi222o222 = str;
            this.c2oc2i = interfaceC32183c2oc2o;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            C32180coo2iico.this.coo2iico(this.coo2iico, this.coi222o222, this.c2oc2i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c2oc2i(@NonNull Context context, @NonNull String str, @NonNull InterfaceC32183c2oc2o interfaceC32183c2oc2o) throws MraidCommandException {
        if (c2oc2i(context)) {
            if (context instanceof Activity) {
                coi222o222(context, str, interfaceC32183c2oc2o);
                return;
            }
            MLog.m25892d(coo2iico, "Downloading image to Picture Gallery ...");
            coo2iico(context, str, interfaceC32183c2oc2o);
            return;
        }
        MLog.m25889e(coo2iico, "Error downloading file - the device does not have an SD card mounted, or the Android permission is not granted.");
        throw new MraidCommandException("Error downloading file  - the device does not have an SD card mounted, or the Android permission is not granted.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean cioccoiococ(Context context) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return C32574c2oc2i.coo2iico(context, intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean coi222o222(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return C32574c2oc2i.coo2iico(context, intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean coo2iico(@NonNull Activity activity) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void coo2iico(Context context, Map<String, String> map) throws MraidCommandException {
        if (coo2iico(context)) {
            try {
                Map<String, Object> coi222o2222 = coi222o222(map);
                Intent type = new Intent("android.intent.action.INSERT").setType(cii2c2);
                for (String str : coi222o2222.keySet()) {
                    Object obj = coi222o2222.get(str);
                    if (obj instanceof Long) {
                        type.putExtra(str, ((Long) obj).longValue());
                    } else if (obj instanceof Integer) {
                        type.putExtra(str, ((Integer) obj).intValue());
                    } else {
                        type.putExtra(str, (String) obj);
                    }
                }
                type.setFlags(268435456);
                context.startActivity(type);
                return;
            } catch (ActivityNotFoundException unused) {
                MLog.m25892d(coo2iico, "no calendar app installed");
                throw new MraidCommandException("Action is unsupported on this device - no calendar app installed");
            } catch (IllegalArgumentException e) {
                MLog.m25892d(coo2iico, "create calendar: invalid parameters " + e.getMessage());
                throw new MraidCommandException(e);
            } catch (Exception e2) {
                MLog.m25892d(coo2iico, "could not create calendar event");
                throw new MraidCommandException(e2);
            }
        }
        MLog.m25892d(coo2iico, "unsupported action createCalendarEvent for devices pre-ICS");
        throw new MraidCommandException("Action is unsupported on this device (need Android version Ice Cream Sandwich or above)");
    }

    private Map<String, Object> coi222o222(Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (map.containsKey("description") && map.containsKey("start")) {
            hashMap.put("title", map.get("description"));
            if (map.containsKey("start") && map.get("start") != null) {
                Date coo2iico2 = coo2iico(map.get("start"));
                if (coo2iico2 != null) {
                    hashMap.put(MRAIDNativeFeatureProvider.EXTRA_EVENT_BEGIN_TIME, Long.valueOf(coo2iico2.getTime()));
                    if (map.containsKey("end") && map.get("end") != null) {
                        Date coo2iico3 = coo2iico(map.get("end"));
                        if (coo2iico3 != null) {
                            hashMap.put("endTime", Long.valueOf(coo2iico3.getTime()));
                        } else {
                            throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
                        }
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
                    hashMap.put("rrule", coo2iico(map));
                    return hashMap;
                }
                throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
            }
            throw new IllegalArgumentException("Invalid calendar event: start is null.");
        }
        throw new IllegalArgumentException("Missing start and description fields");
    }

    public static boolean c2oc2i(Context context) {
        return "mounted".equals(Environment.getExternalStorageState()) && C32583coi222o222.coo2iico(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    private String c2oc2i(String str) throws IllegalArgumentException {
        StringBuilder sb2 = new StringBuilder();
        boolean[] zArr = new boolean[7];
        String[] split = str.split(",");
        for (String str2 : split) {
            int parseInt = Integer.parseInt(str2);
            if (parseInt == 7) {
                parseInt = 0;
            }
            if (!zArr[parseInt]) {
                sb2.append(coi222o222(parseInt) + ",");
                zArr[parseInt] = true;
            }
        }
        if (split.length != 0) {
            sb2.deleteCharAt(sb2.length() - 1);
            return sb2.toString();
        }
        throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean coo2iico(Context context) {
        return C32574c2oc2i.coo2iico(context, new Intent("android.intent.action.INSERT").setType(cii2c2));
    }

    private Date coo2iico(String str) {
        Date date = null;
        for (String str2 : cco22) {
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

    private String coi222o222(String str) throws IllegalArgumentException {
        int parseInt;
        StringBuilder sb2 = new StringBuilder();
        boolean[] zArr = new boolean[63];
        String[] split = str.split(",");
        for (String str2 : split) {
            int parseInt2 = Integer.parseInt(str2) + 31;
            if (!zArr[parseInt2]) {
                sb2.append(coo2iico(parseInt) + ",");
                zArr[parseInt2] = true;
            }
        }
        if (split.length != 0) {
            sb2.deleteCharAt(sb2.length() - 1);
            return sb2.toString();
        }
        throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.coo2iico$c2oc2i */
    /* loaded from: classes8.dex */
    public static class AsyncTaskC32181c2oc2i extends AsyncTask<String, Void, Boolean> {
        private final InterfaceC32182coo2iico coi222o222;
        private final Context coo2iico;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.coo2iico$c2oc2i$coo2iico */
        /* loaded from: classes8.dex */
        public interface InterfaceC32182coo2iico {
            void coi222o222();

            void coo2iico();
        }

        public AsyncTaskC32181c2oc2i(@NonNull Context context, @NonNull InterfaceC32182coo2iico interfaceC32182coo2iico) {
            this.coo2iico = context.getApplicationContext();
            this.coi222o222 = interfaceC32182coo2iico;
        }

        private File coi222o222() {
            return new File(Environment.getExternalStorageDirectory(), "Pictures");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v14, types: [java.io.OutputStream, java.io.Closeable, java.io.FileOutputStream] */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v8 */
        @Override // android.os.AsyncTask
        /* renamed from: coo2iico */
        public Boolean doInBackground(@NonNull String[] strArr) {
            Throwable th;
            ?? r7;
            BufferedInputStream bufferedInputStream;
            HttpURLConnection coi222o222;
            File file;
            if (strArr != null && strArr.length != 0 && strArr[0] != null) {
                File coi222o2222 = coi222o222();
                coi222o2222.mkdirs();
                String str = strArr[0];
                URI create = URI.create(str);
                BufferedInputStream bufferedInputStream2 = null;
                try {
                    coi222o222 = AbstractC32582cioccoiococ.coi222o222(str);
                    bufferedInputStream = new BufferedInputStream(coi222o222.getInputStream());
                } catch (Exception unused) {
                    bufferedInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    r7 = 0;
                    bufferedInputStream = bufferedInputStream2;
                    bufferedInputStream2 = r7;
                    C32579cicic.coo2iico(bufferedInputStream);
                    C32579cicic.coo2iico(bufferedInputStream2);
                    throw th;
                }
                try {
                    String headerField = coi222o222.getHeaderField(ResponseHeader.LOCATION.getKey());
                    if (!TextUtils.isEmpty(headerField)) {
                        create = URI.create(headerField);
                    }
                    file = new File(coi222o2222, coo2iico(create, coi222o222.getHeaderFields()));
                    r7 = new FileOutputStream(file);
                } catch (Exception unused2) {
                } catch (Throwable th3) {
                    th = th3;
                    C32579cicic.coo2iico(bufferedInputStream);
                    C32579cicic.coo2iico(bufferedInputStream2);
                    throw th;
                }
                try {
                    C32579cicic.coo2iico(bufferedInputStream, r7);
                    coo2iico(file.toString());
                    Boolean bool = Boolean.TRUE;
                    C32579cicic.coo2iico(bufferedInputStream);
                    C32579cicic.coo2iico(r7);
                    return bool;
                } catch (Exception unused3) {
                    bufferedInputStream2 = r7;
                    try {
                        Boolean bool2 = Boolean.FALSE;
                        C32579cicic.coo2iico(bufferedInputStream);
                        C32579cicic.coo2iico(bufferedInputStream2);
                        return bool2;
                    } catch (Throwable th4) {
                        th = th4;
                        r7 = bufferedInputStream2;
                        bufferedInputStream2 = bufferedInputStream;
                        bufferedInputStream = bufferedInputStream2;
                        bufferedInputStream2 = r7;
                        C32579cicic.coo2iico(bufferedInputStream);
                        C32579cicic.coo2iico(bufferedInputStream2);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    bufferedInputStream2 = r7;
                    C32579cicic.coo2iico(bufferedInputStream);
                    C32579cicic.coo2iico(bufferedInputStream2);
                    throw th;
                }
            }
            return Boolean.FALSE;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: coo2iico */
        public void onPostExecute(Boolean bool) {
            if (bool != null && bool.booleanValue()) {
                this.coi222o222.coi222o222();
            } else {
                this.coi222o222.coo2iico();
            }
        }

        @Nullable
        private String coo2iico(@NonNull URI uri, @Nullable Map<String, List<String>> map) {
            C32584coiic.coo2iico(uri);
            String path = uri.getPath();
            if (path == null || map == null) {
                return null;
            }
            String name = new File(path).getName();
            List<String> list = map.get(ResponseHeader.CONTENT_TYPE.getKey());
            if (list == null || list.isEmpty()) {
                return name;
            }
            if (list.get(0) == null) {
                return name;
            }
            for (String str : list.get(0).split(";")) {
                if (str.contains("image/")) {
                    String str2 = "." + str.split(RemoteSettings.FORWARD_SLASH_STRING)[1];
                    if (name.endsWith(str2)) {
                        return name;
                    }
                    return name + str2;
                }
            }
            return name;
        }

        private void coo2iico(String str) {
            C32184cioccoiococ c32184cioccoiococ = new C32184cioccoiococ(str, null, null);
            MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(this.coo2iico, c32184cioccoiococ);
            c32184cioccoiococ.coo2iico(mediaScannerConnection);
            mediaScannerConnection.connect();
        }

        InterfaceC32182coo2iico coo2iico() {
            return this.coi222o222;
        }
    }

    private String coo2iico(Map<String, String> map) throws IllegalArgumentException {
        StringBuilder sb2 = new StringBuilder();
        if (map.containsKey("frequency")) {
            String str = map.get("frequency");
            int parseInt = map.containsKey("interval") ? Integer.parseInt(map.get("interval")) : -1;
            if ("daily".equals(str)) {
                sb2.append("FREQ=DAILY;");
                if (parseInt != -1) {
                    sb2.append(cioccoiococ + parseInt + ";");
                }
            } else if ("weekly".equals(str)) {
                sb2.append("FREQ=WEEKLY;");
                if (parseInt != -1) {
                    sb2.append(cioccoiococ + parseInt + ";");
                }
                if (map.containsKey("daysInWeek")) {
                    String c2oc2i2 = c2oc2i(map.get("daysInWeek"));
                    if (c2oc2i2 != null) {
                        sb2.append("BYDAY=" + c2oc2i2 + ";");
                    } else {
                        throw new IllegalArgumentException("invalid ");
                    }
                }
            } else if ("monthly".equals(str)) {
                sb2.append("FREQ=MONTHLY;");
                if (parseInt != -1) {
                    sb2.append(cioccoiococ + parseInt + ";");
                }
                if (map.containsKey("daysInMonth")) {
                    String coi222o2222 = coi222o222(map.get("daysInMonth"));
                    if (coi222o2222 != null) {
                        sb2.append("BYMONTHDAY=" + coi222o2222 + ";");
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
            } else {
                throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
            }
        }
        return sb2.toString();
    }

    private String coi222o222(int i) throws IllegalArgumentException {
        switch (i) {
            case 0:
                return "SU";
            case 1:
                return "MO";
            case 2:
                return "TU";
            case 3:
                return "WE";
            case 4:
                return "TH";
            case 5:
                return "FR";
            case 6:
                return "SA";
            default:
                throw new IllegalArgumentException("invalid day of week " + i);
        }
    }

    private void coi222o222(Context context, String str, InterfaceC32183c2oc2o interfaceC32183c2oc2o) {
        new AlertDialog.Builder(context).setTitle("Save Image").setMessage("Download image to Picture gallery?").setNegativeButton("Cancel", (DialogInterface.OnClickListener) null).setPositiveButton("Okay", new DialogInterface$OnClickListenerC32186coo2iico(context, str, interfaceC32183c2oc2o)).setCancelable(true).show();
    }

    private String coo2iico(int i) throws IllegalArgumentException {
        if (i != 0 && i >= -31 && i <= 31) {
            return "" + i;
        }
        throw new IllegalArgumentException("invalid day of month " + i);
    }

    void coo2iico(Context context, String str, InterfaceC32183c2oc2o interfaceC32183c2oc2o) {
        C32585coo2iico.coo2iico(new AsyncTaskC32181c2oc2i(context, new C32185coi222o222(interfaceC32183c2oc2o)), str);
    }
}
