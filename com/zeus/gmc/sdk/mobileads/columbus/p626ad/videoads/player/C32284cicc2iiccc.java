package com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.AudioManager;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.WindowManager;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32465cioc2;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cicc2iiccc */
/* loaded from: classes8.dex */
public class C32284cicc2iiccc {
    private static final String c2oc2i = "currentVolume";
    private static final int cco22 = 400;
    private static final String cioccoiococ = "isSilent";
    private static final String coi222o222 = "columbus_video_player_position";
    private static final String coo2iico = "PlayerUtils";
    public static final ExecutorService c2oc2o = C32465cioc2.c2oc2i;
    private static final List cii2c2 = Arrays.asList(13, 14);
    private static float ciii2coi2 = 0.0f;

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cicc2iiccc$c2oc2i */
    /* loaded from: classes8.dex */
    class CallableC32285c2oc2i implements Callable<Integer> {
        final /* synthetic */ String coo2iico;

        CallableC32285c2oc2i(String str) {
            this.coo2iico = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: coo2iico */
        public Integer call() {
            try {
                if (!new File(this.coo2iico).exists()) {
                    MLog.m25889e(C32284cicc2iiccc.coo2iico, "video file is not exists");
                    return 0;
                }
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(this.coo2iico);
                return Integer.valueOf(Integer.parseInt(mediaMetadataRetriever.extractMetadata(9)));
            } catch (Exception e) {
                MLog.m25888e(C32284cicc2iiccc.coo2iico, "Unable to call getVedioTotalTime:", e);
                return 0;
            }
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cicc2iiccc$c2oc2o */
    /* loaded from: classes8.dex */
    private static class RunnableC32286c2oc2o implements Runnable {
        private String coo2iico;

        RunnableC32286c2oc2o(String str) {
            this.coo2iico = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r6 = this;
                java.lang.String r0 = "PlayerUtils"
                r1 = 0
                java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
                java.lang.String r3 = r6.coo2iico     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
                java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
                java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> L66 java.io.IOException -> L68
                r1 = 10000(0x2710, float:1.4013E-41)
                r2.setReadTimeout(r1)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L88
                r1 = 15000(0x3a98, float:2.102E-41)
                r2.setConnectTimeout(r1)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L88
                java.lang.String r1 = "GET"
                r2.setRequestMethod(r1)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L88
                r1 = 1
                r2.setDoInput(r1)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L88
                r2.connect()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L88
                int r1 = r2.getResponseCode()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L88
                r3 = 200(0xc8, float:2.8E-43)
                if (r1 == r3) goto L4d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L88
                r3.<init>()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L88
                java.lang.String r4 = "Tracking failed: "
                r3.append(r4)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L88
                r3.append(r1)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L88
                java.lang.String r1 = "  url = "
                r3.append(r1)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L88
                java.lang.String r1 = r6.coo2iico     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L88
                r3.append(r1)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L88
                java.lang.String r1 = r3.toString()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L88
                com.zeus.gmc.sdk.mobileads.columbus.util.MLog.m25892d(r0, r1)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L88
                goto L84
            L4d:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L88
                r1.<init>()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L88
                java.lang.String r3 = "Tracking Sucess 200 = "
                r1.append(r3)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L88
                java.lang.String r3 = r6.coo2iico     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L88
                r1.append(r3)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L88
                java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L88
                com.zeus.gmc.sdk.mobileads.columbus.util.MLog.m25885v(r0, r1)     // Catch: java.io.IOException -> L64 java.lang.Throwable -> L88
                goto L84
            L64:
                r1 = move-exception
                goto L6c
            L66:
                r0 = move-exception
                goto L8a
            L68:
                r2 = move-exception
                r5 = r2
                r2 = r1
                r1 = r5
            L6c:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
                r3.<init>()     // Catch: java.lang.Throwable -> L88
                java.lang.String r4 = "Tracking exception for: "
                r3.append(r4)     // Catch: java.lang.Throwable -> L88
                java.lang.String r4 = r6.coo2iico     // Catch: java.lang.Throwable -> L88
                r3.append(r4)     // Catch: java.lang.Throwable -> L88
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L88
                com.zeus.gmc.sdk.mobileads.columbus.util.MLog.m25888e(r0, r3, r1)     // Catch: java.lang.Throwable -> L88
                if (r2 == 0) goto L87
            L84:
                r2.disconnect()
            L87:
                return
            L88:
                r0 = move-exception
                r1 = r2
            L8a:
                if (r1 == 0) goto L8f
                r1.disconnect()
            L8f:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.C32284cicc2iiccc.RunnableC32286c2oc2o.run():void");
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cicc2iiccc$cioccoiococ */
    /* loaded from: classes8.dex */
    class CallableC32287cioccoiococ implements Callable<Bitmap> {
        final /* synthetic */ String coo2iico;

        CallableC32287cioccoiococ(String str) {
            this.coo2iico = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: coo2iico */
        public Bitmap call() {
            try {
                if (!new File(this.coo2iico).exists()) {
                    MLog.m25889e(C32284cicc2iiccc.coo2iico, "video file is not exists");
                    return null;
                }
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(this.coo2iico);
                return mediaMetadataRetriever.getFrameAtTime();
            } catch (Exception e) {
                MLog.m25888e(C32284cicc2iiccc.coo2iico, "Unable to call getVideoThumb:", e);
                return null;
            }
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cicc2iiccc$coi222o222 */
    /* loaded from: classes8.dex */
    class CallableC32288coi222o222 implements Callable<Integer> {
        final /* synthetic */ String coo2iico;

        CallableC32288coi222o222(String str) {
            this.coo2iico = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: coo2iico */
        public Integer call() {
            try {
                if (!new File(this.coo2iico).exists()) {
                    MLog.m25889e(C32284cicc2iiccc.coo2iico, "video file is not exists");
                    return 0;
                }
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(this.coo2iico);
                return Integer.valueOf(Integer.parseInt(mediaMetadataRetriever.extractMetadata(19)));
            } catch (Exception e) {
                MLog.m25888e(C32284cicc2iiccc.coo2iico, "Unable to call getVedioHeight:", e);
                return 0;
            }
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.videoads.player.cicc2iiccc$coo2iico */
    /* loaded from: classes8.dex */
    class CallableC32289coo2iico implements Callable<Integer> {
        final /* synthetic */ String coo2iico;

        CallableC32289coo2iico(String str) {
            this.coo2iico = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: coo2iico */
        public Integer call() {
            try {
                if (!new File(this.coo2iico).exists()) {
                    MLog.m25889e(C32284cicc2iiccc.coo2iico, "video file is not exists");
                    return 0;
                }
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(this.coo2iico);
                return Integer.valueOf(Integer.parseInt(mediaMetadataRetriever.extractMetadata(18)));
            } catch (Exception e) {
                MLog.m25888e(C32284cicc2iiccc.coo2iico, "Unable to call getVedioWidth:", e);
                return 0;
            }
        }
    }

    private C32284cicc2iiccc() {
    }

    protected static float c2oc2i(Context context) {
        AudioManager audioManager;
        if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
            return 0.0f;
        }
        return audioManager.getStreamVolume(3);
    }

    public static int c2oc2o(Context context) {
        return context.getSharedPreferences(coi222o222, 0).getInt(c2oc2i, 0);
    }

    public static boolean cco22(Context context) {
        return context.getSharedPreferences(coi222o222, 0).getBoolean(cioccoiococ, true);
    }

    public static int ccoc2oic(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return point.x;
    }

    public static int cicc2iiccc(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int cicic(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        return Math.min(point.x, point.y);
    }

    public static int cii2c2(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int ciii2coi2(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return point.y;
    }

    protected static int cioccoiococ(Context context) {
        AudioManager audioManager;
        if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null) {
            return 10;
        }
        return audioManager.getStreamMaxVolume(3);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean coi222o222(int i) {
        return i == 2;
    }

    public static int coiic(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealSize(point);
        return Math.max(point.x, point.y);
    }

    public static Activity coiio2(Context context) {
        if (context == null || !(context instanceof Activity)) {
            return null;
        }
        return (Activity) context;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int[] coo2iico(int i, int i2, int i3, int i4) {
        float f = i2;
        float f2 = i;
        float f3 = i4;
        float f4 = i3;
        if (f / f2 < f3 / f4) {
            i = (int) ((f / f3) * f4);
        } else {
            i2 = (int) ((f2 / f4) * f3);
        }
        return new int[]{i, i2};
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static float coi222o222(Context context) {
        float f;
        float f2 = ciii2coi2;
        if (f2 == 0.0f) {
            f2 = cioccoiococ(context);
        }
        ciii2coi2 = f2;
        try {
            f = c2oc2i(context) / ciii2coi2;
            try {
                f = Math.round(f * 100.0f) / 100.0f;
                MLog.m25892d(coo2iico, "currentMediaVolume = " + f);
                return f;
            } catch (Exception e) {
                e = e;
                MLog.m25888e(coo2iico, "had exception", e);
                return f;
            }
        } catch (Exception e2) {
            e = e2;
            f = 0.1f;
        }
    }

    public static void coo2iico(Context context, int i) {
        context.getSharedPreferences(coi222o222, 0).edit().putInt(c2oc2i, i).apply();
    }

    public static int c2oc2i(String str) {
        FutureTask futureTask = new FutureTask(new CallableC32285c2oc2i(str));
        c2oc2o.execute(futureTask);
        try {
            return ((Integer) futureTask.get(400L, TimeUnit.MILLISECONDS)).intValue();
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "Unable to call getVedioTotalTime:", e);
            return 0;
        }
    }

    public static Bitmap c2oc2o(String str) {
        FutureTask futureTask = new FutureTask(new CallableC32287cioccoiococ(str));
        c2oc2o.execute(futureTask);
        try {
            return (Bitmap) futureTask.get(400L, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "Unable to call getVideoThumb:", e);
            return null;
        }
    }

    public static int cioccoiococ(String str) {
        FutureTask futureTask = new FutureTask(new CallableC32289coo2iico(str));
        c2oc2o.execute(futureTask);
        try {
            return ((Integer) futureTask.get(400L, TimeUnit.MILLISECONDS)).intValue();
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "Unable to call getVedioWidth:", e);
            return 0;
        }
    }

    public static void coo2iico(Context context, boolean z) {
        if (context != null) {
            context.getSharedPreferences(coi222o222, 0).edit().putBoolean(cioccoiococ, z).apply();
        }
    }

    public static int coi222o222(String str) {
        FutureTask futureTask = new FutureTask(new CallableC32288coi222o222(str));
        c2oc2o.execute(futureTask);
        try {
            return ((Integer) futureTask.get(400L, TimeUnit.MILLISECONDS)).intValue();
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "Unable to call getVedioHeight:", e);
            return 0;
        }
    }

    public static int coo2iico(Context context, float f) {
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static int coo2iico(String str) {
        try {
            String[] split = str.split(":");
            return (Integer.parseInt(split[0]) * 60 * 60) + (Integer.parseInt(split[1]) * 60) + Integer.parseInt(split[2]);
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "convert duration failed : ", e);
            return 0;
        }
    }

    public static Bitmap coo2iico(Context context, String str) {
        Bitmap frameAtTime;
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(context, Uri.parse(str));
            long parseLong = Long.parseLong(mediaMetadataRetriever.extractMetadata(9)) * 1000;
            int i = 0;
            do {
                MLog.m25892d(coo2iico, "getVideoLastFrame: " + parseLong);
                frameAtTime = mediaMetadataRetriever.getFrameAtTime(parseLong, 2);
                parseLong -= 500000;
                i++;
                if (frameAtTime != null || i >= 4) {
                    break;
                }
            } while (parseLong > 1000);
            return frameAtTime;
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "Unable to call getVideoLastFrame:", e);
            return null;
        }
    }

    public static void coo2iico(List<String> list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                String str = list.get(i);
                if (!TextUtils.isEmpty(str)) {
                    c2oc2o.execute(new RunnableC32286c2oc2o(str));
                }
            }
        }
    }

    public static Context coo2iico(Context context) {
        return (context == null || context.getApplicationContext() == null) ? context : context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean coo2iico(int i) {
        return cii2c2.contains(Integer.valueOf(i));
    }
}
