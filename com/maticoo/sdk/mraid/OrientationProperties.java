package com.maticoo.sdk.mraid;

import com.maticoo.sdk.mraid.Consts;
import java.util.Formatter;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes6.dex */
public class OrientationProperties {
    private boolean allowOrientationChange = true;
    private Consts.ForceOrientation forceOrientation = Consts.ForceOrientation.None;

    /* renamed from: com.maticoo.sdk.mraid.OrientationProperties$1 */
    /* loaded from: classes6.dex */
    static /* synthetic */ class C217021 {
        static final /* synthetic */ int[] $SwitchMap$com$maticoo$sdk$mraid$Consts$ForceOrientation;

        static {
            int[] iArr = new int[Consts.ForceOrientation.values().length];
            $SwitchMap$com$maticoo$sdk$mraid$Consts$ForceOrientation = iArr;
            try {
                iArr[Consts.ForceOrientation.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$ForceOrientation[Consts.ForceOrientation.Portrait.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$ForceOrientation[Consts.ForceOrientation.Landscape.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static OrientationProperties propertiesFromArgs(Map<String, String> map) {
        boolean z;
        OrientationProperties orientationProperties = new OrientationProperties();
        try {
            if (!"false".equals(map.get(Consts.OrientationPpropertiesAllowOrientationChange))) {
                z = true;
            } else {
                z = false;
            }
            orientationProperties.setAllowOrientationChange(z);
            String str = map.get(Consts.OrientationPpropertiesForceOrientation);
            if ("none".equals(str)) {
                orientationProperties.setForceOrientation(Consts.ForceOrientation.None);
            } else if ("portrait".equals(str)) {
                orientationProperties.setForceOrientation(Consts.ForceOrientation.Portrait);
            } else if ("landscape".equals(str)) {
                orientationProperties.setForceOrientation(Consts.ForceOrientation.Landscape);
            }
        } catch (Exception unused) {
        }
        return orientationProperties;
    }

    public boolean getAllowOrientationChange() {
        return this.allowOrientationChange;
    }

    public Consts.ForceOrientation getForceOrientation() {
        return this.forceOrientation;
    }

    public void setAllowOrientationChange(boolean z) {
        this.allowOrientationChange = z;
    }

    public void setForceOrientation(Consts.ForceOrientation forceOrientation) {
        this.forceOrientation = forceOrientation;
    }

    public String toString() {
        String str;
        if (this.allowOrientationChange) {
            str = "true";
        } else {
            str = "false";
        }
        int i = C217021.$SwitchMap$com$maticoo$sdk$mraid$Consts$ForceOrientation[this.forceOrientation.ordinal()];
        String str2 = "none";
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str2 = "landscape";
                }
            } else {
                str2 = "portrait";
            }
        }
        Formatter formatter = new Formatter(Locale.US);
        formatter.format("{allowOrientationChange:'%s',forceOrientation:'%s'}", str, str2);
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
