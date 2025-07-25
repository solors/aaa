package com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid;

import androidx.annotation.NonNull;
import com.maticoo.sdk.mraid.Consts;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.MraidJavascriptCommand */
/* loaded from: classes8.dex */
public enum MraidJavascriptCommand {
    OPEN("open") { // from class: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.MraidJavascriptCommand.1
        @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid.MraidJavascriptCommand
        boolean requiresClick(@NonNull PlacementType placementType) {
            return true;
        }
    },
    CLOSE("close"),
    USE_CUSTOM_CLOSE("usecustomclose"),
    EXPAND("expand") { // from class: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.MraidJavascriptCommand.2
        @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid.MraidJavascriptCommand
        boolean requiresClick(@NonNull PlacementType placementType) {
            if (placementType == PlacementType.INLINE) {
                return true;
            }
            return false;
        }
    },
    PLAY_VIDEO("playVideo") { // from class: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.MraidJavascriptCommand.3
        @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid.MraidJavascriptCommand
        boolean requiresClick(@NonNull PlacementType placementType) {
            if (placementType == PlacementType.INLINE) {
                return true;
            }
            return false;
        }
    },
    RESIZE("resize") { // from class: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.MraidJavascriptCommand.4
        @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid.MraidJavascriptCommand
        boolean requiresClick(@NonNull PlacementType placementType) {
            return true;
        }
    },
    STORE_PICTURE("storePicture") { // from class: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.MraidJavascriptCommand.5
        @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid.MraidJavascriptCommand
        boolean requiresClick(@NonNull PlacementType placementType) {
            return true;
        }
    },
    CREATE_CALENDAR_EVENT(Consts.CommandCreateCalendarEvent) { // from class: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.MraidJavascriptCommand.6
        @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid.MraidJavascriptCommand
        boolean requiresClick(@NonNull PlacementType placementType) {
            return true;
        }
    },
    SET_ORIENTATION_PROPERTIES("setOrientationProperties"),
    UNSPECIFIED("");
    
    @NonNull
    private final String mJavascriptString;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MraidJavascriptCommand fromJavascriptString(@NonNull String str) {
        MraidJavascriptCommand[] values;
        for (MraidJavascriptCommand mraidJavascriptCommand : values()) {
            if (mraidJavascriptCommand.mJavascriptString.equals(str)) {
                return mraidJavascriptCommand;
            }
        }
        return UNSPECIFIED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean requiresClick(@NonNull PlacementType placementType) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String toJavascriptString() {
        return this.mJavascriptString;
    }

    MraidJavascriptCommand(@NonNull String str) {
        this.mJavascriptString = str;
    }
}
