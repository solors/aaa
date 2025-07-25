package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.n4 */
/* loaded from: classes6.dex */
public final class C20508n4 implements InterfaceC21162w1 {
    @NotNull

    /* renamed from: a */
    private final C19680c5 f52126a;

    @Metadata
    /* renamed from: com.ironsource.n4$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C20509a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52127a;

        static {
            int[] iArr = new int[EnumC21057u1.values().length];
            try {
                iArr[EnumC21057u1.LOAD_AD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC21057u1.LOAD_AD_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC21057u1.LOAD_AD_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC21057u1.LOAD_AD_FAILED_WITH_REASON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC21057u1.AUCTION_SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC21057u1.AUCTION_FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC21057u1.AUCTION_FAILED_NO_CANDIDATES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC21057u1.LOAD_AD_NO_FILL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC21057u1.AD_OPENED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC21057u1.AD_CLOSED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC21057u1.SHOW_AD.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC21057u1.SHOW_AD_FAILED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC21057u1.AD_CLICKED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[EnumC21057u1.AD_REWARDED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[EnumC21057u1.RELOAD_AD_FAILED_WITH_REASON.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[EnumC21057u1.RELOAD_AD_SUCCESS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[EnumC21057u1.AD_LEFT_APPLICATION.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            f52127a = iArr;
        }
    }

    public C20508n4(@NotNull C19680c5 auctionData) {
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        this.f52126a = auctionData;
    }

    /* renamed from: b */
    private final boolean m56197b(EnumC21057u1 enumC21057u1) {
        switch (C20509a.f52127a[enumC21057u1.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return true;
            default:
                return false;
        }
    }

    @Override // com.ironsource.InterfaceC21162w1
    @NotNull
    /* renamed from: a */
    public Map<String, Object> mo53886a(@NotNull EnumC21057u1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        HashMap hashMap = new HashMap();
        JSONObject m59194h = this.f52126a.m59194h();
        if (m59194h.length() > 0) {
            hashMap.put("genericParams", m59194h);
        }
        if (m56197b(event)) {
            hashMap.put(IronSourceConstants.AUCTION_TRIALS, Integer.valueOf(this.f52126a.m59193i()));
            if (!TextUtils.isEmpty(this.f52126a.m59196f())) {
                hashMap.put(IronSourceConstants.AUCTION_FALLBACK, this.f52126a.m59196f());
            }
        }
        if (!TextUtils.isEmpty(this.f52126a.m59195g())) {
            hashMap.put("auctionId", this.f52126a.m59195g());
        }
        return hashMap;
    }
}
