package com.explorestack.iab.mraid;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* renamed from: com.explorestack.iab.mraid.f */
/* loaded from: classes3.dex */
public final class C10478f {

    /* renamed from: a */
    public boolean f23920a;

    /* renamed from: b */
    public int f23921b;

    public C10478f(boolean z, int i) {
        this.f23920a = z;
        this.f23921b = i;
    }

    /* renamed from: a */
    public static int m79504a(String str) {
        int indexOf = Arrays.asList("portrait", "landscape", "none").indexOf(str);
        if (indexOf != -1) {
            return indexOf;
        }
        return 2;
    }

    /* renamed from: b */
    public String m79503b() {
        int i = this.f23921b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return "error";
                }
                return "none";
            }
            return "landscape";
        }
        return "portrait";
    }

    /* renamed from: c */
    public int m79502c(@NonNull Context context) {
        int i;
        if (context.getResources().getConfiguration().orientation == 1) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = this.f23921b;
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 0;
        }
        if (this.f23920a) {
            return -1;
        }
        return i;
    }

    @NonNull
    public String toString() {
        return "MRAIDOrientationProperties{allowOrientationChange=" + this.f23920a + ", forceOrientation=" + m79503b() + '}';
    }
}
