package com.facebook.ads.redexgen.p370X;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Kl */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12099Kl {
    public static byte[] A00;
    public static String[] A01 = {"vserbkQ71L70HeExkEksLvSV50Js9e5T", "kCtue8tdTX7Ntsd63evdhPLiI5GlGyVZ", "TwC9DE0UkCmO5xuA9ppRryz5QvyD", "4CWs1R6rr7PkkffzytFACCqk28rMKWqF", "DS0L0fcRoHYALrKB9SSkXSb7384LvFtu", "e8tzsRThNax4EAToJhNq21dAKBpwgTLo", "Q0BiPrkB2PSWzVDnLZTkEnIKaCsuaheD", "rbmY91JFcJMC4pCqNbunWn9nQrXHl54t"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static EnumC12098Kk A00() throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException, IllegalAccessException {
        Class<?> cls = Class.forName(A03(8, 26, 109));
        Object invoke = cls.getMethod(A03(66, 21, 7), new Class[0]).invoke(null, new Object[0]);
        Field declaredField = cls.getDeclaredField(A03(87, 11, 29));
        declaredField.setAccessible(true);
        Map map = (Map) declaredField.get(invoke);
        if (map == null) {
            return EnumC12098Kk.A0C;
        }
        for (Object obj : map.values()) {
            Field declaredField2 = obj.getClass().getDeclaredField(A03(0, 8, 73));
            declaredField2.setAccessible(true);
            Activity activity = (Activity) declaredField2.get(obj);
            if (activity.isTaskRoot() && activity.getIntent().getCategories().contains(A03(34, 32, 97))) {
                return EnumC12098Kk.A07;
            }
        }
        return EnumC12098Kk.A0A;
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A01;
            if (strArr[6].charAt(20) == strArr[1].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "hlZJhcxljYiKc7UKHZyQNCRGeosS0rVV";
            strArr2[7] = "L6Z1FseRPLChQnX48wkOINplJZHgpjkr";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 49);
            i4++;
        }
    }

    public static void A04() {
        A00 = new byte[]{-37, -35, -18, -29, -16, -29, -18, -13, -1, 12, 2, 16, 13, 7, 2, -52, -1, 14, 14, -52, -33, 1, 18, 7, 20, 7, 18, 23, -14, 6, 16, 3, -1, 2, -13, 0, -10, 4, 1, -5, -10, -64, -5, 0, 6, -9, 0, 6, -64, -11, -13, 6, -9, -7, 1, 4, 11, -64, -34, -45, -25, -32, -43, -38, -41, -28, -101, -83, -86, -86, -99, -90, -84, 121, -101, -84, -95, -82, -95, -84, -79, -116, -96, -86, -99, -103, -100, -69, -113, -79, -62, -73, -60, -73, -62, -73, -77, -63};
    }

    static {
        A04();
    }

    public static EnumC12098Kk A01(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                return A02(context);
            }
            return A00();
        } catch (Exception unused) {
            return EnumC12098Kk.A05;
        }
    }

    public static EnumC12098Kk A02(Context context) {
        if (context == null) {
            return EnumC12098Kk.A0D;
        }
        ActivityManager mgr = (ActivityManager) context.getSystemService(A03(0, 8, 73));
        if (mgr == null) {
            EnumC12098Kk enumC12098Kk = EnumC12098Kk.A08;
            if (A01[0].charAt(27) != 'o') {
                A01[2] = "W800VLcbCNBOE1f9F";
                return enumC12098Kk;
            }
            throw new RuntimeException();
        }
        List<ActivityManager.AppTask> tasks = mgr.getAppTasks();
        if (tasks.isEmpty()) {
            return EnumC12098Kk.A0B;
        }
        for (ActivityManager.AppTask appTask : tasks) {
            ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
            if (taskInfo != null && taskInfo.baseIntent != null && taskInfo.baseIntent.getCategories() != null && taskInfo.baseIntent.getCategories().contains(A03(34, 32, 97))) {
                return EnumC12098Kk.A06;
            }
        }
        EnumC12098Kk enumC12098Kk2 = EnumC12098Kk.A09;
        String[] strArr = A01;
        if (strArr[3].charAt(22) != strArr[5].charAt(22)) {
            String[] strArr2 = A01;
            strArr2[4] = "GyHEsdoLJV3XEjiFxTFX6orc2Mvnrd3k";
            strArr2[7] = "nU2m6dMK7qfy4atV1JxTmvIeg7zDsgbu";
            return enumC12098Kk2;
        }
        throw new RuntimeException();
    }
}
