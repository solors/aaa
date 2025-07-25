package com.pubmatic.sdk.webrendering.mraid;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.ironsource.C21114v8;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidEnvironmentProperties;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import net.pubnative.lite.sdk.mraid.nativefeature.MRAIDNativeFeatureProvider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBMRAIDUtil {

    /* renamed from: a */
    private static final String[] f71149a = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ", "yyyy-MM-dd'T'HH:mmZ", "yyyy-MM-dd'T'HH:mmXXX"};

    /* JADX INFO: Access modifiers changed from: package-private */
    @WorkerThread
    /* renamed from: a */
    public static boolean m39914a(@NonNull Context context, @NonNull Bitmap bitmap, @NonNull String str) {
        Uri fromFile;
        OutputStream outputStream = null;
        try {
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("title", str);
                    contentValues.put("_display_name", str);
                    contentValues.put("mime_type", "image/jpeg");
                    contentValues.put("date_added", Long.valueOf(System.currentTimeMillis() / 1000));
                    contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
                    ContentResolver contentResolver = context.getContentResolver();
                    fromFile = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                    if (fromFile != null) {
                        outputStream = contentResolver.openOutputStream(fromFile);
                    }
                } else {
                    File file = new File(String.valueOf(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)), str);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        fromFile = Uri.fromFile(file);
                        outputStream = fileOutputStream;
                    } catch (Exception e) {
                        e = e;
                        outputStream = fileOutputStream;
                        POBLog.debug("POBMRAIDUtil", "Not able to store image : " + e.getLocalizedMessage(), new Object[0]);
                        if (outputStream != null) {
                            try {
                                outputStream.flush();
                                outputStream.close();
                            } catch (IOException unused) {
                                POBLog.debug("POBMRAIDUtil", "Unable to close the outputStream.", new Object[0]);
                            }
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        outputStream = fileOutputStream;
                        if (outputStream != null) {
                            try {
                                outputStream.flush();
                                outputStream.close();
                            } catch (IOException unused2) {
                                POBLog.debug("POBMRAIDUtil", "Unable to close the outputStream.", new Object[0]);
                            }
                        }
                        throw th;
                    }
                }
            } catch (Exception e2) {
                e = e2;
            }
            if (outputStream != null) {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, outputStream);
                outputStream.flush();
                outputStream.close();
                POBLog.debug("POBMRAIDUtil", "Image stored at :" + fromFile, new Object[0]);
                Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                intent.setData(fromFile);
                context.sendBroadcast(intent);
                try {
                    outputStream.flush();
                    outputStream.close();
                    return true;
                } catch (IOException unused3) {
                    POBLog.debug("POBMRAIDUtil", "Unable to close the outputStream.", new Object[0]);
                    return true;
                }
            }
            POBLog.debug("POBMRAIDUtil", "Not able to store image.", new Object[0]);
            if (outputStream != null) {
                try {
                    outputStream.flush();
                    outputStream.close();
                } catch (IOException unused4) {
                    POBLog.debug("POBMRAIDUtil", "Unable to close the outputStream.", new Object[0]);
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d5 A[Catch: JSONException -> 0x00ea, TryCatch #0 {JSONException -> 0x00ea, blocks: (B:3:0x000f, B:5:0x0015, B:7:0x0020, B:9:0x002a, B:30:0x0069, B:32:0x0070, B:33:0x0079, B:35:0x007f, B:37:0x0089, B:38:0x0095, B:39:0x009a, B:40:0x009b, B:41:0x00a0, B:42:0x00a1, B:44:0x00a8, B:45:0x00b1, B:47:0x00b7, B:49:0x00c1, B:50:0x00cd, B:51:0x00d4, B:52:0x00d5, B:54:0x00dc, B:16:0x0040, B:19:0x004a, B:22:0x0054), top: B:59:0x000f }] */
    @androidx.annotation.NonNull
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m39908b(@androidx.annotation.NonNull org.json.JSONObject r11) throws java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pubmatic.sdk.webrendering.mraid.POBMRAIDUtil.m39908b(org.json.JSONObject):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    public static JSONObject getHeightWidthJson(int i, int i2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", i);
            jSONObject.put("height", i2);
        } catch (JSONException unused) {
            POBLog.error("POBMRAIDUtil", "JSON Exception, Not able to generate JSON for given width :" + i + " and height " + i2 + " !", new Object[0]);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    public static String getMRAIDEnvironment(@Nullable String str, @Nullable String str2, @Nullable Boolean bool, @Nullable Boolean bool2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", MraidEnvironmentProperties.VERSION);
            jSONObject.put("sdk", "PubMatic_OpenWrap_SDK");
            jSONObject.put("sdkVersion", "4.4.0");
            if (str != null) {
                jSONObject.put("appId", str);
            }
            if (str2 != null) {
                jSONObject.put(EidRequestBuilder.REQUEST_FIELD_IFA, str2);
            }
            if (bool != null) {
                jSONObject.put("limitAdTracking", bool);
            }
            if (bool2 != null) {
                jSONObject.put("coppa", bool2);
            }
        } catch (JSONException unused) {
            POBLog.error("POBMRAIDUtil", "JSON Exception, not able to generate MRAID environment.", new Object[0]);
        }
        return "<script> window.MRAID_ENV = " + jSONObject + "</script>";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    public static JSONObject getRectJson(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("width", i3);
            jSONObject.put("height", i4);
            jSONObject.put("x", i);
            jSONObject.put("y", i2);
        } catch (JSONException unused) {
            POBLog.error("POBMRAIDUtil", "JSON Exception, Not able to generate JSON for x:" + i + " ,y:" + i2 + " ,width:" + i3 + " ,height:" + i4 + " !", new Object[0]);
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    public static POBViewRect getResizeValues(int i, int i2, int i3, int i4, boolean z, @NonNull POBViewRect pOBViewRect, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int screenWidth = POBUtils.getScreenWidth();
        int screenHeight = POBUtils.getScreenHeight();
        int i10 = i + pOBViewRect.getxPosition();
        int i11 = i2 + pOBViewRect.getyPosition();
        int i12 = 0;
        if (i3 >= screenWidth && i4 >= screenHeight) {
            return new POBViewRect(false, "Size must be smaller than the max size.");
        }
        if (i3 >= 50 && i4 >= 50) {
            if (!z) {
                if (i3 > screenWidth) {
                    i3 = screenWidth;
                }
                if (i4 > screenHeight) {
                    i4 = screenHeight;
                }
                if (i10 < 0) {
                    i8 = 0;
                } else {
                    if (i10 + i3 > screenWidth) {
                        i8 = (int) (i10 - (i7 - screenWidth));
                    } else {
                        i8 = i10;
                    }
                }
                if (i11 >= 0) {
                    if (i11 + i4 > screenHeight) {
                        i12 = (int) (i11 - (i9 - screenHeight));
                    } else {
                        i12 = i11;
                    }
                }
                i10 = (int) (i10 - (i10 - i8));
                i11 = (int) (i11 - (i11 - i12));
            } else {
                int i13 = i10 + i3;
                if (i13 < i5 || i13 > screenWidth || i11 < 0 || i11 > screenHeight - i6) {
                    return new POBViewRect(false, "Not able to show Close Button! No Space for close Button.");
                }
            }
            return new POBViewRect(POBUtils.convertDpToPixel(i10), POBUtils.convertDpToPixel(i11), POBUtils.convertDpToPixel(i4), POBUtils.convertDpToPixel(i3), true, "Ok");
        }
        return new POBViewRect(false, "Size must be greater than the 50x50 size.");
    }

    @Nullable
    /* renamed from: b */
    private static String m39909b(@NonNull JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            POBLog.error("POBMRAIDUtil", "Must have at least 1 day of the week if specifying repeating weekly.", new Object[0]);
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        boolean[] zArr = new boolean[7];
        for (int i = 0; i < jSONArray.length(); i++) {
            int optInt = jSONArray.optInt(i);
            if (optInt == 7) {
                optInt = 0;
            }
            if (!zArr[optInt]) {
                sb2.append(m39910b(optInt));
                sb2.append(",");
                zArr[optInt] = true;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public static Map<String, Object> m39911a(@NonNull JSONObject jSONObject) throws JSONException, IllegalArgumentException {
        HashMap hashMap = new HashMap();
        if (jSONObject.has("description")) {
            hashMap.put("title", jSONObject.getString("description"));
            if (jSONObject.has("start") && jSONObject.getString("start") != null) {
                Date m39913a = m39913a(jSONObject.getString("start"));
                if (m39913a != null) {
                    hashMap.put(MRAIDNativeFeatureProvider.EXTRA_EVENT_BEGIN_TIME, Long.valueOf(m39913a.getTime()));
                    if (jSONObject.has("end") && jSONObject.getString("end") != null) {
                        Date m39913a2 = m39913a(jSONObject.getString("end"));
                        if (m39913a2 != null) {
                            hashMap.put("endTime", Long.valueOf(m39913a2.getTime()));
                        } else {
                            POBLog.error("POBMRAIDUtil", "Invalid end format. end must be(yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx)", new Object[0]);
                        }
                        if (jSONObject.has("location")) {
                            hashMap.put(MRAIDNativeFeatureProvider.EVENT_LOCATION, jSONObject.getString("location"));
                        }
                        if (jSONObject.has("summary")) {
                            hashMap.put("description", jSONObject.getString("summary"));
                        }
                        if (jSONObject.has("transparency")) {
                            hashMap.put("availability", Integer.valueOf(jSONObject.getString("transparency").equals(C21114v8.C21122h.f54047T) ? 1 : 0));
                        }
                        if (jSONObject.has("recurrence")) {
                            hashMap.put("rrule", m39908b(jSONObject.getJSONObject("recurrence")));
                        }
                        return hashMap;
                    }
                    throw new IllegalArgumentException("Invalid end.end can't be null.");
                }
                POBLog.error("POBMRAIDUtil", "Invalid start format. start must be(yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx)", new Object[0]);
                throw new IllegalArgumentException("Invalid start format. start must be(yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx)");
            }
            throw new IllegalArgumentException("Invalid start. start can't be null.");
        }
        throw new IllegalArgumentException("Invalid description. Description can't be null.");
    }

    @Nullable
    /* renamed from: b */
    private static String m39910b(int i) {
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
                POBLog.error("POBMRAIDUtil", "invalid day of week %s", Integer.valueOf(i));
                return null;
        }
    }

    @Nullable
    /* renamed from: a */
    private static Date m39913a(@NonNull String str) {
        Date date = null;
        for (String str2 : f71149a) {
            try {
                date = new SimpleDateFormat(str2, Locale.US).parse(str);
            } catch (ParseException e) {
                POBLog.error("POBMRAIDUtil", "Not able to parse date. %s", e.getLocalizedMessage());
            }
            if (date != null) {
                break;
            }
        }
        return date;
    }

    @Nullable
    /* renamed from: a */
    private static String m39912a(@NonNull JSONArray jSONArray) {
        if (jSONArray.length() == 0) {
            POBLog.error("POBMRAIDUtil", "must have at least 1 day of the month if specifying repeating weekly", new Object[0]);
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        boolean[] zArr = new boolean[63];
        for (int i = 0; i < jSONArray.length(); i++) {
            int optInt = jSONArray.optInt(i);
            int i2 = optInt + 31;
            if (!zArr[i2]) {
                sb2.append(m39916a(optInt));
                sb2.append(",");
                zArr[i2] = true;
            }
        }
        sb2.deleteCharAt(sb2.length() - 1);
        return sb2.toString();
    }

    @Nullable
    /* renamed from: a */
    private static String m39916a(int i) {
        if (i != 0 && i >= -31 && i <= 31) {
            return "" + i;
        }
        POBLog.error("POBMRAIDUtil", "invalid day of month " + i, new Object[0]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m39915a(@NonNull Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return false;
            }
            return telephonyManager.getSimState() != 1;
        } catch (Exception e) {
            POBLog.warn("POBMRAIDUtil", "Not able to get TelephonyManager. Error: %s", e.getMessage());
            return false;
        }
    }
}
