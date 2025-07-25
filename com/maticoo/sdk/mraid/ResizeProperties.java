package com.maticoo.sdk.mraid;

import com.maticoo.sdk.mraid.Consts;
import java.util.Formatter;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
public class ResizeProperties {
    private int width = 0;
    private int height = 0;
    private Consts.CustomClosePosition customClosePosition = Consts.CustomClosePosition.TopRight;
    private int offsetX = 0;
    private int offsetY = 0;
    private boolean allowOffscreen = false;

    /* renamed from: com.maticoo.sdk.mraid.ResizeProperties$1 */
    /* loaded from: classes6.dex */
    static /* synthetic */ class C217031 {
        static final /* synthetic */ int[] $SwitchMap$com$maticoo$sdk$mraid$Consts$CustomClosePosition;

        static {
            int[] iArr = new int[Consts.CustomClosePosition.values().length];
            $SwitchMap$com$maticoo$sdk$mraid$Consts$CustomClosePosition = iArr;
            try {
                iArr[Consts.CustomClosePosition.TopLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$CustomClosePosition[Consts.CustomClosePosition.TopCenter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$CustomClosePosition[Consts.CustomClosePosition.TopRight.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$CustomClosePosition[Consts.CustomClosePosition.Center.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$CustomClosePosition[Consts.CustomClosePosition.BottomLeft.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$CustomClosePosition[Consts.CustomClosePosition.BottomCenter.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$CustomClosePosition[Consts.CustomClosePosition.BottomRight.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static ResizeProperties propertiesFromArgs(Map<String, String> map) {
        ResizeProperties resizeProperties = new ResizeProperties();
        try {
            resizeProperties.setWidth(Integer.parseInt(map.get("width")));
            resizeProperties.setHeight(Integer.parseInt(map.get("height")));
            resizeProperties.setOffsetX(Integer.parseInt(map.get(Consts.ResizePropertiesOffsetX)));
            resizeProperties.setOffsetY(Integer.parseInt(map.get(Consts.ResizePropertiesOffsetY)));
            resizeProperties.setAllowOffscreen("true".equals(map.get(Consts.ResizePropertiesAllowOffscreen)));
            String str = map.get(Consts.ResizePropertiesCustomClosePosition);
            if ("top-left".equals(str)) {
                resizeProperties.setCustomClosePosition(Consts.CustomClosePosition.TopLeft);
            } else if (Consts.ResizePropertiesCCPositionTopCenter.equals(str)) {
                resizeProperties.setCustomClosePosition(Consts.CustomClosePosition.TopCenter);
            } else if ("top-right".equals(str)) {
                resizeProperties.setCustomClosePosition(Consts.CustomClosePosition.TopRight);
            } else if ("center".equals(str)) {
                resizeProperties.setCustomClosePosition(Consts.CustomClosePosition.Center);
            } else if ("bottom-left".equals(str)) {
                resizeProperties.setCustomClosePosition(Consts.CustomClosePosition.BottomLeft);
            } else if (Consts.ResizePropertiesCCPositionBottomCenter.equals(str)) {
                resizeProperties.setCustomClosePosition(Consts.CustomClosePosition.BottomCenter);
            } else if ("bottom-right".equals(str)) {
                resizeProperties.setCustomClosePosition(Consts.CustomClosePosition.BottomRight);
            }
        } catch (Exception unused) {
        }
        return resizeProperties;
    }

    public boolean getAllowOffscreen() {
        return this.allowOffscreen;
    }

    public Consts.CustomClosePosition getCustomClosePosition() {
        return this.customClosePosition;
    }

    public int getHeight() {
        return this.height;
    }

    public int getOffsetX() {
        return this.offsetX;
    }

    public int getOffsetY() {
        return this.offsetY;
    }

    public int getWidth() {
        return this.width;
    }

    public void setAllowOffscreen(boolean z) {
        this.allowOffscreen = z;
    }

    public void setCustomClosePosition(Consts.CustomClosePosition customClosePosition) {
        this.customClosePosition = customClosePosition;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setOffsetX(int i) {
        this.offsetX = i;
    }

    public void setOffsetY(int i) {
        this.offsetY = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public String toString() {
        String str;
        String str2 = "top-right";
        switch (C217031.$SwitchMap$com$maticoo$sdk$mraid$Consts$CustomClosePosition[this.customClosePosition.ordinal()]) {
            case 1:
                str2 = "top-left";
                break;
            case 2:
                str2 = Consts.ResizePropertiesCCPositionTopCenter;
                break;
            case 4:
                str2 = "center";
                break;
            case 5:
                str2 = "bottom-left";
                break;
            case 6:
                str2 = Consts.ResizePropertiesCCPositionBottomCenter;
                break;
            case 7:
                str2 = "bottom-right";
                break;
        }
        if (this.allowOffscreen) {
            str = "true";
        } else {
            str = "false";
        }
        Formatter formatter = new Formatter(Locale.US);
        formatter.format("{width:%d,height:%d,customClosePosition:'%s',offsetX:%d,offsetY:%d,allowOffscreen:'%s'}", Integer.valueOf(this.width), Integer.valueOf(this.height), str2, Integer.valueOf(this.offsetX), Integer.valueOf(this.offsetY), str);
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
