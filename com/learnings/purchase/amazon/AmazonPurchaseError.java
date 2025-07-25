package com.learnings.purchase.amazon;

import android.util.SparseArray;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.UserDataResponse;
import com.learnings.purchase.PurchaseError;

/* loaded from: classes6.dex */
public class AmazonPurchaseError extends PurchaseError {
    public static final int ALREADY_PURCHASED = 1006;
    public static final int FAILED = 1003;
    public static final int INVALID_SKU = 1005;
    public static final int NOT_SUPPORTED = 1004;
    public static final int PENDING = 1007;
    public static final int SERVICE_UNAVAILABLE = 1002;
    public static final int UNKNOWN = 1001;
    private static final SparseArray<PurchaseError> sErrorCodeSparseArray;

    /* renamed from: com.learnings.purchase.amazon.AmazonPurchaseError$1 */
    /* loaded from: classes6.dex */
    static /* synthetic */ class C213901 {

        /* renamed from: $SwitchMap$com$amazon$device$iap$model$ProductDataResponse$RequestStatus */
        static final /* synthetic */ int[] f54883x4eb80c9f;

        /* renamed from: $SwitchMap$com$amazon$device$iap$model$PurchaseResponse$RequestStatus */
        static final /* synthetic */ int[] f54884xc71ab397;

        /* renamed from: $SwitchMap$com$amazon$device$iap$model$PurchaseUpdatesResponse$RequestStatus */
        static final /* synthetic */ int[] f54885xe10c5bef;

        /* renamed from: $SwitchMap$com$amazon$device$iap$model$UserDataResponse$RequestStatus */
        static final /* synthetic */ int[] f54886x29a859ab;

        static {
            int[] iArr = new int[PurchaseResponse.RequestStatus.values().length];
            f54884xc71ab397 = iArr;
            try {
                iArr[PurchaseResponse.RequestStatus.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54884xc71ab397[PurchaseResponse.RequestStatus.INVALID_SKU.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54884xc71ab397[PurchaseResponse.RequestStatus.ALREADY_PURCHASED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54884xc71ab397[PurchaseResponse.RequestStatus.PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54884xc71ab397[PurchaseResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[PurchaseUpdatesResponse.RequestStatus.values().length];
            f54885xe10c5bef = iArr2;
            try {
                iArr2[PurchaseUpdatesResponse.RequestStatus.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f54885xe10c5bef[PurchaseUpdatesResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[ProductDataResponse.RequestStatus.values().length];
            f54883x4eb80c9f = iArr3;
            try {
                iArr3[ProductDataResponse.RequestStatus.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f54883x4eb80c9f[ProductDataResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[UserDataResponse.RequestStatus.values().length];
            f54886x29a859ab = iArr4;
            try {
                iArr4[UserDataResponse.RequestStatus.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f54886x29a859ab[UserDataResponse.RequestStatus.NOT_SUPPORTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static {
        SparseArray<PurchaseError> sparseArray = new SparseArray<>();
        sErrorCodeSparseArray = sparseArray;
        sparseArray.put(1002, new AmazonPurchaseError(1002, "SERVICE_UNAVAILABLE"));
        sparseArray.put(1003, new AmazonPurchaseError(1003, "FAILED"));
        sparseArray.put(1004, new AmazonPurchaseError(1004, "NOT_SUPPORTED"));
        sparseArray.put(1005, new AmazonPurchaseError(1005, "INVALID_SKU"));
        sparseArray.put(1006, new AmazonPurchaseError(1006, "ALREADY_PURCHASED"));
        sparseArray.put(1007, new AmazonPurchaseError(1007, "PENDING"));
    }

    protected AmazonPurchaseError(int i, String str) {
        super(i, str);
    }

    public static PurchaseError get(int i) {
        PurchaseError purchaseError = sErrorCodeSparseArray.get(i);
        return purchaseError == null ? new AmazonPurchaseError(i, "UNKNOWN") : purchaseError;
    }

    public static PurchaseError get(UserDataResponse.RequestStatus requestStatus) {
        int i = C213901.f54886x29a859ab[requestStatus.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return get(1001);
            }
            return get(1004);
        }
        return get(1003);
    }

    public static PurchaseError get(ProductDataResponse.RequestStatus requestStatus) {
        int i = C213901.f54883x4eb80c9f[requestStatus.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return get(1001);
            }
            return get(1004);
        }
        return get(1003);
    }

    public static PurchaseError get(PurchaseUpdatesResponse.RequestStatus requestStatus) {
        int i = C213901.f54885xe10c5bef[requestStatus.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return get(1001);
            }
            return get(1004);
        }
        return get(1003);
    }

    public static PurchaseError get(PurchaseResponse.RequestStatus requestStatus) {
        int i = C213901.f54884xc71ab397[requestStatus.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return get(1001);
                        }
                        return get(1004);
                    }
                    return get(1007);
                }
                return get(1006);
            }
            return get(1005);
        }
        return get(1003);
    }
}
