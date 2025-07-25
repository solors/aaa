package net.pubnative.lite.sdk.utils;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes10.dex */
public class SkipOffsetManager {
    private static final int ENDCARD_CLOSE_DELAY_MAXIMUM = 30;
    private static final int ENDCARD_SKIP_OFFSET = 4;
    public static final int INTERSTITIAL_MRAID = 3;
    private static final int INTERSTITIAL_VIDEO_WITHOUT_END_CARD = 15;
    private static final int INTERSTITIAL_VIDEO_WITH_END_CARD = 10;
    private static final int NATIVE_CLOSE_BUTTON_DELAY = 15;
    private static final int REWARDED_HTML_SKIP_OFFSET = 30;
    private static final int REWARDED_VIDEO_DEFAULT = 30;
    private static final int VIDEO_WITHOUT_ENDCARD_SKIP_OFFSET = 15;
    private static final int VIDEO_WITH_ENDCARD_SKIP_OFFSET = 10;
    private static final int globalMaximumSkipOffset = 30;
    private static Boolean isCustomInterstitialHTMLSkipOffset;
    private static Boolean isCustomInterstitialVideoSkipOffset;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes10.dex */
    public static class SkipOffset {
        private Boolean isValid;
        private Integer skipOffset;

        public SkipOffset(boolean z, Integer num) {
            this.skipOffset = num;
            this.isValid = Boolean.valueOf(z);
        }

        public Integer getSkipOffset() {
            return this.skipOffset;
        }

        public Boolean isValid() {
            return this.isValid;
        }

        public void setSkipOffset(Integer num) {
            this.skipOffset = num;
        }

        public void setValid(Boolean bool) {
            this.isValid = bool;
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        isCustomInterstitialVideoSkipOffset = bool;
        isCustomInterstitialHTMLSkipOffset = bool;
    }

    private static Integer findSkipOffset(ArrayList<Integer> arrayList, int i) {
        int i2;
        Iterator<Integer> it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                Integer next = it.next();
                if (next != null) {
                    SkipOffset isValidSkipOffset = isValidSkipOffset(next);
                    if (isValidSkipOffset.isValid().booleanValue()) {
                        i2 = isValidSkipOffset.getSkipOffset().intValue();
                        break;
                    }
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 != -1) {
            i = i2;
        }
        if (i > 30) {
            i = 30;
        }
        return Integer.valueOf(i);
    }

    public static Integer getDefaultEndcardSkipOffset() {
        return 4;
    }

    public static Integer getDefaultHtmlInterstitialSkipOffset() {
        return 3;
    }

    public static Integer getDefaultNativeCloseButtonDelay() {
        return 15;
    }

    public static Integer getDefaultRewardedHtmlSkipOffset() {
        return 30;
    }

    public static Integer getDefaultVideoWithEndCardSkipOffset() {
        return 10;
    }

    public static Integer getDefaultVideoWithoutEndCardSkipOffset() {
        return 15;
    }

    public static Integer getHTMLSkipOffset(Integer num, Boolean bool) {
        int i;
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (bool.booleanValue()) {
            i = 3;
        } else {
            i = 30;
        }
        arrayList.add(num);
        Integer findSkipOffset = findSkipOffset(arrayList, i);
        if (bool.booleanValue()) {
            if (findSkipOffset.intValue() != 3) {
                z = true;
            } else {
                z = false;
            }
            isCustomInterstitialHTMLSkipOffset = Boolean.valueOf(z);
        }
        return findSkipOffset;
    }

    public static Integer getMaximumEndcardCloseDelay() {
        return 30;
    }

    public static int getMaximumRewardedSkipOffset() {
        return 30;
    }

    public static Integer getNativeCloseButtonDelay(Integer num) {
        if (num == null || num.intValue() < 0 || num.intValue() > 15) {
            return 15;
        }
        return num;
    }

    public static Integer getVideoSkipOffset(Integer num, Integer num2, Integer num3, Boolean bool, Boolean bool2) {
        int i;
        boolean z;
        if (bool2.booleanValue()) {
            if (bool.booleanValue()) {
                i = 10;
            } else {
                i = 15;
            }
        } else {
            i = 30;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(num3);
        arrayList.add(num);
        arrayList.add(num2);
        Integer findSkipOffset = findSkipOffset(arrayList, i);
        if (bool2.booleanValue()) {
            if (findSkipOffset.intValue() != i) {
                z = true;
            } else {
                z = false;
            }
            isCustomInterstitialVideoSkipOffset = Boolean.valueOf(z);
        }
        return findSkipOffset;
    }

    public static Boolean isCustomInterstitialHTMLSkipOffset() {
        return isCustomInterstitialHTMLSkipOffset;
    }

    public static Boolean isCustomInterstitialVideoSkipOffset() {
        return isCustomInterstitialVideoSkipOffset;
    }

    public static SkipOffset isValidSkipOffset(Integer num) {
        boolean z;
        if (num != null && num.intValue() >= 0) {
            z = true;
            if (num.intValue() > 30) {
                num = 30;
            }
        } else {
            z = false;
        }
        return new SkipOffset(z, num);
    }
}
