package net.pubnative.lite.sdk.mraid.nativefeature;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.columbus.common.Constants;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid.C32180coo2iico;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import net.pubnative.lite.sdk.mraid.internal.MRAIDLog;
import net.pubnative.lite.sdk.mraid.internal.MRAIDNativeFeatureManager;
import net.pubnative.lite.sdk.mraid.nativefeature.MRAIDNativeFeatureProvider;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class MRAIDNativeFeatureProvider {
    public static final String ACTION_HANDLE_CUSTOM_EVENT = "android.provider.calendar.action.HANDLE_CUSTOM_EVENT";
    public static final String AUTHORITY = "com.android.calendar";
    public static final String DESCRIPTION = "description";
    public static final String DISPLAY_COLOR = "displayColor";
    public static final String EVENT_COLOR = "eventColor";
    public static final String EVENT_COLOR_KEY = "eventColor_index";
    public static final String EVENT_LOCATION = "eventLocation";
    public static final String EXTRA_CUSTOM_APP_URI = "customAppUri";
    public static final String EXTRA_EVENT_ALL_DAY = "allDay";
    public static final String EXTRA_EVENT_BEGIN_TIME = "beginTime";
    public static final String EXTRA_EVENT_END_TIME = "endTime";
    public static final String STATUS = "eventStatus";
    private static final String TAG = "MRAIDNativeFeatureProvider";
    public static final String TITLE = "title";
    private final Context context;
    private final MRAIDNativeFeatureManager nativeFeatureManager;

    public MRAIDNativeFeatureProvider(Context context, MRAIDNativeFeatureManager mRAIDNativeFeatureManager) {
        this.context = context;
        this.nativeFeatureManager = mRAIDNativeFeatureManager;
    }

    /* renamed from: a */
    public static /* synthetic */ void m14276a(MRAIDNativeFeatureProvider mRAIDNativeFeatureProvider, String str) {
        mRAIDNativeFeatureProvider.lambda$storePicture$0(str);
    }

    /* renamed from: b */
    public static /* synthetic */ void m14275b(String str, Uri uri) {
        lambda$storePictureInGallery$1(str, uri);
    }

    private void copyStream(InputStream inputStream, OutputStream outputStream) {
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr, 0, 1024);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            }
        } catch (Exception e) {
            String str = TAG;
            MRAIDLog.m14281i(str, "Error saving picture: " + e.getLocalizedMessage());
        }
    }

    private File getAlbumDir() {
        if ("mounted".equals(Environment.getExternalStorageState())) {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), Constants.IMAGE);
            if (!file.mkdirs() && !file.exists()) {
                MRAIDLog.m14281i(TAG, "Failed to create camera directory");
                return null;
            }
            return file;
        }
        MRAIDLog.m14281i(TAG, "External storage is not mounted READ/WRITE.");
        return null;
    }

    public /* synthetic */ void lambda$storePicture$0(String str) {
        try {
            storePictureInGallery(str);
        } catch (Exception e) {
            MRAIDLog.m14283e(TAG, e.getLocalizedMessage());
        }
    }

    public static /* synthetic */ void lambda$storePictureInGallery$1(String str, Uri uri) {
        MRAIDLog.m14286d("File saves successfully to " + str);
    }

    @SuppressLint({"SimpleDateFormat"})
    private void storePictureInGallery(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmss");
        String str2 = getAlbumDir() + "/img" + simpleDateFormat.format(new Date()) + ".png";
        String str3 = TAG;
        MRAIDLog.m14281i(str3, "Saving image into: " + str2);
        File file = new File(str2);
        try {
            copyStream(new URL(str).openStream(), new FileOutputStream(file));
            MediaScannerConnection.scanFile(this.context, new String[]{file.getAbsolutePath()}, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: we.a
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str4, Uri uri) {
                    MRAIDNativeFeatureProvider.m14275b(str4, uri);
                }
            });
            MRAIDLog.m14281i(str3, "Saved image successfully");
        } catch (MalformedURLException e) {
            MRAIDLog.m14283e(TAG, "Not able to save image due to invalid URL: " + e.getLocalizedMessage());
        } catch (IOException e2) {
            MRAIDLog.m14283e(TAG, "Unable to save image: " + e2.getLocalizedMessage());
        }
    }

    public final void callTel(String str) {
        if (this.nativeFeatureManager.isTelSupported()) {
            this.context.startActivity(new Intent("android.intent.action.DIAL", Uri.parse(str)));
        }
    }

    public void createCalendarEvent(String str) {
        if (!this.nativeFeatureManager.isCalendarSupported()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str.replace("\\", "").replace("\"{", "{").replace("}\"", "}"));
            String optString = jSONObject.optString("description", "Untitled");
            String optString2 = jSONObject.optString("location", "unknown");
            String optString3 = jSONObject.optString("summary");
            String[] strArr = {"yyyy-MM-dd'T'HH:mmZ", "yyyy-MM-dd'T'HH:mm:ssZ"};
            String[] strArr2 = new String[2];
            strArr2[0] = jSONObject.getString("start");
            strArr2[1] = jSONObject.optString("end");
            long j = 0;
            long j2 = 0;
            for (int i = 0; i < 2; i++) {
                if (!TextUtils.isEmpty(strArr2[i])) {
                    strArr2[i] = strArr2[i].replaceAll("([+-]\\d\\d):(\\d\\d)$", "$1$2");
                    int i2 = 0;
                    while (true) {
                        if (i2 < 2) {
                            try {
                                Date parse = new SimpleDateFormat(strArr[i2], Locale.US).parse(strArr2[i]);
                                if (parse != null) {
                                    if (i == 0) {
                                        j = parse.getTime();
                                    } else {
                                        j2 = parse.getTime();
                                    }
                                }
                            } catch (ParseException unused) {
                                i2++;
                            }
                        }
                    }
                }
            }
            Intent type = new Intent("android.intent.action.INSERT").setType(C32180coo2iico.cii2c2);
            type.putExtra("title", optString);
            type.putExtra("description", optString3);
            type.putExtra(EVENT_LOCATION, optString2);
            if (j > 0) {
                type.putExtra(EXTRA_EVENT_BEGIN_TIME, j);
            }
            long j3 = j2;
            if (j3 > 0) {
                type.putExtra("endTime", j3);
            }
            this.context.startActivity(type);
        } catch (JSONException e) {
            MRAIDLog.m14283e(TAG, "Error parsing JSON: " + e.getLocalizedMessage());
        }
    }

    public void openBrowser(String str) {
        if (str.startsWith("market:")) {
            this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } else if (str.startsWith("http:") || str.startsWith("https:")) {
            this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        }
    }

    public void playVideo(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setDataAndType(Uri.parse(str), "video/*");
        this.context.startActivity(intent);
    }

    public void sendSms(String str) {
        if (this.nativeFeatureManager.isSmsSupported()) {
            this.context.startActivity(new Intent("android.intent.action.SENDTO", Uri.parse(str)));
        }
    }

    public void storePicture(final String str) {
        if (this.nativeFeatureManager.isStorePictureSupported()) {
            new Thread(new Runnable() { // from class: we.b
                @Override // java.lang.Runnable
                public final void run() {
                    MRAIDNativeFeatureProvider.m14276a(MRAIDNativeFeatureProvider.this, str);
                }
            }).start();
        }
    }
}
