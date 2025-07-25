package androidx.compose.p015ui.platform.actionmodecallback;

import kotlin.Metadata;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: TextActionModeCallback.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.actionmodecallback.MenuItemOption */
/* loaded from: classes.dex */
public enum MenuItemOption {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);
    

    /* renamed from: id */
    private final int f497id;
    private final int order;

    /* compiled from: TextActionModeCallback.android.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.platform.actionmodecallback.MenuItemOption$WhenMappings */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MenuItemOption.values().length];
            iArr[MenuItemOption.Copy.ordinal()] = 1;
            iArr[MenuItemOption.Paste.ordinal()] = 2;
            iArr[MenuItemOption.Cut.ordinal()] = 3;
            iArr[MenuItemOption.SelectAll.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    MenuItemOption(int i) {
        this.f497id = i;
        this.order = i;
    }

    public final int getId() {
        return this.f497id;
    }

    public final int getOrder() {
        return this.order;
    }

    public final int getTitleResource() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return 17039373;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return 17039363;
            }
            return 17039371;
        }
        return 17039361;
    }
}
