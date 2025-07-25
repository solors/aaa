package com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo;

import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.ciiioc2ioc */
/* loaded from: classes8.dex */
public class C32463ciiioc2ioc {
    public static int c2oc2i = 43200000;
    public static int c2oc2o = 1800000;
    public static int cco22 = 60000;
    public static int cii2c2 = 1000;
    public static String ciii2coi2 = "yyyy.MM.dd";
    public static int cioccoiococ = 3600000;
    public static int coi222o222 = 86400000;
    public static int coo2iico = 604800000;

    private C32463ciiioc2ioc() {
    }

    public static boolean c2oc2i(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        long timeInMillis = calendar.getTimeInMillis();
        long j2 = coi222o222 + timeInMillis;
        if (timeInMillis > j || j >= j2) {
            return false;
        }
        return true;
    }

    public static String coi222o222(long j) {
        if (j >= coo2iico) {
            return String.format("%.2f", Double.valueOf(j / coo2iico)) + POBNativeConstants.NATIVE_IMAGE_WIDTH;
        } else if (j >= coi222o222) {
            return String.format("%.2f", Double.valueOf(j / coi222o222)) + "d";
        } else if (j >= cioccoiococ) {
            return String.format("%.2f", Double.valueOf(j / cioccoiococ)) + "h";
        } else if (j >= cco22) {
            return String.format("%.2f", Double.valueOf(j / cco22)) + "m";
        } else if (j >= cii2c2) {
            return String.format("%.2f", Double.valueOf(j / cii2c2)) + "s";
        } else {
            return String.format("%.2f", Double.valueOf(j)) + "ms";
        }
    }

    public static String coo2iico() {
        return coo2iico(System.currentTimeMillis());
    }

    public static String coo2iico(long j) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String coo2iico(long j, String str) {
        try {
            return new SimpleDateFormat(str).format(new Date(j));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean coo2iico(long j, long j2) {
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }
}
