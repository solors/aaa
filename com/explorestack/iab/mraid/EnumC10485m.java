package com.explorestack.iab.mraid;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.maticoo.sdk.mraid.Consts;

@SuppressLint({"RtlHardcoded"})
/* renamed from: com.explorestack.iab.mraid.m */
/* loaded from: classes3.dex */
public enum EnumC10485m {
    TopLeft(51),
    TopCenter(49),
    TopRight(53),
    Center(17),
    BottomLeft(83),
    BottomCenter(81),
    BottomRight(85);
    

    /* renamed from: l */
    static final /* synthetic */ boolean f23958l = true;

    /* renamed from: b */
    private final int f23959b;

    EnumC10485m(int i) {
        this.f23959b = i;
    }

    /* renamed from: c */
    public static EnumC10485m m79484c(@Nullable String str) {
        return m79483d(str, TopRight);
    }

    /* renamed from: d */
    public static EnumC10485m m79483d(@Nullable String str, @NonNull EnumC10485m enumC10485m) {
        if (TextUtils.isEmpty(str)) {
            return enumC10485m;
        }
        if (!f23958l && str == null) {
            throw new AssertionError();
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -1314880604:
                if (str.equals("top-right")) {
                    c = 1;
                    break;
                }
                break;
            case -1012429441:
                if (str.equals("top-left")) {
                    c = 2;
                    break;
                }
                break;
            case -655373719:
                if (str.equals("bottom-left")) {
                    c = 3;
                    break;
                }
                break;
            case 1163912186:
                if (str.equals("bottom-right")) {
                    c = 4;
                    break;
                }
                break;
            case 1288627767:
                if (str.equals(Consts.ResizePropertiesCCPositionBottomCenter)) {
                    c = 5;
                    break;
                }
                break;
            case 1755462605:
                if (str.equals(Consts.ResizePropertiesCCPositionTopCenter)) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Center;
            case 1:
                return TopRight;
            case 2:
                return TopLeft;
            case 3:
                return BottomLeft;
            case 4:
                return BottomRight;
            case 5:
                return BottomCenter;
            case 6:
                return TopCenter;
            default:
                return enumC10485m;
        }
    }

    /* renamed from: e */
    public int m79482e() {
        return this.f23959b;
    }
}
