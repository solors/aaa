package sg.bigo.ads.core.mraid;

import androidx.annotation.NonNull;

/* renamed from: sg.bigo.ads.core.mraid.g */
/* loaded from: classes10.dex */
public enum EnumC44270g {
    CLOSE("close"),
    UNLOAD("unload"),
    EXPAND { // from class: sg.bigo.ads.core.mraid.g.1
        @Override // sg.bigo.ads.core.mraid.EnumC44270g
        /* renamed from: a */
        final boolean mo3462a(@NonNull EnumC44293n enumC44293n) {
            if (enumC44293n == EnumC44293n.INLINE) {
                return true;
            }
            return false;
        }
    },
    USE_CUSTOM_CLOSE("usecustomclose"),
    OPEN { // from class: sg.bigo.ads.core.mraid.g.2
        @Override // sg.bigo.ads.core.mraid.EnumC44270g
        /* renamed from: a */
        final boolean mo3462a(@NonNull EnumC44293n enumC44293n) {
            return true;
        }
    },
    RESIZE { // from class: sg.bigo.ads.core.mraid.g.3
        @Override // sg.bigo.ads.core.mraid.EnumC44270g
        /* renamed from: a */
        final boolean mo3462a(@NonNull EnumC44293n enumC44293n) {
            return true;
        }
    },
    SET_ORIENTATION_PROPERTIES("setOrientationProperties"),
    PLAY_VIDEO { // from class: sg.bigo.ads.core.mraid.g.4
        @Override // sg.bigo.ads.core.mraid.EnumC44270g
        /* renamed from: a */
        final boolean mo3462a(@NonNull EnumC44293n enumC44293n) {
            if (enumC44293n == EnumC44293n.INLINE) {
                return true;
            }
            return false;
        }
    },
    STORE_PICTURE { // from class: sg.bigo.ads.core.mraid.g.5
        @Override // sg.bigo.ads.core.mraid.EnumC44270g
        /* renamed from: a */
        final boolean mo3462a(@NonNull EnumC44293n enumC44293n) {
            return true;
        }
    },
    CREATE_CALENDAR_EVENT { // from class: sg.bigo.ads.core.mraid.g.6
        @Override // sg.bigo.ads.core.mraid.EnumC44270g
        /* renamed from: a */
        final boolean mo3462a(@NonNull EnumC44293n enumC44293n) {
            return true;
        }
    },
    UNSPECIFIED("");
    
    @NonNull

    /* renamed from: l */
    final String f116237l;

    EnumC44270g(String str) {
        this.f116237l = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static EnumC44270g m3463a(@NonNull String str) {
        EnumC44270g[] values;
        for (EnumC44270g enumC44270g : values()) {
            if (enumC44270g.f116237l.equals(str)) {
                return enumC44270g;
            }
        }
        return UNSPECIFIED;
    }

    /* synthetic */ EnumC44270g(String str, byte b) {
        this(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3462a(@NonNull EnumC44293n enumC44293n) {
        return false;
    }
}
